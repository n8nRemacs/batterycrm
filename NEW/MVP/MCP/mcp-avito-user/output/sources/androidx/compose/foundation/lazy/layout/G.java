package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* compiled from: LazyLayoutItemProvider.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G {
    public static final int a(int i12, @Y61.k F f12, @Y61.l Object obj) {
        int iB2;
        return (obj == null || f12.P() == 0 || (i12 < f12.P() && obj.equals(f12.getKey(i12))) || (iB2 = f12.b(obj)) == -1) ? i12 : iB2;
    }
}
