package com.avito.avcalls.rtc.media;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AudioTrackLogsWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/media/c;", "Lcom/avito/avcalls/rtc/media/g;", "Lcom/avito/avcalls/rtc/media/b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends g implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f333186b;

    public c(@Y61.k b bVar) {
        this.f333186b = bVar;
        F().b("init", new Object[0]);
    }

    @Override // com.avito.avcalls.utils.logs.b
    @Y61.k
    public final String G() {
        return "AudioTrack_" + getId();
    }

    @Override // com.avito.avcalls.rtc.media.g
    public final f H() {
        return this.f333186b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f333186b, ((c) obj).f333186b);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f333186b;
    }

    public final int hashCode() {
        return this.f333186b.hashCode();
    }
}
