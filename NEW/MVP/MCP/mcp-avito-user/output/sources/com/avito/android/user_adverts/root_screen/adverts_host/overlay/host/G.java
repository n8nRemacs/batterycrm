package com.avito.android.user_adverts.root_screen.adverts_host.overlay.host;

import RI0.b;
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

/* compiled from: ServiceFreemiumOverlay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LRI0/b;", VoiceInfo.STATE, "LEI0/a;", "overlay", "<anonymous>", "(LRI0/b;LEI0/a;)LRI0/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.ServiceFreemiumOverlayKt$stateWithOverlayQueue$1", f = "ServiceFreemiumOverlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class G extends SuspendLambda implements Y41.q<RI0.b, EI0.a, Continuation<? super RI0.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ RI0.b f313162q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ EI0.a f313163r;

    public G() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(RI0.b bVar, EI0.a aVar, Continuation<? super RI0.b> continuation) {
        G g12 = new G(3, continuation);
        g12.f313162q = bVar;
        g12.f313163r = aVar;
        return g12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return L.f(this.f313163r, j.f.f313195a) ? this.f313162q : b.a.f14303a;
    }
}
