package androidx.compose.ui.graphics;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Vertices.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/u1;", "", "Landroidx/compose/ui/graphics/t1;", "vertexMode", "", "Ll0/g;", "positions", "textureCoordinates", "Landroidx/compose/ui/graphics/T;", "colors", "", "indices", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u1 {
    public u1() {
        throw null;
    }

    public u1(int i12, List list, List list2, List list3, List list4, C42822w c42822w) {
        if (list2.size() != list.size()) {
            C22285t0.a("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            C22285t0.a("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iIntValue = ((Number) list4.get(i13)).intValue();
            if (iIntValue < 0 || iIntValue >= list.size()) {
                C22285t0.a("indices values must be valid indices in the positions list.");
                break;
            }
        }
        a(list);
        a(list2);
        int size2 = list3.size();
        int[] iArr = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr[i14] = V.j(((T) list3.get(i14)).f39331a);
        }
        int size3 = list4.size();
        short[] sArr = new short[size3];
        for (int i15 = 0; i15 < size3; i15++) {
            sArr[i15] = (short) ((Number) list4.get(i15)).intValue();
        }
    }

    public static void a(List list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i12 = 0; i12 < size; i12++) {
            long j12 = ((l0.g) list.get(i12 / 2)).f413387a;
            fArr[i12] = i12 % 2 == 0 ? Float.intBitsToFloat((int) (j12 >> 32)) : Float.intBitsToFloat((int) (j12 & 4294967295L));
        }
    }
}
