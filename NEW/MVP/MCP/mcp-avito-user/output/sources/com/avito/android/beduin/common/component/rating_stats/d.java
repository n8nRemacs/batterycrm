package com.avito.android.beduin.common.component.rating_stats;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import zh0.C50568b;

/* compiled from: BeduinRatingStatsLayout.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/rating_stats/d;", "Landroid/widget/TableLayout;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends TableLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50568b f102261b;

    public d(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        super(context, (i12 & 2) != 0 ? null : attributeSet);
        this.f102261b = new C50568b(this);
        setColumnStretchable(1, true);
    }
}
