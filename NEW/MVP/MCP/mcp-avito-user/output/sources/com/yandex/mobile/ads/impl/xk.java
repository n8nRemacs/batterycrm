package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.kd0;
import j.InterfaceC42153i;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes8.dex */
public abstract class xk<T> extends cf {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f391739h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private Handler f391740i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private ua1 f391741j;

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final jd0 f391746a;

        /* renamed from: b, reason: collision with root package name */
        public final jd0.c f391747b;

        /* renamed from: c, reason: collision with root package name */
        public final xk<T>.a f391748c;

        public b(jd0 jd0Var, jd0.c cVar, xk<T>.a aVar) {
            this.f391746a = jd0Var;
            this.f391747b = cVar;
            this.f391748c = aVar;
        }
    }

    @j.P
    public abstract jd0.b a(T t12, jd0.b bVar);

    @Override // com.yandex.mobile.ads.impl.cf
    @InterfaceC42153i
    public void a(@j.P ua1 ua1Var) {
        this.f391741j = ua1Var;
        this.f391740i = pc1.a((Handler.Callback) null);
    }

    @Override // com.yandex.mobile.ads.impl.cf
    @InterfaceC42153i
    public final void b() {
        for (b<T> bVar : this.f391739h.values()) {
            bVar.f391746a.c(bVar.f391747b);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(T t12, jd0 jd0Var, i91 i91Var);

    @Override // com.yandex.mobile.ads.impl.cf
    @InterfaceC42153i
    public void e() {
        for (b<T> bVar : this.f391739h.values()) {
            bVar.f391746a.a(bVar.f391747b);
            bVar.f391746a.a((kd0) bVar.f391748c);
            bVar.f391746a.a((com.yandex.mobile.ads.exo.drm.f) bVar.f391748c);
        }
        this.f391739h.clear();
    }

    public final class a implements kd0, com.yandex.mobile.ads.exo.drm.f {

        /* renamed from: a, reason: collision with root package name */
        private final T f391742a;

        /* renamed from: b, reason: collision with root package name */
        private kd0.a f391743b;

        /* renamed from: c, reason: collision with root package name */
        private f.a f391744c;

        public a(T t12) {
            this.f391743b = xk.this.b((jd0.b) null);
            this.f391744c = xk.this.a((jd0.b) null);
            this.f391742a = t12;
        }

        private boolean e(int i12, @j.P jd0.b bVar) {
            jd0.b bVarA;
            if (bVar != null) {
                bVarA = xk.this.a((xk) this.f391742a, bVar);
                if (bVarA == null) {
                    return false;
                }
            } else {
                bVarA = null;
            }
            xk.this.getClass();
            kd0.a aVar = this.f391743b;
            if (aVar.f387110a != i12 || !pc1.a(aVar.f387111b, bVarA)) {
                this.f391743b = xk.this.b(i12, bVarA);
            }
            f.a aVar2 = this.f391744c;
            if (aVar2.f382911a == i12 && pc1.a(aVar2.f382912b, bVarA)) {
                return true;
            }
            this.f391744c = xk.this.a(i12, bVarA);
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void a(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
            if (e(i12, bVar)) {
                this.f391743b.a(q90Var, a(zc0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void b(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
            if (e(i12, bVar)) {
                this.f391743b.b(q90Var, a(zc0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void c(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
            if (e(i12, bVar)) {
                this.f391743b.c(q90Var, a(zc0Var));
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void d(int i12, @j.P jd0.b bVar) {
            if (e(i12, bVar)) {
                this.f391744c.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void a(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var, IOException iOException, boolean z12) {
            if (e(i12, bVar)) {
                this.f391743b.a(q90Var, a(zc0Var), iOException, z12);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void b(int i12, @j.P jd0.b bVar) {
            if (e(i12, bVar)) {
                this.f391744c.d();
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void c(int i12, @j.P jd0.b bVar) {
            if (e(i12, bVar)) {
                this.f391744c.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void a(int i12, @j.P jd0.b bVar, zc0 zc0Var) {
            if (e(i12, bVar)) {
                this.f391743b.a(a(zc0Var));
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i12, @j.P jd0.b bVar, int i13) {
            if (e(i12, bVar)) {
                this.f391744c.a(i13);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i12, @j.P jd0.b bVar, Exception exc) {
            if (e(i12, bVar)) {
                this.f391744c.a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i12, @j.P jd0.b bVar) {
            if (e(i12, bVar)) {
                this.f391744c.c();
            }
        }

        private zc0 a(zc0 zc0Var) {
            xk xkVar = xk.this;
            long j12 = zc0Var.f392226f;
            xkVar.getClass();
            xk xkVar2 = xk.this;
            long j13 = zc0Var.f392227g;
            xkVar2.getClass();
            return (j12 == zc0Var.f392226f && j13 == zc0Var.f392227g) ? zc0Var : new zc0(zc0Var.f392221a, zc0Var.f392222b, zc0Var.f392223c, zc0Var.f392224d, zc0Var.f392225e, j12, j13);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cf
    @InterfaceC42153i
    public final void a() {
        for (b<T> bVar : this.f391739h.values()) {
            bVar.f391746a.b(bVar.f391747b);
        }
    }

    public final void a(final T t12, jd0 jd0Var) {
        db.a(!this.f391739h.containsKey(t12));
        jd0.c cVar = new jd0.c() { // from class: com.yandex.mobile.ads.impl.D2
            @Override // com.yandex.mobile.ads.impl.jd0.c
            public final void a(jd0 jd0Var2, i91 i91Var) {
                this.f383191a.a(t12, jd0Var2, i91Var);
            }
        };
        a aVar = new a(t12);
        this.f391739h.put(t12, new b<>(jd0Var, cVar, aVar));
        Handler handler = this.f391740i;
        handler.getClass();
        jd0Var.a(handler, (kd0) aVar);
        Handler handler2 = this.f391740i;
        handler2.getClass();
        jd0Var.a(handler2, (com.yandex.mobile.ads.exo.drm.f) aVar);
        jd0Var.a(cVar, this.f391741j, c());
        if (d()) {
            return;
        }
        jd0Var.b(cVar);
    }
}
