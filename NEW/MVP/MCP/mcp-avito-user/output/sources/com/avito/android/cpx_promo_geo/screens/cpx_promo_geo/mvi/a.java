package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements InterfaceC43160i<InterfaceC14249c> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f127850b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.a$a, reason: collision with other inner class name */
    public static final class C3799a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f127851b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.CpxPromoGeoActor$process$$inlined$filter$1$2", f = "CpxPromoGeoActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C3800a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f127852q;

            /* renamed from: r, reason: collision with root package name */
            public int f127853r;

            public C3800a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f127852q = obj;
                this.f127853r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C3799a.this.emit(null, this);
            }
        }

        public C3799a(InterfaceC43172j interfaceC43172j) {
            this.f127851b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.a.C3799a.C3800a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.a$a$a r0 = (com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.a.C3799a.C3800a) r0
                int r1 = r0.f127853r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f127853r = r1
                goto L18
            L13:
                com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.a$a$a r0 = new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.a$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f127852q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f127853r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L4a
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                r6 = r5
                Ju.c r6 = (Ju.InterfaceC14249c) r6
                boolean r2 = r6 instanceof com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.RegionSheetLink.b.C3804b
                if (r2 != 0) goto L3f
                boolean r6 = r6 instanceof com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.RegionSheetLink.b.a
                if (r6 == 0) goto L4a
            L3f:
                r0.f127853r = r3
                kotlinx.coroutines.flow.j r6 = r4.f127851b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L4a
                return r1
            L4a:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.a.C3799a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public a(b bVar) {
        this.f127850b = bVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC14249c> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f127850b.collect(new C3799a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
