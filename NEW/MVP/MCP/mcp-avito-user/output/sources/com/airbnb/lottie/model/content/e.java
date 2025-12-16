package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;

/* compiled from: GradientFill.java */
/* loaded from: classes10.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final GradientType f59726a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f59727b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.c f59728c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.d f59729d;

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.f f59730e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.f f59731f;

    /* renamed from: g, reason: collision with root package name */
    public final String f59732g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f59733h;

    public e(String str, GradientType gradientType, Path.FillType fillType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, boolean z12) {
        this.f59726a = gradientType;
        this.f59727b = fillType;
        this.f59728c = cVar;
        this.f59729d = dVar;
        this.f59730e = fVar;
        this.f59731f = fVar2;
        this.f59732g = str;
        this.f59733h = z12;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.h(b12, c27291k, bVar, this);
    }
}
