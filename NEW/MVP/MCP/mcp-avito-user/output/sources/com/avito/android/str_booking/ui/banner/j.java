package com.avito.android.str_booking.ui.banner;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import Y41.r;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_booking.network.models.sections.BannerContent;
import com.avito.android.util.I5;
import java.util.Map;
import kotlin.Function4;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: StrBookingBannerView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/banner/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/banner/i;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f285932b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f285933c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Banner f285934d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f285935e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f285936f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f285937g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f285938h;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f285932b = view;
        this.f285933c = aVar;
        View viewFindViewById = view.findViewById(R.id.str_booking_banner_section);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f285934d = (Banner) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.str_booking_banner_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f285935e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.str_booking_banner_content);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f285936f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.str_booking_banner_buttons_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f285937g = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.str_booking_banner_footer);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f285938h = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.str_booking.ui.banner.i
    public final void CW(@k c cVar) {
        UniversalColor color;
        BannerContent bannerContent = cVar.f285926b;
        if (bannerContent == null || (color = bannerContent.getColor()) == null) {
            return;
        }
        Context context = this.f285932b.getContext();
        C48063a.f437606a.getClass();
        Banner.h(this.f285934d, C48063a.e(context, color));
    }

    @Override // com.avito.android.str_booking.ui.banner.i
    public final void Ru(@l BannerContent bannerContent, @k r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        AttributedText footer;
        AttributedText description;
        AttributedText attributedTextA = null;
        I5.a(this.f285935e, bannerContent != null ? bannerContent.getHeader() : null, false);
        AttributedText attributedTextA2 = (bannerContent == null || (description = bannerContent.getDescription()) == null) ? null : kotlin.c.a(description);
        TextView textView = this.f285936f;
        com.avito.android.util.text.a aVar = this.f285933c;
        kotlin.c.c(textView, attributedTextA2, rVar, aVar);
        if (bannerContent != null && (footer = bannerContent.getFooter()) != null) {
            attributedTextA = kotlin.c.a(footer);
        }
        kotlin.c.c(this.f285938h, attributedTextA, rVar, aVar);
    }

    @Override // com.avito.android.str_booking.ui.banner.i
    public final void X7(boolean z12) {
        LinearLayout linearLayout = this.f285937g;
        if (linearLayout.getChildCount() != 0) {
            View childAt = linearLayout.getChildAt(0);
            Button button = childAt instanceof Button ? (Button) childAt : null;
            if (button != null) {
                button.setLoading(z12);
            }
        }
    }

    @Override // com.avito.android.str_booking.ui.banner.i
    public final void iQ(@k c cVar, @l r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        BannerContent bannerContent = cVar.f285926b;
        Function4.b(this.f285937g, bannerContent != null ? bannerContent.c() : null, this.f285932b, rVar);
    }

    @Override // com.avito.android.str_booking.ui.banner.i
    public final void pA(@k UniversalColor universalColor) {
        Context context = this.f285932b.getContext();
        C48063a.f437606a.getClass();
        this.f285936f.setTextColor(C48063a.e(context, universalColor));
    }
}
