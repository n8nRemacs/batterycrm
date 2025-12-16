package com.avito.android.newcars_mark_model_filter.presentation;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.lib.design.input.Input;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import o30.InterfaceC44575a;

/* compiled from: NewCarsBrandModelFilterFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.newcars_mark_model_filter.presentation.NewCarsBrandModelFilterFragment$subscribeToBrandSelect$1", f = "NewCarsBrandModelFilterFragment.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f207307q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ NewCarsBrandModelFilterFragment f207308r;

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedId", "Lkotlin/G0;", "emit", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NewCarsBrandModelFilterFragment f207309b;

        public a(NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment) {
            this.f207309b = newCarsBrandModelFilterFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Long l12 = (Long) obj;
            if (l12 != null) {
                NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = this.f207309b;
                Input input = newCarsBrandModelFilterFragment.f207282m0;
                if (input == null) {
                    input = null;
                }
                Input.t(input, "", false, 6);
                newCarsBrandModelFilterFragment.f5().accept(new InterfaceC44575a.e(Collections.singletonList(l12)));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f207308r = newCarsBrandModelFilterFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f207308r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f207307q;
        if (i12 == 0) {
            C42729a0.b(obj);
            NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = this.f207308r;
            com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.e eVar = newCarsBrandModelFilterFragment.f207287r0;
            if (eVar == null) {
                eVar = null;
            }
            n2<Long> n2VarN0 = eVar.N0();
            a aVar = new a(newCarsBrandModelFilterFragment);
            this.f207307q = 1;
            if (n2VarN0.collect(aVar, this) == coroutine_suspended) {
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
