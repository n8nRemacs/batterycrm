package com.avito.android.publish.objects;

import android.os.Bundle;
import com.avito.android.Q1;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.objects.di.InterfaceC33938v;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.u1;
import com.avito.android.validation.d1;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import yc.C50213a;

/* compiled from: ObjectFillFormInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/q;", "Lcom/avito/android/publish/objects/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.objects.q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33967q implements InterfaceC33955k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u1 f238061b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C50213a f238062c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PublishParametersInteractor f238063d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final d1 f238064e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Q1 f238065f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h31.e<CategoryParameters> f238066g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h31.e<ObjectsParameter> f238067h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f238068i = new CategoryParametersConverter(null, null, null, 7, null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayList f238069j;

    /* renamed from: k, reason: collision with root package name */
    public final int f238070k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SimpleParametersTree f238071l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f238072m;

    @Inject
    public C33967q(@Y61.k u1 u1Var, @Y61.k C50213a c50213a, @Y61.k PublishParametersInteractor publishParametersInteractor, @Y61.k d1 d1Var, @Y61.k Q1 q12, @Y61.k @InterfaceC33938v.b h31.e<CategoryParameters> eVar, @com.avito.android.publish.objects.di.Y @Y61.k h31.e<ObjectsParameter> eVar2, @com.avito.android.publish.objects.di.a0 @Y61.l Integer num, @Y61.l Bundle bundle) {
        int iIntValue;
        ArrayList parcelableArrayList;
        this.f238061b = u1Var;
        this.f238062c = c50213a;
        this.f238063d = publishParametersInteractor;
        this.f238064e = d1Var;
        this.f238065f = q12;
        this.f238066g = eVar;
        this.f238067h = eVar2;
        ArrayList arrayList = (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)) == null) ? new ArrayList(c(num)) : new ArrayList(parcelableArrayList);
        this.f238069j = arrayList;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Integer numValueOf = (bundle == null || !bundle.containsKey("index")) ? null : Integer.valueOf(bundle.getInt("index"));
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                List<? extends List<? extends ParameterSlot>> value = a().getValue();
                Integer numValueOf2 = value != null ? Integer.valueOf(value.size()) : null;
                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
            }
        }
        this.f238070k = iIntValue;
        this.f238071l = new SimpleParametersTree(arrayList);
        this.f238072m = num == null;
    }

    @Override // com.avito.android.details.a
    @Y61.k
    public final CategoryParameters C0() {
        return this.f238066g.get();
    }

    @Override // com.avito.android.publish.objects.InterfaceC33955k
    @Y61.k
    public final Bundle P() {
        Bundle bundle = new Bundle();
        com.avito.android.util.G.e(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, bundle, this.f238069j);
        bundle.putInt("index", this.f238070k);
        return bundle;
    }

    @Override // com.avito.android.publish.objects.InterfaceC33955k
    /* renamed from: T0, reason: from getter */
    public final boolean getF238072m() {
        return this.f238072m;
    }

    public final ObjectsParameter a() {
        return this.f238067h.get();
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

    public final void d(int i12) {
        List<? extends List<? extends ParameterSlot>> value = a().getValue();
        ArrayList arrayList = this.f238069j;
        ArrayList arrayList2 = value != null ? new ArrayList(value) : C42745f0.e0(C42745f0.M0(arrayList));
        if (arrayList2.size() > i12) {
            arrayList2.remove(i12);
        }
        arrayList2.add(i12, arrayList);
        a().setValue(arrayList2);
    }

    @Override // com.avito.android.publish.objects.InterfaceC33955k
    public final void i8() {
        List<? extends List<? extends ParameterSlot>> value;
        if (this.f238072m || (value = a().getValue()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(value);
        arrayList.remove(this.f238070k);
        a().setValue(arrayList);
    }

    @Override // com.avito.android.publish.objects.InterfaceC33955k
    @Y61.k
    public final C42022u k1() {
        return new io.reactivex.rxjava3.internal.operators.single.G(new VH0.c(this, 26)).n(new C33963o(this)).k(new C33965p(this));
    }

    @Override // com.avito.android.publish.objects.InterfaceC33955k
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.O mc() {
        d(this.f238070k);
        List<ParameterSlot> parameters = C0().getParameters();
        ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
        for (ParameterSlot parameterSlotA : parameters) {
            if ((parameterSlotA instanceof ObjectsParameter) && kotlin.jvm.internal.L.f(parameterSlotA.getId(), a().getId())) {
                parameterSlotA = a();
            }
            arrayList.add(parameterSlotA);
        }
        CategoryParameters categoryParametersCopy$default = CategoryParameters.copy$default(C0(), null, null, arrayList, null, null, null, null, false, null, 507, null);
        return this.f238063d.c(C0().getNavigation(), categoryParametersCopy$default, null).K(new C33957l(this));
    }

    @Override // com.avito.android.details.e
    public final ParametersTree wa() {
        return this.f238071l;
    }
}
