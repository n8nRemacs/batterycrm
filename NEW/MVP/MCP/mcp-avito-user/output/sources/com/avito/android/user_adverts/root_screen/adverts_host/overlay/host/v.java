package com.avito.android.user_adverts.root_screen.adverts_host.overlay.host;

import MI0.d;
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

/* compiled from: PanelSoaOverlay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LMI0/d;", VoiceInfo.STATE, "LEI0/a;", "overlay", "<anonymous>", "(LMI0/d;LEI0/a;)LMI0/d;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.PanelSoaOverlayKt$stateWithOverlayQueue$1", f = "PanelSoaOverlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class v extends SuspendLambda implements Y41.q<MI0.d, EI0.a, Continuation<? super MI0.d>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ MI0.d f313240q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ EI0.a f313241r;

    public v() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(MI0.d dVar, EI0.a aVar, Continuation<? super MI0.d> continuation) {
        v vVar = new v(3, continuation);
        vVar.f313240q = dVar;
        vVar.f313241r = aVar;
        return vVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        MI0.d dVar = this.f313240q;
        if (L.f(this.f313241r, j.h.f313199a)) {
            return dVar;
        }
        d.a cVar = dVar.f10579c;
        if ((cVar instanceof d.a.c ? (d.a.c) cVar : null) != null) {
            cVar = new d.a.c(LI0.a.a(((d.a.c) cVar).f10583a, 223));
        }
        return MI0.d.a(dVar, null, null, cVar, 3);
    }
}
