package mz0;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmz0/a;", "", "a", "b", "Lmz0/a$a;", "Lmz0/a$b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC44156a {

    /* compiled from: StrOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmz0/a$a;", "Lmz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mz0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11850a implements InterfaceC44156a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11850a f414836a = new C11850a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11850a);
        }

        public final int hashCode() {
            return 733509008;
        }

        @k
        public final String toString() {
            return "BackIconClick";
        }
    }

    /* compiled from: StrOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmz0/a$b;", "Lmz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mz0.a$b */
    public static final /* data */ class b implements InterfaceC44156a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f414837a;

        public b(@l Integer num) {
            this.f414837a = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f414837a, ((b) obj).f414837a);
        }

        public final int hashCode() {
            Integer num = this.f414837a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("OnTabClick(position="), this.f414837a, ')');
        }
    }
}
