package com.avito.android.verification.inn;

import androidx.view.C23038g0;
import com.avito.android.di.B;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.select.Arguments;
import com.avito.android.util.architecture_components.D;
import com.avito.android.verification.inn.list.Hidable;
import com.avito.android.verification.inn.list.select.SelectItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InnListPresenterOld.kt */
@B
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/inn/b;", "Lcom/avito/android/verification/inn/list/disclosure/d;", "Lcom/avito/android/verification/inn/list/checkbox/d;", "Lcom/avito/android/verification/inn/list/select/c;", "Lcom/avito/android/verification/inn/list/inn_info/d;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.verification.inn.list.disclosure.d, com.avito.android.verification.inn.list.checkbox.d, com.avito.android.verification.inn.list.select.c, com.avito.android.verification.inn.list.inn_info.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D<Arguments> f323875b = new D<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final D<G0> f323876c = new D<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f323877d = new C23038g0<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final D<Integer> f323878e = new D<>();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f323879f = true;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public Object f323880g = C42784z0.f406748b;

    @Inject
    public b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.verification.inn.list.disclosure.d
    public final void a(@Y61.k com.avito.android.verification.inn.list.disclosure.a aVar) {
        f(null, this.f323880g);
    }

    @Override // com.avito.android.verification.inn.list.inn_info.d
    public final void b(@Y61.k com.avito.android.verification.inn.list.inn_info.a aVar) {
        this.f323876c.setValue(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.verification.inn.list.checkbox.d
    public final void c(@Y61.k com.avito.android.verification.inn.list.checkbox.a aVar) {
        f(null, this.f323880g);
    }

    @Override // com.avito.android.verification.inn.list.select.c
    public final void d(@Y61.k SelectItem selectItem) {
        this.f323875b.setValue(new Arguments(false, selectItem.f324058b, null, selectItem.f324065i, C42745f0.V(selectItem.f324066j), selectItem.f324063g, null, false, false, false, false, false, true, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -7355, 255, null));
    }

    public final void e(@Y61.k Map<String, AttributedText> map) {
        Object next;
        Object next2;
        ArrayList arrayList = new ArrayList((Collection) this.f323880g);
        Iterator<Map.Entry<String, AttributedText>> it = map.entrySet().iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, AttributedText> next3 = it.next();
            String key = next3.getKey();
            AttributedText value = next3.getValue();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                if (L.f(((com.avito.conveyor_item.a) next4).getF317677b(), key)) {
                    obj = next4;
                    break;
                }
            }
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (aVar instanceof GM0.a) {
                arrayList.set(arrayList.indexOf(aVar), ((GM0.a) aVar).S0(value));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next5 = it3.next();
            if (next5 instanceof GM0.a) {
                arrayList2.add(next5);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            } else {
                next = it4.next();
                if (((GM0.a) next).getF324039i() != null) {
                    break;
                }
            }
        }
        GM0.a aVar2 = (GM0.a) next;
        Hidable hidable = aVar2 instanceof Hidable ? (Hidable) aVar2 : null;
        if ((hidable != null ? hidable.getF324099d() : null) == Hidable.Hidden.f323897c) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                Object next6 = it5.next();
                if (next6 instanceof com.avito.android.verification.inn.list.disclosure.a) {
                    arrayList3.add(next6);
                }
            }
            Iterator it6 = arrayList3.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it6.next();
                    if (((com.avito.android.verification.inn.list.disclosure.a) next2).f323961g.contains(aVar2.getF317677b())) {
                        break;
                    }
                }
            }
            com.avito.android.verification.inn.list.disclosure.a aVar3 = (com.avito.android.verification.inn.list.disclosure.a) next2;
            if (aVar3 != null) {
                aVar3.f323959e = true;
            }
        }
        f(aVar2 != null ? aVar2.getF317677b() : null, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(@Y61.l java.lang.String r13, @Y61.k java.util.List r14) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.inn.b.f(java.lang.String, java.util.List):void");
    }
}
