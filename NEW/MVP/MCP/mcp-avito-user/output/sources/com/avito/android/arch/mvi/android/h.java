package com.avito.android.arch.mvi.android;

import Y41.p;
import android.os.Parcelable;
import androidx.view.C23060r0;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.arch.mvi.q;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: MviSaveStateViewModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0005*\u00020\u00012\u00020\u00062\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007:\u0001\b¨\u0006\t"}, d2 = {"Lcom/avito/android/arch/mvi/android/h;", "", "Action", "Landroid/os/Parcelable;", "State", "OneTimeEvent", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "a", "_common_mvi-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class h<Action, State extends Parcelable, OneTimeEvent> extends M0 implements k<Action, State, OneTimeEvent> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final q<Action, ?, State, OneTimeEvent> f91883E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f91884J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final i2 f91885K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final String f91886L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91887M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91888N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91889O;

    /* compiled from: MviSaveStateViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/android/h$a;", "", "<init>", "()V", "", "KEY_STATE", "Ljava/lang/String;", "_common_mvi-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MviSaveStateViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0000*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Action", "Landroid/os/Parcelable;", "State", "OneTimeEvent", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.android.MviSaveStateViewModel$accept$1", f = "MviSaveStateViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91890q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ h<Action, State, OneTimeEvent> f91891r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Action f91892s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h<Action, State, OneTimeEvent> hVar, Action action, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f91891r = hVar;
            this.f91892s = action;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f91891r, this.f91892s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f91890q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) this.f91891r.f91887M.getValue();
                this.f91890q = 1;
                if (cVar.emit(this.f91892s, this) == coroutine_suspended) {
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

    /* compiled from: MviSaveStateViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.arch.mvi.android.MviSaveStateViewModel", f = "MviSaveStateViewModel.kt", i = {}, l = {75}, m = "collectState", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f91893q;

        /* renamed from: s, reason: collision with root package name */
        public int f91895s;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f91893q = obj;
            this.f91895s |= BeduinInputModel.MIN_TEXT_VERSION;
            return h.this.ke(null, this);
        }
    }

    /* compiled from: MviSaveStateViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Action", "Landroid/os/Parcelable;", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/i;", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<InterfaceC43160i<? extends OneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h<Action, State, OneTimeEvent> f91896l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h<Action, State, OneTimeEvent> hVar) {
            super(0);
            this.f91896l = hVar;
        }

        @Override // Y41.a
        public final Object invoke() {
            return ((com.avito.android.arch.mvi.c) this.f91896l.f91887M.getValue()).f91928q;
        }
    }

    /* compiled from: MviSaveStateViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Action", "Landroid/os/Parcelable;", "State", "OneTimeEvent", "Lcom/avito/android/arch/mvi/c;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.arch.mvi.c<Action, ? extends Object, State, OneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h<Action, State, OneTimeEvent> f91897l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h<Action, State, OneTimeEvent> hVar) {
            super(0);
            this.f91897l = hVar;
        }

        @Override // Y41.a
        public final Object invoke() {
            h<Action, State, OneTimeEvent> hVar = this.f91897l;
            return hVar.f91883E.a((Parcelable) hVar.f91884J.b(hVar.f91886L), N0.a(hVar));
        }
    }

    /* compiled from: MviSaveStateViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Action", "Landroid/os/Parcelable;", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/n2;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<n2<? extends State>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h<Action, State, OneTimeEvent> f91898l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h<Action, State, OneTimeEvent> hVar) {
            super(0);
            this.f91898l = hVar;
        }

        @Override // Y41.a
        public final Object invoke() {
            h<Action, State, OneTimeEvent> hVar = this.f91898l;
            return C43175k.U(new C43197r1(new i(hVar, null), (com.avito.android.arch.mvi.c) hVar.f91887M.getValue()), N0.a(hVar), hVar.f91885K, ((com.avito.android.arch.mvi.c) hVar.f91887M.getValue()).f91929r.get());
        }
    }

    static {
        new a(null);
    }

    public h(q qVar, C23060r0 c23060r0, i2 i2Var, int i12, C42822w c42822w) {
        this(qVar, c23060r0, (i12 & 4) != 0 ? com.avito.android.arch.mvi.android.a.f91843a : i2Var);
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Action action) {
        C43259k.d(N0.a(this), null, null, new b(this, action, null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<OneTimeEvent> getEvents() {
        return (InterfaceC43160i) this.f91889O.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<State> getState() {
        return (n2) this.f91888N.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ke(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super State> r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.arch.mvi.android.h.c
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.arch.mvi.android.h$c r0 = (com.avito.android.arch.mvi.android.h.c) r0
            int r1 = r0.f91895s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91895s = r1
            goto L1a
        L13:
            com.avito.android.arch.mvi.android.h$c r0 = new com.avito.android.arch.mvi.android.h$c
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f91893q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f91895s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.C42729a0.b(r6)
            goto L43
        L33:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.flow.n2 r6 = r4.getState()
            r0.f91895s = r3
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.android.h.ke(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public h(@Y61.k q<Action, ?, State, OneTimeEvent> qVar, @Y61.k C23060r0 c23060r0, @Y61.k i2 i2Var) {
        this.f91883E = qVar;
        this.f91884J = c23060r0;
        this.f91885K = i2Var;
        this.f91886L = AK.c.s(new StringBuilder(), qVar.f92005a, "_state");
        this.f91887M = C42727D.c(new e(this));
        this.f91888N = C42727D.c(new f(this));
        this.f91889O = C42727D.c(new d(this));
        i2.f411430a.getClass();
        if (L.f(i2Var, i2.a.f411432b) ? true : i2Var instanceof com.avito.android.arch.mvi.android.c) {
            getState().getValue();
        }
    }
}
