package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import vs.InterfaceC49374a;

/* compiled from: RegionSheetSearchState.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {

    /* compiled from: RegionSheetSearchState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f128545l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: RegionSheetSearchState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<InterfaceC49374a, G0> f128546l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super InterfaceC49374a, G0> lVar) {
            super(0);
            this.f128546l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f128546l.invoke(InterfaceC49374a.b.f441007a);
            return G0.f406611a;
        }
    }

    /* compiled from: RegionSheetSearchState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RegionSheetState.SearchState f128547l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<InterfaceC49374a, G0> f128548m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(RegionSheetState.SearchState searchState, l<? super InterfaceC49374a, G0> lVar, int i12) {
            super(2);
            this.f128547l = searchState;
            this.f128548m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            j.a(this.f128547l, this.f128548m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: RegionSheetSearchState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[RegionSheetState.SearchState.UiState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RegionSheetState.SearchState.UiState uiState = RegionSheetState.SearchState.UiState.f128416b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RegionSheetState.SearchState.UiState uiState2 = RegionSheetState.SearchState.UiState.f128416b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RegionSheetState.SearchState.UiState uiState3 = RegionSheetState.SearchState.UiState.f128416b;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState.SearchState r6, @Y61.k Y41.l<? super vs.InterfaceC49374a, kotlin.G0> r7, @Y61.l androidx.compose.runtime.A r8, int r9) {
        /*
            r0 = 880736195(0x347ef7c3, float:2.3745729E-7)
            androidx.compose.runtime.B r8 = r8.E(r0)
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$SearchState$UiState r0 = r6.f128413b
            int r0 = r0.ordinal()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L8c
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L7f
            r4 = 2
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$SearchState$a r5 = r6.f128414c
            if (r0 == r4) goto L65
            r4 = 3
            if (r0 == r4) goto L29
            r0 = 1736585997(0x6782330d, float:1.2296987E24)
            r8.C(r0)
            r8.X(r2)
            goto Lb1
        L29:
            r0 = 1736043373(0x6779eb6d, float:1.1802121E24)
            r8.C(r0)
            if (r5 == 0) goto L34
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$SearchState$a$a r0 = r5.f128423b
            goto L35
        L34:
            r0 = r3
        L35:
            if (r0 != 0) goto L38
            goto L61
        L38:
            r4 = -84473282(0xfffffffffaf70a3e, float:-6.4135253E35)
            r8.C(r4)
            boolean r4 = r8.B(r7)
            java.lang.Object r5 = r8.t()
            if (r4 != 0) goto L51
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            r4.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r4) goto L59
        L51:
            com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.j$b r5 = new com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.j$b
            r5.<init>(r7)
            r8.H(r5)
        L59:
            Y41.a r5 = (Y41.a) r5
            r8.X(r2)
            com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.b.a(r0, r5, r3, r8, r1)
        L61:
            r8.X(r2)
            goto Lb1
        L65:
            r0 = 1735765396(0x6775ad94, float:1.16018174E24)
            r8.C(r0)
            if (r5 == 0) goto L70
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$SearchState$a$a r0 = r5.f128422a
            goto L71
        L70:
            r0 = r3
        L71:
            if (r0 != 0) goto L74
            goto L7b
        L74:
            com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.j$a r1 = com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.j.a.f128545l
            r4 = 56
            com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.b.a(r0, r1, r3, r8, r4)
        L7b:
            r8.X(r2)
            goto Lb1
        L7f:
            r0 = 1735649115(0x6773e75b, float:1.1518028E24)
            r8.C(r0)
            com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.i.a(r3, r8, r2)
            r8.X(r2)
            goto Lb1
        L8c:
            r0 = 1736381118(0x677f12be, float:1.2045492E24)
            r8.C(r0)
            java.util.Map<java.lang.Long, com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location> r0 = r6.f128415d
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L9e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r0.next()
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location r3 = (com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState.Location) r3
            com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.g.b(r3, r7, r8, r1)
            goto L9e
        Lae:
            r8.X(r2)
        Lb1:
            androidx.compose.runtime.c2 r8 = r8.Z()
            if (r8 == 0) goto Lbe
            com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.j$c r0 = new com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.j$c
            r0.<init>(r6, r7, r9)
            r8.f38184d = r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search.j.a(com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$SearchState, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
