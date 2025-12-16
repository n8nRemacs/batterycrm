package com.avito.android.mortgage.person_form.list.items.checkbox;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.job.cv_info_actualization.ui.items.radio.h;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/checkbox/g;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/checkbox/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends C00.a implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckbox f200605b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.checkbox);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCheckbox");
        }
        ListItemCheckbox listItemCheckbox = (ListItemCheckbox) viewFindViewById;
        this.f200605b = listItemCheckbox;
        Badge badge = listItemCheckbox.f179518t;
        if (badge != null) {
            D6.w(badge);
        }
    }

    @Override // com.avito.android.mortgage.person_form.list.items.checkbox.f
    public final void l0(@l Y41.l<? super Boolean, G0> lVar) {
        this.f200605b.setOnClickListener(new h(lVar, this));
    }

    @Override // com.avito.android.mortgage.person_form.list.items.checkbox.f
    public final void setChecked(boolean z12) {
        this.f200605b.setChecked(z12);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.checkbox.f
    public final void setTitle(@k String str) {
        this.f200605b.setTitle(str);
    }
}
