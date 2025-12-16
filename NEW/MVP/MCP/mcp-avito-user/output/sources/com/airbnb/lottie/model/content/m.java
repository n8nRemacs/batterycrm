package com.airbnb.lottie.model.content;

import androidx.appcompat.app.r;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.animation.content.s;

/* compiled from: ShapePath.java */
/* loaded from: classes10.dex */
public class m implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f59770a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59771b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.h f59772c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59773d;

    public m(String str, int i12, com.airbnb.lottie.model.animatable.h hVar, boolean z12) {
        this.f59770a = str;
        this.f59771b = i12;
        this.f59772c = hVar;
        this.f59773d = z12;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new s(b12, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f59770a);
        sb2.append(", index=");
        return r.t(sb2, this.f59771b, '}');
    }
}
