package com.avito.android.sx_address.list.mvi;

import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.mvi.entity.ListState;
import com.avito.android.sx_address.list.mvi.entity.a;
import com.avito.android.sx_address.list.mvi.entity.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListActor$invoke$9", f = "SxAddressListActor.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class w extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f293371q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f293372r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ListState f293373s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.s f293374t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f293375u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ListState listState, a.s sVar, x xVar, Continuation<? super w> continuation) {
        super(2, continuation);
        this.f293373s = listState;
        this.f293374t = sVar;
        this.f293375u = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        w wVar = new w(this.f293373s, this.f293374t, this.f293375u, continuation);
        wVar.f293372r = obj;
        return wVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((w) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ArrayList arrayListC;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f293371q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f293372r;
            ListState listState = this.f293373s;
            List<AddressItem> list = listState.f293248e;
            a.s sVar = this.f293374t;
            if (list != null) {
                arrayListC = x.c(this.f293375u, list, sVar.f293275a, listState.f293247d.f293178n);
            } else {
                arrayListC = null;
            }
            b.h hVar = new b.h(arrayListC, sVar.f293275a);
            this.f293371q = 1;
            if (interfaceC43172j.emit(hVar, this) == coroutine_suspended) {
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
