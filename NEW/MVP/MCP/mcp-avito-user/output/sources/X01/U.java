package x01;

/* loaded from: classes7.dex */
public class U {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f442006a;

    /* renamed from: b, reason: collision with root package name */
    public int f442007b;

    public final void a(byte[] bArr, int i12) {
        if (i12 <= 0) {
            return;
        }
        byte[] bArr2 = this.f442006a;
        int length = bArr2.length;
        int i13 = this.f442007b;
        if (length - i13 >= i12) {
            System.arraycopy(bArr, 0, bArr2, i13, i12);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i12) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i13);
            System.arraycopy(bArr, 0, bArr3, this.f442007b, i12);
            this.f442006a = bArr3;
        }
        this.f442007b += i12;
    }

    public final byte[] b() {
        int i12 = this.f442007b;
        if (i12 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i12];
        System.arraycopy(this.f442006a, 0, bArr, 0, i12);
        return bArr;
    }
}
