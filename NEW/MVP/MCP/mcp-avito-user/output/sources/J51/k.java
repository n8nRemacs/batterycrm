package J51;

import Y41.l;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FormatterOperation.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"LJ51/k;", "T", "LJ51/e;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l<T, Integer> f8761a;

    public k(int i12, @Y61.k l lVar) {
        this.f8761a = lVar;
        if (i12 < 0) {
            throw new IllegalArgumentException(G.e(i12, "The minimum number of digits (", ") is negative").toString());
        }
        if (i12 > 9) {
            throw new IllegalArgumentException(G.e(i12, "The minimum number of digits (", ") exceeds the length of an Int").toString());
        }
    }
}
