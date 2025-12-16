package com.avito.android.lib.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Dialogs.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DialogShowUnsafe"})
/* loaded from: classes14.dex */
public final class g {
    public static final void a(@Y61.k Dialog dialog) {
        Activity activityA = C35835l0.a(dialog.getContext());
        if (activityA == null || activityA.isFinishing()) {
            return;
        }
        dialog.show();
    }

    public static final void b(@Y61.k DialogFragment dialogFragment, @Y61.k Context context, @Y61.k FragmentManager fragmentManager, @Y61.k String str) {
        Activity activityA = C35835l0.a(context);
        if (activityA == null || activityA.isFinishing()) {
            return;
        }
        dialogFragment.show(fragmentManager, str);
    }
}
