package com.avito.android.gig_slot_show_qr.ui;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig_slot_show_qr.ui.models.GigSlotShowQrOpenParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigSlotShowQrIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/ui/g;", "Lcom/avito/android/gig_slot_show_qr/ui/f;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f160951a;

    @Inject
    public g(@k Context context) {
        this.f160951a = context;
    }

    @Override // com.avito.android.gig_slot_show_qr.ui.f
    @k
    public final Intent a(@k GigSlotShowQrOpenParams gigSlotShowQrOpenParams) {
        GigSlotShowQrCodeActivity.f160919n.getClass();
        return new Intent(this.f160951a, (Class<?>) GigSlotShowQrCodeActivity.class).putExtra("open_params", gigSlotShowQrOpenParams);
    }
}
