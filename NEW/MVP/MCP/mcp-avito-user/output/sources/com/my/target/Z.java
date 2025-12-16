package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.AbstractC37822y0;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.C39882k1;
import e11.C39885l1;
import e11.C39887m0;
import e11.C39901r0;
import e11.C39921y;
import e11.k2;
import e11.m2;
import e11.r2;
import j.InterfaceC42148d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes7.dex */
public abstract class Z<T extends AbstractC39858c1> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final a<T> f364676a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39901r0 f364677b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final p1.a f364678c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public b<T> f364679d;

    public interface a<T extends AbstractC39858c1> {
        @j.N
        AbstractC37822y0 a();

        boolean b();

        @j.P
        e11.T0<T> c();

        @j.N
        AbstractC37789h0<T> d();
    }

    public interface b<T extends AbstractC39858c1> {
        void c(@j.P T t12, @j.P String str);
    }

    public Z(@j.N a<T> aVar, @j.N C39901r0 c39901r0, @j.N p1.a aVar2) {
        this.f364676a = aVar;
        this.f364677b = c39901r0;
        this.f364678c = aVar2;
    }

    public static void f(@j.N p1 p1Var, int i12, long j12) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j12;
        Long l12 = (Long) p1Var.f365070b.get(Integer.valueOf(i12));
        if (l12 != null) {
            jCurrentTimeMillis += l12.longValue();
        }
        p1Var.a(i12, jCurrentTimeMillis);
    }

    @j.N
    @InterfaceC42148d
    public Z<T> a(@j.N p1 p1Var, @j.N Context context) {
        m2.a(new com.avito.konveyor.item_visibility_tracker.c(this, p1Var, context.getApplicationContext(), 7));
        return this;
    }

    @j.P
    public final T b(@j.P T t12, @j.N Context context) {
        e11.T0<T> t0C;
        return (t12 == null || (t0C = this.f364676a.c()) == null) ? t12 : (T) t0C.a(t12, this.f364677b, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [e11.c1] */
    @j.P
    public final T c(@j.N C39882k1 c39882k1, @j.P T t12, @j.N AbstractC37789h0<T> abstractC37789h0, @j.N C39885l1 c39885l1, @j.N p1 p1Var, @j.N Context context) {
        int i12;
        Context context2;
        C39882k1 c39882k12;
        T tD2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c39885l1.b(c39882k1.f394644b, null, null, context);
        f(p1Var, 1, jCurrentTimeMillis);
        if (!c39885l1.f394350a) {
            return t12;
        }
        k2.a(context, c39882k1.a("serviceRequested"));
        int iA2 = t12 != null ? t12.a() : 0;
        String str = (String) c39885l1.f394352c;
        if (str != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            AbstractC39858c1 abstractC39858c1B = abstractC37789h0.b(str, c39882k1, t12, this.f364677b, this.f364678c, p1Var, null, context);
            f(p1Var, 2, jCurrentTimeMillis2);
            i12 = iA2;
            context2 = context;
            c39882k12 = c39882k1;
            tD2 = d(c39882k1.f394645c, abstractC39858c1B, abstractC37789h0, c39885l1, p1Var, context);
        } else {
            i12 = iA2;
            context2 = context;
            c39882k12 = c39882k1;
            tD2 = t12;
        }
        if (i12 != (tD2 != null ? tD2.a() : 0)) {
            return tD2;
        }
        k2.a(context2, c39882k12.a("serviceAnswerEmpty"));
        C39882k1 c39882k13 = c39882k12.f394650h;
        return c39882k13 != null ? (T) c(c39882k13, tD2, abstractC37789h0, c39885l1, p1Var, context) : tD2;
    }

    @j.P
    public final AbstractC39858c1 d(@j.N ArrayList arrayList, @j.P AbstractC39858c1 abstractC39858c1, @j.N AbstractC37789h0 abstractC37789h0, @j.N C39885l1 c39885l1, @j.N p1 p1Var, @j.N Context context) {
        if (arrayList.size() <= 0) {
            return abstractC39858c1;
        }
        Iterator it = arrayList.iterator();
        AbstractC39858c1 abstractC39858c1C = abstractC39858c1;
        while (it.hasNext()) {
            abstractC39858c1C = c((C39882k1) it.next(), abstractC39858c1C, abstractC37789h0, c39885l1, p1Var, context);
        }
        return abstractC39858c1C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.P
    public String e(@j.N C39882k1 c39882k1, @j.N C39885l1 c39885l1, @j.N HashMap map, @j.N Context context) {
        c39885l1.b(c39882k1.f394644b, c39882k1.f394643a, map, context);
        if (c39885l1.f394350a) {
            return (String) c39885l1.f394352c;
        }
        return null;
    }

    public void g(@j.N p1 p1Var, @j.N Context context, @j.N FX0.b bVar) {
        C39887m0.b(context);
        r2 r2VarA = r2.a(context);
        AbstractC37822y0 abstractC37822y0A = this.f364676a.a();
        T.f364598o.f364610m = p1Var;
        ArrayList arrayList = new ArrayList();
        String strC = r2VarA.c("hosts");
        if (!TextUtils.isEmpty(strC)) {
            Collections.addAll(arrayList, strC.split(","));
        }
        arrayList.add("ad.mail.ru");
        String str = (String) arrayList.get(0);
        e11.A0 a02 = new e11.A0(this, bVar, p1Var, arrayList, abstractC37822y0A, context, r2VarA);
        C39901r0 c39901r0 = this.f364677b;
        AbstractC37822y0.a aVar = (AbstractC37822y0.a) abstractC37822y0A;
        int i12 = c39901r0.f394771h;
        C39921y.f394904a = (i12 == 0 || i12 == 1) ? C39921y.f394904a | 16 : C39921y.f394904a & (-17);
        C39921y.f394904a = (i12 == 0 || i12 == 2) ? C39921y.f394904a | 32 : C39921y.f394904a & (-33);
        ArrayList arrayList2 = new ArrayList();
        Iterator<com.my.target.mediation.b> it = c39901r0.f394765b.values().iterator();
        while (it.hasNext()) {
            com.my.target.mediation.c cVarA = it.next().a();
            if (cVarA != null) {
                arrayList2.add(cVarA);
            }
        }
        if (arrayList2.isEmpty()) {
            aVar.b(str, c39901r0, new HashMap(), context, a02);
            return;
        }
        W0 w02 = new W0(c39901r0.f394773j, arrayList2, context, new androidx.work.N(aVar, str, c39901r0, context, a02));
        if (w02.f364631f == 0) {
            w02.a();
            return;
        }
        w02.f364627b.a(w02);
        Iterator it2 = w02.f364628c.iterator();
        while (it2.hasNext()) {
            com.my.target.mediation.c cVar = (com.my.target.mediation.c) it2.next();
            Objects.toString(cVar);
            cVar.b();
            cVar.a();
        }
    }
}
