package com.avito.android.crm_paid_cvs.view.list_items.chips_filter;

import Y41.l;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.google.android.flexbox.FlexboxLayout;
import ht.C40979a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/chips_filter/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_paid_cvs/view/list_items/chips_filter/i;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f130823e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f130824b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f130825c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f130826d;

    public j(@Y61.k View view) {
        super(view);
        this.f130824b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130825c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.flexbox);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f130826d = (FlexboxLayout) viewFindViewById2;
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.chips_filter.i
    @SuppressLint({"UdfComponentUsage"})
    public final void L3(@Y61.k l lVar, @Y61.k List list) {
        FlexboxLayout flexboxLayout = this.f130826d;
        flexboxLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OptionItem optionItem = (OptionItem) it.next();
            Button button = new Button(this.f130824b.getContext(), null, 0, 0, 14, null);
            C40979a.a(button, optionItem.f130371c);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.topMargin = y6.b(6);
            marginLayoutParams.rightMargin = y6.b(6);
            button.setLayoutParams(marginLayoutParams);
            button.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(5, lVar, optionItem));
            button.setText(optionItem.f130370b);
            flexboxLayout.addView(button);
        }
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.chips_filter.i
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f130825c, str, false);
    }
}
