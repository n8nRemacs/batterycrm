package com.avito.android.blueprints.chips_multiselect;

import JO.m;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.blueprints.chips_multiselect.h;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.util.O;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsMultiselectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/chips_multiselect/f;", "Lcom/avito/android/blueprints/chips_multiselect/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f105875b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q1 f105876c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f105877d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f105878e;

    /* renamed from: f, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105879f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C41981q0 f105880g;

    @Inject
    public f(@k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f105875b = interfaceC35807h4;
        this.f105876c = q12;
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105877d = cVar;
        this.f105878e = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105879f = cVar2;
        this.f105880g = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((com.avito.android.blueprints.chips.g) eVar, (ParameterElement.v) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        com.avito.android.blueprints.chips.g gVar = (com.avito.android.blueprints.chips.g) eVar;
        ParameterElement.v vVar = (ParameterElement.v) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof O) {
                obj = obj2;
            }
        }
        if (!(obj instanceof O)) {
            obj = null;
        }
        O o12 = (O) obj;
        if (o12 == null) {
            k(gVar, vVar);
            return;
        }
        ItemWithState.State state = o12.f318702c;
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            gVar.setError(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b.toString());
        } else if (state instanceof ItemWithState.State.Error) {
            gVar.setError(null);
        } else {
            gVar.G();
        }
        ArrayList arrayListA = h.a(vVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o12.f318700a.contains(((com.avito.android.blueprints.chips.a) next).f105838b)) {
                arrayList.add(next);
            }
        }
        gVar.Wa(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayListA.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (o12.f318701b.contains(((com.avito.android.blueprints.chips.a) next2).f105838b)) {
                arrayList2.add(next2);
            }
        }
        gVar.ub(arrayList2);
    }

    @Override // com.avito.android.blueprints.chips_multiselect.c
    @k
    public final z<Ij.b> h() {
        return this.f105878e;
    }

    public final void k(@k com.avito.android.blueprints.chips.g gVar, @k ParameterElement.v vVar) {
        ParameterElement.DisplayType displayType = vVar.f117547h;
        boolean z12 = displayType instanceof ParameterElement.DisplayType.Chips;
        ParameterElement.DisplayType.Chips chips = z12 ? (ParameterElement.DisplayType.Chips) displayType : null;
        ParameterElement.DisplayType.Chips.Style style = chips != null ? chips.f117247b : null;
        int i12 = style == null ? -1 : h.a.f105881a[style.ordinal()];
        gVar.m2(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? Chips.DisplayType.f178704e : Chips.DisplayType.f178704e : Chips.DisplayType.f178703d : Chips.DisplayType.f178702c : Chips.DisplayType.f178701b);
        boolean zBooleanValue = this.f105876c.w().invoke().booleanValue();
        boolean z13 = vVar.f117556q;
        String str = vVar.f117543d;
        if (zBooleanValue) {
            gVar.setTitle(this.f105875b.a(str, z13, vVar.f117564y));
        } else {
            if (z13) {
                str = "";
            }
            gVar.setTitle(str);
        }
        gVar.k(vVar.f117557r);
        gVar.rb(vVar.f117546g);
        if (vVar.f117559t != null) {
            gVar.fF(new d(this, vVar));
        } else {
            gVar.fF(null);
        }
        ItemWithState.State state = vVar.f117555p;
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            gVar.setError(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b.toString());
        } else if (state instanceof ItemWithState.State.Error) {
            gVar.setError(null);
        } else {
            gVar.G();
        }
        if (z12) {
            gVar.i2(((ParameterElement.DisplayType.Chips) displayType).f117246a);
        } else {
            gVar.i2(true);
        }
        gVar.r3(SelectStrategy.f178717c);
        gVar.be(vVar.f117558s);
        ArrayList arrayListA = h.a(vVar);
        List<m> list = vVar.f117545f;
        ArrayList arrayList = new ArrayList();
        for (m mVar : list) {
            com.avito.android.blueprints.chips.a aVar = mVar.f8964e ? new com.avito.android.blueprints.chips.a(mVar.f8961b, mVar.f8962c) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        gVar.L7(arrayListA, arrayList, new e(this, vVar));
    }

    @Override // com.avito.android.blueprints.chips_multiselect.c
    @k
    /* renamed from: o, reason: from getter */
    public final C41981q0 getF105880g() {
        return this.f105880g;
    }
}
