package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.C36634e;
import r61.InterfaceC47501c;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class B0 extends K {

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC47501c
    public final com.google.android.gms.common.api.h f348965c;

    public B0(com.google.android.gms.common.api.h hVar) {
        this.f348965c = hVar;
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends C36616a.b, R extends com.google.android.gms.common.api.r, T extends C36634e.a<R, A>> T f(@j.N T t12) {
        return (T) this.f348965c.doRead((com.google.android.gms.common.api.h) t12);
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends C36616a.b, T extends C36634e.a<? extends com.google.android.gms.common.api.r, A>> T g(@j.N T t12) {
        return (T) this.f348965c.doWrite((com.google.android.gms.common.api.h) t12);
    }

    @Override // com.google.android.gms.common.api.i
    public final Looper i() {
        return this.f348965c.getLooper();
    }

    @Override // com.google.android.gms.common.api.i
    public final void l(C36648i1 c36648i1) {
    }

    @Override // com.google.android.gms.common.api.i
    public final void m(C36648i1 c36648i1) {
    }
}
