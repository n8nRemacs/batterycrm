package com.avito.android.publish.details.adapter.objects;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.util.o6;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MultiStateObjectsItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/g;", "Lcom/avito/android/publish/details/adapter/objects/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f233331b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f233332c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f233333d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<ParameterElement.w, Integer>> f233334e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f233335f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f233336g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f233337h;

    public g(@Y61.k com.avito.android.util.text.a aVar, @Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k Q1 q12) {
        this.f233331b = aVar;
        this.f233332c = interfaceC35807h4;
        this.f233333d = q12;
        com.jakewharton.rxrelay3.c<Q<ParameterElement.w, Integer>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f233334e = cVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f233335f = cVar2;
        this.f233336g = new C41981q0(cVar);
        this.f233337h = new C41981q0(cVar2);
    }

    @Override // com.avito.android.publish.details.adapter.objects.o
    @Y61.k
    public final z<DeepLink> B() {
        return this.f233337h;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        z<DeepLink> zVarLinkClicksV3;
        i iVar = (i) eVar;
        ParameterElement.w wVar = (ParameterElement.w) aVar;
        iVar.clearItems();
        ArrayList arrayList = new ArrayList();
        List<ParameterElement.w.a> list = wVar.f117574j;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ParameterElement.w.a.b) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (wVar.f117570f) {
                    String str = wVar.f117571g;
                    if (str == null || str.length() == 0) {
                        iVar.yo(new e(this, wVar));
                    } else {
                        iVar.Q60(str, new d(this, wVar));
                    }
                }
                boolean zBooleanValue = this.f233333d.w().invoke().booleanValue();
                boolean z12 = wVar.f117576l;
                String str2 = wVar.f117568d;
                if (zBooleanValue) {
                    iVar.setTitle(this.f233332c.a(str2, z12, wVar.f117580p));
                } else {
                    iVar.setTitle(z12 ? null : str2);
                }
                AttributedText attributedText = wVar.f117569e;
                iVar.k(attributedText);
                if (attributedText != null && (zVarLinkClicksV3 = attributedText.linkClicksV3()) != null) {
                    final com.jakewharton.rxrelay3.c<DeepLink> cVar = this.f233335f;
                    zVarLinkClicksV3.t0(new l41.g() { // from class: com.avito.android.publish.details.adapter.objects.f
                        @Override // l41.g
                        public final void accept(Object obj2) {
                            cVar.accept((DeepLink) obj2);
                        }
                    });
                }
                iVar.s(str2);
                Context f233340c = iVar.getF233340c();
                ItemWithState.State state = wVar.f117577m;
                int[] iArrL0 = C42745f0.L0(arrayList);
                AttributedText attributedText2 = wVar.f117578n;
                CharSequence charSequenceC = attributedText2 != null ? this.f233331b.c(f233340c, attributedText2) : null;
                if (state instanceof ItemWithState.State.Normal) {
                    CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
                    if (charSequence != null) {
                        charSequenceC = charSequence;
                    }
                    iVar.u(charSequenceC);
                    return;
                }
                if (state instanceof ItemWithState.State.Warning) {
                    iVar.ma(((ItemWithState.State.Warning) state).f173900b, iArrL0);
                    return;
                }
                if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
                    if (charSequenceC == null) {
                        charSequenceC = ((ItemWithState.State.Error.ErrorWithMessage) state).f173897b;
                    }
                    iVar.ma(charSequenceC, iArrL0);
                    return;
                } else {
                    if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
                        iVar.ma(charSequenceC, iArrL0);
                        return;
                    }
                    return;
                }
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            ParameterElement.w.a.b bVar = (ParameterElement.w.a.b) next;
            o6.f318942a.getClass();
            int iGenerateViewId = View.generateViewId();
            if (bVar.f117587d) {
                arrayList.add(Integer.valueOf(iGenerateViewId));
            }
            ArrayList arrayListB = C42756l.B(new String[]{bVar.f117584a, bVar.f117585b, bVar.f117586c});
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayListB.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!C43066x.K((String) next2)) {
                    arrayList3.add(next2);
                }
            }
            iVar.ns(iGenerateViewId, new c(this, wVar, i13), C42745f0.O(arrayList3, " · ", null, null, null, 62));
            i13 = i14;
        }
    }

    @Override // com.avito.android.publish.details.adapter.objects.o
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final C41981q0 getF233336g() {
        return this.f233336g;
    }
}
