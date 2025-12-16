package com.avito.android.select.bottom_sheet.blueprints.candy;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.select.bottom_sheet.blueprints.q;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableCandyItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/candy/i;", "Lcom/avito/android/candy/a;", "Lcom/avito/android/select/bottom_sheet/blueprints/q;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.android.candy.a implements q {
    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void a(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.body_condition.h(this, aVar));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void c3(boolean z12) {
        this.f114860f.setEnabled(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setTitle(@k String str) {
        this.f114858d.setText(str);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void p0() {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void HC(boolean z12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void Kd(boolean z12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void f(@l String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void iw(@l BaseListItem.Alignment alignment) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l(@l Image image) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l00(@k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void s(@k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setImage(int i12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void gA(@l UniversalImage universalImage, @l Size size) {
    }
}
