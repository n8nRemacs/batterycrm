package com.avito.android.user_address.suggest.view.recycler;

import Y41.l;
import Y61.k;
import com.avito.android.user_address.suggest.data.SuggestItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuggestItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/view/recycler/e;", "Lcom/avito/android/user_address/suggest/view/recycler/c;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f308181b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super Integer, G0> lVar) {
        this.f308181b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        SuggestItem suggestItem = (SuggestItem) aVar;
        gVar.setTitle(suggestItem.f308023b);
        gVar.f(suggestItem.f308024c);
        gVar.Va(new d(this, i12));
    }
}
