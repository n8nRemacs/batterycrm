package com.google.android.exoplayer2;

import java.io.IOException;

/* loaded from: classes6.dex */
public class ParserException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f343666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f343667c;

    public ParserException(@j.P String str, @j.P Exception exc, boolean z12, int i12) {
        super(str, exc);
        this.f343666b = z12;
        this.f343667c = i12;
    }

    public static ParserException a(@j.P String str, @j.P Exception exc) {
        return new ParserException(str, exc, true, 1);
    }

    public static ParserException b(@j.P String str) {
        return new ParserException(str, null, true, 4);
    }

    public static ParserException c(@j.P String str) {
        return new ParserException(str, null, false, 1);
    }
}
