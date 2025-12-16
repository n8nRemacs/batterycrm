package L11;

import Y61.k;
import java.util.ArrayDeque;
import kotlin.Metadata;

/* compiled from: TooManyRequestBackoffGlobal.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LL11/b;", "LL11/c;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f9751a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final ArrayDeque<Long> f9752b = new ArrayDeque<>();

    public final synchronized void a() {
        try {
            ArrayDeque<Long> arrayDeque = f9752b;
            if (3 == arrayDeque.size()) {
                return;
            }
            int i12 = 0;
            if (3 > arrayDeque.size()) {
                int size = 3 - arrayDeque.size();
                while (i12 < size) {
                    f9752b.addFirst(0L);
                    i12++;
                }
            } else {
                int size2 = arrayDeque.size() - 3;
                while (i12 < size2) {
                    f9752b.removeFirst();
                    i12++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
