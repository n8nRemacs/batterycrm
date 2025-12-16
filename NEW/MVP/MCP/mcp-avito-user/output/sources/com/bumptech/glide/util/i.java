package com.bumptech.glide.util;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.N;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes5.dex */
public class i extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f339645b;

    public i(@N d dVar) {
        super(dVar);
        this.f339645b = BeduinInputModel.MIN_TEXT_VERSION;
    }

    public final long a(long j12) {
        int i12 = this.f339645b;
        if (i12 == 0) {
            return -1L;
        }
        return (i12 == Integer.MIN_VALUE || j12 <= ((long) i12)) ? j12 : i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i12 = this.f339645b;
        return i12 == Integer.MIN_VALUE ? super.available() : Math.min(i12, super.available());
    }

    public final void b(long j12) {
        int i12 = this.f339645b;
        if (i12 == Integer.MIN_VALUE || j12 == -1) {
            return;
        }
        this.f339645b = (int) (i12 - j12);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i12) {
        super.mark(i12);
        this.f339645b = i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i12 = super.read();
        b(1L);
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f339645b = BeduinInputModel.MIN_TEXT_VERSION;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j12) throws IOException {
        long jA2 = a(j12);
        if (jA2 == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA2);
        b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@N byte[] bArr, int i12, int i13) throws IOException {
        int iA2 = (int) a(i13);
        if (iA2 == -1) {
            return -1;
        }
        int i14 = super.read(bArr, i12, iA2);
        b(i14);
        return i14;
    }
}
