package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: MemoryChunkPool.java */
@J41.d
@Nullsafe
/* loaded from: classes13.dex */
public abstract class x extends BasePool<w> {

    /* renamed from: j, reason: collision with root package name */
    public final int[] f340489j;

    public x(wW0.c cVar, G g12, H h12) {
        super(cVar, g12, h12);
        SparseIntArray sparseIntArray = g12.f340445c;
        sparseIntArray.getClass();
        this.f340489j = new int[sparseIntArray.size()];
        int i12 = 0;
        while (true) {
            int[] iArr = this.f340489j;
            if (i12 >= iArr.length) {
                this.f340414b.b(this);
                this.f340421i.getClass();
                return;
            } else {
                iArr[i12] = sparseIntArray.keyAt(i12);
                i12++;
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final void f(w wVar) {
        w wVar2 = wVar;
        wVar2.getClass();
        wVar2.close();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int h(int i12) {
        if (i12 <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i12));
        }
        for (int i13 : this.f340489j) {
            if (i13 >= i12) {
                return i13;
            }
        }
        return i12;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int i(w wVar) {
        w wVar2 = wVar;
        wVar2.getClass();
        return wVar2.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final boolean m(w wVar) {
        wVar.getClass();
        return !r1.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract w d(int i12);

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int j(int i12) {
        return i12;
    }
}
