package com.avito.android.serp.adapter.alert_banner;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.alert_banner.AlertBanner;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AlertBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/alert_banner/m;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f268922c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AlertBanner f268923b;

    public m(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.alert_banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.alert_banner.AlertBanner");
        }
        this.f268923b = (AlertBanner) viewFindViewById;
    }

    public final Button B80() {
        View contentView = this.f268923b.getContentView();
        if (contentView == null) {
            return null;
        }
        View viewFindViewById = contentView.findViewById(R.id.button);
        if (viewFindViewById != null) {
            return (Button) viewFindViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
    }
}
