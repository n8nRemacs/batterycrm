package jC0;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import iC0.C41267a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ViewExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff-cpt_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {
    public static final void a(@k Button button, @l C41267a c41267a) {
        Boolean bool;
        com.avito.android.lib.design.button.b.a(button, c41267a != null ? c41267a.f398436a : null, false);
        Context context = button.getContext();
        String str = c41267a != null ? c41267a.f398438c : null;
        Integer numValueOf = str != null ? Integer.valueOf(C35835l0.j(com.avito.android.lib.util.f.d(str), context)) : null;
        if (numValueOf != null) {
            button.setAppearance(numValueOf.intValue());
        }
        button.setLoading(false);
        button.setEnabled((c41267a == null || (bool = c41267a.f398439d) == null) ? true : bool.booleanValue());
    }
}
