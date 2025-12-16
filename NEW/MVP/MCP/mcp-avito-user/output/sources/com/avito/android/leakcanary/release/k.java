package com.avito.android.leakcanary.release;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43026i;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;
import leakcanary.r;
import shark.B1;
import shark.C1;
import shark.E1;
import shark.E2;
import shark.LeakTrace;
import shark.LeakTraceObject;
import shark.LeakTraceReference;

/* compiled from: ReleaseLeakCanaryReporter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leakcanary/release/k;", "", "_common_leakcanary-release_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f175089a;

    public k(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f175089a = interfaceC28373a;
    }

    public final void a(@Y61.k r.a aVar) {
        String str;
        Object next;
        Object obj;
        Integer numValueOf;
        boolean z12 = aVar instanceof r.a.b;
        if (z12) {
            B1 b12 = ((r.a.b) aVar).f414119a;
            if (b12 instanceof E1) {
                str = "success";
            } else {
                if (!(b12 instanceof C1)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "failure";
            }
        } else {
            if (!(aVar instanceof r.a.C11799a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = PaymentStateKt.PAYMENT_STATE_CANCELED;
        }
        y.a aVar2 = new y.a("memory-consumption.leaks-analysis.result.".concat(str), 0L, 2, null);
        InterfaceC28373a interfaceC28373a = this.f175089a;
        interfaceC28373a.c(aVar2);
        if (z12) {
            B1 b13 = ((r.a.b) aVar).f414119a;
            long f438009e = b13.getF438021e() + b13.getF438020d();
            Object obj2 = null;
            interfaceC28373a.c(new y.c("memory-consumption.leaks-analysis.duration", Long.valueOf(f438009e), null));
            if (b13 instanceof E1) {
                ArrayList arrayList = new ArrayList();
                E1 e12 = (E1) b13;
                C43026i.b bVar = new C43026i.b(C43033p.A(new C42770s0(e12.f438023g), new C42770s0(e12.f438024h)));
                while (bVar.hasNext()) {
                    E2 e22 = (E2) bVar.next();
                    Iterator<T> it = e22.a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((LeakTrace) next).f438102d.f438120e == LeakTraceObject.LeakingStatus.f438125c) {
                                break;
                            }
                        } else {
                            next = obj2;
                            break;
                        }
                    }
                    LeakTrace leakTrace = (LeakTrace) next;
                    if (leakTrace != null) {
                        String str2 = leakTrace.f438102d.f438118c;
                        ArrayList<LeakTraceReference> arrayList2 = leakTrace.f438101c;
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                        for (LeakTraceReference leakTraceReference : arrayList2) {
                            StringBuilder sb2 = new StringBuilder();
                            String strSubstring = leakTraceReference.f438134d;
                            int iM2 = C43066x.M('.', 0, 6, strSubstring);
                            if (iM2 != -1) {
                                strSubstring = strSubstring.substring(iM2 + 1);
                            }
                            sb2.append(strSubstring);
                            sb2.append('.');
                            sb2.append(leakTraceReference.f438135e);
                            arrayList3.add(sb2.toString());
                        }
                        List listQ0 = C42745f0.q0(arrayList3);
                        Integer numC = e22.c();
                        int iIntValue = numC != null ? numC.intValue() : 0;
                        if (((LeakTrace) C42745f0.E(e22.a())).b() == null) {
                            obj = null;
                            numValueOf = null;
                        } else {
                            Iterator<T> it2 = e22.a().iterator();
                            int iIntValue2 = 0;
                            while (it2.hasNext()) {
                                Integer numB = ((LeakTrace) it2.next()).b();
                                if (numB == null) {
                                    L.k();
                                    throw null;
                                }
                                iIntValue2 += numB.intValue();
                            }
                            obj = null;
                            numValueOf = Integer.valueOf(iIntValue2);
                        }
                        arrayList.add(new a(str2, listQ0, f438009e, iIntValue, numValueOf != null ? numValueOf.intValue() : 0));
                        obj2 = obj;
                    }
                }
                interfaceC28373a.c(new y.a("memory-consumption.leaks-analysis.leaks-count", arrayList.size()));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    interfaceC28373a.c((a) it3.next());
                }
            }
        }
    }
}
