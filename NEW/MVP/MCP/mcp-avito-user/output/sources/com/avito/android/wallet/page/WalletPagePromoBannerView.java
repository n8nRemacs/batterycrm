package com.avito.android.wallet.page;

import X41.j;
import Y61.k;
import Y61.l;
import ZO0.h;
import ZO0.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WalletPagePromoBannerView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/WalletPagePromoBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletPagePromoBannerView extends ConstraintLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f327753g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f327754b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f327755c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f327756d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f327757e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ZO0.f f327758f;

    @j
    public WalletPagePromoBannerView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void g(SimpleDraweeView simpleDraweeView, h hVar) {
        Image image;
        Image image2;
        if (hVar == null) {
            D6.w(simpleDraweeView);
            return;
        }
        ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        i iVar = hVar.f20148b;
        layoutParams.width = y6.b(iVar.f20151b);
        layoutParams.height = y6.b(iVar.f20150a);
        simpleDraweeView.setLayoutParams(layoutParams);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        ZO0.k kVar = hVar.f20149c;
        if (kVar != null) {
            boolean zB2 = com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext());
            image = kVar.f20154a;
            if (!zB2 && (image2 = kVar.f20155b) != null) {
                image = image2;
            }
        } else {
            image = null;
        }
        ZO0.j jVar = hVar.f20147a;
        if (image != null) {
            aVarA.d(n.a(image));
            Drawable drawableH = h(jVar);
            if (drawableH != null) {
                aVarA.f169492j = drawableH;
                aVarA.f169493k = null;
            }
        } else {
            Drawable drawableH2 = h(jVar);
            if (drawableH2 == null) {
                D6.w(simpleDraweeView);
                return;
            }
            aVarA.f169484b = new ImageRequest.d.a(drawableH2, null);
        }
        D6.H(simpleDraweeView);
        aVarA.c();
    }

    public final Drawable h(ZO0.j jVar) {
        String str;
        Integer numA;
        if (jVar == null || (str = jVar.f20153b) == null) {
            return null;
        }
        String str2 = jVar.f20152a;
        Integer numValueOf = (str2 == null || (numA = com.avito.android.lib.util.e.a(str2)) == null) ? null : Integer.valueOf(C35835l0.d(numA.intValue(), getContext()));
        Integer numA2 = q.a(str);
        if (numA2 == null) {
            return null;
        }
        Drawable drawableH = C35835l0.h(numA2.intValue(), getContext());
        if (drawableH == null) {
            return null;
        }
        if (numValueOf == null) {
            drawableH.mutate().setTintList(null);
        } else {
            V0.d(drawableH, numValueOf.intValue());
        }
        return drawableH;
    }

    public WalletPagePromoBannerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.payment_wallet_page_promo_banner, this);
        setBackgroundResource(R.drawable.wallet_page_promo_banner_background);
        int iB2 = y6.b(16);
        setPadding(iB2, iB2, iB2, iB2);
        this.f327754b = (TextView) findViewById(R.id.payment_wallet_page_banner_title);
        this.f327755c = (TextView) findViewById(R.id.payment_wallet_page_banner_subtitle);
        this.f327756d = (SimpleDraweeView) findViewById(R.id.payment_wallet_page_banner_icon_left);
        this.f327757e = (SimpleDraweeView) findViewById(R.id.payment_wallet_page_banner_icon_right);
    }
}
