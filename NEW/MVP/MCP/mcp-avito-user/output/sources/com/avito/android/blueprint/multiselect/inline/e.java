package com.avito.android.blueprint.multiselect.inline;

import Hj.C13996a;
import JO.m;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.util.C35953u2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishInlineMultiselectPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/multiselect/inline/e;", "Lcom/avito/android/blueprint/multiselect/inline/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f105610b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f105611c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105612d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f105613e;

    /* compiled from: PublishInlineMultiselectPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f105615m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ m f105616n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, m mVar) {
            super(1);
            this.f105615m = str;
            this.f105616n = mVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            e.this.f105610b.accept(new Ij.b(this.f105615m, m.a(this.f105616n, zBooleanValue), null, 4, null));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishInlineMultiselectPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f105618m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DeepLink deepLink) {
            super(0);
            this.f105618m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            e.this.f105612d.accept(this.f105618m);
            return G0.f406611a;
        }
    }

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105610b = cVar;
        this.f105611c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105612d = cVar2;
        this.f105613e = new C41981q0(cVar2);
    }

    @Override // com.avito.android.blueprint.multiselect.inline.c
    @k
    public final z<DeepLink> E() {
        return this.f105613e;
    }

    public final C13996a O(ParameterElement.v vVar) {
        DeepLink deepLink;
        String str = vVar.f117543d;
        TipIconParameters tipIconParameters = vVar.f117559t;
        return new C13996a(str, vVar.f117555p, vVar.f117556q, vVar.f117564y, null, vVar.f117557r, (tipIconParameters == null || (deepLink = tipIconParameters.getDeepLink()) == null) ? null : new d(this, deepLink), vVar.f117546g, vVar.f117565z, 16, null);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((g) eVar, (ParameterElement.v) aVar);
    }

    public final void V(g gVar, String str, m mVar, Integer num) {
        DeepLink deepLink = mVar.f8966g;
        b bVar = deepLink != null ? new b(deepLink) : null;
        gVar.b8(mVar.f8961b, mVar.f8962c, mVar.f8963d, mVar.f8964e, bVar, num, new a(str, mVar));
    }

    @Override // com.avito.android.blueprint.multiselect.inline.c
    @k
    public final z<Ij.b> g() {
        return this.f105611c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        String str;
        g gVar = (g) eVar;
        ParameterElement.v vVar = (ParameterElement.v) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35953u2) {
                obj = obj2;
            }
        }
        if (!(obj instanceof C35953u2)) {
            obj = null;
        }
        C35953u2 c35953u2 = (C35953u2) obj;
        if (c35953u2 == null) {
            k(gVar, vVar);
            return;
        }
        gVar.a60(O(vVar));
        List<m> list2 = vVar.f117545f;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i13 = 0;
        for (Object obj3 : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new Q(Integer.valueOf(i13), (m) obj3));
            i13 = i14;
        }
        int iF2 = P0.f(C42745f0.q(arrayList, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((m) ((Q) next).f406620c).f8961b, next);
        }
        Iterator<T> it2 = c35953u2.f319089a.iterator();
        while (it2.hasNext()) {
            gVar.L8((String) it2.next());
        }
        Iterator<T> it3 = c35953u2.f319091c.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            str = vVar.f117181b;
            if (!zHasNext) {
                break;
            }
            Q q12 = (Q) linkedHashMap.get((String) it3.next());
            V(gVar, str, (m) q12.f406620c, Integer.valueOf(((Number) q12.f406619b).intValue()));
        }
        Iterator it4 = c35953u2.f319090b.iterator();
        while (it4.hasNext()) {
            Q q13 = (Q) linkedHashMap.get((String) it4.next());
            int iIntValue = ((Number) q13.f406619b).intValue();
            m mVar = (m) q13.f406620c;
            gVar.L8(mVar.f8961b);
            V(gVar, str, mVar, Integer.valueOf(iIntValue));
        }
        gVar.setEnabled(vVar.f117553n);
    }

    public final void k(@k g gVar, @k ParameterElement.v vVar) {
        gVar.a60(O(vVar));
        gVar.s(vVar.f117543d);
        gVar.za();
        Iterator<T> it = vVar.f117545f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                V(gVar, vVar.f117181b, (m) it.next(), null);
            }
        }
        gVar.setEnabled(vVar.f117553n);
        ParameterElement.v.a aVar = vVar.f117551l;
        gVar.k0(new CustomPaddings(aVar != null ? aVar.f117566a : null, aVar != null ? aVar.f117567b : null));
    }
}
