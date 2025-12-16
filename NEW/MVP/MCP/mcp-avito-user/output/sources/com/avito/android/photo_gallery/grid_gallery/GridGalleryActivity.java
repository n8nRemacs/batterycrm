package com.avito.android.photo_gallery.grid_gallery;

import Cd.C13243a;
import T70.a;
import T70.c;
import T70.d;
import T70.g;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.result.ActivityResult;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import com.avito.android.photo_gallery.LegacyPhotoGalleryOpenParams;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity;
import com.avito.android.util.C35961v3;
import com.avito.android.util.C35974x2;
import com.avito.android.util.D6;
import i.b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: GridGalleryActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/GridGalleryActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GridGalleryActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final a f217085v = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public A f217087n;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f217089p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f217090q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f217091r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f217092s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public y f217093t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.view.result.h<Intent> f217094u;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f217086m = C35961v3.a(this);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final O0 f217088o = new O0(m0.f406844a.b(z.class), new f(), new e(new h()), new g());

    /* compiled from: GridGalleryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/GridGalleryActivity$a;", "", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GridGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT70/c;", "action", "Lkotlin/G0;", "invoke", "(LT70/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<T70.c, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(T70.c cVar) {
            a aVar = GridGalleryActivity.f217085v;
            GridGalleryActivity.this.a2().accept(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: GridGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$onCreate$3", f = "GridGalleryActivity.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f217096q;

        /* compiled from: GridGalleryActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$onCreate$3$1", f = "GridGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f217098q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ GridGalleryActivity f217099r;

            /* compiled from: GridGalleryActivity.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$onCreate$3$1$1", f = "GridGalleryActivity.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$a, reason: collision with other inner class name */
            public static final class C6502a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f217100q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ GridGalleryActivity f217101r;

                /* compiled from: GridGalleryActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT70/g;", "it", "Lkotlin/G0;", "invoke", "(LT70/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$a$a, reason: collision with other inner class name */
                public static final class C6503a extends N implements Y41.l<T70.g, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ GridGalleryActivity f217102l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C6503a(GridGalleryActivity gridGalleryActivity) {
                        super(1);
                        this.f217102l = gridGalleryActivity;
                    }

                    @Override // Y41.l
                    public final G0 invoke(T70.g gVar) {
                        T70.g gVar2 = gVar;
                        y yVar = this.f217102l.f217093t;
                        if (yVar != null) {
                            boolean z12 = gVar2 instanceof g.b;
                            RecyclerView recyclerView = yVar.f217444e;
                            if (z12) {
                                D6.w(recyclerView);
                            } else if (gVar2 instanceof g.a) {
                                g.a aVar = (g.a) gVar2;
                                D6.H(recyclerView);
                                RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
                                if (itemAnimator != null) {
                                    itemAnimator.k();
                                }
                                yVar.f217441b.l(aVar.f15427b, new RunnableC28882d(22, gVar2, yVar));
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$a$b */
                public static final class b implements InterfaceC43160i<T70.g> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f217103b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$a$b$a, reason: collision with other inner class name */
                    public static final class C6504a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f217104b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$onCreate$3$1$1$invokeSuspend$$inlined$map$1$2", f = "GridGalleryActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C6505a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f217105q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f217106r;

                            public C6505a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f217105q = obj;
                                this.f217106r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C6504a.this.emit(null, this);
                            }
                        }

                        public C6504a(InterfaceC43172j interfaceC43172j) {
                            this.f217104b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity.c.a.C6502a.b.C6504a.C6505a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$a$b$a$a r0 = (com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity.c.a.C6502a.b.C6504a.C6505a) r0
                                int r1 = r0.f217106r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f217106r = r1
                                goto L18
                            L13:
                                com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$a$b$a$a r0 = new com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$a$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f217105q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f217106r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L45
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                T70.e r5 = (T70.e) r5
                                T70.f r5 = r5.f15424i
                                T70.g r5 = r5.f15425a
                                r0.f217106r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f217104b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L45
                                return r1
                            L45:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity.c.a.C6502a.b.C6504a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public b(n2 n2Var) {
                        this.f217103b = n2Var;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super T70.g> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f217103b.collect(new C6504a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6502a(GridGalleryActivity gridGalleryActivity, Continuation<? super C6502a> continuation) {
                    super(2, continuation);
                    this.f217101r = gridGalleryActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6502a(this.f217101r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6502a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f217100q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = GridGalleryActivity.f217085v;
                        GridGalleryActivity gridGalleryActivity = this.f217101r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new b(gridGalleryActivity.a2().getState()));
                        ScreenPerformanceTracker screenPerformanceTracker = gridGalleryActivity.f217089p;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C6503a c6503a = new C6503a(gridGalleryActivity);
                        this.f217100q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iR, screenPerformanceTracker, c6503a, this) == coroutine_suspended) {
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

            /* compiled from: GridGalleryActivity.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$onCreate$3$1$2", f = "GridGalleryActivity.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f217108q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ GridGalleryActivity f217109r;

                /* compiled from: GridGalleryActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT70/a;", "it", "Lkotlin/G0;", "invoke", "(LT70/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$b$a, reason: collision with other inner class name */
                public static final class C6506a extends N implements Y41.l<T70.a, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ GridGalleryActivity f217110l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C6506a(GridGalleryActivity gridGalleryActivity) {
                        super(1);
                        this.f217110l = gridGalleryActivity;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
                    @Override // Y41.l
                    public final G0 invoke(T70.a aVar) {
                        T70.a aVar2 = aVar;
                        y yVar = this.f217110l.f217093t;
                        if (yVar != null) {
                            yVar.f217443d.setText(aVar2.f15382b);
                            o oVar = new o(yVar, 0);
                            yVar.f217440a.l(aVar2.f15383c, oVar);
                            a.InterfaceC1048a interfaceC1048a = aVar2.f15384d;
                            boolean z12 = interfaceC1048a instanceof a.InterfaceC1048a.b;
                            View view = yVar.f217448i;
                            Button button = yVar.f217449j;
                            LinearLayout linearLayout = yVar.f217446g;
                            Button button2 = yVar.f217447h;
                            if (z12) {
                                D6.H(linearLayout);
                                D6.H(button2);
                                D6.w(view);
                                D6.w(button);
                                y.b(button2, ((a.InterfaceC1048a.b) interfaceC1048a).f15387a, new r(yVar, interfaceC1048a));
                            } else if (interfaceC1048a instanceof a.InterfaceC1048a.C1049a) {
                                D6.H(linearLayout);
                                D6.H(button2);
                                D6.H(view);
                                D6.H(button);
                                a.InterfaceC1048a.C1049a c1049a = (a.InterfaceC1048a.C1049a) interfaceC1048a;
                                y.b(button2, c1049a.f15385a, new s(yVar, interfaceC1048a));
                                y.b(button, c1049a.f15386b, new t(yVar, interfaceC1048a));
                            } else if (interfaceC1048a == null) {
                                D6.w(linearLayout);
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$b$b, reason: collision with other inner class name */
                public static final class C6507b implements InterfaceC43160i<T70.a> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f217111b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$b$b$a, reason: collision with other inner class name */
                    public static final class C6508a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f217112b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$onCreate$3$1$2$invokeSuspend$$inlined$map$1$2", f = "GridGalleryActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$b$b$a$a, reason: collision with other inner class name */
                        public static final class C6509a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f217113q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f217114r;

                            public C6509a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f217113q = obj;
                                this.f217114r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C6508a.this.emit(null, this);
                            }
                        }

                        public C6508a(InterfaceC43172j interfaceC43172j) {
                            this.f217112b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity.c.a.b.C6507b.C6508a.C6509a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$b$b$a$a r0 = (com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity.c.a.b.C6507b.C6508a.C6509a) r0
                                int r1 = r0.f217114r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f217114r = r1
                                goto L18
                            L13:
                                com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$b$b$a$a r0 = new com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$b$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f217113q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f217114r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L45
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                T70.e r5 = (T70.e) r5
                                T70.f r5 = r5.f15424i
                                T70.a r5 = r5.f15426b
                                r0.f217114r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f217112b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L45
                                return r1
                            L45:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity.c.a.b.C6507b.C6508a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public C6507b(n2 n2Var) {
                        this.f217111b = n2Var;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super T70.a> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f217111b.collect(new C6508a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(GridGalleryActivity gridGalleryActivity, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f217109r = gridGalleryActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f217109r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f217108q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = GridGalleryActivity.f217085v;
                        GridGalleryActivity gridGalleryActivity = this.f217109r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new C6507b(gridGalleryActivity.a2().getState()));
                        ScreenPerformanceTracker screenPerformanceTracker = gridGalleryActivity.f217089p;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C6506a c6506a = new C6506a(gridGalleryActivity);
                        this.f217108q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iR, screenPerformanceTracker, c6506a, this) == coroutine_suspended) {
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

            /* compiled from: GridGalleryActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$onCreate$3$1$3", f = "GridGalleryActivity.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$c, reason: collision with other inner class name */
            public static final class C6510c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f217116q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ GridGalleryActivity f217117r;

                /* compiled from: GridGalleryActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity$c$a$c$a, reason: collision with other inner class name */
                public /* synthetic */ class C6511a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ GridGalleryActivity f217118b;

                    public C6511a(GridGalleryActivity gridGalleryActivity) {
                        this.f217118b = gridGalleryActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        T70.d dVar = (T70.d) obj;
                        a aVar = GridGalleryActivity.f217085v;
                        GridGalleryActivity gridGalleryActivity = this.f217118b;
                        if (dVar instanceof d.a) {
                            Intent intent = new Intent();
                            d.a aVar2 = (d.a) dVar;
                            intent.putExtra("gallery_position_key", aVar2.f15409a);
                            intent.putExtra("state_id_key", aVar2.f15410b);
                            G0 g02 = G0.f406611a;
                            gridGalleryActivity.setResult(-1, intent);
                            gridGalleryActivity.finish();
                        } else {
                            if (dVar instanceof d.e) {
                                y yVar = gridGalleryActivity.f217093t;
                                if (yVar != null) {
                                    int i12 = ((d.e) dVar).f15414a;
                                    RecyclerView recyclerView = yVar.f217445f;
                                    RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                    if (linearLayoutManager != null) {
                                        x xVar = yVar.f217452m;
                                        xVar.f53878a = i12;
                                        recyclerView.v0(yVar.f217454o);
                                        linearLayoutManager.x1(xVar);
                                        yVar.f217453n = true;
                                    }
                                }
                            } else if (dVar instanceof d.C1051d) {
                                y yVar2 = gridGalleryActivity.f217093t;
                                if (yVar2 != null) {
                                    int i13 = ((d.C1051d) dVar).f15413a;
                                    RecyclerView recyclerView2 = yVar2.f217445f;
                                    recyclerView2.post(new androidx.camera.video.internal.audio.q(i13, 10, recyclerView2));
                                }
                            } else if (dVar instanceof d.c) {
                                LegacyPhotoGalleryActivity.a aVar3 = LegacyPhotoGalleryActivity.f216531m0;
                                LegacyPhotoGalleryOpenParams legacyPhotoGalleryOpenParams = ((d.c) dVar).f15412a;
                                aVar3.getClass();
                                Intent intentPutExtra = new Intent(gridGalleryActivity, (Class<?>) LegacyPhotoGalleryActivity.class).putExtra("open_params", legacyPhotoGalleryOpenParams);
                                androidx.view.result.h<Intent> hVar = gridGalleryActivity.f217094u;
                                (hVar != null ? hVar : null).b(intentPutExtra);
                            } else if (dVar instanceof d.b) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar4 = gridGalleryActivity.f217092s;
                                if (aVar4 == null) {
                                    aVar4 = null;
                                }
                                b.a.a(aVar4, ((d.b) dVar).f15411a, null, null, 6);
                            }
                        }
                        G0 g03 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g03;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f217118b, GridGalleryActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6510c(GridGalleryActivity gridGalleryActivity, Continuation<? super C6510c> continuation) {
                    super(2, continuation);
                    this.f217117r = gridGalleryActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6510c(this.f217117r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6510c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f217116q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = GridGalleryActivity.f217085v;
                        GridGalleryActivity gridGalleryActivity = this.f217117r;
                        InterfaceC43160i<T70.d> events = gridGalleryActivity.a2().getEvents();
                        C6511a c6511a = new C6511a(gridGalleryActivity);
                        this.f217116q = 1;
                        if (events.collect(c6511a, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GridGalleryActivity gridGalleryActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f217099r = gridGalleryActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f217099r, continuation);
                aVar.f217098q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f217098q;
                GridGalleryActivity gridGalleryActivity = this.f217099r;
                C43259k.d(t12, null, null, new C6502a(gridGalleryActivity, null), 3);
                C43259k.d(t12, null, null, new b(gridGalleryActivity, null), 3);
                C43259k.d(t12, null, null, new C6510c(gridGalleryActivity, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return GridGalleryActivity.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f217096q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                GridGalleryActivity gridGalleryActivity = GridGalleryActivity.this;
                a aVar = new a(gridGalleryActivity, null);
                this.f217096q = 1;
                if (C23056p0.b(gridGalleryActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: GridGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT70/c;", "action", "Lkotlin/G0;", "invoke", "(LT70/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<T70.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(T70.c cVar) {
            a aVar = GridGalleryActivity.f217085v;
            GridGalleryActivity.this.a2().accept(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f217120l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f217120l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f217120l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return GridGalleryActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return GridGalleryActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: GridGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/z;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/photo_gallery/grid_gallery/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<z> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final z invoke() {
            A a12 = GridGalleryActivity.this.f217087n;
            if (a12 == null) {
                a12 = null;
            }
            return (z) a12.get();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.photo_gallery.grid_gallery.di.b.a().a((com.avito.android.photo_gallery.grid_gallery.di.d) C29972i.a(C29972i.b(this), com.avito.android.photo_gallery.grid_gallery.di.d.class), (kj.c) C29972i.a(C29972i.b(this), kj.c.class), cv.c.a(this), new C28478k(GridGalleryPerfScreen.f217147d, com.avito.android.analytics.screens.s.a(this), null, 4, null), new d(), (GridGalleryOpenParams) this.f217086m.getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f217089p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final z a2() {
        return (z) this.f217088o.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        a2().accept(c.h.f15407a);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f217089p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.grid_gallery);
        com.avito.android.lib.util.z zVar = com.avito.android.lib.util.z.f181429a;
        Window window = getWindow();
        Integer numValueOf = Integer.valueOf(R.attr.constantBlack);
        zVar.getClass();
        com.avito.android.lib.util.z.d(window, this, numValueOf, false);
        com.avito.android.lib.util.z.b(getWindow(), this, numValueOf, false);
        Window window2 = getWindow();
        zVar.getClass();
        com.avito.android.lib.util.z.a(window2, this, numValueOf);
        this.f217094u = registerForActivityResult(new b.m(), new androidx.view.result.a() { // from class: com.avito.android.photo_gallery.grid_gallery.d
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Intent intent;
                Integer numB;
                ActivityResult activityResult = (ActivityResult) obj;
                GridGalleryActivity.a aVar = GridGalleryActivity.f217085v;
                if (activityResult == null || (intent = activityResult.f21243c) == null || (numB = C35974x2.b(intent, "image_position")) == null) {
                    return;
                }
                this.f217150b.a2().accept(new c.g(numB.intValue()));
            }
        });
        com.avito.konveyor.adapter.d dVar = this.f217091r;
        if (dVar == null) {
            dVar = null;
        }
        com.avito.konveyor.adapter.d dVar2 = this.f217090q;
        if (dVar2 == null) {
            dVar2 = null;
        }
        this.f217093t = new y(this, dVar, dVar2, new b());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f217089p;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        y yVar = this.f217093t;
        if (yVar != null) {
            yVar.f217445f.setAdapter(null);
        }
        this.f217093t = null;
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        a2().accept(c.i.f15408a);
        super.onStop();
    }
}
