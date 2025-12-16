package androidx.compose.ui.text;

import androidx.compose.ui.text.C22602e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AnnotatedString.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22662l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22602e f42494a = new C22602e("", null, 2, null);

    public static C22602e a(String str, e0 e0Var) {
        return new C22602e(str, Collections.singletonList(new C22602e.C1684e(0, str.length(), e0Var)), C42784z0.f406748b);
    }

    public static final List<C22602e.C1684e<? extends C22602e.a>> b(C22602e c22602e, int i12, int i13, Y41.l<? super C22602e.a, Boolean> lVar) {
        List<C22602e.C1684e<? extends C22602e.a>> list;
        if (i12 == i13 || (list = c22602e.f42126b) == null) {
            return null;
        }
        if (i12 != 0 || i13 < c22602e.f42127c.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                C22602e.C1684e<? extends C22602e.a> c1684e = list.get(i14);
                if ((lVar != null ? ((Boolean) ((C22634i) lVar).invoke(c1684e.f42138a)).booleanValue() : true) && c(i12, i13, c1684e.f42139b, c1684e.f42140c)) {
                    arrayList.add(new C22602e.C1684e(c1684e.f42141d, kotlin.ranges.s.g(c1684e.f42139b, i12, i13) - i12, kotlin.ranges.s.g(c1684e.f42140c, i12, i13) - i12, (C22602e.a) c1684e.f42138a));
                }
            }
            return arrayList;
        }
        if (lVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i15 = 0; i15 < size2; i15++) {
            C22602e.C1684e<? extends C22602e.a> c1684e2 = list.get(i15);
            if (((Boolean) ((C22634i) lVar).invoke(c1684e2.f42138a)).booleanValue()) {
                arrayList2.add(c1684e2);
            }
        }
        return arrayList2;
    }

    public static final boolean c(int i12, int i13, int i14, int i15) {
        return ((i12 < i15) & (i14 < i13)) | (((i12 == i13) | (i14 == i15)) & (i12 == i14));
    }
}
