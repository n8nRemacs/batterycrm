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
import vI0.InterfaceC49220b;

/* compiled from: AppRaterOverlay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LvI0/b;", VoiceInfo.STATE, "LEI0/a;", "overlay", "<anonymous>", "(LvI0/b;LEI0/a;)LvI0/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.AppRaterOverlayKt$stateWithOverlayQueue$1", f = "AppRaterOverlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35585b extends SuspendLambda implements Y41.q<InterfaceC49220b, EI0.a, Continuation<? super InterfaceC49220b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ InterfaceC49220b f313169q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ EI0.a f313170r;

    public C35585b() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC49220b interfaceC49220b, EI0.a aVar, Continuation<? super InterfaceC49220b> continuation) {
        C35585b c35585b = new C35585b(3, continuation);
        c35585b.f313169q = interfaceC49220b;
        c35585b.f313170r = aVar;
        return c35585b.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return L.f(this.f313170r, j.a.f313185a) ? this.f313169q : InterfaceC49220b.a.f440668a;
    }
}
