package com.avito.android.mortgage.pre_approval.form.list.items.select;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/select/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/select/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f201838e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f201839b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f201840c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f201841d;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f201839b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f201840c = (Input) viewFindViewById2;
        this.f201841d = "";
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.select.g
    public final void C5(@l PrintableText printableText) {
        ComponentContainer componentContainer = this.f201839b;
        if (printableText == null) {
            componentContainer.k();
        } else {
            ComponentContainer.n(componentContainer, printableText.k0(componentContainer.getContext()), 2);
        }
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.select.g
    public final void D(@k PrintableText printableText) {
        String strK0 = printableText.k0(this.itemView.getContext());
        this.f201841d = strK0;
        this.f201839b.setTitle(strK0);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.select.g
    public final void Uf(@l Y41.l<? super String, G0> lVar) {
        Input input = this.f201840c;
        if (lVar == null) {
            input.setOnClickListener(null);
        } else {
            input.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(lVar, this));
        }
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.select.g
    public final void c6(@l PrintableText printableText) {
        this.f201840c.setHint(printableText.k0(this.itemView.getContext()));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f201840c.setOnClickListener(null);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.select.g
    public final void setText(@l String str) {
        Input.t(this.f201840c, str, false, 6);
    }
}
