package com.avito.android.shift_list.mvi;

import Vv0.AbstractC15720a;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ShiftListActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/shift_list/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LVv0/a;", "LVv0/b;", "LVv0/d;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements com.avito.android.arch.mvi.a<AbstractC15720a, Vv0.b, Vv0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f281063a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.shift_list.domain.a f281064b;

    @Inject
    public g(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.shift_list.domain.a aVar2) {
        this.f281063a = aVar;
        this.f281064b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Vv0.b> b(AbstractC15720a abstractC15720a, Vv0.d dVar) {
        AbstractC15720a abstractC15720a2 = abstractC15720a;
        Vv0.d dVar2 = dVar;
        if (abstractC15720a2 instanceof AbstractC15720a.b) {
            return C43175k.G(new c(2, null));
        }
        if (abstractC15720a2 instanceof AbstractC15720a.d) {
            return C43175k.G(new d(this, null));
        }
        if (abstractC15720a2 instanceof AbstractC15720a.C1212a) {
            return C43175k.G(new e(this, abstractC15720a2, null));
        }
        if (abstractC15720a2 instanceof AbstractC15720a.c) {
            return C43175k.G(new f(this, dVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
