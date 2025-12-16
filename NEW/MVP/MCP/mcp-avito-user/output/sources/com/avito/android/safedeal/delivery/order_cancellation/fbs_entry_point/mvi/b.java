package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi;

import Gn0.InterfaceC13900a;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.entity.FbsEntryPointInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FbsEntryPointActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LGn0/a;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction;", "LGn0/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC13900a, FbsEntryPointInternalAction, Gn0.c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f256338a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ReasonRds f256339b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f256340c;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k ReasonRds reasonRds, @Kn0.c @k String str) {
        this.f256338a = interfaceC28373a;
        this.f256339b = reasonRds;
        this.f256340c = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FbsEntryPointInternalAction> b(InterfaceC13900a interfaceC13900a, Gn0.c cVar) {
        InterfaceC13900a interfaceC13900a2 = interfaceC13900a;
        if (interfaceC13900a2 instanceof InterfaceC13900a.C0369a) {
            return new C43210w(FbsEntryPointInternalAction.CloseScreen.f256348b);
        }
        if (interfaceC13900a2 instanceof InterfaceC13900a.b) {
            return C43175k.G(new a(this, interfaceC13900a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
