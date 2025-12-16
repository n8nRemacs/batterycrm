package com.avito.android.ui.status_bar;

import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EdgeToEdgeFakeStatusBarOwner.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_status-bar_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.android.ui.status_bar.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.avito.android.ui.status_bar.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final <F extends Fragment & a> boolean a(@Y61.k F f12) {
        while (f12 != null) {
            ?? parentFragment = f12.getParentFragment();
            while (true) {
                if (parentFragment == 0) {
                    ActivityC22955m activityC22955mL1 = f12.l1();
                    if (!(activityC22955mL1 instanceof a)) {
                        activityC22955mL1 = null;
                    }
                    parentFragment = (a) activityC22955mL1;
                } else {
                    if (parentFragment instanceof a) {
                        break;
                    }
                    parentFragment = parentFragment.getParentFragment();
                }
            }
            ?? r02 = (a) parentFragment;
            if (r02 != 0 && r02.S3()) {
                return true;
            }
            f12 = r02 instanceof Fragment ? (Fragment) r02 : null;
        }
        return false;
    }
}
