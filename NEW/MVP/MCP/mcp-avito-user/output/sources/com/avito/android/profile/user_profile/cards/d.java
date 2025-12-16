package com.avito.android.profile.user_profile.cards;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.D6;
import gr.C40723b;
import j.D;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {
    @Y61.k
    public static final com.avito.android.lib.deprecated_design.button.c a(@Y61.k View view, @D int i12) {
        View viewFindViewById = view.findViewById(i12);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        d(viewFindViewById);
        return new com.avito.android.lib.deprecated_design.button.c(viewFindViewById);
    }

    @Y61.k
    public static final C40723b b(@Y61.k View view, @D int i12) {
        View viewFindViewById = view.findViewById(i12);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        d(viewFindViewById);
        return new C40723b(viewFindViewById);
    }

    public static final void c(@Y61.k C40723b c40723b, @Y61.l Drawable drawable) {
        if (drawable != null) {
            c40723b.f396883d.setImageDrawable(drawable);
        }
    }

    @Y61.k
    public static final void d(@Y61.k View view) {
        int iD2 = com.avito.android.actions_sheet.a.d(view, R.dimen.profile_inside_horizontal_padding);
        D6.f(view, iD2, 0, iD2, 0, 10);
    }
}
