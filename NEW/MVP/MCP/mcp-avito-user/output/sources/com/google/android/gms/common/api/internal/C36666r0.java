package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C36631d;
import com.google.android.gms.internal.base.zau;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36666r0 implements ComponentCallbacks2C36631d.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36646i f349206a;

    public C36666r0(C36646i c36646i) {
        this.f349206a = c36646i;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C36631d.a
    public final void a(boolean z12) {
        zau zauVar = this.f349206a.f349134o;
        zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z12)));
    }
}
