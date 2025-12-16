package com.avito.android.advert.item.compatibility.v3;

import U4.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.spare_parts.data.CarCompatibility;
import com.avito.android.advert.item.spare_parts.data.OtherCompatibility;
import com.avito.android.advert.item.spare_parts.data.SparePartsCompatibilityV3Holder;
import com.avito.android.advert.item.spare_parts.data.SparePartsSpecification;
import com.avito.android.remote.model.SparePartsFilters;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.models.SparePartsGroup;
import com.avito.android.spare_parts.bottom_sheet.SparePartsBottomSheetParams;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: GarageCompatibilityV3Presenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/l;", "Lcom/avito/android/advert/item/compatibility/v3/k;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.spare_parts.a f74466b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f74467c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.compatibility.v3.b f74468d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e f74469e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public C43238h f74470f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Z0 f74471g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public SparePartsCompatibilityV3Holder f74472h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f74473i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public String f74474j;

    /* compiled from: GarageCompatibilityV3Presenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/l$a;", "", "<init>", "()V", "", "BRAND_CLICKS_DEBOUNCE_MS", "J", "", "KEY_SAVED_STATE_ADVERT_ID", "Ljava/lang/String;", "KEY_SAVED_STATE_ERROR", "KEY_SAVED_STATE_RESPONSE", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GarageCompatibilityV3Presenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements Y41.p<com.avito.android.advert.item.compatibility.v3.a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(com.avito.android.advert.item.compatibility.v3.a aVar, Continuation<? super G0> continuation) {
            com.avito.android.advert.item.compatibility.v3.a aVar2 = aVar;
            l lVar = (l) this.receiver;
            String str = lVar.f74474j;
            if (str != null) {
                SparePartsBottomSheetParams sparePartsBottomSheetParams = new SparePartsBottomSheetParams(str, l.k(aVar2.f74403a));
                boolean z12 = aVar2.f74404b;
                e eVar = lVar.f74469e;
                if (z12) {
                    eVar.b();
                } else {
                    eVar.c(aVar2.f74403a.f80444c);
                }
                Z0 z02 = lVar.f74471g;
                if (z02 != null) {
                    z02.f72298c.startActivity(z02.f72313r.a(sparePartsBottomSheetParams));
                }
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public l(@Y61.k com.avito.android.advert.item.spare_parts.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.advert.item.compatibility.v3.b bVar, @Y61.k e eVar, @Y61.l @a.d Kundle kundle) {
        Boolean boolA;
        this.f74466b = aVar;
        this.f74467c = r02;
        this.f74468d = bVar;
        this.f74469e = eVar;
        this.f74472h = kundle != null ? (SparePartsCompatibilityV3Holder) kundle.d("saved_state_garage_compat_response_v3") : null;
        this.f74473i = (kundle == null || (boolA = kundle.a("saved_state_garage_compat_error_v3")) == null) ? false : boolA.booleanValue();
        this.f74474j = kundle != null ? kundle.g("saved_state_garage_compat_advert_id_v3") : null;
    }

    public static SparePartsGroup k(com.avito.android.advert.item.spare_parts.data.SparePartsGroup sparePartsGroup) {
        ArrayList arrayList;
        UniversalImage universalImage = sparePartsGroup.f80443b;
        Boolean boolValueOf = Boolean.valueOf(sparePartsGroup.f80447f);
        ArrayList arrayList2 = null;
        List<com.avito.android.advert.item.spare_parts.data.SparePartsGroup> list = sparePartsGroup.f80448g;
        if (list != null) {
            List<com.avito.android.advert.item.spare_parts.data.SparePartsGroup> list2 = list;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(k((com.avito.android.advert.item.spare_parts.data.SparePartsGroup) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<SparePartsSpecification> list3 = sparePartsGroup.f80449h;
        if (list3 != null) {
            List<SparePartsSpecification> list4 = list3;
            arrayList2 = new ArrayList(C42745f0.q(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new com.avito.android.remote.models.SparePartsSpecification(((SparePartsSpecification) it2.next()).f80450b));
            }
        }
        return new SparePartsGroup(universalImage, sparePartsGroup.f80444c, sparePartsGroup.f80445d, sparePartsGroup.f80446e, boolValueOf, arrayList, arrayList2);
    }

    public final void O(q qVar, SparePartsCompatibilityV3Holder sparePartsCompatibilityV3Holder, SparePartsFilters sparePartsFilters) {
        CarCompatibility.Car car;
        List<? extends com.avito.conveyor_item.a> listH0;
        List listE0;
        CarCompatibility.Button button;
        CarCompatibility.Button button2;
        CarCompatibility.Car car2;
        if (sparePartsCompatibilityV3Holder != null) {
            CarCompatibility carCompatibility = sparePartsCompatibilityV3Holder.f80438b;
            OtherCompatibility otherCompatibility = sparePartsCompatibilityV3Holder.f80439c;
            if (carCompatibility != null || otherCompatibility != null) {
                int i12 = 0;
                this.f74469e.a(carCompatibility != null ? carCompatibility.f80406b : null, carCompatibility != null ? carCompatibility.f80407c : null, (carCompatibility == null || (car2 = carCompatibility.f80408d) == null) ? null : car2.f80413b, (carCompatibility == null || (button2 = carCompatibility.f80409e) == null) ? null : button2.f80411b, (carCompatibility == null || (button = carCompatibility.f80410f) == null) ? null : button.f80411b, sparePartsFilters.getCarBrand(), sparePartsFilters.getCarModel(), sparePartsFilters.getCarGeneration(), sparePartsFilters.getCarModification(), otherCompatibility != null);
                qVar.show();
                ArrayList arrayList = otherCompatibility != null ? otherCompatibility.f80434d : null;
                String str = otherCompatibility != null ? otherCompatibility.f80432b : null;
                if (str == null) {
                    str = "";
                }
                com.avito.android.advert.item.spare_parts.data.SparePartsGroup sparePartsGroup = new com.avito.android.advert.item.spare_parts.data.SparePartsGroup(null, str, null, null, false, arrayList, null, 77, null);
                qVar.p00(carCompatibility != null ? carCompatibility.f80406b : null);
                qVar.Te(carCompatibility != null ? carCompatibility.f80407c : null);
                qVar.mL(carCompatibility != null ? carCompatibility.f80409e : null);
                qVar.Sx(carCompatibility != null ? carCompatibility.f80410f : null);
                qVar.VU(otherCompatibility != null ? otherCompatibility.f80432b : null, otherCompatibility != null ? otherCompatibility.f80433c : false, sparePartsGroup);
                qVar.kA(otherCompatibility != null ? otherCompatibility.f80437g : null);
                ArrayList arrayList2 = otherCompatibility != null ? otherCompatibility.f80434d : null;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    car = null;
                    listH0 = C42784z0.f406748b;
                } else {
                    Integer num = otherCompatibility.f80435e;
                    if (num == null || (listE0 = C42745f0.E0(arrayList2, num.intValue())) == null) {
                        listE0 = arrayList2;
                    }
                    Object cVar = listE0.isEmpty() ? new com.avito.android.advert.item.compatibility.v3.item.show_all_brands_long.c(null, sparePartsGroup, otherCompatibility.f80436f, 1, null) : listE0.size() < arrayList2.size() ? new com.avito.android.advert.item.compatibility.v3.item.show_all_brands.c(null, sparePartsGroup, otherCompatibility.f80436f, 1, null) : null;
                    List list = listE0;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
                    for (Object obj : list) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        com.avito.android.advert.item.spare_parts.data.SparePartsGroup sparePartsGroup2 = (com.avito.android.advert.item.spare_parts.data.SparePartsGroup) obj;
                        arrayList3.add((i12 == 0 && arrayList2.size() == 1) ? new com.avito.android.advert.item.compatibility.v3.item.brand_compatibility_long.c(null, sparePartsGroup2, 1, null) : new com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.c(null, sparePartsGroup2, 1, null));
                        i12 = i13;
                    }
                    car = null;
                    listH0 = C42745f0.h0(C42745f0.V(cVar), arrayList3);
                }
                if (listH0.isEmpty()) {
                    qVar.Bf();
                } else {
                    qVar.qC(listH0);
                }
                CarCompatibility.Car car3 = carCompatibility != null ? carCompatibility.f80408d : car;
                if (car3 == null) {
                    qVar.yx();
                    return;
                } else {
                    qVar.uh(car3);
                    return;
                }
            }
        }
        qVar.hide();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        q qVar = (q) eVar;
        GarageCompatibilityV3Item garageCompatibilityV3Item = (GarageCompatibilityV3Item) aVar;
        String str = garageCompatibilityV3Item.f74399f;
        this.f74474j = str;
        if (this.f74473i) {
            qVar.hide();
            return;
        }
        C43238h c43238h = this.f74470f;
        if (c43238h == null) {
            return;
        }
        SparePartsCompatibilityV3Holder sparePartsCompatibilityV3Holder = this.f74472h;
        SparePartsFilters sparePartsFilters = garageCompatibilityV3Item.f74397d;
        if (sparePartsCompatibilityV3Holder != null) {
            O(qVar, sparePartsCompatibilityV3Holder, sparePartsFilters);
        } else {
            C43175k.K(new C43197r1(new m(qVar, this, garageCompatibilityV3Item, null), this.f74466b.c(sparePartsFilters, garageCompatibilityV3Item.f74398e, str)), c43238h);
        }
    }

    @Override // com.avito.android.advert.item.compatibility.v3.k
    public final void c0() {
        this.f74471g = null;
    }

    @Override // com.avito.android.advert.item.compatibility.v3.k
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f74472h, "saved_state_garage_compat_response_v3");
        kundle.h(Boolean.valueOf(this.f74473i), "saved_state_garage_compat_error_v3");
        kundle.m("saved_state_garage_compat_advert_id_v3", this.f74474j);
        return kundle;
    }

    @Override // com.avito.android.advert.item.compatibility.v3.k
    public final void f0() {
        C43238h c43238h = this.f74470f;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f74470f = null;
    }

    @Override // com.avito.android.advert.item.compatibility.v3.k
    public final void m0() {
        this.f74466b.m0();
        this.f74472h = null;
        this.f74473i = false;
    }

    @Override // com.avito.android.advert.item.compatibility.v3.k
    public final void q() {
        C43238h c43238hA = U.a(this.f74467c.b());
        C43238h c43238h = this.f74470f;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f74470f = c43238hA;
        C43175k.K(new C43197r1(new b(2, this, l.class, "onBrandListClicked", "onBrandListClicked(Lcom/avito/android/advert/item/compatibility/v3/ClickEvent;)V", 4), C43175k.R(this.f74468d.g(), 700L)), c43238hA);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.k
    public final void y5(@Y61.l Z0 z02) {
        this.f74471g = z02;
    }
}
