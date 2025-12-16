package com.avito.android.verification.inn.list.button;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.di.B;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ButtonItemPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/button/e;", "LTV0/d;", "Lcom/avito/android/verification/inn/list/button/g;", "Lcom/avito/android/verification/inn/list/button/ButtonItem;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, ButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f323928b;

    @Inject
    public e(@k c cVar) {
        this.f323928b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) throws Resources.NotFoundException {
        g gVar = (g) eVar;
        ButtonItem buttonItem = (ButtonItem) aVar;
        String str = buttonItem.f323902c;
        Button button = gVar.f323931b;
        button.setText(str);
        button.setLoading(buttonItem.f323905f);
        button.setAppearance(C35835l0.j(buttonItem.f323906g.f323916b, gVar.f323932c));
        Context context = gVar.itemView.getContext();
        Integer num = buttonItem.f323908i;
        Button.h(button, C35835l0.j(num != null ? num.intValue() : -1, context), 0, 2);
        ((RecyclerView.n) gVar.itemView.getLayoutParams()).setMargins(0, y6.b(buttonItem.f323909j), 0, y6.b(buttonItem.f323910k));
        button.setOnClickListener(new i(6, new d(this, buttonItem)));
    }
}
