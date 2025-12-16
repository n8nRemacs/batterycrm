package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: ByteArrayPool.java */
/* renamed from: com.android.volley.toolbox.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27628h {

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator<byte[]> f67121e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f67122a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f67123b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    public int f67124c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f67125d = 4096;

    /* compiled from: ByteArrayPool.java */
    /* renamed from: com.android.volley.toolbox.h$a */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public final synchronized byte[] a(int i12) {
        for (int i13 = 0; i13 < this.f67123b.size(); i13++) {
            byte[] bArr = (byte[]) this.f67123b.get(i13);
            if (bArr.length >= i12) {
                this.f67124c -= bArr.length;
                this.f67123b.remove(i13);
                this.f67122a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i12];
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f67125d) {
                this.f67122a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f67123b, bArr, f67121e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f67123b.add(iBinarySearch, bArr);
                this.f67124c += bArr.length;
                synchronized (this) {
                    while (this.f67124c > this.f67125d) {
                        byte[] bArr2 = (byte[]) this.f67122a.remove(0);
                        this.f67123b.remove(bArr2);
                        this.f67124c -= bArr2.length;
                    }
                }
            }
        }
    }
}
