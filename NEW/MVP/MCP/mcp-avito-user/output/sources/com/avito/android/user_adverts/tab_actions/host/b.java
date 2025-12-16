package com.avito.android.user_adverts.tab_actions.host;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: UserAdvertsActionsBottomSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/b;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsActionsBottomSheetView f314226b;

    public b(UserAdvertsActionsBottomSheetView userAdvertsActionsBottomSheetView) {
        this.f314226b = userAdvertsActionsBottomSheetView;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@Y61.k View view, int i12) {
        View.OnClickListener onClickListener;
        if (i12 != 5 || (onClickListener = this.f314226b.f314224h) == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@Y61.k View view, float f12) {
    }
}
