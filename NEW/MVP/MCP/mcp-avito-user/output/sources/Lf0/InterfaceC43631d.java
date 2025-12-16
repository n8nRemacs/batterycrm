package lF0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentSelectorState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LlF0/d;", "", "a", "b", "LlF0/d$a;", "LlF0/d$b;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lF0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43631d {

    /* compiled from: PaymentSelectorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlF0/d$a;", "LlF0/d;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.d$a */
    public static final /* data */ class a implements InterfaceC43631d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Object f413685a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f413686b;

        public a(@k List<? extends TV0.a> list, @l String str) {
            this.f413685a = list;
            this.f413686b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f413685a, aVar.f413685a) && L.f(this.f413686b, aVar.f413686b);
        }

        public final int hashCode() {
            int iHashCode = this.f413685a.hashCode() * 31;
            String str = this.f413686b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(items=");
            sb2.append(this.f413685a);
            sb2.append(", actionTitle=");
            return C22026a.c(sb2, this.f413686b, ')');
        }
    }

    /* compiled from: PaymentSelectorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlF0/d$b;", "LlF0/d;", "<init>", "()V", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.d$b */
    public static final /* data */ class b implements InterfaceC43631d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f413687a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 10076950;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
