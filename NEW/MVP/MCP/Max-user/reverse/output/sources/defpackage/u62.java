package defpackage;

/* loaded from: classes.dex */
public final class u62 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public byte[] d;
    public int e;

    public /* synthetic */ u62(byte[] bArr, int i, int i2, byte b) {
        this.a = i2;
        this.d = bArr;
        this.e = i;
    }

    public void a() {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.a) {
            case 2:
                int i5 = this.b;
                fsi.d(i5 >= 0 && (i5 < (i = this.e) || (i5 == i && this.c == 0)));
                break;
            case 3:
                int i6 = this.b;
                hsi.g(i6 >= 0 && (i6 < (i2 = this.e) || (i6 == i2 && this.c == 0)));
                break;
            case 4:
                int i7 = this.c;
                fsi.d(i7 >= 0 && (i7 < (i3 = this.b) || (i7 == i3 && this.e == 0)));
                break;
            default:
                int i8 = this.c;
                hsi.g(i8 >= 0 && (i8 < (i4 = this.b) || (i8 == i4 && this.e == 0)));
                break;
        }
    }

    public int b() {
        int i;
        int i2;
        switch (this.a) {
            case 2:
                i = (this.e - this.b) * 8;
                i2 = this.c;
                break;
            default:
                i = (this.e - this.b) * 8;
                i2 = this.c;
                break;
        }
        return i - i2;
    }

    public void c() {
        switch (this.a) {
            case 2:
                if (this.c != 0) {
                    this.c = 0;
                    this.b++;
                    a();
                    break;
                }
                break;
            default:
                if (this.c != 0) {
                    this.c = 0;
                    this.b++;
                    a();
                    break;
                }
                break;
        }
    }

    public boolean d(int i) {
        switch (this.a) {
            case 4:
                int i2 = this.c;
                int i3 = i / 8;
                int i4 = i2 + i3;
                int i5 = (this.e + i) - (i3 * 8);
                if (i5 > 7) {
                    i4++;
                    i5 -= 8;
                }
                while (true) {
                    i2++;
                    if (i2 <= i4 && i4 < this.b) {
                        if (r(i2)) {
                            i4++;
                            i2 += 2;
                        }
                    }
                }
                int i6 = this.b;
                if (i4 >= i6) {
                    if (i4 != i6 || i5 != 0) {
                    }
                }
                break;
            default:
                int i7 = this.c;
                int i8 = i / 8;
                int i9 = i7 + i8;
                int i10 = (this.e + i) - (i8 * 8);
                if (i10 > 7) {
                    i9++;
                    i10 -= 8;
                }
                while (true) {
                    i7++;
                    if (i7 <= i9 && i9 < this.b) {
                        if (r(i7)) {
                            i9++;
                            i7 += 2;
                        }
                    }
                }
                int i11 = this.b;
                if (i9 >= i11) {
                    if (i9 != i11 || i10 != 0) {
                    }
                }
                break;
        }
        return true;
    }

    public boolean e() {
        switch (this.a) {
            case 4:
                int i = this.c;
                int i2 = this.e;
                int i3 = 0;
                while (this.c < this.b && !h()) {
                    i3++;
                }
                boolean z = this.c == this.b;
                this.c = i;
                this.e = i2;
                if (!z && d((i3 * 2) + 1)) {
                    break;
                }
                break;
            default:
                int i4 = this.c;
                int i5 = this.e;
                int i6 = 0;
                while (this.c < this.b && !h()) {
                    i6++;
                }
                boolean z2 = this.c == this.b;
                this.c = i4;
                this.e = i5;
                if (!z2 && d((i6 * 2) + 1)) {
                    break;
                }
                break;
        }
        return true;
    }

    public int f() {
        switch (this.a) {
            case 2:
                fsi.d(this.c == 0);
                break;
            default:
                hsi.g(this.c == 0);
                break;
        }
        return this.b;
    }

    public int g() {
        int i;
        int i2;
        switch (this.a) {
            case 2:
                i = this.b * 8;
                i2 = this.c;
                break;
            default:
                i = this.b * 8;
                i2 = this.c;
                break;
        }
        return i + i2;
    }

    public boolean h() {
        switch (this.a) {
            case 2:
                boolean z = (this.d[this.b] & (128 >> this.c)) != 0;
                s();
                return z;
            case 3:
                boolean z2 = (this.d[this.b] & (128 >> this.c)) != 0;
                s();
                return z2;
            case 4:
                boolean z3 = (this.d[this.c] & (128 >> this.e)) != 0;
                s();
                return z3;
            case 5:
                boolean z4 = (this.d[this.c] & (128 >> this.e)) != 0;
                s();
                return z4;
            case 6:
                boolean z5 = (((this.d[this.c] & 255) >> this.e) & 1) == 1;
                t(1);
                return z5;
            default:
                boolean z6 = (((this.d[this.c] & 255) >> this.e) & 1) == 1;
                t(1);
                return z6;
        }
    }

    public int i(int i) {
        switch (this.a) {
            case 2:
                if (i == 0) {
                    return 0;
                }
                this.c += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.c;
                    if (i3 <= 8) {
                        byte[] bArr = this.d;
                        int i4 = this.b;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((bArr[i4] & 255) >> (8 - i3)));
                        if (i3 == 8) {
                            this.c = 0;
                            this.b = i4 + 1;
                        }
                        a();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.c = i6;
                    byte[] bArr2 = this.d;
                    int i7 = this.b;
                    this.b = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
            case 3:
                if (i == 0) {
                    return 0;
                }
                this.c += i;
                int i8 = 0;
                while (true) {
                    int i9 = this.c;
                    if (i9 <= 8) {
                        byte[] bArr3 = this.d;
                        int i10 = this.b;
                        int i11 = ((-1) >>> (32 - i)) & (i8 | ((bArr3[i10] & 255) >> (8 - i9)));
                        if (i9 == 8) {
                            this.c = 0;
                            this.b = i10 + 1;
                        }
                        a();
                        return i11;
                    }
                    int i12 = i9 - 8;
                    this.c = i12;
                    byte[] bArr4 = this.d;
                    int i13 = this.b;
                    this.b = i13 + 1;
                    i8 |= (bArr4[i13] & 255) << i12;
                }
            case 4:
                this.e += i;
                int i14 = 0;
                while (true) {
                    int i15 = this.e;
                    if (i15 <= 8) {
                        byte[] bArr5 = this.d;
                        int i16 = this.c;
                        int i17 = ((-1) >>> (32 - i)) & (i14 | ((bArr5[i16] & 255) >> (8 - i15)));
                        if (i15 == 8) {
                            this.e = 0;
                            this.c = i16 + (r(i16 + 1) ? 2 : 1);
                        }
                        a();
                        return i17;
                    }
                    int i18 = i15 - 8;
                    this.e = i18;
                    byte[] bArr6 = this.d;
                    int i19 = this.c;
                    i14 |= (bArr6[i19] & 255) << i18;
                    if (!r(i19 + 1)) {
                        i = 1;
                    }
                    this.c = i19 + i;
                }
            case 5:
                this.e += i;
                int i20 = 0;
                while (true) {
                    int i21 = this.e;
                    if (i21 <= 8) {
                        byte[] bArr7 = this.d;
                        int i22 = this.c;
                        int i23 = ((-1) >>> (32 - i)) & (i20 | ((bArr7[i22] & 255) >> (8 - i21)));
                        if (i21 == 8) {
                            this.e = 0;
                            this.c = i22 + (r(i22 + 1) ? 2 : 1);
                        }
                        a();
                        return i23;
                    }
                    int i24 = i21 - 8;
                    this.e = i24;
                    byte[] bArr8 = this.d;
                    int i25 = this.c;
                    i20 |= (bArr8[i25] & 255) << i24;
                    if (!r(i25 + 1)) {
                        i = 1;
                    }
                    this.c = i25 + i;
                }
            case 6:
                int i26 = this.c;
                int iMin = Math.min(i, 8 - this.e);
                byte[] bArr9 = this.d;
                int i27 = i26 + 1;
                int i28 = ((bArr9[i26] & 255) >> this.e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i28 |= (bArr9[i27] & 255) << iMin;
                    iMin += 8;
                    i27++;
                }
                int i29 = i28 & ((-1) >>> (32 - i));
                t(i);
                return i29;
            default:
                int i30 = this.c;
                int iMin2 = Math.min(i, 8 - this.e);
                byte[] bArr10 = this.d;
                int i31 = i30 + 1;
                int i32 = ((bArr10[i30] & 255) >> this.e) & (255 >> (8 - iMin2));
                while (iMin2 < i) {
                    i32 |= (bArr10[i31] & 255) << iMin2;
                    iMin2 += 8;
                    i31++;
                }
                int i33 = i32 & ((-1) >>> (32 - i));
                t(i);
                return i33;
        }
    }

    public void j(int i, byte[] bArr) {
        switch (this.a) {
            case 2:
                int i2 = i >> 3;
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr2 = this.d;
                    int i4 = this.b;
                    int i5 = i4 + 1;
                    this.b = i5;
                    byte b = bArr2[i4];
                    int i6 = this.c;
                    byte b2 = (byte) (b << i6);
                    bArr[i3] = b2;
                    bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
                }
                int i7 = i & 7;
                if (i7 != 0) {
                    byte b3 = (byte) (bArr[i2] & (255 >> i7));
                    bArr[i2] = b3;
                    int i8 = this.c;
                    if (i8 + i7 > 8) {
                        byte[] bArr3 = this.d;
                        int i9 = this.b;
                        this.b = i9 + 1;
                        bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                        this.c = i8 - 8;
                    }
                    int i10 = this.c + i7;
                    this.c = i10;
                    byte[] bArr4 = this.d;
                    int i11 = this.b;
                    bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
                    if (i10 == 8) {
                        this.c = 0;
                        this.b = i11 + 1;
                    }
                    a();
                    break;
                }
                break;
            default:
                int i12 = i >> 3;
                for (int i13 = 0; i13 < i12; i13++) {
                    byte[] bArr5 = this.d;
                    int i14 = this.b;
                    int i15 = i14 + 1;
                    this.b = i15;
                    byte b4 = bArr5[i14];
                    int i16 = this.c;
                    byte b5 = (byte) (b4 << i16);
                    bArr[i13] = b5;
                    bArr[i13] = (byte) (((255 & bArr5[i15]) >> (8 - i16)) | b5);
                }
                int i17 = i & 7;
                if (i17 != 0) {
                    byte b6 = (byte) (bArr[i12] & (255 >> i17));
                    bArr[i12] = b6;
                    int i18 = this.c;
                    if (i18 + i17 > 8) {
                        byte[] bArr6 = this.d;
                        int i19 = this.b;
                        this.b = i19 + 1;
                        bArr[i12] = (byte) (b6 | ((bArr6[i19] & 255) << i18));
                        this.c = i18 - 8;
                    }
                    int i20 = this.c + i17;
                    this.c = i20;
                    byte[] bArr7 = this.d;
                    int i21 = this.b;
                    bArr[i12] = (byte) (((byte) (((255 & bArr7[i21]) >> (8 - i20)) << (8 - i17))) | bArr[i12]);
                    if (i20 == 8) {
                        this.c = 0;
                        this.b = i21 + 1;
                    }
                    a();
                    break;
                }
                break;
        }
    }

    public long k(int i) {
        if (i <= 32) {
            int i2 = i(i);
            String str = zxg.a;
            return 4294967295L & i2;
        }
        int i3 = i(i - 32);
        int i4 = i(32);
        String str2 = zxg.a;
        return (4294967295L & i4) | ((i3 & 4294967295L) << 32);
    }

    public void l(int i, byte[] bArr) {
        switch (this.a) {
            case 2:
                fsi.d(this.c == 0);
                System.arraycopy(this.d, this.b, bArr, 0, i);
                this.b += i;
                a();
                break;
            default:
                hsi.g(this.c == 0);
                System.arraycopy(this.d, this.b, bArr, 0, i);
                this.b += i;
                a();
                break;
        }
    }

    public int m() {
        switch (this.a) {
            case 4:
                int i = 0;
                while (!h()) {
                    i++;
                }
                return ((1 << i) - 1) + (i > 0 ? i(i) : 0);
            default:
                int i2 = 0;
                while (!h()) {
                    i2++;
                }
                return ((1 << i2) - 1) + (i2 > 0 ? i(i2) : 0);
        }
    }

    public int n() {
        int i;
        int i2;
        switch (this.a) {
            case 4:
                int iM = m();
                i = iM % 2 == 0 ? -1 : 1;
                i2 = (iM + 1) / 2;
                break;
            default:
                int iM2 = m();
                i = iM2 % 2 == 0 ? -1 : 1;
                i2 = (iM2 + 1) / 2;
                break;
        }
        return i2 * i;
    }

    public void o(int i, byte[] bArr) {
        switch (this.a) {
            case 2:
                this.d = bArr;
                this.b = 0;
                this.c = 0;
                this.e = i;
                break;
            default:
                this.d = bArr;
                this.b = 0;
                this.c = 0;
                this.e = i;
                break;
        }
    }

    public void p(umb umbVar) {
        o(umbVar.c, umbVar.a);
        q(umbVar.b * 8);
    }

    public void q(int i) {
        switch (this.a) {
            case 2:
                int i2 = i / 8;
                this.b = i2;
                this.c = i - (i2 * 8);
                a();
                break;
            default:
                int i3 = i / 8;
                this.b = i3;
                this.c = i - (i3 * 8);
                a();
                break;
        }
    }

    public boolean r(int i) {
        switch (this.a) {
            case 4:
                if (2 <= i && i < this.b) {
                    byte[] bArr = this.d;
                    if (bArr[i] != 3 || bArr[i - 2] != 0 || bArr[i - 1] != 0) {
                    }
                }
                break;
            default:
                if (2 <= i && i < this.b) {
                    byte[] bArr2 = this.d;
                    if (bArr2[i] != 3 || bArr2[i - 2] != 0 || bArr2[i - 1] != 0) {
                    }
                }
                break;
        }
        return true;
    }

    public void s() {
        switch (this.a) {
            case 2:
                int i = this.c + 1;
                this.c = i;
                if (i == 8) {
                    this.c = 0;
                    this.b++;
                }
                a();
                break;
            case 3:
                int i2 = this.c + 1;
                this.c = i2;
                if (i2 == 8) {
                    this.c = 0;
                    this.b++;
                }
                a();
                break;
            case 4:
                int i3 = this.e + 1;
                this.e = i3;
                if (i3 == 8) {
                    this.e = 0;
                    int i4 = this.c;
                    this.c = i4 + (r(i4 + 1) ? 2 : 1);
                }
                a();
                break;
            default:
                int i5 = this.e + 1;
                this.e = i5;
                if (i5 == 8) {
                    this.e = 0;
                    int i6 = this.c;
                    this.c = i6 + (r(i6 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 2:
                int i4 = i / 8;
                int i5 = this.b + i4;
                this.b = i5;
                int i6 = (i - (i4 * 8)) + this.c;
                this.c = i6;
                if (i6 > 7) {
                    this.b = i5 + 1;
                    this.c = i6 - 8;
                }
                a();
                break;
            case 3:
                int i7 = i / 8;
                int i8 = this.b + i7;
                this.b = i8;
                int i9 = (i - (i7 * 8)) + this.c;
                this.c = i9;
                if (i9 > 7) {
                    this.b = i8 + 1;
                    this.c = i9 - 8;
                }
                a();
                break;
            case 4:
                int i10 = this.c;
                int i11 = i / 8;
                int i12 = i10 + i11;
                this.c = i12;
                int i13 = (i - (i11 * 8)) + this.e;
                this.e = i13;
                if (i13 > 7) {
                    this.c = i12 + 1;
                    this.e = i13 - 8;
                }
                while (true) {
                    i10++;
                    if (i10 > this.c) {
                        a();
                        break;
                    } else if (r(i10)) {
                        this.c++;
                        i10 += 2;
                    }
                }
            case 5:
                int i14 = this.c;
                int i15 = i / 8;
                int i16 = i14 + i15;
                this.c = i16;
                int i17 = (i - (i15 * 8)) + this.e;
                this.e = i17;
                if (i17 > 7) {
                    this.c = i16 + 1;
                    this.e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 > this.c) {
                        a();
                        break;
                    } else if (r(i14)) {
                        this.c++;
                        i14 += 2;
                    }
                }
            case 6:
                int i18 = i / 8;
                int i19 = this.c + i18;
                this.c = i19;
                int i20 = (i - (i18 * 8)) + this.e;
                this.e = i20;
                boolean z = true;
                if (i20 > 7) {
                    this.c = i19 + 1;
                    this.e = i20 - 8;
                }
                int i21 = this.c;
                if (i21 < 0 || (i21 >= (i2 = this.b) && (i21 != i2 || this.e != 0))) {
                    z = false;
                }
                fsi.d(z);
                break;
            default:
                int i22 = i / 8;
                int i23 = this.c + i22;
                this.c = i23;
                int i24 = (i - (i22 * 8)) + this.e;
                this.e = i24;
                boolean z2 = true;
                if (i24 > 7) {
                    this.c = i23 + 1;
                    this.e = i24 - 8;
                }
                int i25 = this.c;
                if (i25 < 0 || (i25 >= (i3 = this.b) && (i25 != i3 || this.e != 0))) {
                    z2 = false;
                }
                hsi.g(z2);
                break;
        }
    }

    public void u(int i) {
        switch (this.a) {
            case 2:
                fsi.d(this.c == 0);
                this.b += i;
                a();
                break;
            default:
                hsi.g(this.c == 0);
                this.b += i;
                a();
                break;
        }
    }

    public u62(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.d = zxg.b;
                break;
            default:
                this.d = xxg.f;
                break;
        }
    }

    public u62(int i, int i2, int i3, byte[] bArr) {
        this.a = i3;
        switch (i3) {
            case 5:
                this.d = bArr;
                this.c = i;
                this.b = i2;
                this.e = 0;
                a();
                break;
            default:
                this.d = bArr;
                this.c = i;
                this.b = i2;
                this.e = 0;
                a();
                break;
        }
    }

    public u62(int i, byte[] bArr) {
        this.a = i;
        switch (i) {
            case 7:
                this.d = bArr;
                this.b = bArr.length;
                break;
            default:
                this.d = bArr;
                this.b = bArr.length;
                break;
        }
    }

    public u62(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = i;
                this.c = i2;
                this.d = new byte[(i2 * 2) - 1];
                this.e = 0;
                break;
            default:
                this.b = i;
                this.c = i2;
                this.d = new byte[(i2 * 2) - 1];
                this.e = 0;
                break;
        }
    }
}
