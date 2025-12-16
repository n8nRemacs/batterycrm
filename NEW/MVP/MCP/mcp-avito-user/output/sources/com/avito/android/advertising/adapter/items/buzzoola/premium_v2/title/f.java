package com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title;

import Y61.k;
import android.net.Uri;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import kotlin.Metadata;

/* compiled from: BuzzoolaPremiumV2TitleItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium_v2/title/f;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium_v2/title/d;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    public final float f87500b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<i> f87501c;

    public f(float f12, @k com.jakewharton.rxrelay3.c<i> cVar) {
        this.f87500b = f12;
        this.f87501c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.advertising.ui.buzzoola.premium_v2.a aVar2 = (com.avito.android.advertising.ui.buzzoola.premium_v2.a) eVar;
        a aVar3 = (a) aVar;
        aVar2.q0(this.f87500b);
        aVar2.G4(aVar3.f87488c);
        String str = aVar3.f87493h;
        int i13 = str.length() == 0 ? 2 : 1;
        String str2 = aVar3.f87491f;
        aVar2.Sd(i13, aVar3.f87492g, str2);
        aVar2.E20(str2.length() != 0 ? 1 : 2, aVar3.f87494i, str);
        aVar2.S5(aVar3.f87489d);
        Uri uri = aVar3.f87490e;
        aVar2.I4(uri);
        aVar2.x0(new B(this, 15));
        aVar2.d(new e(aVar2));
        aVar2.bw(!(uri == null && str2.length() == 0 && str.length() == 0));
    }
}
