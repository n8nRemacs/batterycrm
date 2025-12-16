package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.c;
import java.util.ArrayList;

/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
public final class i extends c<i> {

    /* renamed from: t, reason: collision with root package name */
    public j f46047t;

    /* renamed from: u, reason: collision with root package name */
    public float f46048u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f46049v;

    public i() {
        throw null;
    }

    public i(g gVar) {
        super(gVar);
        this.f46047t = null;
        this.f46048u = Float.MAX_VALUE;
        this.f46049v = false;
    }

    @Override // androidx.dynamicanimation.animation.c
    public final boolean g(long j12) {
        if (this.f46049v) {
            float f12 = this.f46048u;
            if (f12 != Float.MAX_VALUE) {
                this.f46047t.f46058i = f12;
                this.f46048u = Float.MAX_VALUE;
            }
            this.f46032b = (float) this.f46047t.f46058i;
            this.f46031a = 0.0f;
            this.f46049v = false;
            return true;
        }
        if (this.f46048u != Float.MAX_VALUE) {
            j jVar = this.f46047t;
            double d12 = jVar.f46058i;
            long j13 = j12 / 2;
            c.p pVarC = jVar.c(this.f46032b, this.f46031a, j13);
            j jVar2 = this.f46047t;
            jVar2.f46058i = this.f46048u;
            this.f46048u = Float.MAX_VALUE;
            c.p pVarC2 = jVar2.c(pVarC.f46044a, pVarC.f46045b, j13);
            this.f46032b = pVarC2.f46044a;
            this.f46031a = pVarC2.f46045b;
        } else {
            c.p pVarC3 = this.f46047t.c(this.f46032b, this.f46031a, j12);
            this.f46032b = pVarC3.f46044a;
            this.f46031a = pVarC3.f46045b;
        }
        float fMax = Math.max(this.f46032b, this.f46038h);
        this.f46032b = fMax;
        this.f46032b = Math.min(fMax, this.f46037g);
        float f13 = this.f46031a;
        j jVar3 = this.f46047t;
        jVar3.getClass();
        if (Math.abs(f13) >= jVar3.f46054e || Math.abs(r1 - ((float) jVar3.f46058i)) >= jVar3.f46053d) {
            return false;
        }
        this.f46032b = (float) this.f46047t.f46058i;
        this.f46031a = 0.0f;
        return true;
    }

    public final void h(float f12) {
        if (this.f46036f) {
            this.f46048u = f12;
            return;
        }
        if (this.f46047t == null) {
            this.f46047t = new j(f12);
        }
        this.f46047t.f46058i = f12;
        j();
    }

    public final void i() {
        if (this.f46047t.f46051b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f46036f) {
            this.f46049v = true;
        }
    }

    public final void j() {
        j jVar = this.f46047t;
        if (jVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d12 = (float) jVar.f46058i;
        if (d12 > this.f46037g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d12 < this.f46038h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f46040j * 0.75f);
        jVar.f46053d = dAbs;
        jVar.f46054e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z12 = this.f46036f;
        if (z12 || z12) {
            return;
        }
        this.f46036f = true;
        if (!this.f46033c) {
            this.f46032b = this.f46035e.getValue(this.f46034d);
        }
        float f12 = this.f46032b;
        if (f12 > this.f46037g || f12 < this.f46038h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal<a> threadLocal = a.f46013f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = threadLocal.get();
        ArrayList<a.b> arrayList = aVar.f46015b;
        if (arrayList.size() == 0) {
            if (aVar.f46017d == null) {
                aVar.f46017d = new a.e(aVar.f46016c);
            }
            aVar.f46017d.a();
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public <K> i(K k12, f<K> fVar, float f12) {
        super(k12, fVar);
        this.f46047t = null;
        this.f46048u = Float.MAX_VALUE;
        this.f46049v = false;
        this.f46047t = new j(f12);
    }
}
