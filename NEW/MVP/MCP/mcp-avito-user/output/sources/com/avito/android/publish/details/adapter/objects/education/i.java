package com.avito.android.publish.details.adapter.objects.education;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.util.o6;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.core.z;
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

/* compiled from: EducationListPreviewItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/education/i;", "Lcom/avito/android/publish/details/adapter/objects/education/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f233313b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f233314c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f233315d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f233316e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<ParameterElement.w, Integer>> f233317f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f233318g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f233319h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f233320i;

    @Inject
    public i(@Y61.k com.avito.android.util.text.a aVar, @Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k Q1 q12, @Named("publish_details_is_editing") boolean z12) {
        this.f233313b = aVar;
        this.f233314c = interfaceC35807h4;
        this.f233315d = q12;
        this.f233316e = z12;
        com.jakewharton.rxrelay3.c<Q<ParameterElement.w, Integer>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f233317f = cVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f233318g = cVar2;
        this.f233319h = new C41981q0(cVar);
        this.f233320i = new C41981q0(cVar2);
    }

    @Override // com.avito.android.publish.details.adapter.objects.o
    @Y61.k
    public final z<DeepLink> B() {
        return this.f233320i;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String string;
        z<DeepLink> zVarLinkClicksV3;
        l lVar = (l) eVar;
        ParameterElement.w wVar = (ParameterElement.w) aVar;
        AttributedText attributedText = wVar.f117569e;
        if (attributedText != null && (zVarLinkClicksV3 = attributedText.linkClicksV3()) != null) {
            final com.jakewharton.rxrelay3.c<DeepLink> cVar = this.f233318g;
            zVarLinkClicksV3.t0(new l41.g() { // from class: com.avito.android.publish.details.adapter.objects.education.f
                @Override // l41.g
                public final void accept(Object obj) {
                    cVar.accept((DeepLink) obj);
                }
            });
        }
        lVar.clearItems();
        String str = wVar.f117568d;
        lVar.s(str);
        boolean z12 = this.f233316e;
        lVar.HL(z12 ? y6.b(6) : y6.b(0));
        boolean zBooleanValue = this.f233315d.w().invoke().booleanValue();
        boolean z13 = wVar.f117576l;
        if (zBooleanValue) {
            lVar.setTitle(this.f233314c.a(str, z13, wVar.f117580p));
        } else {
            if (z13) {
                str = null;
            }
            lVar.setTitle(str);
        }
        lVar.k(attributedText);
        ArrayList arrayList = new ArrayList();
        List<ParameterElement.w.a> list = wVar.f117574j;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ParameterElement.w.a.C3418a) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            ParameterElement.w.a.C3418a c3418a = (ParameterElement.w.a.C3418a) next;
            o6.f318942a.getClass();
            int iGenerateViewId = View.generateViewId();
            if (c3418a.f117583c) {
                arrayList.add(Integer.valueOf(iGenerateViewId));
            }
            lVar.jg(iGenerateViewId, new g(this, wVar, i13), c3418a.f117581a, c3418a.f117582b);
            i13 = i14;
        }
        if (wVar.f117570f) {
            if (list.isEmpty()) {
                string = wVar.f117571g;
                if (string == null) {
                    string = lVar.getF233327c().getString(R.string.add);
                }
            } else {
                string = wVar.f117572h;
                if (string == null) {
                    string = lVar.getF233327c().getString(R.string.add_more);
                }
            }
            lVar.F3(z12 ? -1 : 0, new h(this, wVar), string);
        }
        Context f233327c = lVar.getF233327c();
        ItemWithState.State state = wVar.f117577m;
        int[] iArrL0 = C42745f0.L0(arrayList);
        AttributedText attributedText2 = wVar.f117578n;
        CharSequence charSequenceC = attributedText2 != null ? this.f233313b.c(f233327c, attributedText2) : null;
        if (state instanceof ItemWithState.State.Normal) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence != null) {
                charSequenceC = charSequence;
            }
            lVar.u(charSequenceC);
            return;
        }
        if (state instanceof ItemWithState.State.Warning) {
            lVar.ma(((ItemWithState.State.Warning) state).f173900b, iArrL0);
            return;
        }
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            if (charSequenceC == null) {
                charSequenceC = ((ItemWithState.State.Error.ErrorWithMessage) state).f173897b;
            }
            lVar.ma(charSequenceC, iArrL0);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            lVar.ma(charSequenceC, iArrL0);
        }
    }

    @Override // com.avito.android.publish.details.adapter.objects.o
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final C41981q0 getF233319h() {
        return this.f233319h;
    }
}
