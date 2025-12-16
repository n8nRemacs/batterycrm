package com.avito.android.leasing_calculator.view;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LeasingTooltipDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leasing_calculator/view/A;", "Lcom/avito/android/leasing_calculator/view/z;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f175124a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f175125b;

    public A(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f175124a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f175125b = (Button) viewFindViewById2;
    }
}
