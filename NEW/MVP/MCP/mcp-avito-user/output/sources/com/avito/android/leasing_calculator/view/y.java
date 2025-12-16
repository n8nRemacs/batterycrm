package com.avito.android.leasing_calculator.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.LeasingCalculator;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LeasingInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leasing_calculator/view/y;", "Lcom/avito/android/leasing_calculator/view/x;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f175176a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f175177b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f175178c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f175179d;

    public y(@Y61.k View view) {
        this.f175176a = view;
        View viewFindViewById = view.findViewById(R.id.benefits_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f175177b = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f175178c = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.application_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f175179d = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.leasing_calculator.view.x
    public final void a(@Y61.l String str, @Y61.l Y41.a<G0> aVar) {
        Button button = this.f175178c;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(26, aVar));
    }

    @Override // com.avito.android.leasing_calculator.view.x
    public final void b7(@Y61.l String str, @Y61.l Y41.a<G0> aVar) {
        Button button = this.f175179d;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(25, aVar));
    }

    @Override // com.avito.android.leasing_calculator.view.x
    public final void y4(@Y61.l List<LeasingCalculator.LeasingInfo.InfoModal.ModalBlock> list) {
        LinearLayout linearLayout = this.f175177b;
        linearLayout.removeAllViews();
        D6.G(linearLayout, O2.a(list));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f175176a.getContext());
        if (list != null) {
            for (LeasingCalculator.LeasingInfo.InfoModal.ModalBlock modalBlock : list) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.leasing_info_benefit, (ViewGroup) linearLayout, false);
                t tVar = new t(viewInflate);
                String title = modalBlock.getTitle();
                String value = modalBlock.getValue();
                I5.a(tVar.f175170a, title, false);
                I5.a(tVar.f175171b, value, false);
                linearLayout.addView(viewInflate);
            }
        }
    }
}
