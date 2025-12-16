package androidx.media3.extractor.ts;

import androidx.media3.common.util.C23110a;
import java.util.Arrays;

/* compiled from: NalUnitTargetBuffer.java */
/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f51790a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51791b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f51792c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f51793d;

    /* renamed from: e, reason: collision with root package name */
    public int f51794e;

    public r(int i12) {
        this.f51790a = i12;
        byte[] bArr = new byte[131];
        this.f51793d = bArr;
        bArr[2] = 1;
    }

    public final void a(int i12, int i13, byte[] bArr) {
        if (this.f51791b) {
            int i14 = i13 - i12;
            byte[] bArr2 = this.f51793d;
            int length = bArr2.length;
            int i15 = this.f51794e;
            if (length < i15 + i14) {
                this.f51793d = Arrays.copyOf(bArr2, (i15 + i14) * 2);
            }
            System.arraycopy(bArr, i12, this.f51793d, this.f51794e, i14);
            this.f51794e += i14;
        }
    }

    public final boolean b(int i12) {
        if (!this.f51791b) {
            return false;
        }
        this.f51794e -= i12;
        this.f51791b = false;
        this.f51792c = true;
        return true;
    }

    public final void c() {
        this.f51791b = false;
        this.f51792c = false;
    }

    public final void d(int i12) {
        C23110a.g(!this.f51791b);
        boolean z12 = i12 == this.f51790a;
        this.f51791b = z12;
        if (z12) {
            this.f51794e = 3;
            this.f51792c = false;
        }
    }
}
