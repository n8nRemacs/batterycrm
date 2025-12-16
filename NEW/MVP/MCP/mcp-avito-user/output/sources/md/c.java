package Md;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionDetailsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LMd/c;", "", "a", "b", "c", "d", "LMd/c$a;", "LMd/c$b;", "LMd/c$c;", "LMd/c$d;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: AuctionDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMd/c$a;", "LMd/c;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10920a = new a();
    }

    /* compiled from: AuctionDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMd/c$b;", "LMd/c;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f10921a = new b();
    }

    /* compiled from: AuctionDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMd/c$c;", "LMd/c;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Md.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0691c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10922a;

        public C0691c(@k DeepLink deepLink) {
            this.f10922a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0691c) && L.f(this.f10922a, ((C0691c) obj).f10922a);
        }

        public final int hashCode() {
            return this.f10922a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f10922a, ')');
        }
    }

    /* compiled from: AuctionDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMd/c$d;", "LMd/c;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10923a;

        public d(@k String str) {
            this.f10923a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f10923a, ((d) obj).f10923a);
        }

        public final int hashCode() {
            return this.f10923a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenLink(url="), this.f10923a, ')');
        }
    }
}
