package com.avito.android.advert_details_items.buyer_bonuses;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BuyerBonusesInfoDialogView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/buyer_bonuses/b;", "Lcom/avito/android/advert_details_items/buyer_bonuses/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f84478a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final TextView f84479b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f84480c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f84481d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ImageView f84482e;

    public b(@k View view) {
        this.f84478a = view.getContext();
        this.f84479b = (TextView) view.findViewById(R.id.buyer_bonuses_info_amount);
        this.f84480c = (TextView) view.findViewById(R.id.buyer_bonuses_info_description);
        this.f84481d = (TextView) view.findViewById(R.id.buyer_bonuses_info_text);
        this.f84482e = (ImageView) view.findViewById(R.id.buyer_bonuses_info_icon);
    }
}
