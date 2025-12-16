package com.avito.android.beduin.common.component.grid_layout.row;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.properties.h;
import kotlin.reflect.n;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"com/avito/android/util/J6", "Lkotlin/properties/h;", "Landroid/view/View;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements h<View, c> {
    @Override // kotlin.properties.g
    public final Object getValue(Object obj, n nVar) {
        Object tag = ((View) obj).getTag(R.id.beduin_bound_data);
        if (!(tag instanceof c)) {
            tag = null;
        }
        return (c) tag;
    }

    @Override // kotlin.properties.h
    public final void setValue(View view, n nVar, c cVar) {
        view.setTag(R.id.beduin_bound_data, cVar);
    }
}
