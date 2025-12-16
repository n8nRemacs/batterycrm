package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$1", f = "RatingDetailsActor.kt", i = {0, 1, 1}, l = {76, 79, 81}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "isSwipeRefresh"}, s = {"L$0", "L$0", "I$0"})
/* renamed from: com.avito.android.rating.details.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34196t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247491q;

    /* renamed from: r, reason: collision with root package name */
    public int f247492r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f247493s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247494t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34175a f247495u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247496v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34196t(C34175a c34175a, com.avito.android.rating.details.mvi.entity.a aVar, com.avito.android.rating.details.mvi.entity.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f247494t = aVar;
        this.f247495u = c34175a;
        this.f247496v = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34196t c34196t = new C34196t(this.f247495u, this.f247494t, this.f247496v, continuation);
        c34196t.f247493s = obj;
        return c34196t;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34196t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.C34196t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
