package Rf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaReportGenerationAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LRf/a;", "", "a", "b", "c", "LRf/a$a;", "LRf/a$b;", "LRf/a$c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15035a {

    /* compiled from: AutotekaReportGenerationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRf/a$a;", "LRf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0967a implements InterfaceC15035a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0967a f14535a = new C0967a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0967a);
        }

        public final int hashCode() {
            return -1412122928;
        }

        @k
        public final String toString() {
            return "Ok";
        }
    }

    /* compiled from: AutotekaReportGenerationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRf/a$b;", "LRf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rf.a$b */
    public static final /* data */ class b implements InterfaceC15035a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14536a;

        public b(@k DeepLink deepLink) {
            this.f14536a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f14536a, ((b) obj).f14536a);
        }

        public final int hashCode() {
            return this.f14536a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f14536a, ')');
        }
    }

    /* compiled from: AutotekaReportGenerationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRf/a$c;", "LRf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rf.a$c */
    public static final /* data */ class c implements InterfaceC15035a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14537a;

        public c(boolean z12) {
            this.f14537a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f14537a == ((c) obj).f14537a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14537a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateItems(isCheckAuth="), this.f14537a, ')');
        }
    }
}
