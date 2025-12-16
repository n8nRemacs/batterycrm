package xK;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.permissions.PermissionState;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacCallScreenDialerMediatorAction.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u001a\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"LxK/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "LxK/b$a;", "LxK/b$b;", "LxK/b$c;", "LxK/b$d;", "LxK/b$e;", "LxK/b$f;", "LxK/b$g;", "LxK/b$h;", "LxK/b$i;", "LxK/b$j;", "LxK/b$k;", "LxK/b$l;", "LxK/b$m;", "LxK/b$n;", "LxK/b$o;", "LxK/b$p;", "LxK/b$q;", "LxK/b$r;", "LxK/b$s;", "LxK/b$t;", "LxK/b$u;", "LxK/b$v;", "LxK/b$w;", "LxK/b$x;", "LxK/b$y;", "LxK/b$z;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xK.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC49852b {

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$a;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$a */
    public static final /* data */ class a implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f442340a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 625606334;
        }

        @Y61.k
        public final String toString() {
            return "OnActiveFallbackDialogGsmClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$b;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12860b implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f442341a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f442342b;

        public C12860b(@Y61.k String str, @Y61.k String str2) {
            this.f442341a = str;
            this.f442342b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12860b)) {
                return false;
            }
            C12860b c12860b = (C12860b) obj;
            return L.f(this.f442341a, c12860b.f442341a) && L.f(this.f442342b, c12860b.f442342b);
        }

        public final int hashCode() {
            return this.f442342b.hashCode() + (this.f442341a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnAudioDeviceListItemClicked(audioDeviceName=");
            sb2.append(this.f442341a);
            sb2.append(", audioDeviceId=");
            return C22026a.c(sb2, this.f442342b, ')');
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$c;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$c */
    public static final /* data */ class c implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f442343a;

        public c(boolean z12) {
            this.f442343a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f442343a == ((c) obj).f442343a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f442343a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("OnChangeAudioDeviceClicked(isFromArgument="), this.f442343a, ')');
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$d;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$d */
    public static final /* data */ class d implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f442344a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1566821078;
        }

        @Y61.k
        public final String toString() {
            return "OnChangeCameraClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$e;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$e */
    public static final /* data */ class e implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f442345a;

        public e(@Y61.k String str) {
            this.f442345a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f442345a, ((e) obj).f442345a);
        }

        public final int hashCode() {
            return this.f442345a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnDtmfButtonClicked(tone="), this.f442345a, ')');
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$f;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$f */
    public static final /* data */ class f implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f442346a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1679038318;
        }

        @Y61.k
        public final String toString() {
            return "OnHangupClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$g;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$g */
    public static final /* data */ class g implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f442347a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2062516010;
        }

        @Y61.k
        public final String toString() {
            return "OnHideVpnToastClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$h;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$h */
    public static final /* data */ class h implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PermissionState f442348a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f442349b;

        public h(@Y61.k PermissionState permissionState, @Y61.k String str) {
            this.f442348a = permissionState;
            this.f442349b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f442348a == hVar.f442348a && L.f(this.f442349b, hVar.f442349b);
        }

        public final int hashCode() {
            return this.f442349b.hashCode() + (this.f442348a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnInCallCameraPermissionResult(cameraPermissionState=");
            sb2.append(this.f442348a);
            sb2.append(", callId=");
            return C22026a.c(sb2, this.f442349b, ')');
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LxK/b$i;", "LxK/b;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$i */
    public static final /* data */ class i implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a f442350a;

        /* compiled from: IacCallScreenDialerMediatorAction.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LxK/b$i$a;", "", "a", "b", "c", "LxK/b$i$a$a;", "LxK/b$i$a$b;", "LxK/b$i$a$c;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xK.b$i$a */
        public interface a {

            /* compiled from: IacCallScreenDialerMediatorAction.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$i$a$a;", "LxK/b$i$a;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: xK.b$i$a$a, reason: collision with other inner class name */
            public static final /* data */ class C12861a implements a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C12861a f442351a = new C12861a();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C12861a);
                }

                public final int hashCode() {
                    return -1389019652;
                }

                @Y61.k
                public final String toString() {
                    return "CallNotification";
                }
            }

            /* compiled from: IacCallScreenDialerMediatorAction.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$i$a$b;", "LxK/b$i$a;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: xK.b$i$a$b, reason: collision with other inner class name */
            public static final /* data */ class C12862b implements a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C12862b f442352a = new C12862b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C12862b);
                }

                public final int hashCode() {
                    return -1899112899;
                }

                @Y61.k
                public final String toString() {
                    return "CallScreen";
                }
            }

            /* compiled from: IacCallScreenDialerMediatorAction.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$i$a$c;", "LxK/b$i$a;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: xK.b$i$a$c */
            public static final /* data */ class c implements a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final c f442353a = new c();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -2120933548;
                }

                @Y61.k
                public final String toString() {
                    return "ReserveNotification";
                }
            }
        }

        public i(@Y61.k a aVar) {
            this.f442350a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f442350a, ((i) obj).f442350a);
        }

        public final int hashCode() {
            return this.f442350a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnIncomingCallAnswerClicked(from=" + this.f442350a + ')';
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$j;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$j */
    public static final /* data */ class j implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f442354a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1007286780;
        }

        @Y61.k
        public final String toString() {
            return "OnIncomingCallRejectClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$k;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$k */
    public static final /* data */ class k implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f442355a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 702519290;
        }

        @Y61.k
        public final String toString() {
            return "OnItemButtonClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$l;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$l */
    public static final /* data */ class l implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f442356a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -374901787;
        }

        @Y61.k
        public final String toString() {
            return "OnOpenDtmfKeyboardClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$m;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$m */
    public static final /* data */ class m implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PermissionState f442357a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final IacCallDirection f442358b;

        public m(@Y61.k PermissionState permissionState, @Y61.k IacCallDirection iacCallDirection) {
            this.f442357a = permissionState;
            this.f442358b = iacCallDirection;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.f442357a == mVar.f442357a && this.f442358b == mVar.f442358b;
        }

        public final int hashCode() {
            return this.f442358b.hashCode() + (this.f442357a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnPreconditionsCameraPermissionResult(cameraPermissionState=" + this.f442357a + ", direction=" + this.f442358b + ')';
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$n;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$n */
    public static final /* data */ class n implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PermissionState f442359a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final IacCallDirection f442360b;

        public n(@Y61.k PermissionState permissionState, @Y61.k IacCallDirection iacCallDirection) {
            this.f442359a = permissionState;
            this.f442360b = iacCallDirection;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f442359a == nVar.f442359a && this.f442360b == nVar.f442360b;
        }

        public final int hashCode() {
            return this.f442360b.hashCode() + (this.f442359a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnPreconditionsMicPermissionResult(micPermissionState=" + this.f442359a + ", direction=" + this.f442360b + ')';
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$o;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$o */
    public static final /* data */ class o implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final IacCallDirection f442361a;

        public o(@Y61.k IacCallDirection iacCallDirection) {
            this.f442361a = iacCallDirection;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f442361a == ((o) obj).f442361a;
        }

        public final int hashCode() {
            return this.f442361a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnPreconditionsRoutedToSystemSettings(direction=" + this.f442361a + ')';
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$p;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$p */
    public static final /* data */ class p implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f442362a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1714453820;
        }

        @Y61.k
        public final String toString() {
            return "OnScreenArgumentEmpty";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$q;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$q */
    public static final /* data */ class q implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final IacCallScreenArgument.WithoutAction f442363a;

        public q(@Y61.k IacCallScreenArgument.WithoutAction withoutAction) {
            this.f442363a = withoutAction;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f442363a, ((q) obj).f442363a);
        }

        public final int hashCode() {
            return this.f442363a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnScreenArgumentWithoutAction(argument=" + this.f442363a + ')';
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$r;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$r */
    public static final /* data */ class r implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        public final int f442364a;

        public r(int i12) {
            this.f442364a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f442364a == ((r) obj).f442364a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f442364a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("OnScreenCreated(screenId="), this.f442364a, ')');
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$s;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$s */
    public static final /* data */ class s implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        public final int f442365a;

        public s(int i12) {
            this.f442365a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f442365a == ((s) obj).f442365a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f442365a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("OnScreenDestroyed(screenId="), this.f442365a, ')');
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$t;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$t */
    public static final /* data */ class t implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        public final int f442366a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PermissionState f442367b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final PermissionState f442368c;

        public t(int i12, @Y61.k PermissionState permissionState, @Y61.k PermissionState permissionState2) {
            this.f442366a = i12;
            this.f442367b = permissionState;
            this.f442368c = permissionState2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.f442366a == tVar.f442366a && this.f442367b == tVar.f442367b && this.f442368c == tVar.f442368c;
        }

        public final int hashCode() {
            return this.f442368c.hashCode() + ((this.f442367b.hashCode() + (Integer.hashCode(this.f442366a) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnScreenStarted(screenId=" + this.f442366a + ", mic=" + this.f442367b + ", camera=" + this.f442368c + ')';
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxK/b$u;", "LxK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$u */
    public static final /* data */ class u implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        public final int f442369a;

        public u(int i12) {
            this.f442369a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.f442369a == ((u) obj).f442369a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f442369a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("OnScreenStopped(screenId="), this.f442369a, ')');
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$v;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$v */
    public static final /* data */ class v implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final v f442370a = new v();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return 623974406;
        }

        @Y61.k
        public final String toString() {
            return "OnToggleCameraClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$w;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$w */
    public static final /* data */ class w implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final w f442371a = new w();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return -2138309035;
        }

        @Y61.k
        public final String toString() {
            return "OnToggleControlsClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$x;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$x */
    public static final /* data */ class x implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final x f442372a = new x();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return 714191772;
        }

        @Y61.k
        public final String toString() {
            return "OnToggleMicClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$y;", "LxK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$y */
    public static final /* data */ class y implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final y f442373a = new y();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -1724862915;
        }

        @Y61.k
        public final String toString() {
            return "OnWaitBottomSheetGsmClicked";
        }
    }

    /* compiled from: IacCallScreenDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LxK/b$z;", "LxK/b;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xK.b$z */
    public static final /* data */ class z implements InterfaceC49852b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a f442374a;

        /* compiled from: IacCallScreenDialerMediatorAction.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LxK/b$z$a;", "", "a", "b", "c", "LxK/b$z$a$a;", "LxK/b$z$a$b;", "LxK/b$z$a$c;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xK.b$z$a */
        public interface a {

            /* compiled from: IacCallScreenDialerMediatorAction.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$z$a$a;", "LxK/b$z$a;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: xK.b$z$a$a, reason: collision with other inner class name */
            public static final /* data */ class C12863a implements a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C12863a f442375a = new C12863a();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C12863a);
                }

                public final int hashCode() {
                    return 1834882329;
                }

                @Y61.k
                public final String toString() {
                    return "Dialing";
                }
            }

            /* compiled from: IacCallScreenDialerMediatorAction.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$z$a$b;", "LxK/b$z$a;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: xK.b$z$a$b, reason: collision with other inner class name */
            public static final /* data */ class C12864b implements a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C12864b f442376a = new C12864b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C12864b);
                }

                public final int hashCode() {
                    return 1251572520;
                }

                @Y61.k
                public final String toString() {
                    return "Gsm";
                }
            }

            /* compiled from: IacCallScreenDialerMediatorAction.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxK/b$z$a$c;", "LxK/b$z$a;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: xK.b$z$a$c */
            public static final /* data */ class c implements a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final c f442377a = new c();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1386888793;
                }

                @Y61.k
                public final String toString() {
                    return "Ringing";
                }
            }
        }

        public z(@Y61.k a aVar) {
            this.f442374a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && L.f(this.f442374a, ((z) obj).f442374a);
        }

        public final int hashCode() {
            return this.f442374a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnWaitBottomSheetHangupClicked(from=" + this.f442374a + ')';
        }
    }
}
