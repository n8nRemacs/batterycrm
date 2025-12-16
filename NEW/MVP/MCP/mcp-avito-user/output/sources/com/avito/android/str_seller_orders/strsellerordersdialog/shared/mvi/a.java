package com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi;

import Bz0.InterfaceC13208a;
import Dz0.InterfaceC13463a;
import Dz0.b;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yz0.InterfaceC50328b;

/* compiled from: SharedViewModelActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/shared/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LDz0/a;", "LDz0/b;", "LDz0/d;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13463a, Dz0.b, Dz0.d> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Dz0.b> b(InterfaceC13463a interfaceC13463a, Dz0.d dVar) {
        C43210w c43210w;
        InterfaceC13463a interfaceC13463a2 = interfaceC13463a;
        if (interfaceC13463a2 instanceof InterfaceC13463a.e) {
            return new C43210w(new b.c(InterfaceC13208a.c.C0082a.f1825a));
        }
        if (interfaceC13463a2 instanceof InterfaceC13463a.f) {
            InterfaceC13463a.f fVar = (InterfaceC13463a.f) interfaceC13463a2;
            c43210w = new C43210w(new b.c(new InterfaceC13208a.c.b(fVar.f3597a, fVar.f3598b)));
        } else if (interfaceC13463a2 instanceof InterfaceC13463a.c) {
            c43210w = new C43210w(new b.C0206b(new InterfaceC50328b.j(((InterfaceC13463a.c) interfaceC13463a2).f3594a)));
        } else if (interfaceC13463a2 instanceof InterfaceC13463a.b) {
            InterfaceC13463a.b bVar = (InterfaceC13463a.b) interfaceC13463a2;
            c43210w = new C43210w(new b.C0206b(new InterfaceC50328b.i(bVar.f3591a, bVar.f3592b, bVar.f3593c)));
        } else {
            if (interfaceC13463a2 instanceof InterfaceC13463a.C0205a) {
                return new C43210w(new b.C0206b(InterfaceC50328b.g.f443637a));
            }
            if (!(interfaceC13463a2 instanceof InterfaceC13463a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new b.d(((InterfaceC13463a.d) interfaceC13463a2).f3595a));
        }
        return c43210w;
    }
}
