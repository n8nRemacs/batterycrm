package com.avito.android.toggle_comparison_state;

import Vq.AbstractC15707a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.toggle_comparison_state.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChangeComparisonStateConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/c;", "Lcom/avito/android/toggle_comparison_state/b;", "<init>", "()V", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    public static o c(Vq.c cVar) {
        Vq.b alert = cVar.getAlert();
        a aVar = new a(alert.getButtonTitle(), alert.getTitle(), alert.getLink(), alert.getUrl());
        List<Vq.e> listB = cVar.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new q(((Vq.e) it.next()).getId()));
        }
        return new o(aVar, arrayList, cVar.getName());
    }

    @Override // com.avito.android.toggle_comparison_state.b
    @Y61.k
    public final s a(@Y61.k TypedResult<AbstractC15707a> typedResult, @Y61.k p pVar) {
        boolean z12 = typedResult instanceof TypedResult.Success;
        String str = pVar.f301625a;
        if (!z12) {
            if (typedResult instanceof TypedResult.Error) {
                return new s.c(pVar, new Throwable(((TypedResult.Error) typedResult).getError().getMessage()), str);
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC15707a abstractC15707a = (AbstractC15707a) ((TypedResult.Success) typedResult).getResult();
        if (abstractC15707a instanceof AbstractC15707a.b) {
            return new s.a(c(abstractC15707a.getComparison()), str);
        }
        if (abstractC15707a instanceof AbstractC15707a.C1200a) {
            return new s.b(c(abstractC15707a.getComparison()), str);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.toggle_comparison_state.b
    @Y61.k
    public final s b(@Y61.k TypedResult<Vq.d> typedResult, @Y61.k p pVar) {
        boolean z12 = typedResult instanceof TypedResult.Success;
        String str = pVar.f301625a;
        if (z12) {
            Vq.b alert = ((Vq.d) ((TypedResult.Success) typedResult).getResult()).getAlert();
            return new s.d(new a(alert.getButtonTitle(), alert.getTitle(), alert.getLink(), alert.getUrl()), str);
        }
        if (typedResult instanceof TypedResult.Error) {
            return new s.c(pVar, new Throwable(((TypedResult.Error) typedResult).getError().getMessage()), str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
