package com.avito.android.search.filter.adapter.banner_chekbox_with_image;

import Y61.k;
import Y61.l;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: BannerCheckBoxWithImageItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/banner_chekbox_with_image/f;", "Lcom/avito/android/search/filter/adapter/banner_chekbox_with_image/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f261965b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f261966c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f261967d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f261968e;

    /* renamed from: f, reason: collision with root package name */
    public final Checkmark f261969f;

    /* renamed from: g, reason: collision with root package name */
    public final SimpleDraweeView f261970g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f261971h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Badge f261972i;

    public f(@k View view) {
        super(view);
        this.f261965b = view;
        View viewFindViewById = view.findViewById(R.id.checkbox_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f261966c = (TextView) viewFindViewById;
        this.f261967d = (TextView) view.findViewById(R.id.checkbox_subtitle);
        this.f261968e = (TextView) view.findViewById(R.id.label);
        this.f261969f = (Checkmark) view.findViewById(R.id.checkbox_checkmark);
        this.f261970g = (SimpleDraweeView) view.findViewById(R.id.checkbox_image);
        this.f261971h = (FrameLayout) view.findViewById(R.id.badge_container);
        this.f261972i = (Badge) view.findViewById(R.id.notification_badge);
    }

    @Override // com.avito.android.search.filter.adapter.banner_chekbox_with_image.d
    public final void Bc(boolean z12) {
        ToggleState toggleState = new ToggleState(null, false, false, false, z12 ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b, 15, null);
        Checkmark checkmark = this.f261969f;
        checkmark.setState(toggleState);
        checkmark.setClickable(false);
    }

    @Override // com.avito.android.search.filter.adapter.banner_chekbox_with_image.d
    public final void Ia(@l String str) {
        I5.a(this.f261968e, str, false);
    }

    @Override // com.avito.android.search.filter.adapter.banner_chekbox_with_image.d
    public final void M(@l UniversalImage universalImage) {
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.f261965b, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f261970g;
        if (imageG == null) {
            D6.w(simpleDraweeView);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageG));
        aVarA.c();
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.search.filter.adapter.banner_chekbox_with_image.d
    public final void MC(@k final Y41.l<? super Boolean, G0> lVar) {
        this.f261971h.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.search.filter.adapter.banner_chekbox_with_image.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar = this.f261963b;
                boolean zIsChecked = fVar.f261969f.isChecked();
                ((h) lVar).invoke(Boolean.valueOf(!zIsChecked));
                fVar.f261969f.setState(new ToggleState(null, false, false, false, !zIsChecked ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b, 15, null));
                fVar.f261971h.setBackgroundResource(!zIsChecked ? R.drawable.bg_banner_rounded_warm_gray_20dp_black_border : R.drawable.bg_banner_rounded_warm_gray_20dp);
            }
        });
    }

    @Override // com.avito.android.search.filter.adapter.banner_chekbox_with_image.d
    public final void b(@k String str) {
        I5.a(this.f261966c, str, false);
    }

    @Override // com.avito.android.search.filter.adapter.banner_chekbox_with_image.d
    public final void j(@l String str) {
        I5.a(this.f261967d, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f261971h.setOnClickListener(null);
    }

    @Override // com.avito.android.search.filter.adapter.banner_chekbox_with_image.d
    public final void u6(boolean z12) {
        this.f261971h.setBackgroundResource(z12 ? R.drawable.bg_banner_rounded_warm_gray_20dp_black_border : R.drawable.bg_banner_rounded_warm_gray_20dp);
    }

    @Override // com.avito.android.search.filter.adapter.banner_chekbox_with_image.d
    public final void uA(@l String str, @l String str2, @l String str3) {
        boolean z12 = str != null;
        Badge badge = this.f261972i;
        D6.G(badge, z12);
        if (str != null && badge != null) {
            badge.setTitleText(str);
        }
        View view = this.f261965b;
        if (str2 != null && badge != null) {
            badge.setTextColor(C48065c.c(view.getContext(), str2));
        }
        if (str3 != null) {
            Object background = badge != null ? badge.getBackground() : null;
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(C48065c.c(view.getContext(), str3));
            }
            if (badge == null) {
                return;
            }
            badge.setBackground(gradientDrawable);
        }
    }
}
