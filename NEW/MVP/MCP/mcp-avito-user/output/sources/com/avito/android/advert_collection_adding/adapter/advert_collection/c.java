package com.avito.android.advert_collection_adding.adapter.advert_collection;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertCollectionPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_collection_adding/adapter/advert_collection/c;", "LTV0/d;", "Lcom/avito/android/advert_collection_adding/adapter/advert_collection/g;", "Lcom/avito/android/advert_collection_adding/adapter/advert_collection/AdvertCollectionItem;", "a", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c extends TV0.d<g, AdvertCollectionItem> {

    /* compiled from: AdvertCollectionPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/adapter/advert_collection/c$a;", "", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f81761a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f81762b;

        public a(@k String str, @k DeepLink deepLink) {
            this.f81761a = str;
            this.f81762b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f81761a, aVar.f81761a) && L.f(this.f81762b, aVar.f81762b);
        }

        public final int hashCode() {
            return this.f81762b.hashCode() + (this.f81761a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertCollectionData(collectionId=");
            sb2.append(this.f81761a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f81762b, ')');
        }
    }

    @k
    InterfaceC43160i<a> g();
}
