package com.avito.android.advert.cpo_program;

import A91.p;
import Y61.k;
import android.net.Uri;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import com.avito.android.remote.model.autotekateaser.CpoIcon;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaCpoProgramView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/cpo_program/e;", "Lcom/avito/android/advert/cpo_program/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f68872a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Toolbar f68873b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f68874c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f68875d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f68876e;

    public e(@k Y41.a aVar, @k View view) {
        this.f68872a = aVar;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f68873b = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.logo);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f68874c = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f68875d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f68876e = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.advert.cpo_program.d
    public final void a(@k CpoDescription cpoDescription) {
        Uri url = cpoDescription.getLogo().getUrl();
        CpoIcon icon = cpoDescription.getIcon();
        SimpleDraweeView simpleDraweeView = this.f68874c;
        if (icon != null) {
            int iCeil = (int) Math.ceil(simpleDraweeView.getResources().getDisplayMetrics().density);
            url = iCeil != 1 ? iCeil != 2 ? iCeil != 3 ? icon.getX4ScaledLogo() : icon.getX3ScaledLogo() : icon.getX2ScaledLogo() : icon.getX1ScaledLogo();
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(url);
        aVarA.c();
        this.f68875d.setText(cpoDescription.getTitle());
        this.f68876e.setText(Html.fromHtml(cpoDescription.getContent(), 0));
        this.f68873b.setNavigationOnClickListener(new p(this, 28));
    }
}
