package com.avito.android.vas_planning.balance_lack;

import Y41.p;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.V2;
import com.avito.android.vas_planning.balance_lack.j;
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

/* compiled from: VasPlanBalanceLackViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.vas_planning.balance_lack.VasPlanBalanceLackViewModel$getBalanceLackDetails$1", f = "VasPlanBalanceLackViewModel.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class k extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f322236q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f322237r;

    /* compiled from: VasPlanBalanceLackViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/vas_planning/balance_lack/j$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/vas_planning/balance_lack/j$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_planning.balance_lack.VasPlanBalanceLackViewModel$getBalanceLackDetails$1$newState$1", f = "VasPlanBalanceLackViewModel.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super j.a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f322238q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ j f322239r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f322239r = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f322239r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super j.a> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f322238q;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    YL0.a aVar = this.f322239r.f322222J;
                    this.f322238q = 1;
                    obj = aVar.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                TypedResult typedResult = (TypedResult) obj;
                if (typedResult instanceof TypedResult.Error) {
                    return new j.a.b(((TypedResult.Error) typedResult).getError().getF244063c());
                }
                if (!(typedResult instanceof TypedResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                String title = ((ZL0.a) ((TypedResult.Success) typedResult).getResult()).getTitle();
                AttributedText description = ((ZL0.a) ((TypedResult.Success) typedResult).getResult()).getDescription();
                ZL0.b action = ((ZL0.a) ((TypedResult.Success) typedResult).getResult()).getAction();
                return new j.a.C9960a(title, description, action != null ? new j.a.C9960a.C9961a(action.getTitle(), action.getUri()) : null);
            } catch (Exception e12) {
                V2.f318762a.f(e12);
                return new j.a.b(null, 1, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f322237r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f322237r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f322236q;
        j jVar = this.f322237r;
        if (i12 == 0) {
            C42729a0.b(obj);
            jVar.f322225M.postValue(j.a.c.f322235a);
            kotlinx.coroutines.scheduling.b bVarA = jVar.f322223K.a();
            a aVar = new a(jVar, null);
            this.f322236q = 1;
            obj = C43259k.g(bVarA, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        jVar.f322225M.postValue((j.a) obj);
        return G0.f406611a;
    }
}
