package vF0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: TravelSearchState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"LvF0/e;", "", "a", "b", "c", "d", "e", "LvF0/e$b;", "LvF0/e$c;", "LvF0/e$d;", "LvF0/e$e;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f440591a = a.f440592a;

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/e$a;", "", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f440592a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C12757e f440593b = new C12757e(true);
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/e$b;", "LvF0/e;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f440594b = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1582237347;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/e$c;", "LvF0/e;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f440595b = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1582388062;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/e$d;", "LvF0/e;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f440596b = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 880945105;
        }

        @k
        public final String toString() {
            return "Filters";
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/e$e;", "LvF0/e;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.e$e, reason: collision with other inner class name */
    public static final /* data */ class C12757e implements e {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f440597b;

        public C12757e(boolean z12) {
            this.f440597b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12757e) && this.f440597b == ((C12757e) obj).f440597b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440597b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Loading(shouldShowSkeleton="), this.f440597b, ')');
        }
    }
}
