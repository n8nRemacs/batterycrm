package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.model.animatable.o;

/* compiled from: CircleShape.java */
/* loaded from: classes10.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f59719a;

    /* renamed from: b, reason: collision with root package name */
    public final o<PointF, PointF> f59720b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.f f59721c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59722d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f59723e;

    public b(String str, o<PointF, PointF> oVar, com.airbnb.lottie.model.animatable.f fVar, boolean z12, boolean z13) {
        this.f59719a = str;
        this.f59720b = oVar;
        this.f59721c = fVar;
        this.f59722d = z12;
        this.f59723e = z13;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.f(b12, bVar, this);
    }
}
