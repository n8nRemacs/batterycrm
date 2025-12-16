package Md;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.AuctionDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionDetailsState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LMd/d;", "", "a", "b", "LMd/d$a;", "LMd/d$b;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d {

    /* compiled from: AuctionDetailsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMd/d$a;", "LMd/d;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10924a = new a();
    }

    /* compiled from: AuctionDetailsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMd/d$b;", "LMd/d;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AuctionDetails f10925a;

        public b(@k AuctionDetails auctionDetails) {
            this.f10925a = auctionDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f10925a, ((b) obj).f10925a);
        }

        public final int hashCode() {
            return this.f10925a.hashCode();
        }

        @k
        public final String toString() {
            return "Success(details=" + this.f10925a + ')';
        }
    }
}
