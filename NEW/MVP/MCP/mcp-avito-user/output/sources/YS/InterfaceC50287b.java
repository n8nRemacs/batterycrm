package ys;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditPartnerInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lys/b;", "", "a", "b", "c", "d", "e", "f", "g", "Lys/b$a;", "Lys/b$b;", "Lys/b$c;", "Lys/b$d;", "Lys/b$e;", "Lys/b$f;", "Lys/b$g;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ys.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC50287b {

    /* compiled from: CreditPartnerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/b$a;", "Lys/b;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.b$a */
    public static final class a implements InterfaceC50287b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f443530a = new a();
    }

    /* compiled from: CreditPartnerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys/b$b;", "Lys/b;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12923b implements InterfaceC50287b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443531a;

        public C12923b(@k String str) {
            this.f443531a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12923b) && L.f(this.f443531a, ((C12923b) obj).f443531a);
        }

        public final int hashCode() {
            return this.f443531a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadUrl(url="), this.f443531a, ')');
        }
    }

    /* compiled from: CreditPartnerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/b$c;", "Lys/b;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.b$c */
    public static final class c implements InterfaceC50287b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f443532a = new c();
    }

    /* compiled from: CreditPartnerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys/b$d;", "Lys/b;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.b$d */
    public static final /* data */ class d implements InterfaceC50287b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f443533a;

        public d(boolean z12) {
            this.f443533a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f443533a == ((d) obj).f443533a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f443533a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowError(isUnknownError="), this.f443533a, ')');
        }
    }

    /* compiled from: CreditPartnerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/b$e;", "Lys/b;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.b$e */
    public static final class e implements InterfaceC50287b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f443534a = new e();
    }

    /* compiled from: CreditPartnerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/b$f;", "Lys/b;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.b$f */
    public static final class f implements InterfaceC50287b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f443535a = new f();
    }

    /* compiled from: CreditPartnerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys/b$g;", "Lys/b;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.b$g */
    public static final /* data */ class g implements InterfaceC50287b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ValueCallback<Uri[]> f443536a;

        public g(@l ValueCallback<Uri[]> valueCallback) {
            this.f443536a = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f443536a, ((g) obj).f443536a);
        }

        public final int hashCode() {
            ValueCallback<Uri[]> valueCallback = this.f443536a;
            if (valueCallback == null) {
                return 0;
            }
            return valueCallback.hashCode();
        }

        @k
        public final String toString() {
            return "TryToOpenCamera(filePathCallback=" + this.f443536a + ')';
        }
    }
}
