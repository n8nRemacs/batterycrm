package com.avito.android.publish.screen.objects.domain.repository;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.objects.di.InterfaceC33938v;
import com.avito.android.publish.objects.di.Y;
import com.avito.android.publish.objects.di.a0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.G;
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

/* compiled from: ObjectCategoryRepository.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/repository/b;", "Lcom/avito/android/publish/screen/objects/domain/repository/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<CategoryParameters> f240006b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<ObjectsParameter> f240007c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f240008d;

    /* renamed from: e, reason: collision with root package name */
    public int f240009e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public ArrayList f240010f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public SimpleParametersTree f240011g = new SimpleParametersTree(null);

    /* renamed from: h, reason: collision with root package name */
    public final boolean f240012h;

    @Inject
    public b(@Y61.k @InterfaceC33938v.b h31.e<CategoryParameters> eVar, @Y @Y61.k h31.e<ObjectsParameter> eVar2, @a0 @Y61.l Integer num) {
        this.f240006b = eVar;
        this.f240007c = eVar2;
        this.f240008d = num;
        this.f240012h = num == null;
        b(null);
    }

    @Override // com.avito.android.details.a
    @Y61.k
    public final CategoryParameters C0() {
        return this.f240006b.get();
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    @Y61.l
    public final G0 C1() {
        if (this.f240012h) {
            return G0.f406611a;
        }
        List<? extends List<? extends ParameterSlot>> value = a().getValue();
        if (value == null) {
            return G0.f406611a;
        }
        ArrayList arrayList = new ArrayList(value);
        arrayList.remove(this.f240009e);
        a().setValue(arrayList);
        return G0.f406611a;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    public final void C7() {
        List<? extends List<? extends ParameterSlot>> value = a().getValue();
        ArrayList arrayList = value != null ? new ArrayList(value) : C42745f0.e0(C42745f0.M0(this.f240010f));
        int size = arrayList.size();
        int i12 = this.f240009e;
        if (size > i12) {
            arrayList.remove(i12);
        }
        arrayList.add(this.f240009e, this.f240010f);
        a().setValue(arrayList);
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    @Y61.k
    public final ObjectsParameter Dc() {
        return a();
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    /* renamed from: Kb, reason: from getter */
    public final int getF240009e() {
        return this.f240009e;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    public final void L6(@Y61.k CategoryParameters categoryParameters) {
        Object next;
        ParameterSlot parameterSlotFindParameter = categoryParameters.findParameter(a().getId());
        ArrayList arrayList = null;
        ObjectsParameter objectsParameter = parameterSlotFindParameter instanceof ObjectsParameter ? (ObjectsParameter) parameterSlotFindParameter : null;
        List<? extends List<? extends ParameterSlot>> value = a().getValue();
        if (value != null) {
            List<? extends List<? extends ParameterSlot>> list = value;
            List<? extends List<? extends ParameterSlot>> value2 = objectsParameter != null ? objectsParameter.getValue() : null;
            if (value2 == null) {
                value2 = C42784z0.f406748b;
            }
            List<? extends List<? extends ParameterSlot>> list2 = value2;
            Iterator<T> it = list.iterator();
            Iterator it2 = list2.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(C42745f0.q(list, 10), C42745f0.q(list2, 10)));
            while (it.hasNext() && it2.hasNext()) {
                List list3 = (List) it.next();
                List<ParameterSlot> list4 = (List) it2.next();
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
                for (ParameterSlot parameterSlot : list4) {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (L.f(parameterSlot.getId(), ((ParameterSlot) next).getId())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ParameterSlot parameterSlot2 = (ParameterSlot) next;
                    if ((parameterSlot instanceof HasError) && parameterSlot2 != null && (parameterSlot2 instanceof HasError)) {
                        ((HasError) parameterSlot).setError(((HasError) parameterSlot2).getError());
                    }
                    arrayList3.add(parameterSlot);
                }
                arrayList2.add(arrayList3);
            }
            arrayList = arrayList2;
        }
        a().setValue(arrayList);
        this.f240010f.clear();
        this.f240010f.addAll(c(Integer.valueOf(this.f240009e)));
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    @Y61.k
    public final Bundle P() {
        Bundle bundle = new Bundle();
        G.e(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, bundle, this.f240010f);
        bundle.putInt("index", this.f240009e);
        return bundle;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    /* renamed from: T0, reason: from getter */
    public final boolean getF240012h() {
        return this.f240012h;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    @Y61.l
    public final G0 Tc(@Y61.k PretendResult pretendResult) {
        this.f240011g.applyPretendResult(pretendResult.getErrors());
        return G0.f406611a;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    @Y61.l
    public final String Z5() {
        List list;
        List<? extends List<? extends ParameterSlot>> value = a().getValue();
        ParameterSlot parameterSlot = (value == null || (list = (List) C42745f0.G(value)) == null) ? null : (ParameterSlot) C42745f0.G(list);
        SelectParameter.Flat flat = parameterSlot instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlot : null;
        if (flat != null) {
            return flat.getDisplayTitle();
        }
        return null;
    }

    public final ObjectsParameter a() {
        return this.f240007c.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[PHI: r0
  0x0021: PHI (r0v5 java.lang.Integer) = (r0v0 java.lang.Integer), (r0v2 java.lang.Integer) binds: [B:9:0x001f, B:22:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.l android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.f240008d
            if (r4 == 0) goto L12
            java.lang.String r1 = "parameters"
            java.util.ArrayList r1 = r4.getParcelableArrayList(r1)
            if (r1 == 0) goto L12
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L1d
        L12:
            java.util.List r1 = r3.c(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L1d:
            r3.f240010f = r2
            if (r0 == 0) goto L26
        L21:
            int r4 = r0.intValue()
            goto L5a
        L26:
            r0 = 0
            if (r4 == 0) goto L3a
            java.lang.String r1 = "index"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L3a
            int r4 = r4.getInt(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L3b
        L3a:
            r4 = r0
        L3b:
            if (r4 == 0) goto L42
            int r4 = r4.intValue()
            goto L5a
        L42:
            com.avito.android.remote.model.category_parameters.ObjectsParameter r4 = r3.a()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L56
            int r4 = r4.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L56:
            if (r0 == 0) goto L59
            goto L21
        L59:
            r4 = 0
        L5a:
            r3.f240009e = r4
            com.avito.android.remote.model.category_parameters.SimpleParametersTree r4 = new com.avito.android.remote.model.category_parameters.SimpleParametersTree
            java.util.ArrayList r0 = r3.f240010f
            r4.<init>(r0)
            r3.f240011g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.objects.domain.repository.b.b(android.os.Bundle):void");
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    @Y61.l
    public final String b8() {
        Map map;
        Collection collectionValues;
        List<Map<String, String>> attributes = C0().getNavigation().getAttributes();
        if (attributes == null || (map = (Map) C42745f0.G(attributes)) == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return (String) C42745f0.F(collectionValues);
    }

    public final List<ParameterSlot> c(Integer num) {
        if (num == null) {
            List<ParameterSlot> params = a().getParams();
            return params == null ? C42784z0.f406748b : params;
        }
        List<? extends List<? extends ParameterSlot>> value = a().getValue();
        List<ParameterSlot> list = value != null ? (List) C42745f0.K(num.intValue(), value) : null;
        return list == null ? C42784z0.f406748b : list;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.a
    @Y61.l
    public final String dc() {
        List<Map<String, String>> attributes = C0().getNavigation().getAttributes();
        if (attributes != null && attributes.size() > 1) {
            return (String) C42745f0.F(attributes.get(1).values());
        }
        return null;
    }

    @Override // com.avito.android.details.e
    @Y61.k
    public final ParametersTree wa() {
        return this.f240011g;
    }
}
