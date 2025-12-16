package one.me.sdk.messagewrite.recordcontrols.delegates;

import defpackage.n5g;
import defpackage.nab;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"one/me/sdk/messagewrite/recordcontrols/delegates/VideoMessageRecordDelegate$NoAvailableCameraException", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message-write-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMessageRecordDelegate$NoAvailableCameraException extends IllegalStateException {
    public final n5g a;

    public VideoMessageRecordDelegate$NoAvailableCameraException() {
        this(0);
    }

    public VideoMessageRecordDelegate$NoAvailableCameraException(int i) {
        n5g n5gVar = new n5g(nab.n);
        super("The phone doesn't have cameras at all");
        this.a = n5gVar;
    }
}
