package Uf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaWaitingForPaymentAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LUf/a;", "", "a", "b", "c", "LUf/a$a;", "LUf/a$b;", "LUf/a$c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15514a {

    /* compiled from: AutotekaWaitingForPaymentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUf/a$a;", "LUf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1133a implements InterfaceC15514a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1133a f16535a = new C1133a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1133a);
        }

        public final int hashCode() {
            return 338356622;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: AutotekaWaitingForPaymentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUf/a$b;", "LUf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uf.a$b */
    public static final /* data */ class b implements InterfaceC15514a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16536a;

        public b(@k DeepLink deepLink) {
            this.f16536a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f16536a, ((b) obj).f16536a);
        }

        public final int hashCode() {
            return this.f16536a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f16536a, ')');
        }
    }

    /* compiled from: AutotekaWaitingForPaymentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUf/a$c;", "LUf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uf.a$c */
    public static final /* data */ class c implements InterfaceC15514a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16537a;

        public c(boolean z12) {
            this.f16537a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f16537a == ((c) obj).f16537a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16537a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateItems(isCheckAuth="), this.f16537a, ')');
        }
    }
}
