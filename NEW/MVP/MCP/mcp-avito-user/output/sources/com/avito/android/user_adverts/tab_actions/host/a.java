package com.avito.android.user_adverts.tab_actions.host;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;

/* compiled from: UserAdvertsActionsBottomSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/a;", "Landroid/view/ViewOutlineProvider;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsActionsBottomSheetView f314225a;

    public a(UserAdvertsActionsBottomSheetView userAdvertsActionsBottomSheetView) {
        this.f314225a = userAdvertsActionsBottomSheetView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(@Y61.k View view, @Y61.k Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        int i12 = this.f314225a.f314223g;
        outline.setRoundRect(0, 0, width, height + i12, i12);
    }
}
