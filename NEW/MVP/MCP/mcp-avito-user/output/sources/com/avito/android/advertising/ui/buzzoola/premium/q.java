package com.avito.android.advertising.ui.buzzoola.premium;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import com.avito.android.lib.util.layout.ForegroundRelativeLayout;
import j.InterfaceC42165v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaPremiumView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium/q;", "Lcom/avito/android/advertising/ui/buzzoola/premium/p;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/advertising/ui/buzzoola/premium/i;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q extends com.avito.android.serp.c implements p, i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f88664b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f88665c;

    public q(@Y61.k ForegroundRelativeLayout foregroundRelativeLayout, float f12, @Y61.k com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar, @Y61.k AdStyle adStyle, @Y61.l TV0.b<?, ?> bVar, @Y61.l TV0.b<?, ?> bVar2) {
        super(foregroundRelativeLayout);
        this.f88664b = new h(foregroundRelativeLayout, adStyle, f12, cVar, !adStyle.b(), bVar, bVar2);
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        h hVar = this.f88664b;
        hVar.getClass();
        return c.a.b(hVar);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void H0() {
        this.f88664b.H0();
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void H1(@Y61.l Parcelable parcelable) {
        this.f88664b.H1(parcelable);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void I4(@Y61.l Uri uri) {
        this.f88664b.I4(uri);
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: Ns */
    public final Rect getF4091d() {
        this.f88664b.getClass();
        return com.avito.android.advertising.ui.d.f88703a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void P1(@Y61.l Y41.l<? super Integer, G0> lVar) {
        this.f88664b.f88637g.f132081p = (N) lVar;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    public final void Q10(boolean z12) {
        this.f88664b.Q10(z12);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void S3(@Y61.l View.OnClickListener onClickListener) {
        this.f88664b.S3(onClickListener);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void S5(@InterfaceC42165v @Y61.l Integer num) {
        this.f88664b.S5(num);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    @Y61.k
    /* renamed from: V6 */
    public final TextView getF88642l() {
        return this.f88664b.f88642l;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f88664b.a(aVar);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.p
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f88665c = aVar;
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: getStyle */
    public final AdStyle getF7298c() {
        return this.f88664b.f88633c;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    @Y61.k
    public final View getView() {
        return this.f88664b.f88632b;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void h(@Y61.l String str) {
        this.f88664b.h(str);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void hH(@Y61.l String str, boolean z12) {
        this.f88664b.hH(str, z12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f88665c;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f88665c = null;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void jV(@Y61.k ArrayList arrayList, @Y61.l com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a aVar, @Y61.l com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a aVar2) {
        this.f88664b.jV(arrayList, aVar, aVar2);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    @Y61.l
    public final Parcelable k2() {
        return this.f88664b.f88637g.c();
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void setTitle(@Y61.k String str) {
        this.f88664b.setTitle(str);
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        h hVar = this.f88664b;
        hVar.getClass();
        return c.a.a(hVar);
    }

    public /* synthetic */ q(ForegroundRelativeLayout foregroundRelativeLayout, float f12, com.jakewharton.rxrelay3.c cVar, AdStyle adStyle, TV0.b bVar, TV0.b bVar2, int i12, C42822w c42822w) {
        this(foregroundRelativeLayout, f12, cVar, adStyle, (i12 & 16) != 0 ? null : bVar, (i12 & 32) != 0 ? null : bVar2);
    }
}
