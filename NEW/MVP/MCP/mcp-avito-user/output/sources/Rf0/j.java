package RF0;

import androidx.appcompat.app.r;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TrxPromoStrColor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LRF0/j;", "", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f14243b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f14244a;

    /* compiled from: TrxPromoStrColor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRF0/j$a;", "", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@InterfaceC42156l int i12) {
        this.f14244a = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f14244a == ((j) obj).f14244a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14244a);
    }

    @Y61.k
    public final String toString() {
        return r.t(new StringBuilder("TrxPromoStrColor(value="), this.f14244a, ')');
    }
}
