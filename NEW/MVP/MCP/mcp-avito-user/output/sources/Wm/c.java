package WM;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LWM/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f17883e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f17884f = new c(true, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17885b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f17886c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final b f17887d;

    /* compiled from: ImvCarsDetailsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWM/c$a;", "", "<init>", "()V", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImvCarsDetailsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM/c$b;", "", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f17888a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f17889b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@l String str, @k List<? extends com.avito.conveyor_item.a> list) {
            this.f17888a = str;
            this.f17889b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f17888a, bVar.f17888a) && L.f(this.f17889b, bVar.f17889b);
        }

        public final int hashCode() {
            String str = this.f17888a;
            return this.f17889b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadedContent(title=");
            sb2.append(this.f17888a);
            sb2.append(", items=");
            return H.p(sb2, this.f17889b, ')');
        }
    }

    public c() {
        this(false, null, null, 7, null);
    }

    public static c a(c cVar, boolean z12, String str, b bVar, int i12) {
        if ((i12 & 1) != 0) {
            z12 = cVar.f17885b;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f17886c;
        }
        if ((i12 & 4) != 0) {
            bVar = cVar.f17887d;
        }
        cVar.getClass();
        return new c(z12, str, bVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17885b == cVar.f17885b && L.f(this.f17886c, cVar.f17886c) && L.f(this.f17887d, cVar.f17887d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17885b) * 31;
        String str = this.f17886c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f17887d;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ImvCarsDetailsState(isLoading=" + this.f17885b + ", errorText=" + this.f17886c + ", content=" + this.f17887d + ')';
    }

    public /* synthetic */ c(boolean z12, String str, b bVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : bVar);
    }

    public c(boolean z12, @l String str, @l b bVar) {
        this.f17885b = z12;
        this.f17886c = str;
        this.f17887d = bVar;
    }
}
