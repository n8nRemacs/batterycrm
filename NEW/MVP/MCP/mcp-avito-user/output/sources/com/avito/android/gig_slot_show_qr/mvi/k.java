package com.avito.android.gig_slot_show_qr.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_slot_show_qr.mvi.i;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigSlotShowQrOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/gig_slot_show_qr/mvi/i;", "Lcom/avito/android/gig_slot_show_qr/mvi/j;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements t<i, j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f160908b;

    @Inject
    public k(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f160908b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final j b(i iVar) {
        i iVar2 = iVar;
        if (iVar2 instanceof i.d) {
            b.a.a(this.f160908b, ((i.d) iVar2).f160907a, null, null, 6);
        }
        return null;
    }
}
