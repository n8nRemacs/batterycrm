package com.airbnb.lottie.value;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.O;
import j.P;

/* compiled from: LottieValueCallback.java */
/* loaded from: classes10.dex */
public class j<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f60157a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final O f60158b;

    public j() {
        this.f60157a = new b<>();
        this.f60158b = null;
    }

    @P
    public T a(b<T> bVar) {
        return (T) this.f60158b;
    }

    @RestrictTo
    @P
    public final T b(float f12, float f13, T t12, T t13, float f14, float f15, float f16) {
        b<T> bVar = this.f60157a;
        bVar.f60149a = f12;
        bVar.f60150b = f13;
        bVar.f60151c = t12;
        bVar.f60152d = t13;
        bVar.f60153e = f14;
        bVar.f60154f = f15;
        bVar.f60155g = f16;
        return a(bVar);
    }

    public j(@P O o12) {
        this.f60157a = new b<>();
        this.f60158b = o12;
    }
}
