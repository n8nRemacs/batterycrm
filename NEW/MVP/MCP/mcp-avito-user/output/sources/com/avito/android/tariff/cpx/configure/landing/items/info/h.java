package com.avito.android.tariff.cpx.configure.landing.items.info;

import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: CpxConfigureLandingInfoItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/configure/landing/items/info/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f296008b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f296009c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f296010d;

    public h(@k View view) {
        super(view);
        this.f296008b = (LinearLayout) view.findViewById(R.id.cpx_configure_landing_info_container);
        this.f296009c = (TextView) view.findViewById(R.id.cpx_configure_landing_info_text_icon);
        TextView textView = (TextView) view.findViewById(R.id.cpx_configure_landing_info_text);
        this.f296010d = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.info.g
    public final void Z(@k String str) {
        FV.a.a(FV.a.f4720a, this.f296009c, com.avito.android.lib.util.f.m(str));
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.info.g
    public final void c4(@k AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        j.c(this.f296010d, attributedText, aVar);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.info.g
    public final void jN() {
        D6.w(this.f296009c);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.info.g
    public final void v(@k UniversalColor universalColor) {
        Context context = this.itemView.getContext();
        C48063a.f437606a.getClass();
        this.f296008b.setBackgroundTintList(C48063a.e(context, universalColor));
    }
}
