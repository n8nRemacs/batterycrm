package com.avito.android.vas_performance.screens.visual.mvi;

import PL0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VisualVasReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "LPL0/c;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements u<VisualVasInternalAction, PL0.c> {
    @Inject
    public l() {
    }

    public static c.b.C0843b b(String str, String str2, ArrayList arrayList) {
        boolean zIsEmpty = OL0.a.a(arrayList).isEmpty();
        int i12 = !zIsEmpty ? R.attr.buttonPrimaryLarge : R.attr.buttonSecondaryLarge;
        c.b.C0843b.a aVar = new c.b.C0843b.a(str, str2);
        if (zIsEmpty) {
            str = str2;
        }
        if (str == null) {
            str = "";
        }
        return new c.b.C0843b(i12, aVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final PL0.c a(com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction r32, PL0.c r33) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.visual.mvi.l.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
