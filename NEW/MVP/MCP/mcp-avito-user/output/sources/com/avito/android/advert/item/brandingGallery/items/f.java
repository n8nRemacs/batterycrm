package com.avito.android.advert.item.brandingGallery.items;

import com.avito.android.image_loader.o;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: BrandingGalleryBlockElementView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/brandingGallery/items/f;", "Lcom/avito/android/image_loader/o;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f74161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f74162c;

    public f(g gVar, boolean z12) {
        this.f74161b = gVar;
        this.f74162c = z12;
    }

    @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        boolean z12 = this.f74162c;
        g gVar = this.f74161b;
        if (z12) {
            D6.H(gVar.f74167e);
        }
        D6.w(gVar.f74166d);
        gVar.f74166d.d();
    }

    @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
    public final void S2() {
        g gVar = this.f74161b;
        D6.w(gVar.f74167e);
        D6.H(gVar.f74166d);
        gVar.f74166d.c();
    }
}
