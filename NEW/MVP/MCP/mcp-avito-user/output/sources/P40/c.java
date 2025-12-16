package P40;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OrderState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LP40/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12820b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f12821c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12822d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f12823e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12824f;

    /* compiled from: OrderState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LP40/c$a;", "", "<init>", "()V", "a", "b", "c", "LP40/c$a$a;", "LP40/c$a$b;", "LP40/c$a$c;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: OrderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP40/c$a$a;", "LP40/c$a;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: P40.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0831a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f12825a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f12826b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f12827c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0831a(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, boolean z12) {
                super(null);
                this.f12825a = str;
                this.f12826b = list;
                this.f12827c = z12;
            }

            public static C0831a a(C0831a c0831a, List list, boolean z12, int i12) {
                String str = c0831a.f12825a;
                if ((i12 & 2) != 0) {
                    list = c0831a.f12826b;
                }
                if ((i12 & 4) != 0) {
                    z12 = c0831a.f12827c;
                }
                c0831a.getClass();
                return new C0831a(str, list, z12);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0831a)) {
                    return false;
                }
                C0831a c0831a = (C0831a) obj;
                return L.f(this.f12825a, c0831a.f12825a) && L.f(this.f12826b, c0831a.f12826b) && this.f12827c == c0831a.f12827c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f12827c) + H.e(this.f12825a.hashCode() * 31, 31, this.f12826b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(mainFormId=");
                sb2.append(this.f12825a);
                sb2.append(", mainComponents=");
                sb2.append(this.f12826b);
                sb2.append(", isExecutingRequest=");
                return r.x(sb2, this.f12827c, ')');
            }
        }

        /* compiled from: OrderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP40/c$a$b;", "LP40/c$a;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f12828a;

            public b(@k ApiError apiError) {
                super(null);
                this.f12828a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f12828a, ((b) obj).f12828a);
            }

            public final int hashCode() {
                return this.f12828a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failed(error="), this.f12828a, ')');
            }
        }

        /* compiled from: OrderState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LP40/c$a$c;", "LP40/c$a;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: P40.c$a$c, reason: collision with other inner class name */
        public static final class C0832c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0832c f12829a = new C0832c();

            public C0832c() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, null, 0L, null, false, 31, null);
    }

    public static c a(c cVar, String str, Integer num, long j12, a aVar, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f12820b;
        }
        String str2 = str;
        if ((i12 & 2) != 0) {
            num = cVar.f12821c;
        }
        Integer num2 = num;
        if ((i12 & 4) != 0) {
            j12 = cVar.f12822d;
        }
        long j13 = j12;
        if ((i12 & 8) != 0) {
            aVar = cVar.f12823e;
        }
        a aVar2 = aVar;
        if ((i12 & 16) != 0) {
            z12 = cVar.f12824f;
        }
        cVar.getClass();
        return new c(str2, num2, j13, aVar2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f12820b, cVar.f12820b) && L.f(this.f12821c, cVar.f12821c) && this.f12822d == cVar.f12822d && L.f(this.f12823e, cVar.f12823e) && this.f12824f == cVar.f12824f;
    }

    public final int hashCode() {
        int iHashCode = this.f12820b.hashCode() * 31;
        Integer num = this.f12821c;
        return Boolean.hashCode(this.f12824f) + ((this.f12823e.hashCode() + r.g((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f12822d)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderState(title=");
        sb2.append(this.f12820b);
        sb2.append(", lastUpdate=");
        sb2.append(this.f12821c);
        sb2.append(", pollingIntervalSec=");
        sb2.append(this.f12822d);
        sb2.append(", contentState=");
        sb2.append(this.f12823e);
        sb2.append(", shouldPoll=");
        return r.x(sb2, this.f12824f, ')');
    }

    public /* synthetic */ c(String str, Integer num, long j12, a aVar, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? 2L : j12, (i12 & 8) != 0 ? a.C0832c.f12829a : aVar, (i12 & 16) != 0 ? false : z12);
    }

    public c(@k String str, @l Integer num, long j12, @k a aVar, boolean z12) {
        this.f12820b = str;
        this.f12821c = num;
        this.f12822d = j12;
        this.f12823e = aVar;
        this.f12824f = z12;
    }
}
