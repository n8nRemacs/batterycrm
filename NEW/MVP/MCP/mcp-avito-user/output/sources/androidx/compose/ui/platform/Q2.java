package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.Recomposer;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC43271q;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/Q2;", "Landroidx/lifecycle/L;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q2 implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43238h f41238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.J1 f41239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Recomposer f41240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.h<F1> f41241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f41242f;

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41243a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f41243a = iArr;
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {388}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f41244q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f41245r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l0.h<F1> f41246s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Recomposer f41247t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f41248u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Q2 f41249v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ View f41250w;

        /* compiled from: WindowRecomposer.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f41251q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.n2<Float> f41252r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ F1 f41253s;

            /* compiled from: WindowRecomposer.android.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "Lkotlin/G0;", "emit", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.ui.platform.Q2$b$a$a, reason: collision with other inner class name */
            public static final class C1673a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ F1 f41254b;

                public C1673a(F1 f12) {
                    this.f41254b = f12;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    ((C22040c3) this.f41254b.f41114b).S6(((Number) obj).floatValue());
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.flow.n2<Float> n2Var, F1 f12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f41252r = n2Var;
                this.f41253s = f12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f41252r, this.f41253s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f41251q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C1673a c1673a = new C1673a(this.f41253s);
                    this.f41251q = 1;
                    if (this.f41252r.collect(c1673a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<F1> hVar, Recomposer recomposer, InterfaceC22983P interfaceC22983P, Q2 q22, View view, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f41246s = hVar;
            this.f41247t = recomposer;
            this.f41248u = interfaceC22983P;
            this.f41249v = q22;
            this.f41250w = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f41246s, this.f41247t, this.f41248u, this.f41249v, this.f41250w, continuation);
            bVar.f41245r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f41244q
                androidx.lifecycle.P r2 = r10.f41248u
                r3 = 0
                androidx.compose.ui.platform.Q2 r4 = r10.f41249v
                r5 = 1
                if (r1 == 0) goto L23
                if (r1 != r5) goto L1b
                java.lang.Object r0 = r10.f41245r
                kotlinx.coroutines.N0 r0 = (kotlinx.coroutines.N0) r0
                kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L18
                goto L6e
            L18:
                r11 = move-exception
                goto L83
            L1b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L23:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f41245r
                kotlinx.coroutines.T r11 = (kotlinx.coroutines.T) r11
                kotlin.jvm.internal.l0$h<androidx.compose.ui.platform.F1> r1 = r10.f41246s     // Catch: java.lang.Throwable -> L5c
                T r1 = r1.f406842b     // Catch: java.lang.Throwable -> L5c
                androidx.compose.ui.platform.F1 r1 = (androidx.compose.ui.platform.F1) r1     // Catch: java.lang.Throwable -> L5c
                if (r1 == 0) goto L5f
                android.view.View r6 = r10.f41250w     // Catch: java.lang.Throwable -> L5c
                android.content.Context r6 = r6.getContext()     // Catch: java.lang.Throwable -> L5c
                android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L5c
                kotlinx.coroutines.flow.n2 r6 = androidx.compose.ui.platform.T2.a(r6)     // Catch: java.lang.Throwable -> L5c
                java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L5c
                java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L5c
                float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> L5c
                androidx.compose.runtime.v1 r8 = r1.f41114b     // Catch: java.lang.Throwable -> L5c
                androidx.compose.runtime.c3 r8 = (androidx.compose.runtime.C22040c3) r8     // Catch: java.lang.Throwable -> L5c
                r8.S6(r7)     // Catch: java.lang.Throwable -> L5c
                androidx.compose.ui.platform.Q2$b$a r7 = new androidx.compose.ui.platform.Q2$b$a     // Catch: java.lang.Throwable -> L5c
                r7.<init>(r6, r1, r3)     // Catch: java.lang.Throwable -> L5c
                r1 = 3
                kotlinx.coroutines.N0 r11 = kotlinx.coroutines.C43259k.d(r11, r3, r3, r7, r1)     // Catch: java.lang.Throwable -> L5c
                goto L60
            L5c:
                r11 = move-exception
                r0 = r3
                goto L83
            L5f:
                r11 = r3
            L60:
                androidx.compose.runtime.Recomposer r1 = r10.f41247t     // Catch: java.lang.Throwable -> L81
                r10.f41245r = r11     // Catch: java.lang.Throwable -> L81
                r10.f41244q = r5     // Catch: java.lang.Throwable -> L81
                java.lang.Object r1 = r1.J(r10)     // Catch: java.lang.Throwable -> L81
                if (r1 != r0) goto L6d
                return r0
            L6d:
                r0 = r11
            L6e:
                if (r0 == 0) goto L73
                r0.c(r3)
            L73:
                androidx.lifecycle.Lifecycle r11 = r2.getLifecycle()
                r11.c(r4)
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            L7d:
                r9 = r0
                r0 = r11
                r11 = r9
                goto L83
            L81:
                r0 = move-exception
                goto L7d
            L83:
                if (r0 == 0) goto L88
                r0.c(r3)
            L88:
                androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
                r0.c(r4)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.Q2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Q2(C43238h c43238h, androidx.compose.runtime.J1 j12, Recomposer recomposer, l0.h hVar, View view) {
        this.f41238b = c43238h;
        this.f41239c = j12;
        this.f41240d = recomposer;
        this.f41241e = hVar;
        this.f41242f = view;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(InterfaceC22983P interfaceC22983P, Lifecycle.Event event) {
        boolean z12;
        int i12 = a.f41243a[event.ordinal()];
        InterfaceC43271q<kotlin.G0> interfaceC43271qZ = null;
        if (i12 == 1) {
            C43259k.d(this.f41238b, null, CoroutineStart.f410683e, new b(this.f41241e, this.f41240d, interfaceC22983P, this, this.f41242f, null), 1);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    return;
                }
                this.f41240d.x();
                return;
            } else {
                Recomposer recomposer = this.f41240d;
                synchronized (recomposer.f38109b) {
                    recomposer.f38127t = true;
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                }
                return;
            }
        }
        androidx.compose.runtime.J1 j12 = this.f41239c;
        if (j12 != null) {
            androidx.compose.runtime.Q0 q02 = j12.f37989c;
            synchronized (q02.f38096a) {
                try {
                    synchronized (q02.f38096a) {
                        z12 = q02.f38099d;
                    }
                    if (!z12) {
                        ArrayList arrayList = q02.f38097b;
                        q02.f38097b = q02.f38098c;
                        q02.f38098c = arrayList;
                        q02.f38099d = true;
                        int size = arrayList.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            Continuation continuation = (Continuation) arrayList.get(i13);
                            int i14 = kotlin.Z.f406624c;
                            continuation.resumeWith(kotlin.G0.f406611a);
                        }
                        arrayList.clear();
                        kotlin.G0 g03 = kotlin.G0.f406611a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Recomposer recomposer2 = this.f41240d;
        synchronized (recomposer2.f38109b) {
            if (recomposer2.f38127t) {
                recomposer2.f38127t = false;
                interfaceC43271qZ = recomposer2.z();
            }
        }
        if (interfaceC43271qZ != null) {
            int i15 = kotlin.Z.f406624c;
            interfaceC43271qZ.resumeWith(kotlin.G0.f406611a);
        }
    }
}
