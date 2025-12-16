package com.airbnb.lottie.animation.keyframe;

import j.P;
import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    public final A f59372i;

    public q() {
        throw null;
    }

    public q(com.airbnb.lottie.value.j<A> jVar, @P A a12) {
        super(Collections.emptyList());
        k(jVar);
        this.f59372i = a12;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final A f() {
        com.airbnb.lottie.value.j<A> jVar = this.f59311e;
        float f12 = this.f59310d;
        A a12 = this.f59372i;
        return jVar.b(0.0f, 0.0f, a12, a12, f12, f12, f12);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final A g(com.airbnb.lottie.value.a<K> aVar, float f12) {
        return f();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final void i() {
        if (this.f59311e != null) {
            super.i();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final void j(float f12) {
        this.f59310d = f12;
    }
}
