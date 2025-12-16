package x60;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WebPaymentMviInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lx60/b;", "", "a", "b", "c", "d", "e", "f", "g", "Lx60/b$a;", "Lx60/b$b;", "Lx60/b$c;", "Lx60/b$d;", "Lx60/b$e;", "Lx60/b$f;", "Lx60/b$g;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: WebPaymentMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx60/b$a;", "Lx60/b;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f442228a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f442228a, ((a) obj).f442228a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f442228a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Finish(deeplink="), this.f442228a, ')');
        }

        public a(@l DeepLink deepLink) {
            this.f442228a = deepLink;
        }

        public /* synthetic */ a(DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : deepLink);
        }
    }

    /* compiled from: WebPaymentMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx60/b$b;", "Lx60/b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x60.b$b, reason: collision with other inner class name */
    public static final class C12846b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12846b f442229a = new C12846b();
    }

    /* compiled from: WebPaymentMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx60/b$c;", "Lx60/b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f442230a = new c();
    }

    /* compiled from: WebPaymentMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx60/b$d;", "Lx60/b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f442231a = new d();
    }

    /* compiled from: WebPaymentMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx60/b$e;", "Lx60/b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f442232a = new e();
    }

    /* compiled from: WebPaymentMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx60/b$f;", "Lx60/b;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f442233a;

        public f(int i12) {
            this.f442233a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f442233a == ((f) obj).f442233a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f442233a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ShowError(progress="), this.f442233a, ')');
        }
    }

    /* compiled from: WebPaymentMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx60/b$g;", "Lx60/b;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f442234a;

        public g(int i12) {
            this.f442234a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f442234a == ((g) obj).f442234a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f442234a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateLoadingProgress(progress="), this.f442234a, ')');
        }
    }
}
