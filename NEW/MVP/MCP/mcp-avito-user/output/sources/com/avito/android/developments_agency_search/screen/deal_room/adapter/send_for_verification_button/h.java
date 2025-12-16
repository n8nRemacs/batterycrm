package com.avito.android.developments_agency_search.screen.deal_room.adapter.send_for_verification_button;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SendForVerificationButtonItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/send_for_verification_button/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/send_for_verification_button/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f137460c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f137461b;

    public h(@k View view) {
        super(view);
        this.f137461b = (Button) view;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.send_for_verification_button.g
    public final void I(boolean z12) {
        this.f137461b.setEnabled(z12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.send_for_verification_button.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f137461b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(21, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f137461b.setOnClickListener(null);
    }
}
