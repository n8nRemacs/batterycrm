package com.akita.view.foundation.util;

import android.content.res.Resources;
import j.U;
import kotlin.Metadata;

/* compiled from: ViewSize.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {
    @U
    public static final int a(int i12) {
        return (int) (i12 * Resources.getSystem().getDisplayMetrics().density);
    }
}
