package com.avito.android.gig_shift_cancel.mvi;

import com.avito.android.gig_shift_cancel.ui.GigShiftCancelOpenParams;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigShiftCancelBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/l;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements com.avito.android.arch.mvi.b<q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_shift_cancel.domain.a f160654a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigShiftCancelOpenParams f160655b;

    @Inject
    public l(@Y61.k com.avito.android.gig_shift_cancel.domain.a aVar, @Y61.k GigShiftCancelOpenParams gigShiftCancelOpenParams) {
        this.f160654a = aVar;
        this.f160655b = gigShiftCancelOpenParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<q> a() {
        return this.f160654a.b(this.f160655b.f160729b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
