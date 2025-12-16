package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.common.util.InterfaceC23119j;

/* compiled from: SpannedData.java */
/* loaded from: classes.dex */
final class X<V> {

    /* renamed from: a, reason: collision with root package name */
    public int f49702a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f49703b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC23119j<V> f49704c;

    public X() {
        this(new N(1));
    }

    public final V a(int i12) {
        SparseArray<V> sparseArray;
        if (this.f49702a == -1) {
            this.f49702a = 0;
        }
        while (true) {
            int i13 = this.f49702a;
            sparseArray = this.f49703b;
            if (i13 <= 0 || i12 >= sparseArray.keyAt(i13)) {
                break;
            }
            this.f49702a--;
        }
        while (this.f49702a < sparseArray.size() - 1 && i12 >= sparseArray.keyAt(this.f49702a + 1)) {
            this.f49702a++;
        }
        return sparseArray.valueAt(this.f49702a);
    }

    public X(InterfaceC23119j<V> interfaceC23119j) {
        this.f49703b = new SparseArray<>();
        this.f49704c = interfaceC23119j;
        this.f49702a = -1;
    }
}
