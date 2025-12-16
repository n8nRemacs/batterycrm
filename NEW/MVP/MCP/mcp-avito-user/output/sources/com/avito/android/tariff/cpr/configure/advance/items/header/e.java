package com.avito.android.tariff.cpr.configure.advance.items.header;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: CprConfigureAdvanceHeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/header/e;", "Lcom/avito/android/tariff/cpr/configure/advance/items/header/d;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f295266b = f2.b(0, 1, null, 5);

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.setTitle(aVar2.f295260b);
        AttributedText attributedText = aVar2.f295261c;
        gVar.g(attributedText);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 1));
    }

    @Override // vZ.InterfaceC49286a
    @k
    /* renamed from: k, reason: from getter */
    public final e2 getF295266b() {
        return this.f295266b;
    }
}
