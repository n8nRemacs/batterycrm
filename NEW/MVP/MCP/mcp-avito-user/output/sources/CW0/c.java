package Cw0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SilentUpdateDownloadAnalytics.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LCw0/c;", "", "a", "b", "c", "LCw0/c$a;", "LCw0/c$b;", "LCw0/c$c;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: SilentUpdateDownloadAnalytics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw0/c$a;", "LCw0/c;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f2798a;

        public a(@k String str) {
            this.f2798a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f2798a, ((a) obj).f2798a);
        }

        public final int hashCode() {
            return this.f2798a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Fail(message="), this.f2798a, ')');
        }
    }

    /* compiled from: SilentUpdateDownloadAnalytics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw0/c$b;", "LCw0/c;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f2799a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -311294444;
        }

        @k
        public final String toString() {
            return "SuccessVersionActual";
        }
    }

    /* compiled from: SilentUpdateDownloadAnalytics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw0/c$c;", "LCw0/c;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0139c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0139c f2800a = new C0139c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0139c);
        }

        public final int hashCode() {
            return -713120773;
        }

        @k
        public final String toString() {
            return "SuccessVersionNotActual";
        }
    }
}
