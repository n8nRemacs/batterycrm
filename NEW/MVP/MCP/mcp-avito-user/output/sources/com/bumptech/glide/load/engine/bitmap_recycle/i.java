package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes5.dex */
public final class i implements a<int[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public final int a(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public final int b() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public final int[] newArray(int i12) {
        return new int[i12];
    }
}
