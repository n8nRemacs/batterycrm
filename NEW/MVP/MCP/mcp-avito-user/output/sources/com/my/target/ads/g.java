package com.my.target.ads;

import com.my.target.AbstractC37792j;
import com.my.target.j1;
import com.my.target.k1;
import e11.W0;
import e11.X0;
import e11.p2;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class g extends com.my.target.ads.b {

    /* renamed from: g, reason: collision with root package name */
    @P
    public c f364707g;

    public interface c {
        void a(@N String str);

        void b();

        void c(@N f fVar);

        void onClick();
    }

    public class d implements k1.b {
        public d(a aVar) {
        }

        @Override // com.my.target.k1.b
        public final void c(@N f fVar) {
            c cVar = g.this.f364707g;
            if (cVar != null) {
                cVar.c(fVar);
            }
        }
    }

    @Override // com.my.target.ads.b
    public final void a() {
        super.a();
        this.f364707g = null;
    }

    @Override // com.my.target.ads.b
    public final void b(@P W0 w02, @P String str) {
        p2 p2Var;
        X0 x02;
        c cVar = this.f364707g;
        if (cVar == null) {
            return;
        }
        if (w02 != null) {
            p2Var = w02.f394498b;
            x02 = w02.f394557a;
        } else {
            p2Var = null;
            x02 = null;
        }
        if (p2Var != null) {
            AbstractC37792j abstractC37792jA = AbstractC37792j.a(p2Var, w02, this.f364684f, new b(null));
            this.f364683e = abstractC37792jA;
            if (abstractC37792jA == null) {
                this.f364707g.a("no ad");
                return;
            } else {
                abstractC37792jA.f364877c = new d(null);
                this.f364707g.b();
                return;
            }
        }
        if (x02 == null) {
            if (str == null) {
                str = "no ad";
            }
            cVar.a(str);
        } else {
            j1 j1Var = new j1(x02, this.f395639a, this.f395640b, new b(null));
            j1Var.f364880l = new d(null);
            this.f364683e = j1Var;
            j1Var.n(this.f364682d);
        }
    }

    public class b implements k1.a {
        public b(a aVar) {
        }

        @Override // com.my.target.k1.a
        public final void b() {
            c cVar = g.this.f364707g;
            if (cVar != null) {
                cVar.b();
            }
        }

        @Override // com.my.target.k1.a
        public final void c() {
            c cVar = g.this.f364707g;
            if (cVar != null) {
                cVar.a("No data for available ad networks");
            }
        }

        @Override // com.my.target.k1.a
        public final void onClick() {
            c cVar = g.this.f364707g;
            if (cVar != null) {
                cVar.onClick();
            }
        }

        @Override // com.my.target.k1.a
        public final void onVideoCompleted() {
        }
    }
}
