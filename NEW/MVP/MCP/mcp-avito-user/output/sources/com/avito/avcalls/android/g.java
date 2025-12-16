package com.avito.avcalls.android;

import androidx.media3.common.C23088b;
import com.avito.avcalls.android.a;
import com.avito.avcalls.android.call.C36177e;
import com.avito.avcalls.android.call.models.CreateCallMetaInfo;
import com.avito.avcalls.android.config.Config;
import com.avito.avcalls.android.logger.AvCallsLoggingConfiguration;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.rtc.w;
import com.avito.avcalls.android.rtc.y;
import com.avito.avcalls.android.video.CameraPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.S;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.t1;
import vQ0.C49253a;

/* compiled from: AvCallsImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/g;", "Lcom/avito/avcalls/android/a;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.utils.coroutines.c f331702a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36177e f331703b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.signaling.transport.external.a f331704c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.f f331705d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC10304a f331706e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.config.f f331707f;

    public g(@Y61.k y yVar, @Y61.k com.avito.avcalls.android.utils.coroutines.c cVar, @Y61.k C36177e c36177e, @Y61.k com.avito.avcalls.android.signaling.transport.external.a aVar, @Y61.k a.f fVar, @Y61.k AvCallsLoggingConfiguration avCallsLoggingConfiguration, @Y61.k a.InterfaceC10304a interfaceC10304a, @Y61.l com.avito.avcalls.android.config.d dVar, @Y61.k com.avito.avcalls.android.config.f fVar2) {
        this.f331702a = cVar;
        this.f331703b = c36177e;
        this.f331704c = aVar;
        this.f331705d = fVar;
        this.f331706e = interfaceC10304a;
        this.f331707f = fVar2;
        g.b.Companion companion = g.b.INSTANCE;
        kotlinx.coroutines.scheduling.c cVar2 = C43262l0.f411945a;
        AbstractC43129d1 abstractC43129d1 = K.f411877a;
        companion.getClass();
        com.avito.avcalls.android.logger.f fVar3 = new com.avito.avcalls.android.logger.f(fVar, abstractC43129d1, U.a(cVar.f332438d.plus(t1.b()).plus(new S("log_message_sender_coroutine"))));
        g.Companion companion2 = com.avito.avcalls.android.logger.g.INSTANCE;
        avCallsLoggingConfiguration.getClass();
        AvCallsLoggingConfiguration.SdkSeverity sdkSeverity = AvCallsLoggingConfiguration.SdkSeverity.f331729b;
        com.avito.avcalls.android.logger.g.f331754b = new com.avito.avcalls.android.logger.b(fVar3);
        g.Companion companion3 = com.avito.avcalls.android.logger.g.INSTANCE;
        AvCallsLoggingConfiguration.RtcSeverity rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
        com.avito.avcalls.android.logger.h hVar = new com.avito.avcalls.android.logger.h(fVar3);
        companion3.getClass();
        com.avito.avcalls.android.logger.g.f331753a = hVar;
        C49253a.b.INSTANCE.getClass();
        C49253a.f440753a = interfaceC10304a;
        w.Companion companion4 = w.INSTANCE;
        com.avito.avcalls.android.logger.h hVar2 = com.avito.avcalls.android.logger.g.f331753a;
        companion4.getClass();
        w.Companion.a(yVar, hVar2);
        g.Companion.c("AvCallsImpl", "AvCallsImpl did initialize with config=" + fVar2.getF331673b());
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.avito.avcalls.android.a
    public final void a(@Y61.k String str, boolean z12) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("AvCallsImpl", "enableSendingVideo(): callId=" + str + ", isEnabled=" + z12);
        this.f331703b.h(str, z12);
    }

    @Override // com.avito.avcalls.android.a
    public final boolean b(@Y61.k String str, @Y61.k String str2) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("AvCallsImpl", "sendDtmf(): callId=" + str + ", tone=" + str2);
        return this.f331703b.k(str, str2);
    }

    @Override // com.avito.avcalls.android.a
    public final void c(@Y61.k String str, boolean z12) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("AvCallsImpl", "enableSendingAudio(): callId=" + str + ", isEnabled=" + z12);
        this.f331703b.g(str, z12);
    }

    @Override // com.avito.avcalls.android.a
    public final void d(@Y61.k CameraPosition cameraPosition) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("AvCallsImpl", "switchCamera(): position=" + cameraPosition);
        C36177e c36177e = this.f331703b;
        g.Companion.c("CallManager", "switchCamera(): position=" + cameraPosition);
        c36177e.f331490f.getValue().d(cameraPosition);
    }

    @Override // com.avito.avcalls.android.a
    public final void e(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String strConcat = "startOutgoingCall(): id=".concat(str);
        companion.getClass();
        g.Companion.c("AvCallsImpl", strConcat);
        n(dVar, new s(this, str, null));
    }

    @Override // com.avito.avcalls.android.a
    public final void f(@Y61.k String str, boolean z12, @Y61.k com.avito.avcalls.android.video.w wVar) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("AvCallsImpl", "detachVideoRenderer(): callId=" + str + ", isLocal=" + z12);
        this.f331703b.f(str, z12, wVar);
    }

    @Override // com.avito.avcalls.android.a
    public final void g(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k CreateCallMetaInfo createCallMetaInfo, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.e eVar) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        StringBuilder sbB = C23088b.b("createOutgoingCall(): id=", str, ", from=", str2, ", to=");
        sbB.append(str3);
        sbB.append(", isVideo=");
        sbB.append(z12);
        sbB.append(", metaInfo=");
        sbB.append(createCallMetaInfo);
        String string = sbB.toString();
        companion.getClass();
        g.Companion.c("AvCallsImpl", string);
        j jVar = new j(this, str, str2, str3, z12, createCallMetaInfo, null);
        C43259k.d(this.f331702a, new o(N.f410714t2, eVar), null, new p(jVar, eVar, null), 2);
    }

    @Override // com.avito.avcalls.android.a
    @Y61.k
    public final Config getConfig() {
        return this.f331707f.getF331673b();
    }

    @Override // com.avito.avcalls.android.a
    public final void h(@Y61.k String str, @Y61.k xQ0.k kVar, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("AvCallsImpl", "terminateCall(): callId=" + str + ", reason=" + kVar);
        n(dVar, new t(this, str, kVar, null));
    }

    @Override // com.avito.avcalls.android.a
    public final void i(@Y61.k String str, boolean z12, @Y61.k com.avito.avcalls.android.video.w wVar) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("AvCallsImpl", "attachVideoRenderer(): callId=" + str + ", isLocal=" + z12);
        this.f331703b.d(str, z12, wVar);
    }

    @Override // com.avito.avcalls.android.a
    public final void j(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String str2 = "onExternalSignalingTransportEvent(): event=, jsonParameters=" + com.avito.avcalls.android.utils.n.c(str);
        companion.getClass();
        g.Companion.c("AvCallsImpl", str2);
        n(dVar, new k(this, str, null));
    }

    @Override // com.avito.avcalls.android.a
    public final void k(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String str2 = "onPushNotification(): jsonParameters=" + com.avito.avcalls.android.utils.n.c(str);
        companion.getClass();
        g.Companion.c("AvCallsImpl", str2);
        n(dVar, new l(this, str, null));
    }

    @Override // com.avito.avcalls.android.a
    public final void l(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String strConcat = "sendRingingForIncomingCall(): callId=".concat(str);
        companion.getClass();
        g.Companion.c("AvCallsImpl", strConcat);
        n(dVar, new q(this, str, null));
    }

    @Override // com.avito.avcalls.android.a
    public final void m(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String strConcat = "acceptIncomingCall(): callId=".concat(str);
        companion.getClass();
        g.Companion.c("AvCallsImpl", strConcat);
        n(dVar, new h(this, str, null));
    }

    public final void n(com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar, Y41.l lVar) {
        C43259k.d(this.f331702a, new m(N.f410714t2, dVar), null, new n(lVar, dVar, null), 2);
    }
}
