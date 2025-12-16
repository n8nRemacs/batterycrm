package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.L;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import l41.InterfaceC43543a;

/* compiled from: ConstructorConfigureSizeViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "sizeId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f300411b;

    public x(E e12) {
        this.f300411b = e12;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.conveyor_item.a aVar;
        T next;
        String str = (String) obj;
        E e12 = this.f300411b;
        List<? extends com.avito.conveyor_item.a> list = e12.f300373g0;
        if (list != null) {
            int i12 = 0;
            for (T t12 : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) t12;
                if ((aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.size.items.size.a) && L.f(((com.avito.android.tariff_lf_constructor.configure.size.items.size.a) aVar2).f300305c, str)) {
                    e12.f300363W.setValue(Integer.valueOf(i12));
                }
                i12 = i13;
            }
        }
        List<? extends com.avito.conveyor_item.a> list2 = e12.f300373g0;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                com.avito.conveyor_item.a aVar3 = (com.avito.conveyor_item.a) next;
                if (aVar3 instanceof com.avito.android.tariff_lf_constructor.configure.size.items.size.a) {
                    com.avito.android.tariff_lf_constructor.configure.size.items.size.a aVar4 = (com.avito.android.tariff_lf_constructor.configure.size.items.size.a) aVar3;
                    if (L.f(aVar4.f300305c, str) && aVar4.f300307e != null && aVar4.f300309g != null) {
                        break;
                    }
                }
            }
            aVar = (com.avito.conveyor_item.a) next;
        } else {
            aVar = null;
        }
        ScreenPerformanceTracker screenPerformanceTracker = e12.f300355O;
        if (aVar != null) {
            e12.f300374h0 = str;
            List<? extends com.avito.conveyor_item.a> list3 = e12.f300373g0;
            e12.f300373g0 = list3 != null ? C43033p.D(new o0(new C42770s0(list3), new B(e12, str))) : null;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            e12.f300360T.setValue(e12.f300373g0);
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
            return;
        }
        ScreenPerformanceTracker.a.b(screenPerformanceTracker, null, 3);
        e12.f300356P.dispose();
        B0 b0D0 = e12.f300352L.c(e12.f300349E, e12.f300350J, str).r0(P2.c.f318721a).N(r.f300402b).d0(s.f300403b).d0(new t(e12));
        u uVar = new u(e12, str);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        e12.f300356P = (AtomicReference) b0D0.J(interfaceC43543a, uVar).j0(e12.f300354N.e()).v0(new v(e12, str), new w(e12, str), interfaceC43543a);
    }
}
