package com.avito.android.advert_collection;

import com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertCollectionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/i;", "", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface i {

    /* compiled from: AdvertCollectionInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC43160i a(i iVar, Map map, int i12) {
            Map mapC = P0.c();
            if ((i12 & 2) != 0) {
                map = P0.c();
            }
            return iVar.c(mapC, map);
        }
    }

    @Y61.k
    InterfaceC43160i<AdvertCollectionInternalAction> a();

    @Y61.k
    InterfaceC43160i<AdvertCollectionInternalAction> b(@Y61.k String str);

    @Y61.k
    InterfaceC43160i<AdvertCollectionInternalAction> c(@Y61.k Map<String, Integer> map, @Y61.k Map<String, String> map2);

    @Y61.k
    InterfaceC43160i<AdvertCollectionInternalAction> d();

    @Y61.k
    InterfaceC43160i<AdvertCollectionInternalAction> e();

    @Y61.k
    InterfaceC43160i<AdvertCollectionInternalAction> f(boolean z12);

    @Y61.k
    InterfaceC43160i<AdvertCollectionInternalAction> g();

    @Y61.k
    InterfaceC43160i<AdvertCollectionInternalAction> h(@Y61.k String str);
}
