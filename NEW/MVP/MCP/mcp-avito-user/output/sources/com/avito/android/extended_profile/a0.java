package com.avito.android.extended_profile;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import fA.C40269b;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileMviViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/a;", VoiceInfo.STATE, "LeT/c;", "beduinState", "LfA/b;", "<anonymous>", "(Lcom/avito/android/extended_profile/mvi/entity/a;LeT/c;)LfA/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileMviViewModel$state$2$1", f = "ExtendedProfileMviViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a0 extends SuspendLambda implements Y41.q<com.avito.android.extended_profile.mvi.entity.a, AbstractC40048c, Continuation<? super C40269b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f149386q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ AbstractC40048c f149387r;

    public a0() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(com.avito.android.extended_profile.mvi.entity.a aVar, AbstractC40048c abstractC40048c, Continuation<? super C40269b> continuation) {
        a0 a0Var = new a0(3, continuation);
        a0Var.f149386q = aVar;
        a0Var.f149387r = abstractC40048c;
        return a0Var.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new C40269b(this.f149386q, this.f149387r);
    }
}
