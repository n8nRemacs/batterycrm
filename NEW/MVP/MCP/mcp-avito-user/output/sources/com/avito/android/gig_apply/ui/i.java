package com.avito.android.gig_apply.ui;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigApplyIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/i;", "Lcom/avito/android/gig_apply/ui/h;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f160013a;

    @Inject
    public i(@Y61.k Context context) {
        this.f160013a = context;
    }

    @Override // com.avito.android.gig_apply.ui.h
    @Y61.k
    public final Intent a(@Y61.k GigApplyOpenParams gigApplyOpenParams) {
        return new Intent(this.f160013a, (Class<?>) GigApplyActivity.class).putExtra("open_params", gigApplyOpenParams);
    }
}
