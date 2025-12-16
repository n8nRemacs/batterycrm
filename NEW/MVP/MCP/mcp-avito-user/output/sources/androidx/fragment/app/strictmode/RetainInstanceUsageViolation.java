package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RetainInstanceUsageViolation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;", "Landroidx/fragment/app/strictmode/Violation;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RetainInstanceUsageViolation extends Violation {
    public RetainInstanceUsageViolation(Fragment fragment, String str, int i12, C42822w c42822w) {
        super(fragment, (i12 & 2) != 0 ? null : str);
    }
}
