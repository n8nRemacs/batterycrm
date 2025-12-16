package com.google.crypto.tink.shaded.protobuf;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = getUnsafe();
    private static final Class<?> MEMORY_CLASS = Android.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final MemoryAccessor MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    public static final class Android32MemoryAccessor extends MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        public Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long j12) {
            return (int) j12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j12, byte[] bArr, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j12) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(obj, j12) : UnsafeUtil.getBooleanLittleEndian(obj, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j12) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(obj, j12) : UnsafeUtil.getByteLittleEndian(obj, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j12) {
            return Double.longBitsToDouble(getLong(obj, j12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j12) {
            return Float.intBitsToFloat(getInt(obj, j12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j12, boolean z12) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(obj, j12, z12);
            } else {
                UnsafeUtil.putBooleanLittleEndian(obj, j12, z12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j12, byte b12) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(obj, j12, b12);
            } else {
                UnsafeUtil.putByteLittleEndian(obj, j12, b12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j12, double d12) {
            putLong(obj, j12, Double.doubleToLongBits(d12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j12, float f12) {
            putInt(obj, j12, Float.floatToIntBits(f12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j12, int i12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j12, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j12, byte b12) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Android64MemoryAccessor extends MemoryAccessor {
        public Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j12, byte[] bArr, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j12) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(obj, j12) : UnsafeUtil.getBooleanLittleEndian(obj, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j12) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(obj, j12) : UnsafeUtil.getByteLittleEndian(obj, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j12) {
            return Double.longBitsToDouble(getLong(obj, j12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j12) {
            return Float.intBitsToFloat(getInt(obj, j12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j12, boolean z12) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(obj, j12, z12);
            } else {
                UnsafeUtil.putBooleanLittleEndian(obj, j12, z12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j12, byte b12) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(obj, j12, b12);
            } else {
                UnsafeUtil.putByteLittleEndian(obj, j12, b12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j12, double d12) {
            putLong(obj, j12, Double.doubleToLongBits(d12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j12, float f12) {
            putInt(obj, j12, Float.floatToIntBits(f12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j12, int i12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j12, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j12, byte b12) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class JvmMemoryAccessor extends MemoryAccessor {
        public JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j12, byte[] bArr, long j13, long j14) {
            this.unsafe.copyMemory((Object) null, j12, bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j13, j14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j12) {
            return this.unsafe.getBoolean(obj, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j12) {
            return this.unsafe.getByte(obj, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j12) {
            return this.unsafe.getDouble(obj, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j12) {
            return this.unsafe.getFloat(obj, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j12) {
            return this.unsafe.getInt(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j12) {
            return this.unsafe.getLong(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j12, boolean z12) {
            this.unsafe.putBoolean(obj, j12, z12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j12, byte b12) {
            this.unsafe.putByte(obj, j12, b12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j12, double d12) {
            this.unsafe.putDouble(obj, j12, d12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j12, float f12) {
            this.unsafe.putFloat(obj, j12, f12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j12, int i12) {
            this.unsafe.putInt(j12, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j12, long j13) {
            this.unsafe.putLong(j12, j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j12, long j13, long j14) {
            this.unsafe.copyMemory(bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j12, (Object) null, j13, j14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j12) {
            return this.unsafe.getByte(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j12, byte b12) {
            this.unsafe.putByte(j12, b12);
        }
    }

    public static abstract class MemoryAccessor {
        Unsafe unsafe;

        public MemoryAccessor(Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.unsafe.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.unsafe.arrayIndexScale(cls);
        }

        public abstract void copyMemory(long j12, byte[] bArr, long j13, long j14);

        public abstract void copyMemory(byte[] bArr, long j12, long j13, long j14);

        public abstract boolean getBoolean(Object obj, long j12);

        public abstract byte getByte(long j12);

        public abstract byte getByte(Object obj, long j12);

        public abstract double getDouble(Object obj, long j12);

        public abstract float getFloat(Object obj, long j12);

        public abstract int getInt(long j12);

        public final int getInt(Object obj, long j12) {
            return this.unsafe.getInt(obj, j12);
        }

        public abstract long getLong(long j12);

        public final long getLong(Object obj, long j12) {
            return this.unsafe.getLong(obj, j12);
        }

        public final Object getObject(Object obj, long j12) {
            return this.unsafe.getObject(obj, j12);
        }

        public abstract Object getStaticObject(java.lang.reflect.Field field);

        public final long objectFieldOffset(java.lang.reflect.Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j12, boolean z12);

        public abstract void putByte(long j12, byte b12);

        public abstract void putByte(Object obj, long j12, byte b12);

        public abstract void putDouble(Object obj, long j12, double d12);

        public abstract void putFloat(Object obj, long j12, float f12);

        public abstract void putInt(long j12, int i12);

        public final void putInt(Object obj, long j12, int i12) {
            this.unsafe.putInt(obj, j12, i12);
        }

        public abstract void putLong(long j12, long j13);

        public final void putLong(Object obj, long j12, long j13) {
            this.unsafe.putLong(obj, j12, j13);
        }

        public final void putObject(Object obj, long j12, Object obj2) {
            this.unsafe.putObject(obj, j12, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return UnsafeUtil.bufferAddressField() != null;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }
    }

    static {
        long jArrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = jArrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (jArrayBaseOffset & 7);
        IS_BIG_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private UnsafeUtil() {
    }

    public static long addressOffset(ByteBuffer byteBuffer) {
        return MEMORY_ACCESSOR.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    public static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    private static int arrayBaseOffset(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field bufferAddressField() {
        java.lang.reflect.Field field;
        if (Android.isOnAndroidDevice() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        java.lang.reflect.Field field2 = field(Buffer.class, AddressParameter.TYPE);
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void copyMemory(byte[] bArr, long j12, long j13, long j14) {
        MEMORY_ACCESSOR.copyMemory(bArr, j12, j13, j14);
    }

    public static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (!Android.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class<?> cls2 = MEMORY_CLASS;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static java.lang.reflect.Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(java.lang.reflect.Field field) {
        MemoryAccessor memoryAccessor;
        if (field == null || (memoryAccessor = MEMORY_ACCESSOR) == null) {
            return -1L;
        }
        return memoryAccessor.objectFieldOffset(field);
    }

    private static int firstDifferingByteIndexNativeEndian(long j12, long j13) {
        return (IS_BIG_ENDIAN ? Long.numberOfLeadingZeros(j12 ^ j13) : Long.numberOfTrailingZeros(j12 ^ j13)) >> 3;
    }

    public static boolean getBoolean(Object obj, long j12) {
        return MEMORY_ACCESSOR.getBoolean(obj, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j12) {
        return getByteBigEndian(obj, j12) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j12) {
        return getByteLittleEndian(obj, j12) != 0;
    }

    public static byte getByte(Object obj, long j12) {
        return MEMORY_ACCESSOR.getByte(obj, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j12) {
        return (byte) ((getInt(obj, (-4) & j12) >>> ((int) (((~j12) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j12) {
        return (byte) ((getInt(obj, (-4) & j12) >>> ((int) ((j12 & 3) << 3))) & 255);
    }

    public static double getDouble(Object obj, long j12) {
        return MEMORY_ACCESSOR.getDouble(obj, j12);
    }

    public static float getFloat(Object obj, long j12) {
        return MEMORY_ACCESSOR.getFloat(obj, j12);
    }

    public static int getInt(Object obj, long j12) {
        return MEMORY_ACCESSOR.getInt(obj, j12);
    }

    public static long getLong(Object obj, long j12) {
        return MEMORY_ACCESSOR.getLong(obj, j12);
    }

    private static MemoryAccessor getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (!Android.isOnAndroidDevice()) {
            return new JvmMemoryAccessor(unsafe);
        }
        if (IS_ANDROID_64) {
            return new Android64MemoryAccessor(unsafe);
        }
        if (IS_ANDROID_32) {
            return new Android32MemoryAccessor(unsafe);
        }
        return null;
    }

    public static Object getObject(Object obj, long j12) {
        return MEMORY_ACCESSOR.getObject(obj, j12);
    }

    public static Object getStaticObject(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.crypto.tink.shaded.protobuf.UnsafeUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
                    for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    public static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    public static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable th2) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static int mismatch(byte[] bArr, int i12, byte[] bArr2, int i13, int i14) {
        if (i12 < 0 || i13 < 0 || i14 < 0 || i12 + i14 > bArr.length || i13 + i14 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i15 = 0;
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            for (int i16 = (BYTE_ARRAY_ALIGNMENT + i12) & 7; i15 < i14 && (i16 & 7) != 0; i16++) {
                if (bArr[i12 + i15] != bArr2[i13 + i15]) {
                    return i15;
                }
                i15++;
            }
            int i17 = ((i14 - i15) & (-8)) + i15;
            while (i15 < i17) {
                long j12 = BYTE_ARRAY_BASE_OFFSET;
                long j13 = i15;
                long j14 = getLong((Object) bArr, i12 + j12 + j13);
                long j15 = getLong((Object) bArr2, j12 + i13 + j13);
                if (j14 != j15) {
                    return i15 + firstDifferingByteIndexNativeEndian(j14, j15);
                }
                i15 += 8;
            }
        }
        while (i15 < i14) {
            if (bArr[i12 + i15] != bArr2[i13 + i15]) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    public static long objectFieldOffset(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    public static void putBoolean(Object obj, long j12, boolean z12) {
        MEMORY_ACCESSOR.putBoolean(obj, j12, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j12, boolean z12) {
        putByteBigEndian(obj, j12, z12 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j12, boolean z12) {
        putByteLittleEndian(obj, j12, z12 ? (byte) 1 : (byte) 0);
    }

    public static void putByte(Object obj, long j12, byte b12) {
        MEMORY_ACCESSOR.putByte(obj, j12, b12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        int i12 = getInt(obj, j13);
        int i13 = ((~((int) j12)) & 3) << 3;
        putInt(obj, j13, ((255 & b12) << i13) | (i12 & (~(255 << i13))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        int i12 = (((int) j12) & 3) << 3;
        putInt(obj, j13, ((255 & b12) << i12) | (getInt(obj, j13) & (~(255 << i12))));
    }

    public static void putDouble(Object obj, long j12, double d12) {
        MEMORY_ACCESSOR.putDouble(obj, j12, d12);
    }

    public static void putFloat(Object obj, long j12, float f12) {
        MEMORY_ACCESSOR.putFloat(obj, j12, f12);
    }

    public static void putInt(Object obj, long j12, int i12) {
        MEMORY_ACCESSOR.putInt(obj, j12, i12);
    }

    public static void putLong(Object obj, long j12, long j13) {
        MEMORY_ACCESSOR.putLong(obj, j12, j13);
    }

    public static void putObject(Object obj, long j12, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j12, obj2);
    }

    private static boolean supportsUnsafeArrayOperations() {
        MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeByteBufferOperations();
    }

    public static void copyMemory(long j12, byte[] bArr, long j13, long j14) {
        MEMORY_ACCESSOR.copyMemory(j12, bArr, j13, j14);
    }

    public static boolean getBoolean(boolean[] zArr, long j12) {
        return MEMORY_ACCESSOR.getBoolean(zArr, (j12 * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET);
    }

    public static byte getByte(byte[] bArr, long j12) {
        return MEMORY_ACCESSOR.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j12);
    }

    public static double getDouble(double[] dArr, long j12) {
        return MEMORY_ACCESSOR.getDouble(dArr, (j12 * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET);
    }

    public static float getFloat(float[] fArr, long j12) {
        return MEMORY_ACCESSOR.getFloat(fArr, (j12 * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET);
    }

    public static int getInt(int[] iArr, long j12) {
        return MEMORY_ACCESSOR.getInt(iArr, (j12 * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET);
    }

    public static long getLong(long[] jArr, long j12) {
        return MEMORY_ACCESSOR.getLong(jArr, (j12 * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET);
    }

    public static Object getObject(Object[] objArr, long j12) {
        return MEMORY_ACCESSOR.getObject(objArr, (j12 * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET);
    }

    public static void putBoolean(boolean[] zArr, long j12, boolean z12) {
        MEMORY_ACCESSOR.putBoolean(zArr, (j12 * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET, z12);
    }

    public static void putByte(byte[] bArr, long j12, byte b12) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j12, b12);
    }

    public static void putDouble(double[] dArr, long j12, double d12) {
        MEMORY_ACCESSOR.putDouble(dArr, (j12 * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET, d12);
    }

    public static void putFloat(float[] fArr, long j12, float f12) {
        MEMORY_ACCESSOR.putFloat(fArr, (j12 * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET, f12);
    }

    public static void putInt(int[] iArr, long j12, int i12) {
        MEMORY_ACCESSOR.putInt(iArr, (j12 * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET, i12);
    }

    public static void putLong(long[] jArr, long j12, long j13) {
        MEMORY_ACCESSOR.putLong(jArr, (j12 * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET, j13);
    }

    public static void putObject(Object[] objArr, long j12, Object obj) {
        MEMORY_ACCESSOR.putObject(objArr, (j12 * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET, obj);
    }

    public static void copyMemory(byte[] bArr, long j12, byte[] bArr2, long j13, long j14) {
        System.arraycopy(bArr, (int) j12, bArr2, (int) j13, (int) j14);
    }

    public static byte getByte(long j12) {
        return MEMORY_ACCESSOR.getByte(j12);
    }

    public static int getInt(long j12) {
        return MEMORY_ACCESSOR.getInt(j12);
    }

    public static long getLong(long j12) {
        return MEMORY_ACCESSOR.getLong(j12);
    }

    public static void putByte(long j12, byte b12) {
        MEMORY_ACCESSOR.putByte(j12, b12);
    }

    public static void putInt(long j12, int i12) {
        MEMORY_ACCESSOR.putInt(j12, i12);
    }

    public static void putLong(long j12, long j13) {
        MEMORY_ACCESSOR.putLong(j12, j13);
    }
}
