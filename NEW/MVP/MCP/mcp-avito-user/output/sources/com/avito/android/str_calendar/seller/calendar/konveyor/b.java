package com.avito.android.str_calendar.seller.calendar.konveyor;

import Y61.k;
import Y61.l;
import android.view.View;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-calendar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {
    public static final void a(@k View view, @InterfaceC42165v @l Integer num) {
        if (num != null) {
            view.setBackground(androidx.core.content.d.getDrawable(view.getContext(), num.intValue()));
        } else {
            view.setBackground(null);
        }
    }
}
