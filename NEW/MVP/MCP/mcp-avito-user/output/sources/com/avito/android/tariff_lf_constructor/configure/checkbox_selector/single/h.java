package com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SingleCheckBoxItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/single/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/single/g;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCompoundButton f299546b;

    public h(@k View view) {
        super(view);
        this.f299546b = (ListItemCompoundButton) view;
    }

    public static void B80(h hVar, Y41.a aVar) {
        hVar.f299546b.toggle();
        ((d) aVar).invoke();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.g
    public final void G7(int i12) {
        D6.f(this.f299546b, i12, 0, 0, 0, 14);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.g
    public final void I(boolean z12) {
        this.f299546b.setEnabled(z12);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f299546b.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(4, this, aVar));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.g
    public final void f(@l String str) {
        this.f299546b.setMessage(str);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.g
    public final void setChecked(boolean z12) {
        this.f299546b.setChecked(z12);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.g
    public final void setTitle(@k String str) {
        this.f299546b.setTitle(str);
    }
}
