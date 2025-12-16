package com.avito.android.sx_address.entry.mvi;

import DA0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SxAddressEntryActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LDA0/b;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "LDA0/d;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<DA0.b, SxAddressEntryInternalAction, DA0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.entry.domain.c f292952a;

    @Inject
    public a(@Y61.k com.avito.android.sx_address.entry.domain.c cVar) {
        this.f292952a = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SxAddressEntryInternalAction> b(DA0.b bVar, DA0.d dVar) {
        DA0.b bVar2 = bVar;
        DA0.d dVar2 = dVar;
        if (bVar2 instanceof b.a) {
            return new C43210w(SxAddressEntryInternalAction.a.f292966b);
        }
        if (bVar2 instanceof b.C0158b) {
            return new C43210w(new SxAddressEntryInternalAction.b(((b.C0158b) bVar2).f3083a));
        }
        if (bVar2 instanceof b.c) {
            return !dVar2.f3090c ? this.f292952a.a() : C43175k.w();
        }
        throw new NoWhenBranchMatchedException();
    }
}
