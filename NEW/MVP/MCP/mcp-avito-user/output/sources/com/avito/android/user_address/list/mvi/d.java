package com.avito.android.user_address.list.mvi;

import XG0.a;
import Y41.p;
import com.avito.android.geo_common.model.SetDefaultAddressResult;
import com.avito.android.user_address.list.mvi.entity.UserAddressListMviInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressListMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.list.mvi.UserAddressListMviActor$handle$1", f = "UserAddressListMviActor.kt", i = {0, 1, 2, 2}, l = {51, 52, 53, 66}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super UserAddressListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public SetDefaultAddressResult f307390q;

    /* renamed from: r, reason: collision with root package name */
    public int f307391r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f307392s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.b f307393t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f307394u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ XG0.d f307395v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a.b bVar, g gVar, XG0.d dVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f307393t = bVar;
        this.f307394u = gVar;
        this.f307395v = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f307393t, this.f307394u, this.f307395v, continuation);
        dVar.f307392s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.list.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
