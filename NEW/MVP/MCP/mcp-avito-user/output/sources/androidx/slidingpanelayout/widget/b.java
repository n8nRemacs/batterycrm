package androidx.slidingpanelayout.widget;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.view.animation.PathInterpolator;
import androidx.slidingpanelayout.widget.a;
import androidx.transition.C23494e;
import androidx.transition.Q;
import androidx.window.layout.c;
import androidx.window.layout.n;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FoldingFeatureObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f54504q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.slidingpanelayout.widget.a f54505r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f54506s;

    /* compiled from: Collect.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/A", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements InterfaceC43172j<c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.slidingpanelayout.widget.a f54507b;

        public a(androidx.slidingpanelayout.widget.a aVar) {
            this.f54507b = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @l
        public final Object emit(c cVar, @k Continuation<? super G0> continuation) {
            G0 g02;
            c cVar2 = cVar;
            a.InterfaceC1924a interfaceC1924a = this.f54507b.f54503d;
            if (interfaceC1924a == null) {
                g02 = null;
            } else {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f54487w = cVar2;
                C23494e c23494e = new C23494e();
                c23494e.f54667d = 300L;
                c23494e.f54668e = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
                Q.a(slidingPaneLayout, c23494e);
                slidingPaneLayout.requestLayout();
                g02 = G0.f406611a;
            }
            return g02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g02 : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.slidingpanelayout.widget.b$b, reason: collision with other inner class name */
    public static final class C1925b implements InterfaceC43160i<c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f54508b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.slidingpanelayout.widget.a f54509c;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "kotlinx/coroutines/flow/q1$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: androidx.slidingpanelayout.widget.b$b$a */
        public static final class a implements InterfaceC43172j<n> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f54510b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ androidx.slidingpanelayout.widget.a f54511c;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
            /* renamed from: androidx.slidingpanelayout.widget.b$b$a$a, reason: collision with other inner class name */
            public static final class C1926a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f54512q;

                /* renamed from: r, reason: collision with root package name */
                public int f54513r;

                public C1926a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f54512q = obj;
                    this.f54513r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, androidx.slidingpanelayout.widget.a aVar) {
                this.f54510b = interfaceC43172j;
                this.f54511c = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r7v4 */
            /* JADX WARN: Type inference failed for: r7v5 */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(androidx.window.layout.n r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.slidingpanelayout.widget.b.C1925b.a.C1926a
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.slidingpanelayout.widget.b$b$a$a r0 = (androidx.slidingpanelayout.widget.b.C1925b.a.C1926a) r0
                    int r1 = r0.f54513r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f54513r = r1
                    goto L18
                L13:
                    androidx.slidingpanelayout.widget.b$b$a$a r0 = new androidx.slidingpanelayout.widget.b$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f54512q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f54513r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L6c
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    androidx.window.layout.n r6 = (androidx.window.layout.n) r6
                    androidx.slidingpanelayout.widget.a r7 = r5.f54511c
                    r7.getClass()
                    java.lang.Object r6 = r6.f55342a
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.Iterator r6 = r6.iterator()
                L43:
                    boolean r7 = r6.hasNext()
                    r2 = 0
                    if (r7 == 0) goto L56
                    java.lang.Object r7 = r6.next()
                    r4 = r7
                    androidx.window.layout.a r4 = (androidx.window.layout.a) r4
                    boolean r4 = r4 instanceof androidx.window.layout.c
                    if (r4 == 0) goto L43
                    goto L57
                L56:
                    r7 = r2
                L57:
                    boolean r6 = r7 instanceof androidx.window.layout.c
                    if (r6 == 0) goto L5e
                    r2 = r7
                    androidx.window.layout.c r2 = (androidx.window.layout.c) r2
                L5e:
                    if (r2 != 0) goto L61
                    goto L6c
                L61:
                    r0.f54513r = r3
                    kotlinx.coroutines.flow.j r6 = r5.f54510b
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6c
                    return r1
                L6c:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.b.C1925b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C1925b(InterfaceC43160i interfaceC43160i, androidx.slidingpanelayout.widget.a aVar) {
            this.f54508b = interfaceC43160i;
            this.f54509c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super c> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f54508b.collect(new a(interfaceC43172j, this.f54509c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.slidingpanelayout.widget.a aVar, Activity activity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f54505r = aVar;
        this.f54506s = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f54505r, this.f54506s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f54504q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.slidingpanelayout.widget.a aVar = this.f54505r;
            InterfaceC43160i interfaceC43160iR = C43175k.r(new C1925b(aVar.f54500a.b(this.f54506s), aVar));
            a aVar2 = new a(aVar);
            this.f54504q = 1;
            if (interfaceC43160iR.collect(aVar2, this) == coroutine_suspended) {
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
