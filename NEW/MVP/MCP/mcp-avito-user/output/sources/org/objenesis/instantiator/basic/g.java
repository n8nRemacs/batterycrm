package org.objenesis.instantiator.basic;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: ObjectInputStreamInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class g<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ObjectInputStream f421793a;

    public g(Class<T> cls) {
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new ObjenesisException(new NotSerializableException(cls + " not serializable"));
        }
        try {
            this.f421793a = new ObjectInputStream(new a(cls));
        } catch (IOException e12) {
            throw new Error("IOException: " + e12.getMessage());
        }
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            return (T) this.f421793a.readObject();
        } catch (ClassNotFoundException e12) {
            throw new Error("ClassNotFoundException: " + e12.getMessage());
        } catch (Exception e13) {
            throw new ObjenesisException(e13);
        }
    }

    /* compiled from: ObjectInputStreamInstantiator.java */
    public static class a extends InputStream {

        /* renamed from: f, reason: collision with root package name */
        public static final int[] f421794f = {1, 2, 2};

        /* renamed from: g, reason: collision with root package name */
        public static final byte[] f421795g;

        /* renamed from: h, reason: collision with root package name */
        public static final byte[] f421796h;

        /* renamed from: e, reason: collision with root package name */
        public final byte[][] f421800e;

        /* renamed from: b, reason: collision with root package name */
        public int f421797b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f421799d = 0;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f421798c = f421795g;

        static {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeShort(-21267);
                dataOutputStream.writeShort(5);
                f421795g = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
                dataOutputStream2.writeByte(115);
                dataOutputStream2.writeByte(113);
                dataOutputStream2.writeInt(8257536);
                f421796h = byteArrayOutputStream2.toByteArray();
            } catch (IOException e12) {
                throw new Error("IOException: " + e12.getMessage());
            }
        }

        public a(Class<?> cls) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeByte(115);
                dataOutputStream.writeByte(114);
                dataOutputStream.writeUTF(cls.getName());
                dataOutputStream.writeLong(ObjectStreamClass.lookup(cls).getSerialVersionUID());
                dataOutputStream.writeByte(2);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeByte(120);
                dataOutputStream.writeByte(112);
                this.f421800e = new byte[][]{f421795g, byteArrayOutputStream.toByteArray(), f421796h};
            } catch (IOException e12) {
                throw new Error("IOException: " + e12.getMessage());
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            return Integer.MAX_VALUE;
        }

        @Override // java.io.InputStream
        public final int read() {
            byte[] bArr = this.f421798c;
            int i12 = this.f421797b;
            int i13 = i12 + 1;
            this.f421797b = i13;
            byte b12 = bArr[i12];
            if (i13 >= bArr.length) {
                this.f421797b = 0;
                int i14 = f421794f[this.f421799d];
                this.f421799d = i14;
                this.f421798c = this.f421800e[i14];
            }
            return b12;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i12, int i13) {
            int length = this.f421798c.length - this.f421797b;
            int i14 = i13;
            while (length <= i14) {
                System.arraycopy(this.f421798c, this.f421797b, bArr, i12, length);
                i12 += length;
                i14 -= length;
                this.f421797b = 0;
                int i15 = f421794f[this.f421799d];
                this.f421799d = i15;
                byte[] bArr2 = this.f421800e[i15];
                this.f421798c = bArr2;
                length = bArr2.length;
            }
            if (i14 > 0) {
                System.arraycopy(this.f421798c, this.f421797b, bArr, i12, i14);
                this.f421797b += i14;
            }
            return i13;
        }
    }
}
