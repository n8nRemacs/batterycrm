package androidx.compose.ui.text.android;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextLayout.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final L f42001a = new L();

    /* renamed from: b, reason: collision with root package name */
    public static final long f42002b;

    static {
        long j12 = 0;
        f42002b = (j12 & 4294967295L) | (j12 << 32);
    }

    @Y61.k
    public static final TextDirectionHeuristic a(int i12) {
        return i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
