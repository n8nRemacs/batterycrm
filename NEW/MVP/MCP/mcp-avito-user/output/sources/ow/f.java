package Ow;

import Y61.k;
import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.material.shape.q;
import j.U;
import kotlin.Metadata;

/* compiled from: ViewBackgroundTool.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_developments-agency-search_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {
    public static final void a(@k View view, @U float f12, @U float f13, @U float f14, @U float f15, @k ColorStateList colorStateList) {
        q.b bVarF = new q().f();
        bVarF.k(f12);
        bVarF.n(f13);
        bVarF.e(f14);
        bVarF.h(f15);
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(bVarF.a());
        kVar.n(colorStateList);
        view.setBackground(kVar);
    }
}
