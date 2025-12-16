package Hn0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RdsOrderCancellationReasonsAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LHn0/a;", "", "a", "b", "LHn0/a$a;", "LHn0/a$b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hn0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14013a {

    /* compiled from: RdsOrderCancellationReasonsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHn0/a$a;", "LHn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hn0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0436a implements InterfaceC14013a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.safedeal.delivery.order_cancellation.konveyor.a f7697a;

        public C0436a(@k com.avito.android.safedeal.delivery.order_cancellation.konveyor.a aVar) {
            this.f7697a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0436a) && L.f(this.f7697a, ((C0436a) obj).f7697a);
        }

        public final int hashCode() {
            return this.f7697a.hashCode();
        }

        @k
        public final String toString() {
            return "ReasonClick(reason=" + this.f7697a + ')';
        }
    }

    /* compiled from: RdsOrderCancellationReasonsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHn0/a$b;", "LHn0/a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hn0.a$b */
    public static final class b implements InterfaceC14013a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f7698a = new b();
    }
}
