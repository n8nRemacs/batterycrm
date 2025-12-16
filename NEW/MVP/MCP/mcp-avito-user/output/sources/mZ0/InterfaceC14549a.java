package Mz0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MonthSelectorAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LMz0/a;", "", "a", "b", "LMz0/a$a;", "LMz0/a$b;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14549a {

    /* compiled from: MonthSelectorAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMz0/a$a;", "LMz0/a;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mz0.a$a, reason: collision with other inner class name */
    public static final class C0715a implements InterfaceC14549a {
        static {
            new C0715a();
        }
    }

    /* compiled from: MonthSelectorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMz0/a$b;", "LMz0/a;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mz0.a$b */
    public static final /* data */ class b implements InterfaceC14549a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11153a;

        public b(@k String str) {
            this.f11153a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f11153a, ((b) obj).f11153a);
        }

        public final int hashCode() {
            return this.f11153a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("MonthClicked(monthId="), this.f11153a, ')');
        }
    }
}
