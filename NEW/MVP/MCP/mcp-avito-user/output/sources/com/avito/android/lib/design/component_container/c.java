package com.avito.android.lib.design.component_container;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.lib.design.component_container.ComponentContainer;
import kotlin.Metadata;

/* compiled from: ComponentContainer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    @l
    public static final a<View> a(@k View view) {
        Object layoutParams = view.getLayoutParams();
        ComponentContainer.c cVar = layoutParams instanceof ComponentContainer.c ? (ComponentContainer.c) layoutParams : null;
        if (cVar != null) {
            return cVar.getBehavior();
        }
        return null;
    }
}
