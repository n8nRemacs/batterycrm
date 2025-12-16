package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import y0.C50028a;

/* compiled from: MultiParagraph.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J {

    /* compiled from: MultiParagraph.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/M;", "it", "", "invoke", "(Landroidx/compose/ui/text/M;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<M, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41931l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(M m12) {
            M m13 = m12;
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(m13.f41933b);
            sb2.append(", ");
            return androidx.appcompat.app.r.t(sb2, m13.f41934c, ')');
        }
    }

    public static final int a(int i12, @Y61.k List list) {
        int i13;
        int i14 = ((M) C42745f0.Q(list)).f41934c;
        if (i12 > ((M) C42745f0.Q(list)).f41934c) {
            C50028a.a("Index " + i12 + " should be less or equal than last line's end " + i14);
        }
        int size = list.size() - 1;
        int i15 = 0;
        while (true) {
            if (i15 > size) {
                i13 = -(i15 + 1);
                break;
            }
            i13 = (i15 + size) >>> 1;
            M m12 = (M) list.get(i13);
            char c12 = m12.f41933b > i12 ? (char) 1 : m12.f41934c <= i12 ? (char) 65535 : (char) 0;
            if (c12 >= 0) {
                if (c12 <= 0) {
                    break;
                }
                size = i13 - 1;
            } else {
                i15 = i13 + 1;
            }
        }
        if (i13 < 0 || i13 >= list.size()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i13, "Found paragraph index ", " should be in range [0, ");
            sbJ.append(list.size());
            sbJ.append(").\nDebug info: index=");
            sbJ.append(i12);
            sbJ.append(", paragraphs=[");
            sbJ.append(E0.d.b(list, null, a.f41931l, 31));
            sbJ.append(']');
            C50028a.a(sbJ.toString());
        }
        return i13;
    }

    public static final int b(int i12, @Y61.k List list) {
        int size = list.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            M m12 = (M) list.get(i14);
            char c12 = m12.f41935d > i12 ? (char) 1 : m12.f41936e <= i12 ? (char) 65535 : (char) 0;
            if (c12 < 0) {
                i13 = i14 + 1;
            } else {
                if (c12 <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static final int c(@Y61.k ArrayList arrayList, float f12) {
        if (f12 <= 0.0f) {
            return 0;
        }
        if (f12 >= ((M) C42745f0.Q(arrayList)).f41938g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            M m12 = (M) arrayList.get(i13);
            char c12 = m12.f41937f > f12 ? (char) 1 : m12.f41938g <= f12 ? (char) 65535 : (char) 0;
            if (c12 < 0) {
                i12 = i13 + 1;
            } else {
                if (c12 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final void d(@Y61.k ArrayList arrayList, long j12, @Y61.k Y41.l lVar) {
        int size = arrayList.size();
        for (int iA2 = a(v0.g(j12), arrayList); iA2 < size; iA2++) {
            M m12 = (M) arrayList.get(iA2);
            if (m12.f41933b >= v0.f(j12)) {
                return;
            }
            if (m12.f41933b != m12.f41934c) {
                lVar.invoke(m12);
            }
        }
    }
}
