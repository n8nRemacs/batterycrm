package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.InterfaceC36580j;

/* compiled from: ExtractorInput.java */
/* loaded from: classes6.dex */
public interface k extends InterfaceC36580j {
    boolean a(byte[] bArr, int i12, int i13, boolean z12);

    void b(int i12, int i13, byte[] bArr);

    boolean d(byte[] bArr, int i12, int i13, boolean z12);

    void f();

    long g();

    long getLength();

    long getPosition();

    void h(int i12);

    void i(int i12);

    int j(int i12, int i13, byte[] bArr);

    void readFully(byte[] bArr, int i12, int i13);
}
