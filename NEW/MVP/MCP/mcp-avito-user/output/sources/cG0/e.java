package cG0;

import RF0.h;
import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.f;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ViewExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_trx-promo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    public static final void a(@k Button button, @l h hVar) {
        Boolean bool;
        com.avito.android.lib.design.button.b.a(button, hVar != null ? hVar.f14239a : null, false);
        Context context = button.getContext();
        String str = hVar != null ? hVar.f14241c : null;
        Integer numValueOf = str != null ? Integer.valueOf(C35835l0.j(f.d(str), context)) : null;
        if (numValueOf != null) {
            button.setAppearance(numValueOf.intValue());
        }
        button.setLoading(false);
        button.setEnabled((hVar == null || (bool = hVar.f14242d) == null) ? true : bool.booleanValue());
    }
}
