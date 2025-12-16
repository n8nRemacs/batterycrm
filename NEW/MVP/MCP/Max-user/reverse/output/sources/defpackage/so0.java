package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class so0 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public so0(int i) {
        this.a = i;
    }

    public void a(py4 py4Var) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        int iHashCode = py4Var.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(py4Var)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(py4Var));
            return;
        }
        objArr[i2] = py4Var;
        int i3 = this.b + 1;
        this.b = i3;
        if (i3 < this.c) {
            return;
        }
        Object[] objArr2 = (Object[]) this.d;
        int length = objArr2.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        Object[] objArr3 = new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.a = i5;
                this.c = (int) (i4 * 0.75f);
                this.d = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i7 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i5;
            if (objArr3[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (objArr3[i7] != null);
            }
            objArr3[i7] = objArr2[length];
            i3 = i6;
        }
    }

    public mv4 b() {
        hsi.b(this.b <= this.c);
        return new mv4(this);
    }

    public void c(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else if (i < i5 || i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public void d(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        int i2 = this.c;
        if (i2 + i < 8) {
            this.a <<= i;
            this.b -= i;
            this.c = i2 + i;
            return;
        }
        this.a <<= 8 - i2;
        if (byteBuffer.remaining() > 0) {
            this.a = (byteBuffer.get() & 255) | this.a;
            this.b += 8;
        } else {
            this.a |= 255;
        }
        int i3 = i - (8 - this.c);
        this.a <<= i3;
        this.b -= i;
        this.c = i3;
    }
}
