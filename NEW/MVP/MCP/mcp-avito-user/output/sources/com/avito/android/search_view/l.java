package com.avito.android.search_view;

import android.R;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import com.avito.android.search_view.k;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: SearchViewConfigs.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_search-bar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {
    @Y61.k
    public static final ColorStateList a(@Y61.k k.a aVar, @Y61.k Context context, float f12) {
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[]{-16842919}};
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Integer numValueOf = Integer.valueOf(C35835l0.d(com.avito.android.R.attr.warmGray4, context));
        C48063a c48063a = C48063a.f437606a;
        return new ColorStateList(iArr, new int[]{((Integer) argbEvaluator.evaluate(f12, numValueOf, Integer.valueOf(c48063a.a(context, aVar.f264568b)))).intValue(), ((Integer) new ArgbEvaluator().evaluate(f12, Integer.valueOf(C35835l0.d(com.avito.android.R.attr.warmGray4, context)), Integer.valueOf(c48063a.a(context, aVar.f264567a)))).intValue()});
    }
}
