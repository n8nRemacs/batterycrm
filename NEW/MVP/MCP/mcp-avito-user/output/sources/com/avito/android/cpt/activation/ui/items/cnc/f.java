package com.avito.android.cpt.activation.ui.items.cnc;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: CptActivationCncItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/cnc/f;", "Lcom/avito/android/cpt/activation/ui/items/cnc/d;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f126354b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super DeepLink, G0> lVar) {
        this.f126354b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.e(aVar2.f126343b);
        Q<AttributedText, String> q12 = aVar2.f126344c;
        AttributedText attributedText = q12.f406619b;
        String str = q12.f406620c;
        hVar.b4(attributedText, aVar2.f126345d != null, new e(aVar2, this));
        hVar.R3(str);
        Q<AttributedText, String> q13 = aVar2.f126346e;
        AttributedText attributedText2 = q13.f406619b;
        String str2 = q13.f406620c;
        hVar.M3(attributedText2);
        hVar.J5(str2);
    }
}
