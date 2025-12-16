package com.avito.android.lib.deprecated_design.select;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import m.C43852a;

/* compiled from: ClearDrawableHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/a;", "Lcom/avito/android/lib/deprecated_design/select/b;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RippleDrawable f178100a;

    public a(@k Context context) {
        this.f178100a = (RippleDrawable) C43852a.a(context, R.drawable.design_background_clear);
    }

    @Override // com.avito.android.lib.deprecated_design.select.b
    @k
    public final Drawable a() {
        return this.f178100a;
    }

    @Override // com.avito.android.lib.deprecated_design.select.b
    public final void b(@k SelectState selectState, @k Context context) {
        this.f178100a.setColor(ColorStateList.valueOf(C35835l0.d(selectState.f178097c, context)));
    }
}
