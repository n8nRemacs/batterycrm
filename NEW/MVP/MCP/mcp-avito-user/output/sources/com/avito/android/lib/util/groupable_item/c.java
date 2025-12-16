package com.avito.android.lib.util.groupable_item;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GroupableItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/util/groupable_item/c;", "Lcom/avito/android/lib/util/groupable_item/b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // com.avito.android.lib.util.groupable_item.b
    public final void a(@k Object obj, @k Object obj2) {
        if ((obj2 instanceof a) && (obj instanceof e)) {
            e eVar = (e) obj;
            a aVar = (a) obj2;
            EdgeMode edgeMode = aVar.getF156654k().f181355b;
            edgeMode.getClass();
            EdgeMode edgeMode2 = EdgeMode.f181351c;
            boolean z12 = edgeMode == edgeMode2;
            EdgeMode edgeMode3 = aVar.getF156654k().f181356c;
            edgeMode3.getClass();
            eVar.Tz(z12, edgeMode3 == edgeMode2);
        }
    }
}
