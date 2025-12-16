package Ep;

import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.comment.model.CommentArguments;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import com.avito.android.comfortable_deal.end_deal.model.EndDealArguments;
import com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments;
import com.avito.android.comfortable_deal.save_dialog.model.SaveArguments;
import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionArguments;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DealOneTimeEvent.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"LEp/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "LEp/b$a;", "LEp/b$b;", "LEp/b$c;", "LEp/b$d;", "LEp/b$e;", "LEp/b$f;", "LEp/b$g;", "LEp/b$h;", "LEp/b$i;", "LEp/b$j;", "LEp/b$k;", "LEp/b$l;", "LEp/b$m;", "LEp/b$n;", "LEp/b$o;", "LEp/b$p;", "LEp/b$q;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/b$a;", "LEp/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f4299a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1145251362;
        }

        @Y61.k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$b;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0259b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f4300a;

        public C0259b(@Y61.k DeepLink deepLink) {
            this.f4300a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0259b) && L.f(this.f4300a, ((C0259b) obj).f4300a);
        }

        public final int hashCode() {
            return this.f4300a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenAgentItem(deepLink="), this.f4300a, ')');
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$c;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PhoneCallArguments f4301a;

        public c(@Y61.k PhoneCallArguments phoneCallArguments) {
            this.f4301a = phoneCallArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f4301a, ((c) obj).f4301a);
        }

        public final int hashCode() {
            return this.f4301a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenCallDialog(arguments=" + this.f4301a + ')';
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$d;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CommentArguments f4302a;

        public d(@Y61.k CommentArguments commentArguments) {
            this.f4302a = commentArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f4302a, ((d) obj).f4302a);
        }

        public final int hashCode() {
            return this.f4302a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenCommentDialog(arguments=" + this.f4302a + ')';
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$e;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f4303a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f4304b;

        public e(@Y61.l String str, @Y61.k String str2) {
            this.f4303a = str;
            this.f4304b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f4303a, eVar.f4303a) && L.f(this.f4304b, eVar.f4304b);
        }

        public final int hashCode() {
            String str = this.f4303a;
            return this.f4304b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenRecallDialog(phone=");
            sb2.append(this.f4303a);
            sb2.append(", requestId=");
            return C22026a.c(sb2, this.f4304b, ')');
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$f;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SaveArguments f4305a;

        public f(@Y61.k SaveArguments saveArguments) {
            this.f4305a = saveArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f4305a, ((f) obj).f4305a);
        }

        public final int hashCode() {
            return this.f4305a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenSaveDialog(arguments=" + this.f4305a + ')';
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$g;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SelectAgentArguments f4306a;

        public g(@Y61.k SelectAgentArguments selectAgentArguments) {
            this.f4306a = selectAgentArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f4306a, ((g) obj).f4306a);
        }

        public final int hashCode() {
            return this.f4306a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenSelectAgentDialog(arguments=" + this.f4306a + ')';
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$h;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PlaySpeed f4307a;

        public h(@Y61.k PlaySpeed playSpeed) {
            this.f4307a = playSpeed;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f4307a == ((h) obj).f4307a;
        }

        public final int hashCode() {
            return this.f4307a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenSelectSpeedDialog(selectedSpeed=" + this.f4307a + ')';
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$i;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f4308a;

        public i(@Y61.k DeepLink deepLink) {
            this.f4308a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f4308a, ((i) obj).f4308a);
        }

        public final int hashCode() {
            return this.f4308a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenSellerItem(deepLink="), this.f4308a, ')');
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$j;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final EndDealArguments f4309a;

        public j(@Y61.k EndDealArguments endDealArguments) {
            this.f4309a = endDealArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f4309a, ((j) obj).f4309a);
        }

        public final int hashCode() {
            return this.f4309a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenSoldTransitionDialog(arguments=" + this.f4309a + ')';
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$k;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StagesTransitionArguments f4310a;

        public k(@Y61.k StagesTransitionArguments stagesTransitionArguments) {
            this.f4310a = stagesTransitionArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f4310a, ((k) obj).f4310a);
        }

        public final int hashCode() {
            return this.f4310a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenStagesTransitionDialog(arguments=" + this.f4310a + ')';
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$l;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f4311a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Bundle f4312b;

        public l(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
            this.f4311a = deepLink;
            this.f4312b = bundle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f4311a, lVar.f4311a) && L.f(this.f4312b, lVar.f4312b);
        }

        public final int hashCode() {
            int iHashCode = this.f4311a.hashCode() * 31;
            Bundle bundle = this.f4312b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProcessDeepLink(deepLink=");
            sb2.append(this.f4311a);
            sb2.append(", bundle=");
            return H.m(sb2, this.f4312b, ')');
        }

        public /* synthetic */ l(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/b$m;", "LEp/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f4313a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1107908743;
        }

        @Y61.k
        public final String toString() {
            return "ReloadVdrList";
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$n;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f4314a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ApiError f4315b;

        public n(PrintableText printableText, ApiError apiError, int i12, C42822w c42822w) {
            apiError = (i12 & 2) != 0 ? null : apiError;
            this.f4314a = printableText;
            this.f4315b = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f4314a, nVar.f4314a) && L.f(this.f4315b, nVar.f4315b);
        }

        public final int hashCode() {
            int iHashCode = this.f4314a.hashCode() * 31;
            ApiError apiError = this.f4315b;
            return iHashCode + (apiError == null ? 0 : apiError.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(text=");
            sb2.append(this.f4314a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f4315b, ')');
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$o;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements b {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            ((o) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "ShowMessage(text=null)";
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$p;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f4316a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f4317b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f4318c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f4319d;

        public p(@Y61.k PrintableText printableText, @Y61.k String str, @Y61.k String str2, boolean z12) {
            this.f4316a = printableText;
            this.f4317b = str;
            this.f4318c = str2;
            this.f4319d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.f4316a.equals(pVar.f4316a) && L.f(this.f4317b, pVar.f4317b) && L.f(this.f4318c, pVar.f4318c) && this.f4319d == pVar.f4319d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4319d) + H.d(H.d(this.f4316a.hashCode() * 31, 31, this.f4317b), 31, this.f4318c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowRecallErrorMessage(text=");
            sb2.append(this.f4316a);
            sb2.append(", requestId=");
            sb2.append(this.f4317b);
            sb2.append(", phone=");
            sb2.append(this.f4318c);
            sb2.append(", isBigBanner=");
            return r.x(sb2, this.f4319d, ')');
        }
    }

    /* compiled from: DealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/b$q;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f4320a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f4321b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f4322c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f4323d;

        public q(@Y61.k PrintableText printableText, @Y61.k String str, @Y61.k String str2, boolean z12) {
            this.f4320a = printableText;
            this.f4321b = str;
            this.f4322c = str2;
            this.f4323d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.f4320a.equals(qVar.f4320a) && L.f(this.f4321b, qVar.f4321b) && L.f(this.f4322c, qVar.f4322c) && this.f4323d == qVar.f4323d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4323d) + H.d(H.d(this.f4320a.hashCode() * 31, 31, this.f4321b), 31, this.f4322c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowRecallSuccessMessage(text=");
            sb2.append(this.f4320a);
            sb2.append(", requestId=");
            sb2.append(this.f4321b);
            sb2.append(", phone=");
            sb2.append(this.f4322c);
            sb2.append(", isBigBanner=");
            return r.x(sb2, this.f4323d, ')');
        }
    }
}
