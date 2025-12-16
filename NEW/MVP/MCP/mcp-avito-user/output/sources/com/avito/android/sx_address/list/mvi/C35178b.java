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
@DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListActor$invoke$11", f = "SxAddressListActor.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sx_address.list.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35178b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f293227q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f293228r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ListState f293229s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.C8903a f293230t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f293231u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35178b(ListState listState, a.C8903a c8903a, x xVar, Continuation<? super C35178b> continuation) {
        super(2, continuation);
        this.f293229s = listState;
        this.f293230t = c8903a;
        this.f293231u = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35178b c35178b = new C35178b(this.f293229s, this.f293230t, this.f293231u, continuation);
        c35178b.f293228r = obj;
        return c35178b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35178b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ArrayList arrayListC;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f293227q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f293228r;
            ListState listState = this.f293229s;
            List<AddressItem> list = listState.f293248e;
            a.C8903a c8903a = this.f293230t;
            if (list != null) {
                arrayListC = x.c(this.f293231u, list, listState.f293247d.f293176l, c8903a.f293257a);
            } else {
                arrayListC = null;
            }
            b.g gVar = new b.g(arrayListC, c8903a.f293257a);
            this.f293227q = 1;
            if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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
