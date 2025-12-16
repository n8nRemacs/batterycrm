package ru.cyberity.cbr.core.common;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* compiled from: CBRAppNavigationListener.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0007\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/common/h;", "", "Lru/cyberity/cbr/core/common/a0;", "reason", "", "delay", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/common/a0;Ljava/lang/Long;)V", "Landroidx/fragment/app/Fragment;", "fragment", "", "tag", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface h {
    static /* synthetic */ void a(h hVar, a0 a0Var, Long l12, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishFragment");
        }
        if ((i12 & 2) != 0) {
            l12 = null;
        }
        hVar.a(a0Var, l12);
    }

    void a(@Y61.k Fragment fragment, @Y61.l String tag);

    void a(@Y61.k a0 reason, @Y61.l Long delay);
}
