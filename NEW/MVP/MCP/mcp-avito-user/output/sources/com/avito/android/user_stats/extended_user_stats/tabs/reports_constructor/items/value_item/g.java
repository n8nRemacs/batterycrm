package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item;

import Y41.l;
import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import m.C43852a;

/* compiled from: ValueItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/value_item/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/value_item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f318120e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f318121b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f318122c;

    /* renamed from: d, reason: collision with root package name */
    public final DescriptionParameterItem f318123d;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f318121b = view;
        this.f318122c = aVar;
        this.f318123d = (DescriptionParameterItem) view.findViewById(R.id.dotted_text_value_item);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item.f
    public final void xx(@k ValueItemData valueItemData, @k l<? super RJ0.a, G0> lVar) {
        Drawable drawableA;
        DescriptionParameterItem descriptionParameterItem = this.f318123d;
        I5.a(descriptionParameterItem.getLeftTextView(), this.f318122c.c(descriptionParameterItem.getContext(), valueItemData.f318109c), false);
        I5.a(descriptionParameterItem.getRightTextView(), valueItemData.f318110d, false);
        if (valueItemData.f318111e != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new com.avito.android.tariff.cpx.configure.levels.d(22, lVar, valueItemData));
            drawableA = C43852a.a(descriptionParameterItem.getContext(), C35835l0.j(R.attr.ic_help16, descriptionParameterItem.getContext()));
        } else {
            drawableA = null;
        }
        descriptionParameterItem.setLeftTextIconDrawable(drawableA);
    }
}
