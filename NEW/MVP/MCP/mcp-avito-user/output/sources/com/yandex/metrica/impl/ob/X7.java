package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

/* loaded from: classes7.dex */
public class X7 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC38922k8 f379874a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC38922k8 f379875b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<AbstractC38922k8> f379876c;

    /* renamed from: d, reason: collision with root package name */
    private final Y7 f379877d;

    public static class b {
        public X7 a(@j.N String str, @j.N AbstractC38922k8 abstractC38922k8, @j.N AbstractC38922k8 abstractC38922k82, @j.N SparseArray<AbstractC38922k8> sparseArray, @j.N Y7 y72) {
            return new X7(str, abstractC38922k8, abstractC38922k82, sparseArray, y72);
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f379874a.a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    public void b(SQLiteDatabase sQLiteDatabase) {
        try {
            Y7 y72 = this.f379877d;
            if (y72 == null || ((Z7) y72).a(sQLiteDatabase)) {
                return;
            }
            try {
                this.f379875b.a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            this.f379874a.a(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    private X7(String str, AbstractC38922k8 abstractC38922k8, AbstractC38922k8 abstractC38922k82, SparseArray<AbstractC38922k8> sparseArray, Y7 y72) {
        this.f379874a = abstractC38922k8;
        this.f379875b = abstractC38922k82;
        this.f379876c = sparseArray;
        this.f379877d = y72;
    }

    public void a(@j.N SQLiteDatabase sQLiteDatabase, int i12, int i13) {
        if (i12 > i13) {
            try {
                this.f379875b.a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            try {
                this.f379874a.a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
        }
    }

    public void b(SQLiteDatabase sQLiteDatabase, int i12, int i13) {
        boolean z12;
        if (i13 > i12) {
            for (int i14 = i12 + 1; i14 <= i13; i14++) {
                try {
                    AbstractC38922k8 abstractC38922k8 = this.f379876c.get(i14);
                    if (abstractC38922k8 != null) {
                        abstractC38922k8.a(sQLiteDatabase);
                    }
                } catch (Throwable unused) {
                }
            }
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12 || (!((Z7) this.f379877d).a(sQLiteDatabase))) {
            try {
                this.f379875b.a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                this.f379874a.a(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
