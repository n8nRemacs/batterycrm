package com.avito.android.blueprints.checkbox_with_text;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckBoxItemWithTextView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/checkbox_with_text/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/checkbox_with_text/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f105835d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckbox f105836b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.blueprint.switcher.h f105837c;

    public h(@k View view) {
        super(view);
        this.f105836b = (ListItemCheckbox) view.findViewById(R.id.checkbox_with_text);
    }

    @Override // com.avito.android.blueprints.checkbox_with_text.g
    public final void pF(@k String str) {
        this.f105836b.setMessage(str);
    }

    @Override // com.avito.android.blueprints.checkbox_with_text.g
    public final void qE(@l Y41.l<? super Boolean, G0> lVar) {
        com.avito.android.blueprint.switcher.h hVar = this.f105837c;
        ListItemCheckbox listItemCheckbox = this.f105836b;
        if (hVar != null) {
            listItemCheckbox.j(hVar);
        }
        com.avito.android.blueprint.switcher.h hVar2 = new com.avito.android.blueprint.switcher.h(1, lVar);
        listItemCheckbox.e(hVar2);
        this.f105837c = hVar2;
    }

    @Override // com.avito.android.blueprints.checkbox_with_text.g
    public final void setChecked(boolean z12) {
        this.f105836b.setChecked(z12);
    }

    @Override // com.avito.android.blueprints.checkbox_with_text.g
    public final void setTitle(@k String str) {
        this.f105836b.setTitle(str);
    }
}
