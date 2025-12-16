package com.avito.android.mortgage.root.list.items.status;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.payloads.y;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StatusPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/status/d;", "LTV0/f;", "Lcom/avito/android/mortgage/root/list/items/status/f;", "Lcom/avito/android/mortgage/root/list/items/status/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.f<f, c> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        c cVar = (c) aVar;
        fVar.l(cVar.f202833c);
        fVar.e(cVar.f202834d);
        fVar.k(cVar.f202835e);
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
        List<y> list2 = (List) (obj instanceof List ? obj : null);
        if (list2 != null) {
            for (y yVar : list2) {
                if (yVar instanceof y.a) {
                    fVar.l(((y.a) yVar).f202927a);
                } else if (yVar instanceof y.c) {
                    fVar.e(((y.c) yVar).f202929a);
                } else if (yVar instanceof y.b) {
                    fVar.k(((y.b) yVar).f202928a);
                }
            }
        }
    }
}
