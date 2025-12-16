package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.A;

/* loaded from: classes6.dex */
abstract class TagPayloadReader {

    /* renamed from: a, reason: collision with root package name */
    public final A f344516a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(A a12) {
        this.f344516a = a12;
    }
}
