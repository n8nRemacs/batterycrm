package com.google.android.play.core.splitinstall.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class Z implements A {

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f358743a;

    /* renamed from: b, reason: collision with root package name */
    public final long f358744b;

    /* renamed from: c, reason: collision with root package name */
    public final long f358745c;

    public Z(FileChannel fileChannel, long j12, long j13) {
        this.f358743a = fileChannel;
        this.f358744b = j12;
        this.f358745c = j13;
    }

    @Override // com.google.android.play.core.splitinstall.internal.A
    public final void a(MessageDigest[] messageDigestArr, long j12, int i12) throws IOException {
        MappedByteBuffer map = this.f358743a.map(FileChannel.MapMode.READ_ONLY, this.f358744b + j12, i12);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.A
    public final long zza() {
        return this.f358745c;
    }
}
