package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes8.dex */
public final class vg {

    /* renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f390868e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f390869a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f390870b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f390871c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f390872d = 4096;

    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public final synchronized byte[] a(int i12) {
        for (int i13 = 0; i13 < this.f390870b.size(); i13++) {
            byte[] bArr = (byte[]) this.f390870b.get(i13);
            if (bArr.length >= i12) {
                this.f390871c -= bArr.length;
                this.f390870b.remove(i13);
                this.f390869a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i12];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f390872d) {
                this.f390869a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f390870b, bArr, f390868e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f390870b.add(iBinarySearch, bArr);
                this.f390871c += bArr.length;
                synchronized (this) {
                    while (this.f390871c > this.f390872d) {
                        byte[] bArr2 = (byte[]) this.f390869a.remove(0);
                        this.f390870b.remove(bArr2);
                        this.f390871c -= bArr2.length;
                    }
                }
            }
        }
    }
}
