package MY;

import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: ChannelInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"LMY/d;", "LMY/a;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "LMY/d$a;", "LMY/d$b;", "LMY/d$c;", "LMY/d$d;", "LMY/d$e;", "LMY/d$f;", "LMY/d$g;", "LMY/d$h;", "LMY/d$i;", "LMY/d$j;", "LMY/d$k;", "LMY/d$l;", "LMY/d$m;", "LMY/d$n;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d extends MY.a {

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$a;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Q<Uri, String> f10724a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Q<? extends Uri, String> q12) {
            this.f10724a = q12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f10724a, ((a) obj).f10724a);
        }

        public final int hashCode() {
            return this.f10724a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("FileMessageClick(uriAndMimeType="), this.f10724a, ')');
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$b;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MY.m f10725a;

        public b(@Y61.k MY.m mVar) {
            this.f10725a = mVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f10725a, ((b) obj).f10725a);
        }

        public final int hashCode() {
            return this.f10725a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ImageMessageClick(openGalleryData=" + this.f10725a + ')';
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$c;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MY.i f10726a;

        public c(@Y61.k MY.i iVar) {
            this.f10726a = iVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f10726a, ((c) obj).f10726a);
        }

        public final int hashCode() {
            return this.f10726a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ItemMessageClick(itemMessageInfo=" + this.f10726a + ')';
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$d;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: MY.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0682d implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f10727a;

        public C0682d(@Y61.k String str) {
            this.f10727a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0682d) && L.f(this.f10727a, ((C0682d) obj).f10727a);
        }

        public final int hashCode() {
            return this.f10727a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkMessageWithUrlClick(url="), this.f10727a, ')');
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$e;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessageBody.Location f10728a;

        public e(@Y61.k MessageBody.Location location) {
            this.f10728a = location;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f10728a, ((e) obj).f10728a);
        }

        public final int hashCode() {
            return this.f10728a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LocationMessageClick(body=" + this.f10728a + ')';
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$f;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final NY.h f10729a;

        public f(@Y61.k NY.h hVar) {
            this.f10729a = hVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f10729a, ((f) obj).f10729a);
        }

        public final int hashCode() {
            return this.f10729a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MessageListPrivateStateChanged(newMessageListPrivateState=" + this.f10729a + ')';
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$g;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MY.n f10730a;

        public g(@Y61.k MY.n nVar) {
            this.f10730a = nVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f10730a, ((g) obj).f10730a);
        }

        public final int hashCode() {
            return this.f10730a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PlatformMapMessageClick(platformMapData=" + this.f10730a + ')';
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$h;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Q<LocalMessage, Q1> f10731a;

        public h(@Y61.k Q<LocalMessage, Q1> q12) {
            this.f10731a = q12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f10731a, ((h) obj).f10731a);
        }

        public final int hashCode() {
            return this.f10731a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("RequestPermissionsForFileMessageStream(messageAndMetaInfo="), this.f10731a, ')');
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/d$i;", "LMY/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f10732a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1127217504;
        }

        @Y61.k
        public final String toString() {
            return "ShowKeyboard";
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$j;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MY.j f10733a;

        public j(@Y61.k MY.j jVar) {
            this.f10733a = jVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f10733a, ((j) obj).f10733a);
        }

        public final int hashCode() {
            return this.f10733a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowMenuForTextLink(linkMenuData=" + this.f10733a + ')';
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$k;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f10734a;

        public k(@Y61.k DeepLink deepLink) {
            this.f10734a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f10734a, ((k) obj).f10734a);
        }

        public final int hashCode() {
            return this.f10734a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ShowOnboarding(onboardingDeeplink="), this.f10734a, ')');
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$l;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f10735a;

        public l(@Y61.k PrintableText printableText) {
            this.f10735a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f10735a, ((l) obj).f10735a);
        }

        public final int hashCode() {
            return this.f10735a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToastInternalAction(text="), this.f10735a, ')');
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/d$m;", "LMY/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f10736a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -940942577;
        }

        @Y61.k
        public final String toString() {
            return "UnknownMessageClick";
        }
    }

    /* compiled from: ChannelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/d$n;", "LMY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f10737a;

        public n(@Y61.k Uri uri) {
            this.f10737a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f10737a, ((n) obj).f10737a);
        }

        public final int hashCode() {
            return this.f10737a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("VideoMessageClick(uri="), this.f10737a, ')');
        }
    }
}
