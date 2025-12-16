package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import Y41.p;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.select_specific.mvi.entity.SelectSpecificInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectSpecificActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/entity/SelectSpecificInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.select_specific.mvi.SelectSpecificActor$startMergeFlow$1", f = "SelectSpecificActor.kt", i = {0, 1, 2, 2, 3, 4}, l = {125, 127, 140, 151, 155, 159}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super SelectSpecificInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.passport.profile_add.domain.interactor.l f211716q;

    /* renamed from: r, reason: collision with root package name */
    public int f211717r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f211718s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f211719t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ProfileCreateExtendedFlow.Passport f211720u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f211721v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ProfileCreateExtendedFlow.Passport passport, int i12, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f211719t = cVar;
        this.f211720u = passport;
        this.f211721v = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f211719t, this.f211720u, this.f211721v, continuation);
        aVar.f211718s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectSpecificInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.create_flow.select_specific.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
