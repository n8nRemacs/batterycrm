package com.avito.android.advert.item.fair_price.dialog;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FairPriceDialogViewFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fair_price/dialog/b;", "Lcom/avito/android/advert/item/fair_price/dialog/a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f75381a = y6.b(24);

    /* renamed from: b, reason: collision with root package name */
    public final int f75382b = y6.b(8);

    /* renamed from: c, reason: collision with root package name */
    public final int f75383c = y6.b(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f75384d = y6.b(24);

    /* renamed from: e, reason: collision with root package name */
    public final int f75385e = y6.b(0);

    /* renamed from: f, reason: collision with root package name */
    public final int f75386f = y6.b(8);

    @Inject
    public b() {
    }

    @Override // com.avito.android.advert.item.fair_price.dialog.a
    @k
    public final LinearLayout a(@k Context context, @k AdvertFairPriceModel.Explanation explanation, @k l lVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        boolean z12 = true;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i12 = this.f75381a;
        linearLayout.setPadding(i12, this.f75382b, i12, this.f75383c);
        List<String> list = explanation.f75406c;
        Iterator<T> it = list.iterator();
        int i13 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            int i14 = this.f75385e;
            if (!zHasNext) {
                Button button = new Button(linearLayout.getContext(), null, 0, 0, 14, null);
                AdvertFairPriceModel.Explanation.ActionButton actionButton = explanation.f75405b;
                button.setAppearanceFromAttr(actionButton.f75408b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(i14, this.f75384d, i14, i14);
                button.setLayoutParams(layoutParams);
                button.setText(actionButton.f75409c);
                button.setOnClickListener(new com.avito.android.advert.closed.b(24, lVar, actionButton));
                linearLayout.addView(button);
                return linearLayout;
            }
            Object next = it.next();
            int i15 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str = (String) next;
            Context context2 = linearLayout.getContext();
            boolean z13 = i13 == C42745f0.J(list) ? z12 : false;
            com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context2, null, 0, 0, 14, null);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (!z13) {
                layoutParams2.setMargins(i14, i14, i14, this.f75386f);
            }
            aVar.setLayoutParams(layoutParams2);
            aVar.setTextAppearance(C35835l0.j(R.attr.textM2, aVar.getContext()));
            aVar.setText(str);
            linearLayout.addView(aVar);
            i13 = i15;
            z12 = true;
        }
    }
}
