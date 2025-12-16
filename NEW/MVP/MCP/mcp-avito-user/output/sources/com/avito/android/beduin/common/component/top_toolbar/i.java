package com.avito.android.beduin.common.component.top_toolbar;

import Y61.k;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.top_toolbar.BeduinTopToolbarModel;
import com.avito.android.beduin.common.component.top_toolbar.h;
import kotlin.Metadata;

/* compiled from: BeduinTopToolbarItem.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {
    @k
    public static final h.a a(@k BeduinComponentTheme beduinComponentTheme, @k BeduinTopToolbarModel.Style style, boolean z12) {
        BeduinComponentTheme beduinComponentTheme2 = BeduinComponentTheme.AVITO_LOOK_AND_FEEL;
        if (beduinComponentTheme == beduinComponentTheme2 && (style == BeduinTopToolbarModel.Style.SMALL || style == BeduinTopToolbarModel.Style.BACK)) {
            return new h.a.c(z12, style == BeduinTopToolbarModel.Style.BACK);
        }
        if (beduinComponentTheme == beduinComponentTheme2 && style == BeduinTopToolbarModel.Style.LARGE) {
            return new h.a.b(z12);
        }
        if (beduinComponentTheme == BeduinComponentTheme.AVITO && (style == BeduinTopToolbarModel.Style.SMALL || style == BeduinTopToolbarModel.Style.BACK)) {
            return new h.a.d(z12, style == BeduinTopToolbarModel.Style.BACK);
        }
        return new h.a.C3083a(z12);
    }
}
