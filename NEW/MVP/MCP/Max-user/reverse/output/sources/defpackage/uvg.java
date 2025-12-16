package defpackage;

import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.UploadStarter;

/* loaded from: classes2.dex */
public final /* synthetic */ class uvg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventChannel b;

    public /* synthetic */ uvg(EventChannel eventChannel, int i) {
        this.a = i;
        this.b = eventChannel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                UploadStarter.startUpload$lambda$0(this.b);
                break;
            default:
                UploadStarter.resumeUpload$lambda$1(this.b);
                break;
        }
    }
}
