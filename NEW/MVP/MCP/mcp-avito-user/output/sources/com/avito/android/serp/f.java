package com.avito.android.serp;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: MultipleGridItemDimensionProviderImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/f;", "Lcom/avito/android/serp/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f273949a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273950b;

    public f(@Y61.k Resources resources) throws Resources.NotFoundException {
        float f12;
        float f13;
        int integer = resources.getInteger(R.integer.serp_columns);
        int i12 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding) * 2;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.list_serp_card_padding) * 2;
        int i13 = ((i12 - dimensionPixelSize) / integer) - dimensionPixelSize2;
        int i14 = (i13 * 2) + dimensionPixelSize2;
        this.f273949a = i14;
        if (integer == 2) {
            f12 = i14;
            f13 = 1.5f;
        } else {
            f12 = i13;
            f13 = 1.0f;
        }
        this.f273950b = (int) (f12 / f13);
    }

    @Override // com.avito.android.serp.e
    /* renamed from: a, reason: from getter */
    public final int getF273950b() {
        return this.f273950b;
    }

    @Override // com.avito.android.serp.e
    /* renamed from: b, reason: from getter */
    public final int getF273949a() {
        return this.f273949a;
    }
}
