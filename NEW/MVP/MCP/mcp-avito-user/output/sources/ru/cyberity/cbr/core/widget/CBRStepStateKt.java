package ru.cyberity.cbr.core.widget;

import Y61.k;
import android.view.View;
import kotlin.Metadata;

/* compiled from: CBRStepState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0004\"(\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroid/view/View;", "Lru/cyberity/cbr/core/widget/CBRStepState;", "value", "getStepState", "(Landroid/view/View;)Lru/cyberity/cbr/core/widget/CBRStepState;", "setStepState", "(Landroid/view/View;Lru/cyberity/cbr/core/widget/CBRStepState;)V", "stepState", "", "getCBRStepStateDrawable", "(Landroid/view/View;)[I", "CBRStepStateDrawable", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRStepStateKt {
    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final int[] getCBRStepStateDrawable(@k View view) {
        CBRStepState cBRStepState;
        CBRStepStateProvider cBRStepStateProvider = view instanceof CBRStepStateProvider ? (CBRStepStateProvider) view : null;
        if (cBRStepStateProvider == null || (cBRStepState = cBRStepStateProvider.getCBRStepState()) == null) {
            cBRStepState = CBRStepState.INIT;
        }
        return cBRStepState.getToDrawableState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void setStepState(@k View view, @k CBRStepState cBRStepState) {
        if ((view instanceof CBRStepStateProvider ? (CBRStepStateProvider) view : null) != null) {
            ((CBRStepStateProvider) view).setCBRStepState(cBRStepState);
        }
    }
}
