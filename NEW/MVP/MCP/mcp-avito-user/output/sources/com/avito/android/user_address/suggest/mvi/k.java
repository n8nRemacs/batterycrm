package com.avito.android.user_address.suggest.mvi;

import com.avito.android.geo_common.model.CoordsByAddressResult;
import com.avito.android.user_address.suggest.mvi.f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressSuggestMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviActor$handle$4", f = "UserAddressSuggestMviActor.kt", i = {0, 1, 2, 2, 3}, l = {74, 76, 77, 78, 85}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes4.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressSuggestMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CoordsByAddressResult f308124q;

    /* renamed from: r, reason: collision with root package name */
    public int f308125r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f308126s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserAddressSuggestMviState f308127t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f.c f308128u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f308129v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(UserAddressSuggestMviState userAddressSuggestMviState, f.c cVar, g gVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f308127t = userAddressSuggestMviState;
        this.f308128u = cVar;
        this.f308129v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f308127t, this.f308128u, this.f308129v, continuation);
        kVar.f308126s = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressSuggestMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.suggest.mvi.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
