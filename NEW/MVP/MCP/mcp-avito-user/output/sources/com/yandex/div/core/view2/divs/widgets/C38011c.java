package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: DivBorderDrawer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/c;", "Landroid/view/ViewOutlineProvider;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.widgets.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38011c extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C38010b f368913a;

    public C38011c(C38010b c38010b) {
        this.f368913a = c38010b;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(@Y61.l View view, @Y61.l Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        float[] fArr = this.f368913a.f368886j;
        if (fArr == null) {
            fArr = null;
        }
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        outline.setRoundRect(0, 0, width, height, C38010b.b(fArr[0], view.getWidth(), view.getHeight()));
    }
}
