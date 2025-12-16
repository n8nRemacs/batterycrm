package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import defpackage.az1;
import defpackage.d99;
import defpackage.hf6;
import defpackage.hsi;
import defpackage.zxg;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int t0;
    public final String u0;
    public final int v0;
    public final hf6 w0;
    public final int x0;
    public final d99 y0;
    public final boolean z0;

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    @Override // androidx.media3.common.PlaybackException
    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        String str = zxg.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.t0 == exoPlaybackException.t0 && Objects.equals(this.u0, exoPlaybackException.u0) && this.v0 == exoPlaybackException.v0 && Objects.equals(this.w0, exoPlaybackException.w0) && this.x0 == exoPlaybackException.x0 && Objects.equals(this.y0, exoPlaybackException.y0) && this.z0 == exoPlaybackException.z0;
    }

    public final ExoPlaybackException c(d99 d99Var) {
        String message = getMessage();
        String str = zxg.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.t0, this.u0, this.v0, this.w0, this.x0, d99Var, this.b, this.z0);
    }

    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, hf6 hf6Var, int i4, d99 d99Var, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        hsi.b(!z || i2 == 1);
        hsi.b(th != null || i2 == 3);
        this.t0 = i2;
        this.u0 = str2;
        this.v0 = i3;
        this.w0 = hf6Var;
        this.x0 = i4;
        this.y0 = d99Var;
        this.z0 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Exception exc, int i2, String str, int i3, hf6 hf6Var, int i4, d99 d99Var, boolean z) {
        String str2;
        int i5;
        hf6 hf6Var2;
        String string;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            hf6Var2 = hf6Var;
            string = "Source error";
        } else if (i != 1) {
            if (i != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i5 = i3;
            hf6Var2 = hf6Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            hf6Var2 = hf6Var;
            sb.append(hf6Var2);
            sb.append(", format_supported=");
            sb.append(zxg.C(i4));
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : az1.i(string, ": null"), exc, i2, i, str2, i5, hf6Var2, i4, d99Var, SystemClock.elapsedRealtime(), z);
    }
}
