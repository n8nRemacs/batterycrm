package com.airbnb.lottie.model.content;

import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.model.content.ShapeStroke;
import j.P;
import java.util.ArrayList;

/* compiled from: GradientStroke.java */
/* loaded from: classes10.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f59734a;

    /* renamed from: b, reason: collision with root package name */
    public final GradientType f59735b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.c f59736c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.d f59737d;

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.f f59738e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.f f59739f;

    /* renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59740g;

    /* renamed from: h, reason: collision with root package name */
    public final ShapeStroke.LineCapType f59741h;

    /* renamed from: i, reason: collision with root package name */
    public final ShapeStroke.LineJoinType f59742i;

    /* renamed from: j, reason: collision with root package name */
    public final float f59743j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f59744k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.model.animatable.b f59745l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f59746m;

    public f(String str, GradientType gradientType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f12, ArrayList arrayList, @P com.airbnb.lottie.model.animatable.b bVar2, boolean z12) {
        this.f59734a = str;
        this.f59735b = gradientType;
        this.f59736c = cVar;
        this.f59737d = dVar;
        this.f59738e = fVar;
        this.f59739f = fVar2;
        this.f59740g = bVar;
        this.f59741h = lineCapType;
        this.f59742i = lineJoinType;
        this.f59743j = f12;
        this.f59744k = arrayList;
        this.f59745l = bVar2;
        this.f59746m = z12;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.i(b12, bVar, this);
    }
}
