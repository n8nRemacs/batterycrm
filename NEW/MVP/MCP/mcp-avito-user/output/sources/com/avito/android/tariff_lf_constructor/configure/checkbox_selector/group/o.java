package com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GroupCheckBoxItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/n;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f299521i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f299522b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f299523c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Checkbox f299524d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f299525e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f299526f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final CharSequence f299527g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CharSequence f299528h;

    public o(@Y61.k View view) {
        super(view);
        this.f299522b = view;
        this.f299523c = (ConstraintLayout) view.findViewById(R.id.group_checkbox_item);
        this.f299524d = (Checkbox) view.findViewById(R.id.group_checkbox);
        this.f299525e = (TextView) view.findViewById(R.id.group_checkbox_dropdown_icon);
        this.f299526f = (TextView) view.findViewById(R.id.sub_title);
        FV.a aVar = FV.a.f4720a;
        Context context = view.getContext();
        aVar.getClass();
        this.f299527g = FV.a.b(R.attr.textIconExpandLess, context);
        this.f299528h = FV.a.b(R.attr.textIconExpandMore, view.getContext());
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.n
    public final void Da(@Y61.k State state) {
        JV.a.a(this.f299524d, state);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.n
    public final void G7(int i12) {
        D6.c(this.f299523c, Integer.valueOf(i12), null, null, null, 14);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.n
    public final void I(boolean z12) {
        this.f299524d.setEnabled(z12);
        this.f299525e.setEnabled(z12);
        this.f299526f.setEnabled(z12);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.n
    public final void Y7(@Y61.k Y41.a<G0> aVar) {
        this.f299524d.setOnClickListener(new A(18, aVar));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.n
    public final void d9(boolean z12, boolean z13) {
        I5.a(this.f299525e, !z13 ? null : z12 ? this.f299527g : this.f299528h, false);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.n
    public final void f(@Y61.l String str) {
        I5.a(this.f299526f, str, false);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.n
    public final void lb(@Y61.k Y41.a<G0> aVar) {
        I5.c(this.f299525e, aVar);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.n
    public final void setTitle(@Y61.k String str) {
        this.f299524d.setText(str);
    }
}
