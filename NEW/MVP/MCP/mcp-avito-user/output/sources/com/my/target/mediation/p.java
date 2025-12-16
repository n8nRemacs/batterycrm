package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.B0;
import com.my.target.C37804p;
import com.my.target.ads.g;
import com.my.target.j1;
import com.my.target.k1;
import com.my.target.p1;
import com.my.tracker.ads.AdFormat;
import e11.C39901r0;
import e11.W0;
import e11.k2;
import j.N;
import j.P;
import java.util.Map;

/* loaded from: classes7.dex */
public final class p implements k {

    /* renamed from: a, reason: collision with root package name */
    @P
    public W0 f364981a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public com.my.target.ads.g f364982b;

    public class a implements g.c {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final j1.a f364983a;

        public a(@N j1.a aVar) {
            this.f364983a = aVar;
        }

        @Override // com.my.target.ads.g.c
        public final void a(@N String str) {
            this.f364983a.a(p.this);
        }

        @Override // com.my.target.ads.g.c
        public final void b() {
            j1.a aVar = this.f364983a;
            j1 j1Var = j1.this;
            if (j1Var.f364337d != p.this) {
                return;
            }
            j1Var.h(aVar.f364881a, true);
            j1Var.f364879k.b();
        }

        @Override // com.my.target.ads.g.c
        public final void c(@N com.my.target.ads.f fVar) {
            j1.a aVar = this.f364983a;
            j1 j1Var = j1.this;
            if (j1Var.f364337d != p.this) {
                return;
            }
            Context contextQ = j1Var.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364881a.f394579d.e("reward"));
            }
            k1.b bVar = j1Var.f364880l;
            if (bVar != null) {
                bVar.c(fVar);
            }
        }

        @Override // com.my.target.ads.g.c
        public final void onClick() {
            j1.a aVar = this.f364983a;
            j1 j1Var = j1.this;
            if (j1Var.f364337d != p.this) {
                return;
            }
            Context contextQ = j1Var.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364881a.f394579d.e("click"));
            }
            j1Var.f364879k.onClick();
        }
    }

    @Override // com.my.target.mediation.k
    public final void c(@N B0.a aVar, @N j1.a aVar2, @N Context context) {
        try {
            com.my.target.ads.g gVar = new com.my.target.ads.g(context, Integer.parseInt(aVar.f364344a), AdFormat.REWARDED);
            this.f364982b = gVar;
            C39901r0 c39901r0 = gVar.f395639a;
            c39901r0.f394767d = false;
            gVar.f364707g = new a(aVar2);
            f11.c cVar = c39901r0.f394764a;
            cVar.i(aVar.f364347d);
            cVar.k(aVar.f364346c);
            for (Map.Entry entry : aVar.f364348e.entrySet()) {
                cVar.j((String) entry.getKey(), (String) entry.getValue());
            }
            W0 w02 = this.f364981a;
            if (w02 != null) {
                com.my.target.ads.g gVar2 = this.f364982b;
                p1.a aVar3 = gVar2.f395640b;
                p1 p1VarA = aVar3.a();
                C37804p c37804p = new C37804p(gVar2.f395639a, aVar3, w02);
                c37804p.f364679d = new com.my.target.ads.a(gVar2, 0);
                c37804p.a(p1VarA, gVar2.f364682d);
                return;
            }
            String str = aVar.f364345b;
            if (TextUtils.isEmpty(str)) {
                this.f364982b.c();
                return;
            }
            com.my.target.ads.g gVar3 = this.f364982b;
            gVar3.f395639a.f394770g = str;
            gVar3.c();
        } catch (Throwable unused) {
            aVar2.a(this);
        }
    }

    @Override // com.my.target.mediation.e
    public final void destroy() {
        com.my.target.ads.g gVar = this.f364982b;
        if (gVar == null) {
            return;
        }
        gVar.f364707g = null;
        gVar.a();
        this.f364982b = null;
    }
}
