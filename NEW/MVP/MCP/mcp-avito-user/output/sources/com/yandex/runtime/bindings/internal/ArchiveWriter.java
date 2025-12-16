package com.yandex.runtime.bindings.internal;

import android.graphics.PointF;
import com.adjust.sdk.Constants;
import com.yandex.runtime.TypeDictionary;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ArchiveWriter implements Archive {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int DEFAULT_SIZE = 16384;
    private ByteBuffer data = allocate(16384);

    private static ByteBuffer allocate(int i12) {
        return ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
    }

    private void ensureSize(int i12) {
        int iPosition = this.data.position();
        int iCapacity = this.data.capacity();
        int i13 = i12 + iPosition;
        if (i13 > iCapacity) {
            ByteBuffer byteBufferAllocate = allocate(Math.max((int) (iCapacity * 1.6d), i13));
            this.data.position(0);
            byteBufferAllocate.put(this.data);
            byteBufferAllocate.position(iPosition);
            this.data = byteBufferAllocate;
        }
    }

    private <T> boolean writeOptionalFlag(boolean z12, T t12) {
        if (z12) {
            return add(t12 != null);
        }
        return true;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean add(boolean z12) {
        add(z12 ? (byte) 1 : (byte) 0);
        return z12;
    }

    public ByteBuffer data() {
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean isReader() {
        return false;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte add(byte b12) {
        ensureSize(1);
        this.data.put(b12);
        return b12;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public int add(int i12) {
        ensureSize(4);
        this.data.putInt(i12);
        return i12;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public long add(long j12) {
        ensureSize(8);
        this.data.putLong(j12);
        return j12;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public float add(float f12) {
        ensureSize(4);
        this.data.putFloat(f12);
        return f12;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public double add(double d12) {
        ensureSize(8);
        this.data.putDouble(d12);
        return d12;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Boolean add(Boolean bool, boolean z12) {
        if (writeOptionalFlag(z12, bool)) {
            return Boolean.valueOf(add(bool.booleanValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Byte add(Byte b12, boolean z12) {
        if (writeOptionalFlag(z12, b12)) {
            return Byte.valueOf(add(b12.byteValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Integer add(Integer num, boolean z12) {
        if (writeOptionalFlag(z12, num)) {
            return Integer.valueOf(add(num.intValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Long add(Long l12, boolean z12) {
        if (writeOptionalFlag(z12, l12)) {
            return Long.valueOf(add(l12.longValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Float add(Float f12, boolean z12) {
        if (writeOptionalFlag(z12, f12)) {
            return Float.valueOf(add(f12.floatValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Double add(Double d12, boolean z12) {
        if (writeOptionalFlag(z12, d12)) {
            return Double.valueOf(add(d12.doubleValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public ByteBuffer add(ByteBuffer byteBuffer) {
        ensureSize(byteBuffer.capacity());
        this.data.put(byteBuffer);
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte[] add(byte[] bArr, boolean z12) {
        if (!writeOptionalFlag(z12, bArr)) {
            return null;
        }
        add(bArr.length);
        ensureSize(bArr.length);
        this.data.put(bArr);
        return bArr;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public String add(String str, boolean z12) throws UnsupportedEncodingException {
        if (!writeOptionalFlag(z12, str)) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes(Constants.ENCODING);
            add(bytes.length);
            ensureSize(bytes.length);
            this.data.put(bytes);
            return str;
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Enum<T>> T add(T t12, boolean z12, Class<T> cls) {
        if (!writeOptionalFlag(z12, t12)) {
            return null;
        }
        add(t12.ordinal());
        return t12;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> List<T> add(List<T> list, boolean z12, ArchivingHandler<T> archivingHandler) {
        if (!writeOptionalFlag(z12, list)) {
            return null;
        }
        add(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            archivingHandler.add(it.next(), this);
        }
        return list;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Key, Value> Map<Key, Value> add(Map<Key, Value> map, boolean z12, ArchivingHandler<Key> archivingHandler, ArchivingHandler<Value> archivingHandler2) {
        if (!writeOptionalFlag(z12, map)) {
            return null;
        }
        add(map.size());
        for (Map.Entry<Key, Value> entry : map.entrySet()) {
            archivingHandler.add(entry.getKey(), this);
            archivingHandler2.add(entry.getValue(), this);
        }
        return map;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Value> TypeDictionary<Value> add(TypeDictionary<Value> typeDictionary, boolean z12, ArchivingHandler<Value> archivingHandler) {
        if (!writeOptionalFlag(z12, typeDictionary)) {
            return null;
        }
        add(typeDictionary.getAllItems(), false, new StringHandler(), archivingHandler);
        return typeDictionary;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Serializable> T add(T t12, boolean z12, Class<T> cls) throws UnsupportedEncodingException {
        if (!writeOptionalFlag(z12, t12)) {
            return null;
        }
        if (cls.isInterface()) {
            add(t12.getClass().getName(), false);
        }
        t12.serialize(this);
        return t12;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> T add(T t12, ArchivingHandler<T> archivingHandler) {
        return archivingHandler.add(t12, this);
    }

    @Override // com.yandex.runtime.bindings.Archive
    public PointF add(PointF pointF, boolean z12) {
        if (!writeOptionalFlag(z12, pointF)) {
            return null;
        }
        add(pointF.x);
        add(pointF.y);
        return pointF;
    }
}
