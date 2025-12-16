package is;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoPriceInputAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lis/a;", "", "a", "b", "Lis/a$a;", "Lis/a$b;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: is.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC42096a {

    /* compiled from: CpxPromoPriceInputAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lis/a$a;", "Lis/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: is.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11539a implements InterfaceC42096a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f405314a;

        public C11539a(@l String str) {
            this.f405314a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11539a) && L.f(this.f405314a, ((C11539a) obj).f405314a);
        }

        public final int hashCode() {
            String str = this.f405314a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChange(text="), this.f405314a, ')');
        }
    }

    /* compiled from: CpxPromoPriceInputAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lis/a$b;", "Lis/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: is.a$b */
    public static final /* data */ class b implements InterfaceC42096a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f405315a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1993778206;
        }

        @k
        public final String toString() {
            return "Save";
        }
    }
}
