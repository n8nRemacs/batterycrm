package RN0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LRN0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f14425k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final c f14426l = new c(new QN0.a(null, false, null, 7, null), new QN0.a(null, false, null, 7, null), new QN0.a(null, false, null, 7, null), new QN0.a(null, false, null, 7, null), false, false, false, null, new d(true, false, false, new QN0.a(null, false, null, 7, null), new QN0.a(null, false, null, 7, null), new QN0.a(null, false, null, 7, null), new QN0.a(null, false, null, 7, null), C42784z0.f406748b, null));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final QN0.a f14427b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final QN0.a f14428c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final QN0.a f14429d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final QN0.a f14430e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14431f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14432g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14433h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<PN0.a> f14434i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final d f14435j;

    /* compiled from: CreateState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRN0/c$a;", "", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k QN0.a aVar, @k QN0.a aVar2, @k QN0.a aVar3, @k QN0.a aVar4, boolean z12, boolean z13, boolean z14, @l List<PN0.a> list, @k d dVar) {
        this.f14427b = aVar;
        this.f14428c = aVar2;
        this.f14429d = aVar3;
        this.f14430e = aVar4;
        this.f14431f = z12;
        this.f14432g = z13;
        this.f14433h = z14;
        this.f14434i = list;
        this.f14435j = dVar;
    }

    public static c a(c cVar, QN0.a aVar, QN0.a aVar2, QN0.a aVar3, QN0.a aVar4, boolean z12, boolean z13, ArrayList arrayList, d dVar, int i12) {
        QN0.a aVar5 = (i12 & 1) != 0 ? cVar.f14427b : aVar;
        QN0.a aVar6 = (i12 & 2) != 0 ? cVar.f14428c : aVar2;
        QN0.a aVar7 = (i12 & 4) != 0 ? cVar.f14429d : aVar3;
        QN0.a aVar8 = (i12 & 8) != 0 ? cVar.f14430e : aVar4;
        boolean z14 = (i12 & 16) != 0 ? cVar.f14431f : z12;
        boolean z15 = (i12 & 32) != 0 ? cVar.f14432g : true;
        boolean z16 = (i12 & 64) != 0 ? cVar.f14433h : z13;
        List<PN0.a> list = (i12 & 128) != 0 ? cVar.f14434i : arrayList;
        d dVar2 = (i12 & 256) != 0 ? cVar.f14435j : dVar;
        cVar.getClass();
        return new c(aVar5, aVar6, aVar7, aVar8, z14, z15, z16, list, dVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f14427b, cVar.f14427b) && L.f(this.f14428c, cVar.f14428c) && L.f(this.f14429d, cVar.f14429d) && L.f(this.f14430e, cVar.f14430e) && this.f14431f == cVar.f14431f && this.f14432g == cVar.f14432g && this.f14433h == cVar.f14433h && L.f(this.f14434i, cVar.f14434i) && L.f(this.f14435j, cVar.f14435j);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(r.i((this.f14430e.hashCode() + ((this.f14429d.hashCode() + ((this.f14428c.hashCode() + (this.f14427b.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f14431f), 31, this.f14432g), 31, this.f14433h);
        List<PN0.a> list = this.f14434i;
        return this.f14435j.hashCode() + ((i12 + (list == null ? 0 : list.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "CreateState(firstName=" + this.f14427b + ", lastName=" + this.f14428c + ", middleName=" + this.f14429d + ", phone=" + this.f14430e + ", suggestionsLoading=" + this.f14431f + ", isClientAlreadyExists=" + this.f14432g + ", isSubmitting=" + this.f14433h + ", suggestedClients=" + this.f14434i + ", viewState=" + this.f14435j + ')';
    }
}
