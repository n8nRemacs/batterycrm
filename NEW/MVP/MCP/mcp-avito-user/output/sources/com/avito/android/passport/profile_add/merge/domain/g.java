package com.avito.android.passport.profile_add.merge.domain;

import K50.f;
import Y41.p;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PassportAccountsMergeInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.domain.PassportAccountsMergeInteractorImpl$mergeFinish$1", f = "PassportAccountsMergeInteractor.kt", i = {0, 1, 2, 2, 5, 5}, l = {242, 243, 248, 250, 252, 255, 256, 266, 275}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class g extends SuspendLambda implements p<InterfaceC43172j<? super MergeFinishInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public f.b f213034q;

    /* renamed from: r, reason: collision with root package name */
    public int f213035r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f213036s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f213037t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f213038u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, String str, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f213037t = bVar;
        this.f213038u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f213037t, this.f213038u, continuation);
        gVar.f213036s = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MergeFinishInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.domain.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
