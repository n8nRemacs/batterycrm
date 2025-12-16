package com.avito.android.advert_core.advert;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsFlatOneColumnView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/e;", "Lcom/avito/android/advert_core/advert/g;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends g {

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final k f82664h;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(View view, int i12, k kVar, boolean z12, int i13, C42822w c42822w) {
        i12 = (i13 & 2) != 0 ? R.id.flat_container : i12;
        kVar = (i13 & 4) != 0 ? null : kVar;
        super(view, i12, kVar, (i13 & 8) != 0 ? false : z12);
        this.f82664h = kVar;
    }

    @Override // com.avito.android.advert_core.advert.g
    public final int d() {
        return R.attr.ic_help20;
    }

    @Override // com.avito.android.advert_core.advert.g
    public final int e() {
        return R.attr.gray36;
    }

    @Override // com.avito.android.advert_core.advert.g
    public final int g() {
        return R.layout.key_value_restyle;
    }
}
