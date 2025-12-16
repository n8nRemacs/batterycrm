package com.avito.android.change_specific.adapter;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemRadio;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Specific.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/change_specific/adapter/t;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/change_specific/adapter/s;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t extends com.avito.konveyor.adapter.b implements s {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f117914c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ListItemRadio f117915b;

    public t(@Y61.k View view) {
        super(view);
        this.f117915b = (ListItemRadio) view.findViewById(R.id.item_specific_radio_item);
    }

    @Override // com.avito.android.change_specific.adapter.s
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f117915b.setOnClickListener(new com.avito.android.calltracking.item.m(8, aVar));
    }

    @Override // com.avito.android.change_specific.adapter.s
    public final void a4(boolean z12) {
        this.f117915b.setRadioAppearance(R.style.Design_Widget_RadioButton_Re23);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f117915b.setOnClickListener(null);
    }

    @Override // com.avito.android.change_specific.adapter.s
    public final void setChecked(boolean z12) {
        this.f117915b.setChecked(z12);
    }

    @Override // com.avito.android.change_specific.adapter.s
    public final void setTitle(@Y61.k String str) {
        this.f117915b.setTitle(str);
    }
}
