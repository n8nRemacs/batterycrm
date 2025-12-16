package androidx.window.layout;

import android.app.Activity;
import androidx.fragment.app.C22953k;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.internal.K;
import m2.InterfaceC43864a;

/* compiled from: WindowInfoTrackerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/m;", "Landroidx/window/layout/j;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43864a f55335b;

    /* compiled from: WindowInfoTrackerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Landroidx/window/layout/n;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<I0<? super n>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f55336q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f55337r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Activity f55339t;

        /* compiled from: WindowInfoTrackerImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.window.layout.m$a$a, reason: collision with other inner class name */
        public static final class C1947a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ m f55340l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C22953k f55341m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1947a(m mVar, C22953k c22953k) {
                super(0);
                this.f55340l = mVar;
                this.f55341m = c22953k;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f55340l.f55335b.a(this.f55341m);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f55339t = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = m.this.new a(this.f55339t, continuation);
            aVar.f55337r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super n> i02, Continuation<? super G0> continuation) {
            return ((a) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f55336q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.f55337r;
                C22953k c22953k = new C22953k(i02, 2);
                m mVar = m.this;
                mVar.f55335b.b(this.f55339t, new androidx.arch.core.executor.a(1), c22953k);
                C1947a c1947a = new C1947a(mVar, c22953k);
                this.f55336q = 1;
                if (F0.a(i02, c1947a, this) == coroutine_suspended) {
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

    public m(@Y61.k s sVar, @Y61.k InterfaceC43864a interfaceC43864a) {
        this.f55335b = interfaceC43864a;
    }

    @Y61.k
    public final InterfaceC43160i<n> b(@Y61.k Activity activity) {
        InterfaceC43160i interfaceC43160iD = C43175k.d(new a(activity, null));
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        return C43175k.I(K.f411877a, interfaceC43160iD);
    }
}
