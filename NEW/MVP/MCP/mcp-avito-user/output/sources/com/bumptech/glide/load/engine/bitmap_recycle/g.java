package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes5.dex */
public final class g implements a<byte[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public final int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public final int b() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public final byte[] newArray(int i12) {
        return new byte[i12];
    }
}
