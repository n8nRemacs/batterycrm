package com.avito.android.verification.inn.list.disclosure;

import Y61.k;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.di.B;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DisclosureItemPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/disclosure/f;", "LTV0/d;", "Lcom/avito/android/verification/inn/list/disclosure/h;", "Lcom/avito/android/verification/inn/list/disclosure/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f323971b;

    @Inject
    public f(@k d dVar) {
        this.f323971b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.itemView.setOnClickListener(new i(7, new e(aVar2, hVar, this)));
        String str = aVar2.f323960f;
        TextView textView = hVar.f323974b;
        textView.setText(str);
        I5.d(textView, null, C35835l0.h(aVar2.f323959e ? R.attr.ic_arrowExpandMore16 : R.attr.ic_arrowExpandLess16, hVar.itemView.getContext()), 11);
        ((RecyclerView.n) hVar.itemView.getLayoutParams()).setMargins(0, y6.b(aVar2.f323962h), 0, y6.b(aVar2.f323963i));
    }
}
