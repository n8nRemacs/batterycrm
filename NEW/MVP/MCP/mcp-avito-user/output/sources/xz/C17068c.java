package Xz;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.evidence_request.mvi.domain.evidence_details.EvidenceDetailsContent;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceDetailsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXz/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xz.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C17068c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f19200g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C17068c f19201h;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final EvidenceDetailsContent f19202b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f19203c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ParameterSlot> f19204d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UV0.a<? extends com.avito.conveyor_item.a> f19205e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19206f;

    /* compiled from: EvidenceDetailsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXz/c$a;", "", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f19201h = new C17068c(null, c42784z0, c42784z0, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17068c(@l EvidenceDetailsContent evidenceDetailsContent, @k List<? extends com.avito.conveyor_item.a> list, @k List<? extends ParameterSlot> list2, @l UV0.a<? extends com.avito.conveyor_item.a> aVar, boolean z12) {
        this.f19202b = evidenceDetailsContent;
        this.f19203c = list;
        this.f19204d = list2;
        this.f19205e = aVar;
        this.f19206f = z12;
    }

    public static C17068c a(C17068c c17068c, EvidenceDetailsContent evidenceDetailsContent, List list, List list2, UV0.a aVar, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            evidenceDetailsContent = c17068c.f19202b;
        }
        EvidenceDetailsContent evidenceDetailsContent2 = evidenceDetailsContent;
        if ((i12 & 2) != 0) {
            list = c17068c.f19203c;
        }
        List list3 = list;
        if ((i12 & 4) != 0) {
            list2 = c17068c.f19204d;
        }
        List list4 = list2;
        if ((i12 & 8) != 0) {
            aVar = c17068c.f19205e;
        }
        UV0.a aVar2 = aVar;
        if ((i12 & 16) != 0) {
            z12 = c17068c.f19206f;
        }
        c17068c.getClass();
        return new C17068c(evidenceDetailsContent2, list3, list4, aVar2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17068c)) {
            return false;
        }
        C17068c c17068c = (C17068c) obj;
        return L.f(this.f19202b, c17068c.f19202b) && L.f(this.f19203c, c17068c.f19203c) && L.f(this.f19204d, c17068c.f19204d) && L.f(this.f19205e, c17068c.f19205e) && this.f19206f == c17068c.f19206f;
    }

    public final int hashCode() {
        EvidenceDetailsContent evidenceDetailsContent = this.f19202b;
        int iE2 = H.e(H.e((evidenceDetailsContent == null ? 0 : evidenceDetailsContent.hashCode()) * 31, 31, this.f19203c), 31, this.f19204d);
        UV0.a<? extends com.avito.conveyor_item.a> aVar = this.f19205e;
        return Boolean.hashCode(this.f19206f) + ((iE2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EvidenceDetailsState(data=");
        sb2.append(this.f19202b);
        sb2.append(", topItems=");
        sb2.append(this.f19203c);
        sb2.append(", slots=");
        sb2.append(this.f19204d);
        sb2.append(", dataSource=");
        sb2.append(this.f19205e);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f19206f, ')');
    }
}
