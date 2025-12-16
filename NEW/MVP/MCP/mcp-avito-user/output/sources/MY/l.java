package MY;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.a;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context.Placeholder;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelPrivateAction.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u00012\u00020\u0002:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"LMY/l;", "LMY/f;", "LNY/j;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "LMY/l$a;", "LMY/l$b;", "LMY/l$c;", "LMY/l$d;", "LMY/l$e;", "LMY/l$f;", "LMY/l$g;", "LMY/l$h;", "LMY/l$i;", "LMY/l$j;", "LMY/l$k;", "LMY/l$l;", "LMY/l$m;", "LMY/l$n;", "LMY/l$o;", "LMY/l$p;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface l extends MY.f, NY.j {

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$a;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f10793a;

        public a(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
            this.f10793a = messengerUserHashInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f10793a, ((a) obj).f10793a);
        }

        public final int hashCode() {
            return this.f10793a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ContextLoadingError(currentUserInfo=" + this.f10793a + ')';
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/l$b;", "LMY/l;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f10794a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -645531688;
        }

        @Y61.k
        public final String toString() {
            return "EmptyContext";
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$c;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f10795a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ChannelContext f10796b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<User> f10797c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Map<String, VideoInfo> f10798d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final MY.c f10799e;

        public c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k ChannelContext channelContext, @Y61.k List<User> list, @Y61.k Map<String, VideoInfo> map, @Y61.k MY.c cVar) {
            this.f10795a = messengerUserHashInfo;
            this.f10796b = channelContext;
            this.f10797c = list;
            this.f10798d = map;
            this.f10799e = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f10795a, cVar.f10795a) && L.f(this.f10796b, cVar.f10796b) && L.f(this.f10797c, cVar.f10797c) && L.f(this.f10798d, cVar.f10798d) && L.f(this.f10799e, cVar.f10799e);
        }

        public final int hashCode() {
            return this.f10799e.hashCode() + AK.c.c(H.e((this.f10796b.hashCode() + (this.f10795a.hashCode() * 31)) * 31, 31, this.f10797c), 31, this.f10798d);
        }

        @Y61.k
        public final String toString() {
            String string;
            String str;
            StringBuilder sb2 = new StringBuilder("LoadedContext(currentUserId = ");
            sb2.append(com.avito.android.messenger.util.i.b(this.f10795a, new Q[0]));
            sb2.append(", context = ");
            ChannelContext channelContext = this.f10796b;
            if (channelContext instanceof ChannelContext.Item) {
                StringBuilder sb3 = new StringBuilder("ChannelContext.Item(id = ");
                ChannelContext.Item item = (ChannelContext.Item) channelContext;
                sb3.append(item.getId());
                sb3.append(", title = ");
                sb3.append(item.getTitle());
                sb3.append(", userId = ");
                sb3.append(item.getUserId());
                sb3.append(", replyTime = ");
                sb3.append(item.getReplyTime());
                sb3.append(", assistantReplyTimePlaceholder = ");
                sb3.append(item.getAssistantReplyTimePlaceholder());
                sb3.append(", hidePhone = ");
                sb3.append(item.getHidePhone());
                sb3.append(", placeholder=");
                Placeholder placeholder = item.getPlaceholder();
                if (placeholder != null) {
                    str = "Placeholder(description=" + placeholder.getDescription() + ", button=" + placeholder.getButton() + ", ...)";
                } else {
                    str = null;
                }
                string = AK.c.s(sb3, str, ", ...)");
            } else if (channelContext instanceof ChannelContext.ReDeal) {
                string = "ChannelContext.ReDeal(...)";
            } else if (channelContext instanceof ChannelContext.System) {
                StringBuilder sb4 = new StringBuilder("ChannelContext.System(name = ");
                ChannelContext.System system = (ChannelContext.System) channelContext;
                sb4.append(system.getName());
                sb4.append(", status = ");
                sb4.append(system.getStatus());
                sb4.append(", description = ");
                sb4.append(system.getDescription());
                sb4.append(", ...)");
                string = sb4.toString();
            } else if (channelContext instanceof ChannelContext.Unknown) {
                string = "ChannelContext.Unknown(type='" + ((ChannelContext.Unknown) channelContext).getType() + "')";
            } else {
                if (!(channelContext instanceof ChannelContext.UserToUser)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = "ChannelContext.UserToUser(...)";
            }
            sb2.append(string);
            sb2.append(", users = ");
            StringBuilder sb5 = new StringBuilder("(");
            List<User> list = this.f10797c;
            sb5.append(list.size());
            sb5.append(')');
            List<User> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add("User(id=" + ((User) it.next()).getId() + ", ...)");
            }
            sb5.append(arrayList);
            sb2.append(sb5.toString());
            sb2.append(", videoInfoById = ");
            sb2.append(this.f10798d);
            sb2.append(", channelInfo = ");
            sb2.append(this.f10799e);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$d;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f10800a;

        public d(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
            this.f10800a = messengerUserHashInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f10800a, ((d) obj).f10800a);
        }

        public final int hashCode() {
            return this.f10800a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LoadedOnlyUserId(currentUserInfo=" + this.f10800a + ')';
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$e;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a.b f10801a;

        public e(@Y61.k a.b bVar) {
            this.f10801a = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f10801a, ((e) obj).f10801a);
        }

        public final int hashCode() {
            return this.f10801a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MessageSpamActionsInteractorStateUpdated(interactorState=" + this.f10801a + ')';
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/l$f;", "LMY/l;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f10802a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -928029082;
        }

        @Y61.k
        public final String toString() {
            return "MessagesLoadedEmpty";
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$g;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Q<LocalMessage, Q1>> f10803a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<String, VideoInfo> f10804b;

        public g(@Y61.k List<Q<LocalMessage, Q1>> list, @Y61.k Map<String, VideoInfo> map) {
            this.f10803a = list;
            this.f10804b = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f10803a, gVar.f10803a) && L.f(this.f10804b, gVar.f10804b);
        }

        public final int hashCode() {
            return this.f10804b.hashCode() + (this.f10803a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MessagesLoadedNonEmpty(messagesAndMetaInfo = (");
            D8.r(this.f10803a, sb2, ")[...], videoInfoById = (");
            sb2.append(this.f10804b.size());
            sb2.append(")[...])");
            return sb2.toString();
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/l$h;", "LMY/l;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f10805a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 898786254;
        }

        @Y61.k
        public final String toString() {
            return "MessagesLoadingError";
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$i;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements l {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10806a;

        public i(boolean z12) {
            this.f10806a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f10806a == ((i) obj).f10806a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10806a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("MessagesLoadingStart(shouldTriggerInteractor="), this.f10806a, ')');
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/l$j;", "LMY/l;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f10807a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 412489368;
        }

        @Y61.k
        public final String toString() {
            return "PaginationError";
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$k;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements l {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10808a;

        public k(boolean z12) {
            this.f10808a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f10808a == ((k) obj).f10808a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10808a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("PaginationStart(shouldTriggerInteractor="), this.f10808a, ')');
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$l;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: MY.l$l, reason: collision with other inner class name */
    public static final /* data */ class C0686l implements l {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10809a;

        public C0686l(boolean z12) {
            this.f10809a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0686l) && this.f10809a == ((C0686l) obj).f10809a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10809a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("PaginationSuccess(paginationIsEnabled="), this.f10809a, ')');
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/l$m;", "LMY/l;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f10810a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 997016619;
        }

        @Y61.k
        public final String toString() {
            return "ScreenOpened";
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$n;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f10811a;

        public n(@Y61.k ArrayList arrayList) {
            this.f10811a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f10811a.equals(((n) obj).f10811a);
        }

        public final int hashCode() {
            return this.f10811a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SyncMissingUsersEvent(messages = (" + this.f10811a.size() + ")[...])";
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/l$o;", "LMY/l;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f10812a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1241753531;
        }

        @Y61.k
        public final String toString() {
            return "UsersFinishedTyping";
        }
    }

    /* compiled from: ChannelPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/l$p;", "LMY/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f10813a;

        public p(@Y61.k String str) {
            this.f10813a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f10813a, ((p) obj).f10813a);
        }

        public final int hashCode() {
            return this.f10813a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UsersStartedTyping(typingUserId="), this.f10813a, ')');
        }
    }
}
