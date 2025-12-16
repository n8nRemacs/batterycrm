package com.airbnb.lottie.model.content;

import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes10.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f59767a;

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f59768b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59769c;

    public l(String str, List<c> list, boolean z12) {
        this.f59767a = str;
        this.f59768b = list;
        this.f59769c = z12;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.d(b12, bVar, this, c27291k);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f59767a + "' Shapes: " + Arrays.toString(this.f59768b.toArray()) + '}';
    }
}
