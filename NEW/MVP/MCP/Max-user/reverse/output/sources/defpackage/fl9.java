package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class fl9 {
    protected volatile int cachedSize = -1;

    public static final <T extends fl9> T mergeFrom(T t, byte[] bArr, int i, int i2) throws InvalidProtocolBufferNanoException {
        try {
            gd3 gd3Var = new gd3(bArr, i, i2);
            t.mergeFrom(gd3Var);
            gd3Var.a(0);
            return t;
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final boolean messageNanoEquals(fl9 fl9Var, fl9 fl9Var2) {
        int serializedSize;
        if (fl9Var == fl9Var2) {
            return true;
        }
        if (fl9Var == null || fl9Var2 == null || fl9Var.getClass() != fl9Var2.getClass() || fl9Var2.getSerializedSize() != (serializedSize = fl9Var.getSerializedSize())) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(fl9Var, bArr, 0, serializedSize);
        toByteArray(fl9Var2, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void toByteArray(fl9 fl9Var, byte[] bArr, int i, int i2) {
        try {
            hd3 hd3Var = new hd3(bArr, i, i2);
            fl9Var.writeTo(hd3Var);
            if (hd3Var.a.remaining() == 0) {
            } else {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract int computeSerializedSize();

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int iComputeSerializedSize = computeSerializedSize();
        this.cachedSize = iComputeSerializedSize;
        return iComputeSerializedSize;
    }

    public abstract fl9 mergeFrom(gd3 gd3Var);

    public String toString() throws SecurityException, IllegalArgumentException {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            svi.f(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    public abstract void writeTo(hd3 hd3Var);

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public fl9 m1clone() throws CloneNotSupportedException {
        return (fl9) super.clone();
    }

    public static final <T extends fl9> T mergeFrom(T t, byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T) mergeFrom(t, bArr, 0, bArr.length);
    }

    public static final byte[] toByteArray(fl9 fl9Var) {
        int serializedSize = fl9Var.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(fl9Var, bArr, 0, serializedSize);
        return bArr;
    }
}
