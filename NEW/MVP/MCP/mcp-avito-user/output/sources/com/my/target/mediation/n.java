package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.my.target.L0;
import com.my.target.X0;
import com.my.target.nativeads.d;
import com.my.target.p1;
import e11.C39862e;
import e11.C39864e1;
import e11.C39901r0;
import e11.U1;
import e11.h2;
import e11.k2;
import e11.m2;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class n implements g, com.my.target.mediation.a {

    /* renamed from: a, reason: collision with root package name */
    @P
    public C39862e f364973a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public com.my.target.nativeads.d f364974b;

    public class a implements d.c, d.a, d.b {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final L0.a f364975a;

        public a(@N L0.a aVar) {
            this.f364975a = aVar;
        }

        @Override // com.my.target.nativeads.d.c
        public final void a(@N k11.c cVar, @N com.my.target.nativeads.d dVar) {
            L0.a aVar = this.f364975a;
            L0 l02 = L0.this;
            if (l02.f364337d != n.this) {
                return;
            }
            C39864e1 c39864e1 = aVar.f364459a;
            Context contextQ = l02.q();
            String str = c39864e1.f394576a;
            if (!"myTarget".equals(str) && !"0".equals(c39864e1.a().get("lg")) && contextQ != null) {
                m2.c(new com.avito.konveyor.item_visibility_tracker.c(str, cVar, contextQ, 10));
            }
            l02.h(c39864e1, true);
            l02.f364455m = cVar;
            com.my.target.nativeads.d dVar2 = l02.f364453k;
            d.c cVar2 = dVar2.f365003g;
            if (cVar2 != null) {
                cVar2.a(cVar, dVar2);
            }
        }

        @Override // com.my.target.nativeads.d.c
        public final void b() {
            L0.a aVar = this.f364975a;
            L0 l02 = L0.this;
            if (l02.f364337d != n.this) {
                return;
            }
            Context contextQ = l02.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364459a.f394579d.e("playbackStarted"));
            }
            d.c cVar = l02.f364453k.f365003g;
            if (cVar != null) {
                cVar.b();
            }
        }

        @Override // com.my.target.nativeads.d.c
        public final void c() {
            d.c cVar;
            L0 l02 = L0.this;
            if (l02.f364337d == n.this && (cVar = l02.f364453k.f365003g) != null) {
                cVar.c();
            }
        }

        @Override // com.my.target.nativeads.d.c
        public final void d() {
            d.c cVar;
            L0 l02 = L0.this;
            if (l02.f364337d == n.this && (cVar = l02.f364453k.f365003g) != null) {
                cVar.d();
            }
        }

        @Override // com.my.target.nativeads.d.c
        public final void e() {
            d.c cVar;
            L0 l02 = L0.this;
            if (l02.f364337d == n.this && (cVar = l02.f364453k.f365003g) != null) {
                cVar.e();
            }
        }

        @Override // com.my.target.nativeads.d.a
        public final void f(@P com.my.target.common.models.b bVar, boolean z12) {
            d.a aVar;
            L0 l02 = L0.this;
            if (l02.f364337d == n.this && (aVar = l02.f364453k.f365004h) != null) {
                ((a) aVar).f(bVar, z12);
            }
        }

        @Override // com.my.target.nativeads.d.c
        public final void g(@N String str, @N com.my.target.nativeads.d dVar) {
            this.f364975a.a(n.this);
        }

        @Override // com.my.target.nativeads.d.b
        public final boolean k() {
            d.b bVar = L0.this.f364453k.f365006j;
            if (bVar == null) {
                return true;
            }
            return ((a) bVar).k();
        }

        @Override // com.my.target.nativeads.d.b
        public final void l(@N com.my.target.nativeads.d dVar) {
            Objects.toString(dVar);
            com.my.target.nativeads.d dVar2 = L0.this.f364453k;
            d.b bVar = dVar2.f365006j;
            if (bVar == null) {
                return;
            }
            ((a) bVar).l(dVar2);
        }

        @Override // com.my.target.nativeads.d.b
        public final void m(@N com.my.target.nativeads.d dVar) {
            Objects.toString(dVar);
            com.my.target.nativeads.d dVar2 = L0.this.f364453k;
            d.b bVar = dVar2.f365006j;
            if (bVar == null) {
                return;
            }
            ((a) bVar).m(dVar2);
        }

        @Override // com.my.target.nativeads.d.c
        public final void onClick() {
            L0.a aVar = this.f364975a;
            L0 l02 = L0.this;
            if (l02.f364337d != n.this) {
                return;
            }
            Context contextQ = l02.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364459a.f394579d.e("click"));
            }
            d.c cVar = l02.f364453k.f365003g;
            if (cVar != null) {
                cVar.onClick();
            }
        }
    }

    @Override // com.my.target.mediation.e
    public final void destroy() {
        com.my.target.nativeads.d dVar = this.f364974b;
        if (dVar == null) {
            return;
        }
        dVar.j();
        this.f364974b.f365003g = null;
        this.f364974b = null;
    }

    @Override // com.my.target.mediation.g
    public final void j() {
        com.my.target.nativeads.d dVar = this.f364974b;
        if (dVar == null) {
            return;
        }
        dVar.j();
    }

    @Override // com.my.target.mediation.g
    public final void k(@N L0.b bVar, @N L0.a aVar, @N Context context) {
        try {
            com.my.target.nativeads.d dVar = new com.my.target.nativeads.d(Integer.parseInt(bVar.f364344a), context);
            dVar.f365001e = bVar.f364462h;
            this.f364974b = dVar;
            C39901r0 c39901r0 = dVar.f395639a;
            c39901r0.f394767d = false;
            c39901r0.f394771h = bVar.f364461g;
            a aVar2 = new a(aVar);
            dVar.f365003g = aVar2;
            dVar.f365004h = aVar2;
            dVar.f365006j = aVar2;
            f11.c cVar = c39901r0.f394764a;
            cVar.i(bVar.f364347d);
            cVar.k(bVar.f364346c);
            for (Map.Entry entry : bVar.f364348e.entrySet()) {
                cVar.j((String) entry.getKey(), (String) entry.getValue());
            }
            C39862e c39862e = this.f364973a;
            if (c39862e != null) {
                com.my.target.nativeads.d dVar2 = this.f364974b;
                p1.a aVar3 = dVar2.f395640b;
                p1 p1VarA = aVar3.a();
                X0 x02 = new X0(dVar2.f395639a, aVar3, c39862e);
                x02.f364679d = new com.my.target.ads.a(dVar2, 1);
                x02.a(p1VarA, dVar2.f365000d);
                return;
            }
            String str = bVar.f364345b;
            if (TextUtils.isEmpty(str)) {
                this.f364974b.b();
                return;
            }
            com.my.target.nativeads.d dVar3 = this.f364974b;
            dVar3.f395639a.f394770g = str;
            dVar3.b();
        } catch (Throwable unused) {
            aVar.a(this);
        }
    }

    @Override // com.my.target.mediation.g
    public final void l(@N View view, @P List list) {
        com.my.target.nativeads.d dVar = this.f364974b;
        if (dVar == null) {
            return;
        }
        U1.a(view, dVar);
        h2 h2Var = dVar.f365002f;
        if (h2Var != null) {
            h2Var.a(view, (ArrayList) list);
        }
    }
}
