package com.avito.android.blueprints.selector_card.multiselect;

import JO.m;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.util.C35830k3;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectSelectorCardGroupPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/blueprints/selector_card/multiselect/f;", "Lcom/avito/android/blueprints/selector_card/multiselect/e;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.b<List<Ij.b>> f106644b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f106645c;

    /* compiled from: MultiselectSelectorCardGroupPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card/multiselect/f$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f106646a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Ij.b f106647b;

        public a(boolean z12, @k Ij.b bVar) {
            this.f106646a = z12;
            this.f106647b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f106646a == aVar.f106646a && L.f(this.f106647b, aVar.f106647b);
        }

        public final int hashCode() {
            return this.f106647b.hashCode() + (Boolean.hashCode(this.f106646a) * 31);
        }

        @k
        public final String toString() {
            return "OptionSelectInfo(isSingleValue=" + this.f106646a + ", info=" + this.f106647b + ')';
        }
    }

    @Inject
    public f() {
        com.jakewharton.rxrelay3.b<List<Ij.b>> bVar = new com.jakewharton.rxrelay3.b<>();
        this.f106644b = bVar;
        this.f106645c = new C41981q0(bVar);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (ParameterElement.E) aVar);
    }

    @Override // com.avito.android.blueprints.selector_card.multiselect.e
    @k
    /* renamed from: W, reason: from getter */
    public final C41981q0 getF106645c() {
        return this.f106645c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        ParameterElement.E e12 = (ParameterElement.E) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35830k3) {
                obj = obj2;
            }
        }
        C35830k3 c35830k3 = (C35830k3) (obj instanceof C35830k3 ? obj : null);
        if (c35830k3 == null) {
            k(iVar, e12);
            return;
        }
        List<ParameterElement.E.b> list2 = c35830k3.f318915a;
        if (list2 != null) {
            iVar.pd(list2);
        }
        ItemWithState.State state = c35830k3.f318916b;
        if (state != null) {
            if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
                iVar.G5();
            } else {
                iVar.G();
            }
        }
    }

    public final void k(@k i iVar, @k ParameterElement.E e12) {
        ArrayList arrayList = e12.f117277d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            ParameterElement.E.b bVar = (ParameterElement.E.b) it.next();
            String str = bVar.f117283b;
            String str2 = bVar.f117286e;
            if (str2 == null) {
                str2 = "";
            }
            m mVar = new m(str, str2, null, bVar.f117284c, null, null, null, false, null, null, false, null, null, null, null, null, 65524, null);
            linkedHashMap.put(str, new a(bVar.f117285d, new Ij.b(e12.f117181b, mVar, null, 4, null)));
        }
        iVar.pd(arrayList);
        if (e12.f117279f instanceof ItemWithState.State.Error.ErrorWithMessage) {
            iVar.G5();
        } else {
            iVar.G();
        }
        iVar.TY(e12.f117278e);
        iVar.WW(new g(this, linkedHashMap, e12));
    }
}
