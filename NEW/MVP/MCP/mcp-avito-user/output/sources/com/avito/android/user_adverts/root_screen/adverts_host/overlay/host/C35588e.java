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
import kotlin.jvm.internal.L;
import xI0.InterfaceC49845b;

/* compiled from: CharityOverlay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LxI0/b;", VoiceInfo.STATE, "LEI0/a;", "overlay", "<anonymous>", "(LxI0/b;LEI0/a;)LxI0/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.CharityOverlayKt$stateWithOverlayQueue$1", f = "CharityOverlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35588e extends SuspendLambda implements Y41.q<InterfaceC49845b, EI0.a, Continuation<? super InterfaceC49845b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ InterfaceC49845b f313176q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ EI0.a f313177r;

    public C35588e() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC49845b interfaceC49845b, EI0.a aVar, Continuation<? super InterfaceC49845b> continuation) {
        C35588e c35588e = new C35588e(3, continuation);
        c35588e.f313176q = interfaceC49845b;
        c35588e.f313177r = aVar;
        return c35588e.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return L.f(this.f313177r, j.b.f313187a) ? this.f313176q : InterfaceC49845b.a.f442331a;
    }
}
