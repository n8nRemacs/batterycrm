package Z50;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BusinessVrfDuplicationState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZ50/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f19880e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f19881f = new c(false, null, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19882b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final d f19883c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f19884d;

    /* compiled from: BusinessVrfDuplicationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ50/c$a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(false, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19882b == cVar.f19882b && L.f(this.f19883c, cVar.f19883c) && L.f(this.f19884d, cVar.f19884d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f19882b) * 31;
        d dVar = this.f19883c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f19884d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BusinessVrfDuplicationState(isLoading=");
        sb2.append(this.f19882b);
        sb2.append(", content=");
        sb2.append(this.f19883c);
        sb2.append(", errorText=");
        return C22026a.c(sb2, this.f19884d, ')');
    }

    public /* synthetic */ c(boolean z12, d dVar, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? null : dVar, (i12 & 4) != 0 ? null : str);
    }

    public c(boolean z12, @l d dVar, @l String str) {
        this.f19882b = z12;
        this.f19883c = dVar;
        this.f19884d = str;
    }
}
