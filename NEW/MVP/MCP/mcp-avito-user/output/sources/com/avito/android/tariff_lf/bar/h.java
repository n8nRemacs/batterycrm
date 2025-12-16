package com.avito.android.tariff_lf.bar;

import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.mnz_common.ui.TariffCountBar;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.paid_services.routing.TariffCountStatus;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: BarItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/bar/h;", "Lcom/avito/android/tariff_lf/bar/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TariffCountBar f298736b;

    public h(@Y61.k View view) {
        super(view);
        this.f298736b = (TariffCountBar) view.findViewById(R.id.bar_view);
    }

    @Override // com.avito.android.tariff_lf.bar.g
    public final void PI(@Y61.k ProgressState progressState) {
        this.f298736b.setProgressState(progressState);
    }

    @Override // com.avito.android.tariff_lf.bar.g
    public final void j(@l String str) {
        TextView textView = this.f298736b.f197988c;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, str, false);
    }

    @Override // com.avito.android.tariff_lf.bar.g
    public final void n(@l String str) {
        TextView textView = this.f298736b.f197989d;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, str, false);
    }

    @Override // com.avito.android.tariff_lf.bar.g
    public final void n5(float f12) {
        this.f298736b.setProgress(f12);
    }

    @Override // com.avito.android.tariff_lf.bar.g
    public final void setTitle(@Y61.k String str) {
        this.f298736b.setTitle(str);
    }

    @Override // com.avito.android.tariff_lf.bar.g
    public final void uS(@Y61.k TariffCountStatus tariffCountStatus) {
        this.f298736b.setDescriptionStatus(tariffCountStatus);
    }
}
