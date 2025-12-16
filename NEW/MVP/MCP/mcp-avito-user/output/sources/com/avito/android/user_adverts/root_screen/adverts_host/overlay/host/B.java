package com.avito.android.user_adverts.root_screen.adverts_host.overlay.host;

import BI0.d;
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

/* compiled from: SearchOverlay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LBI0/d;", VoiceInfo.STATE, "LEI0/a;", "overlay", "<anonymous>", "(LBI0/d;LEI0/a;)LBI0/d;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.SearchOverlayKt$stateWithOverlayQueue$1", f = "SearchOverlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class B extends SuspendLambda implements Y41.q<BI0.d, EI0.a, Continuation<? super BI0.d>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ BI0.d f313145q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ EI0.a f313146r;

    public B() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(BI0.d dVar, EI0.a aVar, Continuation<? super BI0.d> continuation) {
        B b12 = new B(3, continuation);
        b12.f313145q = dVar;
        b12.f313146r = aVar;
        return b12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        BI0.d dVar = this.f313145q;
        if (L.f(this.f313146r, j.d.f313191a)) {
            return dVar;
        }
        d.C0052d c0052d = dVar instanceof d.C0052d ? (d.C0052d) dVar : null;
        return c0052d != null ? d.C0052d.a(c0052d, false, false, false, false, null, null, null, null, null, null, null, null, 4093) : dVar;
    }
}
