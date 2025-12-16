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
import yI0.InterfaceC50119b;

/* compiled from: DeliveryRestrictionOverlay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LyI0/b;", VoiceInfo.STATE, "LEI0/a;", "overlay", "<anonymous>", "(LyI0/b;LEI0/a;)LyI0/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.DeliveryRestrictionOverlayKt$stateWithOverlayQueue$1", f = "DeliveryRestrictionOverlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35591h extends SuspendLambda implements Y41.q<InterfaceC50119b, EI0.a, Continuation<? super InterfaceC50119b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ InterfaceC50119b f313183q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ EI0.a f313184r;

    public C35591h() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC50119b interfaceC50119b, EI0.a aVar, Continuation<? super InterfaceC50119b> continuation) {
        C35591h c35591h = new C35591h(3, continuation);
        c35591h.f313183q = interfaceC50119b;
        c35591h.f313184r = aVar;
        return c35591h.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return L.f(this.f313184r, j.c.f313189a) ? this.f313183q : InterfaceC50119b.a.f443023a;
    }
}
