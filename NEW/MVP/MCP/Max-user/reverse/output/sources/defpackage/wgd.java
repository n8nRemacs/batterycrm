package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class wgd {
    public final /* synthetic */ xw5 a;

    public /* synthetic */ wgd(xw5 xw5Var) {
        this.a = xw5Var;
    }

    public final MediaMuxer a(int i, s32 s32Var) {
        Uri uri = Uri.EMPTY;
        xw5 xw5Var = this.a;
        if (!(xw5Var instanceof xw5)) {
            throw new AssertionError("Invalid output options type: ".concat(xw5Var.getClass().getSimpleName()));
        }
        File file = xw5Var.b.c;
        File parentFile = file.getParentFile();
        if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
            gri.i("Recorder", "Failed to create folder for " + file.getAbsolutePath());
        }
        MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
        ((bhd) s32Var.b).I = Uri.fromFile(file);
        return mediaMuxer;
    }
}
