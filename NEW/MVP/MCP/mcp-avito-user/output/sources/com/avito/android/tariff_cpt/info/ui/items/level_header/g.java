package com.avito.android.tariff_cpt.info.ui.items.level_header;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.info.di.o;
import com.avito.android.tariff_cpt.info.ui.items.level_header.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptInfoLevelHeaderItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/level_header/g;", "Lcom/avito/android/tariff_cpt/info/ui/items/level_header/d;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f298412b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f298413c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@o @k l<? super DeepLink, G0> lVar, @com.avito.android.tariff_cpt.common.di.b @k l<? super DeepLink, G0> lVar2) {
        this.f298412b = lVar;
        this.f298413c = lVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.setTitle(aVar2.f298396b);
        a.C9113a c9113a = aVar2.f298397c;
        if (c9113a != null) {
            iVar.ru(c9113a, new e(this, c9113a));
        }
        AttributedText attributedText = aVar2.f298398d;
        iVar.g(attributedText);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new f(this.f298413c));
    }
}
