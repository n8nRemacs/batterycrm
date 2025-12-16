package ru.ok.android.externcalls.sdk.ui;

import defpackage.cm6;
import defpackage.u08;
import kotlin.Metadata;
import org.webrtc.VideoFrame;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrameDecorator$Companion$EMPTY$2 extends u08 implements cm6 {
    public static final FrameDecorator$Companion$EMPTY$2 INSTANCE = new FrameDecorator$Companion$EMPTY$2();

    public FrameDecorator$Companion$EMPTY$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoFrame invoke$lambda$0(VideoFrame videoFrame) {
        return videoFrame;
    }

    @Override // defpackage.cm6
    public final FrameDecorator invoke() {
        return new a();
    }
}
