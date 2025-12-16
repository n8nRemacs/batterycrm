package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vs.InterfaceC49374a;

/* compiled from: RegionSheetActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.RegionSheetActor$process$4", f = "RegionSheetActor.kt", i = {0, 0, 0, 0}, l = {141, 186}, m = "invokeSuspend", n = {"$this$flow", "shouldSelect", "originalChildState", "successLoadAction"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RegionSheetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.a f128349q;

    /* renamed from: r, reason: collision with root package name */
    public RegionSheetState.Location.CheckboxState f128350r;

    /* renamed from: s, reason: collision with root package name */
    public l0.h f128351s;

    /* renamed from: t, reason: collision with root package name */
    public int f128352t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f128353u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49374a f128354v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState f128355w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a f128356x;

    /* compiled from: RegionSheetActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "internalAction", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.RegionSheetActor$process$4$1", f = "RegionSheetActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<RegionSheetInternalAction, Continuation<? super InterfaceC43160i<? extends RegionSheetInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f128357q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC49374a f128358r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l0.a f128359s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ RegionSheetState.Location.CheckboxState f128360t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l0.h<RegionSheetInternalAction.SubContent> f128361u;

        /* compiled from: RegionSheetActor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.RegionSheetActor$process$4$1$1", f = "RegionSheetActor.kt", i = {0, 2}, l = {147, 150, 160, 167}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
        /* renamed from: com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C3811a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RegionSheetInternalAction>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f128362q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f128363r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ RegionSheetInternalAction f128364s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ InterfaceC49374a f128365t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ l0.a f128366u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ RegionSheetState.Location.CheckboxState f128367v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ l0.h<RegionSheetInternalAction.SubContent> f128368w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3811a(RegionSheetInternalAction regionSheetInternalAction, InterfaceC49374a interfaceC49374a, l0.a aVar, RegionSheetState.Location.CheckboxState checkboxState, l0.h<RegionSheetInternalAction.SubContent> hVar, Continuation<? super C3811a> continuation) {
                super(2, continuation);
                this.f128364s = regionSheetInternalAction;
                this.f128365t = interfaceC49374a;
                this.f128366u = aVar;
                this.f128367v = checkboxState;
                this.f128368w = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C3811a c3811a = new C3811a(this.f128364s, this.f128365t, this.f128366u, this.f128367v, this.f128368w, continuation);
                c3811a.f128363r = obj;
                return c3811a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super RegionSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((C3811a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[RETURN] */
            /* JADX WARN: Type inference failed for: r7v0, types: [T, com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r14.f128362q
                    r2 = 0
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction r7 = r14.f128364s
                    if (r1 == 0) goto L35
                    if (r1 == r6) goto L2d
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L20
                    if (r1 != r3) goto L18
                    goto L28
                L18:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L20:
                    java.lang.Object r1 = r14.f128363r
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                    kotlin.C42729a0.b(r15)
                    goto L8e
                L28:
                    kotlin.C42729a0.b(r15)
                    goto Laa
                L2d:
                    java.lang.Object r1 = r14.f128363r
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                    kotlin.C42729a0.b(r15)
                    goto L48
                L35:
                    kotlin.C42729a0.b(r15)
                    java.lang.Object r15 = r14.f128363r
                    kotlinx.coroutines.flow.j r15 = (kotlinx.coroutines.flow.InterfaceC43172j) r15
                    r14.f128363r = r15
                    r14.f128362q = r6
                    java.lang.Object r1 = r15.emit(r7, r14)
                    if (r1 != r0) goto L47
                    return r0
                L47:
                    r1 = r15
                L48:
                    boolean r15 = r7 instanceof com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction.SubLoading
                    vs.a r6 = r14.f128365t
                    if (r15 == 0) goto L68
                    com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$SearchSubLoading r15 = new com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$SearchSubLoading
                    vs.a$h r6 = (vs.InterfaceC49374a.h) r6
                    long r3 = r6.f441014a
                    java.lang.Long r6 = r6.f441015b
                    long r6 = r6.longValue()
                    r15.<init>(r3, r6)
                    r14.f128363r = r2
                    r14.f128362q = r5
                    java.lang.Object r15 = r1.emit(r15, r14)
                    if (r15 != r0) goto Laa
                    return r0
                L68:
                    boolean r15 = r7 instanceof com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction.SubError
                    if (r15 == 0) goto La2
                    kotlin.jvm.internal.l0$a r15 = r14.f128366u
                    r5 = 0
                    r15.f406838b = r5
                    com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$ResetSearchItemState r15 = new com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$ResetSearchItemState
                    vs.a$h r6 = (vs.InterfaceC49374a.h) r6
                    long r9 = r6.f441014a
                    java.lang.Long r5 = r6.f441015b
                    long r11 = r5.longValue()
                    com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location$CheckboxState r13 = r14.f128367v
                    r8 = r15
                    r8.<init>(r9, r11, r13)
                    r14.f128363r = r1
                    r14.f128362q = r4
                    java.lang.Object r15 = r1.emit(r15, r14)
                    if (r15 != r0) goto L8e
                    return r0
                L8e:
                    com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$SearchSubError r15 = new com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$SearchSubError
                    com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$SubError r7 = (com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction.SubError) r7
                    com.avito.android.remote.error.ApiError r4 = r7.f128386c
                    r15.<init>(r4)
                    r14.f128363r = r2
                    r14.f128362q = r3
                    java.lang.Object r15 = r1.emit(r15, r14)
                    if (r15 != r0) goto Laa
                    return r0
                La2:
                    boolean r15 = r7 instanceof com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction.SubContent
                    if (r15 == 0) goto Laa
                    kotlin.jvm.internal.l0$h<com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$SubContent> r15 = r14.f128368w
                    r15.f406842b = r7
                Laa:
                    kotlin.G0 r15 = kotlin.G0.f406611a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.e.a.C3811a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC49374a interfaceC49374a, l0.a aVar, RegionSheetState.Location.CheckboxState checkboxState, l0.h<RegionSheetInternalAction.SubContent> hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f128358r = interfaceC49374a;
            this.f128359s = aVar;
            this.f128360t = checkboxState;
            this.f128361u = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f128358r, this.f128359s, this.f128360t, this.f128361u, continuation);
            aVar.f128357q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(RegionSheetInternalAction regionSheetInternalAction, Continuation<? super InterfaceC43160i<? extends RegionSheetInternalAction>> continuation) {
            return ((a) create(regionSheetInternalAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            RegionSheetInternalAction regionSheetInternalAction = (RegionSheetInternalAction) this.f128357q;
            l0.h<RegionSheetInternalAction.SubContent> hVar = this.f128361u;
            return C43175k.G(new C3811a(regionSheetInternalAction, this.f128358r, this.f128359s, this.f128360t, hVar, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a aVar, RegionSheetState regionSheetState, Continuation continuation, InterfaceC49374a interfaceC49374a) {
        super(2, continuation);
        this.f128354v = interfaceC49374a;
        this.f128355w = regionSheetState;
        this.f128356x = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f128356x, this.f128355w, continuation, this.f128354v);
        eVar.f128353u = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RegionSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
