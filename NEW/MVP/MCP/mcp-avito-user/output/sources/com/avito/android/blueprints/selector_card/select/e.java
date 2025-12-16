package com.avito.android.blueprints.selector_card.select;

import JO.m;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.util.C35808h5;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardGroupPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card/select/e;", "Lcom/avito/android/blueprints/selector_card/select/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f106663b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q1 f106664c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f106665d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f106666e;

    @Inject
    public e(@k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f106663b = interfaceC35807h4;
        this.f106664c = q12;
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106665d = cVar;
        this.f106666e = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((g) eVar, (ParameterElement.C.b) aVar);
    }

    @Override // com.avito.android.blueprints.selector_card.select.c
    @k
    public final z<Ij.b> g() {
        return this.f106666e;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35808h5) {
                obj = obj2;
            }
        }
        C35808h5 c35808h5 = (C35808h5) (obj instanceof C35808h5 ? obj : null);
        if (c35808h5 == null) {
            k(gVar, bVar);
            return;
        }
        ItemWithState.State state = c35808h5.f318897b;
        if (state != null) {
            if (state instanceof ItemWithState.State.Error) {
                gVar.G5();
            } else {
                gVar.G();
            }
        }
        m mVar = c35808h5.f318896a;
        if (mVar != null) {
            gVar.S4(bVar.f117236E.indexOf(mVar));
        }
    }

    public final void k(@k g gVar, @k ParameterElement.C.b bVar) {
        boolean zBooleanValue = this.f106664c.w().invoke().booleanValue();
        boolean z12 = bVar.f117220p;
        String str = bVar.f117208d;
        if (zBooleanValue) {
            gVar.setTitle(this.f106663b.a(str, z12, bVar.f117227w));
        } else {
            if (z12) {
                str = "";
            }
            gVar.setTitle(str);
        }
        gVar.k(bVar.f117209e);
        Object obj = bVar.f117212h;
        List list = bVar.f117236E;
        gVar.V9(list.indexOf(obj), list);
        if (bVar.f117219o instanceof ItemWithState.State.Error) {
            gVar.G5();
        } else {
            gVar.G();
        }
        gVar.bc(new d(this, bVar));
    }
}
