package com.avito.android.advert_stats.detail.tab.items.titile;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TitleItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/titile/g;", "Lcom/avito/android/advert_stats/detail/tab/items/titile/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f86462b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f86463c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f86464d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f86465e;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f86462b = view;
        this.f86463c = aVar;
        this.f86464d = (TextView) view.findViewById(R.id.tv_title_item);
        this.f86465e = (TextView) view.findViewById(R.id.tv_title_price_item);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.titile.f
    public final void AW(@k TitleItem titleItem) {
        com.avito.android.util.text.a aVar = this.f86463c;
        TextView textView = this.f86464d;
        String str = titleItem.f86451c;
        if (str != null) {
            textView.setText(str);
        } else {
            AttributedText attributedText = titleItem.f86453e;
            if (attributedText == null) {
                textView.setText("");
            } else {
                j.c(textView, attributedText, aVar);
            }
        }
        int i12 = 0;
        String str2 = titleItem.f86452d;
        boolean z12 = str2 == null || C43066x.K(str2);
        AttributedText attributedText2 = titleItem.f86454f;
        if (z12 && attributedText2 == null) {
            i12 = 8;
        }
        TextView textView2 = this.f86465e;
        textView2.setVisibility(i12);
        if (attributedText2 != null) {
            j.c(textView2, attributedText2, aVar);
        } else {
            textView2.setText(str2);
        }
    }
}
