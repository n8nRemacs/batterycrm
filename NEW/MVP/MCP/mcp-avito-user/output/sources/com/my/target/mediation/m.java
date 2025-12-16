package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.B0;
import com.my.target.C37804p;
import com.my.target.H0;
import com.my.target.ads.c;
import com.my.target.p1;
import e11.C39901r0;
import e11.W0;
import e11.k2;
import j.N;
import j.P;
import java.util.Map;

/* loaded from: classes7.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    @P
    public W0 f364969a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public com.my.target.ads.c f364970b;

    public class a implements c.InterfaceC10785c {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final H0.a f364971a;

        public a(@N H0.a aVar) {
            this.f364971a = aVar;
        }

        @Override // com.my.target.ads.c.InterfaceC10785c
        public final void a(@N String str) {
            this.f364971a.a(m.this);
        }

        @Override // com.my.target.ads.c.InterfaceC10785c
        public final void b() {
            H0.a aVar = this.f364971a;
            H0 h02 = H0.this;
            if (h02.f364337d != m.this) {
                return;
            }
            h02.h(aVar.f364400a, true);
            h02.f364399k.b();
        }

        @Override // com.my.target.ads.c.InterfaceC10785c
        public final void onClick() {
            H0.a aVar = this.f364971a;
            H0 h02 = H0.this;
            if (h02.f364337d != m.this) {
                return;
            }
            Context contextQ = h02.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364400a.f394579d.e("click"));
            }
            h02.f364399k.onClick();
        }

        @Override // com.my.target.ads.c.InterfaceC10785c
        public final void onVideoCompleted() {
            H0.a aVar = this.f364971a;
            H0 h02 = H0.this;
            if (h02.f364337d != m.this) {
                return;
            }
            h02.f364399k.onVideoCompleted();
            Context contextQ = h02.q();
            if (contextQ != null) {
                k2.a(contextQ, aVar.f364400a.f394579d.e("reward"));
            }
        }
    }

    @Override // com.my.target.mediation.f
    public final void d(@N B0.a aVar, @N H0.a aVar2, @N Context context) {
        try {
            com.my.target.ads.c cVar = new com.my.target.ads.c(context, Integer.parseInt(aVar.f364344a), "fullscreen");
            this.f364970b = cVar;
            C39901r0 c39901r0 = cVar.f395639a;
            c39901r0.f394767d = false;
            cVar.f364685g = new a(aVar2);
            f11.c cVar2 = c39901r0.f394764a;
            cVar2.i(aVar.f364347d);
            cVar2.k(aVar.f364346c);
            for (Map.Entry entry : aVar.f364348e.entrySet()) {
                cVar2.j((String) entry.getKey(), (String) entry.getValue());
            }
            W0 w02 = this.f364969a;
            if (w02 != null) {
                com.my.target.ads.c cVar3 = this.f364970b;
                p1.a aVar3 = cVar3.f395640b;
                p1 p1VarA = aVar3.a();
                C37804p c37804p = new C37804p(cVar3.f395639a, aVar3, w02);
                c37804p.f364679d = new com.my.target.ads.a(cVar3, 0);
                c37804p.a(p1VarA, cVar3.f364682d);
                return;
            }
            String str = aVar.f364345b;
            if (TextUtils.isEmpty(str)) {
                this.f364970b.c();
                return;
            }
            com.my.target.ads.c cVar4 = this.f364970b;
            cVar4.f395639a.f394770g = str;
            cVar4.c();
        } catch (Throwable unused) {
            aVar2.a(this);
        }
    }

    @Override // com.my.target.mediation.e
    public final void destroy() {
        com.my.target.ads.c cVar = this.f364970b;
        if (cVar == null) {
            return;
        }
        cVar.f364685g = null;
        cVar.a();
        this.f364970b = null;
    }
}
