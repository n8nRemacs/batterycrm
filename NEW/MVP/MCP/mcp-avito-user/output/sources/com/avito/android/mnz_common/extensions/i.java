package com.avito.android.mnz_common.extensions;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wZ.C49578b;
import wZ.C49579c;

/* compiled from: ViewExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {
    public static final void a(@k Button button, @l ButtonAction buttonAction) {
        b(button, buttonAction != null ? C49579c.a(buttonAction) : null);
    }

    public static final void b(@k Button button, @l C49578b c49578b) {
        Boolean bool;
        com.avito.android.lib.design.button.b.a(button, c49578b != null ? c49578b.f441546a : null, false);
        Integer numA = c.a(button.getContext(), c49578b != null ? c49578b.f441548c : null);
        if (numA != null) {
            button.setAppearance(numA.intValue());
        }
        button.setLoading(false);
        button.setEnabled((c49578b == null || (bool = c49578b.f441549d) == null) ? true : bool.booleanValue());
    }
}
