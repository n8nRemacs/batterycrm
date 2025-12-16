package com.yandex.div.core.state;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22816e;
import androidx.core.view.C22833m0;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DivStateTransition.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j {
    public static final void a(View view, Y41.l<? super View, G0> lVar) {
        if (view instanceof ViewGroup) {
            Iterator itA = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m0 = (C22833m0) itA;
                if (!c22833m0.hasNext()) {
                    break;
                } else {
                    a((View) c22833m0.next(), lVar);
                }
            }
        }
        ((h) lVar).invoke(view);
    }
}
