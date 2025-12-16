package defpackage;

/* loaded from: classes.dex */
public abstract class agi {
    public static final String[] a = {"/proc/self", "/data/data/ru.oneme.app"};

    public static final Object[] a(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ys.m(0, i, 6, objArr, objArr2);
        ys.l(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] b(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ys.m(0, i, 6, objArr, objArr2);
        ys.l(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final int c(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final f8a d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        f8a f8aVar = new f8a();
        f8aVar.e(1, i);
        f8aVar.e(131072, i2);
        f8aVar.e(2, i3);
        f8aVar.e(4, i4);
        f8aVar.e(8, i5);
        f8aVar.e(16, i6);
        f8aVar.e(64, i7);
        f8aVar.e(128, i8);
        f8aVar.e(256, i9);
        f8aVar.e(i10, i11);
        f8aVar.e(i12, i13);
        f8aVar.e(2048, i14);
        f8aVar.e(8192, i15);
        f8aVar.e(65536, i16);
        return f8aVar;
    }

    public static final f8a e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        f8a f8aVar = new f8a();
        f8aVar.e(1, i);
        f8aVar.e(2, i2);
        f8aVar.e(4, i3);
        f8aVar.e(8, i4);
        f8aVar.e(65536, i5);
        f8aVar.e(16, i6);
        f8aVar.e(32768, i7);
        f8aVar.e(32, i8);
        f8aVar.e(64, i9);
        f8aVar.e(256, i10);
        f8aVar.e(128, i11);
        f8aVar.e(i12, i13);
        f8aVar.e(i14, i15);
        f8aVar.e(i16, i17);
        f8aVar.e(2048, i18);
        f8aVar.e(131072, i19);
        f8aVar.e(262144, i20);
        f8aVar.e(524288, i21);
        return f8aVar;
    }
}
