package ru.cyberity.cbr.core.common;

import android.view.View;
import androidx.fragment.app.Fragment;
import j.D;
import kotlin.Metadata;

/* compiled from: LifecycleAwareFindView.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/fragment/app/Fragment;", "", "viewId", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class i0 {
    @Y61.k
    public static final <T extends View> LifecycleAwareFindView<T> a(@Y61.k Fragment fragment, @D int i12) {
        return new LifecycleAwareFindView<>(fragment, i12);
    }
}
