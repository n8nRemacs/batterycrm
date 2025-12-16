package rw0;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalculationOptions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrw0/k;", "", "<init>", "()V", "a", "b", "Lrw0/k$a;", "Lrw0/k$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class k {

    /* compiled from: CalculationOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrw0/k$a;", "Lrw0/k;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f437225a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: CalculationOptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/k$b;", "Lrw0/k;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final j f437226a;

        public b(@Y61.k j jVar) {
            super(null);
            this.f437226a = jVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f437226a, ((b) obj).f437226a);
        }

        public final int hashCode() {
            return this.f437226a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Selected(selectedPayment=" + this.f437226a + ')';
        }
    }

    public /* synthetic */ k(C42822w c42822w) {
        this();
    }

    public k() {
    }
}
