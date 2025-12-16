package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface prf extends Closeable {
    pk6 getReadableDatabase();

    pk6 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
