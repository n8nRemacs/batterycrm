package com.avito.android.sx_address.list.mvi;

import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.mvi.entity.a;
import com.avito.android.sx_address.list.mvi.entity.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zA0.InterfaceC50429b;

/* compiled from: SxAddressListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListActor$invoke$2", f = "SxAddressListActor.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f293346q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f293347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f293348s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.d f293349t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x xVar, a.d dVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f293348s = xVar;
        this.f293349t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f293348s, this.f293349t, continuation);
        pVar.f293347r = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f293346q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f293347r;
            InterfaceC50429b interfaceC50429b = this.f293348s.f293382g;
            a.d dVar = this.f293349t;
            Long lZ02 = C43066x.z0(dVar.f293260a.f293121b);
            AddressItem addressItem = dVar.f293260a;
            interfaceC50429b.d(lZ02, addressItem.f293126g.f293136b.name(), addressItem.f293126g.f293138d);
            b.o oVar = new b.o(addressItem);
            this.f293346q = 1;
            if (interfaceC43172j.emit(oVar, this) == coroutine_suspended) {
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
