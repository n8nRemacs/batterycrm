package sB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxConfigureLevelsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LsB0/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f437522i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final e f437523j = new e(C42784z0.f406748b, null, false, false, null, false, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f437524b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ButtonAction f437525c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f437526d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f437527e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ApiError f437528f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f437529g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final C48023a f437530h;

    /* compiled from: TariffCpxConfigureLevelsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsB0/e$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k List<? extends com.avito.conveyor_item.a> list, @l ButtonAction buttonAction, boolean z12, boolean z13, @l ApiError apiError, boolean z14, @l C48023a c48023a) {
        this.f437524b = list;
        this.f437525c = buttonAction;
        this.f437526d = z12;
        this.f437527e = z13;
        this.f437528f = apiError;
        this.f437529g = z14;
        this.f437530h = c48023a;
    }

    public static e a(e eVar, ArrayList arrayList, ButtonAction buttonAction, boolean z12, boolean z13, ApiError apiError, boolean z14, C48023a c48023a, int i12) {
        List<com.avito.conveyor_item.a> list = (i12 & 1) != 0 ? eVar.f437524b : arrayList;
        ButtonAction buttonAction2 = (i12 & 2) != 0 ? eVar.f437525c : buttonAction;
        boolean z15 = (i12 & 4) != 0 ? eVar.f437526d : z12;
        boolean z16 = (i12 & 8) != 0 ? eVar.f437527e : z13;
        ApiError apiError2 = (i12 & 16) != 0 ? eVar.f437528f : apiError;
        boolean z17 = (i12 & 32) != 0 ? eVar.f437529g : z14;
        C48023a c48023a2 = (i12 & 64) != 0 ? eVar.f437530h : c48023a;
        eVar.getClass();
        return new e(list, buttonAction2, z15, z16, apiError2, z17, c48023a2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f437524b, eVar.f437524b) && L.f(this.f437525c, eVar.f437525c) && this.f437526d == eVar.f437526d && this.f437527e == eVar.f437527e && L.f(this.f437528f, eVar.f437528f) && this.f437529g == eVar.f437529g && L.f(this.f437530h, eVar.f437530h);
    }

    public final int hashCode() {
        int iHashCode = this.f437524b.hashCode() * 31;
        ButtonAction buttonAction = this.f437525c;
        int i12 = r.i(r.i((iHashCode + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31, 31, this.f437526d), 31, this.f437527e);
        ApiError apiError = this.f437528f;
        int i13 = r.i((i12 + (apiError == null ? 0 : apiError.hashCode())) * 31, 31, this.f437529g);
        C48023a c48023a = this.f437530h;
        return i13 + (c48023a != null ? c48023a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "TariffCpxConfigureLevelsState(items=" + this.f437524b + ", nextAction=" + this.f437525c + ", isNextButtonLoading=" + this.f437526d + ", isLevelButtonLoading=" + this.f437527e + ", error=" + this.f437528f + ", isLoading=" + this.f437529g + ", navigationBar=" + this.f437530h + ')';
    }
}
