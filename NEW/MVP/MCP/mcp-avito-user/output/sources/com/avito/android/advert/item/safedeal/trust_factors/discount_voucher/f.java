package com.avito.android.advert.item.safedeal.trust_factors.discount_voucher;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.advert.item.safedeal.trust_factors.n;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrustFactorsVoucherView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/discount_voucher/f;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "Lcom/avito/android/advert/item/safedeal/trust_factors/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e, n {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f79118b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final i f79119c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f79120d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f79121e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f79122f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final FrameLayout f79123g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f79124h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ImageView f79125i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public Y41.a<G0> f79126j;

    public f(@k View view, @l i iVar) {
        super(view);
        this.f79118b = view;
        this.f79119c = iVar;
        View viewFindViewById = view.findViewById(R.id.advert_details_safedeal_voucher_left_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f79120d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_details_safedeal_voucher_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79121e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advert_details_safedeal_voucher_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79122f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.advert_details_safedeal_voucher_right_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f79123g = (FrameLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.advert_details_safedeal_voucher_right_button_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f79124h = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.advert_details_safedeal_voucher_right_button_selected_icon);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f79125i = (ImageView) viewFindViewById6;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        i iVar = this.f79119c;
        if (iVar != null) {
            iVar.a();
        }
    }
}
