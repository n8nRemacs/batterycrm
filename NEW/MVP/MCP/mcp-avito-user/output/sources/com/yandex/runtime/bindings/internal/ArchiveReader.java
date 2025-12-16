package com.yandex.runtime.bindings.internal;

import android.graphics.PointF;
import androidx.compose.ui.graphics.colorspace.e;
import com.adjust.sdk.Constants;
import com.yandex.runtime.TypeDictionary;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ArchiveReader implements Archive {
    private final ByteBuffer data;

    public ArchiveReader(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        byteBuffer.position(0);
        byteBuffer.order(ByteOrder.nativeOrder());
    }

    private static <T> T create(Class<T> cls) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e12) {
            throw new RuntimeException(e.n("Cannot create an instance of class ", cls.getName(), ". ", e12.getMessage()));
        }
    }

    private boolean readOptionalFlag() {
        return add(false);
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean add(boolean z12) {
        byte bAdd = add((byte) 0);
        if (bAdd == 1) {
            return true;
        }
        if (bAdd == 0) {
            return false;
        }
        throw new RuntimeException(String.format("0x%02x is not valid boolean value", Byte.valueOf(bAdd)));
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean isReader() {
        return true;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte add(byte b12) {
        return this.data.get();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public int add(int i12) {
        return this.data.getInt();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public long add(long j12) {
        return this.data.getLong();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public float add(float f12) {
        return this.data.getFloat();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public double add(double d12) {
        return this.data.getDouble();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Boolean add(Boolean bool, boolean z12) {
        if (!z12 || readOptionalFlag()) {
            return Boolean.valueOf(add(false));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Byte add(Byte b12, boolean z12) {
        if (!z12 || readOptionalFlag()) {
            return Byte.valueOf(add((byte) 0));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Integer add(Integer num, boolean z12) {
        if (!z12 || readOptionalFlag()) {
            return Integer.valueOf(add(0));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Long add(Long l12, boolean z12) {
        if (!z12 || readOptionalFlag()) {
            return Long.valueOf(add(0L));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Float add(Float f12, boolean z12) {
        if (!z12 || readOptionalFlag()) {
            return Float.valueOf(add(0.0f));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Double add(Double d12, boolean z12) {
        if (!z12 || readOptionalFlag()) {
            return Double.valueOf(add(0.0d));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public ByteBuffer add(ByteBuffer byteBuffer) {
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte[] add(byte[] bArr, boolean z12) {
        if (z12 && !readOptionalFlag()) {
            return null;
        }
        byte[] bArr2 = new byte[add(0)];
        this.data.get(bArr2);
        return bArr2;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public String add(String str, boolean z12) {
        if (z12 && !readOptionalFlag()) {
            return null;
        }
        try {
            byte[] bArr = new byte[add(0)];
            this.data.get(bArr);
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Enum<T>> T add(T t12, boolean z12, Class<T> cls) {
        if (!z12 || readOptionalFlag()) {
            return cls.getEnumConstants()[add(0)];
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> List<T> add(List<T> list, boolean z12, ArchivingHandler<T> archivingHandler) {
        if (z12 && !readOptionalFlag()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iAdd = add(0);
        for (int i12 = 0; i12 < iAdd; i12++) {
            arrayList.add(archivingHandler.add(null, this));
        }
        return arrayList;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Key, Value> Map<Key, Value> add(Map<Key, Value> map, boolean z12, ArchivingHandler<Key> archivingHandler, ArchivingHandler<Value> archivingHandler2) {
        if (z12 && !readOptionalFlag()) {
            return null;
        }
        HashMap map2 = new HashMap();
        int iAdd = add(0);
        for (int i12 = 0; i12 < iAdd; i12++) {
            map2.put(archivingHandler.add(null, this), archivingHandler2.add(null, this));
        }
        return map2;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Value> TypeDictionary<Value> add(TypeDictionary<Value> typeDictionary, boolean z12, ArchivingHandler<Value> archivingHandler) {
        if (!z12 || readOptionalFlag()) {
            return new TypeDictionaryImpl(add(null, false, new StringHandler(), archivingHandler));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Serializable> T add(T t12, boolean z12, Class<T> cls) {
        if (z12 && !readOptionalFlag()) {
            return null;
        }
        if (cls.isInterface()) {
            try {
                cls = (Class<T>) Class.forName(add((String) null, false));
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(e12);
            }
        }
        T t13 = (T) create(cls);
        t13.serialize(this);
        return t13;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> T add(T t12, ArchivingHandler<T> archivingHandler) {
        return archivingHandler.add(t12, this);
    }

    @Override // com.yandex.runtime.bindings.Archive
    public PointF add(PointF pointF, boolean z12) {
        if (!z12 || readOptionalFlag()) {
            return new PointF(add(0.0f), add(0.0f));
        }
        return null;
    }
}
