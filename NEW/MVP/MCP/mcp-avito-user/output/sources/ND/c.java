package Nd;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LNd/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LNd/c$a;", "LNd/c$b;", "LNd/c$c;", "LNd/c$d;", "LNd/c$e;", "LNd/c$f;", "LNd/c$g;", "LNd/c$h;", "LNd/c$i;", "LNd/c$j;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNd/c$a;", "LNd/c;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f11628a = new a();
    }

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNd/c$b;", "LNd/c;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f11629a = new b();
    }

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNd/c$c;", "LNd/c;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nd.c$c, reason: collision with other inner class name */
    public static final class C0748c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0748c f11630a = new C0748c();
    }

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNd/c$d;", "LNd/c;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f11631a;

        public d(@k DeepLink deepLink) {
            this.f11631a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f11631a, ((d) obj).f11631a);
        }

        public final int hashCode() {
            return this.f11631a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(uri="), this.f11631a, ')');
        }
    }

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNd/c$e;", "LNd/c;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f11632a = new e();
    }

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNd/c$f;", "LNd/c;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f11633a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f11634b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f11635c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f11636d;

        public f(@l AttributedText attributedText, @l String str, @l String str2, @k ArrayList arrayList) {
            this.f11633a = arrayList;
            this.f11634b = attributedText;
            this.f11635c = str;
            this.f11636d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f11633a.equals(fVar.f11633a) && L.f(this.f11634b, fVar.f11634b) && L.f(this.f11635c, fVar.f11635c) && L.f(this.f11636d, fVar.f11636d);
        }

        public final int hashCode() {
            int iHashCode = this.f11633a.hashCode() * 31;
            AttributedText attributedText = this.f11634b;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str = this.f11635c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f11636d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowLoadedContent(items=");
            sb2.append(this.f11633a);
            sb2.append(", terms=");
            sb2.append(this.f11634b);
            sb2.append(", applyButtonText=");
            sb2.append(this.f11635c);
            sb2.append(", cancelButtonText=");
            return C22026a.c(sb2, this.f11636d, ')');
        }
    }

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNd/c$g;", "LNd/c;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f11637a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f11638b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f11639c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f11640d;

        /* JADX WARN: Multi-variable type inference failed */
        public g(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @l AttributedText attributedText, @l String str, @l String str2) {
            this.f11637a = list;
            this.f11638b = attributedText;
            this.f11639c = str;
            this.f11640d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f11637a, gVar.f11637a) && L.f(this.f11638b, gVar.f11638b) && L.f(this.f11639c, gVar.f11639c) && L.f(this.f11640d, gVar.f11640d);
        }

        public final int hashCode() {
            int iHashCode = this.f11637a.hashCode() * 31;
            AttributedText attributedText = this.f11638b;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str = this.f11639c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f11640d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowLoadedContentV2(items=");
            sb2.append(this.f11637a);
            sb2.append(", terms=");
            sb2.append(this.f11638b);
            sb2.append(", applyButtonText=");
            sb2.append(this.f11639c);
            sb2.append(", cancelButtonText=");
            return C22026a.c(sb2, this.f11640d, ')');
        }
    }

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNd/c$h;", "LNd/c;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11641a;

        public h(@k String str) {
            this.f11641a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f11641a, ((h) obj).f11641a);
        }

        public final int hashCode() {
            return this.f11641a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowOverlayError(message="), this.f11641a, ')');
        }
    }

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNd/c$i;", "LNd/c;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f11642a = new i();
    }

    /* compiled from: AuctionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNd/c$j;", "LNd/c;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11643a;

        public j(@k String str) {
            this.f11643a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f11643a, ((j) obj).f11643a);
        }

        public final int hashCode() {
            return this.f11643a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastError(message="), this.f11643a, ')');
        }
    }
}
