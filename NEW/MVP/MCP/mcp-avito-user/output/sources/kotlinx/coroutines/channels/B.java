package kotlinx.coroutines.channels;

import com.avito.android.remote.model.payment.status.PaymentStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Channel.kt */
@X41.g
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/B;", "T", "", "a", "b", "c", "holder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class B<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f410772b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f410773c = new c();

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Object f410774a;

    /* compiled from: Channel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/B$a;", "Lkotlinx/coroutines/channels/B$c;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final Throwable f410775a;

        public a(@Y61.l Throwable th2) {
            this.f410775a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof a) {
                if (kotlin.jvm.internal.L.f(this.f410775a, ((a) obj).f410775a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th2 = this.f410775a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.B.c
        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Closed("), this.f410775a, ')');
        }
    }

    /* compiled from: Channel.kt */
    @kotlinx.coroutines.I0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/B$b;", "", "<init>", "()V", "Lkotlinx/coroutines/channels/B$c;", PaymentStateKt.PAYMENT_STATE_FAILED, "Lkotlinx/coroutines/channels/B$c;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @kotlinx.coroutines.I0
        @Y61.k
        public static a a(@Y61.l Throwable th2) {
            a aVar = new a(th2);
            b bVar = B.f410772b;
            return aVar;
        }

        public b() {
        }
    }

    /* compiled from: Channel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/channels/B$c;", "", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class c {
        @Y61.k
        public String toString() {
            return "Failed";
        }
    }

    @kotlin.X
    private /* synthetic */ B(Object obj) {
        this.f410774a = obj;
    }

    public static final /* synthetic */ B a(Object obj) {
        return new B(obj);
    }

    @Y61.l
    public static final Throwable b(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f410775a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final T c(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return kotlin.jvm.internal.L.f(this.f410774a, ((B) obj).f410774a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f410774a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Y61.k
    public final String toString() {
        Object obj = this.f410774a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
