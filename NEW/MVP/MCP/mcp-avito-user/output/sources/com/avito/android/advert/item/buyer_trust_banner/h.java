package com.avito.android.advert.item.buyer_trust_banner;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BuyerTrustBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/buyer_trust_banner/h;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f74226b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f74227c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f74228d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f74229e;

    /* compiled from: BuyerTrustBannerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f74230l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(y6.b(20));
        }
    }

    public h(@k Banner banner) {
        super(banner);
        this.f74226b = banner;
        this.f74227c = banner.getContext();
        View viewFindViewById = banner.findViewById(R.id.buyer_trust_banner_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74228d = (TextView) viewFindViewById;
        this.f74229e = C42727D.c(a.f74230l);
    }
}
