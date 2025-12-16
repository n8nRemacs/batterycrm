package com.google.android.material.transition;

import android.graphics.RectF;
import com.google.android.material.transition.D;
import j.N;

/* compiled from: TransitionUtils.java */
/* loaded from: classes6.dex */
class C implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RectF f357744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RectF f357745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f357746c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f357747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f357748e;

    public C(RectF rectF, RectF rectF2, float f12, float f13, float f14) {
        this.f357744a = rectF;
        this.f357745b = rectF2;
        this.f357746c = f12;
        this.f357747d = f13;
        this.f357748e = f14;
    }

    @N
    public final com.google.android.material.shape.a a(@N com.google.android.material.shape.e eVar, @N com.google.android.material.shape.e eVar2) {
        return new com.google.android.material.shape.a(D.d(eVar.a(this.f357744a), eVar2.a(this.f357745b), this.f357746c, this.f357747d, this.f357748e, false));
    }
}
