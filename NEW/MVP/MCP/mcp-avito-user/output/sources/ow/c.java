package Ow;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.i;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.F5;
import kotlin.Metadata;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: TextAppearanceSpan.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_developments-agency-search_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {
    public static OK0.a a(Context context, int i12, String str, int i13, Integer num, int i14) {
        if ((i14 & 4) != 0) {
            str = null;
        }
        if ((i14 & 16) != 0) {
            num = null;
        }
        F5 f5F = C48065c.f(C35835l0.j(i12, context), context);
        Typeface typefaceC = num != null ? i.c(num.intValue(), context) : f5F.f318604a;
        UniversalColor universalColorUniversalColorOf = UniversalColorKt.universalColorOf(str, C35835l0.d(i13, context));
        C48063a.f437606a.getClass();
        return new OK0.a(typefaceC, C48063a.e(context, universalColorUniversalColorOf), f5F.f318606c, f5F.f318607d, f5F.f318608e, f5F.f318609f);
    }
}
