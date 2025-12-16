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
@DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$handleRecentSearchItemShow$1", f = "WidgetFiltersActor.kt", i = {}, l = {311, 316}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f330147q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.widget_filters.mvi.entity.c f330148r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f330149s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.widget_filters.analytics.a f330150t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.widget_filters.mvi.entity.c cVar, n nVar, com.avito.android.widget_filters.analytics.a aVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f330148r = cVar;
        this.f330149s = nVar;
        this.f330150t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f330148r, this.f330149s, this.f330150t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f330147q
            r2 = 2
            r3 = 1
            com.avito.android.widget_filters.analytics.a r4 = r6.f330150t
            com.avito.android.widget_filters.mvi.n r5 = r6.f330149s
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.C42729a0.b(r7)
            goto L60
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.C42729a0.b(r7)
            goto L44
        L22:
            kotlin.C42729a0.b(r7)
            com.avito.android.widget_filters.mvi.entity.c r7 = r6.f330148r
            com.avito.android.widget_filters.mvi.entity.d$d r7 = r7.f330101h
            if (r7 == 0) goto L2e
            java.lang.Object r7 = r7.f330143i
            goto L2f
        L2e:
            r7 = 0
        L2f:
            boolean r7 = com.avito.android.util.O2.a(r7)
            if (r7 == 0) goto L60
            com.avito.android.widget_filters.analytics.e r7 = r5.f330189h
            java.lang.String r1 = r4.getName()
            r6.f330147q = r3
            java.lang.Object r7 = r7.c(r1, r6)
            if (r7 != r0) goto L44
            return r0
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L60
            com.avito.android.widget_filters.analytics.b r7 = r5.f330188g
            r7.e(r4)
            java.lang.String r7 = r4.getName()
            r6.f330147q = r2
            com.avito.android.widget_filters.analytics.e r1 = r5.f330189h
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L60
            return r0
        L60:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.mvi.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
