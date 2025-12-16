package androidx.media3.extractor;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: ForwardingExtractorInput.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public class y implements q {

    /* renamed from: a, reason: collision with root package name */
    public final C23191j f51905a;

    public y(C23191j c23191j) {
        this.f51905a = c23191j;
    }

    @Override // androidx.media3.extractor.q
    public final boolean a(byte[] bArr, int i12, int i13, boolean z12) {
        return this.f51905a.a(bArr, 0, i13, z12);
    }

    @Override // androidx.media3.extractor.q
    public final void b(int i12, int i13, byte[] bArr) {
        this.f51905a.a(bArr, i12, i13, false);
    }

    @Override // androidx.media3.extractor.q
    public final boolean d(byte[] bArr, int i12, int i13, boolean z12) {
        return this.f51905a.d(bArr, 0, i13, z12);
    }

    @Override // androidx.media3.extractor.q
    public final void f() {
        this.f51905a.f50585f = 0;
    }

    @Override // androidx.media3.extractor.q
    public long g() {
        return this.f51905a.g();
    }

    @Override // androidx.media3.extractor.q
    public long getLength() {
        return this.f51905a.f50582c;
    }

    @Override // androidx.media3.extractor.q
    public long getPosition() {
        return this.f51905a.f50583d;
    }

    @Override // androidx.media3.extractor.q
    public final void h(int i12) throws EOFException, InterruptedIOException {
        this.f51905a.k(i12, false);
    }

    @Override // androidx.media3.extractor.q
    public final void i(int i12) throws EOFException, InterruptedIOException {
        this.f51905a.i(i12);
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        return this.f51905a.read(bArr, i12, i13);
    }

    @Override // androidx.media3.extractor.q
    public final void readFully(byte[] bArr, int i12, int i13) throws EOFException, InterruptedIOException {
        this.f51905a.d(bArr, i12, i13, false);
    }
}
