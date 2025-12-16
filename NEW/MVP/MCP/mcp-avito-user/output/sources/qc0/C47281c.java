package qC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import iC0.C41267a;
import iC0.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLevelsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LqC0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qC0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C47281c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f429117i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C47281c f429118j = new C47281c(null, C42784z0.f406748b, null, false, false, null, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final d f429119b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f429120c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C41267a f429121d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f429122e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f429123f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Throwable f429124g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f429125h;

    /* compiled from: TariffCptConfigureLevelsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqC0/c$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47281c(@l d dVar, @k List<? extends com.avito.conveyor_item.a> list, @l C41267a c41267a, boolean z12, boolean z13, @l Throwable th2, boolean z14) {
        this.f429119b = dVar;
        this.f429120c = list;
        this.f429121d = c41267a;
        this.f429122e = z12;
        this.f429123f = z13;
        this.f429124g = th2;
        this.f429125h = z14;
    }

    public static C47281c a(C47281c c47281c, d dVar, ArrayList arrayList, C41267a c41267a, boolean z12, boolean z13, ApiException apiException, boolean z14, int i12) {
        d dVar2 = (i12 & 1) != 0 ? c47281c.f429119b : dVar;
        List<com.avito.conveyor_item.a> list = (i12 & 2) != 0 ? c47281c.f429120c : arrayList;
        C41267a c41267a2 = (i12 & 4) != 0 ? c47281c.f429121d : c41267a;
        boolean z15 = (i12 & 8) != 0 ? c47281c.f429122e : z12;
        boolean z16 = (i12 & 16) != 0 ? c47281c.f429123f : z13;
        Throwable th2 = (i12 & 32) != 0 ? c47281c.f429124g : apiException;
        boolean z17 = (i12 & 64) != 0 ? c47281c.f429125h : z14;
        c47281c.getClass();
        return new C47281c(dVar2, list, c41267a2, z15, z16, th2, z17);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47281c)) {
            return false;
        }
        C47281c c47281c = (C47281c) obj;
        return L.f(this.f429119b, c47281c.f429119b) && L.f(this.f429120c, c47281c.f429120c) && L.f(this.f429121d, c47281c.f429121d) && this.f429122e == c47281c.f429122e && this.f429123f == c47281c.f429123f && L.f(this.f429124g, c47281c.f429124g) && this.f429125h == c47281c.f429125h;
    }

    public final int hashCode() {
        d dVar = this.f429119b;
        int iE2 = H.e((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f429120c);
        C41267a c41267a = this.f429121d;
        int i12 = r.i(r.i((iE2 + (c41267a == null ? 0 : c41267a.hashCode())) * 31, 31, this.f429122e), 31, this.f429123f);
        Throwable th2 = this.f429124g;
        return Boolean.hashCode(this.f429125h) + ((i12 + (th2 != null ? th2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptConfigureLevelsState(navBar=");
        sb2.append(this.f429119b);
        sb2.append(", items=");
        sb2.append(this.f429120c);
        sb2.append(", nextAction=");
        sb2.append(this.f429121d);
        sb2.append(", isNextButtonLoading=");
        sb2.append(this.f429122e);
        sb2.append(", isLevelButtonLoading=");
        sb2.append(this.f429123f);
        sb2.append(", error=");
        sb2.append(this.f429124g);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f429125h, ')');
    }
}
