package pH;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/e;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pH.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C46957e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f428334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f428335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final j f428336c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final j f428337d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f428338e;

    public C46957e(@Y61.l String str, @Y61.l String str2, @Y61.l j jVar, @Y61.l j jVar2, boolean z12) {
        this.f428334a = str;
        this.f428335b = str2;
        this.f428336c = jVar;
        this.f428337d = jVar2;
        this.f428338e = z12;
    }

    public static C46957e a(C46957e c46957e, boolean z12) {
        String str = c46957e.f428334a;
        String str2 = c46957e.f428335b;
        j jVar = c46957e.f428336c;
        j jVar2 = c46957e.f428337d;
        c46957e.getClass();
        return new C46957e(str, str2, jVar, jVar2, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46957e)) {
            return false;
        }
        C46957e c46957e = (C46957e) obj;
        return L.f(this.f428334a, c46957e.f428334a) && L.f(this.f428335b, c46957e.f428335b) && L.f(this.f428336c, c46957e.f428336c) && L.f(this.f428337d, c46957e.f428337d) && this.f428338e == c46957e.f428338e;
    }

    public final int hashCode() {
        String str = this.f428334a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f428335b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        j jVar = this.f428336c;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.f428337d;
        return Boolean.hashCode(this.f428338e) + ((iHashCode3 + (jVar2 != null ? jVar2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigConfirmState(title=");
        sb2.append(this.f428334a);
        sb2.append(", description=");
        sb2.append(this.f428335b);
        sb2.append(", confirmPrimaryButton=");
        sb2.append(this.f428336c);
        sb2.append(", confirmSecondaryButton=");
        sb2.append(this.f428337d);
        sb2.append(", isLoading=");
        return androidx.appcompat.app.r.x(sb2, this.f428338e, ')');
    }

    public /* synthetic */ C46957e(String str, String str2, j jVar, j jVar2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : jVar, (i12 & 8) != 0 ? null : jVar2, (i12 & 16) != 0 ? false : z12);
    }
}
