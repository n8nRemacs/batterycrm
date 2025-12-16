package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.B;
import com.airbnb.lottie.animation.keyframe.a;
import j.P;
import java.util.List;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes10.dex */
public class r implements t, a.b {

    /* renamed from: a, reason: collision with root package name */
    public final B f59286a;

    /* renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.a<Float, Float> f59287b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public com.airbnb.lottie.model.content.j f59288c;

    public r(B b12, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.i iVar) {
        this.f59286a = b12;
        iVar.getClass();
        com.airbnb.lottie.animation.keyframe.d dVarC = iVar.f59757a.c();
        this.f59287b = dVarC;
        bVar.f(dVarC);
        dVarC.a(this);
    }

    public static int a(int i12, int i13) {
        int i14 = i12 / i13;
        if ((i12 ^ i13) < 0 && i14 * i13 != i12) {
            i14--;
        }
        return i12 - (i14 * i13);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59286a.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0  */
    @Override // com.airbnb.lottie.animation.content.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.airbnb.lottie.model.content.j h(com.airbnb.lottie.model.content.j r20) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.r.h(com.airbnb.lottie.model.content.j):com.airbnb.lottie.model.content.j");
    }

    @Override // com.airbnb.lottie.animation.content.t
    public final void i(s sVar) {
        this.f59287b.a(sVar);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<c> list, List<c> list2) {
    }
}
