package com.avito.android.mortgage_calculator.internal.analytics;

import F10.a;
import G10.a;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import com.avito.android.util.C35793f6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y10.C50037b;
import z10.C50349b;
import z10.C50350c;
import z10.C50352e;
import z10.InterfaceC50348a;
import z10.InterfaceC50351d;
import z10.InterfaceC50353f;

/* compiled from: CalculatorAnalyticsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/analytics/b;", "Lcom/avito/android/mortgage_calculator/internal/analytics/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage_calculator.internal.analytics.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f204284a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f204285b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f204286c;

    /* compiled from: CalculatorAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz10/d;", "it", "", "invoke", "(Lz10/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC50351d, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f204287l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f204287l = str;
        }

        @Override // Y41.l
        public final Boolean invoke(InterfaceC50351d interfaceC50351d) {
            return Boolean.valueOf(L.f(interfaceC50351d.getF443779b(), this.f204287l));
        }
    }

    /* compiled from: CalculatorAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz10/d;", "it", "", "invoke", "(Lz10/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage_calculator.internal.analytics.b$b, reason: collision with other inner class name */
    public static final class C6089b extends N implements Y41.l<InterfaceC50351d, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f204288l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6089b(String str) {
            super(1);
            this.f204288l = str;
        }

        @Override // Y41.l
        public final Boolean invoke(InterfaceC50351d interfaceC50351d) {
            return Boolean.valueOf(L.f(interfaceC50351d.getF443779b(), this.f204288l));
        }
    }

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C35793f6 c35793f6, @Y61.k Context context) {
        this.f204284a = interfaceC28373a;
        this.f204285b = context;
        this.f204286c = c35793f6.a();
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void a(@Y61.k E10.c cVar, @Y61.k String str, @Y61.k String str2) {
        Object next;
        ArrayList arrayList;
        B10.b bVar;
        List<B10.a> list;
        a.C0325a c0325aA = cVar.f3689n.a();
        if (c0325aA == null) {
            return;
        }
        Iterator<T> it = c0325aA.f6179d.f6191a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((C50349b) next).f443772f, str2)) {
                    break;
                }
            }
        }
        C50349b c50349b = (C50349b) next;
        if (c50349b == null) {
            return;
        }
        C50350c c50350c = c50349b.f443768b;
        if (c50350c == null || (bVar = c50350c.f443777e) == null || (list = bVar.f795b) == null) {
            arrayList = null;
        } else {
            List<B10.a> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((B10.a) it2.next()).f793d.k0(this.f204285b));
            }
            arrayList = arrayList2;
        }
        CalculatorTabType f4484f = cVar.c().getF4484f();
        InterfaceC50348a interfaceC50348a = c50349b.f443771e;
        InterfaceC50348a.C12940a c12940a = interfaceC50348a instanceof InterfaceC50348a.C12940a ? (InterfaceC50348a.C12940a) interfaceC50348a : null;
        this.f204284a.c(new p(cVar.f3678c, cVar.f3684i, str2, arrayList, cVar.f3680e, f4484f, str, c12940a != null ? c12940a.f443760e : null));
        if (interfaceC50348a instanceof InterfaceC50348a.c) {
            r(cVar, "_program");
        }
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void b(@Y61.k D10.a aVar) {
        d(aVar);
        CalculatorTabType f4484f = aVar.b().getF4484f();
        this.f204284a.c(new w(aVar.f2853j, this.f204286c, aVar.f2857n, aVar.f2847d, f4484f));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void c(@Y61.k E10.c cVar) {
        CalculatorTabType f4484f = cVar.c().getF4484f();
        this.f204284a.c(new s(cVar.f3678c, cVar.f3684i, cVar.f3680e, f4484f));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void d(@Y61.k D10.a aVar) {
        CalculatorTabType f4484f = aVar.b().getF4484f();
        this.f204284a.c(new x(aVar.f2853j, this.f204286c, aVar.f2857n, aVar.f2847d, f4484f));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void e(@Y61.k E10.c cVar, @Y61.k String str) {
        InterfaceC50351d.a aVarA;
        ArrayList arrayList;
        B10.b bVar;
        List<B10.a> list;
        a.C0325a c0325aA = cVar.f3689n.a();
        if (c0325aA == null || (aVarA = C50352e.a(new a(str), c0325aA.f6178c)) == null) {
            return;
        }
        InterfaceC50353f interfaceC50353f = aVarA.f443778a;
        InterfaceC50353f.d dVarB = interfaceC50353f.b();
        if (dVarB == null || (bVar = dVarB.f443794f) == null || (list = bVar.f795b) == null) {
            arrayList = null;
        } else {
            List<B10.a> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((B10.a) it.next()).f793d.k0(this.f204285b));
            }
            arrayList = arrayList2;
        }
        CalculatorTabType f4484f = cVar.c().getF4484f();
        InterfaceC50353f.b bVarA = interfaceC50353f.a();
        this.f204284a.c(new n(cVar.f3678c, cVar.f3684i, str, arrayList, cVar.f3680e, f4484f, bVarA != null ? bVarA.f443785c.f47c : null));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void f(@Y61.k D10.a aVar) {
        long jA2 = aVar.f2846c.a();
        CalculatorTabType f4484f = aVar.b().getF4484f();
        this.f204284a.c(new e(aVar.f2853j, aVar.f2857n, jA2, aVar.f2847d, f4484f));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void g(@Y61.k b.r rVar, @Y61.k D10.a aVar) {
        boolean zEquals = rVar.equals(b.r.C6101b.f204589b);
        InterfaceC28373a interfaceC28373a = this.f204284a;
        if (!zEquals) {
            if (rVar.equals(b.r.a.f204588b)) {
                interfaceC28373a.c(new g(aVar.f2853j, aVar.f2857n, aVar.b().getF4482d().f442846e.f442853b, aVar.f2847d, aVar.b().getF4484f()));
                return;
            }
            return;
        }
        F10.a aVarB = aVar.b();
        a.C0271a c0271a = aVarB instanceof a.C0271a ? (a.C0271a) aVarB : null;
        if (c0271a == null) {
            return;
        }
        interfaceC28373a.c(new k(aVar.f2853j, aVar.f2857n, c0271a.f4475b.f442846e.f442853b, aVar.f2847d, aVar.b().getF4484f()));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void h(@Y61.k E10.c cVar, int i12) {
        C50349b c50349b;
        a.C0325a c0325aA = cVar.f3689n.a();
        if (c0325aA == null || (c50349b = (C50349b) C42745f0.K(i12, c0325aA.f6179d.f6191a)) == null) {
            return;
        }
        String str = c50349b.f443772f;
        a(cVar, "program_popup_tab", str);
        this.f204284a.c(new q(cVar.f3684i, str));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void i(@Y61.k E10.c cVar, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4) {
        CalculatorTabType f4484f = cVar.c().getF4484f();
        this.f204284a.c(new l(cVar.f3678c, cVar.f3684i, str4, cVar.f3680e, f4484f, str3, str, str2));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void j(@Y61.k D10.a aVar, @Y61.k E10.c cVar, @Y61.k String str) {
        ArrayList arrayList;
        B10.b bVar;
        List<B10.a> list;
        a.C0325a c0325aA = cVar.f3689n.a();
        if (c0325aA == null) {
            return;
        }
        C6089b c6089b = new C6089b(str);
        ArrayList arrayList2 = c0325aA.f6178c;
        InterfaceC50351d.a aVarA = C50352e.a(c6089b, arrayList2);
        if (aVarA == null) {
            return;
        }
        InterfaceC50353f interfaceC50353f = aVarA.f443778a;
        InterfaceC50353f.d dVarB = interfaceC50353f.b();
        if (dVarB == null || (bVar = dVarB.f443794f) == null || (list = bVar.f795b) == null) {
            arrayList = null;
        } else {
            List<B10.a> list2 = list;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((B10.a) it.next()).f793d.k0(this.f204285b));
            }
            arrayList = arrayList3;
        }
        InterfaceC50353f.b bVarA = interfaceC50353f.a();
        A10.a aVar2 = bVarA != null ? bVarA.f443785c : null;
        r rVar = new r(aVar.f2853j, aVar.f2857n, str, arrayList, aVar.f2847d, aVar.b().getF4484f(), arrayList2.size() > 1 ? "plural" : "only", aVar2 != null ? aVar2.f47c : null);
        InterfaceC28373a interfaceC28373a = this.f204284a;
        interfaceC28373a.c(rVar);
        if (aVar2 != null) {
            interfaceC28373a.c(new m(aVar.f2853j, aVar.f2857n, str, aVar.f2847d, aVar.b().getF4484f(), aVar2.f47c, aVar2.f48d));
        }
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void k(@Y61.k E10.c cVar) {
        this.f204284a.c(new t(cVar.f3678c, cVar.f3684i, cVar.f3681f));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void l(@Y61.k E10.c cVar) {
        CalculatorTabType f4484f = cVar.c().getF4484f();
        this.f204284a.c(new z(cVar.f3678c, cVar.f3684i, cVar.f3680e, f4484f));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void m(@Y61.k E10.c cVar) {
        ArrayList arrayList;
        B10.b bVar;
        List<B10.a> list;
        a.C0325a c0325aA = cVar.f3689n.a();
        if (c0325aA == null) {
            return;
        }
        C50349b c50349bB = c0325aA.f6179d.b();
        C50350c c50350c = c50349bB.f443768b;
        if (c50350c == null || (bVar = c50350c.f443777e) == null || (list = bVar.f795b) == null) {
            arrayList = null;
        } else {
            List<B10.a> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((B10.a) it.next()).f793d.k0(this.f204285b));
            }
            arrayList = arrayList2;
        }
        CalculatorTabType f4484f = cVar.c().getF4484f();
        InterfaceC50348a interfaceC50348a = c50349bB.f443771e;
        InterfaceC50348a.C12940a c12940a = interfaceC50348a instanceof InterfaceC50348a.C12940a ? (InterfaceC50348a.C12940a) interfaceC50348a : null;
        this.f204284a.c(new o(cVar.f3684i, c50349bB.f443772f, arrayList, cVar.f3680e, f4484f, c12940a != null ? c12940a.f443760e : null));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void n(@Y61.k E10.c cVar) {
        CalculatorTabType f4484f = cVar.c().getF4484f();
        this.f204284a.c(new y(cVar.f3678c, cVar.f3684i, cVar.f3680e, f4484f));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void o(@Y61.k b.d dVar, @Y61.k D10.a aVar) {
        C50037b c50037b;
        boolean z12 = dVar instanceof b.d.C6100d;
        InterfaceC28373a interfaceC28373a = this.f204284a;
        if (z12) {
            a.b bVarA = F10.b.a(aVar.b());
            if (bVarA == null) {
                return;
            }
            C50037b c50037b2 = bVarA.f4481c;
            C50037b c50037b3 = bVarA.f4480b;
            if (c50037b2 != null) {
                interfaceC28373a.c(new h(aVar.f2853j, aVar.f2857n, c50037b3.f442846e.f442853b, aVar.f2847d, aVar.b().getF4484f()));
                return;
            } else {
                interfaceC28373a.c(new v(aVar.f2853j, aVar.f2857n, c50037b3.f442846e.f442853b, aVar.f2847d, aVar.b().getF4484f()));
                return;
            }
        }
        if (dVar instanceof b.d.C6099b) {
            a.b bVarA2 = F10.b.a(aVar.b());
            if (bVarA2 == null || (c50037b = bVarA2.f4481c) == null) {
                return;
            }
            interfaceC28373a.c(new i(aVar.f2853j, aVar.f2857n, c50037b.f442846e.f442853b, aVar.f2847d, aVar.b().getF4484f()));
            return;
        }
        if (!(dVar instanceof b.d.c)) {
            if (dVar instanceof b.d.a) {
                interfaceC28373a.c(new f(aVar.f2853j, aVar.f2857n, aVar.b().getF4482d().f442846e.f442853b, aVar.f2847d, aVar.b().getF4484f()));
            }
        } else {
            F10.a aVarB = aVar.b();
            a.C0271a c0271a = aVarB instanceof a.C0271a ? (a.C0271a) aVarB : null;
            if (c0271a == null) {
                return;
            }
            interfaceC28373a.c(new j(aVar.f2853j, aVar.f2857n, c0271a.f4475b.f442846e.f442853b, aVar.f2847d, aVar.b().getF4484f()));
        }
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void p(@Y61.k E10.c cVar) {
        this.f204284a.c(new t(cVar.f3678c, cVar.f3684i, AK.c.s(new StringBuilder(), cVar.f3681f, "_program")));
    }

    @Override // com.avito.android.mortgage_calculator.internal.analytics.a
    public final void q(@Y61.k E10.c cVar) {
        r(cVar, "");
    }

    public final void r(E10.c cVar, String str) {
        this.f204284a.c(new u(cVar.f3678c, cVar.f3684i, AK.c.s(new StringBuilder(), cVar.f3681f, str)));
    }
}
