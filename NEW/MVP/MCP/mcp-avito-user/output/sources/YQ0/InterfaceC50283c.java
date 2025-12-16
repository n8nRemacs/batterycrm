package yq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Advices;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortAdvicesInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lyq0/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lyq0/c$a;", "Lyq0/c$b;", "Lyq0/c$c;", "Lyq0/c$d;", "Lyq0/c$e;", "Lyq0/c$f;", "Lyq0/c$g;", "Lyq0/c$h;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yq0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC50283c {

    /* compiled from: ShortAdvicesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/c$a;", "Lyq0/c;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.c$a */
    public static final /* data */ class a implements InterfaceC50283c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Throwable f443513a;

        public a(@l Throwable th2) {
            this.f443513a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return L.f(null, null) && L.f(this.f443513a, aVar.f443513a);
        }

        public final int hashCode() {
            Throwable th2 = this.f443513a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("AdvicesError(apiError=null, throwable="), this.f443513a, ')');
        }
    }

    /* compiled from: ShortAdvicesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/c$b;", "Lyq0/c;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.c$b */
    public static final /* data */ class b implements InterfaceC50283c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Advices f443514a;

        public b(@k Advices advices) {
            this.f443514a = advices;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443514a, ((b) obj).f443514a);
        }

        public final int hashCode() {
            return this.f443514a.hashCode();
        }

        @k
        public final String toString() {
            return "AdvicesLoaded(advices=" + this.f443514a + ')';
        }
    }

    /* compiled from: ShortAdvicesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq0/c$c;", "Lyq0/c;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12921c implements InterfaceC50283c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12921c f443515a = new C12921c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12921c);
        }

        public final int hashCode() {
            return 788507166;
        }

        @k
        public final String toString() {
            return "AdvicesLoading";
        }
    }

    /* compiled from: ShortAdvicesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/c$d;", "Lyq0/c;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.c$d */
    public static final /* data */ class d implements InterfaceC50283c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443516a;

        public d(@k String str) {
            this.f443516a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f443516a, ((d) obj).f443516a);
        }

        public final int hashCode() {
            return this.f443516a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HintHidden(hintId="), this.f443516a, ')');
        }
    }

    /* compiled from: ShortAdvicesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq0/c$e;", "Lyq0/c;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.c$e */
    public static final /* data */ class e implements InterfaceC50283c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f443517a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1180342674;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: ShortAdvicesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/c$f;", "Lyq0/c;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.c$f */
    public static final /* data */ class f implements InterfaceC50283c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443518a;

        public f(@k DeepLink deepLink) {
            this.f443518a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f443518a, ((f) obj).f443518a);
        }

        public final int hashCode() {
            return this.f443518a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenAllHints(deepLink="), this.f443518a, ')');
        }
    }

    /* compiled from: ShortAdvicesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/c$g;", "Lyq0/c;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.c$g */
    public static final /* data */ class g implements InterfaceC50283c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443519a;

        public g(@k String str) {
            this.f443519a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return L.f(this.f443519a, ((g) obj).f443519a);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f443519a.hashCode() * 31) + 316091513;
        }

        @k
        public final String toString() {
            return AK.c.s(new StringBuilder("OpenHintDetails(hintId="), this.f443519a, ", openPlace=from_widget)");
        }
    }

    /* compiled from: ShortAdvicesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq0/c$h;", "Lyq0/c;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.c$h */
    public static final /* data */ class h implements InterfaceC50283c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f443520a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 879811794;
        }

        @k
        public final String toString() {
            return "Reset";
        }
    }
}
