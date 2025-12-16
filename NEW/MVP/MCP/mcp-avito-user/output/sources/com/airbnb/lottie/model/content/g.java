package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.animation.content.p;
import com.airbnb.lottie.model.animatable.o;

/* compiled from: RectangleShape.java */
/* loaded from: classes10.dex */
public class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f59747a;

    /* renamed from: b, reason: collision with root package name */
    public final o<PointF, PointF> f59748b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.f f59749c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59750d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f59751e;

    public g(String str, o oVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.b bVar, boolean z12) {
        this.f59747a = str;
        this.f59748b = oVar;
        this.f59749c = fVar;
        this.f59750d = bVar;
        this.f59751e = z12;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new p(b12, bVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f59748b + ", size=" + this.f59749c + '}';
    }
}
