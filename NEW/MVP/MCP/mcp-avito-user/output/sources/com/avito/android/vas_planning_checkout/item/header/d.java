package com.avito.android.vas_planning_checkout.item.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanningHeaderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/header/d;", "Lcom/avito/android/vas_planning_checkout/item/header/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f322971b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f322972c;

    public d(@k View view) {
        super(view);
        this.f322971b = (TextView) view.findViewById(R.id.title);
        this.f322972c = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.vas_planning_checkout.item.header.c
    public final void g(@l AttributedText attributedText) {
        j.a(this.f322972c, attributedText, null);
    }

    @Override // com.avito.android.vas_planning_checkout.item.header.c
    public final void setTitle(@k String str) {
        this.f322971b.setText(str);
    }
}
