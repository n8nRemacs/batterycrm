package com.avito.android.publish.details.adapter.objects.re23.price_list;

import Hj.C13996a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.O2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: PriceListPreviewRe23ItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/re23/price_list/g;", "Lcom/avito/android/publish/details/adapter/objects/re23/price_list/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<ParameterElement.w> f233421b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f233422c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f233423d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public y f233424e;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<ParameterElement.w> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f233421b = cVar;
        this.f233422c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f233423d = cVar2;
        new C41981q0(cVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        io.reactivex.rxjava3.disposables.d dVarT0;
        z<DeepLink> zVarLinkClicksV3;
        i iVar = (i) eVar;
        ParameterElement.w wVar = (ParameterElement.w) aVar;
        iVar.clearItems();
        List<ParameterElement.w.a> list = wVar.f117574j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ParameterElement.w.a.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ParameterElement.w.a.c cVar = (ParameterElement.w.a.c) it.next();
            iVar.Xb(cVar.f117588a, cVar.f117589b);
        }
        Q q12 = O2.a(list) ? new Q(wVar.f117572h, Integer.valueOf(R.attr.textIconEdit)) : new Q(wVar.f117571g, Integer.valueOf(R.attr.textIconAdd));
        String str = (String) q12.f406619b;
        int iIntValue = ((Number) q12.f406620c).intValue();
        if (str == null) {
            str = "";
        }
        iVar.Mx(iIntValue, new d(this, wVar), str);
        y yVar = this.f233424e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        AttributedText attributedText = wVar.f117569e;
        if (attributedText == null || (zVarLinkClicksV3 = attributedText.linkClicksV3()) == null) {
            dVarT0 = null;
        } else {
            final com.jakewharton.rxrelay3.c<DeepLink> cVar2 = this.f233423d;
            dVarT0 = zVarLinkClicksV3.t0(new l41.g() { // from class: com.avito.android.publish.details.adapter.objects.re23.price_list.e
                @Override // l41.g
                public final void accept(Object obj2) {
                    cVar2.accept((DeepLink) obj2);
                }
            });
        }
        this.f233424e = (y) dVarT0;
        iVar.a60(new C13996a(wVar.f117568d, wVar.f117577m, wVar.f117576l, wVar.f117580p, null, wVar.f117569e, null, wVar.f117578n, null, 336, null));
        iVar.s(wVar.f117568d);
        iVar.h5(new f(this));
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.n
    @k
    /* renamed from: k, reason: from getter */
    public final C41981q0 getF233422c() {
        return this.f233422c;
    }
}
