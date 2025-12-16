package rw0;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrw0/l;", "", "<init>", "()V", "a", "b", "Lrw0/l$a;", "Lrw0/l$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class l {

    /* compiled from: PromoCodeInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/l$a;", "Lrw0/l;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f437227a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final m f437228b;

        public a(@Y61.l String str, @Y61.k m mVar) {
            super(null);
            this.f437227a = str;
            this.f437228b = mVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f437227a, aVar.f437227a) && L.f(this.f437228b, aVar.f437228b);
        }

        public final int hashCode() {
            String str = this.f437227a;
            return this.f437228b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Content(title=" + this.f437227a + ", promoCodeInfoState=" + this.f437228b + ')';
        }
    }

    /* compiled from: PromoCodeInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrw0/l$b;", "Lrw0/l;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f437229a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1340760462;
        }

        @Y61.k
        public final String toString() {
            return "Hidden";
        }
    }

    public /* synthetic */ l(C42822w c42822w) {
        this();
    }

    public l() {
    }
}
