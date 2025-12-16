package com.avito.android.select.new_metro.mvi;

import androidx.compose.runtime.internal.P;
import androidx.view.N0;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroState;
import com.huawei.hms.adapter.internal.AvailableCode;
import iq0.InterfaceC42091a;
import iq0.InterfaceC42092b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SelectMetroViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/t;", "Lcom/avito/android/arch/mvi/android/j;", "Liq0/a;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroState;", "Liq0/b;", "b", "c", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t extends com.avito.android.arch.mvi.android.j<InterfaceC42091a, SelectMetroState, InterfaceC42092b> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final e2 f266306N;

    /* compiled from: SelectMetroViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.new_metro.mvi.SelectMetroViewModel$1", f = "SelectMetroViewModel.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f266307q;

        /* compiled from: SelectMetroViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.select.new_metro.mvi.t$a$a, reason: collision with other inner class name */
        public static final class C7946a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f266309b;

            public C7946a(t tVar) {
                this.f266309b = tVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f266309b.accept(new InterfaceC42091a.i((String) obj));
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return t.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f266307q;
            if (i12 == 0) {
                C42729a0.b(obj);
                t tVar = t.this;
                InterfaceC43160i interfaceC43160iN = C43175k.n(C43175k.r(tVar.f266306N), 500L);
                C7946a c7946a = new C7946a(tVar);
                this.f266307q = 1;
                if (interfaceC43160iN.collect(c7946a, this) == coroutine_suspended) {
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

    /* compiled from: SelectMetroViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/t$b;", "", "<init>", "()V", "", "SEARCH_DEBOUNCE", "J", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SelectMetroViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/t$c;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        @Y61.k
        t create();
    }

    static {
        new b(null);
    }

    @i31.c
    public t(@Y61.k j jVar) {
        super(jVar, null, 2, null);
        this.f266306N = f2.b(0, 1, null, 5);
        C43259k.d(N0.a(this), null, null, new a(null), 3);
    }
}
