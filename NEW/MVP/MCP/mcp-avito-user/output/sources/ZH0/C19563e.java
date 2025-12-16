package Zh0;

import Y61.k;
import Y61.l;
import Zh0.InterfaceC19560b;
import Zh0.f;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.realty_agency.checkerboard.bottom_sheet.I;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import com.avito.android.realty_agency.checkerboard.mvi.entity.MainContentTab;
import com.avito.android.remote.model.SearchParams;
import di0.C39735e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckerboardState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LZh0/e;", "", "a", "b", "c", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zh0.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C19563e {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final b f20456n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final C19563e f20457o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20458a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParams f20459b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MainContentTab f20460c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC19560b f20461d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f20462e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Long f20463f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f f20464g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20465h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LotSortingType f20466i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20467j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final a f20468k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final c f20469l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final I f20470m;

    /* compiled from: CheckerboardState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/e$a;", "", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.e$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f20471a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20472b;

        public a(long j12, long j13) {
            this.f20471a = j12;
            this.f20472b = j13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20471a == aVar.f20471a && this.f20472b == aVar.f20472b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20472b) + (Long.hashCode(this.f20471a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdditionalOptionsBottomSheet(developmentId=");
            sb2.append(this.f20471a);
            sb2.append(", lotId=");
            return r.u(sb2, this.f20472b, ')');
        }
    }

    /* compiled from: CheckerboardState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/e$b;", "", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.e$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CheckerboardState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/e$c;", "", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.e$c */
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C39735e> f20473a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20474b;

        public c(@k List<C39735e> list, long j12) {
            this.f20473a = list;
            this.f20474b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f20473a, cVar.f20473a) && this.f20474b == cVar.f20474b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20474b) + (this.f20473a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SectionSelectorBottomSheet(sections=");
            sb2.append(this.f20473a);
            sb2.append(", selectedSectionId=");
            return r.u(sb2, this.f20474b, ')');
        }
    }

    static {
        SearchParams searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        MainContentTab mainContentTab = MainContentTab.f251251b;
        InterfaceC19560b.c cVar = InterfaceC19560b.c.f20420a;
        f.c cVar2 = f.c.f20480a;
        LotSortingType.f251215b.getClass();
        f20457o = new C19563e(false, searchParams, mainContentTab, cVar, null, null, cVar2, false, LotSortingType.f251216c, false, null, null, null);
    }

    public C19563e(boolean z12, @k SearchParams searchParams, @k MainContentTab mainContentTab, @k InterfaceC19560b interfaceC19560b, @l Long l12, @l Long l13, @k f fVar, boolean z13, @k LotSortingType lotSortingType, boolean z14, @l a aVar, @l c cVar, @l I i12) {
        this.f20458a = z12;
        this.f20459b = searchParams;
        this.f20460c = mainContentTab;
        this.f20461d = interfaceC19560b;
        this.f20462e = l12;
        this.f20463f = l13;
        this.f20464g = fVar;
        this.f20465h = z13;
        this.f20466i = lotSortingType;
        this.f20467j = z14;
        this.f20468k = aVar;
        this.f20469l = cVar;
        this.f20470m = i12;
    }

    public static C19563e a(C19563e c19563e, boolean z12, SearchParams searchParams, MainContentTab mainContentTab, InterfaceC19560b interfaceC19560b, Long l12, Long l13, f fVar, boolean z13, LotSortingType lotSortingType, boolean z14, a aVar, c cVar, I i12, int i13) {
        boolean z15 = (i13 & 1) != 0 ? c19563e.f20458a : z12;
        SearchParams searchParams2 = (i13 & 2) != 0 ? c19563e.f20459b : searchParams;
        MainContentTab mainContentTab2 = (i13 & 4) != 0 ? c19563e.f20460c : mainContentTab;
        InterfaceC19560b interfaceC19560b2 = (i13 & 8) != 0 ? c19563e.f20461d : interfaceC19560b;
        Long l14 = (i13 & 16) != 0 ? c19563e.f20462e : l12;
        Long l15 = (i13 & 32) != 0 ? c19563e.f20463f : l13;
        f fVar2 = (i13 & 64) != 0 ? c19563e.f20464g : fVar;
        boolean z16 = (i13 & 128) != 0 ? c19563e.f20465h : z13;
        LotSortingType lotSortingType2 = (i13 & 256) != 0 ? c19563e.f20466i : lotSortingType;
        boolean z17 = (i13 & 512) != 0 ? c19563e.f20467j : z14;
        a aVar2 = (i13 & 1024) != 0 ? c19563e.f20468k : aVar;
        c cVar2 = (i13 & 2048) != 0 ? c19563e.f20469l : cVar;
        I i14 = (i13 & 4096) != 0 ? c19563e.f20470m : i12;
        c19563e.getClass();
        return new C19563e(z15, searchParams2, mainContentTab2, interfaceC19560b2, l14, l15, fVar2, z16, lotSortingType2, z17, aVar2, cVar2, i14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19563e)) {
            return false;
        }
        C19563e c19563e = (C19563e) obj;
        return this.f20458a == c19563e.f20458a && L.f(this.f20459b, c19563e.f20459b) && this.f20460c == c19563e.f20460c && L.f(this.f20461d, c19563e.f20461d) && L.f(this.f20462e, c19563e.f20462e) && L.f(this.f20463f, c19563e.f20463f) && L.f(this.f20464g, c19563e.f20464g) && this.f20465h == c19563e.f20465h && this.f20466i == c19563e.f20466i && this.f20467j == c19563e.f20467j && L.f(this.f20468k, c19563e.f20468k) && L.f(this.f20469l, c19563e.f20469l) && L.f(this.f20470m, c19563e.f20470m);
    }

    public final int hashCode() {
        int iHashCode = (this.f20461d.hashCode() + ((this.f20460c.hashCode() + ((this.f20459b.hashCode() + (Boolean.hashCode(this.f20458a) * 31)) * 31)) * 31)) * 31;
        Long l12 = this.f20462e;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f20463f;
        int i12 = r.i((this.f20466i.hashCode() + r.i((this.f20464g.hashCode() + ((iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31)) * 31, 31, this.f20465h)) * 31, 31, this.f20467j);
        a aVar = this.f20468k;
        int iHashCode3 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.f20469l;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        I i13 = this.f20470m;
        return iHashCode4 + (i13 != null ? i13.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CheckerboardState(isInlineFiltersLoaded=" + this.f20458a + ", searchParams=" + this.f20459b + ", mainContentTab=" + this.f20460c + ", checkerboardData=" + this.f20461d + ", buildingId=" + this.f20462e + ", sectionId=" + this.f20463f + ", lotsList=" + this.f20464g + ", isMeetingModeEnabled=" + this.f20465h + ", lotSortingType=" + this.f20466i + ", isSortingSelectorBottomSheetVisible=" + this.f20467j + ", additionalOptionsBottomSheet=" + this.f20468k + ", sectionSelectorBottomSheet=" + this.f20469l + ", lotItemPreviewBottomSheet=" + this.f20470m + ')';
    }
}
