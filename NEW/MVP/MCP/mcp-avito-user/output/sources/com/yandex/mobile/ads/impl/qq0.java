package com.yandex.mobile.ads.impl;

import kotlin.InterfaceC43072x;

/* loaded from: classes8.dex */
final /* synthetic */ class qq0 implements kq0, kotlin.jvm.internal.D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pq0 f389281a;

    public qq0(pq0 pq0Var) {
        this.f389281a = pq0Var;
    }

    @Override // com.yandex.mobile.ads.impl.kq0
    public final void a() {
        pq0.a(this.f389281a);
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof kq0) && (obj instanceof kotlin.jvm.internal.D)) {
            return kotlin.jvm.internal.L.f(getFunctionDelegate(), ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.H(0, this.f389281a, pq0.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
