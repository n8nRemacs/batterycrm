package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface sc3 extends Closeable, pe7, HasExtraData {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    pe7 getImageInfo();

    ksc getQualityInfo();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
