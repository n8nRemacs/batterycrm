package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.W0;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22132o;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemProvider.kt */
@W0
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/F;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface F {
    int P();

    default int b(@Y61.k Object obj) {
        return -1;
    }

    @InterfaceC22132o
    void e(int i12, @Y61.l androidx.compose.runtime.A a12, @Y61.k Object obj);

    @Y61.l
    default Object g(int i12) {
        return null;
    }

    @Y61.k
    default Object getKey(int i12) {
        return new DefaultLazyKey(i12);
    }
}
