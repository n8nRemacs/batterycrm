package com.avito.android.tariff_lf_constructor.configure.landing.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: ConstructorLandingHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/items/header/g;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f299694b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f299695c;

    public h(@k View view) {
        super(view);
        this.f299694b = (TextView) view.findViewById(R.id.title);
        this.f299695c = (SimpleDraweeView) view.findViewById(R.id.image);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.landing.items.header.g
    public final void l(@l Image image) {
        SimpleDraweeView simpleDraweeView = this.f299695c;
        if (image == null) {
            D6.w(simpleDraweeView);
            return;
        }
        C35949t5.c(this.f299695c, com.avito.android.image_loader.b.b(image), null, null, null, 14);
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.landing.items.header.g
    public final void setTitle(@k String str) {
        this.f299694b.setText(str);
    }
}
