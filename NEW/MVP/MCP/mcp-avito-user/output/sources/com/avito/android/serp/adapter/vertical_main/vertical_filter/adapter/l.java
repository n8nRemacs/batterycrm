package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.f;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalSearchFilterItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/l;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/j;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class l extends com.avito.konveyor.adapter.b implements TV0.e, j {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f273493f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f273494b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f273495c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ComponentContainer f273496d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Input f273497e;

    public l(@Y61.k View view) {
        super(view);
        this.f273494b = view;
        this.f273495c = view.getContext();
        this.f273496d = (ComponentContainer) view.findViewById(R.id.vertical_search_filter_select_input_container);
        this.f273497e = (Input) view.findViewById(R.id.vertical_search_filter_select_input);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.j
    public final void I(boolean z12) {
        Input input = this.f273497e;
        if (input == null) {
            return;
        }
        input.setEnabled(z12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.j
    public final void a(@Y61.k Y41.a<G0> aVar) {
        Input input = this.f273497e;
        if (input != null) {
            input.setOnClickListener(new k(aVar, 0));
            return;
        }
        Button button = (Button) this.f273494b.findViewById(R.id.all_filters);
        if (button != null) {
            button.setOnClickListener(new k(aVar, 1));
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.j
    public final void aU(@Y61.k f fVar) {
        boolean z12 = fVar instanceof f.b;
        ComponentContainer componentContainer = this.f273496d;
        if (z12) {
            if (componentContainer != null) {
                componentContainer.o(componentContainer.f178848i, new int[]{R.id.vertical_search_filter_select_input});
                return;
            }
            return;
        }
        if (!(fVar instanceof f.a) || componentContainer == null) {
            return;
        }
        ComponentContainer.l(componentContainer, new int[]{R.id.vertical_search_filter_select_input}, ((f.a) fVar).f273475a.k0(this.f273495c), 4);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.j
    public final void r4(@Y61.k String str, boolean z12, boolean z13) {
        Input input = this.f273497e;
        if (input == null) {
            ComponentContainer componentContainer = this.f273496d;
            if (componentContainer == null) {
                return;
            }
            componentContainer.setContentDescription(str);
            return;
        }
        int i12 = R.attr.gray68;
        if (z13 && z12) {
            i12 = R.attr.black;
        }
        input.setTextColor(C35835l0.d(i12, input.getContext()));
        Input.t(input, str, false, 6);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.j
    public final void xk(@Y61.l Integer num, boolean z12) throws Resources.NotFoundException {
        Input input = this.f273497e;
        int iIntValue = R.attr.baseSelect;
        if (z12) {
            if (input != null) {
                if (num != null) {
                    iIntValue = num.intValue();
                }
                input.setAppearanceFromAttr(iIntValue);
                return;
            }
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f273495c, R.style.Theme_DesignSystem_Re23);
        if (num != null) {
            iIntValue = num.intValue();
        }
        int iJ2 = C35835l0.j(iIntValue, contextThemeWrapper);
        if (input != null) {
            input.setAppearance(iJ2);
        }
    }
}
