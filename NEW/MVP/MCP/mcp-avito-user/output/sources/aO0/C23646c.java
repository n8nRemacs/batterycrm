package ao0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryUniversalCheckoutState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lao0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ao0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C23646c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f56225b;

    /* compiled from: DeliveryUniversalCheckoutState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lao0/c$a;", "", "<init>", "()V", "a", "b", "c", "Lao0/c$a$a;", "Lao0/c$a$b;", "Lao0/c$a$c;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ao0.c$a */
    public static abstract class a {

        /* compiled from: DeliveryUniversalCheckoutState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lao0/c$a$a;", "Lao0/c$a;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ao0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1971a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f56226a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final List<BeduinAction> f56227b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f56228c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f56229d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f56230e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f56231f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f56232g;

            /* renamed from: h, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f56233h;

            /* renamed from: i, reason: collision with root package name */
            public final boolean f56234i;

            /* renamed from: j, reason: collision with root package name */
            public final boolean f56235j;

            /* JADX WARN: Multi-variable type inference failed */
            public C1971a(@k String str, @l List<? extends BeduinAction> list, @k String str2, @k String str3, @k String str4, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list4, boolean z12, boolean z13) {
                super(null);
                this.f56226a = str;
                this.f56227b = list;
                this.f56228c = str2;
                this.f56229d = str3;
                this.f56230e = str4;
                this.f56231f = list2;
                this.f56232g = list3;
                this.f56233h = list4;
                this.f56234i = z12;
                this.f56235j = z13;
            }

            public static C1971a a(C1971a c1971a, List list, List list2, List list3, boolean z12, int i12) {
                String str = c1971a.f56226a;
                List<BeduinAction> list4 = c1971a.f56227b;
                String str2 = c1971a.f56228c;
                String str3 = c1971a.f56229d;
                String str4 = c1971a.f56230e;
                List list5 = (i12 & 32) != 0 ? c1971a.f56231f : list;
                List list6 = (i12 & 64) != 0 ? c1971a.f56232g : list2;
                List list7 = (i12 & 128) != 0 ? c1971a.f56233h : list3;
                boolean z13 = (i12 & 256) != 0 ? c1971a.f56234i : z12;
                boolean z14 = c1971a.f56235j;
                c1971a.getClass();
                return new C1971a(str, list4, str2, str3, str4, list5, list6, list7, z13, z14);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1971a)) {
                    return false;
                }
                C1971a c1971a = (C1971a) obj;
                return L.f(this.f56226a, c1971a.f56226a) && L.f(this.f56227b, c1971a.f56227b) && L.f(this.f56228c, c1971a.f56228c) && L.f(this.f56229d, c1971a.f56229d) && L.f(this.f56230e, c1971a.f56230e) && L.f(this.f56231f, c1971a.f56231f) && L.f(this.f56232g, c1971a.f56232g) && L.f(this.f56233h, c1971a.f56233h) && this.f56234i == c1971a.f56234i && this.f56235j == c1971a.f56235j;
            }

            public final int hashCode() {
                int iHashCode = this.f56226a.hashCode() * 31;
                List<BeduinAction> list = this.f56227b;
                return Boolean.hashCode(this.f56235j) + r.i(H.e(H.e(H.e(H.d(H.d(H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f56228c), 31, this.f56229d), 31, this.f56230e), 31, this.f56231f), 31, this.f56232g), 31, this.f56233h), 31, this.f56234i);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(title=");
                sb2.append(this.f56226a);
                sb2.append(", actions=");
                sb2.append(this.f56227b);
                sb2.append(", topFormId=");
                sb2.append(this.f56228c);
                sb2.append(", mainFormId=");
                sb2.append(this.f56229d);
                sb2.append(", bottomFormId=");
                sb2.append(this.f56230e);
                sb2.append(", topComponents=");
                sb2.append(this.f56231f);
                sb2.append(", mainComponents=");
                sb2.append(this.f56232g);
                sb2.append(", bottomComponents=");
                sb2.append(this.f56233h);
                sb2.append(", isExecutingRequest=");
                sb2.append(this.f56234i);
                sb2.append(", showBottomFormBackground=");
                return r.x(sb2, this.f56235j, ')');
            }
        }

        /* compiled from: DeliveryUniversalCheckoutState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lao0/c$a$b;", "Lao0/c$a;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ao0.c$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f56236a;

            public b(@k ApiError apiError) {
                super(null);
                this.f56236a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f56236a, ((b) obj).f56236a);
            }

            public final int hashCode() {
                return this.f56236a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failed(error="), this.f56236a, ')');
            }
        }

        /* compiled from: DeliveryUniversalCheckoutState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lao0/c$a$c;", "Lao0/c$a;", "<init>", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ao0.c$a$c, reason: collision with other inner class name */
        public static final class C1972c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1972c f56237a = new C1972c();

            public C1972c() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23646c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23646c) && L.f(this.f56225b, ((C23646c) obj).f56225b);
    }

    public final int hashCode() {
        return this.f56225b.hashCode();
    }

    @k
    public final String toString() {
        return "DeliveryUniversalCheckoutState(contentState=" + this.f56225b + ')';
    }

    public /* synthetic */ C23646c(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.C1972c.f56237a : aVar);
    }

    public C23646c(@k a aVar) {
        this.f56225b = aVar;
    }
}
