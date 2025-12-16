package com.google.android.exoplayer2.audio;

import defpackage.gf6;
import defpackage.ho7;

/* loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {
    public final boolean a;
    public final gf6 b;

    public AudioSink$InitializationException(int i, int i2, int i3, int i4, gf6 gf6Var, boolean z, RuntimeException runtimeException) {
        String str = z ? " (recoverable)" : "";
        StringBuilder sb = new StringBuilder(str.length() + 80);
        sb.append("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        super(ho7.l(sb, ")", str), runtimeException);
        this.a = z;
        this.b = gf6Var;
    }
}
