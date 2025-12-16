package com.avito.android.advert_details_items.neighboring_dates.items.date;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_collection.adapter.order.h;
import com.avito.android.advert_details_items.neighboring_dates.items.NeighboringDatesItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NeighboringDatesChipView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/items/date/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/neighboring_dates/items/date/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f84946d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84947b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f84948c;

    /* compiled from: NeighboringDatesChipView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84949a;

        static {
            int[] iArr = new int[NeighboringDatesItem.NeighboringDatesChipItem.ChipType.values().length];
            try {
                NeighboringDatesItem.NeighboringDatesChipItem.ChipType chipType = NeighboringDatesItem.NeighboringDatesChipItem.ChipType.f84929b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f84949a = iArr;
        }
    }

    public g(@k View view) {
        super(view);
        this.f84947b = view;
        this.f84948c = (TextView) view;
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.items.date.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f84947b.setOnClickListener(new h(18, aVar));
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.items.date.f
    public final void r(@k AttributedText attributedText) {
        j.a(this.f84948c, attributedText, null);
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.items.date.f
    public final void yf(@k NeighboringDatesItem.NeighboringDatesChipItem.ChipType chipType) {
        this.f84947b.setBackgroundResource(a.f84949a[chipType.ordinal()] == 1 ? R.drawable.advert_details_items_bg_neighboring_dates_chip_date_selected : R.drawable.advert_details_items_bg_neighboring_dates_chip_date_default);
    }
}
