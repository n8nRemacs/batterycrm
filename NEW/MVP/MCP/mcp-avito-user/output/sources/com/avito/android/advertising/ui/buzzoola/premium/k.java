package com.avito.android.advertising.ui.buzzoola.premium;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BuzzoolaPremiumCarousel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium/k;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/p;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends com.avito.android.cyclic_gallery_widget.image_carousel.p {

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title.a f88651w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public Object f88652x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a f88653y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a f88654z;

    public k(@Y61.k RecyclerView recyclerView, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k com.avito.konveyor.a aVar, boolean z12) {
        super(recyclerView, hVar, aVar, null, false, z12 ? 0 : null, null, false, 192, null);
        this.f88652x = C42784z0.f406748b;
        if (z12) {
            D6.f(this.f132070e, 0, 0, 0, 0, 11);
        }
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.p
    public final void b(@Y61.k ArrayList arrayList) {
        com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title.a aVar = this.f88651w;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        arrayList.addAll((Collection) this.f88652x);
        com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a aVar2 = this.f88653y;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a aVar3 = this.f88654z;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
    }
}
