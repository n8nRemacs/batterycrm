package com.avito.android.gig_slot_show_qr.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.gig_slot_show_qr.ui.models.GigSlotShowQrOpenParams;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigSlotShowQrBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/gig_slot_show_qr/mvi/i;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.b<i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_slot_show_qr.domain.a f160888a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigSlotShowQrOpenParams f160889b;

    @Inject
    public d(@Y61.k com.avito.android.gig_slot_show_qr.domain.a aVar, @Y61.k GigSlotShowQrOpenParams gigSlotShowQrOpenParams) {
        this.f160888a = aVar;
        this.f160889b = gigSlotShowQrOpenParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<i> a() throws NumberFormatException {
        GigSlotShowQrOpenParams gigSlotShowQrOpenParams = this.f160889b;
        return this.f160888a.a(Long.parseLong(gigSlotShowQrOpenParams.f160953b), gigSlotShowQrOpenParams.f160954c);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
