package J51;

import Y41.l;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FormatterOperation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"LJ51/d;", "T", "LJ51/e;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l<T, I51.c> f8754a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f8755b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k l<? super T, I51.c> lVar, int i12, int i13, @Y61.k List<Integer> list) {
        this.f8754a = lVar;
        this.f8755b = list;
        if (1 > i12 || i12 >= 10) {
            throw new IllegalArgumentException(G.e(i12, "The minimum number of digits (", ") is not in range 1..9").toString());
        }
        if (i12 > i13 || i13 >= 10) {
            throw new IllegalArgumentException(r.l(i13, i12, "The maximum number of digits (", ") is not in range ", "..9").toString());
        }
    }
}
