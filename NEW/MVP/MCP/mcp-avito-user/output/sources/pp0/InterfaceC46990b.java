package pP0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.pin.impl.verification.WalletPinVerificationActivityResultParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPinVerificationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LpP0/b;", "", "a", "b", "c", "d", "e", "f", "g", "LpP0/b$a;", "LpP0/b$b;", "LpP0/b$c;", "LpP0/b$d;", "LpP0/b$e;", "LpP0/b$f;", "LpP0/b$g;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pP0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC46990b {

    /* compiled from: WalletPinVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/b$a;", "LpP0/b;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.b$a */
    public static final /* data */ class a implements InterfaceC46990b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f428527a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 627832179;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: WalletPinVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpP0/b$b;", "LpP0/b;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12272b implements InterfaceC46990b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WalletPinVerificationActivityResultParams f428528a;

        public C12272b(@k WalletPinVerificationActivityResultParams walletPinVerificationActivityResultParams) {
            this.f428528a = walletPinVerificationActivityResultParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12272b) && L.f(this.f428528a, ((C12272b) obj).f428528a);
        }

        public final int hashCode() {
            return this.f428528a.hashCode();
        }

        @k
        public final String toString() {
            return "SetActivityResultParams(params=" + this.f428528a + ')';
        }
    }

    /* compiled from: WalletPinVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/b$c;", "LpP0/b;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.b$c */
    public static final /* data */ class c implements InterfaceC46990b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428529a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -525958370;
        }

        @k
        public final String toString() {
            return "ShowErrorAnimation";
        }
    }

    /* compiled from: WalletPinVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/b$d;", "LpP0/b;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.b$d */
    public static final /* data */ class d implements InterfaceC46990b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f428530a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1075127786;
        }

        @k
        public final String toString() {
            return "ShowLoadingAnimation";
        }
    }

    /* compiled from: WalletPinVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/b$e;", "LpP0/b;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.b$e */
    public static final /* data */ class e implements InterfaceC46990b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f428531a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1735297277;
        }

        @k
        public final String toString() {
            return "ShowSuccessAnimation";
        }
    }

    /* compiled from: WalletPinVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpP0/b$f;", "LpP0/b;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.b$f */
    public static final /* data */ class f implements InterfaceC46990b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f428532a;

        public f(@k String str) {
            this.f428532a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f428532a, ((f) obj).f428532a);
        }

        public final int hashCode() {
            return this.f428532a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(text="), this.f428532a, ')');
        }
    }

    /* compiled from: WalletPinVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/b$g;", "LpP0/b;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.b$g */
    public static final /* data */ class g implements InterfaceC46990b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f428533a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1351833361;
        }

        @k
        public final String toString() {
            return "StopLoadingAnimation";
        }
    }
}
