package com.avito.android.select.mvi;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.mvi.entity.SelectInternalAction;
import dq0.C39783e;
import dq0.InterfaceC39781c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select.mvi.SelectActor$process$4", f = "SelectActor.kt", i = {0, 2, 3, 5, 7, 7}, l = {58, 59, 63, 64, 65, 70, 71, 82, 83}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$2"})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC39781c f265598q;

    /* renamed from: r, reason: collision with root package name */
    public ParcelableEntity f265599r;

    /* renamed from: s, reason: collision with root package name */
    public int f265600s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f265601t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C39783e f265602u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC39781c f265603v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C39783e c39783e, InterfaceC39781c interfaceC39781c, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f265602u = c39783e;
        this.f265603v = interfaceC39781c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f265602u, this.f265603v, continuation);
        gVar.f265601t = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.mvi.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
