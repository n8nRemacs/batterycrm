package com.avito.android.vas_planning.item.title;

import Y61.k;
import android.widget.TextView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.vas_planning.model.VasPlanningItem;
import kotlin.Metadata;

/* compiled from: VasPlanningTitleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/item/title/g;", "Lcom/avito/android/vas_planning/item/title/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f322408b;

    public g(@k TextView textView) {
        super(textView);
        this.f322408b = textView;
    }

    @Override // com.avito.android.vas_planning.item.title.f
    public final void Yj(@k VasPlanningItem.VasPlanningTitle vasPlanningTitle) {
        String str = vasPlanningTitle.f322444e;
        TextView textView = this.f322408b;
        I5.a(textView, str, false);
        textView.setTextAppearance(C35835l0.j(vasPlanningTitle.f322443d, textView.getContext()));
    }
}
