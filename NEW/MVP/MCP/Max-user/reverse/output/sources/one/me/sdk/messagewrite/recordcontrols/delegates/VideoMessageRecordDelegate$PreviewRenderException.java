package one.me.sdk.messagewrite.recordcontrols.delegates;

import defpackage.ho7;
import defpackage.s65;
import defpackage.v9j;
import defpackage.y65;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"one/me/sdk/messagewrite/recordcontrols/delegates/VideoMessageRecordDelegate$PreviewRenderException", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message-write-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMessageRecordDelegate$PreviewRenderException extends IllegalStateException {
    public VideoMessageRecordDelegate$PreviewRenderException() {
        this(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMessageRecordDelegate$PreviewRenderException(int i) {
        super(ho7.i("Preview wasn't rendered for ", s65.n(v9j.i(8000L, y65.MILLISECONDS)), " seconds"));
        int i2 = s65.d;
    }
}
