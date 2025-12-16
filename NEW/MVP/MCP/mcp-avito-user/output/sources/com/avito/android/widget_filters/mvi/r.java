package com.avito.android.widget_filters.mvi;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.widget_filters.WidgetFiltersOpenParams;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetFiltersBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/mvi/r;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r implements com.avito.android.arch.mvi.b<WidgetFiltersInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WidgetFiltersOpenParams f330214a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.g f330215b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f330216c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f330217d;

    /* compiled from: WidgetFiltersBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersBootstrap$produce$1", f = "WidgetFiltersBootstrap.kt", i = {0, 0, 1, 1}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "$this$flow", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Map f330218q;

        /* renamed from: r, reason: collision with root package name */
        public int f330219r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f330220s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = r.this.new a(continuation);
            aVar.f330220s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
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
                int r1 = r13.f330219r
                r2 = 3
                r3 = 2
                r4 = 1
                com.avito.android.widget_filters.mvi.r r5 = com.avito.android.widget_filters.mvi.r.this
                if (r1 == 0) goto L39
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.C42729a0.b(r14)
                goto La0
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                java.util.Map r1 = r13.f330218q
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Object r3 = r13.f330220s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r14)
                goto L8a
            L2c:
                java.util.Map r1 = r13.f330218q
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Object r6 = r13.f330220s
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                kotlin.C42729a0.b(r14)
                r14 = r6
                goto L6c
            L39:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f330220s
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                boolean r1 = r5.f330217d
                if (r1 == 0) goto L47
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            L47:
                com.avito.android.widget_filters.WidgetFiltersOpenParams r1 = r5.f330214a
                com.avito.android.remote.model.SearchParams r7 = r1.f329689c
                r9 = 0
                r10 = 0
                com.avito.android.remote.model.SearchParamsConverter r6 = r5.f330216c
                r8 = 0
                r11 = 14
                r12 = 0
                java.util.Map r1 = com.avito.android.remote.model.SearchParamsConverter.DefaultImpls.convertToMap$default(r6, r7, r8, r9, r10, r11, r12)
                com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateParameters r6 = new com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateParameters
                r6.<init>(r1)
                r13.f330220s = r14
                r7 = r1
                java.util.Map r7 = (java.util.Map) r7
                r13.f330218q = r7
                r13.f330219r = r4
                java.lang.Object r6 = r14.emit(r6, r13)
                if (r6 != r0) goto L6c
                return r0
            L6c:
                com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateToolbarTitle r6 = new com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateToolbarTitle
                com.avito.android.widget_filters.WidgetFiltersOpenParams r7 = r5.f330214a
                java.lang.String r7 = r7.f329688b
                if (r7 != 0) goto L76
                java.lang.String r7 = ""
            L76:
                r6.<init>(r7)
                r13.f330220s = r14
                r7 = r1
                java.util.Map r7 = (java.util.Map) r7
                r13.f330218q = r7
                r13.f330219r = r3
                java.lang.Object r3 = r14.emit(r6, r13)
                if (r3 != r0) goto L89
                return r0
            L89:
                r3 = r14
            L8a:
                com.avito.android.widget_filters.domain.g r14 = r5.f330215b
                com.avito.android.widget_filters.mvi.entity.LoadingType r6 = com.avito.android.widget_filters.mvi.entity.LoadingType.f329980b
                kotlinx.coroutines.flow.C0 r14 = r14.a(r1, r6)
                r1 = 0
                r13.f330220s = r1
                r13.f330218q = r1
                r13.f330219r = r2
                java.lang.Object r14 = kotlinx.coroutines.flow.C43175k.u(r13, r14, r3)
                if (r14 != r0) goto La0
                return r0
            La0:
                r5.f330217d = r4
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.mvi.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public r(@Y61.k WidgetFiltersOpenParams widgetFiltersOpenParams, @Y61.k com.avito.android.widget_filters.domain.g gVar, @Y61.k SearchParamsConverter searchParamsConverter) {
        this.f330214a = widgetFiltersOpenParams;
        this.f330215b = gVar;
        this.f330216c = searchParamsConverter;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<WidgetFiltersInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
