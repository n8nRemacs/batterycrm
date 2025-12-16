package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* compiled from: AdvertDetailsParametersBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/s1;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.block_factories.s1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27891s1 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C28070w1 f73652a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73653b;

    /* compiled from: AdvertDetailsParametersBlockFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/w1$a;", "it", "", "", "invoke", "(Lcom/avito/android/advert/item/blocks/items_factories/w1$a;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.blocks.block_factories.s1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C28070w1.a, List<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f73654l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final List<? extends Object> invoke(C28070w1.a aVar) {
            C28070w1.a aVar2 = aVar;
            return C42756l.B(new Object[]{aVar2.f74053a, aVar2.f74054b});
        }
    }

    @Inject
    public C27891s1(@Y61.k C28070w1 c28070w1, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73652a = c28070w1;
        this.f73653b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        AdvertDetailsWithMeta advertDetailsWithMeta = bVar.f83013a;
        AdvertDetails advertDetails = advertDetailsWithMeta.f82645b;
        List<C28070w1.a> listB = this.f73652a.b(advertDetails, advertDetails.getParameters(), advertDetailsWithMeta.f82645b.isRestyle(), !r8.isActive(), this.f73653b.a(), true);
        a aVar = a.f73654l;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            C42745f0.h(aVar.invoke(it.next()), arrayList);
        }
        return arrayList;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@Y61.k a.b bVar) {
        return true;
    }
}
