package co.kr.parkjonghun.whatishedoingwithandroid.service.model.sample

import co.kr.parkjonghun.whatishedoingwithandroid.base.model.Entity
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginToken(val token: String) : Entity