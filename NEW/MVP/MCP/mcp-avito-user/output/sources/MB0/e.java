package mB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LmB0/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f414380j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final e f414381k = new e(null, C42784z0.f406748b, null, null, null, null, true, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final b f414382b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f414383c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f414384d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ButtonAction f414385e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ButtonAction f414386f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ApiError f414387g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f414388h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f414389i;

    /* compiled from: CpxConfigureAdvanceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmB0/e$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@l b bVar, @k List<? extends com.avito.conveyor_item.a> list, @l String str, @l ButtonAction buttonAction, @l ButtonAction buttonAction2, @l ApiError apiError, boolean z12, boolean z13) {
        this.f414382b = bVar;
        this.f414383c = list;
        this.f414384d = str;
        this.f414385e = buttonAction;
        this.f414386f = buttonAction2;
        this.f414387g = apiError;
        this.f414388h = z12;
        this.f414389i = z13;
    }

    public static e a(e eVar, b bVar, List list, String str, ButtonAction buttonAction, ButtonAction buttonAction2, ApiError apiError, boolean z12, boolean z13, int i12) {
        b bVar2 = (i12 & 1) != 0 ? eVar.f414382b : bVar;
        List list2 = (i12 & 2) != 0 ? eVar.f414383c : list;
        String str2 = (i12 & 4) != 0 ? eVar.f414384d : str;
        ButtonAction buttonAction3 = (i12 & 8) != 0 ? eVar.f414385e : buttonAction;
        ButtonAction buttonAction4 = (i12 & 16) != 0 ? eVar.f414386f : buttonAction2;
        ApiError apiError2 = (i12 & 32) != 0 ? eVar.f414387g : apiError;
        boolean z14 = (i12 & 64) != 0 ? eVar.f414388h : z12;
        boolean z15 = (i12 & 128) != 0 ? eVar.f414389i : z13;
        eVar.getClass();
        return new e(bVar2, list2, str2, buttonAction3, buttonAction4, apiError2, z14, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f414382b, eVar.f414382b) && L.f(this.f414383c, eVar.f414383c) && L.f(this.f414384d, eVar.f414384d) && L.f(this.f414385e, eVar.f414385e) && L.f(this.f414386f, eVar.f414386f) && L.f(this.f414387g, eVar.f414387g) && this.f414388h == eVar.f414388h && this.f414389i == eVar.f414389i;
    }

    public final int hashCode() {
        b bVar = this.f414382b;
        int iE2 = H.e((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f414383c);
        String str = this.f414384d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        ButtonAction buttonAction = this.f414385e;
        int iHashCode2 = (iHashCode + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ButtonAction buttonAction2 = this.f414386f;
        int iHashCode3 = (iHashCode2 + (buttonAction2 == null ? 0 : buttonAction2.hashCode())) * 31;
        ApiError apiError = this.f414387g;
        return Boolean.hashCode(this.f414389i) + r.i((iHashCode3 + (apiError != null ? apiError.hashCode() : 0)) * 31, 31, this.f414388h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureAdvanceState(navBar=");
        sb2.append(this.f414382b);
        sb2.append(", items=");
        sb2.append(this.f414383c);
        sb2.append(", advance=");
        sb2.append(this.f414384d);
        sb2.append(", nextAction=");
        sb2.append(this.f414385e);
        sb2.append(", skipAction=");
        sb2.append(this.f414386f);
        sb2.append(", error=");
        sb2.append(this.f414387g);
        sb2.append(", isLoading=");
        sb2.append(this.f414388h);
        sb2.append(", isSaveLoading=");
        return r.x(sb2, this.f414389i, ')');
    }
}
