package com.avito.avcalls.rtc.peer_connection;

import Y61.l;
import com.avito.avcalls.rtc.connecting.IceCandidate;
import com.avito.avcalls.rtc.connecting.Sdp;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PeerConnection.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/peer_connection/a;", "Lcom/avito/avcalls/utils/logs/c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a extends com.avito.avcalls.utils.logs.c {

    /* compiled from: PeerConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.rtc.peer_connection.a$a, reason: collision with other inner class name */
    public static final class C10356a {
    }

    @l
    com.avito.avcalls.rtc.media.h B(@Y61.k com.avito.avcalls.rtc.media.l lVar, @Y61.k ArrayList arrayList);

    void D(@Y61.k com.avito.avcalls.rtc.connecting.c cVar, @Y61.k com.avito.avcalls.rtc.media.e eVar);

    void c(boolean z12);

    void close();

    @l
    com.avito.avcalls.rtc.media.h e(@Y61.k com.avito.avcalls.rtc.media.b bVar, @Y61.k ArrayList arrayList);

    void f(@Y61.k com.avito.avcalls.rtc.connecting.c cVar, @Y61.k Sdp sdp);

    @Y61.k
    String getId();

    void i(@Y61.k com.avito.avcalls.rtc.connecting.b bVar);

    void k(boolean z12);

    void l(@Y61.k IceCandidate iceCandidate);

    void n(@Y61.k com.avito.avcalls.rtc.connecting.c cVar, @Y61.k com.avito.avcalls.rtc.media.e eVar);

    @l
    com.avito.avcalls.rtc.media.d q(@Y61.k com.avito.avcalls.rtc.media.b bVar);

    void s(@Y61.k com.avito.avcalls.rtc.connecting.c cVar, @Y61.k Sdp sdp);

    void u(@Y61.k Y41.l<? super com.avito.avcalls.stats.a, G0> lVar);

    @l
    com.avito.avcalls.rtc.media.l w();
}
