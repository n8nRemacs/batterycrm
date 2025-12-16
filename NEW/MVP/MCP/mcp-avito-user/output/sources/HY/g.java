package HY;

import HY.m;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.persistence.messenger.P0;
import com.avito.android.remote.model.messenger.Channel;
import com.yandex.div2.D8;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListPrivateAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LHY/g;", "LHY/a;", "a", "b", "LHY/g$a;", "LHY/g$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g extends HY.a {

    /* compiled from: ChannelsListPrivateAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"LHY/g$a;", "LHY/g;", "LHY/l;", "a", "LHY/g$a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends g, l {

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/g$a$a;", "LHY/g$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: HY.g$a$a, reason: collision with other inner class name */
        public static final class C0418a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C0418a f7198a = new C0418a();
        }
    }

    /* compiled from: ChannelsListPrivateAction.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"LHY/g$b;", "LHY/g;", "LHY/o;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "LHY/g$b$a;", "LHY/g$b$b;", "LHY/g$b$c;", "LHY/g$b$d;", "LHY/g$b$e;", "LHY/g$b$f;", "LHY/g$b$g;", "LHY/g$b$h;", "LHY/g$b$i;", "LHY/g$b$j;", "LHY/g$b$k;", "LHY/g$b$l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends g, o {

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/g$b$a;", "LHY/g$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f7199a;

            public a(@Y61.k String str) {
                this.f7199a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f7199a, ((a) obj).f7199a);
            }

            public final int hashCode() {
                return this.f7199a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("BlacklistUpdated(blackListEventOwnerId="), this.f7199a, ')');
            }
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/g$b$b;", "LHY/g$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: HY.g$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0419b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Map<String, List<HY.b>> f7200a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0419b(@Y61.k Map<String, ? extends List<HY.b>> map) {
                this.f7200a = map;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0419b) && L.f(this.f7200a, ((C0419b) obj).f7200a);
            }

            public final int hashCode() {
                return this.f7200a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return r.w(new StringBuilder("ChannelTagsUpdated(channelsTags="), this.f7200a, ')');
            }
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/g$b$c;", "LHY/g$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f7201a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f7202b;

            public c(@Y61.k String str, @Y61.k String str2) {
                this.f7201a = str;
                this.f7202b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f7201a, cVar.f7201a) && L.f(this.f7202b, cVar.f7202b);
            }

            public final int hashCode() {
                return this.f7202b.hashCode() + (this.f7201a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ChatTypingStart(channelId=");
                sb2.append(this.f7201a);
                sb2.append(", fromId=");
                return C22026a.c(sb2, this.f7202b, ')');
            }
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/g$b$d;", "LHY/g$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f7203a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f7204b;

            public d(@Y61.k String str, @Y61.k String str2) {
                this.f7203a = str;
                this.f7204b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f7203a, dVar.f7203a) && L.f(this.f7204b, dVar.f7204b);
            }

            public final int hashCode() {
                return this.f7204b.hashCode() + (this.f7203a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ChatTypingStop(channelId=");
                sb2.append(this.f7203a);
                sb2.append(", fromId=");
                return C22026a.c(sb2, this.f7204b, ')');
            }
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/g$b$e;", "LHY/g$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f7205a = new e();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1374591207;
            }

            @Y61.k
            public final String toString() {
                return "FilterChanged";
            }
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/g$b$f;", "LHY/g$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final f f7206a = new f();
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/g$b$g;", "LHY/g$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: HY.g$b$g, reason: collision with other inner class name */
        public static final class C0420g implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C0420g f7207a = new C0420g();
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/g$b$h;", "LHY/g$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class h implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final List<Q<Channel, P0>> f7208a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final m.d f7209b;

            public h(@Y61.k List<Q<Channel, P0>> list, @Y61.k m.d dVar) {
                this.f7208a = list;
                this.f7209b = dVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return L.f(this.f7208a, hVar.f7208a) && L.f(this.f7209b, hVar.f7209b);
            }

            public final int hashCode() {
                return this.f7209b.hashCode() + (this.f7208a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NewChannelsAndDraftsFromDb(\n                    |newChannelsAndDrafts=(");
                D8.r(this.f7208a, sb2, ")[add logging to see contents],\n                    |origin=");
                sb2.append(this.f7209b);
                sb2.append("\n                |)");
                return C43066x.F0(sb2.toString());
            }
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/g$b$i;", "LHY/g$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class i implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f7210a;

            public i(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
                this.f7210a = messengerUserHashInfo;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && L.f(this.f7210a, ((i) obj).f7210a);
            }

            public final int hashCode() {
                return this.f7210a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "NewUserInfo(newUserInfo=" + this.f7210a + ')';
            }
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/g$b$j;", "LHY/g$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class j implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f7211a;

            public j(@Y61.k String str) {
                this.f7211a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && L.f(this.f7211a, ((j) obj).f7211a);
            }

            public final int hashCode() {
                return this.f7211a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("PinnedStatusChanged(pinEventOwnerId="), this.f7211a, ')');
            }
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/g$b$k;", "LHY/g$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class k implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final k f7212a = new k();
        }

        /* compiled from: ChannelsListPrivateAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/g$b$l;", "LHY/g$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class l implements b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f7213a;

            public l(boolean z12) {
                this.f7213a = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && this.f7213a == ((l) obj).f7213a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f7213a);
            }

            @Y61.k
            public final String toString() {
                return r.x(new StringBuilder("SocketReconnect(notificationQueueWasRestored="), this.f7213a, ')');
            }
        }
    }
}
