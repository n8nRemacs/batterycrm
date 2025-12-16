package Gy0;

import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.SwitcherItem;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarParametersAction.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u001d\u001f !\"#$%&'()*+,-./0123456789:;¨\u0006<"}, d2 = {"LGy0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "LGy0/a$a;", "LGy0/a$b;", "LGy0/a$c;", "LGy0/a$d;", "LGy0/a$e;", "LGy0/a$f;", "LGy0/a$g;", "LGy0/a$h;", "LGy0/a$i;", "LGy0/a$j;", "LGy0/a$k;", "LGy0/a$l;", "LGy0/a$m;", "LGy0/a$n;", "LGy0/a$o;", "LGy0/a$p;", "LGy0/a$q;", "LGy0/a$r;", "LGy0/a$s;", "LGy0/a$t;", "LGy0/a$u;", "LGy0/a$v;", "LGy0/a$w;", "LGy0/a$x;", "LGy0/a$y;", "LGy0/a$z;", "LGy0/a$A;", "LGy0/a$B;", "LGy0/a$C;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13931a {

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$A;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$A */
    public static final /* data */ class A implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6806a;

        public A(@Y61.k String str) {
            this.f6806a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && L.f(this.f6806a, ((A) obj).f6806a);
        }

        public final int hashCode() {
            return this.f6806a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UrlClick(url="), this.f6806a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/a$B;", "LGy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$B */
    public static final /* data */ class B implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final B f6807a = new B();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof B);
        }

        public final int hashCode() {
            return 198105281;
        }

        @Y61.k
        public final String toString() {
            return "WarningDialogAcceptClick";
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$C;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$C */
    public static final /* data */ class C implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f6808a;

        public C(@Y61.l String str) {
            this.f6808a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C) && L.f(this.f6808a, ((C) obj).f6808a);
        }

        public final int hashCode() {
            String str = this.f6808a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("WarningDialogDenyClick(scrollToId="), this.f6808a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$a;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0386a implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ParameterElement.VariableLengthParameter.Companion.Type f6809a;

        public C0386a(@Y61.k ParameterElement.VariableLengthParameter.Companion.Type type) {
            this.f6809a = type;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0386a) && this.f6809a == ((C0386a) obj).f6809a;
        }

        public final int hashCode() {
            return this.f6809a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AddParameterButtonClick(type=" + this.f6809a + ')';
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/a$b;", "LGy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$b, reason: case insensitive filesystem */
    public static final /* data */ class C13932b implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C13932b f6810a = new C13932b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C13932b);
        }

        public final int hashCode() {
            return -1533702785;
        }

        @Y61.k
        public final String toString() {
            return "ApplyClick";
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/a$c;", "LGy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$c, reason: case insensitive filesystem */
    public static final /* data */ class C13933c implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C13933c f6811a = new C13933c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C13933c);
        }

        public final int hashCode() {
            return 2088834428;
        }

        @Y61.k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$d;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$d */
    public static final /* data */ class d implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6812a;

        public d(@Y61.k String str) {
            this.f6812a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f6812a, ((d) obj).f6812a);
        }

        public final int hashCode() {
            return this.f6812a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CancellationSettingsResultPassed(newParameterTitle="), this.f6812a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$f;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$f */
    public static final /* data */ class f implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f6815a;

        public f(@Y61.k DeepLink deepLink) {
            this.f6815a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f6815a, ((f) obj).f6815a);
        }

        public final int hashCode() {
            return this.f6815a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("CarouselTooltipClick(deeplink="), this.f6815a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$g;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$g */
    public static final /* data */ class g implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JO.m f6816a;

        public g(@Y61.k JO.m mVar) {
            this.f6816a = mVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f6816a, ((g) obj).f6816a);
        }

        public final int hashCode() {
            return this.f6816a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CheckmarkClick(item=" + this.f6816a + ')';
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$h;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$h */
    public static final /* data */ class h implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6817a;

        public h(@Y61.k String str) {
            this.f6817a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f6817a, ((h) obj).f6817a);
        }

        public final int hashCode() {
            return this.f6817a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChildrenAgeParameterDeleteButtonClick(parameterId="), this.f6817a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$i;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$i */
    public static final /* data */ class i implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JO.m f6818a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ParameterElement.C.b f6819b;

        public i(@Y61.k JO.m mVar, @Y61.k ParameterElement.C.b bVar) {
            this.f6818a = mVar;
            this.f6819b = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f6818a, iVar.f6818a) && L.f(this.f6819b, iVar.f6819b);
        }

        public final int hashCode() {
            return this.f6819b.hashCode() + (this.f6818a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ChipsClick(item=" + this.f6818a + ", parameter=" + this.f6819b + ')';
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$j;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$j */
    public static final /* data */ class j implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f6820a;

        public j(@Y61.k DeepLink deepLink) {
            this.f6820a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f6820a, ((j) obj).f6820a);
        }

        public final int hashCode() {
            return this.f6820a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClick(deeplink="), this.f6820a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/a$k;", "LGy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$k */
    public static final /* data */ class k implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f6821a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 2029358955;
        }

        @Y61.k
        public final String toString() {
            return "DialogClose";
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$l;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$l */
    public static final /* data */ class l implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6822a;

        public l(@Y61.k String str) {
            this.f6822a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f6822a, ((l) obj).f6822a);
        }

        public final int hashCode() {
            return this.f6822a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DialogFormClick(parameterId="), this.f6822a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$m;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$m */
    public static final /* data */ class m implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6823a;

        public m(@Y61.k String str) {
            this.f6823a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f6823a, ((m) obj).f6823a);
        }

        public final int hashCode() {
            return this.f6823a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DialogFormShown(parameterId="), this.f6823a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$n;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$n */
    public static final /* data */ class n implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f6824a;

        public n(@Y61.k DeepLink deepLink) {
            this.f6824a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f6824a, ((n) obj).f6824a);
        }

        public final int hashCode() {
            return this.f6824a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DisclaimerClick(deeplink="), this.f6824a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$o;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$o */
    public static final /* data */ class o implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6825a;

        public o(@Y61.k String str) {
            this.f6825a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f6825a, ((o) obj).f6825a);
        }

        public final int hashCode() {
            return this.f6825a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DurationDiscountParameterDeleteButtonClick(parameterId="), this.f6825a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$p;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$p */
    public static final /* data */ class p implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6826a;

        public p(boolean z12) {
            this.f6826a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f6826a == ((p) obj).f6826a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6826a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("EarlyBookingSwitchToggled(isChecked="), this.f6826a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$q;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$q */
    public static final /* data */ class q implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f6827a;

        public q(@Y61.k DeepLink deepLink) {
            this.f6827a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f6827a, ((q) obj).f6827a);
        }

        public final int hashCode() {
            return this.f6827a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HeaderClick(deeplink="), this.f6827a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$r;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$r */
    public static final /* data */ class r implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6828a;

        public r(boolean z12) {
            this.f6828a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f6828a == ((r) obj).f6828a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6828a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("KeyboardToggle(isKeyboardVisible="), this.f6828a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$s;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$s */
    public static final /* data */ class s implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f6829a;

        public s(@Y61.k DeepLink deepLink) {
            this.f6829a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f6829a, ((s) obj).f6829a);
        }

        public final int hashCode() {
            return this.f6829a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("LinkItemClick(link="), this.f6829a, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$t;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$t */
    public static final /* data */ class t implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JO.m f6830a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ParameterElement.C.b f6831b;

        public t(@Y61.k JO.m mVar, @Y61.k ParameterElement.C.b bVar) {
            this.f6830a = mVar;
            this.f6831b = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return L.f(this.f6830a, tVar.f6830a) && L.f(this.f6831b, tVar.f6831b);
        }

        public final int hashCode() {
            return this.f6831b.hashCode() + (this.f6830a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "RadioGroupSelect(item=" + this.f6830a + ", parameter=" + this.f6831b + ')';
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$u;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$u */
    public static final /* data */ class u implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6832a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f6833b;

        public u(@Y61.k String str, @Y61.l String str2) {
            this.f6832a = str;
            this.f6833b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return L.f(this.f6832a, uVar.f6832a) && L.f(this.f6833b, uVar.f6833b);
        }

        public final int hashCode() {
            int iHashCode = this.f6832a.hashCode() * 31;
            String str = this.f6833b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RdsInputChange(stringId=");
            sb2.append(this.f6832a);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f6833b, ')');
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/a$v;", "LGy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$v */
    public static final /* data */ class v implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final v f6834a = new v();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return 96587735;
        }

        @Y61.k
        public final String toString() {
            return "RecyclerUpdated";
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/a$w;", "LGy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$w */
    public static final /* data */ class w implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final w f6835a = new w();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return -1513521934;
        }

        @Y61.k
        public final String toString() {
            return "RefreshClick";
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$x;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$x */
    public static final /* data */ class x implements InterfaceC13931a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            ((x) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        @Y61.k
        public final String toString() {
            return "RefundSelectedValueChange(value=0)";
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$y;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$y */
    public static final /* data */ class y implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SwitcherItem f6836a;

        static {
            Parcelable.Creator<SwitcherItem> creator = SwitcherItem.CREATOR;
        }

        public y(@Y61.k SwitcherItem switcherItem) {
            this.f6836a = switcherItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && L.f(this.f6836a, ((y) obj).f6836a);
        }

        public final int hashCode() {
            return this.f6836a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SwitcherChecked(item=" + this.f6836a + ')';
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$z;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$z */
    public static final /* data */ class z implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6837a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final GroupParameter.OnboardingTooltip f6838b;

        public z(@Y61.k String str, @Y61.k GroupParameter.OnboardingTooltip onboardingTooltip) {
            this.f6837a = str;
            this.f6838b = onboardingTooltip;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return L.f(this.f6837a, zVar.f6837a) && L.f(this.f6838b, zVar.f6838b);
        }

        public final int hashCode() {
            return this.f6838b.hashCode() + (this.f6837a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "TryToShowOnboarding(id=" + this.f6837a + ", tooltip=" + this.f6838b + ')';
        }
    }

    /* compiled from: StrCalendarParametersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/a$e;", "LGy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.a$e */
    public static final /* data */ class e implements InterfaceC13931a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ParameterElement.C.b f6813a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f6814b;

        public e(@Y61.k ParameterElement.C.b bVar, @Y61.k String str) {
            this.f6813a = bVar;
            this.f6814b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f6813a, eVar.f6813a) && L.f(this.f6814b, eVar.f6814b);
        }

        public final int hashCode() {
            return this.f6814b.hashCode() + (this.f6813a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CarouselClick(parameter=");
            sb2.append(this.f6813a);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f6814b, ')');
        }

        public e(ParameterElement.C.b bVar, String str, int i12, C42822w c42822w) {
            this(bVar, (i12 & 2) != 0 ? bVar.f117208d : str);
        }
    }
}
