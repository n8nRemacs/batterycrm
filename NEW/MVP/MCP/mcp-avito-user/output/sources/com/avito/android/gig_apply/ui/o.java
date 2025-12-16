package com.avito.android.gig_apply.ui;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigSlotIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/o;", "Lcom/avito/android/gig_apply/ui/n;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f160015a;

    @Inject
    public o(@Y61.k Context context) {
        this.f160015a = context;
    }

    @Override // com.avito.android.gig_apply.ui.n
    @Y61.k
    public final Intent a(@Y61.k GigSlotOpenParams gigSlotOpenParams) {
        return new Intent(this.f160015a, (Class<?>) GigSlotActivity.class).putExtra("open_params", gigSlotOpenParams);
    }
}
