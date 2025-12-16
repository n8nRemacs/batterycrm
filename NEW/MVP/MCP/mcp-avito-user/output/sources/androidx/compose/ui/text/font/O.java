package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: FontFamilyResolver.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O {
    @Y61.k
    public static final M a(@Y61.k Context context) {
        C22612f c22612f = new C22612f(context);
        f0.f42260a.getClass();
        return new M(c22612f, new C22615i(Build.VERSION.SDK_INT >= 31 ? g0.f42263a.a(context) : 0), null, null, null, 28, null);
    }
}
