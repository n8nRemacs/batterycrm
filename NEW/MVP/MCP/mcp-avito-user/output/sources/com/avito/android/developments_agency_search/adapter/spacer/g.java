package com.avito.android.developments_agency_search.adapter.spacer;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SpacerItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/spacer/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/adapter/spacer/f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f136319b;

    public g(@k View view) {
        super(view);
        this.f136319b = view;
    }

    @Override // com.avito.android.developments_agency_search.adapter.spacer.f
    public final void yq(int i12) {
        this.f136319b.getLayoutParams().height = y6.b(i12);
    }
}
