package com.avito.android.sx_address.selectaddresslist.mvi;

import UA0.a;
import UA0.b;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectAddressListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LUA0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.selectaddresslist.mvi.SelectAddressListActor$invoke$2", f = "SelectAddressListActor.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UA0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f294094q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f294095r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a.f f294096s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a.f fVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f294096s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f294096s, continuation);
        bVar.f294095r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UA0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f294094q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f294095r;
            b.a aVar = new b.a(AddressListViewItem.a(this.f294096s.f16248a, true, false, 223));
            this.f294094q = 1;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
