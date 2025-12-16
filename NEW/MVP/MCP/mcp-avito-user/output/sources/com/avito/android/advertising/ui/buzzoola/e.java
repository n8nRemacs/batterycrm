package com.avito.android.advertising.ui.buzzoola;

import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.a;
import com.avito.android.advertising.ui.buzzoola.c;
import com.avito.android.advertising.ui.c;
import com.avito.android.advertising.ui.e;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.drawable.s;
import j.InterfaceC42161q;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdBuzzoolaViewHolder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/e;", "Lcom/avito/android/advertising/ui/buzzoola/d;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/advertising/ui/buzzoola/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends com.avito.android.serp.c implements d, a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f88583b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f88584c;

    public e(@Y61.k View view, @Y61.k AdStyle adStyle) {
        super(view);
        b bVar = new b(view, adStyle);
        this.f88583b = bVar;
        this.f88584c = bVar.f88577u;
    }

    public final void B80() throws Resources.NotFoundException {
        b bVar = this.f88583b;
        int dimensionPixelOffset = bVar.f88558b.getContext().getResources().getDimensionPixelOffset(R.dimen.ad_badges_mid_margin);
        D6.c(bVar.f88577u, null, Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), null, 9);
    }

    @Override // com.avito.android.advertising.ui.a
    public final void BN(@Y61.l Float f12, @Y61.k AdStyle adStyle) {
        b bVar = this.f88583b;
        bVar.getClass();
        a.C2614a.b(bVar, f12, adStyle);
    }

    public final void C80(float f12, boolean z12) {
        b bVar = this.f88583b;
        if (f12 <= 0.0f) {
            bVar.getClass();
            return;
        }
        ViewGroup viewGroup = bVar.f88562f;
        if (z12) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.removeRule(8);
                layoutParams2.removeRule(10);
                layoutParams2.addRule(15);
            }
        }
        ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = -2;
        }
        RatioForegroundFrameLayout ratioForegroundFrameLayout = viewGroup instanceof RatioForegroundFrameLayout ? (RatioForegroundFrameLayout) viewGroup : null;
        if (ratioForegroundFrameLayout != null) {
            ratioForegroundFrameLayout.setRatio(f12);
        }
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        b bVar = this.f88583b;
        bVar.getClass();
        return c.a.b(bVar);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void E8(@Y61.l String str) {
        this.f88583b.E8(str);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Ex(boolean z12, boolean z13) {
        b bVar = this.f88583b;
        bVar.getClass();
        e.a.j(bVar, z12, z13);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void H60(@InterfaceC42161q int i12) {
        b bVar = this.f88583b;
        bVar.getClass();
        e.a.l(bVar, i12);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void HE(@Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k String str, boolean z12) {
        this.f88583b.HE(aVar, aVar2, str, z12);
    }

    @Override // com.avito.android.advertising.ui.a
    public final void IS(int i12, @Y61.l Float f12) {
        b bVar = this.f88583b;
        bVar.getClass();
        a.C2614a.d(bVar, f12, i12);
    }

    @Override // com.avito.android.advertising.ui.a
    @Y61.l
    /* renamed from: Ik */
    public final RatingBar getF88570n() {
        return this.f88583b.f88570n;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Kw(@InterfaceC42161q int i12) {
        b bVar = this.f88583b;
        bVar.getClass();
        e.a.a(bVar, i12);
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: Ns */
    public final Rect getF4091d() {
        this.f88583b.getClass();
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.ui.a
    public final void OB(@Y61.k AdStyle adStyle) throws Resources.NotFoundException {
        b bVar = this.f88583b;
        bVar.getClass();
        a.C2614a.a(bVar, adStyle);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    public final void Q10(boolean z12) {
        c.a.a(this, z12);
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: Qw */
    public final TextView getF88564h() {
        return this.f88583b.f88564h;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: T1 */
    public final ViewGroup getF88561e() {
        return this.f88583b.f88561e;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    @Y61.k
    public final String U30() {
        return this.f88583b.U30();
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    @Y61.k
    /* renamed from: V6, reason: from getter */
    public final TextView getF88642l() {
        return this.f88584c;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void Xa(boolean z12) {
        this.f88583b.Xa(z12);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f88583b.a(aVar);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void e20(@InterfaceC42161q int i12) {
        b bVar = this.f88583b;
        bVar.getClass();
        ViewGroup f88562f = bVar.getF88562f();
        if (f88562f != null) {
            v.b(f88562f, i12);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void f20(@Y61.l TextView textView, @Y61.l String str) {
        this.f88583b.getClass();
        e.a.k(textView, str, null);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void fu(boolean z12) {
        b bVar = this.f88583b;
        bVar.getClass();
        e.a.m(bVar, z12);
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: getCallToActionView */
    public final TextView getF88565i() {
        return this.f88583b.f88565i;
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: getStyle */
    public final AdStyle getF88559c() {
        return this.f88583b.f88559c;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: getView */
    public final View getF88558b() {
        return this.f88583b.f88558b;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void h(@Y61.l String str) {
        b bVar = this.f88583b;
        bVar.getClass();
        TextView f88564h = bVar.getF88564h();
        if (f88564h != null) {
            I5.a(f88564h, str, false);
        }
    }

    @Override // com.avito.android.advertising.ui.a
    @Y61.l
    /* renamed from: hh */
    public final LinearLayout getF88568l() {
        return this.f88583b.f88568l;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: j70 */
    public final ViewGroup getF88573q() {
        return this.f88583b.f88573q;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void n4(@Y61.l String str) {
        this.f88583b.n4(str);
    }

    @Override // com.avito.android.advertising.ui.a
    @Y61.l
    /* renamed from: oX */
    public final TextView getF88571o() {
        return this.f88583b.f88571o;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: od */
    public final ViewGroup getF88562f() {
        return this.f88583b.f88562f;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    @Y61.l
    public final View ou() {
        return this.f88583b.f88580x;
    }

    @Override // com.avito.android.advertising.ui.a
    public final void p(@Y61.l String str) {
        b bVar = this.f88583b;
        bVar.getClass();
        a.C2614a.c(bVar, str);
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    public final ImageView pi() {
        return this.f88583b.f88572p;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void px(@Y61.l Uri uri, @Y61.k s.c cVar, @Y61.l Y41.l<? super YW0.f, G0> lVar) {
        this.f88583b.px(uri, cVar, lVar);
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: qs */
    public final TextView getF88563g() {
        return this.f88583b.f88563g;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void setTitle(@Y61.l String str) {
        b bVar = this.f88583b;
        bVar.getClass();
        TextView f88563g = bVar.getF88563g();
        if (f88563g != null) {
            I5.a(f88563g, str, false);
        }
    }

    @Override // com.avito.android.advertising.ui.a
    @Y61.l
    /* renamed from: sq */
    public final TextView getF88569m() {
        return this.f88583b.f88569m;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    @Y61.k
    public final TextView t6() {
        return this.f88583b.f88577u;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    public final View uC() {
        return this.f88583b.f88567k;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void uF(@Y61.l Integer num) {
        this.f88583b.uF(num);
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: wV */
    public final TextView getF7312q() {
        this.f88583b.getClass();
        return null;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void y9(@Y61.l Uri uri) {
        b bVar = this.f88583b;
        bVar.getClass();
        View viewUC = bVar.uC();
        if (viewUC instanceof SimpleDraweeView) {
            ((SimpleDraweeView) viewUC).e(uri);
        }
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        b bVar = this.f88583b;
        bVar.getClass();
        return c.a.a(bVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
    }
}
