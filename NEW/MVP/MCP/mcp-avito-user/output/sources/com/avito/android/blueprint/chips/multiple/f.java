package com.avito.android.blueprint.chips.multiple;

import Gj.InterfaceC13889a;
import Hj.C13996a;
import JO.m;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprint.chips.multiple.h;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.util.O;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishChipsMultiplePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/chips/multiple/f;", "Lcom/avito/android/blueprint/chips/multiple/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f105418b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f105419c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105420d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f105421e;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105418b = cVar;
        this.f105419c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105420d = cVar2;
        this.f105421e = new C41981q0(cVar2);
    }

    public final C13996a O(ParameterElement.v vVar) {
        DeepLink deepLink;
        String str = vVar.f117543d;
        TipIconParameters tipIconParameters = vVar.f117559t;
        return new C13996a(str, vVar.f117555p, vVar.f117556q, vVar.f117564y, null, vVar.f117557r, (tipIconParameters == null || (deepLink = tipIconParameters.getDeepLink()) == null) ? null : new e(this, deepLink), vVar.f117546g, null, 272, null);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((InterfaceC13889a) eVar, (ParameterElement.v) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        InterfaceC13889a interfaceC13889a = (InterfaceC13889a) eVar;
        ParameterElement.v vVar = (ParameterElement.v) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof O) {
                obj = obj2;
            }
        }
        O o12 = (O) (obj instanceof O ? obj : null);
        if (o12 == null) {
            k(interfaceC13889a, vVar);
            return;
        }
        interfaceC13889a.a60(O(vVar));
        ArrayList arrayListA = h.a(vVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o12.f318700a.contains(((com.avito.android.blueprints.chips.a) next).f105838b)) {
                arrayList.add(next);
            }
        }
        interfaceC13889a.Wa(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayListA.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (o12.f318701b.contains(((com.avito.android.blueprints.chips.a) next2).f105838b)) {
                arrayList2.add(next2);
            }
        }
        interfaceC13889a.ub(arrayList2);
    }

    @Override // com.avito.android.blueprint.chips.multiple.c
    @k
    public final z<Ij.b> h() {
        return this.f105419c;
    }

    public final void k(@k InterfaceC13889a interfaceC13889a, @k ParameterElement.v vVar) {
        interfaceC13889a.a60(O(vVar));
        ParameterElement.DisplayType displayType = vVar.f117547h;
        boolean z12 = displayType instanceof ParameterElement.DisplayType.Chips;
        ParameterElement.DisplayType.Chips chips = z12 ? (ParameterElement.DisplayType.Chips) displayType : null;
        ParameterElement.DisplayType.Chips.Style style = chips != null ? chips.f117247b : null;
        int i12 = style == null ? -1 : h.a.f105423a[style.ordinal()];
        interfaceC13889a.m2(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? Chips.DisplayType.f178704e : Chips.DisplayType.f178704e : Chips.DisplayType.f178703d : Chips.DisplayType.f178702c : Chips.DisplayType.f178701b);
        if (z12) {
            interfaceC13889a.i2(((ParameterElement.DisplayType.Chips) displayType).f117246a);
        } else {
            interfaceC13889a.i2(true);
        }
        interfaceC13889a.r3(SelectStrategy.f178717c);
        interfaceC13889a.be(vVar.f117558s);
        ArrayList arrayListA = h.a(vVar);
        List<m> list = vVar.f117545f;
        ArrayList arrayList = new ArrayList();
        for (m mVar : list) {
            com.avito.android.blueprints.chips.a aVar = mVar.f8964e ? new com.avito.android.blueprints.chips.a(mVar.f8961b, mVar.f8962c) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        interfaceC13889a.L7(arrayListA, arrayList, new d(vVar, this));
    }

    @Override // com.avito.android.blueprint.chips.multiple.c
    @k
    /* renamed from: o, reason: from getter */
    public final C41981q0 getF105421e() {
        return this.f105421e;
    }
}
