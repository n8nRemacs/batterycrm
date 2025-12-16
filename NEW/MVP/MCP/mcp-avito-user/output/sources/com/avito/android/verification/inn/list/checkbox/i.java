package com.avito.android.verification.inn.list.checkbox;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkbox;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckboxItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/checkbox/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    public final Checkbox f323953b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f323954c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f323955d;

    public i(@k View view) {
        super(view);
        this.f323953b = (Checkbox) view.findViewById(R.id.verification_item_checkbox_view);
        this.f323954c = (TextView) view.findViewById(R.id.verification_item_checkbox_error_view);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f323955d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
