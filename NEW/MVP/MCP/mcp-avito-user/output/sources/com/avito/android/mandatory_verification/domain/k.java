package com.avito.android.mandatory_verification.domain;

import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: StartVerificationUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/k;", "", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mandatory_verification.data.d f184589a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f184590b;

    @Inject
    public k(@Y61.k com.avito.android.mandatory_verification.data.d dVar, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f184589a = dVar;
        this.f184590b = interfaceC35741a1;
    }

    @Y61.k
    public final C43152f0 a(long j12, @Y61.k String str) {
        return new C43152f0(C43175k.G(new i(this, j12, str, null)), new j(this, null));
    }
}
