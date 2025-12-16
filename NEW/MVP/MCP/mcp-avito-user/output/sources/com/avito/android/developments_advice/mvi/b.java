package com.avito.android.developments_advice.mvi;

import com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mw.C44146c;
import mw.InterfaceC44144a;

/* compiled from: DevelopmentsAdviceActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_advice.mvi.DevelopmentsAdviceActor$process$2", f = "DevelopmentsAdviceActor.kt", i = {0, 0}, l = {69, 71, 70, 85}, m = "invokeSuspend", n = {"$this$flow", "phone"}, s = {"L$0", "L$1"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DevelopmentsAdviceInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f136130q;

    /* renamed from: r, reason: collision with root package name */
    public int f136131r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f136132s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44144a f136133t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C44146c f136134u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f136135v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC44144a interfaceC44144a, C44146c c44146c, f fVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f136133t = interfaceC44144a;
        this.f136134u = c44146c;
        this.f136135v = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f136133t, this.f136134u, this.f136135v, continuation);
        bVar.f136132s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DevelopmentsAdviceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_advice.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
