package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.R0;
import com.my.target.X0;
import com.my.target.nativeads.h;
import com.my.target.p1;
import e11.C39862e;
import e11.C39864e1;
import e11.C39901r0;
import e11.k2;
import e11.m2;
import j.N;
import j.P;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class o implements i, com.my.target.mediation.a {

    /* renamed from: a, reason: collision with root package name */
    @P
    public C39862e f364977a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public com.my.target.nativeads.h f364978b;

    public class a implements h.c, h.b, h.a {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final R0.a f364979a;

        public a(@N R0.a aVar) {
            this.f364979a = aVar;
        }

        @Override // com.my.target.nativeads.h.c
        public final void a(@N String str) {
            this.f364979a.a(o.this);
        }

        @Override // com.my.target.nativeads.h.c
        public final void b() {
            R0.a aVar = this.f364979a;
            R0 r02 = R0.this;
            if (r02.f364337d != o.this) {
                return;
            }
            Context contextQ = r02.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364540a.f394579d.e("playbackStarted"));
            }
            h.c cVar = r02.f364535k.f365011g;
            if (cVar != null) {
                ((a) cVar).b();
            }
        }

        @Override // com.my.target.nativeads.h.c
        public final void c() {
            R0.a aVar = this.f364979a;
            R0 r02 = R0.this;
            if (r02.f364337d != o.this) {
                return;
            }
            Context contextQ = r02.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364540a.f394579d.e("click"));
            }
            h.c cVar = r02.f364535k.f365011g;
            if (cVar != null) {
                ((a) cVar).c();
            }
        }

        @Override // com.my.target.nativeads.h.a
        public final void d(@P com.my.target.common.models.b bVar, boolean z12) {
            h.a aVar = R0.this.f364535k.f365012h;
            if (aVar == null) {
                return;
            }
            ((a) aVar).d(bVar, z12);
        }

        @Override // com.my.target.nativeads.h.c
        public final void e(@N k11.b bVar) {
            R0.a aVar = this.f364979a;
            R0 r02 = R0.this;
            if (r02.f364337d != o.this) {
                return;
            }
            C39864e1 c39864e1 = aVar.f364540a;
            Context contextQ = r02.q();
            String str = c39864e1.f394576a;
            if (!"myTarget".equals(str) && !"0".equals(c39864e1.a().get("lg")) && contextQ != null) {
                m2.c(new com.avito.konveyor.item_visibility_tracker.c(str, bVar, contextQ, 9));
            }
            r02.h(c39864e1, true);
            r02.f364537m = bVar;
            h.c cVar = r02.f364535k.f365011g;
            if (cVar != null) {
                ((a) cVar).e(bVar);
            }
        }

        @Override // com.my.target.nativeads.h.b
        public final void f(@N com.my.target.nativeads.h hVar) {
            Objects.toString(hVar);
            com.my.target.nativeads.h hVar2 = R0.this.f364535k;
            h.b bVar = hVar2.f365013i;
            if (bVar == null) {
                return;
            }
            ((a) bVar).f(hVar2);
        }

        @Override // com.my.target.nativeads.h.b
        public final void g(@N com.my.target.nativeads.h hVar) {
            Objects.toString(hVar);
            com.my.target.nativeads.h hVar2 = R0.this.f364535k;
            h.b bVar = hVar2.f365013i;
            if (bVar == null) {
                return;
            }
            ((a) bVar).g(hVar2);
        }

        @Override // com.my.target.nativeads.h.b
        public final boolean k() {
            h.b bVar = R0.this.f364535k.f365013i;
            if (bVar == null) {
                return true;
            }
            return ((a) bVar).k();
        }
    }

    @Override // com.my.target.mediation.i
    public final void b(@N R0.b bVar, @N R0.a aVar, @N Context context) {
        try {
            com.my.target.nativeads.h hVar = new com.my.target.nativeads.h(Integer.parseInt(bVar.f364344a), bVar.f364543h, context);
            this.f364978b = hVar;
            C39901r0 c39901r0 = hVar.f395639a;
            c39901r0.f394767d = false;
            c39901r0.f394771h = bVar.f364542g;
            a aVar2 = new a(aVar);
            hVar.f365011g = aVar2;
            hVar.f365012h = aVar2;
            hVar.f365013i = aVar2;
            f11.c cVar = c39901r0.f394764a;
            cVar.i(bVar.f364347d);
            cVar.k(bVar.f364346c);
            for (Map.Entry entry : bVar.f364348e.entrySet()) {
                cVar.j((String) entry.getKey(), (String) entry.getValue());
            }
            C39862e c39862e = this.f364977a;
            if (c39862e != null) {
                com.my.target.nativeads.h hVar2 = this.f364978b;
                C39901r0 c39901r02 = hVar2.f395639a;
                p1.a aVar3 = new p1.a(c39901r02.f394772i);
                p1 p1VarA = aVar3.a();
                X0 x02 = new X0(c39901r02, aVar3, c39862e);
                x02.f364679d = new com.my.target.ads.a(hVar2, 2);
                x02.a(p1VarA, hVar2.f365008d);
                return;
            }
            String str = bVar.f364345b;
            if (TextUtils.isEmpty(str)) {
                this.f364978b.a();
                return;
            }
            com.my.target.nativeads.h hVar3 = this.f364978b;
            hVar3.f395639a.f394770g = str;
            hVar3.a();
        } catch (Throwable unused) {
            aVar.a(this);
        }
    }

    @Override // com.my.target.mediation.e
    public final void destroy() {
        com.my.target.nativeads.h hVar = this.f364978b;
        if (hVar == null) {
            return;
        }
        hVar.j();
        this.f364978b.f365011g = null;
        this.f364978b = null;
    }

    @Override // com.my.target.mediation.i
    public final void j() {
        com.my.target.nativeads.h hVar = this.f364978b;
        if (hVar == null) {
            return;
        }
        hVar.j();
    }
}
