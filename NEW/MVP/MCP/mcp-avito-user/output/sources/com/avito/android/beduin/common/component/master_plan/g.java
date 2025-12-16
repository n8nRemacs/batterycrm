package com.avito.android.beduin.common.component.master_plan;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.lib.design.master_plan_view.MasterPlanView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinMasterPlanLayout.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/master_plan/g;", "Landroid/widget/FrameLayout;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CardView f101769b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MasterPlanView f101770c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f101771d;

    /* renamed from: e, reason: collision with root package name */
    public final int f101772e;

    public g(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f101772e = context.getResources().getDimensionPixelSize(R.dimen.master_plan_height);
        LayoutInflater.from(context).inflate(R.layout.beduin_component_master_plan, (ViewGroup) this, true);
        this.f101769b = (CardView) findViewById(R.id.beduin_master_plan_container);
        this.f101770c = (MasterPlanView) findViewById(R.id.beduin_master_plan);
        this.f101771d = findViewById(R.id.beduin_master_plan_onboarding);
    }
}
