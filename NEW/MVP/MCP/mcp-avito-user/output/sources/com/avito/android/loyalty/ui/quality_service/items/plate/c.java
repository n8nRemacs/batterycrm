package com.avito.android.loyalty.ui.quality_service.items.plate;

import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.w;
import com.avito.android.loyalty.ui.quality_service.items.plate.e;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PlateItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/plate/c;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/quality_service/items/plate/e;", "Lcom/avito/android/loyalty/ui/quality_service/items/plate/PlateItem;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements TV0.d<e, PlateItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f183935b;

    @Inject
    public c(@k w wVar) {
        this.f183935b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        e eVar2 = (e) eVar;
        PlateItem plateItem = (PlateItem) aVar;
        AttributedText attributedText = plateItem.f183930f;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(this.f183935b);
        }
        View view = eVar2.f183937b;
        Context context = view.getContext();
        int i14 = e.b.f183940a[plateItem.f183929e.ordinal()];
        if (i14 == 1) {
            i13 = R.color.common_green_50;
        } else if (i14 == 2) {
            i13 = R.color.common_red_50;
        } else if (i14 == 3) {
            i13 = R.color.common_orange_50;
        } else {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.color.common_gray_4;
        }
        view.setBackgroundTintList(androidx.core.content.d.getColorStateList(context, i13));
        eVar2.f183938c.setText(plateItem.f183928d);
        j.a(eVar2.f183939d, attributedText, null);
        Integer num = plateItem.f183927c;
        D6.c(eVar2.f183937b, null, null, null, Integer.valueOf(y6.b(num != null ? num.intValue() : 8)), 7);
    }
}
