package com.avito.android.user_adverts.root_screen.adverts_host.overlay.host;

import PI0.b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;

/* compiled from: SafetyInfoOverlay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LPI0/b;", VoiceInfo.STATE, "LEI0/a;", "overlay", "<anonymous>", "(LPI0/b;LEI0/a;)LPI0/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.SafetyInfoOverlayKt$stateWithOverlayQueue$1", f = "SafetyInfoOverlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class y extends SuspendLambda implements Y41.q<PI0.b, EI0.a, Continuation<? super PI0.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ PI0.b f313247q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ EI0.a f313248r;

    public y() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(PI0.b bVar, EI0.a aVar, Continuation<? super PI0.b> continuation) {
        y yVar = new y(3, continuation);
        yVar.f313247q = bVar;
        yVar.f313248r = aVar;
        return yVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return L.f(this.f313248r, j.e.f313193a) ? this.f313247q : b.a.f12955a;
    }
}
