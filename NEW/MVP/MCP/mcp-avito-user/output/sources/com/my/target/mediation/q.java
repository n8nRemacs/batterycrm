package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.my.target.B0;
import com.my.target.C37810s0;
import com.my.target.C37818w0;
import com.my.target.ads.e;
import com.my.target.n1;
import com.my.target.p1;
import e11.C39901r0;
import e11.D1;
import e11.k2;
import j.N;
import j.P;
import java.util.Map;

/* loaded from: classes7.dex */
public final class q implements l {

    /* renamed from: a, reason: collision with root package name */
    @P
    public D1 f364985a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public com.my.target.ads.e f364986b;

    public class a implements e.b {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final n1.a f364987a;

        public a(@N n1.a aVar) {
            this.f364987a = aVar;
        }

        @Override // com.my.target.ads.e.b
        public final void a(@N String str) {
            this.f364987a.a(q.this);
        }

        @Override // com.my.target.ads.e.b
        public final void b() {
            n1.a aVar = this.f364987a;
            n1 n1Var = n1.this;
            if (n1Var.f364337d != q.this) {
                return;
            }
            Context contextQ = n1Var.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364998a.f394579d.e("playbackStarted"));
            }
            C37818w0.a aVar2 = n1Var.f364997l;
            if (aVar2 != null) {
                aVar2.a();
            }
        }

        @Override // com.my.target.ads.e.b
        public final void c(@N com.my.target.ads.e eVar) {
            n1.a aVar = this.f364987a;
            n1 n1Var = n1.this;
            if (n1Var.f364337d != q.this) {
                return;
            }
            n1Var.h(aVar.f364998a, true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            eVar.setLayoutParams(layoutParams);
            com.my.target.ads.e eVar2 = n1Var.f364996k;
            eVar2.removeAllViews();
            eVar2.addView(eVar);
            C37818w0.a aVar2 = n1Var.f364997l;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // com.my.target.ads.e.b
        public final void onClick() {
            n1.a aVar = this.f364987a;
            n1 n1Var = n1.this;
            if (n1Var.f364337d != q.this) {
                return;
            }
            Context contextQ = n1Var.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364998a.f394579d.e("click"));
            }
            C37818w0.a aVar2 = n1Var.f364997l;
            if (aVar2 != null) {
                aVar2.b();
            }
        }
    }

    @Override // com.my.target.mediation.l
    public final void a(@N B0.a aVar, @N e.a aVar2, @N n1.a aVar3, @N Context context) {
        try {
            int i12 = Integer.parseInt(aVar.f364344a);
            com.my.target.ads.e eVar = new com.my.target.ads.e(context);
            this.f364986b = eVar;
            eVar.setSlotId(i12);
            this.f364986b.setAdSize(aVar2);
            this.f364986b.setRefreshAd(false);
            this.f364986b.setMediationEnabled(false);
            this.f364986b.setListener(new a(aVar3));
            f11.c customParams = this.f364986b.getCustomParams();
            customParams.i(aVar.f364347d);
            customParams.k(aVar.f364346c);
            for (Map.Entry entry : aVar.f364348e.entrySet()) {
                customParams.j((String) entry.getKey(), (String) entry.getValue());
            }
            D1 d12 = this.f364985a;
            if (d12 != null) {
                com.my.target.ads.e eVar2 = this.f364986b;
                C39901r0 c39901r0 = eVar2.f364691b;
                p1.a aVar4 = new p1.a(c39901r0.f394772i);
                p1 p1VarA = aVar4.a();
                C37810s0 c37810s0 = new C37810s0(c39901r0, aVar4, d12);
                c37810s0.f364679d = new com.my.target.ads.d(eVar2, aVar4, 0);
                c37810s0.a(p1VarA, eVar2.getContext());
                return;
            }
            String str = aVar.f364345b;
            if (TextUtils.isEmpty(str)) {
                this.f364986b.b();
                return;
            }
            com.my.target.ads.e eVar3 = this.f364986b;
            C39901r0 c39901r02 = eVar3.f364691b;
            c39901r02.f394770g = str;
            c39901r02.f394768e = false;
            eVar3.b();
        } catch (Throwable unused) {
            aVar3.a(this);
        }
    }

    @Override // com.my.target.mediation.e
    public final void destroy() {
        com.my.target.ads.e eVar = this.f364986b;
        if (eVar == null) {
            return;
        }
        eVar.setListener(null);
        com.my.target.ads.e eVar2 = this.f364986b;
        C37818w0 c37818w0 = eVar2.f364695f;
        if (c37818w0 != null) {
            C37818w0.b bVar = c37818w0.f365207c;
            if (bVar.f365218a) {
                c37818w0.g();
            }
            bVar.f365223f = false;
            bVar.f365220c = false;
            c37818w0.d();
            eVar2.f364695f = null;
        }
        eVar2.f364693d = null;
        eVar2.f364694e = null;
        this.f364986b = null;
    }
}
