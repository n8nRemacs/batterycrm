package com.avito.android.publish.slots.advantage_banners.banner;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvantageBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/advantage_banners/banner/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/advantage_banners/banner/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f242995b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f242996c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f242997d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f242998e;

    public i(@k View view) {
        super(view);
        this.f242995b = (LinearLayout) view;
        View viewFindViewById = view.findViewById(R.id.advantage_banner_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f242996c = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advantage_banner_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242997d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advantage_banner_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242998e = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.publish.slots.advantage_banners.banner.h
    public final void A2(@l String str) {
        Integer numA;
        boolean zF2 = L.f(str, "rockets");
        LinearLayout linearLayout = this.f242995b;
        Drawable drawableU = zF2 ? D6.u(linearLayout, R.drawable.ic_rockets) : (str == null || (numA = q.a(str)) == null) ? null : C35835l0.h(numA.intValue(), linearLayout.getContext());
        if (drawableU == null) {
            return;
        }
        C35821j2.a(this.f242996c, drawableU);
    }

    @Override // com.avito.android.publish.slots.advantage_banners.banner.h
    public final void b(@l String str) {
        I5.a(this.f242997d, str, false);
    }

    @Override // com.avito.android.publish.slots.advantage_banners.banner.h
    public final void v0(@k String str) {
        I5.a(this.f242998e, str, false);
    }
}
