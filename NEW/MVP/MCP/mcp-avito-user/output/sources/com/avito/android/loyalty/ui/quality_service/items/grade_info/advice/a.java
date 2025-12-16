package com.avito.android.loyalty.ui.quality_service.items.grade_info.advice;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdviceItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/advice/a;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f183878a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f183879b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConstraintLayout f183880c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f183881d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ProgressBarRe23 f183882e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f183883f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Badge f183884g;

    public a(@k View view) {
        this.f183878a = view;
        this.f183879b = view.getContext();
        this.f183880c = (ConstraintLayout) view;
        this.f183881d = (TextView) view.findViewById(R.id.item_advice_progress);
        this.f183882e = (ProgressBarRe23) view.findViewById(R.id.item_advice_progress_view);
        TextView textView = (TextView) view.findViewById(R.id.item_advice_description);
        this.f183883f = textView;
        this.f183884g = (Badge) view.findViewById(R.id.item_advice_badge);
        textView.addOnLayoutChangeListener(new com.avito.android.util.bottom_gap.a(this, 5));
    }
}
