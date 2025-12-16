package com.avito.avcalls.rtc.media;

import kotlin.Metadata;

/* compiled from: MediaStreamTrackLogsWrapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/rtc/media/g;", "Lcom/avito/avcalls/utils/logs/b;", "Lcom/avito/avcalls/rtc/media/f;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class g extends com.avito.avcalls.utils.logs.b implements f {
    @Y61.k
    public abstract f H();

    @Override // com.avito.avcalls.rtc.media.f
    @Y61.k
    public final String getId() {
        return H().getId();
    }

    @Override // com.avito.avcalls.rtc.media.f
    public final boolean isEnabled() {
        return H().isEnabled();
    }

    @Override // com.avito.avcalls.rtc.media.f
    public final void setEnabled(boolean z12) {
        F().b("set.isEnabled", Boolean.valueOf(z12));
        H().setEnabled(z12);
    }
}
