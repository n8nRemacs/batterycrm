package com.avito.android.publish.details.adapter.objects.re23;

import Hj.C13996a;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.o6;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ObjectsPreviewItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/re23/i;", "Lcom/avito/android/publish/details/adapter/objects/re23/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements c {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f233400b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<ParameterElement.w, Integer>> f233401c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f233402d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f233403e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f233404f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public y f233405g;

    @Inject
    public i(@Named("publish_details_is_editing") boolean z12) {
        this.f233400b = z12;
        com.jakewharton.rxrelay3.c<Q<ParameterElement.w, Integer>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f233401c = cVar;
        this.f233402d = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f233403e = cVar2;
        this.f233404f = new C41981q0(cVar2);
    }

    @Override // com.avito.android.publish.details.adapter.objects.o
    @Y61.k
    public final z<DeepLink> B() {
        return this.f233404f;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        io.reactivex.rxjava3.disposables.d dVarT0;
        String string;
        z<DeepLink> zVarLinkClicksV3;
        k kVar = (k) eVar;
        ParameterElement.w wVar = (ParameterElement.w) aVar;
        y yVar = this.f233405g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        AttributedText attributedText = wVar.f117569e;
        if (attributedText == null || (zVarLinkClicksV3 = attributedText.linkClicksV3()) == null) {
            dVarT0 = null;
        } else {
            final com.jakewharton.rxrelay3.c<DeepLink> cVar = this.f233403e;
            dVarT0 = zVarLinkClicksV3.t0(new l41.g() { // from class: com.avito.android.publish.details.adapter.objects.re23.d
                @Override // l41.g
                public final void accept(Object obj) {
                    cVar.accept((DeepLink) obj);
                }
            });
        }
        this.f233405g = (y) dVarT0;
        kVar.clearItems();
        List<ParameterElement.w.a> list = wVar.f117574j;
        List<ParameterElement.w.a> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof ParameterElement.w.a.b) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof ParameterElement.w.a.C3418a) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                int i14 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ParameterElement.w.a.C3418a c3418a = (ParameterElement.w.a.C3418a) next;
                    o6.f318942a.getClass();
                    kVar.KE(View.generateViewId(), c3418a.f117581a, c3418a.f117583c, c3418a.f117582b, new f(this, wVar, i14));
                    i14 = i15;
                }
                if (list.isEmpty()) {
                    string = wVar.f117571g;
                    if (string == null) {
                        string = kVar.getContext().getString(R.string.add);
                    }
                } else {
                    string = wVar.f117572h;
                    if (string == null) {
                        string = kVar.getContext().getString(R.string.add_more);
                    }
                }
                kVar.vT(string, wVar.f117570f, new g(this, wVar));
                kVar.a60(new C13996a(wVar.f117568d, wVar.f117577m, wVar.f117576l, wVar.f117580p, null, wVar.f117569e, null, wVar.f117578n, null, 336, null));
                kVar.s(wVar.f117568d);
                kVar.k0(new CustomPaddings(Integer.valueOf(y6.b(this.f233400b ? 6 : 0)), null, 2, null));
                kVar.h5(new h(this));
                return;
            }
            Object next2 = it.next();
            int i16 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            ParameterElement.w.a.b bVar = (ParameterElement.w.a.b) next2;
            o6.f318942a.getClass();
            int iGenerateViewId = View.generateViewId();
            String str = bVar.f117584a;
            String[] strArr = {bVar.f117585b, bVar.f117586c};
            ArrayList arrayList3 = new ArrayList();
            int i17 = 0;
            for (int i18 = 2; i17 < i18; i18 = 2) {
                String str2 = strArr[i17];
                if (str2 != null && !C43066x.K(str2)) {
                    arrayList3.add(str2);
                }
                i17++;
            }
            kVar.KE(iGenerateViewId, str, bVar.f117587d, C42745f0.O(arrayList3, " · ", null, null, null, 62), new e(this, wVar, i13));
            i13 = i16;
        }
    }

    @Override // com.avito.android.publish.details.adapter.objects.o
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final C41981q0 getF233402d() {
        return this.f233402d;
    }
}
