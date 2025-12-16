package com.google.android.exoplayer2.audio;

import defpackage.gf6;

/* loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {
    public final boolean a;
    public final gf6 b;

    public AudioSink$WriteException(int i, gf6 gf6Var, boolean z) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        super(sb.toString());
        this.a = z;
        this.b = gf6Var;
    }
}
