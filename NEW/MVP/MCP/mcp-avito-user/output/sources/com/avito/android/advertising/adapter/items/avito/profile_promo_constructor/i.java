package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import Ca1.ViewOnClickListenerC13236c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfilePromoConstructorViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/i;", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/h;", "Lcom/avito/android/serp/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.android.serp.c implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f87203b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final View f87204c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ProfilePromoConstructorLayout f87205d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f87206e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f87207f;

    public i(@k View view) {
        super(view);
        this.f87203b = view;
        this.f87204c = view.findViewById(R.id.profile_promo_gallery_content);
        View viewFindViewById = view.findViewById(R.id.profile_promo_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.ProfilePromoConstructorLayout");
        }
        this.f87205d = (ProfilePromoConstructorLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ad_placeholder);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f87206e = viewFindViewById2;
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    public final void FY(@k ViewOnClickListenerC13236c viewOnClickListenerC13236c) {
        TextView adBadge = this.f87205d.getAdBadge();
        if (adBadge != null) {
            adBadge.setOnClickListener(viewOnClickListenerC13236c);
        }
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    public final void N7() {
        this.f87205d.setOnClickListener(null);
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    public final void Xa(boolean z12) {
        D6.G(this.f87206e, !z12);
        D6.G(this.f87205d.getImageView(), z12);
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    public final void d(@l Y41.a<G0> aVar) {
        this.f87207f = aVar;
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF87203b() {
        return this.f87203b;
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    public final void h(@k String str) {
        TextView descriptionView = this.f87205d.getDescriptionView();
        if (descriptionView == null) {
            return;
        }
        descriptionView.setText(str);
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    public final void j1(@l Uri uri) {
        SimpleDraweeView imageView = this.f87205d.getImageView();
        if (imageView != null) {
            imageView.setImageURI(uri);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f87207f;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f87207f = null;
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    public final void setOnClickListener(@k View.OnClickListener onClickListener) {
        this.f87205d.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    public final void setTitle(@k String str) {
        TextView titleView = this.f87205d.getTitleView();
        if (titleView == null) {
            return;
        }
        titleView.setText(str);
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h
    public final void vG(@l AvitoNetworkBanner.MarkInfo markInfo) {
        this.f87205d.setMarkInfo(markInfo);
    }
}
