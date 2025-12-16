package com.avito.android.lib.design.list_item;

import Au.C13079a;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.lib.deprecated_design.radio_button.c;
import com.avito.android.lib.design.toggle.RadioButton;
import kotlin.Metadata;

/* compiled from: NonSelfUpdatingListItemRadio.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/list_item/b;", "Lcom/avito/android/lib/design/list_item/ListItemRadio;", "", BeduinCartItemModel.CHECKED_STRING, "Lkotlin/G0;", "setChecked", "(Z)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends ListItemRadio {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f179576C = 0;

    /* renamed from: B, reason: collision with root package name */
    @l
    public c f179577B;

    @Override // com.avito.android.lib.design.list_item.ListItemRadio, com.avito.android.lib.design.list_item.ListItemCompoundButton
    public final void g(@k C13079a c13079a) {
        c cVar = new c(5, this, c13079a);
        this.f179577B = cVar;
        RadioButton radio = getRadio();
        if (radio != null) {
            radio.setOnCheckedChangeListener(cVar);
        }
    }

    @Override // com.avito.android.lib.design.list_item.ListItemRadio, android.widget.Checkable
    public void setChecked(boolean checked) {
        RadioButton radio = getRadio();
        if (radio != null) {
            radio.setOnCheckedChangeListener(null);
        }
        RadioButton radio2 = getRadio();
        if (radio2 != null) {
            radio2.setChecked(checked);
        }
        RadioButton radio3 = getRadio();
        if (radio3 != null) {
            radio3.setOnCheckedChangeListener(this.f179577B);
        }
    }
}
