package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class H1 {

    /* renamed from: f, reason: collision with root package name */
    public static final H1 f45671f = new H1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f45672a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f45673b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f45674c;

    /* renamed from: d, reason: collision with root package name */
    public int f45675d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45676e;

    public H1() {
        this(0, new int[8], new Object[8], true);
    }

    public static void c(int i12, Object obj, Writer writer) {
        int i13 = i12 >>> 3;
        int i14 = i12 & 7;
        if (i14 == 0) {
            writer.writeInt64(i13, ((Long) obj).longValue());
            return;
        }
        if (i14 == 1) {
            writer.writeFixed64(i13, ((Long) obj).longValue());
            return;
        }
        if (i14 == 2) {
            writer.b(i13, (AbstractC22934w) obj);
            return;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
            writer.writeFixed32(i13, ((Integer) obj).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.f45792b) {
            writer.writeStartGroup(i13);
            ((H1) obj).d(writer);
            writer.writeEndGroup(i13);
        } else {
            writer.writeEndGroup(i13);
            ((H1) obj).d(writer);
            writer.writeStartGroup(i13);
        }
    }

    public final int a() {
        int iE2;
        int i12 = this.f45675d;
        if (i12 != -1) {
            return i12;
        }
        int iA2 = 0;
        for (int i13 = 0; i13 < this.f45672a; i13++) {
            int i14 = this.f45673b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                iE2 = CodedOutputStream.E(i15, ((Long) this.f45674c[i13]).longValue());
            } else if (i16 == 1) {
                ((Long) this.f45674c[i13]).getClass();
                iE2 = CodedOutputStream.o(i15);
            } else if (i16 == 2) {
                iE2 = CodedOutputStream.j(i15, (AbstractC22934w) this.f45674c[i13]);
            } else if (i16 == 3) {
                iA2 = ((H1) this.f45674c[i13]).a() + (CodedOutputStream.B(i15) * 2) + iA2;
            } else {
                if (i16 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.d());
                }
                ((Integer) this.f45674c[i13]).getClass();
                iE2 = CodedOutputStream.n(i15);
            }
            iA2 = iE2 + iA2;
        }
        this.f45675d = iA2;
        return iA2;
    }

    public final void b(int i12, Object obj) {
        if (!this.f45676e) {
            throw new UnsupportedOperationException();
        }
        int i13 = this.f45672a;
        int[] iArr = this.f45673b;
        if (i13 == iArr.length) {
            int i14 = i13 + (i13 < 4 ? 8 : i13 >> 1);
            this.f45673b = Arrays.copyOf(iArr, i14);
            this.f45674c = Arrays.copyOf(this.f45674c, i14);
        }
        int[] iArr2 = this.f45673b;
        int i15 = this.f45672a;
        iArr2[i15] = i12;
        this.f45674c[i15] = obj;
        this.f45672a = i15 + 1;
    }

    public final void d(Writer writer) {
        if (this.f45672a == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.f45792b) {
            for (int i12 = 0; i12 < this.f45672a; i12++) {
                c(this.f45673b[i12], this.f45674c[i12], writer);
            }
            return;
        }
        for (int i13 = this.f45672a - 1; i13 >= 0; i13--) {
            c(this.f45673b[i13], this.f45674c[i13], writer);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H1)) {
            return false;
        }
        H1 h12 = (H1) obj;
        int i12 = this.f45672a;
        if (i12 == h12.f45672a) {
            int[] iArr = this.f45673b;
            int[] iArr2 = h12.f45673b;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    Object[] objArr = this.f45674c;
                    Object[] objArr2 = h12.f45674c;
                    int i14 = this.f45672a;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (objArr[i15].equals(objArr2[i15])) {
                        }
                    }
                    return true;
                }
                if (iArr[i13] != iArr2[i13]) {
                    break;
                }
                i13++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f45672a;
        int i13 = (527 + i12) * 31;
        int[] iArr = this.f45673b;
        int iHashCode = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i13 + i14) * 31;
        Object[] objArr = this.f45674c;
        int i17 = this.f45672a;
        for (int i18 = 0; i18 < i17; i18++) {
            iHashCode = (iHashCode * 31) + objArr[i18].hashCode();
        }
        return i16 + iHashCode;
    }

    public H1(int i12, int[] iArr, Object[] objArr, boolean z12) {
        this.f45675d = -1;
        this.f45672a = i12;
        this.f45673b = iArr;
        this.f45674c = objArr;
        this.f45676e = z12;
    }
}
