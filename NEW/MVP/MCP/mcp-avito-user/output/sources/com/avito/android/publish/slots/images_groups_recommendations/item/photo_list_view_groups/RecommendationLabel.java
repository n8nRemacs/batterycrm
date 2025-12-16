package com.avito.android.publish.slots.images_groups_recommendations.item.photo_list_view_groups;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RecommendationLabel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/photo_list_view_groups/RecommendationLabel;", "Landroid/widget/LinearLayout;", "", "colorRes", "Lkotlin/G0;", "setImageGroupColor", "(I)V", "resId", "setBackground", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RecommendationLabel extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f244242b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f244243c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f244244d;

    @j
    public RecommendationLabel(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void setBackground(@InterfaceC42165v int resId) {
        this.f244242b.setBackgroundResource(resId);
    }

    public final void setImageGroupColor(@InterfaceC42150f int colorRes) {
        this.f244243c.setTextColor(C35835l0.d(colorRes, getContext()));
    }

    public RecommendationLabel(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.recommendation_label, (ViewGroup) this, true);
        this.f244242b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.image_group);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244243c = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.image_count);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244244d = (TextView) viewFindViewById2;
    }
}
