package co.kr.parkjonghun.whatishedoingwithandroid.domain.gateway.repository

import co.kr.parkjonghun.whatishedoingwithandroid.domain.model.Sample

interface SampleRepository {
    suspend fun getSampleData(): Sample
}