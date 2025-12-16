package com.avito.android.cpx_promo_geo.screens.region_sheet.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.generated.api.api_cpx_promo_get_locations.GeoTreeItemApi;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ns.InterfaceC44470a;

/* compiled from: GetRegionSheetSubLocationsUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/domain/a;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f128281a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44470a f128282b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f128283c;

    /* compiled from: GetRegionSheetSubLocationsUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpx_promo_geo.screens.region_sheet.domain.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3809a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128284a;

        static {
            int[] iArr = new int[GeoTreeItemApi.CheckboxState.values().length];
            try {
                iArr[GeoTreeItemApi.CheckboxState.NotSelected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GeoTreeItemApi.CheckboxState.IsHome.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f128284a = iArr;
        }
    }

    /* compiled from: GetRegionSheetSubLocationsUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.domain.GetRegionSheetSubLocationsUseCase$invoke$1", f = "GetRegionSheetSubLocationsUseCase.kt", i = {0, 1}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 36, 43}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super RegionSheetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f128285q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f128286r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f128287s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f128288t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ List<Long> f128289u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, a aVar, List<Long> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f128287s = j12;
            this.f128288t = aVar;
            this.f128289u = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f128287s, this.f128288t, this.f128289u, continuation);
            bVar.f128286r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RegionSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.domain.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k R0 r02, @com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.l @k String str, @k InterfaceC44470a interfaceC44470a) {
        this.f128281a = r02;
        this.f128282b = interfaceC44470a;
        this.f128283c = str;
    }

    @k
    public final InterfaceC43160i<RegionSheetInternalAction> a(long j12, @k List<Long> list) {
        return C43175k.I(this.f128281a.a(), C43175k.G(new b(j12, this, list, null)));
    }
}
