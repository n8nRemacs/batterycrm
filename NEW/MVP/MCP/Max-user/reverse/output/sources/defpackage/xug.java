package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class xug extends dtf implements sm6 {
    public final /* synthetic */ UploadFileAttachWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xug(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.o = uploadFileAttachWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xug) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xug(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        long length;
        g8j.b(obj);
        try {
            length = new File(this.o.b().b).length() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        } catch (Throwable th) {
            wqi.e("UploadFileAttachWorker", "fileSize fail!", th);
            length = 0;
        }
        return new Long(length);
    }
}
