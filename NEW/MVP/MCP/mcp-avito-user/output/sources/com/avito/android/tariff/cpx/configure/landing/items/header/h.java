package com.avito.android.tariff.cpx.configure.landing.items.header;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: CpxConfigureLandingHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/configure/landing/items/header/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f295996b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f295997c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f295998d;

    public h(@k View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.f295996b = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.description);
        this.f295997c = textView2;
        this.f295998d = (SimpleDraweeView) view.findViewById(R.id.image);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.header.g
    public final void O1(@k AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        j.a(this.f295996b, attributedText, aVar);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.header.g
    public final void de(@l AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        j.a(this.f295997c, attributedText, aVar);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.header.g
    public final void i(@k UniversalImage universalImage) {
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.itemView.getContext())));
        SimpleDraweeView simpleDraweeView = this.f295998d;
        C35949t5.c(simpleDraweeView, aVarB, null, null, null, 14);
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.header.g
    public final void p0() {
        D6.w(this.f295998d);
    }
}
