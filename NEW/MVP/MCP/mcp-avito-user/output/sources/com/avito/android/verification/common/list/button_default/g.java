package com.avito.android.verification.common.list.button_default;

import Y61.k;
import android.content.Context;
import com.avito.android.di.B;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ButtonDefaultItemPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/common/list/button_default/g;", "LTV0/d;", "Lcom/avito/android/verification/common/list/button_default/i;", "Lcom/avito/android/verification/common/list/button_default/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements TV0.d<i, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f323411b;

    @Inject
    public g(@k d dVar) {
        this.f323411b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        String str = aVar2.f323400c;
        Button button = iVar.f323414b;
        button.setText(str);
        button.setLoading(aVar2.f323403f);
        button.setEnabled(!aVar2.f323402e);
        Context context = iVar.itemView.getContext();
        Integer num = aVar2.f323404g;
        Button.h(button, C35835l0.j(num != null ? num.intValue() : -1, context), 0, 2);
        button.setOnClickListener(new com.avito.android.vas_planning_checkout.item.checkout.i(3, new f(this, aVar2)));
    }
}
