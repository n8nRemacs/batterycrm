package Hb;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.splitter.YandexBadgeStyle;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.a;
import com.avito.android.advertising.ui.c;
import com.avito.android.advertising.ui.e;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.yandex.mobile.ads.nativeads.NativeAd;
import j.InterfaceC42161q;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdYandexViewHolder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"LHb/e;", "LHb/d;", "Lcom/avito/android/serp/c;", "LHb/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends com.avito.android.serp.c implements d, InterfaceC13946a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AdStyle f7328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f7329c;

    public e(@k View view, @k AdStyle adStyle) {
        super(view);
        this.f7328b = adStyle;
        this.f7329c = new c(view, adStyle);
    }

    public final void B80(float f12, boolean z12) {
        c cVar = this.f7329c;
        if (f12 <= 0.0f) {
            cVar.getClass();
            return;
        }
        ViewGroup viewGroup = cVar.f7305j;
        if (z12) {
            ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.removeRule(8);
            }
            ViewGroup.LayoutParams layoutParams3 = viewGroup != null ? viewGroup.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.removeRule(10);
            }
            ViewGroup.LayoutParams layoutParams5 = viewGroup != null ? viewGroup.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.addRule(15);
            }
        }
        ViewGroup.LayoutParams layoutParams7 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams7 != null) {
            layoutParams7.height = -2;
        }
        RatioForegroundFrameLayout ratioForegroundFrameLayout = viewGroup instanceof RatioForegroundFrameLayout ? (RatioForegroundFrameLayout) viewGroup : null;
        if (ratioForegroundFrameLayout != null) {
            ratioForegroundFrameLayout.setRatio(f12);
        }
    }

    @Override // com.avito.android.advertising.ui.a
    public final void BN(@l Float f12, @k AdStyle adStyle) {
        c cVar = this.f7329c;
        cVar.getClass();
        a.C2614a.b(cVar, f12, adStyle);
    }

    public final void C80() throws Resources.NotFoundException {
        c cVar = this.f7329c;
        int dimensionPixelOffset = cVar.f7297b.getContext().getResources().getDimensionPixelOffset(R.dimen.ad_badges_mid_margin);
        TextView textView = cVar.f7312q;
        if (textView != null) {
            D6.c(textView, Integer.valueOf(dimensionPixelOffset), null, null, Integer.valueOf(dimensionPixelOffset), 6);
        }
        int i12 = cVar.f7296D;
        TextView textView2 = cVar.f7317v;
        if (textView2 != null) {
            D6.c(textView2, Integer.valueOf(i12), null, Integer.valueOf(i12), Integer.valueOf(y6.b(30)), 2);
        }
        D6.c(cVar.f7301f, null, Integer.valueOf(i12), null, null, 13);
        D6.c(cVar.f7310o, null, Integer.valueOf(i12), null, null, 13);
        ImageView imageView = cVar.f7313r;
        if (imageView != null) {
            D6.c(imageView, null, Integer.valueOf(i12), Integer.valueOf(i12), null, 9);
        }
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        c cVar = this.f7329c;
        cVar.getClass();
        return c.a.b(cVar);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Ex(boolean z12, boolean z13) {
        c cVar = this.f7329c;
        cVar.getClass();
        e.a.j(cVar, z12, z13);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void H60(@InterfaceC42161q int i12) {
        c cVar = this.f7329c;
        cVar.getClass();
        e.a.l(cVar, i12);
    }

    @Override // Hb.InterfaceC13946a
    public final void Hn(@k YandexBadgeStyle yandexBadgeStyle) {
        this.f7329c.Hn(yandexBadgeStyle);
    }

    @Override // com.avito.android.advertising.ui.a
    public final void IS(int i12, @l Float f12) {
        c cVar = this.f7329c;
        cVar.getClass();
        a.C2614a.d(cVar, f12, i12);
    }

    @Override // com.avito.android.advertising.ui.a
    @l
    /* renamed from: Ik */
    public final RatingBar getF7308m() {
        return this.f7329c.f7308m;
    }

    @Override // Hb.InterfaceC13946a
    public final void J60(@k NativeAd nativeAd) {
        this.f7329c.J60(nativeAd);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Kw(@InterfaceC42161q int i12) {
        c cVar = this.f7329c;
        cVar.getClass();
        e.a.a(cVar, i12);
    }

    @Override // Hb.InterfaceC13946a
    public final void N6() {
        this.f7329c.N6();
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: Ns */
    public final Rect getF4091d() {
        this.f7329c.getClass();
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.ui.a
    public final void OB(@k AdStyle adStyle) throws Resources.NotFoundException {
        c cVar = this.f7329c;
        cVar.getClass();
        a.C2614a.a(cVar, adStyle);
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: Qw */
    public final TextView getF7302g() {
        return this.f7329c.f7302g;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: T1 */
    public final ViewGroup getF7299d() {
        return this.f7329c.f7299d;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void e20(@InterfaceC42161q int i12) {
        c cVar = this.f7329c;
        cVar.getClass();
        ViewGroup f7305j = cVar.getF7305j();
        if (f7305j != null) {
            v.b(f7305j, i12);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void f20(@l TextView textView, @l String str) {
        this.f7329c.getClass();
        e.a.k(textView, str, null);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void fu(boolean z12) {
        c cVar = this.f7329c;
        cVar.getClass();
        e.a.m(cVar, z12);
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: getCallToActionView */
    public final TextView getF7303h() {
        return this.f7329c.f7303h;
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF7298c() {
        return this.f7328b;
    }

    @Override // com.avito.android.advertising.ui.e
    @k
    /* renamed from: getView */
    public final View getF7297b() {
        return this.f7329c.f7297b;
    }

    @Override // com.avito.android.advertising.ui.a
    @l
    /* renamed from: hh */
    public final LinearLayout getF7306k() {
        return this.f7329c.f7306k;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: j70 */
    public final ViewGroup getF7319x() {
        return this.f7329c.f7319x;
    }

    @Override // com.avito.android.advertising.ui.a
    @l
    /* renamed from: oX */
    public final TextView getF7309n() {
        return this.f7329c.f7309n;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: od */
    public final ViewGroup getF7305j() {
        return this.f7329c.f7305j;
    }

    @Override // com.avito.android.advertising.ui.a
    public final void p(@l String str) {
        c cVar = this.f7329c;
        cVar.getClass();
        a.C2614a.c(cVar, str);
    }

    @Override // Hb.InterfaceC13946a
    public final void pV(@k NativeAd nativeAd, boolean z12, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        this.f7329c.pV(nativeAd, z12, aVar, aVar2);
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    public final ImageView pi() {
        return this.f7329c.f7318w;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: qs */
    public final TextView getF7311p() {
        return this.f7329c.f7311p;
    }

    @Override // com.avito.android.advertising.ui.a
    @l
    /* renamed from: sq */
    public final TextView getF7307l() {
        return this.f7329c.f7307l;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    public final View uC() {
        return this.f7329c.f7304i;
    }

    @Override // Hb.InterfaceC13946a
    public final void uM(@k YandexBadgeStyle yandexBadgeStyle, boolean z12) {
        this.f7329c.uM(yandexBadgeStyle, z12);
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: wV */
    public final TextView getF7312q() {
        return this.f7329c.f7312q;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        c cVar = this.f7329c;
        cVar.getClass();
        return c.a.a(cVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
    }
}
