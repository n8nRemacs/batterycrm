package com.avito.android.service_booking.mvi.step;

import Hs0.InterfaceC14030a;
import com.avito.android.service_booking.mvi.step.ServiceBookingMviStepFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import qt0.C47440d;

/* compiled from: ServiceBookingMviStepRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqt0/d$a;", "it", "Lkotlin/G0;", "invoke", "(Lqt0/d$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.service_booking.mvi.step.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34919m extends kotlin.jvm.internal.N implements Y41.l<C47440d.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34912f f274652l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14030a, G0> f274653m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C34919m(C34912f c34912f, Y41.l<? super InterfaceC14030a, G0> lVar) {
        super(1);
        this.f274652l = c34912f;
        this.f274653m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(C47440d.a aVar) {
        C47440d.a aVar2 = aVar;
        LinkedHashMap linkedHashMapC = com.avito.android.service_booking.mvi.domain.d.c(this.f274652l.f274643e);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMapC.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList2.add(new kotlin.Q("params[" + str + "][" + i12 + ']', (String) obj));
                i12 = i13;
            }
            C42745f0.h(arrayList2, arrayList);
        }
        ((ServiceBookingMviStepFragment.e) this.f274653m).invoke(new InterfaceC14030a.r(aVar2, P0.p(arrayList)));
        return G0.f406611a;
    }
}
