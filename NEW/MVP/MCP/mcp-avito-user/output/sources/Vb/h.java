package Vb;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantOneTimeEvent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LVb/h;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LVb/h$a;", "LVb/h$b;", "LVb/h$c;", "LVb/h$d;", "LVb/h$e;", "LVb/h$f;", "LVb/h$g;", "LVb/h$h;", "LVb/h$i;", "LVb/h$j;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface h {

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/h$a;", "LVb/h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Tb.e> f17236a;

        public a(@Y61.k List<Tb.e> list) {
            this.f17236a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f17236a, ((a) obj).f17236a);
        }

        public final int hashCode() {
            return this.f17236a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("CloseClicked(onCloseUxFeedback="), this.f17236a, ')');
        }
    }

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVb/h$b;", "LVb/h;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f17237a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -790784092;
        }

        @Y61.k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/h$c;", "LVb/h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17238a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f17239b;

        public c(@Y61.k String str, @Y61.l String str2) {
            this.f17238a = str;
            this.f17239b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f17238a, cVar.f17238a) && L.f(this.f17239b, cVar.f17239b);
        }

        public final int hashCode() {
            int iHashCode = this.f17238a.hashCode() * 31;
            String str = this.f17239b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateToChatList(currentChatId=");
            sb2.append(this.f17238a);
            sb2.append(", newChatContext=");
            return C22026a.c(sb2, this.f17239b, ')');
        }
    }

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/h$d;", "LVb/h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f17240a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f17241b;

        public d(@Y61.k DeepLink deepLink, @Y61.k String str) {
            this.f17240a = deepLink;
            this.f17241b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f17240a, dVar.f17240a) && L.f(this.f17241b, dVar.f17241b);
        }

        public final int hashCode() {
            return this.f17241b.hashCode() + (this.f17240a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenAssistantMessageLink(deepLink=");
            sb2.append(this.f17240a);
            sb2.append(", currentChatId=");
            return C22026a.c(sb2, this.f17241b, ')');
        }
    }

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/h$f;", "LVb/h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17244a;

        public f(@Y61.k String str) {
            this.f17244a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f17244a, ((f) obj).f17244a);
        }

        public final int hashCode() {
            return this.f17244a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenNewChat(context="), this.f17244a, ')');
        }
    }

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/h$g;", "LVb/h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f17245a;

        public g(@Y61.k DeepLink deepLink) {
            this.f17245a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f17245a, ((g) obj).f17245a);
        }

        public final int hashCode() {
            return this.f17245a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SendMessageUxFeedback(deepLink="), this.f17245a, ')');
        }
    }

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/h$h;", "LVb/h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.h$h, reason: collision with other inner class name */
    public static final /* data */ class C1191h implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final PrintableText f17246a;

        public C1191h() {
            this(null, 1, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1191h) && L.f(this.f17246a, ((C1191h) obj).f17246a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f17246a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorToast(text="), this.f17246a, ')');
        }

        public C1191h(PrintableText printableText, int i12, C42822w c42822w) {
            this.f17246a = (i12 & 1) != 0 ? null : printableText;
        }
    }

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVb/h$i;", "LVb/h;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements h {
        static {
            new i();
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -656741643;
        }

        @Y61.k
        public final String toString() {
            return "ShowInternetAbsentToast";
        }
    }

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/h$j;", "LVb/h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f17247a;

        public j(@Y61.k PrintableText printableText) {
            this.f17247a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f17247a, ((j) obj).f17247a);
        }

        public final int hashCode() {
            return this.f17247a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f17247a, ')');
        }
    }

    /* compiled from: AiAssistantOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/h$e;", "LVb/h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f17242a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17243b;

        public e(@Y61.k DeepLink deepLink, boolean z12) {
            this.f17242a = deepLink;
            this.f17243b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f17242a, eVar.f17242a) && this.f17243b == eVar.f17243b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17243b) + (this.f17242a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenLink(deepLink=");
            sb2.append(this.f17242a);
            sb2.append(", hideKeyboard=");
            return r.x(sb2, this.f17243b, ')');
        }

        public /* synthetic */ e(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? true : z12);
        }
    }
}
