package pP0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: WalletPinVerificationAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LpP0/a;", "", "a", "b", "c", "d", "e", "f", "LpP0/a$a;", "LpP0/a$b;", "LpP0/a$c;", "LpP0/a$d;", "LpP0/a$e;", "LpP0/a$f;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC46989a {

    /* compiled from: WalletPinVerificationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/a$a;", "LpP0/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12271a implements InterfaceC46989a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12271a f428521a = new C12271a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12271a);
        }

        public final int hashCode() {
            return 975809962;
        }

        @k
        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: WalletPinVerificationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/a$b;", "LpP0/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.a$b */
    public static final /* data */ class b implements InterfaceC46989a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f428522a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 775386614;
        }

        @k
        public final String toString() {
            return "BiometryClicked";
        }
    }

    /* compiled from: WalletPinVerificationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/a$c;", "LpP0/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.a$c */
    public static final /* data */ class c implements InterfaceC46989a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428523a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 920382210;
        }

        @k
        public final String toString() {
            return "PinSymbolDelete";
        }
    }

    /* compiled from: WalletPinVerificationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpP0/a$d;", "LpP0/a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.a$d */
    public static final /* data */ class d implements InterfaceC46989a {

        /* renamed from: a, reason: collision with root package name */
        public final char f428524a;

        public d(char c12) {
            this.f428524a = c12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f428524a == ((d) obj).f428524a;
        }

        public final int hashCode() {
            return Character.hashCode(this.f428524a);
        }

        @k
        public final String toString() {
            return "PinSymbolEntered(symbol=" + this.f428524a + ')';
        }
    }

    /* compiled from: WalletPinVerificationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/a$e;", "LpP0/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.a$e */
    public static final /* data */ class e implements InterfaceC46989a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f428525a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -629201344;
        }

        @k
        public final String toString() {
            return "RecoverPinClicked";
        }
    }

    /* compiled from: WalletPinVerificationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpP0/a$f;", "LpP0/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pP0.a$f */
    public static final /* data */ class f implements InterfaceC46989a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f428526a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1817224629;
        }

        @k
        public final String toString() {
            return "RetryContentLoading";
        }
    }
}
