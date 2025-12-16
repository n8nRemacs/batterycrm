package com.avito.android.serp.adapter.advert_xl;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertXlDimensionsProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/advert_xl/b;", "Lcom/avito/android/serp/adapter/advert_xl/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.advert_xl.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34682b implements InterfaceC34681a {

    /* renamed from: a, reason: collision with root package name */
    public final int f268824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f268825b;

    @Inject
    public C34682b(@Y61.k Resources resources) throws Resources.NotFoundException {
        float f12;
        float f13;
        int integer = resources.getInteger(R.integer.serp_columns);
        int i12 = Resources.getSystem().getDisplayMetrics().widthPixels;
        if (resources.getBoolean(R.bool.is_tablet)) {
            this.f268824a = (((i12 - (resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding) * 2)) / integer) * 2) - (resources.getDimensionPixelSize(R.dimen.list_serp_card_padding) * 2);
            this.f268825b = -1;
            return;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding) * 2;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.list_serp_card_padding) * 2;
        int i13 = ((i12 - dimensionPixelSize) / integer) - dimensionPixelSize2;
        int i14 = (i13 * 2) + dimensionPixelSize2;
        this.f268824a = -1;
        if (integer == 2) {
            f12 = i14;
            f13 = 1.5f;
        } else {
            f12 = i13;
            f13 = 1.25f;
        }
        this.f268825b = (int) (f12 / f13);
    }

    @Override // com.avito.android.serp.adapter.advert_xl.InterfaceC34681a
    /* renamed from: a, reason: from getter */
    public final int getF268824a() {
        return this.f268824a;
    }

    @Override // com.avito.android.serp.adapter.advert_xl.InterfaceC34681a
    /* renamed from: b, reason: from getter */
    public final int getF268825b() {
        return this.f268825b;
    }
}
