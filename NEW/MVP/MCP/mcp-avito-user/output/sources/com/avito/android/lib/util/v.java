package com.avito.android.lib.util;

import android.view.View;
import j.InterfaceC42161q;
import kotlin.Metadata;

/* compiled from: RoundOutlineProvider.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v {
    public static final void a(@Y61.k View view, float f12) {
        boolean z12 = f12 == 0.0f;
        boolean z13 = !z12;
        view.setOutlineProvider(!z12 ? new u(f12) : null);
        view.setClipToOutline(z13);
    }

    public static final void b(@Y61.k View view, @InterfaceC42161q int i12) {
        a(view, view.getResources().getDimension(i12));
    }
}
