package com.avito.android.user_adverts.root_screen.adverts_host.overlay.host;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PanelConfigOverlay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LII0/d;", VoiceInfo.STATE, "LEI0/a;", "overlay", "<anonymous>", "(LII0/d;LEI0/a;)LII0/d;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.PanelConfigOverlayKt$stateWithOverlayQueue$1", f = "PanelConfigOverlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class s extends SuspendLambda implements Y41.q<II0.d, EI0.a, Continuation<? super II0.d>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ II0.d f313233q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ EI0.a f313234r;

    public s() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(II0.d dVar, EI0.a aVar, Continuation<? super II0.d> continuation) {
        s sVar = new s(3, continuation);
        sVar.f313233q = dVar;
        sVar.f313234r = aVar;
        return sVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        II0.d dVar = this.f313233q;
        EI0.a aVar = this.f313234r;
        return II0.d.a(dVar, aVar instanceof j.i ? t.d(t.b(dVar.f8103b)) : aVar instanceof j.g ? t.d(t.c(dVar.f8103b)) : aVar instanceof j.C9607j ? t.c(t.b(dVar.f8103b)) : t.d(t.b(t.c(dVar.f8103b))));
    }
}
