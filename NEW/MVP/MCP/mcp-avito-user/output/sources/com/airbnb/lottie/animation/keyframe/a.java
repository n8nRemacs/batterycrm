package com.airbnb.lottie.animation.keyframe;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C27285e;
import j.InterfaceC42167x;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes10.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    public final d<K> f59309c;

    /* renamed from: e, reason: collision with root package name */
    @P
    public com.airbnb.lottie.value.j<A> f59311e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f59307a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f59308b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f59310d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    @P
    public A f59312f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f59313g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f59314h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    public interface b {
        void g();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final boolean a(float f12) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final boolean b(float f12) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final com.airbnb.lottie.value.a<T> c() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final float d() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    public interface d<T> {
        boolean a(float f12);

        boolean b(float f12);

        com.airbnb.lottie.value.a<T> c();

        @InterfaceC42167x
        float d();

        @InterfaceC42167x
        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    public static final class e<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<? extends com.airbnb.lottie.value.a<T>> f59315a;

        /* renamed from: c, reason: collision with root package name */
        public com.airbnb.lottie.value.a<T> f59317c = null;

        /* renamed from: d, reason: collision with root package name */
        public float f59318d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        @N
        public com.airbnb.lottie.value.a<T> f59316b = f(0.0f);

        public e(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f59315a = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final boolean a(float f12) {
            com.airbnb.lottie.value.a<T> aVar = this.f59317c;
            com.airbnb.lottie.value.a<T> aVar2 = this.f59316b;
            if (aVar == aVar2 && this.f59318d == f12) {
                return true;
            }
            this.f59317c = aVar2;
            this.f59318d = f12;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final boolean b(float f12) {
            com.airbnb.lottie.value.a<T> aVar = this.f59316b;
            if (f12 >= aVar.b() && f12 < aVar.a()) {
                return !this.f59316b.c();
            }
            this.f59316b = f(f12);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        @N
        public final com.airbnb.lottie.value.a<T> c() {
            return this.f59316b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final float d() {
            return this.f59315a.get(0).b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final float e() {
            return ((com.airbnb.lottie.value.a) androidx.media3.exoplayer.analytics.m.h(1, this.f59315a)).a();
        }

        public final com.airbnb.lottie.value.a<T> f(float f12) {
            List<? extends com.airbnb.lottie.value.a<T>> list = this.f59315a;
            com.airbnb.lottie.value.a<T> aVar = (com.airbnb.lottie.value.a) androidx.media3.exoplayer.analytics.m.h(1, list);
            if (f12 >= aVar.b()) {
                return aVar;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.a<T> aVar2 = list.get(size);
                if (this.f59316b != aVar2 && f12 >= aVar2.b() && f12 < aVar2.a()) {
                    return aVar2;
                }
            }
            return list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    public static final class f<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final com.airbnb.lottie.value.a<T> f59319a;

        /* renamed from: b, reason: collision with root package name */
        public float f59320b = -1.0f;

        public f(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f59319a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final boolean a(float f12) {
            if (this.f59320b == f12) {
                return true;
            }
            this.f59320b = f12;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final boolean b(float f12) {
            return !this.f59319a.c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final com.airbnb.lottie.value.a<T> c() {
            return this.f59319a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final float d() {
            return this.f59319a.b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final float e() {
            return this.f59319a.a();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends com.airbnb.lottie.value.a<K>> list) {
        d fVar;
        if (list.isEmpty()) {
            fVar = new c();
        } else {
            fVar = list.size() == 1 ? new f(list) : new e(list);
        }
        this.f59309c = fVar;
    }

    public final void a(b bVar) {
        this.f59307a.add(bVar);
    }

    public final com.airbnb.lottie.value.a<K> b() {
        if (C27285e.f59567a) {
            C27285e.a("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        com.airbnb.lottie.value.a<K> aVarC = this.f59309c.c();
        if (C27285e.f59567a) {
            C27285e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarC;
    }

    @SuppressLint({"Range"})
    @InterfaceC42167x
    public float c() {
        if (this.f59314h == -1.0f) {
            this.f59314h = this.f59309c.e();
        }
        return this.f59314h;
    }

    public final float d() {
        Interpolator interpolator;
        com.airbnb.lottie.value.a<K> aVarB = b();
        if (aVarB == null || aVarB.c() || (interpolator = aVarB.f60136d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public final float e() {
        if (this.f59308b) {
            return 0.0f;
        }
        com.airbnb.lottie.value.a<K> aVarB = b();
        if (aVarB.c()) {
            return 0.0f;
        }
        return (this.f59310d - aVarB.b()) / (aVarB.a() - aVarB.b());
    }

    public A f() {
        Interpolator interpolator;
        float fE2 = e();
        if (this.f59311e == null && this.f59309c.a(fE2) && !l()) {
            return this.f59312f;
        }
        com.airbnb.lottie.value.a<K> aVarB = b();
        Interpolator interpolator2 = aVarB.f60137e;
        A aG2 = (interpolator2 == null || (interpolator = aVarB.f60138f) == null) ? g(aVarB, d()) : h(aVarB, fE2, interpolator2.getInterpolation(fE2), interpolator.getInterpolation(fE2));
        this.f59312f = aG2;
        return aG2;
    }

    public abstract A g(com.airbnb.lottie.value.a<K> aVar, float f12);

    public A h(com.airbnb.lottie.value.a<K> aVar, float f12, float f13, float f14) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        if (C27285e.f59567a) {
            C27285e.a("BaseKeyframeAnimation#notifyListeners");
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f59307a;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((b) arrayList.get(i12)).g();
            i12++;
        }
        if (C27285e.f59567a) {
            C27285e.b("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void j(@InterfaceC42167x float f12) {
        if (C27285e.f59567a) {
            C27285e.a("BaseKeyframeAnimation#setProgress");
        }
        d<K> dVar = this.f59309c;
        if (dVar.isEmpty()) {
            if (C27285e.f59567a) {
                C27285e.b("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (this.f59313g == -1.0f) {
            this.f59313g = dVar.d();
        }
        float f13 = this.f59313g;
        if (f12 < f13) {
            if (f13 == -1.0f) {
                this.f59313g = dVar.d();
            }
            f12 = this.f59313g;
        } else if (f12 > c()) {
            f12 = c();
        }
        if (f12 == this.f59310d) {
            if (C27285e.f59567a) {
                C27285e.b("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f59310d = f12;
            if (dVar.b(f12)) {
                i();
            }
            if (C27285e.f59567a) {
                C27285e.b("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public final void k(@P com.airbnb.lottie.value.j<A> jVar) {
        com.airbnb.lottie.value.j<A> jVar2 = this.f59311e;
        if (jVar2 != null) {
            jVar2.getClass();
        }
        this.f59311e = jVar;
    }

    public boolean l() {
        return false;
    }
}
