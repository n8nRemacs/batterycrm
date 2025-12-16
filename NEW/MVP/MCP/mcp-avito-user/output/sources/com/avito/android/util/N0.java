package com.avito.android.util;

import android.app.Dialog;
import kotlin.Metadata;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class N0 {
    public static final void a(@Y61.l Dialog dialog) {
        if (dialog == null || !dialog.isShowing() || dialog == null) {
            return;
        }
        dialog.dismiss();
    }
}
