package com.avito.android.publish.items.alert_banner;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.alert_banner.AlertBanner;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AlertBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/alert_banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/alert_banner/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f236757c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AlertBanner f236758b;

    @Inject
    public h(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.alert_banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.alert_banner.AlertBanner");
        }
        this.f236758b = (AlertBanner) viewFindViewById;
    }

    @Override // com.avito.android.publish.items.alert_banner.g
    public final void X4(int i12) {
        AlertBanner.h(this.f236758b, i12);
    }

    @Override // com.avito.android.publish.items.alert_banner.g
    public final void b(@Y61.l String str) {
        this.f236758b.getContent().c(str);
    }

    @Override // com.avito.android.publish.items.alert_banner.g
    public final void c(@Y61.l Y41.a<G0> aVar) {
        AlertBanner alertBanner = this.f236758b;
        if (aVar == null) {
            alertBanner.setEnabled(false);
            alertBanner.setOnClickListener(null);
        } else {
            alertBanner.setEnabled(true);
            alertBanner.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(12, aVar));
        }
    }

    @Override // com.avito.android.publish.items.alert_banner.g
    public final void cL(@Y61.l Integer num) {
        AlertBanner alertBanner = this.f236758b;
        if (num == null) {
            alertBanner.getContent().b(null);
        } else {
            alertBanner.getContent().b(alertBanner.getContext().getDrawable(num.intValue()));
        }
    }

    @Override // com.avito.android.publish.items.alert_banner.g
    public final void x3(@Y61.l String str) {
        this.f236758b.getContent().a(str);
    }
}
