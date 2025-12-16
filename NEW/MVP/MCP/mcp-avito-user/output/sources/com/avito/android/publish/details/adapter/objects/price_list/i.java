package com.avito.android.publish.details.adapter.objects.price_list;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.util.O2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: PriceListPreviewItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/price_list/i;", "Lcom/avito/android/publish/details/adapter/objects/price_list/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f233368b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q1 f233369c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f233370d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f233371e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f233372f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.w> f233373g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f233374h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Boolean f233375i;

    @Inject
    public i(@Y61.k com.avito.android.util.text.a aVar, @Y61.k Q1 q12, @Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k Q1 q13) {
        this.f233368b = aVar;
        this.f233369c = q12;
        this.f233370d = interfaceC35807h4;
        this.f233371e = q13;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f233372f = cVar;
        new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<ParameterElement.w> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f233373g = cVar2;
        this.f233374h = new C41981q0(cVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        z<DeepLink> zVarLinkClicksV3;
        k kVar = (k) eVar;
        ParameterElement.w wVar = (ParameterElement.w) aVar;
        if (this.f233375i == null) {
            this.f233375i = Boolean.valueOf(wVar.f117575k);
        }
        Boolean bool = this.f233375i;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        List<ParameterElement.w.a> list = wVar.f117574j;
        if (zBooleanValue && list.isEmpty()) {
            Q1 q12 = this.f233369c;
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[20];
            if (((Boolean) q12.f67516v.a().invoke()).booleanValue()) {
                this.f233375i = Boolean.FALSE;
                this.f233373g.accept(wVar);
            }
        }
        Q q13 = O2.a(list) ? new Q(wVar.f117572h, Integer.valueOf(R.drawable.common_ic_edit_20)) : new Q(wVar.f117571g, Integer.valueOf(R.drawable.common_ic_add_round_20));
        String str = (String) q13.f406619b;
        int iIntValue = ((Number) q13.f406620c).intValue();
        kVar.clearItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ParameterElement.w.a.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ParameterElement.w.a.c cVar = (ParameterElement.w.a.c) it.next();
            kVar.Xb(cVar.f117588a, cVar.f117589b);
        }
        if (str == null) {
            str = "";
        }
        kVar.F3(iIntValue, new g(this, wVar), str);
        boolean zBooleanValue2 = this.f233371e.w().invoke().booleanValue();
        boolean z12 = wVar.f117576l;
        String str2 = wVar.f117568d;
        if (zBooleanValue2) {
            kVar.setTitle(this.f233370d.a(str2, z12, wVar.f117580p));
        } else {
            kVar.setTitle(z12 ? null : str2);
        }
        AttributedText attributedText = wVar.f117569e;
        kVar.k(attributedText);
        if (attributedText != null && (zVarLinkClicksV3 = attributedText.linkClicksV3()) != null) {
            final com.jakewharton.rxrelay3.c<DeepLink> cVar2 = this.f233372f;
            zVarLinkClicksV3.t0(new l41.g() { // from class: com.avito.android.publish.details.adapter.objects.price_list.h
                @Override // l41.g
                public final void accept(Object obj2) {
                    cVar2.accept((DeepLink) obj2);
                }
            });
        }
        kVar.s(str2);
        Context f233382c = kVar.getF233382c();
        ItemWithState.State state = wVar.f117577m;
        AttributedText attributedText2 = wVar.f117578n;
        CharSequence charSequenceC = attributedText2 != null ? this.f233368b.c(f233382c, attributedText2) : null;
        if (state instanceof ItemWithState.State.Normal) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence != null) {
                charSequenceC = charSequence;
            }
            kVar.u(charSequenceC);
            return;
        }
        if (state instanceof ItemWithState.State.Warning) {
            kVar.H(((ItemWithState.State.Warning) state).f173900b);
            return;
        }
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            if (charSequenceC == null) {
                charSequenceC = ((ItemWithState.State.Error.ErrorWithMessage) state).f173897b;
            }
            kVar.H(charSequenceC);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            kVar.H(null);
        }
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.n
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final C41981q0 getF233374h() {
        return this.f233374h;
    }
}
