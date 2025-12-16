package lF0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lF0.InterfaceC43631d;

/* compiled from: PaymentSelectorState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LlF0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lF0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C43630c extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f413675j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final C43630c f413676k;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.travel_payment_selector.mvi.model.a f413677b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f413678c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f413679d;

    /* renamed from: e, reason: collision with root package name */
    public final int f413680e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<String> f413681f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f413682g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f413683h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC43631d f413684i;

    /* compiled from: PaymentSelectorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlF0/c$a;", "", "<init>", "()V", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f413676k = new C43630c(null, true, c42784z0, 0, c42784z0, null, null, InterfaceC43631d.b.f413687a);
    }

    public C43630c(@l com.avito.android.travel_payment_selector.mvi.model.a aVar, boolean z12, @k List<String> list, int i12, @k List<String> list2, @l Integer num, @l DeepLink deepLink, @k InterfaceC43631d interfaceC43631d) {
        this.f413677b = aVar;
        this.f413678c = z12;
        this.f413679d = list;
        this.f413680e = i12;
        this.f413681f = list2;
        this.f413682g = num;
        this.f413683h = deepLink;
        this.f413684i = interfaceC43631d;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public static C43630c a(C43630c c43630c, int i12, List list, Integer num, DeepLink deepLink, InterfaceC43631d interfaceC43631d, int i13) {
        com.avito.android.travel_payment_selector.mvi.model.a aVar = c43630c.f413677b;
        boolean z12 = (i13 & 2) != 0 ? c43630c.f413678c : true;
        ?? r32 = c43630c.f413679d;
        if ((i13 & 8) != 0) {
            i12 = c43630c.f413680e;
        }
        int i14 = i12;
        if ((i13 & 16) != 0) {
            list = c43630c.f413681f;
        }
        List list2 = list;
        if ((i13 & 32) != 0) {
            num = c43630c.f413682g;
        }
        Integer num2 = num;
        if ((i13 & 64) != 0) {
            deepLink = c43630c.f413683h;
        }
        DeepLink deepLink2 = deepLink;
        if ((i13 & 128) != 0) {
            interfaceC43631d = c43630c.f413684i;
        }
        c43630c.getClass();
        return new C43630c(aVar, z12, r32, i14, list2, num2, deepLink2, interfaceC43631d);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43630c)) {
            return false;
        }
        C43630c c43630c = (C43630c) obj;
        return L.f(this.f413677b, c43630c.f413677b) && this.f413678c == c43630c.f413678c && L.f(this.f413679d, c43630c.f413679d) && this.f413680e == c43630c.f413680e && L.f(this.f413681f, c43630c.f413681f) && L.f(this.f413682g, c43630c.f413682g) && L.f(this.f413683h, c43630c.f413683h) && L.f(this.f413684i, c43630c.f413684i);
    }

    public final int hashCode() {
        com.avito.android.travel_payment_selector.mvi.model.a aVar = this.f413677b;
        int iE2 = H.e(r.e(this.f413680e, C23088b.a(r.i((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f413678c), 31, this.f413679d), 31), 31, this.f413681f);
        Integer num = this.f413682g;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        DeepLink deepLink = this.f413683h;
        return this.f413684i.hashCode() + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "PaymentSelectorState(data=" + this.f413677b + ", isLoading=" + this.f413678c + ", paymentMethodTypes=" + this.f413679d + ", selectedMethodIndex=" + this.f413680e + ", paymentPlans=" + this.f413681f + ", selectedPlanIndex=" + this.f413682g + ", actionLink=" + this.f413683h + ", viewState=" + this.f413684i + ')';
    }
}
