package androidx.room;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: QueryInterceptorProgram.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/p0;", "LZ1/f;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.p0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23466p0 implements Z1.f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f54388b = new ArrayList();

    @Override // Z1.f
    public final void B4(int i12) {
        a(i12, null);
    }

    public final void a(int i12, Object obj) {
        int size;
        int i13 = i12 - 1;
        ArrayList arrayList = this.f54388b;
        if (i13 >= arrayList.size() && (size = arrayList.size()) <= i13) {
            while (true) {
                arrayList.add(null);
                if (size == i13) {
                    break;
                } else {
                    size++;
                }
            }
        }
        arrayList.set(i13, obj);
    }

    @Override // Z1.f
    public final void f3(double d12, int i12) {
        a(i12, Double.valueOf(d12));
    }

    @Override // Z1.f
    public final void g1(int i12, long j12) {
        a(i12, Long.valueOf(j12));
    }

    @Override // Z1.f
    public final void h4(int i12, @Y61.k String str) {
        a(i12, str);
    }

    @Override // Z1.f
    public final void u4(int i12, @Y61.k byte[] bArr) {
        a(i12, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
