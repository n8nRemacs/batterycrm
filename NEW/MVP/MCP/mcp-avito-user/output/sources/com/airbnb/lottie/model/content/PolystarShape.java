package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.model.animatable.o;

/* loaded from: classes10.dex */
public class PolystarShape implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f59679a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f59680b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59681c;

    /* renamed from: d, reason: collision with root package name */
    public final o<PointF, PointF> f59682d;

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59683e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59684f;

    /* renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59685g;

    /* renamed from: h, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59686h;

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59687i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f59688j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f59689k;

    public enum Type {
        STAR(1),
        /* JADX INFO: Fake field, exist only in values array */
        POLYGON(2);


        /* renamed from: b, reason: collision with root package name */
        public final int f59692b;

        Type(int i12) {
            this.f59692b = i12;
        }
    }

    public PolystarShape(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, o<PointF, PointF> oVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6, boolean z12, boolean z13) {
        this.f59679a = str;
        this.f59680b = type;
        this.f59681c = bVar;
        this.f59682d = oVar;
        this.f59683e = bVar2;
        this.f59684f = bVar3;
        this.f59685g = bVar4;
        this.f59686h = bVar5;
        this.f59687i = bVar6;
        this.f59688j = z12;
        this.f59689k = z13;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.o(b12, bVar, this);
    }
}
