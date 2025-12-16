package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import com.avito.android.delivery_tarifikator.domain.I;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TarifikatorMainActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.TarifikatorMainActor$process$5", f = "TarifikatorMainActor.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TarifikatorMainInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f135671q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f135672r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f135673s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f135673s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f135673s, continuation);
        jVar.f135672r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TarifikatorMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f135671q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f135672r;
            b bVar = this.f135673s;
            I iD2 = bVar.f135615c.d();
            if (iD2 instanceof I.b) {
                InterfaceC43160i<TarifikatorMainInternalAction> interfaceC43160iC = bVar.f135613a.c(((I.b) iD2).f135244a);
                this.f135671q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
