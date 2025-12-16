package com.avito.android.passport.profile_add.create_flow.set_profile_name;

import V50.a;
import Y41.p;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;

/* compiled from: SetProfileNameFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameFragment$listenDeeplinkResult$1", f = "SetProfileNameFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f212108q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SetProfileNameFragment f212109r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SetProfileNameFragment setProfileNameFragment, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f212109r = setProfileNameFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f212109r, continuation);
        eVar.f212108q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((e) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f212108q;
        SetProfileNameFragment.a aVar = SetProfileNameFragment.f212039E0;
        n nVarV5 = this.f212109r.v5();
        com.avito.android.deeplink_handler.handler.bundle.a aVar2 = c43501a.f413260a;
        nVarV5.accept(new a.d(aVar2.f134521b, c43501a.f413261b));
        return G0.f406611a;
    }
}
