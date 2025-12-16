package com.avito.android.sx_address.selectaddresslist.mvi;

import com.avito.android.sx_address.selectaddresslist.domain.SelectListScreenData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectAddressListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LUA0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.selectaddresslist.mvi.SelectAddressListActor$invoke$5", f = "SelectAddressListActor.kt", i = {0, 1, 2, 2, 3}, l = {66, 67, 69, 70, 71}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "data", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UA0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public SelectListScreenData f294104q;

    /* renamed from: r, reason: collision with root package name */
    public int f294105r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f294106s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f294107t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f294107t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f294107t, continuation);
        eVar.f294106s = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UA0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0161 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.selectaddresslist.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
