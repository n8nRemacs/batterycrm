package com.google.android.play.core.splitinstall.internal;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37208a implements A {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f358746a;

    public C37208a(ByteBuffer byteBuffer) {
        this.f358746a = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.splitinstall.internal.A
    public final void a(MessageDigest[] messageDigestArr, long j12, int i12) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f358746a) {
            int i13 = (int) j12;
            this.f358746a.position(i13);
            this.f358746a.limit(i13 + i12);
            byteBufferSlice = this.f358746a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.A
    public final long zza() {
        return this.f358746a.capacity();
    }
}
