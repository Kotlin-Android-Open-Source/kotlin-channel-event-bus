package com.hoc081098.channeleventbus.sample.android.ui.register

import com.hoc081098.channeleventbus.ChannelEvent
import com.hoc081098.channeleventbus.ChannelEventKey

data class SubmitFirstNameEvent(val value: String?) : ChannelEvent<SubmitFirstNameEvent> {
  override val key get() = Key

  companion object Key : ChannelEventKey<SubmitFirstNameEvent>(SubmitFirstNameEvent::class)
}
