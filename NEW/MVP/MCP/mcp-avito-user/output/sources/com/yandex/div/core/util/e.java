package com.yandex.div.core.util;

import android.view.View;
import androidx.collection.q1;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: Releasables.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final F21.b a(@Y61.k View view) {
        if (view instanceof F21.b) {
            return (F21.b) view;
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        q1 q1Var = tag instanceof q1 ? (q1) tag : null;
        if (q1Var == null) {
            q1Var = new q1();
            view.setTag(R.id.div_releasable_list, q1Var);
        }
        Object objF = q1Var.f(0);
        F21.b bVar = objF instanceof F21.b ? (F21.b) objF : null;
        if (bVar != null) {
            return bVar;
        }
        d dVar = new d();
        q1Var.i(0, dVar);
        return dVar;
    }
}
