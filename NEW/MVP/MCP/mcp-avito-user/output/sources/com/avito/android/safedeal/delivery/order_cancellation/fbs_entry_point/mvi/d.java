package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.entity.FbsEntryPointInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FbsEntryPointBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.b<FbsEntryPointInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ReasonRds f256344a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f256345b;

    @Inject
    public d(@k ReasonRds reasonRds, @Kn0.c @k String str) {
        this.f256344a = reasonRds;
        this.f256345b = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<FbsEntryPointInternalAction> a() {
        return C43175k.N(new C43210w(new FbsEntryPointInternalAction.ShowScreen(this.f256344a, this.f256345b)));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
