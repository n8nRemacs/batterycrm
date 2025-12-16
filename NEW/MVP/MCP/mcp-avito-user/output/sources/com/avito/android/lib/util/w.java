package com.avito.android.lib.util;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;

/* compiled from: RoundedRectOutlineProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/w;", "Landroid/view/ViewOutlineProvider;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f181428a;

    public w(int i12) {
        this.f181428a = i12;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(@Y61.k View view, @Y61.k Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f181428a);
    }
}
