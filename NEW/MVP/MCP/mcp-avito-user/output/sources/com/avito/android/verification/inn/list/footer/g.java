package com.avito.android.verification.inn.list.footer;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FooterItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/footer/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f323983b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f323984c;

    public g(@k View view) {
        super(view);
        this.f323983b = (TextView) this.itemView;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f323984c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
