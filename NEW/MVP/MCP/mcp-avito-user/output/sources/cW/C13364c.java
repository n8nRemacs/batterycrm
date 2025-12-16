package Cw;

import Cw.d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.util.P2;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LCw/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cw.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C13364c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f2777h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C13364c f2778i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final P2<GetDealRoomInfoResponse> f2779b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Set<String> f2780c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Set<b> f2781d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f2782e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2783f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final d f2784g;

    /* compiled from: DealRoomState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw/c$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DealRoomState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/c$b;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.c$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f2785a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f2786b;

        public b(@k String str, @k String str2) {
            this.f2785a = str;
            this.f2786b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f2785a, bVar.f2785a) && L.f(this.f2786b, bVar.f2786b);
        }

        public final int hashCode() {
            return this.f2786b.hashCode() + (this.f2785a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UploadingRevenueDocument(dealId=");
            sb2.append(this.f2785a);
            sb2.append(", docType=");
            return C22026a.c(sb2, this.f2786b, ')');
        }
    }

    static {
        P2.c cVar = P2.c.f318721a;
        B0 b02 = B0.f406639b;
        f2778i = new C13364c(cVar, b02, b02, null, false, d.b.f2789a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13364c(@k P2<? super GetDealRoomInfoResponse> p22, @k Set<String> set, @k Set<b> set2, @l String str, boolean z12, @k d dVar) {
        this.f2779b = p22;
        this.f2780c = set;
        this.f2781d = set2;
        this.f2782e = str;
        this.f2783f = z12;
        this.f2784g = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C13364c a(C13364c c13364c, P2 p22, Set set, LinkedHashSet linkedHashSet, String str, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            p22 = c13364c.f2779b;
        }
        P2 p23 = p22;
        if ((i12 & 2) != 0) {
            set = c13364c.f2780c;
        }
        Set set2 = set;
        Set set3 = linkedHashSet;
        if ((i12 & 4) != 0) {
            set3 = c13364c.f2781d;
        }
        Set set4 = set3;
        if ((i12 & 8) != 0) {
            str = c13364c.f2782e;
        }
        String str2 = str;
        boolean z12 = (i12 & 16) != 0 ? c13364c.f2783f : true;
        if ((i12 & 32) != 0) {
            dVar = c13364c.f2784g;
        }
        c13364c.getClass();
        return new C13364c(p23, set2, set4, str2, z12, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13364c)) {
            return false;
        }
        C13364c c13364c = (C13364c) obj;
        return L.f(this.f2779b, c13364c.f2779b) && L.f(this.f2780c, c13364c.f2780c) && L.f(this.f2781d, c13364c.f2781d) && L.f(this.f2782e, c13364c.f2782e) && this.f2783f == c13364c.f2783f && L.f(this.f2784g, c13364c.f2784g);
    }

    public final int hashCode() {
        int iG2 = m.g(this.f2781d, m.g(this.f2780c, this.f2779b.hashCode() * 31, 31), 31);
        String str = this.f2782e;
        return this.f2784g.hashCode() + r.i((iG2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2783f);
    }

    @k
    public final String toString() {
        return "DealRoomState(dealRoomInfo=" + this.f2779b + ", expandedAccordionIds=" + this.f2780c + ", uploadingRevenueDocuments=" + this.f2781d + ", dealStagePickingDocumentType=" + this.f2782e + ", isScreenSuccessfullyLoaded=" + this.f2783f + ", viewState=" + this.f2784g + ')';
    }
}
