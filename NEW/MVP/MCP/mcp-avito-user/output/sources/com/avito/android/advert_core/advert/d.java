package com.avito.android.advert_core.advert;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsFlatOneColumnView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/d;", "Lcom/avito/android/advert_core/advert/g;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends g {
    public d(View view, int i12, k kVar, boolean z12, int i13, C42822w c42822w) {
        super(view, (i13 & 2) != 0 ? R.id.flat_container : i12, (i13 & 4) != 0 ? null : kVar, (i13 & 8) != 0 ? false : z12);
    }

    @Override // com.avito.android.advert_core.advert.g
    public final int d() {
        return R.attr.ic_help20;
    }

    @Override // com.avito.android.advert_core.advert.g
    public final int e() {
        return R.attr.text_secondary;
    }

    @Override // com.avito.android.advert_core.advert.g
    public final int f() {
        return R.attr.text_secondary;
    }

    @Override // com.avito.android.advert_core.advert.g
    public final int g() {
        return R.layout.advert_core_key_value_re23;
    }
}
