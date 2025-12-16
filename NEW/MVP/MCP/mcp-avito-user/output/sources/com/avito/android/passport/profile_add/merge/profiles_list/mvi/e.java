package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import Y41.p;
import com.avito.android.passport.profile_add.merge.profiles_list.mvi.entity.ProfilesListInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProfilesListBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.profiles_list.mvi.ProfilesListBootstrap$trackOpening$1", f = "ProfilesListBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super ProfilesListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f213272q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f213272q = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f213272q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ProfilesListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        f fVar = this.f213272q;
        fVar.f213290c.c(new H50.a(fVar.f213291d.getHash()));
        return G0.f406611a;
    }
}
