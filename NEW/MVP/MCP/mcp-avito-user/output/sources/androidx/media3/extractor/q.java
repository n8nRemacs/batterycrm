package androidx.media3.extractor;

import androidx.media3.common.InterfaceC23102m;

/* compiled from: ExtractorInput.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface q extends InterfaceC23102m {
    boolean a(byte[] bArr, int i12, int i13, boolean z12);

    void b(int i12, int i13, byte[] bArr);

    boolean d(byte[] bArr, int i12, int i13, boolean z12);

    void f();

    long g();

    long getLength();

    long getPosition();

    void h(int i12);

    void i(int i12);

    void readFully(byte[] bArr, int i12, int i13);
}
