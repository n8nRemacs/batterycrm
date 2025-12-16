package com.avito.android.messenger.conversation.mvi.messages;

import android.view.MenuItem;
import androidx.compose.runtime.C22026a;
import com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.messenger.deeplink.ChannelIacCallLink;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import kotlin.Metadata;

/* compiled from: MessageListViewAction.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$d;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$e;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$f;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$g;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$h;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$i;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$j;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$k;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$l;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$m;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$n;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$o;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$p;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$q;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$r;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$s;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$t;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$u;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$v;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0$w;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface h0 {

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final MenuItem f192975a;

        public a(@Y61.l MenuItem menuItem) {
            this.f192975a = menuItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f192975a, ((a) obj).f192975a);
        }

        public final int hashCode() {
            MenuItem menuItem = this.f192975a;
            if (menuItem == null) {
                return 0;
            }
            return menuItem.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnActionItemClick(item=" + this.f192975a + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f192976a;

        public b(@Y61.k DeepLink deepLink) {
            this.f192976a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f192976a, ((b) obj).f192976a);
        }

        public final int hashCode() {
            return this.f192976a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnAppCallMessageClick(deepLink="), this.f192976a, ')');
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d f192977a;

        public c(@Y61.k T1.d dVar) {
            this.f192977a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f192977a, ((c) obj).f192977a);
        }

        public final int hashCode() {
            return this.f192977a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnAvatarClick(message=" + this.f192977a + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$d;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f192978a;

        public d(@Y61.k DeepLink deepLink) {
            this.f192978a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.L.f(this.f192978a, ((d) obj).f192978a);
        }

        public final int hashCode() {
            return this.f192978a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnBuyButtonClick(deepLink="), this.f192978a, ')');
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$e;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f192979a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f192980b;

        public e(@Y61.k DeepLink deepLink, @Y61.k LocalMessage localMessage) {
            this.f192979a = deepLink;
            this.f192980b = localMessage;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.L.f(this.f192979a, eVar.f192979a) && kotlin.jvm.internal.L.f(this.f192980b, eVar.f192980b);
        }

        public final int hashCode() {
            return this.f192980b.hashCode() + (this.f192979a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnDeeplinkClick(deeplink=" + this.f192979a + ", localMessage=" + this.f192980b + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$f;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d f192981a;

        public f(@Y61.k T1.d dVar) {
            this.f192981a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.L.f(this.f192981a, ((f) obj).f192981a);
        }

        public final int hashCode() {
            return this.f192981a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnFileCancelClick(item=" + this.f192981a + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$g;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerReallContactMethodLink f192982a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f192983b;

        public g(@Y61.k MessengerReallContactMethodLink messengerReallContactMethodLink, @Y61.k LocalMessage localMessage) {
            this.f192982a = messengerReallContactMethodLink;
            this.f192983b = localMessage;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.L.f(this.f192982a, gVar.f192982a) && kotlin.jvm.internal.L.f(this.f192983b, gVar.f192983b);
        }

        public final int hashCode() {
            return this.f192983b.hashCode() + (this.f192982a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnGsmRecallMessageClick(deeplink=" + this.f192982a + ", localMessage=" + this.f192983b + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$h;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f192984a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1719765736;
        }

        @Y61.k
        public final String toString() {
            return "OnIncomingDeletedMessageClick";
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$i;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d.b f192985a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f192986b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Q1 f192987c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final VideoInfo f192988d;

        public i(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.l Q1 q12, @Y61.l VideoInfo videoInfo) {
            this.f192985a = bVar;
            this.f192986b = localMessage;
            this.f192987c = q12;
            this.f192988d = videoInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.L.f(this.f192985a, iVar.f192985a) && kotlin.jvm.internal.L.f(this.f192986b, iVar.f192986b) && kotlin.jvm.internal.L.f(this.f192987c, iVar.f192987c) && kotlin.jvm.internal.L.f(this.f192988d, iVar.f192988d);
        }

        public final int hashCode() {
            int iHashCode = (this.f192986b.hashCode() + (this.f192985a.hashCode() * 31)) * 31;
            Q1 q12 = this.f192987c;
            int iHashCode2 = (iHashCode + (q12 == null ? 0 : q12.hashCode())) * 31;
            VideoInfo videoInfo = this.f192988d;
            return iHashCode2 + (videoInfo != null ? videoInfo.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "OnMessageClick(bodyOrBubble=" + this.f192985a + ", localMessage=" + this.f192986b + ", metaInfo=" + this.f192987c + ", videoInfo=" + this.f192988d + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$j;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d.b f192989a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f192990b;

        public j(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage) {
            this.f192989a = bVar;
            this.f192990b = localMessage;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.L.f(this.f192989a, jVar.f192989a) && kotlin.jvm.internal.L.f(this.f192990b, jVar.f192990b);
        }

        public final int hashCode() {
            return this.f192990b.hashCode() + (this.f192989a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnMessageErrorClick(bodyOrBubble=" + this.f192989a + ", localMessage=" + this.f192990b + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$k;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d.b f192991a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f192992b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f192993c;

        public k(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.k String str) {
            this.f192991a = bVar;
            this.f192992b = localMessage;
            this.f192993c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.L.f(this.f192991a, kVar.f192991a) && kotlin.jvm.internal.L.f(this.f192992b, kVar.f192992b) && kotlin.jvm.internal.L.f(this.f192993c, kVar.f192993c);
        }

        public final int hashCode() {
            return this.f192993c.hashCode() + ((this.f192992b.hashCode() + (this.f192991a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnMessageLinkClick(bodyOrBubble=");
            sb2.append(this.f192991a);
            sb2.append(", localMessage=");
            sb2.append(this.f192992b);
            sb2.append(", url=");
            return C22026a.c(sb2, this.f192993c, ')');
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$l;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d.b f192994a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f192995b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f192996c;

        public l(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.k String str) {
            this.f192994a = bVar;
            this.f192995b = localMessage;
            this.f192996c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return kotlin.jvm.internal.L.f(this.f192994a, lVar.f192994a) && kotlin.jvm.internal.L.f(this.f192995b, lVar.f192995b) && kotlin.jvm.internal.L.f(this.f192996c, lVar.f192996c);
        }

        public final int hashCode() {
            return this.f192996c.hashCode() + ((this.f192995b.hashCode() + (this.f192994a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnMessageLinkLongClick(bodyOrBubble=");
            sb2.append(this.f192994a);
            sb2.append(", localMessage=");
            sb2.append(this.f192995b);
            sb2.append(", url=");
            return C22026a.c(sb2, this.f192996c, ')');
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$m;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d.b f192997a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f192998b;

        public m(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage) {
            this.f192997a = bVar;
            this.f192998b = localMessage;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.L.f(this.f192997a, mVar.f192997a) && kotlin.jvm.internal.L.f(this.f192998b, mVar.f192998b);
        }

        public final int hashCode() {
            return this.f192998b.hashCode() + (this.f192997a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnMessageLongClick(bodyOrBubble=" + this.f192997a + ", localMessage=" + this.f192998b + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$n;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final T1 f192999a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final T1 f193000b;

        public n(@Y61.l T1 t12, @Y61.l T1 t13) {
            this.f192999a = t12;
            this.f193000b = t13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return kotlin.jvm.internal.L.f(this.f192999a, nVar.f192999a) && kotlin.jvm.internal.L.f(this.f193000b, nVar.f193000b);
        }

        public final int hashCode() {
            T1 t12 = this.f192999a;
            int iHashCode = (t12 == null ? 0 : t12.hashCode()) * 31;
            T1 t13 = this.f193000b;
            return iHashCode + (t13 != null ? t13.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "OnNewBottomItem(prevBottomItem=" + this.f192999a + ", curBottomItem=" + this.f193000b + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$o;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final NonFatalErrorEvent f193001a;

        public o(@Y61.k NonFatalErrorEvent nonFatalErrorEvent) {
            this.f193001a = nonFatalErrorEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && kotlin.jvm.internal.L.f(this.f193001a, ((o) obj).f193001a);
        }

        public final int hashCode() {
            return this.f193001a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnNonFatalError(error=" + this.f193001a + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$p;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final QuoteViewData f193002a;

        public p(@Y61.k QuoteViewData quoteViewData) {
            this.f193002a = quoteViewData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && kotlin.jvm.internal.L.f(this.f193002a, ((p) obj).f193002a);
        }

        public final int hashCode() {
            return this.f193002a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnQuoteClick(quoteViewData=" + this.f193002a + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$q;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.e f193003a;

        public q(@Y61.k T1.e eVar) {
            this.f193003a = eVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && kotlin.jvm.internal.L.f(this.f193003a, ((q) obj).f193003a);
        }

        public final int hashCode() {
            this.f193003a.getClass();
            return 932925009;
        }

        @Y61.k
        public final String toString() {
            return "OnRetryPaginationClick(item=" + this.f193003a + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$r;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ChannelIacCallLink f193004a;

        public r(@Y61.k ChannelIacCallLink channelIacCallLink) {
            this.f193004a = channelIacCallLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && kotlin.jvm.internal.L.f(this.f193004a, ((r) obj).f193004a);
        }

        public final int hashCode() {
            return this.f193004a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnServicesVideoCallMessageClick(deepLink=" + this.f193004a + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$s;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f193005a;

        public s(@Y61.k String str) {
            this.f193005a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && kotlin.jvm.internal.L.f(this.f193005a, ((s) obj).f193005a);
        }

        public final int hashCode() {
            return this.f193005a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSpamActionShowed(remoteId="), this.f193005a, ')');
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$t;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d f193006a;

        public t(@Y61.k T1.d dVar) {
            this.f193006a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && kotlin.jvm.internal.L.f(this.f193006a, ((t) obj).f193006a);
        }

        public final int hashCode() {
            return this.f193006a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnVideoCancelClick(item=" + this.f193006a + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$u;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d f193007a;

        public u(@Y61.k T1.d dVar) {
            this.f193007a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && kotlin.jvm.internal.L.f(this.f193007a, ((u) obj).f193007a);
        }

        public final int hashCode() {
            return this.f193007a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnVoiceCancelClick(item=" + this.f193007a + ')';
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$v;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class v implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.d f193008a;

        /* renamed from: b, reason: collision with root package name */
        public final int f193009b;

        public v(@Y61.k T1.d dVar, int i12) {
            this.f193008a = dVar;
            this.f193009b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return kotlin.jvm.internal.L.f(this.f193008a, vVar.f193008a) && this.f193009b == vVar.f193009b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f193009b) + (this.f193008a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnVoiceSeek(item=");
            sb2.append(this.f193008a);
            sb2.append(", progress=");
            return androidx.appcompat.app.r.t(sb2, this.f193009b, ')');
        }
    }

    /* compiled from: MessageListViewAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/h0$w;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w implements h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T1.g f193010a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f193011b;

        public w(@Y61.k T1.g gVar, boolean z12) {
            this.f193010a = gVar;
            this.f193011b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return kotlin.jvm.internal.L.f(this.f193010a, wVar.f193010a) && this.f193011b == wVar.f193011b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f193011b) + (this.f193010a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SpamAction(item=");
            sb2.append(this.f193010a);
            sb2.append(", isSpam=");
            return androidx.appcompat.app.r.x(sb2, this.f193011b, ')');
        }
    }
}
