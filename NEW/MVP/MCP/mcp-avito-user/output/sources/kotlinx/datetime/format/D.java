package kotlinx.datetime.format;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: DateTimeFormatBuilder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D {
    public static final <T extends C> void a(@Y61.k T t12, @Y61.k Y41.l<? super T, kotlin.G0>[] lVarArr, @Y61.k Y41.l<? super T, kotlin.G0> lVar) {
        if (!(t12 instanceof InterfaceC43324b)) {
            throw new IllegalStateException("impossible");
        }
        Y41.l[] lVarArr2 = (Y41.l[]) Arrays.copyOf(lVarArr, lVarArr.length);
        kotlin.jvm.internal.v0.e(1, lVar);
        ((InterfaceC43324b) t12).g(lVarArr2, lVar);
    }

    public static final void b(@Y61.k C c12, char c13) {
        c12.l(String.valueOf(c13));
    }

    public static final <T extends C> void c(@Y61.k T t12, @Y61.k String str, @Y61.k Y41.l<? super T, kotlin.G0> lVar) {
        if (!(t12 instanceof InterfaceC43324b)) {
            throw new IllegalStateException("impossible");
        }
        kotlin.jvm.internal.v0.e(1, lVar);
        ((InterfaceC43324b) t12).q(str, lVar);
    }
}
