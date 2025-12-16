package com.avito.android.shift_list.mvi;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ShiftListBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shift_list/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "LVv0/b;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements com.avito.android.arch.mvi.b<Vv0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.shift_list.domain.a f281067a;

    @Inject
    public i(@Y61.k com.avito.android.shift_list.domain.a aVar) {
        this.f281067a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Vv0.b> a() {
        return this.f281067a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
