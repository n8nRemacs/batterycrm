package com.google.android.material.transition.platform;

import android.graphics.RectF;
import com.google.android.material.transition.platform.H;
import j.N;

/* compiled from: TransitionUtils.java */
/* loaded from: classes6.dex */
class G implements H.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RectF f357850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RectF f357851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f357852c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f357853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f357854e;

    public G(RectF rectF, RectF rectF2, float f12, float f13, float f14) {
        this.f357850a = rectF;
        this.f357851b = rectF2;
        this.f357852c = f12;
        this.f357853d = f13;
        this.f357854e = f14;
    }

    @N
    public final com.google.android.material.shape.a a(@N com.google.android.material.shape.e eVar, @N com.google.android.material.shape.e eVar2) {
        return new com.google.android.material.shape.a(H.d(eVar.a(this.f357850a), eVar2.a(this.f357851b), this.f357852c, this.f357853d, this.f357854e, false));
    }
}
