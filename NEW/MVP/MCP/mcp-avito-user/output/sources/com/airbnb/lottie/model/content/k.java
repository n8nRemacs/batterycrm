package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.appcompat.app.r;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import j.P;

/* compiled from: ShapeFill.java */
/* loaded from: classes10.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59761a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f59762b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59763c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.model.animatable.a f59764d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.model.animatable.d f59765e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f59766f;

    public k(String str, boolean z12, Path.FillType fillType, @P com.airbnb.lottie.model.animatable.a aVar, @P com.airbnb.lottie.model.animatable.d dVar, boolean z13) {
        this.f59763c = str;
        this.f59761a = z12;
        this.f59762b = fillType;
        this.f59764d = aVar;
        this.f59765e = dVar;
        this.f59766f = z13;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.g(b12, bVar, this);
    }

    public final String toString() {
        return r.x(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f59761a, '}');
    }
}
