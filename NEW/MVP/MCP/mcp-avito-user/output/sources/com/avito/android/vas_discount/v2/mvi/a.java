package com.avito.android.vas_discount.v2.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qL0.InterfaceC47317a;

/* compiled from: VasDiscountV2Actor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LqL0/a;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "LqL0/c;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC47317a, VasDiscountV2InternalAction, qL0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f319799a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_discount.v2.domain.a f319800b;

    @Inject
    public a(@com.avito.android.vas_discount.di.c @Y61.k String str, @Y61.k com.avito.android.vas_discount.v2.domain.a aVar) {
        this.f319799a = str;
        this.f319800b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<VasDiscountV2InternalAction> b(InterfaceC47317a interfaceC47317a, qL0.c cVar) {
        InterfaceC47317a interfaceC47317a2 = interfaceC47317a;
        if (interfaceC47317a2 instanceof InterfaceC47317a.b) {
            return new C43210w(new VasDiscountV2InternalAction.NavigateToDeepLink(((InterfaceC47317a.b) interfaceC47317a2).f429195a));
        }
        if (interfaceC47317a2 instanceof InterfaceC47317a.C12321a) {
            return new C43210w(new VasDiscountV2InternalAction.NavigateToDeepLink(((InterfaceC47317a.C12321a) interfaceC47317a2).f429194a));
        }
        if (interfaceC47317a2 instanceof InterfaceC47317a.c) {
            return new C43210w(VasDiscountV2InternalAction.CloseDialog.f319812b);
        }
        if (interfaceC47317a2 instanceof InterfaceC47317a.d) {
            return this.f319800b.a(this.f319799a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
