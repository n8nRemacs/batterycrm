package com.avito.android.str_booking.ui.promo_banner;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import Y41.r;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.str_booking.network.models.common.Button;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.p6;
import java.util.List;
import java.util.Map;
import kotlin.Function4;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: StrBookingPromoBannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/promo_banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/promo_banner/g;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f286162b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f286163c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f286164d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f286165e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f286166f;

    public h(@k View view) {
        super(view);
        this.f286162b = (Banner) view;
        View viewFindViewById = view.findViewById(R.id.banner_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286163c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.banner_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286164d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.buttons_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f286165e = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.banner_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f286166f = (SimpleDraweeView) viewFindViewById4;
    }

    @Override // com.avito.android.str_booking.ui.promo_banner.g
    public final void M(@l UniversalImage universalImage) {
        Image imageQ = universalImage != null ? com.avito.android.actions_sheet.a.q(this.itemView, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f286166f;
        Uri uriB = C35829k2.c(imageQ, simpleDraweeView, 1, 22).b();
        if (uriB == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriB);
        aVarA.c();
    }

    @Override // com.avito.android.str_booking.ui.promo_banner.g
    public final void b(@l String str) {
        I5.a(this.f286163c, str, false);
    }

    @Override // com.avito.android.str_booking.ui.promo_banner.g
    @k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.android.str_booking.ui.promo_banner.g
    public final void hg(@l String str) {
        if (str != null) {
            Context context = this.itemView.getContext();
            UniversalColor universalColorUniversalColorOf$default = UniversalColorKt.universalColorOf$default(str, 0, 2, null);
            C48063a.f437606a.getClass();
            Banner.h(this.f286162b, C48063a.e(context, universalColorUniversalColorOf$default));
        }
    }

    @Override // com.avito.android.str_booking.ui.promo_banner.g
    public final void mY(@l List<Button> list, @l r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        View view = this.itemView;
        LinearLayout linearLayout = this.f286165e;
        Function4.b(linearLayout, list, view, rVar);
        p6 p6Var = new p6(linearLayout);
        while (p6Var.hasNext()) {
            View view2 = (View) p6Var.next();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = -2;
            layoutParams2.width = -1;
            layoutParams2.weight = 0.0f;
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.avito.android.str_booking.ui.promo_banner.g
    public final void r5(@l CharSequence charSequence) {
        I5.a(this.f286164d, charSequence, false);
    }
}
