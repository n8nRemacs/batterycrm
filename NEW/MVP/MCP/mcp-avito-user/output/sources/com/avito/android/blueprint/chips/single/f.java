package com.avito.android.blueprint.chips.single;

import Gj.InterfaceC13889a;
import Hj.C13996a;
import JO.m;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprint.chips.single.h;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishChipsSinglePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/chips/single/f;", "Lcom/avito/android/blueprint/chips/single/d;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f105436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f105437c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105438d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f105439e;

    /* compiled from: PublishChipsSinglePresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chipable", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.C.b f105440l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f f105441m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParameterElement.C.b bVar, f fVar) {
            super(2);
            this.f105440l = bVar;
            this.f105441m = fVar;
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
            Object next;
            com.avito.android.lib.design.chips.h hVar2 = hVar;
            boolean zBooleanValue = bool.booleanValue();
            if (zBooleanValue) {
                ParameterElement.C.b bVar = this.f105440l;
                Iterator<T> it = bVar.f117236E.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((m) next).f8961b, ((com.avito.android.blueprint.chips.single.a) hVar2).f105424b)) {
                        break;
                    }
                }
                m mVar = (m) next;
                if (mVar != null) {
                    mVar.f8964e = zBooleanValue;
                    String str = bVar.f117181b;
                    this.f105441m.f105436b.accept(new Ij.b(str, mVar, null, 4, null));
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105436b = cVar;
        this.f105437c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105438d = cVar2;
        this.f105439e = new C41981q0(cVar2);
    }

    public final void O(InterfaceC13889a interfaceC13889a, ParameterElement.C.b bVar) {
        List<m> list = bVar.f117236E;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (m mVar : list) {
            arrayList.add(new com.avito.android.blueprint.chips.single.a(mVar.f8961b, mVar.f8962c));
        }
        m mVar2 = bVar.f117212h;
        interfaceC13889a.L7(arrayList, mVar2 != null ? Collections.singletonList(new com.avito.android.blueprint.chips.single.a(mVar2.f8961b, mVar2.f8962c)) : null, new a(bVar, this));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC13889a interfaceC13889a = (InterfaceC13889a) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        k(interfaceC13889a, bVar);
        O(interfaceC13889a, bVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        InterfaceC13889a interfaceC13889a = (InterfaceC13889a) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.util.N) {
                obj = obj2;
            }
        }
        com.avito.android.util.N n12 = (com.avito.android.util.N) (obj instanceof com.avito.android.util.N ? obj : null);
        if (n12 == null) {
            k(interfaceC13889a, bVar);
            O(interfaceC13889a, bVar);
        } else {
            k(interfaceC13889a, bVar);
            if (n12.f318690a != null) {
                O(interfaceC13889a, bVar);
            }
        }
    }

    @Override // com.avito.android.blueprint.chips.single.d
    @k
    public final z<Ij.b> h() {
        return this.f105437c;
    }

    public final void k(InterfaceC13889a interfaceC13889a, ParameterElement.C.b bVar) {
        DeepLink deepLink;
        ParameterElement.DisplayType displayType = bVar.f117213i;
        e eVar = null;
        ParameterElement.DisplayType.Chips chips = displayType instanceof ParameterElement.DisplayType.Chips ? (ParameterElement.DisplayType.Chips) displayType : null;
        ParameterElement.DisplayType.Chips.Style style = chips != null ? chips.f117247b : null;
        int i12 = style == null ? -1 : h.a.f105443a[style.ordinal()];
        Chips.DisplayType displayType2 = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? Chips.DisplayType.f178701b : Chips.DisplayType.f178704e : Chips.DisplayType.f178703d : Chips.DisplayType.f178702c : Chips.DisplayType.f178701b;
        TipIconParameters tipIconParameters = bVar.f117222r;
        if (tipIconParameters != null && (deepLink = tipIconParameters.getDeepLink()) != null) {
            eVar = new e(this, deepLink);
        }
        interfaceC13889a.a60(new C13996a(bVar.f117208d, bVar.f117219o, bVar.f117220p, bVar.f117227w, null, bVar.f117209e, eVar, bVar.f117211g, null, 272, null));
        interfaceC13889a.m2(displayType2);
        interfaceC13889a.i2(true);
        interfaceC13889a.r3(SelectStrategy.f178716b);
    }

    @Override // com.avito.android.blueprint.chips.single.d
    @k
    /* renamed from: o, reason: from getter */
    public final C41981q0 getF105439e() {
        return this.f105439e;
    }
}
