package com.avito.android.vas_discount.ui.items.description;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.serp_core.timer.CountDownTimerWidget;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: DescriptionItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_discount/ui/items/description/e;", "Lcom/avito/android/vas_discount/ui/items/description/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f319737b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f319738c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CountDownTimerWidget f319739d;

    public e(@k View view) {
        super(view);
        this.f319737b = (TextView) view.findViewById(R.id.title);
        this.f319738c = (TextView) view.findViewById(R.id.description);
        this.f319739d = (CountDownTimerWidget) view.findViewById(R.id.timer_widget);
    }

    @Override // com.avito.android.vas_discount.ui.items.description.d
    public final void VP(long j12) {
        CountDownTimerWidget countDownTimerWidget = this.f319739d;
        D6.H(countDownTimerWidget);
        CountDownTimerWidget.d(countDownTimerWidget, j12);
    }

    @Override // com.avito.android.vas_discount.ui.items.description.d
    public final void bV() {
        D6.w(this.f319739d);
    }

    @Override // com.avito.android.vas_discount.ui.items.description.d
    public final void h(@k String str) {
        this.f319738c.setText(str);
    }

    @Override // com.avito.android.vas_discount.ui.items.description.d
    public final void setTitle(@k String str) {
        this.f319737b.setText(str);
    }
}
