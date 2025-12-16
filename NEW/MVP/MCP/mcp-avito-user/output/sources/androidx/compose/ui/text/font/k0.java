package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.AbstractC22610d;
import kotlin.Metadata;

/* compiled from: DeviceFontFamilyNameFont.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/d$a;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class k0 implements AbstractC22610d.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final k0 f42268a = new k0();

    @Override // androidx.compose.ui.text.font.AbstractC22610d.a
    @Y61.l
    public final Object a() {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // androidx.compose.ui.text.font.AbstractC22610d.a
    @Y61.l
    public final Typeface b(@Y61.k Context context, @Y61.k AbstractC22610d abstractC22610d) {
        A a12 = abstractC22610d instanceof A ? (A) abstractC22610d : null;
        if (a12 != null) {
            return (Build.VERSION.SDK_INT >= 28 ? new p0() : new q0()).c(a12.f42159d, a12.f42160e, a12.f42161f, a12.f42232c, context);
        }
        return null;
    }
}
