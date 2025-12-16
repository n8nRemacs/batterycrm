package com.yandex.div.core.state;

import android.view.View;
import androidx.transition.C23494e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import t21.InterfaceC48467b;

/* compiled from: DivStateTransition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/state/i;", "Landroidx/transition/e;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC48467b
/* loaded from: classes7.dex */
public final class i extends C23494e {
    public i(View view, boolean z12, int i12, C42822w c42822w) {
        j.a(view, new h(this, (i12 & 2) != 0 ? true : z12));
    }
}
