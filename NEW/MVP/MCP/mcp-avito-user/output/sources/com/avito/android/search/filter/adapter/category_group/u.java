package com.avito.android.search.filter.adapter.category_group;

import android.view.View;
import com.avito.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.p f262093c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.b f262094d;

    public /* synthetic */ u(Y41.p pVar, com.avito.konveyor.adapter.b bVar, int i12) {
        this.f262092b = i12;
        this.f262093c = pVar;
        this.f262094d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.p pVar = this.f262093c;
        com.avito.konveyor.adapter.b bVar = this.f262094d;
        switch (this.f262092b) {
            case 0:
                int i12 = w.f262098i;
                pVar.invoke(-1, new C(-1, new Cp0.e("more", ((w) bVar).itemView.getContext().getResources().getString(R.string.search_filter_more), null, false, null, null, null, null, false, null, null, null, null, null, 16372, null)));
                break;
            default:
                int i13 = D.f262042i;
                pVar.invoke(-1, new C(-1, new Cp0.e("more", ((D) bVar).itemView.getContext().getResources().getString(R.string.search_filter_more), null, false, null, null, null, null, false, null, null, null, null, null, 16372, null)));
                break;
        }
    }
}
