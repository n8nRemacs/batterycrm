package com.avito.android.sx_address.entry.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SxAddressEntryReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "LDA0/d;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<SxAddressEntryInternalAction, DA0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.entry.mvi.builder.a f292973b;

    @Inject
    public j(@Y61.k com.avito.android.sx_address.entry.mvi.builder.a aVar) {
        this.f292973b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final DA0.d a(SxAddressEntryInternalAction sxAddressEntryInternalAction, DA0.d dVar) {
        SxAddressEntryInternalAction sxAddressEntryInternalAction2 = sxAddressEntryInternalAction;
        DA0.d dVar2 = dVar;
        DA0.d dVarA = sxAddressEntryInternalAction2 instanceof SxAddressEntryInternalAction.LoadedList ? DA0.d.a(dVar2, ((SxAddressEntryInternalAction.LoadedList) sxAddressEntryInternalAction2).f292963b, false, false, null, 8) : sxAddressEntryInternalAction2 instanceof SxAddressEntryInternalAction.LoadingError ? DA0.d.a(dVar2, null, false, true, null, 9) : sxAddressEntryInternalAction2 instanceof SxAddressEntryInternalAction.ShowLoading ? DA0.d.a(dVar2, null, true, false, null, 8) : dVar2;
        return dVar2.equals(dVarA) ? dVarA : this.f292973b.a(dVarA);
    }
}
