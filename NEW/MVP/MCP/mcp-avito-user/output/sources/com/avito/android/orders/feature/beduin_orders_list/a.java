package com.avito.android.orders.feature.beduin_orders_list;

import Y41.p;
import Y61.k;
import Y61.l;
import Z40.a;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment;
import com.jakewharton.rxbinding4.recyclerview.n;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: BeduinOrdersFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment$setupLists$2", f = "BeduinOrdersFragment.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209999q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BeduinOrdersFragment f210000r;

    /* compiled from: BeduinOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment$setupLists$2$1", f = "BeduinOrdersFragment.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.orders.feature.beduin_orders_list.a$a, reason: collision with other inner class name */
    public static final class C6268a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210001q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ BeduinOrdersFragment f210002r;

        /* compiled from: BeduinOrdersFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.orders.feature.beduin_orders_list.a$a$a, reason: collision with other inner class name */
        public static final class C6269a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeduinOrdersFragment f210003b;

            public C6269a(BeduinOrdersFragment beduinOrdersFragment) {
                this.f210003b = beduinOrdersFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ((Number) obj).intValue();
                BeduinOrdersFragment.a aVar = BeduinOrdersFragment.f209960E0;
                this.f210003b.s5().accept(a.b.f19857a);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6268a(BeduinOrdersFragment beduinOrdersFragment, Continuation<? super C6268a> continuation) {
            super(2, continuation);
            this.f210002r = beduinOrdersFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C6268a(this.f210002r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C6268a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f210001q;
            if (i12 == 0) {
                C42729a0.b(obj);
                BeduinOrdersFragment.a aVar = BeduinOrdersFragment.f209960E0;
                BeduinOrdersFragment beduinOrdersFragment = this.f210002r;
                InterfaceC43160i interfaceC43160iA = y.a(n.b(beduinOrdersFragment.r5()));
                e.a aVar2 = kotlin.time.e.f410651c;
                InterfaceC43160i interfaceC43160iF = com.avito.android.arch.mvi.utils.h.f(interfaceC43160iA, kotlin.time.g.g(500, DurationUnit.f410633e));
                C6269a c6269a = new C6269a(beduinOrdersFragment);
                this.f210001q = 1;
                if (interfaceC43160iF.collect(c6269a, this) == coroutine_suspended) {
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
    public a(BeduinOrdersFragment beduinOrdersFragment, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f210000r = beduinOrdersFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f210000r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209999q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            BeduinOrdersFragment beduinOrdersFragment = this.f210000r;
            C6268a c6268a = new C6268a(beduinOrdersFragment, null);
            this.f209999q = 1;
            if (C23056p0.b(beduinOrdersFragment, state, c6268a, this) == coroutine_suspended) {
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
