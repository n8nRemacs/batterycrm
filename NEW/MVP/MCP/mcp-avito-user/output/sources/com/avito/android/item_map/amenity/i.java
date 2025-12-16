package com.avito.android.item_map.amenity;

import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.item_map.di.d;
import com.avito.android.item_map.remote.model.AmenityResponse;
import com.avito.android.item_map.view.ItemMapState;
import com.avito.android.item_map.view.Q;
import com.avito.android.item_map.view.V;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.developments_catalog.AmenityPin;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rO.InterfaceC47576a;

/* compiled from: AmenityButtonsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/amenity/i;", "Lcom/avito/android/item_map/amenity/h;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f173296a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AvitoMarkerIconFactory f173297b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ItemMapState f173298c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f173299d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public m f173300e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public V f173301f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f173302g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f173303h = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f173304i = new LinkedHashMap();

    /* compiled from: AmenityButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/item_map/remote/model/AmenityResponse;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<P2<? super AmenityResponse>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f173306m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f173306m = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(P2<? super AmenityResponse> p22) {
            List<AmenityPin> list;
            P2<? super AmenityResponse> p23 = p22;
            boolean z12 = p23 instanceof P2.b;
            String str = this.f173306m;
            i iVar = i.this;
            if (z12) {
                List<AmenityPin> listC = ((AmenityResponse) ((P2.b) p23).f318720a).c();
                i.e(iVar, str, false);
                LinkedHashMap linkedHashMap = iVar.f173302g;
                AmenityButtonState amenityButtonState = (AmenityButtonState) linkedHashMap.get(str);
                if (amenityButtonState != null) {
                    amenityButtonState.f173275e = true;
                }
                if (O2.a(listC)) {
                    List<AmenityPin> list2 = listC == null ? C42784z0.f406748b : listC;
                    AmenityButtonState amenityButtonState2 = (AmenityButtonState) linkedHashMap.get(str);
                    if (amenityButtonState2 != null && (list = amenityButtonState2.f173276f) != null) {
                        list.addAll(list2);
                    }
                    if (listC == null) {
                        listC = C42784z0.f406748b;
                    }
                    iVar.f(str, listC);
                    iVar.g(str, ButtonViewState.f173278c);
                } else {
                    iVar.g(str, ButtonViewState.f173279d);
                    V v12 = iVar.f173301f;
                    if (v12 != null) {
                        v12.m(com.avito.android.printable_text.b.c(R.string.amenity_no_information, new Serializable[0]));
                    }
                }
            } else if (p23 instanceof P2.c) {
                i.e(iVar, str, true);
            } else if (p23 instanceof P2.a) {
                i.e(iVar, str, false);
                V v13 = iVar.f173301f;
                if (v13 != null) {
                    Q.a.a(v13, R.string.connection_problem);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AmenityButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f173307l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.f(th2);
            return G0.f406611a;
        }
    }

    @Inject
    public i(@Y61.k c cVar, @Y61.k @InterfaceC47576a AvitoMarkerIconFactory avitoMarkerIconFactory, @Y61.k ItemMapState itemMapState, @d.a @Y61.l Kundle kundle, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        List<AmenityButton> list;
        this.f173296a = cVar;
        this.f173297b = avitoMarkerIconFactory;
        this.f173298c = itemMapState;
        this.f173299d = interfaceC35745a5;
        if (kundle != null) {
            f0(kundle);
            return;
        }
        ItemMapState.AmenityButtonsState amenityButtonsState = itemMapState.f173440m;
        if (amenityButtonsState == null || (list = amenityButtonsState.f173454b) == null) {
            return;
        }
        for (AmenityButton amenityButton : list) {
            this.f173302g.put(String.valueOf(amenityButton.getType()), new AmenityButtonState(amenityButton.getShow(), null, false, false, null, 30, null));
        }
    }

    public static final void e(i iVar, String str, boolean z12) {
        com.avito.android.item_map.amenity.a aVar;
        m mVar = iVar.f173300e;
        if (mVar != null && (aVar = (com.avito.android.item_map.amenity.a) mVar.f173315c.get(str)) != null) {
            aVar.b(z12);
        }
        AmenityButtonState amenityButtonState = (AmenityButtonState) iVar.f173302g.get(str);
        if (amenityButtonState == null) {
            return;
        }
        amenityButtonState.f173274d = z12;
    }

    @Override // com.avito.android.item_map.amenity.h
    public final void I() {
        this.f173303h.e();
        this.f173301f = null;
        this.f173300e = null;
    }

    @Override // com.avito.android.item_map.amenity.h
    public final void a(@Y61.l V v12) {
        this.f173301f = v12;
    }

    @Override // com.avito.android.item_map.amenity.h
    public final void b(@Y61.l m mVar) {
        this.f173300e = mVar;
        for (Map.Entry entry : this.f173302g.entrySet()) {
            String str = (String) entry.getKey();
            AmenityButtonState amenityButtonState = (AmenityButtonState) entry.getValue();
            boolean z12 = amenityButtonState.f173272b;
            List<AmenityPin> list = amenityButtonState.f173276f;
            if (z12 && !amenityButtonState.f173275e && list.isEmpty()) {
                h(str);
            } else if (amenityButtonState.f173273c == ButtonViewState.f173278c) {
                f(str, list);
            }
        }
    }

    @Override // com.avito.android.item_map.amenity.h
    @Y61.k
    public final ButtonViewState c(@Y61.k String str) {
        ButtonViewState buttonViewState;
        AmenityButtonState amenityButtonState = (AmenityButtonState) this.f173302g.get(str);
        return (amenityButtonState == null || (buttonViewState = amenityButtonState.f173273c) == null) ? ButtonViewState.f173277b : buttonViewState;
    }

    @Override // com.avito.android.item_map.amenity.h
    public final void d(@Y61.k String str) {
        V v12;
        List<AmenityPin> list;
        if (this.f173300e == null || this.f173301f == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f173302g;
        AmenityButtonState amenityButtonState = (AmenityButtonState) linkedHashMap.get(str);
        if (amenityButtonState == null || !amenityButtonState.f173274d) {
            if (c(str) == ButtonViewState.f173279d) {
                V v13 = this.f173301f;
                if (v13 != null) {
                    v13.m(com.avito.android.printable_text.b.c(R.string.amenity_no_information, new Serializable[0]));
                    return;
                }
                return;
            }
            AmenityButtonState amenityButtonState2 = (AmenityButtonState) linkedHashMap.get(str);
            if (amenityButtonState2 != null && (list = amenityButtonState2.f173276f) != null && list.isEmpty()) {
                h(str);
                return;
            }
            ButtonViewState buttonViewStateC = c(str);
            ButtonViewState buttonViewState = ButtonViewState.f173278c;
            if (buttonViewStateC != buttonViewState) {
                if (c(str) == ButtonViewState.f173277b) {
                    AmenityButtonState amenityButtonState3 = (AmenityButtonState) linkedHashMap.get(str);
                    List<AmenityPin> list2 = amenityButtonState3 != null ? amenityButtonState3.f173276f : null;
                    if (list2 == null) {
                        list2 = C42784z0.f406748b;
                    }
                    f(str, list2);
                    g(str, buttonViewState);
                    return;
                }
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f173304i;
            if (linkedHashMap2 != null && !linkedHashMap2.isEmpty() && (v12 = this.f173301f) != null) {
                List<? extends AvitoMapMarker> list3 = (List) linkedHashMap2.get(str);
                if (list3 == null) {
                    list3 = C42784z0.f406748b;
                }
                v12.k(list3);
            }
            g(str, ButtonViewState.f173277b);
        }
    }

    @Override // com.avito.android.item_map.amenity.h
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.l("buttonsState", this.f173302g);
        return kundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r25, java.util.List<com.avito.android.remote.model.developments_catalog.AmenityPin> r26) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.item_map.amenity.i.f(java.lang.String, java.util.List):void");
    }

    @Override // com.avito.android.item_map.amenity.h
    public final void f0(@Y61.l Kundle kundle) {
        LinkedHashMap linkedHashMapF;
        if (kundle == null || (linkedHashMapF = kundle.f("buttonsState")) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f173302g;
        linkedHashMap.clear();
        linkedHashMap.putAll(linkedHashMapF);
    }

    public final void g(String str, ButtonViewState buttonViewState) {
        com.avito.android.item_map.amenity.a aVar;
        AmenityButtonState amenityButtonState = (AmenityButtonState) this.f173302g.get(str);
        if (amenityButtonState != null) {
            amenityButtonState.f173273c = buttonViewState;
        }
        m mVar = this.f173300e;
        if (mVar == null || (aVar = (com.avito.android.item_map.amenity.a) mVar.f173315c.get(str)) == null) {
            return;
        }
        aVar.a(buttonViewState);
    }

    public final void h(String str) {
        String str2;
        ItemMapState itemMapState = this.f173298c;
        AvitoMapPoint avitoMapPoint = itemMapState.f173430c;
        if (avitoMapPoint == null || (str2 = itemMapState.f173429b) == null) {
            return;
        }
        this.f173303h.b(this.f173296a.a(avitoMapPoint, str2, str).j0(this.f173299d.e()).v0(new com.avito.android.api.a(17, new a(str)), new com.avito.android.api.a(18, b.f173307l), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
