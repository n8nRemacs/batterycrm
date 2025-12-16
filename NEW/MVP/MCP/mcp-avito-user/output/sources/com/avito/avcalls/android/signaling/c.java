package com.avito.avcalls.android.signaling;

import com.avito.avcalls.android.signaling.proto.IncomingDataMessage;
import com.avito.avcalls.android.signaling.proto.IncomingPush;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SignalingApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/signaling/c;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c {
    @Y61.k
    InterfaceC43160i<IncomingPush> a();

    @Y61.k
    InterfaceC43160i<IncomingDataMessage> b();
}
