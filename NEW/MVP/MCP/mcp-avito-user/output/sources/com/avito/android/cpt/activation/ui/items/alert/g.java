package com.avito.android.cpt.activation.ui.items.alert;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: CptActivationAlertItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/alert/g;", "Lcom/avito/android/cpt/activation/ui/items/alert/d;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f126333b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super DeepLink, G0> lVar) {
        this.f126333b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.j0(aVar2.f126324g);
        List list = aVar2.f126325h;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        l<DeepLink, G0> lVar = this.f126333b;
        iVar.Q2(new e(1, lVar, l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0), list);
        iVar.setTitle(aVar2.f126320c);
        AttributedText attributedText = aVar2.f126321d;
        iVar.g(attributedText);
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new f(lVar));
        }
        iVar.a3(aVar2.f126322e, aVar2.f126323f);
    }
}
