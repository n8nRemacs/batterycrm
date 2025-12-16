package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.ctd;
import defpackage.fsi;
import defpackage.gf6;
import defpackage.s29;
import defpackage.u45;
import defpackage.xxg;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final gf6 X;
    public final int Y;
    public final s29 Z;
    public final int c;
    public final String d;
    public final int o;
    public final boolean s0;

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }

    public final ExoPlaybackException a(s29 s29Var) {
        String message = getMessage();
        int i = xxg.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.c, this.d, this.o, this.X, this.Y, s29Var, this.b, this.s0);
    }

    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, gf6 gf6Var, int i4, s29 s29Var, long j, boolean z) {
        super(str, th, i, j);
        fsi.b(!z || i2 == 1);
        fsi.b(th != null || i2 == 3);
        this.c = i2;
        this.d = str2;
        this.o = i3;
        this.X = gf6Var;
        this.Y = i4;
        this.Z = s29Var;
        this.s0 = z;
    }

    public ExoPlaybackException(int i, Throwable th, int i2, String str, int i3, gf6 gf6Var, int i4, boolean z) {
        int i5;
        String string;
        String str2;
        if (i == 0) {
            i5 = i3;
            string = "Source error";
        } else if (i != 1) {
            if (i != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(gf6Var);
            int i6 = xxg.a;
            if (i4 == 0) {
                str2 = "NO";
            } else if (i4 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i4 == 4) {
                str2 = "YES";
            } else {
                throw new IllegalStateException();
            }
            StringBuilder sb = new StringBuilder(str2.length() + strValueOf.length() + u45.f(53, str));
            sb.append(str);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            string = ctd.j(sb, strValueOf, ", format_supported=", str2);
        }
        if (!TextUtils.isEmpty(null)) {
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder("null".length() + strValueOf2.length() + 2);
            sb2.append(strValueOf2);
            sb2.append(": null");
            string = sb2.toString();
        }
        this(string, th, i2, i, str, i5, gf6Var, i4, null, SystemClock.elapsedRealtime(), z);
    }
}
