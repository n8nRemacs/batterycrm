package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.kd0;
import com.yandex.mobile.ads.impl.s31;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class md0 {

    /* renamed from: a, reason: collision with root package name */
    private final jt0 f387953a;

    /* renamed from: e, reason: collision with root package name */
    private final d f387957e;

    /* renamed from: f, reason: collision with root package name */
    private final kd0.a f387958f;

    /* renamed from: g, reason: collision with root package name */
    private final f.a f387959g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<c, b> f387960h;

    /* renamed from: i, reason: collision with root package name */
    private final HashSet f387961i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f387963k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private ua1 f387964l;

    /* renamed from: j, reason: collision with root package name */
    private s31 f387962j = new s31.a();

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<dd0, c> f387955c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f387956d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f387954b = new ArrayList();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final jd0 f387969a;

        /* renamed from: b, reason: collision with root package name */
        public final jd0.c f387970b;

        /* renamed from: c, reason: collision with root package name */
        public final a f387971c;

        public b(fb0 fb0Var, jd0.c cVar, a aVar) {
            this.f387969a = fb0Var;
            this.f387970b = cVar;
            this.f387971c = aVar;
        }
    }

    public static final class c implements ld0 {

        /* renamed from: a, reason: collision with root package name */
        public final fb0 f387972a;

        /* renamed from: d, reason: collision with root package name */
        public int f387975d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f387976e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f387974c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f387973b = new Object();

        public c(jd0 jd0Var, boolean z12) {
            this.f387972a = new fb0(jd0Var, z12);
        }

        @Override // com.yandex.mobile.ads.impl.ld0
        public final Object a() {
            return this.f387973b;
        }

        @Override // com.yandex.mobile.ads.impl.ld0
        public final i91 b() {
            return this.f387972a.f();
        }
    }

    public interface d {
    }

    public md0(d dVar, j9 j9Var, Handler handler, jt0 jt0Var) {
        this.f387953a = jt0Var;
        this.f387957e = dVar;
        kd0.a aVar = new kd0.a();
        this.f387958f = aVar;
        f.a aVar2 = new f.a();
        this.f387959g = aVar2;
        this.f387960h = new HashMap<>();
        this.f387961i = new HashSet();
        aVar.a(handler, j9Var);
        aVar2.a(handler, j9Var);
    }

    public final boolean c() {
        return this.f387963k;
    }

    public final i91 d() {
        db.a(this.f387954b.size() >= 0);
        this.f387962j = null;
        return a();
    }

    public final void e() {
        for (b bVar : this.f387960h.values()) {
            try {
                bVar.f387969a.a(bVar.f387970b);
            } catch (RuntimeException e12) {
                ka0.a("MediaSourceList", "Failed to release child source.", e12);
            }
            bVar.f387969a.a((kd0) bVar.f387971c);
            bVar.f387969a.a((com.yandex.mobile.ads.exo.drm.f) bVar.f387971c);
        }
        this.f387960h.clear();
        this.f387961i.clear();
        this.f387963k = false;
    }

    public final class a implements kd0, com.yandex.mobile.ads.exo.drm.f {

        /* renamed from: a, reason: collision with root package name */
        private final c f387965a;

        /* renamed from: b, reason: collision with root package name */
        private kd0.a f387966b;

        /* renamed from: c, reason: collision with root package name */
        private f.a f387967c;

        public a(c cVar) {
            this.f387966b = md0.this.f387958f;
            this.f387967c = md0.this.f387959g;
            this.f387965a = cVar;
        }

        private boolean e(int i12, @j.P jd0.b bVar) {
            jd0.b bVarB = null;
            if (bVar != null) {
                c cVar = this.f387965a;
                int i13 = 0;
                while (true) {
                    if (i13 >= cVar.f387974c.size()) {
                        break;
                    }
                    if (((jd0.b) cVar.f387974c.get(i13)).f385283d == bVar.f385283d) {
                        bVarB = bVar.b(AbstractC39317e.a(cVar.f387973b, bVar.f385280a));
                        break;
                    }
                    i13++;
                }
                if (bVarB == null) {
                    return false;
                }
            }
            int i14 = i12 + this.f387965a.f387975d;
            kd0.a aVar = this.f387966b;
            if (aVar.f387110a != i14 || !pc1.a(aVar.f387111b, bVarB)) {
                this.f387966b = md0.this.f387958f.a(i14, bVarB);
            }
            f.a aVar2 = this.f387967c;
            if (aVar2.f382911a == i14 && pc1.a(aVar2.f382912b, bVarB)) {
                return true;
            }
            this.f387967c = md0.this.f387959g.a(i14, bVarB);
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void a(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
            if (e(i12, bVar)) {
                this.f387966b.a(q90Var, zc0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void b(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
            if (e(i12, bVar)) {
                this.f387966b.b(q90Var, zc0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void c(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
            if (e(i12, bVar)) {
                this.f387966b.c(q90Var, zc0Var);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void d(int i12, @j.P jd0.b bVar) {
            if (e(i12, bVar)) {
                this.f387967c.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void a(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var, IOException iOException, boolean z12) {
            if (e(i12, bVar)) {
                this.f387966b.a(q90Var, zc0Var, iOException, z12);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void b(int i12, @j.P jd0.b bVar) {
            if (e(i12, bVar)) {
                this.f387967c.d();
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void c(int i12, @j.P jd0.b bVar) {
            if (e(i12, bVar)) {
                this.f387967c.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.kd0
        public final void a(int i12, @j.P jd0.b bVar, zc0 zc0Var) {
            if (e(i12, bVar)) {
                this.f387966b.a(zc0Var);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i12, @j.P jd0.b bVar, int i13) {
            if (e(i12, bVar)) {
                this.f387967c.a(i13);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i12, @j.P jd0.b bVar, Exception exc) {
            if (e(i12, bVar)) {
                this.f387967c.a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i12, @j.P jd0.b bVar) {
            if (e(i12, bVar)) {
                this.f387967c.c();
            }
        }
    }

    public final int b() {
        return this.f387954b.size();
    }

    public final i91 a(List<c> list, s31 s31Var) {
        for (int size = this.f387954b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f387954b.remove(size);
            this.f387956d.remove(cVar.f387973b);
            int i12 = -cVar.f387972a.f().b();
            for (int i13 = size; i13 < this.f387954b.size(); i13++) {
                ((c) this.f387954b.get(i13)).f387975d += i12;
            }
            cVar.f387976e = true;
            if (this.f387963k && cVar.f387974c.isEmpty()) {
                b bVarRemove = this.f387960h.remove(cVar);
                bVarRemove.getClass();
                bVarRemove.f387969a.a(bVarRemove.f387970b);
                bVarRemove.f387969a.a((kd0) bVarRemove.f387971c);
                bVarRemove.f387969a.a((com.yandex.mobile.ads.exo.drm.f) bVarRemove.f387971c);
                this.f387961i.remove(cVar);
            }
        }
        return a(this.f387954b.size(), list, s31Var);
    }

    public final i91 a(int i12, List<c> list, s31 s31Var) {
        if (!list.isEmpty()) {
            this.f387962j = s31Var;
            for (int i13 = i12; i13 < list.size() + i12; i13++) {
                c cVar = list.get(i13 - i12);
                if (i13 > 0) {
                    c cVar2 = (c) this.f387954b.get(i13 - 1);
                    cVar.f387975d = cVar2.f387972a.f().b() + cVar2.f387975d;
                    cVar.f387976e = false;
                    cVar.f387974c.clear();
                } else {
                    cVar.f387975d = 0;
                    cVar.f387976e = false;
                    cVar.f387974c.clear();
                }
                int iB2 = cVar.f387972a.f().b();
                for (int i14 = i13; i14 < this.f387954b.size(); i14++) {
                    ((c) this.f387954b.get(i14)).f387975d += iB2;
                }
                this.f387954b.add(i13, cVar);
                this.f387956d.put(cVar.f387973b, cVar);
                if (this.f387963k) {
                    a(cVar);
                    if (this.f387955c.isEmpty()) {
                        this.f387961i.add(cVar);
                    } else {
                        b bVar = this.f387960h.get(cVar);
                        if (bVar != null) {
                            bVar.f387969a.b(bVar.f387970b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final i91 a(int i12, int i13, s31 s31Var) {
        db.a(i12 >= 0 && i12 <= i13 && i13 <= this.f387954b.size());
        this.f387962j = s31Var;
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            c cVar = (c) this.f387954b.remove(i14);
            this.f387956d.remove(cVar.f387973b);
            int i15 = -cVar.f387972a.f().b();
            for (int i16 = i14; i16 < this.f387954b.size(); i16++) {
                ((c) this.f387954b.get(i16)).f387975d += i15;
            }
            cVar.f387976e = true;
            if (this.f387963k && cVar.f387974c.isEmpty()) {
                b bVarRemove = this.f387960h.remove(cVar);
                bVarRemove.getClass();
                bVarRemove.f387969a.a(bVarRemove.f387970b);
                bVarRemove.f387969a.a((kd0) bVarRemove.f387971c);
                bVarRemove.f387969a.a((com.yandex.mobile.ads.exo.drm.f) bVarRemove.f387971c);
                this.f387961i.remove(cVar);
            }
        }
        return a();
    }

    public final i91 a(s31 s31Var) {
        int size = this.f387954b.size();
        if (s31Var.a() != size) {
            s31Var = s31Var.d().b(size);
        }
        this.f387962j = s31Var;
        return a();
    }

    public final void a(@j.P ua1 ua1Var) {
        db.b(!this.f387963k);
        this.f387964l = ua1Var;
        for (int i12 = 0; i12 < this.f387954b.size(); i12++) {
            c cVar = (c) this.f387954b.get(i12);
            a(cVar);
            this.f387961i.add(cVar);
        }
        this.f387963k = true;
    }

    public final eb0 a(jd0.b bVar, h9 h9Var, long j12) {
        Object objD = AbstractC39317e.d(bVar.f385280a);
        jd0.b bVarB = bVar.b(AbstractC39317e.c(bVar.f385280a));
        c cVar = (c) this.f387956d.get(objD);
        cVar.getClass();
        this.f387961i.add(cVar);
        b bVar2 = this.f387960h.get(cVar);
        if (bVar2 != null) {
            bVar2.f387969a.c(bVar2.f387970b);
        }
        cVar.f387974c.add(bVarB);
        eb0 eb0VarB = cVar.f387972a.a(bVarB, h9Var, j12);
        this.f387955c.put(eb0VarB, cVar);
        Iterator it = this.f387961i.iterator();
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            if (cVar2.f387974c.isEmpty()) {
                b bVar3 = this.f387960h.get(cVar2);
                if (bVar3 != null) {
                    bVar3.f387969a.b(bVar3.f387970b);
                }
                it.remove();
            }
        }
        return eb0VarB;
    }

    public final void a(dd0 dd0Var) {
        c cVarRemove = this.f387955c.remove(dd0Var);
        cVarRemove.getClass();
        cVarRemove.f387972a.a(dd0Var);
        cVarRemove.f387974c.remove(((eb0) dd0Var).f384836b);
        if (!this.f387955c.isEmpty()) {
            Iterator it = this.f387961i.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f387974c.isEmpty()) {
                    b bVar = this.f387960h.get(cVar);
                    if (bVar != null) {
                        bVar.f387969a.b(bVar.f387970b);
                    }
                    it.remove();
                }
            }
        }
        if (cVarRemove.f387976e && cVarRemove.f387974c.isEmpty()) {
            b bVarRemove = this.f387960h.remove(cVarRemove);
            bVarRemove.getClass();
            bVarRemove.f387969a.a(bVarRemove.f387970b);
            bVarRemove.f387969a.a((kd0) bVarRemove.f387971c);
            bVarRemove.f387969a.a((com.yandex.mobile.ads.exo.drm.f) bVarRemove.f387971c);
            this.f387961i.remove(cVarRemove);
        }
    }

    public final i91 a() {
        if (this.f387954b.isEmpty()) {
            return i91.f386387a;
        }
        int iB2 = 0;
        for (int i12 = 0; i12 < this.f387954b.size(); i12++) {
            c cVar = (c) this.f387954b.get(i12);
            cVar.f387975d = iB2;
            iB2 += cVar.f387972a.f().b();
        }
        return new yt0(this.f387954b, this.f387962j);
    }

    private void a(c cVar) {
        fb0 fb0Var = cVar.f387972a;
        jd0.c cVar2 = new jd0.c() { // from class: com.yandex.mobile.ads.impl.X0
            @Override // com.yandex.mobile.ads.impl.jd0.c
            public final void a(jd0 jd0Var, i91 i91Var) {
                this.f383343a.a(jd0Var, i91Var);
            }
        };
        a aVar = new a(cVar);
        this.f387960h.put(cVar, new b(fb0Var, cVar2, aVar));
        fb0Var.a(pc1.b((Handler.Callback) null), (kd0) aVar);
        fb0Var.a(pc1.b((Handler.Callback) null), (com.yandex.mobile.ads.exo.drm.f) aVar);
        fb0Var.a(cVar2, this.f387964l, this.f387953a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(jd0 jd0Var, i91 i91Var) {
        ((rt) this.f387957e).h();
    }
}
