package defpackage;

import android.media.AudioPlaybackCaptureConfiguration;
import android.media.projection.MediaProjection;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class yhh {
    public static /* synthetic */ AudioPlaybackCaptureConfiguration.Builder d(MediaProjection mediaProjection) {
        return new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
    }

    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void j() {
    }
}
