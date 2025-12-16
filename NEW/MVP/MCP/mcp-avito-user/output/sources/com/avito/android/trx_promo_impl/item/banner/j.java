package com.avito.android.trx_promo_impl.item.banner;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoBannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/banner/j;", "Lcom/avito/android/trx_promo_impl/item/banner/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f304212k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f304213b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f304214c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f304215d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f304216e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f304217f;

    /* renamed from: g, reason: collision with root package name */
    public final int f304218g;

    /* renamed from: h, reason: collision with root package name */
    public final int f304219h;

    /* renamed from: i, reason: collision with root package name */
    public final int f304220i;

    /* renamed from: j, reason: collision with root package name */
    public final int f304221j;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f304213b = aVar;
        Banner banner = (Banner) view;
        this.f304214c = banner;
        this.f304215d = (TextView) banner.findViewById(R.id.trx_promo_banner_title);
        this.f304216e = (TextView) banner.findViewById(R.id.trx_promo_banner_description);
        this.f304217f = (LinearLayout) banner.findViewById(R.id.trx_promo_banner_buttons);
        this.f304218g = y6.b(6);
        this.f304219h = y6.b(20);
        this.f304220i = y6.b(24);
        this.f304221j = y6.b(28);
    }

    @Override // com.avito.android.trx_promo_impl.item.banner.i
    public final void Q2(@k l lVar, @Y61.l List list) {
        LinearLayout linearLayout = this.f304217f;
        linearLayout.removeAllViews();
        if (list != null) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                RF0.h hVar = (RF0.h) obj;
                Button button = new Button(this.f304214c.getThemedContext(), null, R.attr.buttonPrimaryMedium, 0, 8, null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (i12 > 0) {
                    layoutParams.setMargins(this.f304218g, 0, 0, 0);
                }
                button.setLayoutParams(layoutParams);
                cG0.e.a(button, hVar);
                button.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(hVar, lVar));
                linearLayout.addView(button);
                i12 = i13;
            }
        }
        D6.G(linearLayout, list != null);
    }

    @Override // com.avito.android.trx_promo_impl.item.banner.i
    public final void g(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f304216e, attributedText, this.f304213b);
    }

    @Override // com.avito.android.trx_promo_impl.item.banner.i
    public final void j0(@InterfaceC42150f int i12) {
        Banner banner = this.f304214c;
        banner.setAppearanceFromAttr(i12);
        int i13 = this.f304220i;
        banner.l(Integer.valueOf(i13), Integer.valueOf(this.f304219h), Integer.valueOf(i13), Integer.valueOf(this.f304221j));
    }

    @Override // com.avito.android.trx_promo_impl.item.banner.i
    public final void setTitle(@k String str) {
        this.f304215d.setText(str);
    }
}
