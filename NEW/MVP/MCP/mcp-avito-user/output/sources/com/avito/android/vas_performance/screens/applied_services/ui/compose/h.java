package com.avito.android.vas_performance.screens.applied_services.ui.compose;

import IL0.a;
import IL0.b;
import Y41.p;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.A;
import com.avito.android.analytics.screens.mvi.r;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AppliedServicesScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LIL0/a;", "Lkotlin/G0;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "_avito_vas-performance_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    /* compiled from: AppliedServicesScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.applied_services.ui.compose.AppliedServicesScreenKt$AppliedServicesScreen$1", f = "AppliedServicesScreen.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f320353q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<IL0.b> f320354r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f320355s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f320356t;

        /* compiled from: AppliedServicesScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIL0/b;", "event", "Lkotlin/G0;", "emit", "(LIL0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.vas_performance.screens.applied_services.ui.compose.h$a$a, reason: collision with other inner class name */
        public static final class C9929a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f320357b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f320358c;

            public C9929a(com.avito.android.lib.design.bottom_sheet.d dVar, InterfaceC22204y1 interfaceC22204y1) {
                this.f320357b = dVar;
                this.f320358c = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                IL0.b bVar = (IL0.b) obj;
                boolean z12 = bVar instanceof b.C0461b;
                com.avito.android.lib.design.bottom_sheet.d dVar = this.f320357b;
                if (z12) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(((b.C0461b) bVar).f8154a);
                    ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.d(cVar, dVar, printableTextF, null, f.c.a.b(), 0, toastBarPosition, 942);
                } else if (bVar instanceof b.a) {
                    b.a aVar = (b.a) bVar;
                    ((Y41.l) this.f320358c.getF42167b()).invoke(aVar.f8152a);
                    if (aVar.f8153b) {
                        dVar.dismiss();
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, com.avito.android.lib.design.bottom_sheet.d dVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f320354r = interfaceC43160i;
            this.f320355s = dVar;
            this.f320356t = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f320354r, this.f320355s, this.f320356t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f320353q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C9929a c9929a = new C9929a(this.f320355s, this.f320356t);
                this.f320353q = 1;
                if (this.f320354r.collect(c9929a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AppliedServicesScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", ServiceTransportationWidget.LocationField.COORDINATES, "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<A, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f320359l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22196w1 interfaceC22196w1) {
            super(1);
            this.f320359l = interfaceC22196w1;
        }

        @Override // Y41.l
        public final G0 invoke(A a12) {
            this.f320359l.L3((int) (a12.a() & 4294967295L));
            return G0.f406611a;
        }
    }

    /* compiled from: AppliedServicesScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AppliedServicesState f320360l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f320361m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AppliedServicesState appliedServicesState, InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f320360l = appliedServicesState;
            this.f320361m = interfaceC22204y1;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink;
            AppliedServicesState.a aVar = this.f320360l.f320284e;
            if (aVar != null && (deepLink = aVar.f320309b) != null) {
                ((Y41.l) this.f320361m.getF42167b()).invoke(new a.C0460a(deepLink));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AppliedServicesScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AppliedServicesState f320362l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f320363m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AppliedServicesState appliedServicesState, InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f320362l = appliedServicesState;
            this.f320363m = interfaceC22204y1;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink;
            AppliedServicesState.a aVar = this.f320362l.f320285f;
            if (aVar != null && (deepLink = aVar.f320309b) != null) {
                ((Y41.l) this.f320363m.getF42167b()).invoke(new a.C0460a(deepLink));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AppliedServicesScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AppliedServicesState f320364l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<IL0.b> f320365m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<IL0.a, G0> f320366n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.vas_performance.screens.applied_services.ui.a f320367o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f320368p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f320369q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(AppliedServicesState appliedServicesState, InterfaceC43160i<? extends IL0.b> interfaceC43160i, Y41.l<? super IL0.a, G0> lVar, com.avito.android.vas_performance.screens.applied_services.ui.a aVar, com.avito.android.lib.design.bottom_sheet.d dVar, Y41.l<? super DeepLink, G0> lVar2, int i12) {
            super(2);
            this.f320364l = appliedServicesState;
            this.f320365m = interfaceC43160i;
            this.f320366n = lVar;
            this.f320367o = aVar;
            this.f320368p = dVar;
            this.f320369q = lVar2;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(32833);
            com.avito.android.lib.design.bottom_sheet.d dVar = this.f320368p;
            Y41.l<DeepLink, G0> lVar = this.f320369q;
            Y41.l<IL0.a, G0> lVar2 = this.f320366n;
            com.avito.android.vas_performance.screens.applied_services.ui.a aVar = this.f320367o;
            h.a(this.f320364l, this.f320365m, lVar2, aVar, dVar, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ContentDrawTracking.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "com/avito/android/analytics/screens/compose/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f320370l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.compose.a f320371m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar, com.avito.android.analytics.screens.compose.a aVar) {
            super(1);
            this.f320370l = rVar;
            this.f320371m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            dVar.y1();
            com.avito.android.analytics.screens.compose.a aVar = this.f320371m;
            r rVar = this.f320370l;
            if (rVar != null) {
                aVar.n(rVar.f90666a, rVar.f90667b, null);
            }
            aVar.f();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState r31, @Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends IL0.b> r32, @Y61.k Y41.l<? super IL0.a, kotlin.G0> r33, @Y61.l com.avito.android.vas_performance.screens.applied_services.ui.a r34, @Y61.k com.avito.android.lib.design.bottom_sheet.d r35, @Y61.k Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r36, @Y61.l androidx.compose.runtime.A r37, int r38) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.applied_services.ui.compose.h.a(com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState, kotlinx.coroutines.flow.i, Y41.l, com.avito.android.vas_performance.screens.applied_services.ui.a, com.avito.android.lib.design.bottom_sheet.d, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
