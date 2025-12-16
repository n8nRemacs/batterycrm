package Z80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchPositionEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LZ80/a;", "", "a", "b", "c", "d", "LZ80/a$a;", "LZ80/a$b;", "LZ80/a$c;", "LZ80/a$d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: SearchPositionEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ80/a$a;", "LZ80/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Z80.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1423a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1423a f19930a = new C1423a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1423a);
        }

        public final int hashCode() {
            return -2106293036;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SearchPositionEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ80/a$b;", "LZ80/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f19931a;

        public b(@k DeepLink deepLink) {
            this.f19931a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f19931a, ((b) obj).f19931a);
        }

        public final int hashCode() {
            return this.f19931a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Link(deepLink="), this.f19931a, ')');
        }
    }

    /* compiled from: SearchPositionEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ80/a$c;", "LZ80/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 2112219988;
        }

        @k
        public final String toString() {
            return "ScrollToItem(id=position_in_search_competitors)";
        }
    }

    /* compiled from: SearchPositionEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ80/a$d;", "LZ80/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f19932a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f19933b;

        public d(@k DeepLink deepLink, @k String str) {
            this.f19932a = deepLink;
            this.f19933b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f19932a, dVar.f19932a) && L.f(this.f19933b, dVar.f19933b);
        }

        public final int hashCode() {
            return this.f19933b.hashCode() + (this.f19932a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SortLink(deepLink=");
            sb2.append(this.f19932a);
            sb2.append(", slug=");
            return C22026a.c(sb2, this.f19933b, ')');
        }
    }
}
