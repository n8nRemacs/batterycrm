package ru.ok.android.externcalls.sdk.audio;

import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.audio.KeywordSpotterManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements NativeDoubleArrayConsumer.Consumer {
    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public final void consume(Double[] dArr) {
        KeywordSpotterManagerImpl.AnonymousClass1.accept$lambda$0(dArr);
    }
}
