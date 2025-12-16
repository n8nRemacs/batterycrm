package com.avito.android.mortgage.pre_approval.result.list.items.timer;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.pre_approval.result.list.items.timer.payloads.a;
import g00.C40508e;
import g00.InterfaceC40507d;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: TimerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/d;", "LTV0/f;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/f;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.f<f, c> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        c cVar = (c) aVar;
        fVar.jt(C40508e.a(cVar.f202076b));
        InterfaceC40507d interfaceC40507d = cVar.f202077c;
        fVar.n5(C40508e.a(interfaceC40507d) / 100.0f);
        int iB2 = kotlin.math.b.b(C40508e.b(interfaceC40507d));
        fVar.FG(com.avito.android.printable_text.b.c(R.string.mortgage_timer, Integer.valueOf(iB2 / 60), Integer.valueOf(iB2 % 60)));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        Iterable<com.avito.android.mortgage.pre_approval.result.list.items.timer.payloads.a> iterable = (List) (obj instanceof List ? obj : null);
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        for (com.avito.android.mortgage.pre_approval.result.list.items.timer.payloads.a aVar2 : iterable) {
            if (aVar2 instanceof a.C6001a) {
                fVar.n5(C40508e.a(r5.f202080a) / 100.0f);
                int iB2 = kotlin.math.b.b(C40508e.b(((a.C6001a) aVar2).f202080a));
                fVar.FG(com.avito.android.printable_text.b.c(R.string.mortgage_timer, Integer.valueOf(iB2 / 60), Integer.valueOf(iB2 % 60)));
            }
        }
    }
}
