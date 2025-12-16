package com.avito.avcalls.rtc.connecting;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SdpObserverLogsWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/d;", "Lcom/avito/avcalls/utils/logs/b;", "Lcom/avito/avcalls/rtc/connecting/c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d extends com.avito.avcalls.utils.logs.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f333096b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f333097c;

    public d(@k String str, @k c cVar) {
        this.f333096b = str;
        this.f333097c = cVar;
        F().b("init", new Object[0]);
    }

    @Override // com.avito.avcalls.utils.logs.b
    @k
    public final String G() {
        return "SdpObserver_" + this.f333096b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f333096b, dVar.f333096b) && L.f(this.f333097c, dVar.f333097c);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f333097c;
    }

    public final int hashCode() {
        return this.f333097c.hashCode() + (this.f333096b.hashCode() * 31);
    }

    @Override // com.avito.avcalls.rtc.connecting.c
    public final void m(@k Sdp sdp) {
        F().b("onCreateSuccess", sdp);
        this.f333097c.m(sdp);
    }

    @Override // com.avito.avcalls.rtc.connecting.c
    public final void onCreateFailure(@l String str) {
        F().b("onCreateFailure", str);
        this.f333097c.onCreateFailure(str);
    }

    @Override // com.avito.avcalls.rtc.connecting.c
    public final void onSetFailure(@l String str) {
        F().b("onSetFailure", str);
        this.f333097c.onSetFailure(str);
    }

    @Override // com.avito.avcalls.rtc.connecting.c
    public final void onSetSuccess() {
        F().b("onSetSuccess", new Object[0]);
        this.f333097c.onSetSuccess();
    }
}
