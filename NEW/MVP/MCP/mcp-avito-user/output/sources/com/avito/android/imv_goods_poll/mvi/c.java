package com.avito.android.imv_goods_poll.mvi;

import Y41.p;
import com.avito.android.imv_goods_poll.mvi.entity.ImvGoodsPollInternalAction;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ImvGoodsPollActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.imv_goods_poll.mvi.ImvGoodsPollActor$sendGoodsPollAnswers$1", f = "ImvGoodsPollActor.kt", i = {0, 0, 1}, l = {51, 53, 61, 64, 68}, m = "invokeSuspend", n = {"$this$flow", "slugs", "$this$flow"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super ImvGoodsPollInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f170678q;

    /* renamed from: r, reason: collision with root package name */
    public int f170679r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f170680s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f170681t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ fN.c f170682u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f170683v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, fN.c cVar, String str, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f170681t = bVar;
        this.f170682u = cVar;
        this.f170683v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f170681t, this.f170682u, this.f170683v, continuation);
        cVar.f170680s = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ImvGoodsPollInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.imv_goods_poll.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
