package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import com.facebook.infer.annotation.Nullsafe;
import wW0.InterfaceC49570a;

/* compiled from: GenericByteArrayPool.java */
@J41.d
@Nullsafe
/* loaded from: classes13.dex */
public class t extends BasePool<byte[]> implements InterfaceC49570a {

    /* renamed from: j, reason: collision with root package name */
    public final int[] f340482j;

    public t(wW0.d dVar, G g12, B b12) {
        super(dVar, g12, b12);
        SparseIntArray sparseIntArray = g12.f340445c;
        sparseIntArray.getClass();
        this.f340482j = new int[sparseIntArray.size()];
        for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
            this.f340482j[i12] = sparseIntArray.keyAt(i12);
        }
        this.f340414b.b(this);
        this.f340421i.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final byte[] d(int i12) {
        return new byte[i12];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final void f(byte[] bArr) {
        bArr.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int h(int i12) {
        if (i12 <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i12));
        }
        for (int i13 : this.f340482j) {
            if (i13 >= i12) {
                return i13;
            }
        }
        return i12;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int i(byte[] bArr) {
        byte[] bArr2 = bArr;
        bArr2.getClass();
        return bArr2.length;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int j(int i12) {
        return i12;
    }
}
