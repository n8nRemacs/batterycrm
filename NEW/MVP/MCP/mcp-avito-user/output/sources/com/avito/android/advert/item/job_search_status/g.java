package com.avito.android.advert.item.job_search_status;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import kotlin.Metadata;

/* compiled from: AdvertJobSearchStatusView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/job_search_status/g;", "Lcom/avito/android/advert/item/job_search_status/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DockingBadge f77226b;

    public g(@k View view) {
        super(view);
        this.f77226b = (DockingBadge) view;
    }

    @Override // com.avito.android.advert.item.job_search_status.f
    public final void Z4(@k String str) {
        this.f77226b.setText(str);
    }
}
