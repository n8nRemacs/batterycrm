package com.avito.beduin.v2.repository.screen_lifecycle;

import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.beduin.v2.repository.screen_lifecycle.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: ScreenLifecycleClientImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/m;", "Landroidx/lifecycle/L;", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f338324b;

    /* compiled from: ScreenLifecycleClientImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f338325a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f338325a = iArr;
        }
    }

    /* compiled from: ScreenLifecycleClientImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.repository.screen_lifecycle.ScreenLifecycleClientImpl$lifecycleObserver$1$onStateChanged$1", f = "ScreenLifecycleClientImpl.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f338326q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l f338327r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.Event f338328s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, Lifecycle.Event event, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f338327r = lVar;
            this.f338328s = event;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f338327r, this.f338328s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f338326q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = this.f338327r.f338319e;
                switch (l.a.f338323a[this.f338328s.ordinal()]) {
                    case 1:
                        obj2 = e.f338303a;
                        break;
                    case 2:
                        obj2 = u.f338336a;
                        break;
                    case 3:
                        obj2 = com.avito.beduin.v2.repository.screen_lifecycle.a.f338299a;
                        break;
                    case 4:
                        obj2 = d.f338302a;
                        break;
                    case 5:
                        obj2 = c.f338301a;
                        break;
                    case 6:
                        obj2 = t.f338335a;
                        break;
                    case 7:
                        throw new IllegalStateException("On any cannot be used");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                this.f338326q = 1;
                if (e2Var.emit(obj2, this) == coroutine_suspended) {
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

    public m(l lVar) {
        this.f338324b = lVar;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Lifecycle.Event event) {
        Lifecycle.Event event2;
        l lVar = this.f338324b;
        String strA = lVar.f338316b.a(interfaceC22983P);
        r rVar = lVar.f338317c;
        com.avito.beduin.v2.repository.screen_lifecycle.b bVar = rVar.get(strA);
        if (bVar == null) {
            androidx.view.n nVarB = lVar.b();
            if (nVarB == null) {
                return;
            }
            if (!nVarB.isChangingConfigurations()) {
                C43259k.d(lVar.f338320f, null, null, new b(lVar, event, null), 3);
                return;
            } else {
                if (event != Lifecycle.Event.ON_CREATE) {
                    if (o.f338333a.contains(event)) {
                        rVar.a(strA, new com.avito.beduin.v2.repository.screen_lifecycle.b(event));
                        return;
                    }
                    l.k(this.f338324b, "Config changes cannot be started from " + event + " state", interfaceC22983P, event, strA, bVar);
                    return;
                }
                return;
            }
        }
        int[] iArr = a.f338325a;
        Lifecycle.Event event3 = bVar.f338300a;
        int i12 = iArr[event3.ordinal()];
        if (i12 == 1) {
            event2 = Lifecycle.Event.ON_RESUME;
        } else if (i12 == 2) {
            event2 = Lifecycle.Event.ON_START;
        } else {
            if (i12 != 3) {
                l.k(this.f338324b, "Config changes cannot be started from " + event3 + " state", interfaceC22983P, event, strA, bVar);
                return;
            }
            event2 = Lifecycle.Event.ON_CREATE;
        }
        if (event2 == event) {
            rVar.remove(strA);
        }
    }
}
