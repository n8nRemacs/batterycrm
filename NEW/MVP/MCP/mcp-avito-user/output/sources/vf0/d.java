package vF0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelSearchState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LvF0/d;", "", "a", "b", "c", "d", "LvF0/d$b;", "LvF0/d$c;", "LvF0/d$d;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f440585a = a.f440586a;

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/d$a;", "", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f440586a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f440587b = c.f440589b;
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/d$b;", "LvF0/d;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f440588b;

        public b(@k ApiError apiError) {
            this.f440588b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f440588b, ((b) obj).f440588b);
        }

        public final int hashCode() {
            return this.f440588b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f440588b, ')');
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/d$c;", "LvF0/d;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f440589b = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1434864363;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/d$d;", "LvF0/d;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C12756d implements d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C12756d f440590b = new C12756d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12756d);
        }

        public final int hashCode() {
            return -768955982;
        }

        @k
        public final String toString() {
            return "Success";
        }
    }
}
