package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FeesMethodsV2FeesMethodItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/fees_method/f;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/fees_method/d;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<DeepLink, String, G0> f158372b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k p<? super DeepLink, ? super String, G0> pVar) {
        this.f158372b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.t0(aVar2.f158358g);
        hVar.setTitle(aVar2.f158355d);
        hVar.L(aVar2.f158357f);
        hVar.g(aVar2.f158356e);
        hVar.A5(aVar2.f158359h);
        hVar.setListener(new e(this, aVar2));
    }
}
