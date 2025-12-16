package com.avito.android.select.bottom_sheet.blueprints.nd_trx;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.saved_searches.presentation.items.switcher.l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NdTrxEntryPointItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/nd_trx/g;", "Lcom/avito/android/select/bottom_sheet/blueprints/nd_trx/e;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a> f265169b = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        iVar.f265173c.setText((CharSequence) null);
        iVar.f265172b.setOnClickListener(new l(27, new f(this, (a) aVar)));
    }
}
