package com.avito.android.blueprints.switcher;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiStateSwitcherItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/switcher/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/switcher/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f106761b;

    public h(@k View view) {
        super(view);
        this.f106761b = new i(view);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void H(@l CharSequence charSequence) {
        this.f106761b.H(charSequence);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void Jp(@l CharSequence charSequence) {
        this.f106761b.Jp(charSequence);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void S1(@k Y41.l<? super Boolean, G0> lVar) {
        this.f106761b.S1(lVar);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void Wi(@l CharSequence charSequence) {
        this.f106761b.Wi(charSequence);
    }

    @Override // com.avito.android.blueprints.switcher.g
    @k
    public final Context getContext() {
        return this.f106761b.f106762b.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f106761b.getClass();
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void j9(@k BaseListItem.Alignment alignment) {
        this.f106761b.j9(alignment);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void k0(@l CustomPaddings customPaddings) {
        this.f106761b.k0(customPaddings);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void setChecked(boolean z12) {
        this.f106761b.setChecked(z12);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void setEnabled(boolean z12) {
        this.f106761b.setEnabled(z12);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void setTitle(@k String str) {
        this.f106761b.setTitle(str);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void u(@l CharSequence charSequence) {
        this.f106761b.u(charSequence);
    }
}
