package Uo0;

import android.text.SpannableString;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchAction.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:#\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$\u0082\u0001#%&'()*+,-./0123456789:;<=>?@ABCDEFG¨\u0006H"}, d2 = {"LUo0/e;", "LUo0/d;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "LUo0/e$a;", "LUo0/e$b;", "LUo0/e$c;", "LUo0/e$d;", "LUo0/e$e;", "LUo0/e$f;", "LUo0/e$g;", "LUo0/e$h;", "LUo0/e$i;", "LUo0/e$j;", "LUo0/e$k;", "LUo0/e$l;", "LUo0/e$m;", "LUo0/e$n;", "LUo0/e$o;", "LUo0/e$p;", "LUo0/e$q;", "LUo0/e$r;", "LUo0/e$s;", "LUo0/e$t;", "LUo0/e$u;", "LUo0/e$v;", "LUo0/e$w;", "LUo0/e$x;", "LUo0/e$y;", "LUo0/e$z;", "LUo0/e$A;", "LUo0/e$B;", "LUo0/e$C;", "LUo0/e$D;", "LUo0/e$E;", "LUo0/e$F;", "LUo0/e$G;", "LUo0/e$H;", "LUo0/e$I;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface e extends d {

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$A;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class A implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16609a;

        public A(@Y61.k String str) {
            this.f16609a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && L.f(this.f16609a, ((A) obj).f16609a);
        }

        public final int hashCode() {
            return this.f16609a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnValidityPeriodSelectedAction(enteredOfferTtlDaysValue="), this.f16609a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$B;", "LUo0/e;", "LUo0/j;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class B implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final B f16610a = new B();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof B);
        }

        public final int hashCode() {
            return 905090330;
        }

        @Y61.k
        public final String toString() {
            return "OpenAutoDispatchRequiredToastAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/e$C;", "LUo0/e;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class C implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16611a;

        public C(@Y61.k DeepLink deepLink) {
            this.f16611a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C) && L.f(this.f16611a, ((C) obj).f16611a);
        }

        public final int hashCode() {
            return this.f16611a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplinkAction(deeplink="), this.f16611a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$D;", "LUo0/e;", "LUo0/i;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class D implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final D f16612a = new D();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof D);
        }

        public final int hashCode() {
            return 1752865558;
        }

        @Y61.k
        public final String toString() {
            return "OpenHowAutoDispatchPriceCalculatesDialogAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$E;", "LUo0/e;", "LUo0/j;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class E implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final E f16613a = new E();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof E);
        }

        public final int hashCode() {
            return 639125282;
        }

        @Y61.k
        public final String toString() {
            return "OpenHowAutoDispatchWorksDialogAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$F;", "LUo0/e;", "LUo0/i;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class F implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SpannableString f16614a;

        public F(@Y61.k SpannableString spannableString) {
            this.f16614a = spannableString;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F) && this.f16614a.equals(((F) obj).f16614a);
        }

        public final int hashCode() {
            return this.f16614a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowAudienceCountDialogAction(audienceExplained=" + ((Object) this.f16614a) + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/e$H;", "LUo0/e;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class H implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16617a;

        public H(@Y61.k String str) {
            this.f16617a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof H) && L.f(this.f16617a, ((H) obj).f16617a);
        }

        public final int hashCode() {
            return this.f16617a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowOfferAction(link="), this.f16617a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$I;", "LUo0/e;", "LUo0/i;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class I implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final I f16618a = new I();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof I);
        }

        public final int hashCode() {
            return 1761025963;
        }

        @Y61.k
        public final String toString() {
            return "ValidityDateInputFinished";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$a;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.e$a, reason: case insensitive filesystem */
    public static final /* data */ class C15547a implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16619a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16620b;

        public C15547a(@Y61.k DeepLink deepLink, int i12) {
            this.f16619a = deepLink;
            this.f16620b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15547a)) {
                return false;
            }
            C15547a c15547a = (C15547a) obj;
            return L.f(this.f16619a, c15547a.f16619a) && this.f16620b == c15547a.f16620b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16620b) + (this.f16619a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplyVasDispatchAction(applyDeepLink=");
            sb2.append(this.f16619a);
            sb2.append(", clickedButtonId=");
            return androidx.appcompat.app.r.t(sb2, this.f16620b, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$b;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.e$b, reason: case insensitive filesystem */
    public static final /* data */ class C15548b implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16621a;

        public C15548b(@Y61.k String str) {
            this.f16621a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15548b) && L.f(this.f16621a, ((C15548b) obj).f16621a);
        }

        public final int hashCode() {
            return this.f16621a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AudienceCountChangedAction(newAudienceCount="), this.f16621a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$c;", "LUo0/e;", "LUo0/i;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.e$c, reason: case insensitive filesystem */
    public static final /* data */ class C15549c implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C15549c f16622a = new C15549c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C15549c);
        }

        public final int hashCode() {
            return -401953502;
        }

        @Y61.k
        public final String toString() {
            return "AudienceCountInputFinished";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$d;", "LUo0/e;", "LUo0/i;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.e$d, reason: case insensitive filesystem */
    public static final /* data */ class C15550d implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C15550d f16623a = new C15550d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C15550d);
        }

        public final int hashCode() {
            return 1014646109;
        }

        @Y61.k
        public final String toString() {
            return "AutodispatchBudgetInputFinished";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$e;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.e$e, reason: collision with other inner class name */
    public static final /* data */ class C1149e implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16624a;

        public C1149e(@Y61.k String str) {
            this.f16624a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1149e) && L.f(this.f16624a, ((C1149e) obj).f16624a);
        }

        public final int hashCode() {
            return this.f16624a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DiscountPercentValueChangedAction(discountValue="), this.f16624a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$f;", "LUo0/e;", "LUo0/i;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.e$f, reason: case insensitive filesystem */
    public static final /* data */ class C15551f implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C15551f f16625a = new C15551f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C15551f);
        }

        public final int hashCode() {
            return -440387236;
        }

        @Y61.k
        public final String toString() {
            return "DiscountPercentsInputFinished";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$g;", "LUo0/e;", "LUo0/i;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.e$g, reason: case insensitive filesystem */
    public static final /* data */ class C15552g implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C15552g f16626a = new C15552g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C15552g);
        }

        public final int hashCode() {
            return -1440428802;
        }

        @Y61.k
        public final String toString() {
            return "DiscountRoublesInputFinished";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$h;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.e$h, reason: case insensitive filesystem */
    public static final /* data */ class C15553h implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16627a;

        public C15553h(@Y61.k String str) {
            this.f16627a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15553h) && L.f(this.f16627a, ((C15553h) obj).f16627a);
        }

        public final int hashCode() {
            return this.f16627a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DiscountRoublesValueChangedAction(discountValue="), this.f16627a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/e$i;", "LUo0/e;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.e$i, reason: case insensitive filesystem */
    public static final /* data */ class C15554i implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16628a;

        public C15554i(@Y61.k DeepLink deepLink) {
            this.f16628a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15554i) && L.f(this.f16628a, ((C15554i) obj).f16628a);
        }

        public final int hashCode() {
            return this.f16628a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DoNotApplyDispatchVasFlowClickedAction(deeplink="), this.f16628a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/e$j;", "LUo0/e;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f16629a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1471378827;
        }

        @Y61.k
        public final String toString() {
            return "FinishFlowClickedAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$k;", "LUo0/e;", "LUo0/j;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f16630a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1481909784;
        }

        @Y61.k
        public final String toString() {
            return "InitialDataRequestAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$l;", "LUo0/e;", "LUo0/j;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f16631a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -141499764;
        }

        @Y61.k
        public final String toString() {
            return "InitialDataRequestVasAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$m;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16632a;

        public m(@Y61.k String str) {
            this.f16632a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f16632a, ((m) obj).f16632a);
        }

        public final int hashCode() {
            return this.f16632a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OfferSelectedAction(selectedOfferSlug="), this.f16632a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$n;", "LUo0/e;", "LUo0/j;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f16633a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1773196228;
        }

        @Y61.k
        public final String toString() {
            return "OfferSelectionClickedAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$o;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16634a;

        public o(@Y61.k String str) {
            this.f16634a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f16634a, ((o) obj).f16634a);
        }

        public final int hashCode() {
            return this.f16634a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnAutoDispatchBudgetChangedAction(budgetValue="), this.f16634a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$p;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        public final long f16635a;

        public p(long j12) {
            this.f16635a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f16635a == ((p) obj).f16635a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f16635a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("OnAutoDispatchDurationChipSelectedAction(selectedTtlDays="), this.f16635a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$q;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        public final int f16636a;

        public q(int i12) {
            this.f16636a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f16636a == ((q) obj).f16636a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16636a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("OnAutoDispatchPresetChipSelectedAction(presetId="), this.f16636a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$r;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16637a;

        public r(boolean z12) {
            this.f16637a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f16637a == ((r) obj).f16637a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16637a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("OnAutoDispatchToggleSwitchedAction(isChecked="), this.f16637a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/e$s;", "LUo0/e;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final s f16638a = new s();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -559874155;
        }

        @Y61.k
        public final String toString() {
            return "OnCancelledVasPaymentAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$t;", "LUo0/e;", "LUo0/i;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements e, i {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16639a;

        public t() {
            this(false, 1, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f16639a == ((t) obj).f16639a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16639a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("OnClosePressedAction(closeIconClicked="), this.f16639a, ')');
        }

        public t(boolean z12) {
            this.f16639a = z12;
        }

        public /* synthetic */ t(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$u;", "LUo0/e;", "LUo0/j;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final u f16640a = new u();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 199908813;
        }

        @Y61.k
        public final String toString() {
            return "OnConfirmClickedAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$v;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class v implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LocalDate f16641a;

        public v(@Y61.k LocalDate localDate) {
            this.f16641a = localDate;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && L.f(this.f16641a, ((v) obj).f16641a);
        }

        public final int hashCode() {
            return this.f16641a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.t(new StringBuilder("OnDateSelectedAction(date="), this.f16641a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$w;", "LUo0/e;", "LUo0/i;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final w f16642a = new w();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return 212463567;
        }

        @Y61.k
        public final String toString() {
            return "OnDateSelectionClickedAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$x;", "LUo0/e;", "LUo0/j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class x implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        public final int f16643a;

        public x(int i12) {
            this.f16643a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.f16643a == ((x) obj).f16643a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16643a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("OnFastChipSelectedAction(selectedChipId="), this.f16643a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$y;", "LUo0/e;", "LUo0/j;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class y implements e, Uo0.j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final y f16644a = new y();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 717267668;
        }

        @Y61.k
        public final String toString() {
            return "OnScrolledAfterCustomFastChipSelected";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUo0/e$z;", "LUo0/e;", "LUo0/i;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class z implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final z f16645a = new z();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -1872767417;
        }

        @Y61.k
        public final String toString() {
            return "OnSuccessVasPaymentAction";
        }
    }

    /* compiled from: CreateDiscountDispatchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUo0/e$G;", "LUo0/e;", "LUo0/i;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class G implements e, i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f16615a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16616b;

        public G(@Y61.l AttributedText attributedText, boolean z12) {
            this.f16615a = attributedText;
            this.f16616b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof G)) {
                return false;
            }
            G g12 = (G) obj;
            return L.f(this.f16615a, g12.f16615a) && this.f16616b == g12.f16616b;
        }

        public final int hashCode() {
            AttributedText attributedText = this.f16615a;
            return Boolean.hashCode(this.f16616b) + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowHowItWorksDialogAction(howItWorksText=");
            sb2.append(this.f16615a);
            sb2.append(", sendAnalyticsOnMoreClick=");
            return androidx.appcompat.app.r.x(sb2, this.f16616b, ')');
        }

        public /* synthetic */ G(AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
            this(attributedText, (i12 & 2) != 0 ? false : z12);
        }
    }
}
