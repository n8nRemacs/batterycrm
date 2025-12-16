package com.avito.android.lib.design.skeleton;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Skeleton.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/skeleton/Skeleton;", "Landroidx/cardview/widget/CardView;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Skeleton extends CardView {
    @j
    public Skeleton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Skeleton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet);
        setCardBackgroundColor(C35835l0.d(R.attr.white, context));
        setRadius(context.getTheme().obtainStyledAttributes(attributeSet, d.n.f178918E0, i12, i13).getDimensionPixelSize(0, 0));
        setElevation(0.0f);
    }
}
