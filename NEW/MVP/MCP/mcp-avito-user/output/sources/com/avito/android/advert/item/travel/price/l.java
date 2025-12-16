package com.avito.android.advert.item.travel.price;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsTravelPriceView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/travel/price/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/travel/price/k;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f80589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f80590c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f80591d;

    public l(@Y61.k View view) {
        super(view);
        this.f80589b = (TextView) view.findViewById(R.id.title);
        this.f80590c = (TextView) view.findViewById(R.id.subtitle);
        this.f80591d = (TextView) view.findViewById(R.id.previous_price);
    }

    public abstract void B80(@Y61.l String str);

    public abstract void C80();

    @Override // com.avito.android.advert.item.travel.price.k
    public final void LL(@Y61.l String str, @Y61.l String str2) {
        boolean z12 = str == null || C43066x.K(str);
        TextView textView = this.f80591d;
        if (!z12 && str2 != null && !C43066x.K(str2)) {
            I5.a(textView, str, false);
            B80(str2);
            return;
        }
        D6.w(textView);
        TextView textView2 = this.f80590c;
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        FlexboxLayout.LayoutParams layoutParams2 = null;
        FlexboxLayout.LayoutParams layoutParams3 = layoutParams instanceof FlexboxLayout.LayoutParams ? (FlexboxLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            layoutParams3.f348442k = true;
            layoutParams2 = layoutParams3;
        }
        if (layoutParams2 != null) {
            textView2.setLayoutParams(layoutParams2);
        }
        C80();
    }

    @Override // com.avito.android.advert.item.travel.price.k
    public final void b(@Y61.l String str) {
        I5.a(this.f80589b, str, false);
    }

    @Override // com.avito.android.advert.item.travel.price.k
    public final void j(@Y61.l String str) {
        I5.a(this.f80590c, str, false);
    }
}
