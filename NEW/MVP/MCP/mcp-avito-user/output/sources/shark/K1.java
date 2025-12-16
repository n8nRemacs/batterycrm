package shark;

import kotlin.Metadata;
import shark.M1;

/* compiled from: HeapField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/K1;", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M1.b f438093a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f438094b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final X1 f438095c;

    public K1(@Y61.k M1.b bVar, @Y61.k String str, @Y61.k X1 x12) {
        this.f438093a = bVar;
        this.f438094b = str;
        this.f438095c = x12;
    }

    @Y61.l
    public final M1.c a() {
        M1 m1E = this.f438095c.e();
        if (m1E != null) {
            return m1E.a();
        }
        return null;
    }

    @Y61.l
    public final M1.d b() {
        M1 m1E = this.f438095c.e();
        if (m1E == null || !(m1E instanceof M1.d)) {
            return null;
        }
        return (M1.d) m1E;
    }
}
