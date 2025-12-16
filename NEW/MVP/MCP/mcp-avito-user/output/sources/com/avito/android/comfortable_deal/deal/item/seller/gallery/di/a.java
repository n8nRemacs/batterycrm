package com.avito.android.comfortable_deal.deal.item.seller.gallery.di;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deal.item.seller.gallery.di.b;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;

/* compiled from: DaggerSellerItemGalleryComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerSellerItemGalleryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.deal.item.seller.gallery.di.b.a
        public final com.avito.android.comfortable_deal.deal.item.seller.gallery.di.b a(Context context) {
            return new c(context, null);
        }
    }

    /* compiled from: DaggerSellerItemGalleryComponent.java */
    public static final class c implements com.avito.android.comfortable_deal.deal.item.seller.gallery.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f121498a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f121499b = dagger.internal.g.d(new d(new f(com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.e.a())));

        public c(Context context, C3590a c3590a) {
            this.f121498a = context;
        }

        @Override // com.avito.android.comfortable_deal.deal.item.seller.gallery.di.b
        public final void a(Bp.d dVar) throws BlueprintCollisionException {
            u<com.avito.konveyor.adapter.a> uVar = this.f121499b;
            com.avito.konveyor.adapter.a aVar = uVar.get();
            com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.d dVar2 = new com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.d();
            int i12 = com.avito.android.comfortable_deal.deal.item.seller.gallery.di.c.f121500a;
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(new com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.a(dVar2));
            dVar.f1719b = new j(aVar, c10493a.a());
            dVar.f1720c = uVar.get();
            Context context = this.f121498a;
            dVar.f1721d = new SV.a(8388611, kotlin.math.b.b(context.getResources().getDimension(R.dimen.seller_item_gallery_padding_start) - context.getResources().getDimension(R.dimen.seller_item_gallery_padding_between)));
            dVar.f1722e = new Bp.b(kotlin.math.b.b(context.getResources().getDimension(R.dimen.seller_item_gallery_padding_start)), kotlin.math.b.b(context.getResources().getDimension(R.dimen.seller_item_gallery_padding_end)), kotlin.math.b.b(context.getResources().getDimension(R.dimen.seller_item_gallery_padding_between)));
        }
    }

    public static b.a a() {
        return new b();
    }
}
