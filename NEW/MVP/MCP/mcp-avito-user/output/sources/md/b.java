package Md;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.AuctionDetails;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionDetailsInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LMd/b;", "", "a", "b", "c", "d", "e", "LMd/b$a;", "LMd/b$b;", "LMd/b$c;", "LMd/b$d;", "LMd/b$e;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: AuctionDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMd/b$a;", "LMd/b;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10915a = new a();
    }

    /* compiled from: AuctionDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMd/b$b;", "LMd/b;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Md.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0690b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AuctionDetails f10916a;

        public C0690b(@k AuctionDetails auctionDetails) {
            this.f10916a = auctionDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0690b) && L.f(this.f10916a, ((C0690b) obj).f10916a);
        }

        public final int hashCode() {
            return this.f10916a.hashCode();
        }

        @k
        public final String toString() {
            return "ContentReceived(details=" + this.f10916a + ')';
        }
    }

    /* compiled from: AuctionDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMd/b$c;", "LMd/b;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10917a;

        public c(@k DeepLink deepLink) {
            this.f10917a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f10917a, ((c) obj).f10917a);
        }

        public final int hashCode() {
            return this.f10917a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClickHappened(deeplink="), this.f10917a, ')');
        }
    }

    /* compiled from: AuctionDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMd/b$d;", "LMd/b;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f10918a = new d();
    }

    /* compiled from: AuctionDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMd/b$e;", "LMd/b;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10919a;

        public e(@k String str) {
            this.f10919a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f10919a, ((e) obj).f10919a);
        }

        public final int hashCode() {
            return this.f10919a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkClickHappened(url="), this.f10919a, ')');
        }
    }
}
