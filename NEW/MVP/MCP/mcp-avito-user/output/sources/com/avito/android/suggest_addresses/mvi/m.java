package com.avito.android.suggest_addresses.mvi;

import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SuggestAddressesBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/m;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements com.avito.android.arch.mvi.b<SuggestAddressesInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SuggestAddressesParams f291949a;

    @Inject
    public m(@Y61.k SuggestAddressesParams suggestAddressesParams) {
        this.f291949a = suggestAddressesParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SuggestAddressesInternalAction> a() {
        return new C43210w(new SuggestAddressesInternalAction.AddChips(this.f291949a.f291890c));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
