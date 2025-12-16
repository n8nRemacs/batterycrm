package com.avito.android.widget_filters.mvi;

import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$handleLocationSuggestsStateChange$1", f = "WidgetFiltersActor.kt", i = {0}, l = {277, 278, 284}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.widget_filters.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36157a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329951q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f329952r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.widget_filters.mvi.entity.c f329953s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f329954t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f329955u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36157a(com.avito.android.widget_filters.mvi.entity.c cVar, boolean z12, n nVar, Continuation<? super C36157a> continuation) {
        super(2, continuation);
        this.f329953s = cVar;
        this.f329954t = z12;
        this.f329955u = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C36157a c36157a = new C36157a(this.f329953s, this.f329954t, this.f329955u, continuation);
        c36157a.f329952r = obj;
        return c36157a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C36157a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f329951q
            r2 = 0
            r3 = 3
            r4 = 2
            com.avito.android.widget_filters.mvi.n r5 = r8.f329955u
            com.avito.android.widget_filters.mvi.entity.c r6 = r8.f329953s
            r7 = 1
            if (r1 == 0) goto L2c
            if (r1 == r7) goto L24
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.C42729a0.b(r9)
            goto L93
        L24:
            java.lang.Object r1 = r8.f329952r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L5a
        L2c:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f329952r
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.widget_filters.mvi.entity.d$d r9 = r6.f330101h
            if (r9 == 0) goto L3b
            java.lang.Object r9 = r9.f330143i
            goto L3c
        L3b:
            r9 = r2
        L3c:
            boolean r9 = com.avito.android.util.O2.a(r9)
            if (r9 == 0) goto L93
            boolean r9 = r8.f329954t
            if (r9 != 0) goto L79
            com.avito.android.widget_filters.analytics.e r9 = r5.f330189h
            com.avito.android.widget_filters.analytics.a$a r3 = com.avito.android.widget_filters.analytics.a.C10241a.f329704a
            r3.getClass()
            r8.f329952r = r1
            r8.f329951q = r7
            java.lang.String r3 = "search_widget_city"
            java.lang.Object r9 = r9.b(r3, r8)
            if (r9 != r0) goto L5a
            return r0
        L5a:
            com.avito.android.widget_filters.mvi.entity.d$d r9 = r6.f330101h
            if (r9 == 0) goto L61
            NP0.s r9 = r9.f330145k
            goto L62
        L61:
            r9 = r2
        L62:
            r5.getClass()
            com.avito.android.widget_filters.mvi.i r3 = new com.avito.android.widget_filters.mvi.i
            r3.<init>(r9, r5, r2)
            kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.C43175k.G(r3)
            r8.f329952r = r2
            r8.f329951q = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r8, r9, r1)
            if (r9 != r0) goto L93
            return r0
        L79:
            com.avito.android.widget_filters.mvi.entity.d$d r9 = r6.f330101h
            if (r9 == 0) goto L93
            boolean r9 = r9.f330144j
            if (r9 != r7) goto L93
            com.avito.android.widget_filters.analytics.e r9 = r5.f330189h
            com.avito.android.widget_filters.analytics.a$b r1 = com.avito.android.widget_filters.analytics.a.b.f329705a
            r1.getClass()
            r8.f329951q = r3
            java.lang.String r1 = "search_widget"
            java.lang.Object r9 = r9.b(r1, r8)
            if (r9 != r0) goto L93
            return r0
        L93:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.mvi.C36157a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
