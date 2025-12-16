package com.avito.android.travel_payment_selector.view.items.description;

import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.tooltip.k;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DescriptionView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/view/items/description/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f302750e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final DescriptionParameterItem f302751b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f302752c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public k f302753d;

    public i(@Y61.k View view) {
        super(view);
        this.f302751b = (DescriptionParameterItem) view.findViewById(R.id.description);
        this.f302752c = (LinearLayout) view.findViewById(R.id.inner_items_container);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        k kVar = this.f302753d;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f302753d = null;
    }
}
