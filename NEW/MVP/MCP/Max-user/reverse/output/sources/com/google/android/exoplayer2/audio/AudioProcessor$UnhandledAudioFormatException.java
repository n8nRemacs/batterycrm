package com.google.android.exoplayer2.audio;

import defpackage.h50;

/* loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(h50 h50Var) {
        String strValueOf = String.valueOf(h50Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
        sb.append("Unhandled format: ");
        sb.append(strValueOf);
        super(sb.toString());
    }
}
