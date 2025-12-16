package com.google.android.exoplayer2.extractor;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: ForwardingExtractorInput.java */
/* loaded from: classes6.dex */
public class s implements k {

    /* renamed from: a, reason: collision with root package name */
    public final f f344989a;

    public s(f fVar) {
        this.f344989a = fVar;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final boolean a(byte[] bArr, int i12, int i13, boolean z12) {
        return this.f344989a.a(bArr, i12, i13, z12);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void b(int i12, int i13, byte[] bArr) {
        this.f344989a.a(bArr, i12, i13, false);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final boolean d(byte[] bArr, int i12, int i13, boolean z12) {
        return this.f344989a.d(bArr, 0, i13, z12);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void f() {
        this.f344989a.f344497f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public long g() {
        return this.f344989a.g();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public long getLength() {
        return this.f344989a.f344494c;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public long getPosition() {
        return this.f344989a.f344495d;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void h(int i12) throws EOFException, InterruptedIOException {
        this.f344989a.l(i12, false);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void i(int i12) throws EOFException, InterruptedIOException {
        this.f344989a.i(i12);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final int j(int i12, int i13, byte[] bArr) {
        return this.f344989a.j(i12, i13, bArr);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        return this.f344989a.read(bArr, i12, i13);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void readFully(byte[] bArr, int i12, int i13) throws EOFException, InterruptedIOException {
        this.f344989a.d(bArr, i12, i13, false);
    }
}
