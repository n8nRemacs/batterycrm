package com.yandex.mobile.ads.impl;

import kotlin.InterfaceC43072x;

/* loaded from: classes8.dex */
final /* synthetic */ class ee1 implements ae1, kotlin.jvm.internal.D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fe1 f384921a;

    public ee1(fe1 fe1Var) {
        this.f384921a = fe1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ae1
    public final void a(@Y61.k zd1 zd1Var) {
        fe1.a(this.f384921a, zd1Var);
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof ae1) && (obj instanceof kotlin.jvm.internal.D)) {
            return kotlin.jvm.internal.L.f(getFunctionDelegate(), ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.H(1, this.f384921a, fe1.class, "trackVerificationNotExecuted", "trackVerificationNotExecuted(Lcom/yandex/mobile/ads/verification/error/VerificationNotExecutedException;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
