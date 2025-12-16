package com.avito.android.blueprints.radio_card.radio_card_group;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.util.C35839l4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadioCardsGroupPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/radio_card/radio_card_group/g;", "Lcom/avito/android/blueprints/radio_card/radio_card_group/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f106539b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106540c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106541d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106542e;

    /* renamed from: f, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<String> f106543f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106544g;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106539b = cVar;
        this.f106540c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106541d = cVar2;
        this.f106542e = new C41981q0(cVar2);
        com.jakewharton.rxrelay3.c<String> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f106543f = cVar3;
        this.f106544g = new C41981q0(cVar3);
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.c
    @Y61.k
    /* renamed from: J4, reason: from getter */
    public final C41981q0 getF106542e() {
        return this.f106542e;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (ParameterElement.C.b) aVar);
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.c
    @Y61.k
    public final z<Ij.b> g() {
        return this.f106540c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35839l4) {
                obj = obj2;
            }
        }
        C35839l4 c35839l4 = (C35839l4) (obj instanceof C35839l4 ? obj : null);
        if (c35839l4 == null) {
            k(iVar, bVar);
            return;
        }
        ItemWithState.State state = c35839l4.f318923a;
        if (state != null) {
            if (state instanceof ItemWithState.State.Error) {
                iVar.G5();
            } else {
                iVar.G();
            }
        }
    }

    public final void k(@Y61.k i iVar, @Y61.k ParameterElement.C.b bVar) {
        iVar.setTitle(bVar.f117220p ? "" : bVar.f117208d);
        JO.m mVar = bVar.f117212h;
        List<JO.m> list = bVar.f117236E;
        iVar.V9(list.indexOf(mVar), list);
        if (bVar.f117219o instanceof ItemWithState.State.Error) {
            iVar.G5();
        } else {
            iVar.G();
        }
        iVar.bc(new d(this, bVar));
        iVar.H3(new e(this));
        iVar.xD(new f(this));
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.c
    @Y61.k
    /* renamed from: n3, reason: from getter */
    public final C41981q0 getF106544g() {
        return this.f106544g;
    }
}
