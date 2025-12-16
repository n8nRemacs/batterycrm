package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.InterfaceC36593i;

/* compiled from: SpannedData.java */
/* loaded from: classes6.dex */
final class U<V> {

    /* renamed from: a, reason: collision with root package name */
    public int f346144a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f346145b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC36593i<V> f346146c;

    public U() {
        this(new K(1));
    }

    public final V a(int i12) {
        SparseArray<V> sparseArray;
        if (this.f346144a == -1) {
            this.f346144a = 0;
        }
        while (true) {
            int i13 = this.f346144a;
            sparseArray = this.f346145b;
            if (i13 <= 0 || i12 >= sparseArray.keyAt(i13)) {
                break;
            }
            this.f346144a--;
        }
        while (this.f346144a < sparseArray.size() - 1 && i12 >= sparseArray.keyAt(this.f346144a + 1)) {
            this.f346144a++;
        }
        return sparseArray.valueAt(this.f346144a);
    }

    public U(InterfaceC36593i<V> interfaceC36593i) {
        this.f346145b = new SparseArray<>();
        this.f346146c = interfaceC36593i;
        this.f346144a = -1;
    }
}
