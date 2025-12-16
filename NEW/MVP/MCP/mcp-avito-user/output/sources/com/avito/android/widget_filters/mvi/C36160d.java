package com.avito.android.widget_filters.mvi;

import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$handleParameterValueChange$1", f = "WidgetFiltersActor.kt", i = {0, 1, 1, 2, 2}, l = {249, 252, 255, 263}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "updatedParameters", "$this$flow", "updatedParameters"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.widget_filters.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36160d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Map f329963q;

    /* renamed from: r, reason: collision with root package name */
    public int f329964r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f329965s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WidgetFiltersInternalAction f329966t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f329967u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.widget_filters.mvi.entity.c f329968v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f329969w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f329970x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36160d(WidgetFiltersInternalAction widgetFiltersInternalAction, n nVar, com.avito.android.widget_filters.mvi.entity.c cVar, boolean z12, int i12, Continuation<? super C36160d> continuation) {
        super(2, continuation);
        this.f329966t = widgetFiltersInternalAction;
        this.f329967u = nVar;
        this.f329968v = cVar;
        this.f329969w = z12;
        this.f329970x = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C36160d c36160d = new C36160d(this.f329966t, this.f329967u, this.f329968v, this.f329969w, this.f329970x, continuation);
        c36160d.f329965s = obj;
        return c36160d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C36160d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.f329964r
            com.avito.android.widget_filters.mvi.n r2 = r13.f329967u
            com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction r3 = r13.f329966t
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L45
            if (r1 == r7) goto L3d
            if (r1 == r6) goto L31
            if (r1 == r5) goto L25
            if (r1 != r4) goto L1d
            kotlin.C42729a0.b(r14)
            goto Lb1
        L1d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L25:
            java.util.Map r1 = r13.f329963q
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r13.f329965s
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r14)
            goto L94
        L31:
            java.util.Map r1 = r13.f329963q
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r3 = r13.f329965s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r14)
            goto L77
        L3d:
            java.lang.Object r1 = r13.f329965s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r14)
            goto L58
        L45:
            kotlin.C42729a0.b(r14)
            java.lang.Object r14 = r13.f329965s
            r1 = r14
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            r13.f329965s = r1
            r13.f329964r = r7
            java.lang.Object r14 = r1.emit(r3, r13)
            if (r14 != r0) goto L58
            return r0
        L58:
            com.avito.android.widget_filters.domain.y r14 = r2.f330186e
            com.avito.android.widget_filters.mvi.entity.c r7 = r13.f329968v
            java.util.Map r14 = r14.a(r7, r3)
            com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateParameters r3 = new com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateParameters
            r3.<init>(r14)
            r13.f329965s = r1
            r7 = r14
            java.util.Map r7 = (java.util.Map) r7
            r13.f329963q = r7
            r13.f329964r = r6
            java.lang.Object r3 = r1.emit(r3, r13)
            if (r3 != r0) goto L75
            return r0
        L75:
            r3 = r1
            r1 = r14
        L77:
            boolean r14 = r13.f329969w
            if (r14 == 0) goto L97
            com.avito.android.widget_filters.domain.g r14 = r2.f330184c
            com.avito.android.widget_filters.mvi.entity.LoadingType r2 = com.avito.android.widget_filters.mvi.entity.LoadingType.f329981c
            kotlinx.coroutines.flow.C0 r14 = r14.a(r1, r2)
            r13.f329965s = r3
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            r13.f329963q = r2
            r13.f329964r = r5
            java.lang.Object r14 = kotlinx.coroutines.flow.C43175k.u(r13, r14, r3)
            if (r14 != r0) goto L93
            return r0
        L93:
            r2 = r3
        L94:
            r10 = r1
            r6 = r2
            goto L99
        L97:
            r10 = r1
            r6 = r3
        L99:
            r14 = 0
            r13.f329965s = r14
            r13.f329963q = r14
            r13.f329964r = r4
            com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction r9 = r13.f329966t
            r12 = 4
            com.avito.android.widget_filters.mvi.n r5 = r13.f329967u
            int r7 = r13.f329970x
            com.avito.android.widget_filters.mvi.entity.c r8 = r13.f329968v
            r11 = r13
            java.lang.Object r14 = com.avito.android.widget_filters.mvi.n.c(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto Lb1
            return r0
        Lb1:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.mvi.C36160d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
