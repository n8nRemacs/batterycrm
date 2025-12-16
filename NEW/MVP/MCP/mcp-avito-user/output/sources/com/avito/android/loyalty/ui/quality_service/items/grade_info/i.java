package com.avito.android.loyalty.ui.quality_service.items.grade_info;

import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.loyalty.ui.items.quality_progress.QualityProgress;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GradeInfoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f183911p = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f183912b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f183913c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ConstraintLayout f183914d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ConstraintLayout f183915e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f183916f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f183917g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final QualityProgress f183918h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f183919i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f183920j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f183921k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final HeaderButton f183922l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f183923m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final LinearLayout f183924n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Button f183925o;

    public i(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f183912b = context;
        this.f183913c = LayoutInflater.from(context);
        this.f183914d = (ConstraintLayout) view.findViewById(R.id.item_grade_info_root);
        this.f183915e = (ConstraintLayout) view.findViewById(R.id.item_grade_info_progress_container);
        this.f183916f = (TextView) view.findViewById(R.id.item_grade_info_progress);
        this.f183917g = (TextView) view.findViewById(R.id.item_grade_info_progress_hint);
        this.f183918h = (QualityProgress) view.findViewById(R.id.item_grade_info_progress_view);
        this.f183919i = (TextView) view.findViewById(R.id.item_grade_info_description_title);
        TextView textView = (TextView) view.findViewById(R.id.item_grade_info_description);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f183920j = textView;
        this.f183921k = (TextView) view.findViewById(R.id.item_grade_info_advices_title);
        this.f183922l = (HeaderButton) view.findViewById(R.id.item_grade_info_advices_counter);
        TextView textView2 = (TextView) view.findViewById(R.id.item_grade_info_advices_subtitle);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        this.f183923m = textView2;
        this.f183924n = (LinearLayout) view.findViewById(R.id.item_grade_info_advices_container);
        this.f183925o = (Button) view.findViewById(R.id.item_grade_info_action);
    }
}
