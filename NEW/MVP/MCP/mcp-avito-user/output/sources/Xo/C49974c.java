package xo;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.g;
import wZ.j;

/* compiled from: CheckoutState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lxo/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xo.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C49974c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f442644i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C49974c f442645j = new C49974c(null, C42784z0.f406748b, null, null, null, true, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final j f442646b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f442647c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final g f442648d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f442649e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Throwable f442650f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f442651g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f442652h;

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxo/c$a;", "", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49974c(@l j jVar, @k List<? extends com.avito.conveyor_item.a> list, @l g gVar, @l Integer num, @l Throwable th2, boolean z12, boolean z13) {
        this.f442646b = jVar;
        this.f442647c = list;
        this.f442648d = gVar;
        this.f442649e = num;
        this.f442650f = th2;
        this.f442651g = z12;
        this.f442652h = z13;
    }

    public static C49974c a(C49974c c49974c, j jVar, ArrayList arrayList, g gVar, Integer num, ApiException apiException, boolean z12, boolean z13, int i12) {
        j jVar2 = (i12 & 1) != 0 ? c49974c.f442646b : jVar;
        List<com.avito.conveyor_item.a> list = (i12 & 2) != 0 ? c49974c.f442647c : arrayList;
        g gVar2 = (i12 & 4) != 0 ? c49974c.f442648d : gVar;
        Integer num2 = (i12 & 8) != 0 ? c49974c.f442649e : num;
        Throwable th2 = (i12 & 16) != 0 ? c49974c.f442650f : apiException;
        boolean z14 = (i12 & 32) != 0 ? c49974c.f442651g : z12;
        boolean z15 = (i12 & 64) != 0 ? c49974c.f442652h : z13;
        c49974c.getClass();
        return new C49974c(jVar2, list, gVar2, num2, th2, z14, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49974c)) {
            return false;
        }
        C49974c c49974c = (C49974c) obj;
        return L.f(this.f442646b, c49974c.f442646b) && L.f(this.f442647c, c49974c.f442647c) && L.f(this.f442648d, c49974c.f442648d) && L.f(this.f442649e, c49974c.f442649e) && L.f(this.f442650f, c49974c.f442650f) && this.f442651g == c49974c.f442651g && this.f442652h == c49974c.f442652h;
    }

    public final int hashCode() {
        j jVar = this.f442646b;
        int iE2 = H.e((jVar == null ? 0 : jVar.hashCode()) * 31, 31, this.f442647c);
        g gVar = this.f442648d;
        int iHashCode = (iE2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Integer num = this.f442649e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Throwable th2 = this.f442650f;
        return Boolean.hashCode(this.f442652h) + r.i((iHashCode2 + (th2 != null ? th2.hashCode() : 0)) * 31, 31, this.f442651g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckoutState(navBar=");
        sb2.append(this.f442646b);
        sb2.append(", items=");
        sb2.append(this.f442647c);
        sb2.append(", footer=");
        sb2.append(this.f442648d);
        sb2.append(", clickedButtonId=");
        sb2.append(this.f442649e);
        sb2.append(", error=");
        sb2.append(this.f442650f);
        sb2.append(", isMainLoading=");
        sb2.append(this.f442651g);
        sb2.append(", isScreenLoading=");
        return r.x(sb2, this.f442652h, ')');
    }
}
