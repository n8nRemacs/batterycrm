package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.ui.text.InterfaceC22675w;
import androidx.compose.ui.text.font.d0;
import androidx.compose.ui.unit.C22711a;
import kotlin.Metadata;

/* compiled from: PlatformTypefaces.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {
    @Y61.l
    @InterfaceC22675w
    public static final Typeface a(@Y61.l Typeface typeface, @Y61.k d0.e eVar, @Y61.k Context context) {
        x0.f42324a.getClass();
        if (typeface == null) {
            return null;
        }
        if (eVar.f42238a.isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal = x0.f42325b;
        Paint paint = threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(E0.d.b(eVar.f42238a, null, new w0(C22711a.a(context)), 31));
        return paint.getTypeface();
    }
}
