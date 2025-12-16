package com.avito.android.arch.mvi.android;

import Y41.p;
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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: MviViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/android/j;", "", "Action", "State", "OneTimeEvent", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "_common_mvi-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class j<Action, State, OneTimeEvent> extends M0 implements k<Action, State, OneTimeEvent> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final q<Action, ?, State, OneTimeEvent> f91901E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final i2 f91902J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91903K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91904L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91905M;

    /* compiled from: MviViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Action", "State", "OneTimeEvent", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.android.MviViewModel$accept$1", f = "MviViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91906q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ j<Action, State, OneTimeEvent> f91907r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Action f91908s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j<Action, State, OneTimeEvent> jVar, Action action, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f91907r = jVar;
            this.f91908s = action;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f91907r, this.f91908s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f91906q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c<Action, ? extends Object, State, OneTimeEvent> cVarMe = this.f91907r.me();
                this.f91906q = 1;
                if (cVarMe.emit(this.f91908s, this) == coroutine_suspended) {
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

    /* compiled from: MviViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.arch.mvi.android.MviViewModel", f = "MviViewModel.kt", i = {}, l = {55}, m = "collectState", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f91909q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ j<Action, State, OneTimeEvent> f91910r;

        /* renamed from: s, reason: collision with root package name */
        public int f91911s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j<Action, State, OneTimeEvent> jVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f91910r = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f91909q = obj;
            this.f91911s |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f91910r.le(null, this);
        }
    }

    /* compiled from: MviViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Action", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/i;", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<InterfaceC43160i<? extends OneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j<Action, State, OneTimeEvent> f91912l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j<Action, State, OneTimeEvent> jVar) {
            super(0);
            this.f91912l = jVar;
        }

        @Override // Y41.a
        public final Object invoke() {
            return this.f91912l.me().f91928q;
        }
    }

    /* compiled from: MviViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Action", "State", "OneTimeEvent", "Lcom/avito/android/arch/mvi/c;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.arch.mvi.c<Action, ? extends Object, State, OneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j<Action, State, OneTimeEvent> f91913l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j<Action, State, OneTimeEvent> jVar) {
            super(0);
            this.f91913l = jVar;
        }

        @Override // Y41.a
        public final Object invoke() {
            j<Action, State, OneTimeEvent> jVar = this.f91913l;
            return q.b(jVar.f91901E, null, N0.a(jVar), 1);
        }
    }

    /* compiled from: MviViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Action", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/n2;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<n2<? extends State>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j<Action, State, OneTimeEvent> f91914l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j<Action, State, OneTimeEvent> jVar) {
            super(0);
            this.f91914l = jVar;
        }

        @Override // Y41.a
        public final Object invoke() {
            j<Action, State, OneTimeEvent> jVar = this.f91914l;
            return C43175k.U(jVar.me(), N0.a(jVar), jVar.f91902J, jVar.me().f91929r.get());
        }
    }

    public j(q qVar, i2 i2Var, int i12, C42822w c42822w) {
        this(qVar, (i12 & 2) != 0 ? com.avito.android.arch.mvi.android.a.f91843a : i2Var);
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Action action) {
        C43259k.d(N0.a(this), null, null, new a(this, action, null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<OneTimeEvent> getEvents() {
        return (InterfaceC43160i) this.f91905M.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<State> getState() {
        return (n2) this.f91904L.getValue();
    }

    @Y61.l
    public final Object ke(@Y61.k InterfaceC43172j<? super OneTimeEvent> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        Object objCollect = me().f91928q.collect(interfaceC43172j, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object le(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super State> r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.arch.mvi.android.j.b
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.arch.mvi.android.j$b r0 = (com.avito.android.arch.mvi.android.j.b) r0
            int r1 = r0.f91911s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91911s = r1
            goto L18
        L13:
            com.avito.android.arch.mvi.android.j$b r0 = new com.avito.android.arch.mvi.android.j$b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f91909q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f91911s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.C42729a0.b(r6)
            goto L41
        L31:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.flow.n2 r6 = r4.getState()
            r0.f91911s = r3
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.android.j.le(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.avito.android.arch.mvi.c<Action, ? extends Object, State, OneTimeEvent> me() {
        return (com.avito.android.arch.mvi.c) this.f91903K.getValue();
    }

    public j(@Y61.k q<Action, ?, State, OneTimeEvent> qVar, @Y61.k i2 i2Var) {
        this.f91901E = qVar;
        this.f91902J = i2Var;
        this.f91903K = C42727D.c(new d(this));
        this.f91904L = C42727D.c(new e(this));
        this.f91905M = C42727D.c(new c(this));
        i2.f411430a.getClass();
        if (L.f(i2Var, i2.a.f411432b) ? true : i2Var instanceof com.avito.android.arch.mvi.android.c) {
            getState().getValue();
        }
    }
}
