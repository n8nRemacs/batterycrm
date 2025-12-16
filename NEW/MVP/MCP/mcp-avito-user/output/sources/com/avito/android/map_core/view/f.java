package com.avito.android.map_core.view;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: MapViewPortProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/f;", "Lcom/avito/android/map_core/view/e;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final View f185721a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f185722b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public View f185723c;

    public f(@l View view, @k Resources resources) {
        this.f185721a = view;
        this.f185722b = resources;
    }

    @Override // com.avito.android.map_core.view.e
    @k
    public final Q<Integer, Integer> a() {
        DisplayMetrics displayMetrics = this.f185722b.getDisplayMetrics();
        if (this.f185723c == null) {
            this.f185723c = this.f185721a;
        }
        View view = this.f185723c;
        int width = view != null ? view.getWidth() : 0;
        View view2 = this.f185723c;
        int height = view2 != null ? view2.getHeight() : 0;
        if (width == 0 || height == 0) {
            width = displayMetrics.widthPixels;
            height = displayMetrics.heightPixels;
        }
        float f12 = displayMetrics.density;
        if (f12 < 1.0f) {
            f12 = 1.0f;
        }
        return new Q<>(Integer.valueOf((int) (width / f12)), Integer.valueOf((int) (height / f12)));
    }

    @Override // com.avito.android.map_core.view.e
    public final int b(int i12) {
        int dimension;
        int iIntValue = a().f406619b.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        int i13 = iIntValue / 2;
        Resources resources = this.f185722b;
        if (i12 == 1 && (dimension = (int) (resources.getDimension(R.dimen.search_map_pin_adverts_card_height) / resources.getDisplayMetrics().density)) <= i13) {
            i13 = dimension;
        }
        int dimension2 = (int) (resources.getDimension(R.dimen.search_map_search_bar_with_padding_height) / resources.getDisplayMetrics().density);
        return (((iIntValue - dimension2) - i13) / 2) + dimension2;
    }
}
