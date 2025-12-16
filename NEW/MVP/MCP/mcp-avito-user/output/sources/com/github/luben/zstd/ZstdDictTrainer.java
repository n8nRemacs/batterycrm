package com.github.luben.zstd;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ZstdDictTrainer {
    private final int allocatedSize;
    private final int dictSize;
    private long filledSize;
    private final List<Integer> sampleSizes = new ArrayList();
    private final ByteBuffer trainingSamples;

    public ZstdDictTrainer(int i12, int i13) {
        this.trainingSamples = ByteBuffer.allocateDirect(i12);
        this.allocatedSize = i12;
        this.dictSize = i13;
    }

    private int[] copyToIntArray(List<Integer> list) {
        int[] iArr = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            iArr[i12] = it.next().intValue();
            i12++;
        }
        return iArr;
    }

    public synchronized boolean addSample(byte[] bArr) {
        if (this.filledSize + bArr.length > this.allocatedSize) {
            return false;
        }
        this.trainingSamples.put(bArr);
        this.sampleSizes.add(Integer.valueOf(bArr.length));
        this.filledSize += bArr.length;
        return true;
    }

    public byte[] trainSamples() {
        return trainSamples(false);
    }

    public ByteBuffer trainSamplesDirect() {
        return trainSamplesDirect(false);
    }

    public byte[] trainSamples(boolean z12) {
        ByteBuffer byteBufferTrainSamplesDirect = trainSamplesDirect(z12);
        byte[] bArr = new byte[byteBufferTrainSamplesDirect.remaining()];
        byteBufferTrainSamplesDirect.get(bArr);
        return bArr;
    }

    public synchronized ByteBuffer trainSamplesDirect(boolean z12) {
        ByteBuffer byteBufferAllocateDirect;
        byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.dictSize);
        long jTrainFromBufferDirect = Zstd.trainFromBufferDirect(this.trainingSamples, copyToIntArray(this.sampleSizes), byteBufferAllocateDirect, z12);
        if (Zstd.isError(jTrainFromBufferDirect)) {
            byteBufferAllocateDirect.limit(0);
            throw new ZstdException(jTrainFromBufferDirect);
        }
        byteBufferAllocateDirect.limit(Long.valueOf(jTrainFromBufferDirect).intValue());
        return byteBufferAllocateDirect;
    }
}
