package Dw0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SilentUpdateInstallAnalytics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LDw0/c;", "", "a", "b", "LDw0/c$a;", "LDw0/c$b;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dw0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13450c {

    /* compiled from: SilentUpdateInstallAnalytics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw0/c$a;", "LDw0/c;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw0.c$a */
    public static final /* data */ class a implements InterfaceC13450c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3557a;

        public a(@k String str) {
            this.f3557a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f3557a, ((a) obj).f3557a);
        }

        public final int hashCode() {
            return this.f3557a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Fail(message="), this.f3557a, ')');
        }
    }

    /* compiled from: SilentUpdateInstallAnalytics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDw0/c$b;", "LDw0/c;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw0.c$b */
    public static final /* data */ class b implements InterfaceC13450c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f3558a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 795807852;
        }

        @k
        public final String toString() {
            return "Success";
        }
    }
}
