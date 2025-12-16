package vF0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelSearchState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LvF0/h;", "", "a", "b", "c", "d", "LvF0/h$b;", "LvF0/h$c;", "LvF0/h$d;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f440619a = a.f440620a;

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/h$a;", "", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f440620a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f440621b = new c(true);
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/h$b;", "LvF0/h;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f440622b = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1002800162;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/h$c;", "LvF0/h;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements h {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f440623b;

        public c(boolean z12) {
            this.f440623b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f440623b == ((c) obj).f440623b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440623b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Loading(shouldShowSkeleton="), this.f440623b, ')');
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/h$d;", "LvF0/h;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements h {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f440624b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f440625c;

        public d(@l String str, @l String str2) {
            this.f440624b = str;
            this.f440625c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f440624b, dVar.f440624b) && L.f(this.f440625c, dVar.f440625c);
        }

        public final int hashCode() {
            String str = this.f440624b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f440625c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Toolbar(title=");
            sb2.append(this.f440624b);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f440625c, ')');
        }
    }
}
