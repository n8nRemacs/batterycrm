package z00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import z00.InterfaceC50336e;

/* compiled from: ManagerUspState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lz00/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z00.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C50335d extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f443686f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C50335d f443687g = new C50335d(null, true, null, InterfaceC50336e.c.f443694a);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final f f443688b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f443689c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ApiError f443690d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC50336e f443691e;

    /* compiled from: ManagerUspState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz00/d$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z00.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50335d(@l f fVar, boolean z12, @l ApiError apiError, @k InterfaceC50336e interfaceC50336e) {
        this.f443688b = fVar;
        this.f443689c = z12;
        this.f443690d = apiError;
        this.f443691e = interfaceC50336e;
    }

    public static C50335d a(C50335d c50335d, f fVar, boolean z12, ApiError apiError, InterfaceC50336e interfaceC50336e, int i12) {
        if ((i12 & 1) != 0) {
            fVar = c50335d.f443688b;
        }
        if ((i12 & 2) != 0) {
            z12 = c50335d.f443689c;
        }
        if ((i12 & 4) != 0) {
            apiError = c50335d.f443690d;
        }
        if ((i12 & 8) != 0) {
            interfaceC50336e = c50335d.f443691e;
        }
        c50335d.getClass();
        return new C50335d(fVar, z12, apiError, interfaceC50336e);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50335d)) {
            return false;
        }
        C50335d c50335d = (C50335d) obj;
        return L.f(this.f443688b, c50335d.f443688b) && this.f443689c == c50335d.f443689c && L.f(this.f443690d, c50335d.f443690d) && L.f(this.f443691e, c50335d.f443691e);
    }

    public final int hashCode() {
        f fVar = this.f443688b;
        int i12 = r.i((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f443689c);
        ApiError apiError = this.f443690d;
        return this.f443691e.hashCode() + ((i12 + (apiError != null ? apiError.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ManagerUspState(data=" + this.f443688b + ", isLoading=" + this.f443689c + ", error=" + this.f443690d + ", viewState=" + this.f443691e + ')';
    }
}
