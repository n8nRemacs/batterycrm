package com.avito.android.mandatory_verification.domain;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: RetrieveDataUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/g;", "", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mandatory_verification.data.d f184578a;

    @Inject
    public g(@Y61.k com.avito.android.mandatory_verification.data.d dVar) {
        this.f184578a = dVar;
    }

    @Y61.k
    public final C43152f0 a(long j12) {
        return new C43152f0(C43175k.G(new e(this, j12, null)), new f(3, null));
    }
}
