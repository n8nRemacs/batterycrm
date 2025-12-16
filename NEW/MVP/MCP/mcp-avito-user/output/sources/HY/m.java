package HY;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.persistence.messenger.P0;
import com.avito.android.remote.model.messenger.Channel;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: ChannelsPrivateListState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LHY/m;", "", "a", "b", "c", "d", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class m {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f7248m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final m f7249n;

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final MessengerUserHashInfo f7250a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f7251b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f7252c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c f7253d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<Q<Channel, P0>> f7254e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final b f7255f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7256g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<Q<Channel, P0>> f7257h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Map<String, List<HY.b>> f7258i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Long f7259j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Set<String> f7260k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7261l;

    /* compiled from: ChannelsPrivateListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/m$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ChannelsPrivateListState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/m$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f7262a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final d f7263b;

        public b(long j12, @Y61.k d dVar) {
            this.f7262a = j12;
            this.f7263b = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7262a == bVar.f7262a && L.f(this.f7263b, bVar.f7263b);
        }

        public final int hashCode() {
            return this.f7263b.hashCode() + (Long.hashCode(this.f7262a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ListBottomTimestamp(timestamp=" + this.f7262a + ", origin=" + this.f7263b + ')';
        }
    }

    /* compiled from: ChannelsPrivateListState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LHY/m$c;", "", "a", "b", "c", "LHY/m$c$a;", "LHY/m$c$b;", "LHY/m$c$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: ChannelsPrivateListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/m$c$a;", "LHY/m$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f7264a;

            public a(@Y61.k Throwable th2) {
                this.f7264a = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f7264a, ((a) obj).f7264a);
            }

            public final int hashCode() {
                return this.f7264a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Loading.Error("), this.f7264a, ')');
            }
        }

        /* compiled from: ChannelsPrivateListState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/m$c$b;", "LHY/m$c;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f7265a = new b();

            @Y61.k
            public final String toString() {
                return "Loading.Finished";
            }
        }

        /* compiled from: ChannelsPrivateListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/m$c$c;", "LHY/m$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: HY.m$c$c, reason: collision with other inner class name */
        public static final /* data */ class C0424c implements c {

            /* renamed from: a, reason: collision with root package name */
            public final long f7266a;

            public C0424c(long j12) {
                this.f7266a = j12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0424c) && this.f7266a == ((C0424c) obj).f7266a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f7266a);
            }

            @Y61.k
            public final String toString() {
                return "Loading.InProgress#" + this.f7266a;
            }
        }
    }

    /* compiled from: ChannelsPrivateListState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LHY/m$d;", "", "a", "b", "c", "LHY/m$d$a;", "LHY/m$d$b;", "LHY/m$d$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* compiled from: ChannelsPrivateListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/m$d$a;", "LHY/m$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final long f7267a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f7268b;

            public a(long j12, boolean z12) {
                this.f7267a = j12;
                this.f7268b = z12;
            }

            @Override // HY.m.d
            /* renamed from: a, reason: from getter */
            public final long getF7271a() {
                return this.f7267a;
            }

            @Override // HY.m.d
            /* renamed from: b, reason: from getter */
            public final boolean getF7270b() {
                return this.f7268b;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f7267a == aVar.f7267a && this.f7268b == aVar.f7268b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f7268b) + (Long.hashCode(this.f7267a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InitialLoading(loadingId=");
                sb2.append(this.f7267a);
                sb2.append(", offline=");
                return r.x(sb2, this.f7268b, ')');
            }
        }

        /* compiled from: ChannelsPrivateListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/m$d$b;", "LHY/m$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            public final long f7269a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f7270b;

            public b(long j12, boolean z12) {
                this.f7269a = j12;
                this.f7270b = z12;
            }

            @Override // HY.m.d
            /* renamed from: a, reason: from getter */
            public final long getF7271a() {
                return this.f7269a;
            }

            @Override // HY.m.d
            /* renamed from: b, reason: from getter */
            public final boolean getF7270b() {
                return this.f7270b;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f7269a == bVar.f7269a && this.f7270b == bVar.f7270b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f7270b) + (Long.hashCode(this.f7269a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NextPageLoading(loadingId=");
                sb2.append(this.f7269a);
                sb2.append(", offline=");
                return r.x(sb2, this.f7270b, ')');
            }
        }

        /* compiled from: ChannelsPrivateListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/m$d$c;", "LHY/m$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements d {

            /* renamed from: a, reason: collision with root package name */
            public final long f7271a;

            public c(long j12) {
                this.f7271a = j12;
            }

            @Override // HY.m.d
            /* renamed from: a, reason: from getter */
            public final long getF7271a() {
                return this.f7271a;
            }

            @Override // HY.m.d
            /* renamed from: b */
            public final boolean getF7270b() {
                return false;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f7271a == ((c) obj).f7271a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f7271a);
            }

            @Y61.k
            public final String toString() {
                return r.u(new StringBuilder("Refresh(loadingId="), this.f7271a, ')');
            }
        }

        /* renamed from: a */
        long getF7271a();

        /* renamed from: b */
        boolean getF7270b();
    }

    static {
        c.C0424c c0424c = new c.C0424c(-1L);
        c.b bVar = c.b.f7265a;
        C42784z0 c42784z0 = C42784z0.f406748b;
        f7249n = new m(null, c0424c, bVar, bVar, c42784z0, null, false, c42784z0, kotlin.collections.P0.c(), null, B0.f406639b, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.l MessengerUserHashInfo messengerUserHashInfo, @Y61.k c cVar, @Y61.k c cVar2, @Y61.k c cVar3, @Y61.k List<Q<Channel, P0>> list, @Y61.l b bVar, boolean z12, @Y61.k List<Q<Channel, P0>> list2, @Y61.k Map<String, ? extends List<HY.b>> map, @Y61.l Long l12, @Y61.k Set<String> set, boolean z13) {
        this.f7250a = messengerUserHashInfo;
        this.f7251b = cVar;
        this.f7252c = cVar2;
        this.f7253d = cVar3;
        this.f7254e = list;
        this.f7255f = bVar;
        this.f7256g = z12;
        this.f7257h = list2;
        this.f7258i = map;
        this.f7259j = l12;
        this.f7260k = set;
        this.f7261l = z13;
    }

    public static m a(m mVar, MessengerUserHashInfo messengerUserHashInfo, c cVar, c cVar2, c cVar3, ArrayList arrayList, b bVar, boolean z12, List list, Map map, Long l12, LinkedHashSet linkedHashSet, int i12) {
        MessengerUserHashInfo messengerUserHashInfo2 = (i12 & 1) != 0 ? mVar.f7250a : messengerUserHashInfo;
        c cVar4 = (i12 & 2) != 0 ? mVar.f7251b : cVar;
        c cVar5 = (i12 & 4) != 0 ? mVar.f7252c : cVar2;
        c cVar6 = (i12 & 8) != 0 ? mVar.f7253d : cVar3;
        List<Q<Channel, P0>> list2 = (i12 & 16) != 0 ? mVar.f7254e : arrayList;
        b bVar2 = (i12 & 32) != 0 ? mVar.f7255f : bVar;
        boolean z13 = (i12 & 64) != 0 ? mVar.f7256g : z12;
        List list3 = (i12 & 128) != 0 ? mVar.f7257h : list;
        Map map2 = (i12 & 256) != 0 ? mVar.f7258i : map;
        Long l13 = (i12 & 512) != 0 ? mVar.f7259j : l12;
        Set<String> set = (i12 & 1024) != 0 ? mVar.f7260k : linkedHashSet;
        boolean z14 = (i12 & 2048) != 0 ? mVar.f7261l : false;
        mVar.getClass();
        return new m(messengerUserHashInfo2, cVar4, cVar5, cVar6, list2, bVar2, z13, list3, map2, l13, set, z14);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f7250a, mVar.f7250a) && L.f(this.f7251b, mVar.f7251b) && L.f(this.f7252c, mVar.f7252c) && L.f(this.f7253d, mVar.f7253d) && L.f(this.f7254e, mVar.f7254e) && L.f(this.f7255f, mVar.f7255f) && this.f7256g == mVar.f7256g && L.f(this.f7257h, mVar.f7257h) && L.f(this.f7258i, mVar.f7258i) && L.f(this.f7259j, mVar.f7259j) && L.f(this.f7260k, mVar.f7260k) && this.f7261l == mVar.f7261l;
    }

    public final int hashCode() {
        MessengerUserHashInfo messengerUserHashInfo = this.f7250a;
        int iE2 = H.e((this.f7253d.hashCode() + ((this.f7252c.hashCode() + ((this.f7251b.hashCode() + ((messengerUserHashInfo == null ? 0 : messengerUserHashInfo.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.f7254e);
        b bVar = this.f7255f;
        int iC2 = AK.c.c(H.e(r.i((iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f7256g), 31, this.f7257h), 31, this.f7258i);
        Long l12 = this.f7259j;
        return Boolean.hashCode(this.f7261l) + androidx.media3.exoplayer.analytics.m.g(this.f7260k, (iC2 + (l12 != null ? l12.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        MessengerUserType messengerUserType;
        StringBuilder sb2 = new StringBuilder("ChannelsPrivateListState(\n                |   userId=");
        String strE = null;
        MessengerUserHashInfo messengerUserHashInfo = this.f7250a;
        sb2.append(messengerUserHashInfo != null ? messengerUserHashInfo.f430680b : null);
        sb2.append(",\n                |   userType=");
        if (messengerUserHashInfo != null && (messengerUserType = messengerUserHashInfo.f430681c) != null) {
            strE = com.avito.android.messenger.util.i.e(messengerUserType);
        }
        sb2.append(strE);
        sb2.append(",\n                |   \n                |   initialLoadingState=");
        sb2.append(this.f7251b);
        sb2.append(",\n                |   refreshState=");
        sb2.append(this.f7252c);
        sb2.append(", \n                |   nextPageLoadingState=");
        sb2.append(this.f7253d);
        sb2.append(",\n                |   \n                |   mainChannelsAndDrafts=(");
        D8.r(this.f7254e, sb2, ")[add logging to see contents],\n                |   mainListBottomTimestamp=");
        sb2.append(this.f7255f);
        sb2.append(", \n                |   mainHasMoreItems=");
        sb2.append(this.f7256g);
        sb2.append(", \n                |   \n                |   pinnedChannelsAndDrafts=(");
        D8.r(this.f7257h, sb2, ")[add logging to see contents],\n                |   \n                |   typingChannelIds=");
        sb2.append(this.f7260k);
        sb2.append(",\n                |   \n                |   channelsTags=");
        sb2.append(this.f7258i);
        sb2.append(",\n                |   \n                |   needInitialRequest=");
        sb2.append(this.f7261l);
        sb2.append("\n                |)");
        return C43066x.F0(sb2.toString());
    }
}
