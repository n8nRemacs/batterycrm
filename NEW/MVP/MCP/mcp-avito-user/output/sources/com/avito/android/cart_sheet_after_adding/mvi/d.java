package com.avito.android.cart_sheet_after_adding.mvi;

import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import fn.C40447a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CartSheetAfterAddingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.mvi.CartSheetAfterAddingActor$process$4", f = "CartSheetAfterAddingActor.kt", i = {0, 1, 2, 2}, l = {92, 93, 97, 98, 105}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSheetAfterAddingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C40447a f115360q;

    /* renamed from: r, reason: collision with root package name */
    public int f115361r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f115362s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ gn.e f115363t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f115364u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gn.e eVar, e eVar2, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f115363t = eVar;
        this.f115364u = eVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f115363t, this.f115364u, continuation);
        dVar.f115362s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CartSheetAfterAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[LOOP:0: B:33:0x00b6->B:35:0x00bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_sheet_after_adding.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
