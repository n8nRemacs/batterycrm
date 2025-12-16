package HY;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.messenger.channels.mvi.interactor.z;
import com.avito.android.printable_text.PrintableText;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListInternalAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LHY/d;", "LHY/a;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "LHY/d$a;", "LHY/d$b;", "LHY/d$c;", "LHY/d$d;", "LHY/d$e;", "LHY/d$f;", "LHY/d$g;", "LHY/d$h;", "LHY/d$i;", "LHY/d$j;", "LHY/d$k;", "LHY/d$l;", "LHY/d$m;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d extends HY.a {

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/d$a;", "LHY/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f7171a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -543799429;
        }

        @Y61.k
        public final String toString() {
            return "CalledScrollToTop";
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/d$b;", "LHY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f7172a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7173b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f7174c;

        public b(@Y61.k String str, int i12, @Y61.l String str2) {
            this.f7172a = str;
            this.f7173b = i12;
            this.f7174c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f7172a, bVar.f7172a) && this.f7173b == bVar.f7173b && L.f(this.f7174c, bVar.f7174c);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f7173b, this.f7172a.hashCode() * 31, 31);
            String str = this.f7174c;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChannelClick(channelId=");
            sb2.append(this.f7172a);
            sb2.append(", position=");
            sb2.append(this.f7173b);
            sb2.append(", flowId=");
            return C22026a.c(sb2, this.f7174c, ')');
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/d$c;", "LHY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final z f7175a;

        public c(@Y61.k z zVar) {
            this.f7175a = zVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f7175a, ((c) obj).f7175a);
        }

        public final int hashCode() {
            return this.f7175a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChannelLocallyDeleted(toastInfo=" + this.f7175a + ')';
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/d$d;", "LHY/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: HY.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0416d implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0416d f7176a = new C0416d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0416d);
        }

        public final int hashCode() {
            return -639022517;
        }

        @Y61.k
        public final String toString() {
            return "HideChannelMenu";
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/d$e;", "LHY/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f7177a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 382411310;
        }

        @Y61.k
        public final String toString() {
            return "HideConformationDialog";
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/d$f;", "LHY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Set<String> f7178a;

        public f(@Y61.k Set<String> set) {
            this.f7178a = set;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f7178a, ((f) obj).f7178a);
        }

        public final int hashCode() {
            return this.f7178a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.u(new StringBuilder("NewLocallyDeletedChannelsList(channelsToBeDeleted="), this.f7178a, ')');
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/d$g;", "LHY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ChannelsListItem f7179a;

        public g(@Y61.l ChannelsListItem channelsListItem) {
            this.f7179a = channelsListItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f7179a, ((g) obj).f7179a);
        }

        public final int hashCode() {
            ChannelsListItem channelsListItem = this.f7179a;
            if (channelsListItem == null) {
                return 0;
            }
            return channelsListItem.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "NewPrivateBannerState(newBannerItem=" + this.f7179a + ')';
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/d$h;", "LHY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final HY.m f7180a;

        public h(@Y61.k HY.m mVar) {
            this.f7180a = mVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f7180a, ((h) obj).f7180a);
        }

        public final int hashCode() {
            return this.f7180a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "NewPrivateListState(privateListState=" + this.f7180a + ')';
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/d$i;", "LHY/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f7181a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1864787981;
        }

        @Y61.k
        public final String toString() {
            return "OpenNotificationSettings";
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/d$j;", "LHY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ChannelsListItem.b f7182a;

        public j(@Y61.k ChannelsListItem.b bVar) {
            this.f7182a = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f7182a, ((j) obj).f7182a);
        }

        public final int hashCode() {
            return this.f7182a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowChannelMenu(item=" + this.f7182a + ')';
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/d$k;", "LHY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f7183a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f7184b;

        public k(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
            this.f7183a = str;
            this.f7184b = messengerUserHashInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f7183a, kVar.f7183a) && L.f(this.f7184b, kVar.f7184b);
        }

        public final int hashCode() {
            return this.f7184b.hashCode() + (this.f7183a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowDeleteChannelConfirm(channelId=" + this.f7183a + ", userInfo=" + this.f7184b + ')';
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/d$l;", "LHY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f7185a;

        public l(@Y61.k PrintableText printableText) {
            this.f7185a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f7185a, ((l) obj).f7185a);
        }

        public final int hashCode() {
            return this.f7185a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowDeleteChannelError(text="), this.f7185a, ')');
        }
    }

    /* compiled from: ChannelsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/d$m;", "LHY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7186a;

        public m(boolean z12) {
            this.f7186a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f7186a == ((m) obj).f7186a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f7186a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("UnreadFilterStateChanged(isUnreadChannels="), this.f7186a, ')');
        }
    }
}
