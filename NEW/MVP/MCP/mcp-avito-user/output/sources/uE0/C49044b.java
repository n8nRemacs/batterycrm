package ue0;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.price_list.items.header.e;
import com.avito.android.publish.price_list.items.selectable.t;
import com.avito.android.publish.price_list.items.selected.d;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameterKt;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.price_list.PriceListGroup;
import com.avito.android.util.C35876q3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.inject.Inject;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import t3.l0;
import u3.l;

/* compiled from: SelectPriceListItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lue0/b;", "Lue0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ue0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49044b implements InterfaceC49043a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.publish.price_list.domain.c f440204a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C35876q3 f440205b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Resources f440206c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f440207d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ObjectsParameter.Summary f440208e;

    @Inject
    public C49044b(@k com.avito.android.publish.price_list.domain.c cVar, @k C35876q3 c35876q3, @k Resources resources, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f440204a = cVar;
        this.f440205b = c35876q3;
        this.f440206c = resources;
        this.f440207d = lVar;
        this.f440208e = cVar.k();
    }

    public static String g(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ParameterSlot parameterSlot = (ParameterSlot) next;
            if ((parameterSlot instanceof HasError) && ((HasError) parameterSlot).hasError()) {
                break;
            }
        }
        HasError hasError = next instanceof HasError ? (HasError) next : null;
        if (hasError != null) {
            return hasError.mo56getErrorMessage();
        }
        return null;
    }

    @Override // ue0.InterfaceC49043a
    @k
    public final ArrayList a(@k List list, @k Set set) throws Resources.NotFoundException {
        d dVarF = f();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(d());
        arrayList.addAll(e());
        com.avito.android.publish.price_list.items.selectable.d dVarC = c();
        if (dVarC != null) {
            arrayList.add(dVarC);
        }
        List<PriceListGroup> list2 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (PriceListGroup priceListGroup : list2) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (priceListGroup.getIds().contains(((com.avito.android.publish.price_list.items.selectable.d) next).f238673d)) {
                    arrayList3.add(next);
                }
            }
            arrayList2.add(new com.avito.android.publish.price_list.items.group.a(String.valueOf(priceListGroup.getTitle().hashCode()), priceListGroup.getTitle(), set.contains(priceListGroup.getTitle()), arrayList3));
        }
        ArrayList arrayList4 = new ArrayList();
        if (dVarF != null) {
            arrayList4.add(dVarF);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            com.avito.android.publish.price_list.items.group.a aVar = (com.avito.android.publish.price_list.items.group.a) it2.next();
            arrayList4.add(aVar);
            if (aVar.f238631d) {
                arrayList4.addAll(aVar.f238632e);
            }
            if (this.f440207d.f439745a.f439749b.b()) {
                arrayList4.add(new com.avito.android.publish.price_list.items.spacer.c());
            }
        }
        return arrayList4;
    }

    @Override // ue0.InterfaceC49043a
    @k
    public final ArrayList b() throws Resources.NotFoundException {
        d dVarF = f();
        ArrayList arrayListD = d();
        String f238536e = this.f440204a.getF238536e();
        if (f238536e == null) {
            f238536e = this.f440206c.getString(R.string.self_services_header_title);
        }
        e eVar = new e(f238536e);
        ArrayList arrayListE = e();
        com.avito.android.publish.price_list.items.selectable.d dVarC = c();
        ArrayList arrayList = new ArrayList();
        if (dVarF != null) {
            arrayList.add(dVarF);
        }
        arrayList.addAll(arrayListD);
        l<SimpleTestGroupWithNone> lVar = this.f440207d;
        if (lVar.f439745a.f439749b.b()) {
            arrayList.add(new com.avito.android.publish.price_list.items.spacer.c());
        }
        arrayList.add(eVar);
        arrayList.addAll(arrayListE);
        if (dVarC != null) {
            arrayList.add(dVarC);
        }
        if (lVar.f439745a.f439749b.b()) {
            arrayList.add(new com.avito.android.publish.price_list.items.spacer.c());
        }
        return arrayList;
    }

    public final com.avito.android.publish.price_list.items.selectable.d c() {
        ParcelableEntity<String> parcelableEntityJ = this.f440204a.j();
        if (parcelableEntityJ != null) {
            return new com.avito.android.publish.price_list.items.selectable.d(parcelableEntityJ.getId(), null, parcelableEntityJ.getId(), parcelableEntityJ.getTitle(), null, new t.a(parcelableEntityJ.getId(), 0, 2, null), 18, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList d() {
        C42829l0 c42829l0;
        com.avito.android.publish.price_list.domain.c cVar = this.f440204a;
        List<ParcelableEntity<String>> listE = cVar.e();
        ArrayList arrayList = new ArrayList(C42745f0.q(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            ParcelableEntity parcelableEntity = (ParcelableEntity) it.next();
            Q<Integer, List<ParameterSlot>> qF2 = cVar.f((String) parcelableEntity.getId());
            if (qF2 != null) {
                int iIntValue = qF2.f406619b.intValue();
                List<ParameterSlot> list = qF2.f406620c;
                SimpleParametersTree simpleParametersTree = new SimpleParametersTree(list);
                ObjectsParameter.Summary summary = this.f440208e;
                List<String> subtitles = summary != null ? summary.getSubtitles() : null;
                if (subtitles == null) {
                    subtitles = C42784z0.f406748b;
                }
                c42829l0 = new C42829l0(C42745f0.G(C35876q3.b(this.f440205b, subtitles, simpleParametersTree, summary != null ? summary.getEmptyValueSummary() : null, 8)), g(list), new t.b(iIntValue, 0, 2, null));
            } else {
                c42829l0 = new C42829l0("", null, new t.a((String) parcelableEntity.getId(), 0, 2, null));
            }
            arrayList.add(new com.avito.android.publish.price_list.items.selectable.d((String) parcelableEntity.getId(), (String) c42829l0.f406872c, (String) parcelableEntity.getId(), parcelableEntity.getTitle(), (String) c42829l0.f406871b, (t) c42829l0.f406873d));
        }
        return arrayList;
    }

    public final ArrayList e() {
        com.avito.android.publish.price_list.domain.c cVar = this.f440204a;
        TreeMap treeMapI = cVar.i();
        ArrayList arrayList = new ArrayList(treeMapI.size());
        for (Map.Entry entry : treeMapI.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            SimpleParametersTree simpleParametersTree = new SimpleParametersTree(list);
            ObjectsParameter.Summary summary = this.f440208e;
            List<String> secondTitles = summary != null ? summary.getSecondTitles() : null;
            if (secondTitles == null) {
                secondTitles = C42784z0.f406748b;
            }
            C35876q3 c35876q3 = this.f440205b;
            String str = (String) C42745f0.G(C35876q3.b(c35876q3, secondTitles, simpleParametersTree, null, 12));
            List<String> subtitles = summary != null ? summary.getSubtitles() : null;
            if (subtitles == null) {
                subtitles = C42784z0.f406748b;
            }
            String str2 = (String) C42745f0.G(C35876q3.b(c35876q3, subtitles, simpleParametersTree, summary != null ? summary.getEmptyValueSummary() : null, 8));
            if (str2 == null) {
                str2 = "";
            }
            t.b bVar = new t.b(iIntValue, 0, 2, null);
            String str3 = str + str2 + iIntValue;
            ParcelableEntity<String> parcelableEntityJ = cVar.j();
            String id2 = parcelableEntityJ != null ? parcelableEntityJ.getId() : null;
            arrayList.add(new com.avito.android.publish.price_list.items.selectable.d(str3, g(list), id2 == null ? "" : id2, str, str2, bVar));
        }
        return arrayList;
    }

    public final d f() throws Resources.NotFoundException {
        Set setP0;
        List<List<ParameterSlot>> listC = this.f440204a.c();
        if (listC != null) {
            List<List<ParameterSlot>> list = listC;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                List list2 = (List) obj;
                SimpleParametersTree simpleParametersTree = new SimpleParametersTree(list2);
                boolean zHasChildError = ObjectsParameterKt.hasChildError(list2);
                ObjectsParameter.Summary summary = this.f440208e;
                List<String> titles = summary != null ? summary.getTitles() : null;
                if (titles == null) {
                    titles = C42784z0.f406748b;
                }
                C35876q3 c35876q3 = this.f440205b;
                String string = (String) C42745f0.G(C35876q3.b(c35876q3, titles, simpleParametersTree, null, 12));
                List<String> secondTitles = summary != null ? summary.getSecondTitles() : null;
                if (secondTitles == null) {
                    secondTitles = C42784z0.f406748b;
                }
                String str = (String) C42745f0.G(C35876q3.b(c35876q3, secondTitles, simpleParametersTree, null, 12));
                List<String> subtitles = summary != null ? summary.getSubtitles() : null;
                if (subtitles == null) {
                    subtitles = C42784z0.f406748b;
                }
                String str2 = (String) C42745f0.G(C35876q3.b(c35876q3, subtitles, simpleParametersTree, "", 8));
                String string2 = str2 != null ? C43066x.C0(str2).toString() : null;
                String str3 = string2 != null ? string2 : "";
                boolean zB2 = this.f440207d.f439745a.f439749b.b();
                Resources resources = this.f440206c;
                if (zB2) {
                    if (str != null && !C43066x.K(str)) {
                        string = str;
                    }
                    if (str3.length() > 0) {
                        string = resources.getString(R.string.price_list_formatted_title_re23, string, str3);
                    }
                } else {
                    if (str != null && !C43066x.K(str)) {
                        string = str;
                    }
                    string = resources.getString(R.string.price_list_formatted_title, string, str3);
                }
                arrayList.add(new com.avito.android.publish.price_list.items.selected.a(i12, string, zHasChildError));
                i12 = i13;
            }
            setP0 = C42745f0.P0(arrayList);
        } else {
            setP0 = null;
        }
        if (setP0 == null) {
            setP0 = B0.f406639b;
        }
        Set set = setP0;
        if (set.isEmpty()) {
            return null;
        }
        return new d("SelectedPriceListItems", 3, false, set, 4, null);
    }
}
