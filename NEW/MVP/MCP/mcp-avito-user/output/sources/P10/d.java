package P10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MortgageCategoryState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LP10/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f12777f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12778b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f12779c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final O10.b f12780d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12781e;

    /* compiled from: MortgageCategoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LP10/d$a;", "", "<init>", "()V", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k String str, @k String str2, @l O10.b bVar, boolean z12) {
        this.f12778b = str;
        this.f12779c = str2;
        this.f12780d = bVar;
        this.f12781e = z12;
    }

    public static d a(d dVar, O10.b bVar, boolean z12, int i12) {
        String str = dVar.f12778b;
        String str2 = dVar.f12779c;
        if ((i12 & 4) != 0) {
            bVar = dVar.f12780d;
        }
        if ((i12 & 8) != 0) {
            z12 = dVar.f12781e;
        }
        dVar.getClass();
        return new d(str, str2, bVar, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f12778b, dVar.f12778b) && L.f(this.f12779c, dVar.f12779c) && L.f(this.f12780d, dVar.f12780d) && this.f12781e == dVar.f12781e;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f12778b.hashCode() * 31, 31, this.f12779c);
        O10.b bVar = this.f12780d;
        return Boolean.hashCode(this.f12781e) + ((iD2 + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageCategoryState(applicationId=");
        sb2.append(this.f12778b);
        sb2.append(", sourceType=");
        sb2.append(this.f12779c);
        sb2.append(", content=");
        sb2.append(this.f12780d);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f12781e, ')');
    }
}
