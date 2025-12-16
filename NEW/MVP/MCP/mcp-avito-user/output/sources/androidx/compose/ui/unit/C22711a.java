package androidx.compose.ui.unit;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: AndroidDensity.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.unit.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22711a {
    @Y61.k
    public static final d a(@Y61.k Context context) {
        float f12 = context.getResources().getConfiguration().fontScale;
        float f13 = context.getResources().getDisplayMetrics().density;
        C0.b.f1851a.getClass();
        C0.a aVarA = C0.b.a(f12);
        if (aVarA == null) {
            aVarA = new w(f12);
        }
        return new g(f13, f12, aVarA);
    }
}
