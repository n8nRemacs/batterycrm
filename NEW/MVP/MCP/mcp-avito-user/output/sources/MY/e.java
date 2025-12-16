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

/* compiled from: ChannelOneTimeEvent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LMY/e;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "LMY/e$a;", "LMY/e$b;", "LMY/e$c;", "LMY/e$d;", "LMY/e$e;", "LMY/e$f;", "LMY/e$g;", "LMY/e$h;", "LMY/e$i;", "LMY/e$j;", "LMY/e$k;", "LMY/e$l;", "LMY/e$m;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e {

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$a;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Q<Uri, String> f10738a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Q<? extends Uri, String> q12) {
            this.f10738a = q12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f10738a, ((a) obj).f10738a);
        }

        public final int hashCode() {
            return this.f10738a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("FileMessageClicked(uriAndMimeType="), this.f10738a, ')');
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$b;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f10739a;

        public b(@Y61.k String str) {
            this.f10739a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f10739a, ((b) obj).f10739a);
        }

        public final int hashCode() {
            return this.f10739a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkMessageWithUrlClicked(url="), this.f10739a, ')');
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$c;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessageBody.Location f10740a;

        public c(@Y61.k MessageBody.Location location) {
            this.f10740a = location;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f10740a, ((c) obj).f10740a);
        }

        public final int hashCode() {
            return this.f10740a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LocationMessageClicked(location=" + this.f10740a + ')';
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$d;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MY.m f10741a;

        public d(@Y61.k MY.m mVar) {
            this.f10741a = mVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f10741a, ((d) obj).f10741a);
        }

        public final int hashCode() {
            return this.f10741a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenGallery(openGalleryData=" + this.f10741a + ')';
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$e;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: MY.e$e, reason: collision with other inner class name */
    public static final /* data */ class C0683e implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MY.i f10742a;

        public C0683e(@Y61.k MY.i iVar) {
            this.f10742a = iVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0683e) && L.f(this.f10742a, ((C0683e) obj).f10742a);
        }

        public final int hashCode() {
            return this.f10742a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenItemScreen(itemMessageInfo=" + this.f10742a + ')';
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$f;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final n f10743a;

        public f(@Y61.k n nVar) {
            this.f10743a = nVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f10743a, ((f) obj).f10743a);
        }

        public final int hashCode() {
            return this.f10743a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PlatformMapMessageClicked(platformMapData=" + this.f10743a + ')';
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$g;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Q<LocalMessage, Q1> f10744a;

        public g(@Y61.k Q<LocalMessage, Q1> q12) {
            this.f10744a = q12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f10744a, ((g) obj).f10744a);
        }

        public final int hashCode() {
            return this.f10744a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("RequestPermissionsForFileMessageStream(messageAndMetaInfo="), this.f10744a, ')');
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/e$h;", "LMY/e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f10745a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 2004290220;
        }

        @Y61.k
        public final String toString() {
            return "ShowKeyboard";
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$i;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MY.j f10746a;

        public i(@Y61.k MY.j jVar) {
            this.f10746a = jVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f10746a, ((i) obj).f10746a);
        }

        public final int hashCode() {
            return this.f10746a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowMenuForTextLink(linkMenuData=" + this.f10746a + ')';
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$j;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f10747a;

        public j(@Y61.k DeepLink deepLink) {
            this.f10747a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f10747a, ((j) obj).f10747a);
        }

        public final int hashCode() {
            return this.f10747a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ShowOnboarding(onboardingDeeplink="), this.f10747a, ')');
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$k;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f10748a;

        public k(@Y61.k PrintableText printableText) {
            this.f10748a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f10748a, ((k) obj).f10748a);
        }

        public final int hashCode() {
            return this.f10748a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f10748a, ')');
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/e$l;", "LMY/e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f10749a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1630447970;
        }

        @Y61.k
        public final String toString() {
            return "UnknownMessageClicked";
        }
    }

    /* compiled from: ChannelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/e$m;", "LMY/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f10750a;

        public m(@Y61.k Uri uri) {
            this.f10750a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f10750a, ((m) obj).f10750a);
        }

        public final int hashCode() {
            return this.f10750a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("VideoMessageClicked(uri="), this.f10750a, ')');
        }
    }
}
