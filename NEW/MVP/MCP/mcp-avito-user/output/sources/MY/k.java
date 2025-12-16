package MY;

import android.view.MenuItem;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChannelAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LMY/k;", "LMY/b;", "a", "b", "LMY/k$a;", "LMY/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface k extends MY.b {

    /* compiled from: ChannelAction.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LMY/k$a;", "LMY/k;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LMY/k$a$a;", "LMY/k$a$b;", "LMY/k$a$c;", "LMY/k$a$d;", "LMY/k$a$e;", "LMY/k$a$f;", "LMY/k$a$g;", "LMY/k$a$h;", "LMY/k$a$i;", "LMY/k$a$j;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends k {

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/k$a$a;", "LMY/k$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: MY.k$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0684a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final DeepLink f10766a;

            public C0684a(@Y61.k DeepLink deepLink) {
                this.f10766a = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0684a) && L.f(this.f10766a, ((C0684a) obj).f10766a);
            }

            public final int hashCode() {
                return this.f10766a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("AppCallMessageClicked(deeplink="), this.f10766a, ')');
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/k$a$b;", "LMY/k$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final MenuItem f10767a;

            public b(@Y61.l MenuItem menuItem) {
                this.f10767a = menuItem;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f10767a, ((b) obj).f10767a);
            }

            public final int hashCode() {
                MenuItem menuItem = this.f10767a;
                if (menuItem == null) {
                    return 0;
                }
                return menuItem.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "CopyPlatformMessageClicked(item=" + this.f10767a + ')';
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/k$a$c;", "LMY/k$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final T1.d f10768a;

            public c(@Y61.k T1.d dVar) {
                this.f10768a = dVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f10768a, ((c) obj).f10768a);
            }

            public final int hashCode() {
                return this.f10768a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "FileMessageCancelClicked(message=" + this.f10768a + ')';
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LMY/k$a$d;", "LMY/k$a;", "LNY/i;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements a, NY.i {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final T1.d f10769a;

            public d(@Y61.k T1.d dVar) {
                this.f10769a = dVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f10769a, ((d) obj).f10769a);
            }

            public final int hashCode() {
                return this.f10769a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "MessageAvatarClicked(message=" + this.f10769a + ')';
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/k$a$e;", "LMY/k$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final LocalMessage f10770a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f10771b;

            public e(@Y61.k LocalMessage localMessage, @Y61.k String str) {
                this.f10770a = localMessage;
                this.f10771b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return L.f(this.f10770a, eVar.f10770a) && L.f(this.f10771b, eVar.f10771b);
            }

            public final int hashCode() {
                return this.f10771b.hashCode() + (this.f10770a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MessageLinkClicked(localMessage=");
                sb2.append(this.f10770a);
                sb2.append(", url=");
                return C22026a.c(sb2, this.f10771b, ')');
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/k$a$f;", "LMY/k$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final T1.d.b f10772a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final LocalMessage f10773b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f10774c;

            public f(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.k String str) {
                this.f10772a = bVar;
                this.f10773b = localMessage;
                this.f10774c = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return L.f(this.f10772a, fVar.f10772a) && L.f(this.f10773b, fVar.f10773b) && L.f(this.f10774c, fVar.f10774c);
            }

            public final int hashCode() {
                return this.f10774c.hashCode() + ((this.f10773b.hashCode() + (this.f10772a.hashCode() * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MessageLinkLongClicked(bodyOrBubble=");
                sb2.append(this.f10772a);
                sb2.append(", localMessage=");
                sb2.append(this.f10773b);
                sb2.append(", url=");
                return C22026a.c(sb2, this.f10774c, ')');
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LMY/k$a$g;", "LMY/k$a;", "LNY/i;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class g implements a, NY.i {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final T1.d.b f10775a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final LocalMessage f10776b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final Q1 f10777c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final VideoInfo f10778d;

            public g(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.l Q1 q12, @Y61.l VideoInfo videoInfo) {
                this.f10775a = bVar;
                this.f10776b = localMessage;
                this.f10777c = q12;
                this.f10778d = videoInfo;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return L.f(this.f10775a, gVar.f10775a) && L.f(this.f10776b, gVar.f10776b) && L.f(this.f10777c, gVar.f10777c) && L.f(this.f10778d, gVar.f10778d);
            }

            public final int hashCode() {
                int iHashCode = (this.f10776b.hashCode() + (this.f10775a.hashCode() * 31)) * 31;
                Q1 q12 = this.f10777c;
                int iHashCode2 = (iHashCode + (q12 == null ? 0 : q12.hashCode())) * 31;
                VideoInfo videoInfo = this.f10778d;
                return iHashCode2 + (videoInfo != null ? videoInfo.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                return "OnMessageClick(bodyOrBubble=" + this.f10775a + ", localMessage=" + this.f10776b + ", metaInfo=" + this.f10777c + ", videoInfo=" + this.f10778d + ')';
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/k$a$h;", "LMY/k$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class h implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final T1.d f10779a;

            public h(@Y61.k T1.d dVar) {
                this.f10779a = dVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && L.f(this.f10779a, ((h) obj).f10779a);
            }

            public final int hashCode() {
                return this.f10779a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "VideoMessageCancelClicked(message=" + this.f10779a + ')';
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/k$a$i;", "LMY/k$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class i implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final T1.d f10780a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Q1 f10781b;

            public i(@Y61.k T1.d dVar, @Y61.l Q1 q12) {
                this.f10780a = dVar;
                this.f10781b = q12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return L.f(this.f10780a, iVar.f10780a) && L.f(this.f10781b, iVar.f10781b);
            }

            public final int hashCode() {
                int iHashCode = this.f10780a.hashCode() * 31;
                Q1 q12 = this.f10781b;
                return iHashCode + (q12 == null ? 0 : q12.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "VoiceMessageCancelClicked(message=" + this.f10780a + ", metaInfo=" + this.f10781b + ')';
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/k$a$j;", "LMY/k$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class j implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final T1.d f10782a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Q1 f10783b;

            /* renamed from: c, reason: collision with root package name */
            public final int f10784c;

            public j(@Y61.k T1.d dVar, @Y61.l Q1 q12, int i12) {
                this.f10782a = dVar;
                this.f10783b = q12;
                this.f10784c = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return L.f(this.f10782a, jVar.f10782a) && L.f(this.f10783b, jVar.f10783b) && this.f10784c == jVar.f10784c;
            }

            public final int hashCode() {
                int iHashCode = this.f10782a.hashCode() * 31;
                Q1 q12 = this.f10783b;
                return Integer.hashCode(this.f10784c) + ((iHashCode + (q12 == null ? 0 : q12.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VoiceMessageSeekToClicked(message=");
                sb2.append(this.f10782a);
                sb2.append(", metaInfo=");
                sb2.append(this.f10783b);
                sb2.append(", progress=");
                return r.t(sb2, this.f10784c, ')');
            }
        }
    }

    /* compiled from: ChannelAction.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LMY/k$b;", "LMY/k;", "a", "b", "c", "d", "e", "f", "g", "LMY/k$b$a;", "LMY/k$b$b;", "LMY/k$b$c;", "LMY/k$b$d;", "LMY/k$b$e;", "LMY/k$b$f;", "LMY/k$b$g;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends k {

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LMY/k$b$a;", "LMY/k$b;", "LNY/i;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, NY.i {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f10785a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f10786b;

            public a(@Y61.k String str, boolean z12) {
                this.f10785a = str;
                this.f10786b = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f10785a, aVar.f10785a) && this.f10786b == aVar.f10786b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f10786b) + (this.f10785a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MessageSpamActionClicked(messageRemoteId=");
                sb2.append(this.f10785a);
                sb2.append(", isSpam=");
                return r.x(sb2, this.f10786b, ')');
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/k$b$b;", "LMY/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: MY.k$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0685b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f10787a;

            public C0685b(@Y61.k String str) {
                this.f10787a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0685b) && L.f(this.f10787a, ((C0685b) obj).f10787a);
            }

            public final int hashCode() {
                return this.f10787a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("MessageSpamActionsShown(remoteId="), this.f10787a, ')');
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMY/k$b$c;", "LMY/k$b;", "LNY/j;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b, NY.j {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f10788a = new c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1626440016;
            }

            @Y61.k
            public final String toString() {
                return "PaginationStart";
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMY/k$b$d;", "LMY/k$b;", "LNY/j;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b, NY.j {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f10789a = new d();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1234170717;
            }

            @Y61.k
            public final String toString() {
                return "Refresh";
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMY/k$b$e;", "LMY/k$b;", "LNY/j;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements b, NY.j {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f10790a = new e();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1503319560;
            }

            @Y61.k
            public final String toString() {
                return "ScrolledToMessage";
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LMY/k$b$f;", "LMY/k$b;", "LNY/j;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f implements b, NY.j {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final QuoteViewData f10791a;

            public f(@Y61.k QuoteViewData quoteViewData) {
                this.f10791a = quoteViewData;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && L.f(this.f10791a, ((f) obj).f10791a);
            }

            public final int hashCode() {
                return this.f10791a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "StartSearchingQuotedMessage(quoteViewData=" + this.f10791a + ')';
            }
        }

        /* compiled from: ChannelAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMY/k$b$g;", "LMY/k$b;", "LNY/j;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class g implements b, NY.j {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final g f10792a = new g();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -562342052;
            }

            @Y61.k
            public final String toString() {
                return "UserInteractedWithList";
            }
        }
    }
}
