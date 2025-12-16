package Ep;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.comfortable_deal.api.model.TeamMemberPhone;
import com.avito.android.comfortable_deal.comment.model.CommentResult;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import com.avito.android.comfortable_deal.deal.item.commenttabs.CommentTab;
import com.avito.android.comfortable_deal.end_deal.model.EndDealResult;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResult;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DealAction.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"LEp/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "LEp/a$a;", "LEp/a$b;", "LEp/a$c;", "LEp/a$d;", "LEp/a$e;", "LEp/a$f;", "LEp/a$g;", "LEp/a$h;", "LEp/a$i;", "LEp/a$j;", "LEp/a$k;", "LEp/a$l;", "LEp/a$m;", "LEp/a$n;", "LEp/a$o;", "LEp/a$p;", "LEp/a$q;", "LEp/a$r;", "LEp/a$s;", "LEp/a$t;", "LEp/a$u;", "LEp/a$v;", "LEp/a$w;", "LEp/a$x;", "LEp/a$y;", "LEp/a$z;", "LEp/a$A;", "LEp/a$B;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ep.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13517a {

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$A;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$A */
    public static final /* data */ class A implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PlaySpeed f4267a;

        public A(@Y61.k PlaySpeed playSpeed) {
            this.f4267a = playSpeed;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && this.f4267a == ((A) obj).f4267a;
        }

        public final int hashCode() {
            return this.f4267a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SpeedSelected(playSpeed=" + this.f4267a + ')';
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$B;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$B */
    public static final /* data */ class B implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StagesTransitionResult f4268a;

        public B(@Y61.k StagesTransitionResult stagesTransitionResult) {
            this.f4268a = stagesTransitionResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof B) && L.f(this.f4268a, ((B) obj).f4268a);
        }

        public final int hashCode() {
            return this.f4268a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "TransitionResultReceived(result=" + this.f4268a + ')';
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$a;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0257a implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ActionTransition f4269a;

        public C0257a(@Y61.k ActionTransition actionTransition) {
            this.f4269a = actionTransition;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0257a) && this.f4269a == ((C0257a) obj).f4269a;
        }

        public final int hashCode() {
            return this.f4269a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ActionClick(transition=" + this.f4269a + ')';
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$b;", "LEp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$b, reason: case insensitive filesystem */
    public static final /* data */ class C13518b implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C13518b f4270a = new C13518b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C13518b);
        }

        public final int hashCode() {
            return 177674295;
        }

        @Y61.k
        public final String toString() {
            return "AddCommentClick";
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$c;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$c */
    public static final /* data */ class c implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f4271a;

        public c(@Y61.k DeepLink deepLink) {
            this.f4271a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f4271a, ((c) obj).f4271a);
        }

        public final int hashCode() {
            return this.f4271a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("AgentItemClick(deepLink="), this.f4271a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LEp/a$d;", "LEp/a;", "<init>", "()V", "a", "b", "LEp/a$d$a;", "LEp/a$d$b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$d */
    public static abstract class d implements InterfaceC13517a {

        /* compiled from: DealAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$d$a;", "LEp/a$d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ep.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C0258a extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C0258a f4272a = new C0258a();

            public C0258a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C0258a);
            }

            public final int hashCode() {
                return 550019456;
            }

            @Y61.k
            public final String toString() {
                return "AnalyticsReportItemClick";
            }
        }

        /* compiled from: DealAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$d$b;", "LEp/a$d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ep.a$d$b */
        public static final /* data */ class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f4273a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 564683017;
            }

            @Y61.k
            public final String toString() {
                return "AnalyticsReportItemShown";
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$e;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$e */
    public static final /* data */ class e implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f4274a;

        public e(@Y61.k String str) {
            this.f4274a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f4274a, ((e) obj).f4274a);
        }

        public final int hashCode() {
            return this.f4274a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CallLoadClick(callId="), this.f4274a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$f;", "LEp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$f */
    public static final /* data */ class f implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f4275a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1457128387;
        }

        @Y61.k
        public final String toString() {
            return "CallPlayClick";
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$g;", "LEp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$g */
    public static final /* data */ class g implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f4276a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1130406851;
        }

        @Y61.k
        public final String toString() {
            return "CloseClick";
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$h;", "LEp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$h */
    public static final /* data */ class h implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f4277a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1550143731;
        }

        @Y61.k
        public final String toString() {
            return "CloseMortgageBanner";
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$i;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$i */
    public static final /* data */ class i implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CommentTab f4278a;

        public i(@Y61.k CommentTab commentTab) {
            this.f4278a = commentTab;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f4278a == ((i) obj).f4278a;
        }

        public final int hashCode() {
            return this.f4278a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CommentFilterClick(commentTab=" + this.f4278a + ')';
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$j;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$j */
    public static final /* data */ class j implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CommentResult f4279a;

        public j(@Y61.k CommentResult commentResult) {
            this.f4279a = commentResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f4279a, ((j) obj).f4279a);
        }

        public final int hashCode() {
            return this.f4279a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CommentResultReceived(result=" + this.f4279a + ')';
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$k;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$k */
    public static final /* data */ class k implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final EndDealResult f4280a;

        public k(@Y61.k EndDealResult endDealResult) {
            this.f4280a = endDealResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f4280a, ((k) obj).f4280a);
        }

        public final int hashCode() {
            return this.f4280a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "EndDealTransitionResultReceived(result=" + this.f4280a + ')';
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$l;", "LEp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$l */
    public static final /* data */ class l implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f4281a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1613624032;
        }

        @Y61.k
        public final String toString() {
            return "OnFragmentStart";
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$m;", "LEp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$m */
    public static final /* data */ class m implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f4282a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -363589180;
        }

        @Y61.k
        public final String toString() {
            return "OnFragmentStop";
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$n;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$n */
    public static final /* data */ class n implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f4283a;

        public n(@Y61.k DeepLink deepLink) {
            this.f4283a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f4283a, ((n) obj).f4283a);
        }

        public final int hashCode() {
            return this.f4283a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f4283a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$o;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$o */
    public static final /* data */ class o implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f4284a;

        public o(@Y61.l String str) {
            this.f4284a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f4284a, ((o) obj).f4284a);
        }

        public final int hashCode() {
            String str = this.f4284a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenMortgageConsultation(agentFullName="), this.f4284a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$p;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$p */
    public static final /* data */ class p implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f4285a;

        public p(@Y61.k String str) {
            this.f4285a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f4285a, ((p) obj).f4285a);
        }

        public final int hashCode() {
            return this.f4285a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenRecallDialogClick(requestId="), this.f4285a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$q;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$q */
    public static final /* data */ class q implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f4286a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TeamMemberPhone f4287b;

        public q(@Y61.k String str, @Y61.k TeamMemberPhone teamMemberPhone) {
            this.f4286a = str;
            this.f4287b = teamMemberPhone;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return L.f(this.f4286a, qVar.f4286a) && L.f(this.f4287b, qVar.f4287b);
        }

        public final int hashCode() {
            return this.f4287b.hashCode() + (this.f4286a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "PhoneCallClick(clientId=" + this.f4286a + ", phone=" + this.f4287b + ')';
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$r;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$r */
    public static final /* data */ class r implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f4288a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f4289b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4290c;

        public r(@Y61.k String str, @Y61.k String str2, boolean z12) {
            this.f4288a = str;
            this.f4289b = str2;
            this.f4290c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f4288a, rVar.f4288a) && L.f(this.f4289b, rVar.f4289b) && this.f4290c == rVar.f4290c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4290c) + H.d(this.f4288a.hashCode() * 31, 31, this.f4289b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RecallClick(phone=");
            sb2.append(this.f4288a);
            sb2.append(", requestId=");
            sb2.append(this.f4289b);
            sb2.append(", isBigBanner=");
            return androidx.appcompat.app.r.x(sb2, this.f4290c, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$s;", "LEp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$s */
    public static final /* data */ class s implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final s f4291a = new s();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -906246763;
        }

        @Y61.k
        public final String toString() {
            return "ReloadAll";
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$t;", "LEp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$t */
    public static final /* data */ class t implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f4292a = new t();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -634197376;
        }

        @Y61.k
        public final String toString() {
            return "ReloadComments";
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$u;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$u */
    public static final /* data */ class u implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4293a;

        public u(boolean z12) {
            this.f4293a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.f4293a == ((u) obj).f4293a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4293a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("SaveCommentResultReceived(needToSave="), this.f4293a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$v;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$v */
    public static final /* data */ class v implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4294a;

        public v(boolean z12) {
            this.f4294a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.f4294a == ((v) obj).f4294a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4294a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("SaveTransitionDataResultReceived(needToSave="), this.f4294a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$w;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$w */
    public static final /* data */ class w implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        public final int f4295a;

        public w(int i12) {
            this.f4295a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f4295a == ((w) obj).f4295a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f4295a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("SeekPlayer(part="), this.f4295a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$x;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$x */
    public static final /* data */ class x implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f4296a;

        public x(@Y61.l String str) {
            this.f4296a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && L.f(this.f4296a, ((x) obj).f4296a);
        }

        public final int hashCode() {
            String str = this.f4296a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectAgentClick(selectedAgentId="), this.f4296a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/a$y;", "LEp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$y */
    public static final /* data */ class y implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f4297a;

        public y(@Y61.k DeepLink deepLink) {
            this.f4297a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && L.f(this.f4297a, ((y) obj).f4297a);
        }

        public final int hashCode() {
            return this.f4297a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SellerItemClick(deepLink="), this.f4297a, ')');
        }
    }

    /* compiled from: DealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/a$z;", "LEp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ep.a$z */
    public static final /* data */ class z implements InterfaceC13517a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final z f4298a = new z();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -1719256060;
        }

        @Y61.k
        public final String toString() {
            return "SpeedChangeClick";
        }
    }
}
