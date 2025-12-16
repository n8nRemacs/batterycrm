package U40;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.UniversalColor;
import com.avito.beduin.v2.engine.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OrderState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LU40/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f16170g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f16171h = new c(null, null, 0, false, null, 31, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f16172b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f16173c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16174d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16175e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalColor f16176f;

    /* compiled from: OrderState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU40/c$a;", "", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OrderState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LU40/c$b;", "", "<init>", "()V", "a", "b", "c", "LU40/c$b$a;", "LU40/c$b$b;", "LU40/c$b$c;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: OrderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU40/c$b$a;", "LU40/c$b;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final D f16177a;

            public a(@k D d12) {
                super(null);
                this.f16177a = d12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f16177a, ((a) obj).f16177a);
            }

            public final int hashCode() {
                return this.f16177a.hashCode();
            }

            @k
            public final String toString() {
                return "Content(rendererState=" + this.f16177a + ')';
            }
        }

        /* compiled from: OrderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU40/c$b$b;", "LU40/c$b;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: U40.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1098b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f16178a;

            public C1098b(@k ApiError apiError) {
                super(null);
                this.f16178a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1098b) && L.f(this.f16178a, ((C1098b) obj).f16178a);
            }

            public final int hashCode() {
                return this.f16178a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Error(error="), this.f16178a, ')');
            }
        }

        /* compiled from: OrderState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU40/c$b$c;", "LU40/c$b;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: U40.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C1099c extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1099c f16179a = new C1099c();

            public C1099c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1099c);
            }

            public final int hashCode() {
                return 322682000;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public c() {
        this(null, null, 0L, false, null, 31, null);
    }

    public static c a(c cVar, b bVar, Integer num, long j12, boolean z12, UniversalColor universalColor, int i12) {
        if ((i12 & 1) != 0) {
            bVar = cVar.f16172b;
        }
        b bVar2 = bVar;
        if ((i12 & 2) != 0) {
            num = cVar.f16173c;
        }
        Integer num2 = num;
        if ((i12 & 4) != 0) {
            j12 = cVar.f16174d;
        }
        long j13 = j12;
        if ((i12 & 8) != 0) {
            z12 = cVar.f16175e;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            universalColor = cVar.f16176f;
        }
        cVar.getClass();
        return new c(bVar2, num2, j13, z13, universalColor);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f16172b, cVar.f16172b) && L.f(this.f16173c, cVar.f16173c) && this.f16174d == cVar.f16174d && this.f16175e == cVar.f16175e && L.f(this.f16176f, cVar.f16176f);
    }

    public final int hashCode() {
        int iHashCode = this.f16172b.hashCode() * 31;
        Integer num = this.f16173c;
        int i12 = r.i(r.g((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f16174d), 31, this.f16175e);
        UniversalColor universalColor = this.f16176f;
        return i12 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderState(viewState=");
        sb2.append(this.f16172b);
        sb2.append(", lastUpdate=");
        sb2.append(this.f16173c);
        sb2.append(", pollingIntervalSec=");
        sb2.append(this.f16174d);
        sb2.append(", shouldPoll=");
        sb2.append(this.f16175e);
        sb2.append(", statusBarColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f16176f, ')');
    }

    public /* synthetic */ c(b bVar, Integer num, long j12, boolean z12, UniversalColor universalColor, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? b.C1099c.f16179a : bVar, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? 2L : j12, (i12 & 8) != 0 ? false : z12, (i12 & 16) == 0 ? universalColor : null);
    }

    public c(@k b bVar, @l Integer num, long j12, boolean z12, @l UniversalColor universalColor) {
        this.f16172b = bVar;
        this.f16173c = num;
        this.f16174d = j12;
        this.f16175e = z12;
        this.f16176f = universalColor;
    }
}
