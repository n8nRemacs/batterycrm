package com.avito.android.messenger.map.search;

import androidx.compose.runtime.internal.P;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggest;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: GeoSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/h;", "LS20/a;", "Lcom/avito/android/messenger/map/search/h$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface h extends S20.a<a> {

    /* compiled from: GeoSearchInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/search/h$a;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final C5781a f196562c = new C5781a(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final a f196563d = new a(C42784z0.f406748b, new b.a());

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<GeoSearchSuggest> f196564a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.mvi.b<List<GeoSearchSuggest>> f196565b;

        /* compiled from: GeoSearchInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/h$a$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.map.search.h$a$a, reason: collision with other inner class name */
        public static final class C5781a {
            public /* synthetic */ C5781a(C42822w c42822w) {
                this();
            }

            public C5781a() {
            }
        }

        public a(@Y61.k List<GeoSearchSuggest> list, @Y61.k com.avito.android.mvi.b<List<GeoSearchSuggest>> bVar) {
            this.f196564a = list;
            this.f196565b = bVar;
        }

        public static a a(a aVar, List list, com.avito.android.mvi.b bVar, int i12) {
            if ((i12 & 1) != 0) {
                list = aVar.f196564a;
            }
            if ((i12 & 2) != 0) {
                bVar = aVar.f196565b;
            }
            aVar.getClass();
            return new a(list, bVar);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f196564a, aVar.f196564a) && L.f(this.f196565b, aVar.f196565b);
        }

        public final int hashCode() {
            return this.f196565b.hashCode() + (this.f196564a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return C43066x.F0("State(\n                |   favoritePlaces=" + this.f196564a + ",\n                |   searchSuggests=" + this.f196565b + "\n                |)");
        }
    }

    void ee(@Y61.k String str);
}
