package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.J;
import java.util.NoSuchElementException;

/* compiled from: IntArrayQueue.java */
@J
/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f49376a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f49377b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f49378c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f49379d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int f49380e;

    public k() {
        this.f49380e = r0.length - 1;
    }

    public final void a(int i12) {
        int i13 = this.f49378c;
        int[] iArr = this.f49379d;
        if (i13 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i14 = this.f49376a;
            int i15 = length2 - i14;
            System.arraycopy(iArr, i14, iArr2, 0, i15);
            System.arraycopy(this.f49379d, 0, iArr2, i15, i14);
            this.f49376a = 0;
            this.f49377b = this.f49378c - 1;
            this.f49379d = iArr2;
            this.f49380e = length - 1;
        }
        int i16 = (this.f49377b + 1) & this.f49380e;
        this.f49377b = i16;
        this.f49379d[i16] = i12;
        this.f49378c++;
    }

    public final int b() {
        int i12 = this.f49378c;
        if (i12 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f49379d;
        int i13 = this.f49376a;
        int i14 = iArr[i13];
        this.f49376a = (i13 + 1) & this.f49380e;
        this.f49378c = i12 - 1;
        return i14;
    }
}
