package com.avito.android.advertising.ui.adstub;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.v;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CommercialUnavailableView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/adstub/CommercialUnavailableView;", "Landroid/widget/FrameLayout;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommercialUnavailableView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f88557b;

    @j
    public CommercialUnavailableView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CommercialUnavailableView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        TextView textView = (TextView) View.inflate(context, R.layout.ad_avl_unavailable, this).findViewById(R.id.text);
        this.f88557b = textView;
        Drawable drawableH = C35835l0.h(R.attr.ic_invisible20, getContext());
        if (drawableH != null) {
            drawableH.setBounds(0, 0, y6.b(20), y6.b(20));
            I5.d(textView, drawableH, null, 14);
            textView.setText(getResources().getString(R.string.ad_unavailable_hidden));
        }
        v.b(this, R.dimen.ad_avl_corner_radius);
    }
}
