package U50;

import X50.e;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectVerticalState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LU50/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f16191l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final c f16192m = new c(null, false, null, null, null, null, false, false, null, false, 1023, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<e> f16193b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16194c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f16195d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<com.avito.conveyor_item.a> f16196e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final e f16197f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Q<Integer, Integer> f16198g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16199h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16200i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Throwable f16201j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f16202k;

    /* compiled from: SelectVerticalState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU50/c$a;", "", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, false, null, null, null, null, false, false, null, false, 1023, null);
    }

    public static c a(c cVar, List list, boolean z12, String str, List list2, e eVar, Q q12, boolean z13, boolean z14, Throwable th2, boolean z15, int i12) {
        List list3 = (i12 & 1) != 0 ? cVar.f16193b : list;
        boolean z16 = (i12 & 2) != 0 ? cVar.f16194c : z12;
        String str2 = (i12 & 4) != 0 ? cVar.f16195d : str;
        List list4 = (i12 & 8) != 0 ? cVar.f16196e : list2;
        e eVar2 = (i12 & 16) != 0 ? cVar.f16197f : eVar;
        Q q13 = (i12 & 32) != 0 ? cVar.f16198g : q12;
        boolean z17 = (i12 & 64) != 0 ? cVar.f16199h : z13;
        boolean z18 = (i12 & 128) != 0 ? cVar.f16200i : z14;
        Throwable th3 = (i12 & 256) != 0 ? cVar.f16201j : th2;
        boolean z19 = (i12 & 512) != 0 ? cVar.f16202k : z15;
        cVar.getClass();
        return new c(list3, z16, str2, list4, eVar2, q13, z17, z18, th3, z19);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f16193b, cVar.f16193b) && this.f16194c == cVar.f16194c && L.f(this.f16195d, cVar.f16195d) && L.f(this.f16196e, cVar.f16196e) && L.f(this.f16197f, cVar.f16197f) && L.f(this.f16198g, cVar.f16198g) && this.f16199h == cVar.f16199h && this.f16200i == cVar.f16200i && L.f(this.f16201j, cVar.f16201j) && this.f16202k == cVar.f16202k;
    }

    public final int hashCode() {
        int i12 = r.i(this.f16193b.hashCode() * 31, 31, this.f16194c);
        String str = this.f16195d;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        List<com.avito.conveyor_item.a> list = this.f16196e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        e eVar = this.f16197f;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Q<Integer, Integer> q12 = this.f16198g;
        int i13 = r.i(r.i((iHashCode3 + (q12 == null ? 0 : q12.hashCode())) * 31, 31, this.f16199h), 31, this.f16200i);
        Throwable th2 = this.f16201j;
        return Boolean.hashCode(this.f16202k) + ((i13 + (th2 != null ? th2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectVerticalState(loadedData=");
        sb2.append(this.f16193b);
        sb2.append(", alreadyHasExtendedProfile=");
        sb2.append(this.f16194c);
        sb2.append(", userHash=");
        sb2.append(this.f16195d);
        sb2.append(", screenData=");
        sb2.append(this.f16196e);
        sb2.append(", selectedVertical=");
        sb2.append(this.f16197f);
        sb2.append(", savedVerticalAndSpecificId=");
        sb2.append(this.f16198g);
        sb2.append(", hasNoItemSelectedError=");
        sb2.append(this.f16199h);
        sb2.append(", isInitialLoadingInProgress=");
        sb2.append(this.f16200i);
        sb2.append(", initialLoadingError=");
        sb2.append(this.f16201j);
        sb2.append(", isActionInProgress=");
        return r.x(sb2, this.f16202k, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k List<e> list, boolean z12, @l String str, @l List<? extends com.avito.conveyor_item.a> list2, @l e eVar, @l Q<Integer, Integer> q12, boolean z13, boolean z14, @l Throwable th2, boolean z15) {
        this.f16193b = list;
        this.f16194c = z12;
        this.f16195d = str;
        this.f16196e = list2;
        this.f16197f = eVar;
        this.f16198g = q12;
        this.f16199h = z13;
        this.f16200i = z14;
        this.f16201j = th2;
        this.f16202k = z15;
    }

    public c(List list, boolean z12, String str, List list2, e eVar, Q q12, boolean z13, boolean z14, Throwable th2, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : list2, (i12 & 16) != 0 ? null : eVar, (i12 & 32) != 0 ? null : q12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? false : z14, (i12 & 256) == 0 ? th2 : null, (i12 & 512) == 0 ? z15 : false);
    }
}
