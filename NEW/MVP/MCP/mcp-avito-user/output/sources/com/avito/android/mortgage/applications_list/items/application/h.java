package com.avito.android.mortgage.applications_list.items.application;

import Y61.k;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.compose.design.shared.stepsbar.StepsBarView;
import com.avito.android.mortgage.widgets.StackedImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/applications_list/items/application/h;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f198423b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f198424c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f198425d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f198426e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageButton f198427f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final StackedImageView f198428g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final StepsBarView f198429h;

    public h(@k View view) {
        super(view);
        this.f198423b = view;
        View viewFindViewById = view.findViewById(R.id.label);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f198424c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f198425d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.step_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f198426e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.more);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f198427f = (ImageButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.banks_images);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.mortgage.widgets.StackedImageView");
        }
        this.f198428g = (StackedImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.steps);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.compose.design.shared.stepsbar.StepsBarView");
        }
        StepsBarView stepsBarView = (StepsBarView) viewFindViewById6;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        StepsBarView.j(stepsBarView, null, com.akita.compose.theme.re23.b.f63984b.f63952p1, 13);
        stepsBarView.setShowInfo(false);
        stepsBarView.setVisibleStepsCount(3);
        this.f198429h = stepsBarView;
    }
}
