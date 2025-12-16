package org.joda.time.convert;

/* compiled from: ConverterSet.java */
/* loaded from: classes7.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    public final c[] f420671a;

    /* renamed from: b, reason: collision with root package name */
    public a[] f420672b = new a[16];

    /* compiled from: ConverterSet.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f420673a;

        /* renamed from: b, reason: collision with root package name */
        public final c f420674b;

        public a(Class<?> cls, c cVar) {
            this.f420673a = cls;
            this.f420674b = cVar;
        }
    }

    public e(c[] cVarArr) {
        this.f420671a = cVarArr;
    }

    public final e a(int i12) {
        c[] cVarArr = this.f420671a;
        int length = cVarArr.length;
        if (i12 >= length) {
            throw new IndexOutOfBoundsException();
        }
        c[] cVarArr2 = new c[length - 1];
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != i12) {
                cVarArr2[i13] = cVarArr[i14];
                i13++;
            }
        }
        return new e(cVarArr2);
    }
}
