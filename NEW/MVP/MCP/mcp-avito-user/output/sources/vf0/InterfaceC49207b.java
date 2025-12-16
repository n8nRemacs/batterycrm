package vF0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelSearchState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LvF0/b;", "", "a", "b", "c", "d", "LvF0/b$b;", "LvF0/b$c;", "LvF0/b$d;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vF0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC49207b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f440571a = a.f440572a;

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/b$a;", "", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f440572a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f440573b = c.f440575b;
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/b$b;", "LvF0/b;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12754b implements InterfaceC49207b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f440574b;

        public C12754b(@k ApiError apiError) {
            this.f440574b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12754b) && L.f(this.f440574b, ((C12754b) obj).f440574b);
        }

        public final int hashCode() {
            return this.f440574b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f440574b, ')');
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/b$c;", "LvF0/b;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.b$c */
    public static final /* data */ class c implements InterfaceC49207b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f440575b = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1349668759;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/b$d;", "LvF0/b;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.b$d */
    public static final /* data */ class d implements InterfaceC49207b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f440576b = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 741478192;
        }

        @k
        public final String toString() {
            return "Success";
        }
    }
}
