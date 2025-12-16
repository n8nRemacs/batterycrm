package com.avito.android.widget_filters.domain;

import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.R0;
import com.avito.android.widget_filters.WidgetFiltersOpenParams;
import com.avito.android.widget_filters.deeplink.WidgetFiltersLink;
import com.avito.android.widget_filters.mvi.entity.LoadingType;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetFiltersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/domain/h;", "Lcom/avito/android/widget_filters/domain/g;", "a", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PP0.a f329853a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f329854b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f329855c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36154b f329856d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.analytics.b f329857e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f329858f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final WidgetFiltersLink.WidgetFiltersFlow f329859g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SearchParams f329860h;

    /* compiled from: WidgetFiltersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/widget_filters/domain/h$a;", "", "<init>", "()V", "", "LOADING_DEBOUNCE_TIME", "J", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WidgetFiltersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.domain.WidgetFiltersInteractorImpl$applyWidgetFilters$1", f = "WidgetFiltersInteractor.kt", i = {0, 1}, l = {96, UpdateStatusCode.DialogButton.CONFIRM, 120, 125, 131}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f329861q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f329862r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f329864t;

        /* compiled from: WidgetFiltersInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[WidgetFiltersLink.WidgetFiltersFlow.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    WidgetFiltersLink.WidgetFiltersFlow.a aVar = WidgetFiltersLink.WidgetFiltersFlow.f329737b;
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    WidgetFiltersLink.WidgetFiltersFlow.a aVar2 = WidgetFiltersLink.WidgetFiltersFlow.f329737b;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, String> map, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f329864t = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = h.this.new b(this.f329864t, continuation);
            bVar.f329862r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 362
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.domain.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public h(@Y61.k WidgetFiltersOpenParams widgetFiltersOpenParams, @Y61.k PP0.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.location.r rVar, @Y61.k InterfaceC36154b interfaceC36154b, @Y61.k com.avito.android.widget_filters.analytics.b bVar) {
        this.f329853a = aVar;
        this.f329854b = r02;
        this.f329855c = rVar;
        this.f329856d = interfaceC36154b;
        this.f329857e = bVar;
        this.f329858f = widgetFiltersOpenParams.f329690d;
        this.f329859g = widgetFiltersOpenParams.f329691e;
        this.f329860h = widgetFiltersOpenParams.f329689c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.widget_filters.domain.h r4, kotlinx.coroutines.flow.InterfaceC43172j r5, com.avito.android.widget_filters.remote.model.toast.WidgetFiltersToast r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.avito.android.widget_filters.domain.i
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.widget_filters.domain.i r0 = (com.avito.android.widget_filters.domain.i) r0
            int r1 = r0.f329869u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f329869u = r1
            goto L1b
        L16:
            com.avito.android.widget_filters.domain.i r0 = new com.avito.android.widget_filters.domain.i
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f329867s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f329869u
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            com.avito.android.remote.model.ParametrizedEvent r4 = r0.f329866r
            com.avito.android.widget_filters.domain.h r5 = r0.f329865q
            kotlin.C42729a0.b(r7)
            r6 = r4
            r4 = r5
            goto L66
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.C42729a0.b(r7)
            r7 = 0
            if (r6 == 0) goto L45
            java.lang.String r2 = r6.getMessage()
            goto L46
        L45:
            r2 = r7
        L46:
            if (r6 == 0) goto L4d
            com.avito.android.remote.model.ParametrizedEvent r6 = r6.getClickStream()
            goto L4e
        L4d:
            r6 = r7
        L4e:
            if (r2 == 0) goto L66
            com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$ShowDefaultToast r7 = new com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$ShowDefaultToast
            com.avito.android.printable_text.PrintableText r2 = com.avito.android.printable_text.b.f(r2)
            r7.<init>(r2)
            r0.f329865q = r4
            r0.f329866r = r6
            r0.f329869u = r3
            java.lang.Object r5 = r5.emit(r7, r0)
            if (r5 != r1) goto L66
            goto L73
        L66:
            if (r6 == 0) goto L71
            com.avito.android.widget_filters.analytics.b r4 = r4.f329857e
            com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent r5 = com.avito.android.analytics.a0.a(r6)
            r4.a(r5)
        L71:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.domain.h.c(com.avito.android.widget_filters.domain.h, kotlinx.coroutines.flow.j, com.avito.android.widget_filters.remote.model.toast.WidgetFiltersToast, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.widget_filters.domain.g
    @Y61.k
    public final C0 a(@Y61.k Map map, @Y61.k LoadingType loadingType) {
        return C43175k.B(new m(loadingType, this, null), C43175k.n(new C43137a0(new l(2, null), C43175k.I(this.f329854b.a(), new j(C43175k.G(new k(this, map, null))))), 300L));
    }

    @Override // com.avito.android.widget_filters.domain.g
    @Y61.k
    public final InterfaceC43160i<WidgetFiltersInternalAction> b(@Y61.k Map<String, String> map) {
        return C43175k.I(this.f329854b.a(), C43175k.G(new b(map, null)));
    }
}
