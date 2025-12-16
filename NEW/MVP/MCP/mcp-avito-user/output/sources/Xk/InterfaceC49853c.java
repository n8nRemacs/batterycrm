package xK;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacCallScreenDialerMediatorEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LxK/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LxK/c$a;", "LxK/c$b;", "LxK/c$c;", "LxK/c$d;", "LxK/c$e;", "LxK/c$f;", "LxK/c$g;", "LxK/c$h;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xK.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC49853c {

    /* compiled from: IacCallScreenDialerMediatorEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LxK/c$a;", "LxK/c;", "a", "b", "LxK/c$a$a;", "LxK/c$a$b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.c$a */
    public interface a extends InterfaceC49853c {

        /* compiled from: IacCallScreenDialerMediatorEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/c$a$a;", "LxK/c$a;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xK.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12865a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12865a f442378a = new C12865a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C12865a);
            }

            public final int hashCode() {
                return -1784118825;
            }

            @k
            public final String toString() {
                return "DisplayActiveFallbackDialog";
            }
        }

        /* compiled from: IacCallScreenDialerMediatorEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/c$a$b;", "LxK/c$a;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xK.c$a$b */
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f442379a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1908152173;
            }

            @k
            public final String toString() {
                return "HideActiveFallbackDialog";
            }
        }
    }

    /* compiled from: IacCallScreenDialerMediatorEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/c$b;", "LxK/c;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.c$b */
    public static final /* data */ class b implements InterfaceC49853c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f442380a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1826978095;
        }

        @k
        public final String toString() {
            return "CloseScreenAfterUnsuitableEmptyArgument";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/c$c;", "LxK/c;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12866c implements InterfaceC49853c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12866c f442381a = new C12866c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12866c);
        }

        public final int hashCode() {
            return -382965344;
        }

        @k
        public final String toString() {
            return "OpenAudioDevicesBottomSheet";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/c$d;", "LxK/c;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.c$d */
    public static final /* data */ class d implements InterfaceC49853c {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "OpenFinalScreen(finalLink=null)";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/c$e;", "LxK/c;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.c$e */
    public static final /* data */ class e implements InterfaceC49853c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f442382a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f442383b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f442384c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f442385d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final IacCallDirection f442386e;

        public e(boolean z12, @k String str, @k String str2, @l String str3, @k IacCallDirection iacCallDirection) {
            this.f442382a = z12;
            this.f442383b = str;
            this.f442384c = str2;
            this.f442385d = str3;
            this.f442386e = iacCallDirection;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f442382a == eVar.f442382a && L.f(this.f442383b, eVar.f442383b) && L.f(this.f442384c, eVar.f442384c) && L.f(this.f442385d, eVar.f442385d) && this.f442386e == eVar.f442386e;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(Boolean.hashCode(this.f442382a) * 31, 31, this.f442383b), 31, this.f442384c);
            String str = this.f442385d;
            return this.f442386e.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "RequestCameraPermission(isInCall=" + this.f442382a + ", callId=" + this.f442383b + ", scenario=" + this.f442384c + ", itemId=" + this.f442385d + ", direction=" + this.f442386e + ')';
        }
    }

    /* compiled from: IacCallScreenDialerMediatorEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/c$f;", "LxK/c;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.c$f */
    public static final /* data */ class f implements InterfaceC49853c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f442387a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f442388b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f442389c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final IacCallDirection f442390d;

        public f(@k String str, @k String str2, @l String str3, @k IacCallDirection iacCallDirection) {
            this.f442387a = str;
            this.f442388b = str2;
            this.f442389c = str3;
            this.f442390d = iacCallDirection;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f442387a, fVar.f442387a) && L.f(this.f442388b, fVar.f442388b) && L.f(this.f442389c, fVar.f442389c) && this.f442390d == fVar.f442390d;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f442387a.hashCode() * 31, 31, this.f442388b);
            String str = this.f442389c;
            return this.f442390d.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "RequestMicPermission(callId=" + this.f442387a + ", scenario=" + this.f442388b + ", itemId=" + this.f442389c + ", direction=" + this.f442390d + ')';
        }
    }

    /* compiled from: IacCallScreenDialerMediatorEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/c$g;", "LxK/c;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.c$g */
    public static final /* data */ class g implements InterfaceC49853c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final IacPiiDeepLink f442391a;

        public g(@k IacPiiDeepLink iacPiiDeepLink) {
            this.f442391a = iacPiiDeepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f442391a, ((g) obj).f442391a);
        }

        public final int hashCode() {
            return this.f442391a.hashCode();
        }

        @k
        public final String toString() {
            return "RunDeepLinkInAppActivityTask(deeplink=" + this.f442391a + ')';
        }
    }

    /* compiled from: IacCallScreenDialerMediatorEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LxK/c$h;", "LxK/c;", "a", "b", "c", "d", "LxK/c$h$a;", "LxK/c$h$b;", "LxK/c$h$c;", "LxK/c$h$d;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.c$h */
    public interface h extends InterfaceC49853c {

        /* compiled from: IacCallScreenDialerMediatorEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/c$h$a;", "LxK/c$h;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xK.c$h$a */
        public static final /* data */ class a implements h {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f442392a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -522698119;
            }

            @k
            public final String toString() {
                return "CloseAnyWaitBottomSheet";
            }
        }

        /* compiled from: IacCallScreenDialerMediatorEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/c$h$b;", "LxK/c$h;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xK.c$h$b */
        public static final /* data */ class b implements h {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f442393a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 847863815;
            }

            @k
            public final String toString() {
                return "DisplayWaitDialingBottomSheet";
            }
        }

        /* compiled from: IacCallScreenDialerMediatorEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/c$h$c;", "LxK/c$h;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xK.c$h$c, reason: collision with other inner class name */
        public static final /* data */ class C12867c implements h {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12867c f442394a = new C12867c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C12867c);
            }

            public final int hashCode() {
                return -553631592;
            }

            @k
            public final String toString() {
                return "DisplayWaitGsmBottomSheet";
            }
        }

        /* compiled from: IacCallScreenDialerMediatorEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/c$h$d;", "LxK/c$h;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xK.c$h$d */
        public static final /* data */ class d implements h {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f442395a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1516048697;
            }

            @k
            public final String toString() {
                return "DisplayWaitRingingBottomSheet";
            }
        }
    }
}
