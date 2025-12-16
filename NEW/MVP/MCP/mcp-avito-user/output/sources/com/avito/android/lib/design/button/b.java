package com.avito.android.lib.design.button;

import X41.j;
import Y61.k;
import Y61.l;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: Buttons.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    @j
    public static final void a(@k Button button, @l CharSequence charSequence, boolean z12) {
        if (charSequence != null && charSequence.length() != 0) {
            D6.H(button);
            button.setText(charSequence);
        } else if (z12) {
            D6.g(button);
        } else {
            D6.w(button);
        }
    }
}
