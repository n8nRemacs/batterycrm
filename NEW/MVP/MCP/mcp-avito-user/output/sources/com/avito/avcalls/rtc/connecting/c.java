package com.avito.avcalls.rtc.connecting;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: SdpObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/c;", "Lcom/avito/avcalls/utils/logs/c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c extends com.avito.avcalls.utils.logs.c {

    /* compiled from: SdpObserver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void m(@k Sdp sdp);

    void onCreateFailure(@l String str);

    void onSetFailure(@l String str);

    void onSetSuccess();
}
