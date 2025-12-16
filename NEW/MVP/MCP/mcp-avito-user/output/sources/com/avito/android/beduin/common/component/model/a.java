package com.avito.android.beduin.common.component.model;

import Y61.l;
import kotlin.Metadata;

/* compiled from: BeduinContainerIndent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {
    public static final int a(@l BeduinContainerIndent beduinContainerIndent) {
        if (beduinContainerIndent != null) {
            return beduinContainerIndent.getBottomIndent();
        }
        return 0;
    }

    public static final int b(@l BeduinContainerIndent beduinContainerIndent) {
        if (beduinContainerIndent != null) {
            return beduinContainerIndent.getLeftIndent();
        }
        return 0;
    }

    public static final int c(@l BeduinContainerIndent beduinContainerIndent) {
        if (beduinContainerIndent != null) {
            return beduinContainerIndent.getRightIndent();
        }
        return 0;
    }

    public static final int d(@l BeduinContainerIndent beduinContainerIndent) {
        if (beduinContainerIndent != null) {
            return beduinContainerIndent.getTopIndent();
        }
        return 0;
    }
}
