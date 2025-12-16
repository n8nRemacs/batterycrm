package com.avito.android.loyalty.ui.items.action;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.w;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ActionItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/items/action/f;", "Lcom/avito/android/loyalty/ui/items/action/d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f183650b;

    @Inject
    public f(@k w wVar) {
        this.f183650b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.b(aVar2.f183642c);
        hVar.a(new e(this, aVar2));
    }
}
