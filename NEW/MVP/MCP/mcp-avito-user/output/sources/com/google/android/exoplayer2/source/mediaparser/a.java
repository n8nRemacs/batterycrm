package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser$SeekableInputReader;
import com.google.android.exoplayer2.upstream.InterfaceC36580j;
import com.google.android.exoplayer2.util.U;
import j.P;
import j.X;

/* compiled from: InputReaderAdapterV30.java */
@SuppressLint({"Override"})
@X
/* loaded from: classes6.dex */
public final class a implements MediaParser$SeekableInputReader {

    /* renamed from: a, reason: collision with root package name */
    @P
    public InterfaceC36580j f346634a;

    /* renamed from: b, reason: collision with root package name */
    public long f346635b;

    /* renamed from: c, reason: collision with root package name */
    public long f346636c;

    /* renamed from: d, reason: collision with root package name */
    public long f346637d;

    public final long getLength() {
        return this.f346635b;
    }

    public final long getPosition() {
        return this.f346636c;
    }

    public final int read(byte[] bArr, int i12, int i13) {
        InterfaceC36580j interfaceC36580j = this.f346634a;
        int i14 = U.f348106a;
        int i15 = interfaceC36580j.read(bArr, i12, i13);
        this.f346636c += i15;
        return i15;
    }

    public final void seekToPosition(long j12) {
        this.f346637d = j12;
    }
}
