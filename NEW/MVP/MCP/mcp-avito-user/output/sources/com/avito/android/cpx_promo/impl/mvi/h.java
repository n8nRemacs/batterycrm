package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.cpx_promo.impl.interactor.model.CpxPromo;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.mvi.CpxPromoActor$processReload$1", f = "CpxPromoActor.kt", i = {0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6}, l = {354, 355, 358, 361, 362, 363, 372, 379, 383}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "cpxPromo", "$this$flow", "cpxPromo", "isAuto", "$this$flow", "cpxPromo", "isAuto", "$this$flow", "cpxPromo", "isAuto", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0"})
/* loaded from: classes12.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CpxPromo f127179q;

    /* renamed from: r, reason: collision with root package name */
    public int f127180r;

    /* renamed from: s, reason: collision with root package name */
    public int f127181s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f127182t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f127183u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f127183u = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f127183u, continuation);
        hVar.f127182t = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.impl.mvi.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
