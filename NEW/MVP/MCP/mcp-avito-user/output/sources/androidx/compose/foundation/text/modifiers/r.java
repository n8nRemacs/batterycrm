package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.C;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.C22662l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TextAnnotatedStringNode.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {
    public static final boolean a(@Y61.k C22602e c22602e) {
        int length = c22602e.f42127c.length();
        List<C22602e.C1684e<? extends C22602e.a>> list = c22602e.f42126b;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C22602e.C1684e<? extends C22602e.a> c1684e = list.get(i12);
            if ((c1684e.f42138a instanceof C) && C22662l.c(0, length, c1684e.f42139b, c1684e.f42140c)) {
                return true;
            }
        }
        return false;
    }
}
