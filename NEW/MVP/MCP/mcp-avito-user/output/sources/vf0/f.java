package vF0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelSearchOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LvF0/f;", "", "a", "b", "c", "d", "LvF0/f$a;", "LvF0/f$b;", "LvF0/f$c;", "LvF0/f$d;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface f {

    /* compiled from: TravelSearchOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/f$a;", "LvF0/f;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f440598a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -524597584;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TravelSearchOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/f$b;", "LvF0/f;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440599a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f440600b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f440601c;

        public b(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
            this.f440599a = deepLink;
            this.f440600b = bundle;
            this.f440601c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f440599a, bVar.f440599a) && L.f(this.f440600b, bVar.f440600b) && L.f(this.f440601c, bVar.f440601c);
        }

        public final int hashCode() {
            int iHashCode = this.f440599a.hashCode() * 31;
            Bundle bundle = this.f440600b;
            int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            String str = this.f440601c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f440599a);
            sb2.append(", args=");
            sb2.append(this.f440600b);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f440601c, ')');
        }
    }

    /* compiled from: TravelSearchOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/f$c;", "LvF0/f;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SearchParams f440602a;

        public c(@k SearchParams searchParams) {
            this.f440602a = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f440602a, ((c) obj).f440602a);
        }

        public final int hashCode() {
            return this.f440602a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.bxcontent.mvi.entity.f.m(new StringBuilder("InitInlineFilters(searchParams="), this.f440602a, ')');
        }
    }

    /* compiled from: TravelSearchOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/f$d;", "LvF0/f;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements f {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Filter f440603a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f440604b;

        public d(@k SearchParams searchParams, @l Filter filter) {
            this.f440603a = filter;
            this.f440604b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f440603a, dVar.f440603a) && L.f(this.f440604b, dVar.f440604b);
        }

        public final int hashCode() {
            Filter filter = this.f440603a;
            return this.f440604b.hashCode() + ((filter == null ? 0 : filter.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilter(filter=");
            sb2.append(this.f440603a);
            sb2.append(", searchParams=");
            return com.avito.android.bxcontent.mvi.entity.f.m(sb2, this.f440604b, ')');
        }
    }
}
