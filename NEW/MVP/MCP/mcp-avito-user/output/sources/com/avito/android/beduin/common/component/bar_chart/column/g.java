package com.avito.android.beduin.common.component.bar_chart.column;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.bar_chart.BarChartTextSettings;
import com.avito.android.beduin.common.component.bar_chart.j;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: BarChartColumnItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/column/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin/common/component/bar_chart/column/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f100723g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f100724b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ColumnView f100725c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f100726d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f100727e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final FrameLayout f100728f;

    public g(@k View view) {
        super(view);
        this.f100724b = view;
        View viewFindViewById = view.findViewById(R.id.column);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.beduin.common.component.bar_chart.column.ColumnView");
        }
        this.f100725c = (ColumnView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f100726d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.footer);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f100727e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.fl_column);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f100728f = (FrameLayout) viewFindViewById4;
    }

    public static void B80(TextView textView, String str, BarChartTextSettings barChartTextSettings) {
        String style;
        textView.setText(str);
        if (barChartTextSettings == null || (style = barChartTextSettings.getStyle()) == null) {
            style = "xs10";
        }
        Integer numQ = com.avito.android.lib.util.f.q(style);
        if (numQ != null) {
            textView.setTextAppearance(C35835l0.j(numQ.intValue(), textView.getContext()));
        }
        textView.setTextColor(C48063a.f437606a.a(textView.getContext(), j.a(barChartTextSettings)));
    }

    @Override // com.avito.android.beduin.common.component.bar_chart.column.f
    public final void AT(int i12, int i13) {
        FrameLayout frameLayout = this.f100728f;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i12;
        layoutParams.height = i13;
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.beduin.common.component.bar_chart.column.f
    public final void CK(@l String str, @l BarChartTextSettings barChartTextSettings) {
        B80(this.f100726d, str, barChartTextSettings);
    }

    @Override // com.avito.android.beduin.common.component.bar_chart.column.f
    public final void Lf(int i12, int i13) {
        ColumnView columnView = this.f100725c;
        ViewGroup.LayoutParams layoutParams = columnView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i12;
        layoutParams.height = i13;
        columnView.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.beduin.common.component.bar_chart.column.f
    public final void Ra(@l Corners corners) {
        this.f100725c.setCorners(corners);
    }

    @Override // com.avito.android.beduin.common.component.bar_chart.column.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f100724b.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(17, aVar));
    }

    @Override // com.avito.android.beduin.common.component.bar_chart.column.f
    public final void ft(@l String str, @l BarChartTextSettings barChartTextSettings) {
        B80(this.f100727e, str, barChartTextSettings);
    }

    @Override // com.avito.android.beduin.common.component.bar_chart.column.f
    public final void s(@k String str) {
        this.f100724b.setTag(str);
    }

    @Override // com.avito.android.beduin.common.component.bar_chart.column.f
    public final void v(@k UniversalColor universalColor) {
        ColumnView columnView = this.f100725c;
        columnView.setBackgroundColor(C48063a.f437606a.a(columnView.getContext(), universalColor));
    }
}
