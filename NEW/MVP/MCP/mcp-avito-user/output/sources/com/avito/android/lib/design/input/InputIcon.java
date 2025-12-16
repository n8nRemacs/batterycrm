package com.avito.android.lib.design.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* compiled from: InputIcon.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/input/InputIcon;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InputIcon extends AppCompatImageView {
    public InputIcon(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    @Y61.k
    public final int[] onCreateDrawableState(int i12) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        int[] drawableState = view != null ? view.getDrawableState() : null;
        if (drawableState == null) {
            drawableState = new int[0];
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12);
        linkedHashSet.addAll(C42756l.k0(drawableState));
        linkedHashSet.addAll(C42756l.k0(iArrOnCreateDrawableState));
        return C42745f0.L0(linkedHashSet);
    }
}
