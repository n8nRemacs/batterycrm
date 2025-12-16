package com.avito.android.advert.item.beduin.v2;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.C27814a2;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.AdvertDetailsBlock;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import k4.C42501e;
import k4.InterfaceC42497a;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NativeBlockFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/r;", "Lcom/avito/android/advert/item/beduin/v2/q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f73370a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f73371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f73372c;

    /* compiled from: NativeBlockFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/AdvertDetailsBlockId;", "Lcom/avito/android/advert_core/blocks/a;", "LX41/o;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<Map<AdvertDetailsBlockId, com.avito.android.advert_core.blocks.a>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Map<AdvertDetailsBlockId, com.avito.android.advert_core.blocks.a>> f73373l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<? extends Map<AdvertDetailsBlockId, com.avito.android.advert_core.blocks.a>> aVar) {
            super(0);
            this.f73373l = aVar;
        }

        @Override // Y41.a
        public final Map<AdvertDetailsBlockId, com.avito.android.advert_core.blocks.a> invoke() {
            return this.f73373l.invoke();
        }
    }

    /* compiled from: NativeBlockFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/advert/item/a2;", "invoke", "()Lcom/avito/android/advert/item/a2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<C27814a2> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C27814a2> f73374l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<C27814a2> aVar) {
            super(0);
            this.f73374l = aVar;
        }

        @Override // Y41.a
        public final C27814a2 invoke() {
            return this.f73374l.invoke();
        }
    }

    @Inject
    public r(@Y61.k h31.e<Gson> eVar, @Y61.k Y41.a<? extends Map<AdvertDetailsBlockId, com.avito.android.advert_core.blocks.a>> aVar, @Y61.k Y41.a<C27814a2> aVar2) {
        this.f73370a = eVar;
        this.f73371b = C42727D.c(new b(aVar2));
        this.f73372c = C42727D.c(new a(aVar));
    }

    @Override // com.avito.android.advert.item.beduin.v2.q
    @Y61.k
    public final List<com.avito.conveyor_item.a> a(@Y61.k String str) {
        Object next;
        List<PersistableSpannedItem> listA;
        InterfaceC42726C interfaceC42726C = this.f73371b;
        Iterator<T> it = ((C27814a2) interfaceC42726C.getValue()).getState().getValue().f406058a.f406080a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C42501e.a) next).f406083a.equals(str)) {
                break;
            }
        }
        C42501e.a aVar = (C42501e.a) next;
        if (aVar != null) {
            return aVar.f406084b;
        }
        AdvertDetailsWithMeta advertDetailsWithMeta = ((C27814a2) interfaceC42726C.getValue()).getState().getValue().f406058a.f406081b;
        if (advertDetailsWithMeta == null) {
            return C42784z0.f406748b;
        }
        AdvertDetailsStyle advertDetailsStyle = ((C27814a2) interfaceC42726C.getValue()).getState().getValue().f406058a.f406082c;
        AdvertDetailsBlockId advertDetailsBlockId = (AdvertDetailsBlockId) this.f73370a.get().d(AdvertDetailsBlockId.class, str);
        com.avito.android.advert_core.blocks.a aVar2 = (com.avito.android.advert_core.blocks.a) ((Map) this.f73372c.getValue()).get(advertDetailsBlockId);
        if (aVar2 == null || (listA = aVar2.a(new a.b(advertDetailsWithMeta, advertDetailsStyle, new AdvertDetailsBlock(advertDetailsBlockId, null, null, null, null), C42784z0.f406748b))) == null) {
            return C42784z0.f406748b;
        }
        ((C27814a2) interfaceC42726C.getValue()).accept(new InterfaceC42497a.b(str, listA));
        return listA;
    }
}
