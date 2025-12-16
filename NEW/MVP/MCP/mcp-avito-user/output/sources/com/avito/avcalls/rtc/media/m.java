package com.avito.avcalls.rtc.media;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoTrackLogsWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/media/m;", "Lcom/avito/avcalls/rtc/media/g;", "Lcom/avito/avcalls/rtc/media/l;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m extends g implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f333191b;

    public m(@Y61.k l lVar) {
        this.f333191b = lVar;
        F().b("init", new Object[0]);
    }

    @Override // com.avito.avcalls.utils.logs.b
    @Y61.k
    public final String G() {
        return "VideoTrack_" + getId();
    }

    @Override // com.avito.avcalls.rtc.media.g
    public final f H() {
        return this.f333191b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && L.f(this.f333191b, ((m) obj).f333191b);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f333191b;
    }

    public final int hashCode() {
        return this.f333191b.hashCode();
    }

    @Override // com.avito.avcalls.rtc.media.l
    public final void o(@Y61.k DQ0.a aVar) {
        F().b("removeRenderer", aVar);
        this.f333191b.o(aVar);
    }

    @Override // com.avito.avcalls.rtc.media.l
    public final void p(@Y61.k DQ0.a aVar) {
        F().b("addRenderer", aVar);
        this.f333191b.p(aVar);
    }
}
