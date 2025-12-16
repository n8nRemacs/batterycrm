package com.avito.android.sx_address.list.mvi;

import com.avito.android.sx_address.list.mvi.entity.ListState;
import com.avito.android.sx_address.list.mvi.entity.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListActor$invoke$12", f = "SxAddressListActor.kt", i = {}, l = {168, 170}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sx_address.list.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35179c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f293232q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f293233r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ListState f293234s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f293235t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35179c(ListState listState, x xVar, Continuation<? super C35179c> continuation) {
        super(2, continuation);
        this.f293234s = listState;
        this.f293235t = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35179c c35179c = new C35179c(this.f293234s, this.f293235t, continuation);
        c35179c.f293233r = obj;
        return c35179c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35179c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f293232q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f293233r;
            String str = this.f293234s.f293247d.f293180p;
            if (str == null || C43066x.K(str)) {
                b.e eVar = b.e.f293281a;
                this.f293232q = 2;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                b.p pVar = new b.p(str);
                this.f293232q = 1;
                if (interfaceC43172j.emit(pVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f293235t.f293383h.b();
        return G0.f406611a;
    }
}
