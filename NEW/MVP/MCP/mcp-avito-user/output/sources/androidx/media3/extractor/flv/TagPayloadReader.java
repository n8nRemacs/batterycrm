package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import androidx.media3.extractor.J;

/* loaded from: classes.dex */
abstract class TagPayloadReader {

    /* renamed from: a, reason: collision with root package name */
    public final J f50537a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(J j12) {
        this.f50537a = j12;
    }
}
