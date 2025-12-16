package ru.cyberity.cbr.core.common;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: BottomSheetBehaviorExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"'\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0005¨\u0006\u0006"}, d2 = {"isExpanded", "", "T", "Landroid/view/View;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class BottomSheetBehaviorExtensionsKt {
    public static final <T extends View> boolean isExpanded(@Y61.k BottomSheetBehavior<T> bottomSheetBehavior) {
        return bottomSheetBehavior.f355975L == 3;
    }
}
