package com.avito.avcalls.rtc.media;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RtpSenderLogsWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/media/i;", "Lcom/avito/avcalls/utils/logs/b;", "Lcom/avito/avcalls/rtc/media/h;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i extends com.avito.avcalls.utils.logs.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f333187b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f333188c;

    public i(@Y61.k String str, @Y61.k h hVar) {
        this.f333187b = str;
        this.f333188c = hVar;
        F().b("init", new Object[0]);
    }

    @Override // com.avito.avcalls.utils.logs.b
    @Y61.k
    public final String G() {
        return "RtpSender_" + this.f333187b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f333187b, iVar.f333187b) && L.f(this.f333188c, iVar.f333188c);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f333188c;
    }

    public final int hashCode() {
        return this.f333188c.hashCode() + (this.f333187b.hashCode() * 31);
    }

    @Override // com.avito.avcalls.rtc.media.h
    public final void y(@Y61.k f fVar) {
        F().b("resetTrack", fVar);
        this.f333188c.y(fVar);
    }

    @Override // com.avito.avcalls.rtc.media.h
    public final void z(@Y61.l f fVar) {
        F().b("setTrack", fVar);
        this.f333188c.z(fVar);
    }
}
