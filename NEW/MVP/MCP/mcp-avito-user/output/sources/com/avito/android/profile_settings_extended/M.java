package com.avito.android.profile_settings_extended;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileSettingsMviViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/a;", VoiceInfo.STATE, "LeT/c;", "beduinState", "Lyc0/l;", "<anonymous>", "(Lcom/avito/android/profile_settings_extended/mvi/entity/a;LeT/c;)Lyc0/l;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsMviViewModel$state$2$1", f = "ExtendedProfileSettingsMviViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class M extends SuspendLambda implements Y41.q<com.avito.android.profile_settings_extended.mvi.entity.a, AbstractC40048c, Continuation<? super yc0.l>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ com.avito.android.profile_settings_extended.mvi.entity.a f229065q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ AbstractC40048c f229066r;

    public M() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(com.avito.android.profile_settings_extended.mvi.entity.a aVar, AbstractC40048c abstractC40048c, Continuation<? super yc0.l> continuation) {
        M m12 = new M(3, continuation);
        m12.f229065q = aVar;
        m12.f229066r = abstractC40048c;
        return m12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new yc0.l(this.f229065q, this.f229066r);
    }
}
