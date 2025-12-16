package com.avito.android.publish.slots.user_verification.banner;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: UserVerificationBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/user_verification/banner/g;", "Lcom/avito/android/publish/slots/user_verification/banner/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f245096b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RelativeLayout f245097c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f245098d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f245099e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f245100f;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f245096b = aVar;
        RelativeLayout relativeLayout = (RelativeLayout) view;
        this.f245097c = relativeLayout;
        View viewFindViewById = relativeLayout.findViewById(R.id.user_verification_banner_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245098d = (TextView) viewFindViewById;
        View viewFindViewById2 = relativeLayout.findViewById(R.id.user_verification_banner_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245099e = (TextView) viewFindViewById2;
        View viewFindViewById3 = relativeLayout.findViewById(R.id.user_verification_banner_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f245100f = (ImageView) viewFindViewById3;
    }

    @Override // com.avito.android.publish.slots.user_verification.banner.f
    public final void R(@l AttributedText attributedText) {
        j.a(this.f245099e, attributedText, this.f245096b);
    }

    @Override // com.avito.android.publish.slots.user_verification.banner.f
    public final void rc(@l String str, @l String str2) {
        Integer numA;
        Integer numA2;
        if (str == null || (numA = q.a(str)) == null) {
            return;
        }
        C35821j2.a(this.f245100f, C35835l0.m(this.f245097c.getContext(), numA.intValue(), (str2 == null || (numA2 = com.avito.android.lib.util.e.a(str2)) == null) ? R.attr.black : numA2.intValue()));
    }

    @Override // com.avito.android.publish.slots.user_verification.banner.f
    public final void v(@l UniversalColor universalColor) {
        RelativeLayout relativeLayout = this.f245097c;
        Integer numValueOf = universalColor != null ? Integer.valueOf(C48063a.f437606a.a(relativeLayout.getContext(), universalColor)) : null;
        relativeLayout.setBackgroundTintList(numValueOf != null ? ColorStateList.valueOf(numValueOf.intValue()) : null);
    }

    @Override // com.avito.android.publish.slots.user_verification.banner.f
    public final void w(@l AttributedText attributedText) {
        j.a(this.f245098d, attributedText, this.f245096b);
    }
}
