package com.avito.android.safedeal.delivery.order_cancellation.details.mvi;

import Dn0.InterfaceC13421a;
import JO.m;
import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.Option;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.details.mvi.entity.ReasonDetailsInternalAction;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReasonDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LDn0/a;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "LDn0/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13421a, ReasonDetailsInternalAction, Dn0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ReasonRds f256235a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.delivery.order_cancellation.details.usecase.a f256236b;

    @Inject
    public a(@Y61.k ReasonRds reasonRds, @Y61.k com.avito.android.safedeal.delivery.order_cancellation.details.usecase.a aVar) {
        this.f256235a = reasonRds;
        this.f256236b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ReasonDetailsInternalAction> b(InterfaceC13421a interfaceC13421a, Dn0.c cVar) {
        InterfaceC13421a interfaceC13421a2 = interfaceC13421a;
        Dn0.c cVar2 = cVar;
        Option option = null;
        Object obj = null;
        if (interfaceC13421a2 instanceof InterfaceC13421a.b) {
            CharSequence charSequence = ((InterfaceC13421a.b) interfaceC13421a2).f3439a;
            return new C43210w(new ReasonDetailsInternalAction.CommentTextChanged(charSequence != null ? charSequence.toString() : null));
        }
        if (!(interfaceC13421a2 instanceof InterfaceC13421a.c)) {
            if (interfaceC13421a2 instanceof InterfaceC13421a.C0191a) {
                return this.f256236b.a(cVar2);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC13421a.c cVar3 = (InterfaceC13421a.c) interfaceC13421a2;
        List<Option> options = this.f256235a.getOptions();
        if (options != null) {
            Iterator<T> it = options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Option option2 = (Option) next;
                m mVar = cVar3.f3440a.f117212h;
                if (L.f(mVar != null ? mVar.f8961b : null, option2.getId())) {
                    obj = next;
                    break;
                }
            }
            option = (Option) obj;
        }
        return new C43210w(new ReasonDetailsInternalAction.SelectedOptionChanged(option));
    }
}
