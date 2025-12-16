package com.avito.android.verification.inn.list.text;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TextItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/text/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f324113b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f324114c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f324115d;

    public g(@k View view) {
        super(view);
        this.f324113b = (TextView) this.itemView.getRootView();
        this.f324114c = this.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f324115d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
