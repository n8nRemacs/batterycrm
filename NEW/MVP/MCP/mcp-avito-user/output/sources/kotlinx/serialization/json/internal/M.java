package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.p;

/* compiled from: JsonPath.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/M;", "", "<init>", "()V", "a", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public Object[] f413016a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public int[] f413017b;

    /* renamed from: c, reason: collision with root package name */
    public int f413018c;

    /* compiled from: JsonPath.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/M$a;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f413019a = new a();
    }

    public M() {
        int[] iArr = new int[8];
        for (int i12 = 0; i12 < 8; i12++) {
            iArr[i12] = -1;
        }
        this.f413017b = iArr;
        this.f413018c = -1;
    }

    @Y61.k
    public final String a() {
        StringBuilder sb2 = new StringBuilder("$");
        int i12 = this.f413018c + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            Object obj = this.f413016a[i13];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!kotlin.jvm.internal.L.f(serialDescriptor.getKind(), p.b.f412752a)) {
                    int i14 = this.f413017b[i13];
                    if (i14 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.d(i14));
                    }
                } else if (this.f413017b[i13] != -1) {
                    sb2.append("[");
                    sb2.append(this.f413017b[i13]);
                    sb2.append("]");
                }
            } else if (obj != a.f413019a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    @Y61.k
    public final String toString() {
        return a();
    }
}
