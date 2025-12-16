package lo;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.Specific;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileChangeSpecificState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Llo/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lo.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C43810c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f414205i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C43810c f414206j = new C43810c(null, null, null, null, false, null, false, 127, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Specific> f414207b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f414208c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f414209d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f414210e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f414211f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Throwable f414212g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f414213h;

    /* compiled from: ExtendedProfileChangeSpecificState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llo/c$a;", "", "<init>", "()V", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lo.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43810c() {
        this(null, null, null, null, false, null, false, 127, null);
    }

    public static C43810c a(C43810c c43810c, List list, ArrayList arrayList, Integer num, Integer num2, boolean z12, Throwable th2, boolean z13, int i12) {
        List list2 = (i12 & 1) != 0 ? c43810c.f414207b : list;
        List<com.avito.conveyor_item.a> list3 = (i12 & 2) != 0 ? c43810c.f414208c : arrayList;
        Integer num3 = (i12 & 4) != 0 ? c43810c.f414209d : num;
        Integer num4 = (i12 & 8) != 0 ? c43810c.f414210e : num2;
        boolean z14 = (i12 & 16) != 0 ? c43810c.f414211f : z12;
        Throwable th3 = (i12 & 32) != 0 ? c43810c.f414212g : th2;
        boolean z15 = (i12 & 64) != 0 ? c43810c.f414213h : z13;
        c43810c.getClass();
        return new C43810c(list2, list3, num3, num4, z14, th3, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43810c)) {
            return false;
        }
        C43810c c43810c = (C43810c) obj;
        return L.f(this.f414207b, c43810c.f414207b) && L.f(this.f414208c, c43810c.f414208c) && L.f(this.f414209d, c43810c.f414209d) && L.f(this.f414210e, c43810c.f414210e) && this.f414211f == c43810c.f414211f && L.f(this.f414212g, c43810c.f414212g) && this.f414213h == c43810c.f414213h;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f414207b.hashCode() * 31, 31, this.f414208c);
        Integer num = this.f414209d;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f414210e;
        int i12 = r.i((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f414211f);
        Throwable th2 = this.f414212g;
        return Boolean.hashCode(this.f414213h) + ((i12 + (th2 != null ? th2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileChangeSpecificState(specifics=");
        sb2.append(this.f414207b);
        sb2.append(", content=");
        sb2.append(this.f414208c);
        sb2.append(", preselectedSpecificId=");
        sb2.append(this.f414209d);
        sb2.append(", selectedSpecificId=");
        sb2.append(this.f414210e);
        sb2.append(", isInitialLoadingInProgress=");
        sb2.append(this.f414211f);
        sb2.append(", initialLoadingError=");
        sb2.append(this.f414212g);
        sb2.append(", isActionInProgress=");
        return r.x(sb2, this.f414213h, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43810c(@k List<Specific> list, @k List<? extends com.avito.conveyor_item.a> list2, @l Integer num, @l Integer num2, boolean z12, @l Throwable th2, boolean z13) {
        this.f414207b = list;
        this.f414208c = list2;
        this.f414209d = num;
        this.f414210e = num2;
        this.f414211f = z12;
        this.f414212g = th2;
        this.f414213h = z13;
    }

    public C43810c(List list, List list2, Integer num, Integer num2, boolean z12, Throwable th2, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? C42784z0.f406748b : list2, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? false : z12, (i12 & 32) == 0 ? th2 : null, (i12 & 64) != 0 ? false : z13);
    }
}
