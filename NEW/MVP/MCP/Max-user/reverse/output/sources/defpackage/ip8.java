package defpackage;

import java.util.Comparator;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class ip8 implements Comparator {
    public final /* synthetic */ int a;
    public final long b;

    public /* synthetic */ ip8(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long lValueOf;
        switch (this.a) {
            case 0:
                return ((kp8) obj).c == this.b ? -1 : 0;
            case 1:
                Long lValueOf2 = Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);
                u6e u6eVar = (u6e) obj2;
                pb2 pb2Var = u6eVar.d;
                long j = this.b;
                if (pb2Var == null || !pb2Var.b.e(j)) {
                    pb2 pb2Var2 = u6eVar.d;
                    lValueOf = pb2Var2 != null ? Long.valueOf(pb2Var2.o()) : null;
                } else {
                    lValueOf = lValueOf2;
                }
                u6e u6eVar2 = (u6e) obj;
                pb2 pb2Var3 = u6eVar2.d;
                if (pb2Var3 == null || !pb2Var3.b.e(j)) {
                    pb2 pb2Var4 = u6eVar2.d;
                    lValueOf2 = pb2Var4 != null ? Long.valueOf(pb2Var4.o()) : null;
                }
                return b5j.b(lValueOf, lValueOf2);
            default:
                long j2 = this.b;
                return b5j.b(new s65(((ckh) obj2).b(j2)), new s65(((ckh) obj).b(j2)));
        }
    }
}
