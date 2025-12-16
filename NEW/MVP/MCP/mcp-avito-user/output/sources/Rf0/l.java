package RF0;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoStrUniversalColor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LRF0/l;", "", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class l {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f14245d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f14246a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final j f14247b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final j f14248c;

    /* compiled from: TrxPromoStrUniversalColor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRF0/l$a;", "", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.l String str, @Y61.l j jVar, @Y61.l j jVar2) {
        this.f14246a = str;
        this.f14247b = jVar;
        this.f14248c = jVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f14246a, lVar.f14246a) && L.f(this.f14247b, lVar.f14247b) && L.f(this.f14248c, lVar.f14248c);
    }

    public final int hashCode() {
        String str = this.f14246a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        j jVar = this.f14247b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : Integer.hashCode(jVar.f14244a))) * 31;
        j jVar2 = this.f14248c;
        return iHashCode2 + (jVar2 != null ? Integer.hashCode(jVar2.f14244a) : 0);
    }

    @Y61.k
    public final String toString() {
        return "TrxPromoStrUniversalColor(colorKey=" + this.f14246a + ", color=" + this.f14247b + ", colorDark=" + this.f14248c + ')';
    }
}
