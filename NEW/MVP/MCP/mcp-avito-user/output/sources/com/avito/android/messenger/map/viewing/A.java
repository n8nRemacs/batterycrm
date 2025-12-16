package com.avito.android.messenger.map.viewing;

import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapCameraUpdate;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.PointsWithOffset;
import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.messenger.map.MapBottomSheet;
import com.avito.android.messenger.map.viewing.view.d;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMapPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "Lcom/avito/android/messenger/map/viewing/y;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A extends AbstractC32892c<d.b> implements y {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final t f196767V;

    /* renamed from: W, reason: collision with root package name */
    public final int f196768W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f196769X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f196770Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f196771Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f196772a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Coordinates> f196773b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<PrintableText> f196774c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f196775d0;

    /* compiled from: PlatformMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.b> {
        public a() {
            throw null;
        }
    }

    /* compiled from: PlatformMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.b> {
        public b() {
            throw null;
        }
    }

    /* compiled from: PlatformMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.b> {
        public c() {
            throw null;
        }
    }

    /* compiled from: PlatformMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends C32890a<d.b> {
        public d() {
            throw null;
        }
    }

    /* compiled from: PlatformMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.b> {
        public e() {
            throw null;
        }
    }

    /* compiled from: PlatformMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.b> {
        public f() {
            throw null;
        }
    }

    /* compiled from: PlatformMapPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Set<com.avito.android.messenger.map.viewing.view.a> f196776d;

        public g(@Y61.k Set<com.avito.android.messenger.map.viewing.view.a> set) {
            super(null, "updatedPins = " + set, 1, null);
            this.f196776d = set;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final d.b d(d.b bVar) {
            AvitoMapCameraUpdate avitoMapCameraUpdate;
            d.b bVar2 = bVar;
            Set<com.avito.android.messenger.map.viewing.view.a> set = this.f196776d;
            if (kotlin.jvm.internal.L.f(set, bVar2.f196870a)) {
                return bVar2;
            }
            A a12 = A.this;
            MapBottomSheet.State stateMe = A.me(a12, set);
            AvitoMapCameraUpdate avitoMapCameraUpdate2 = null;
            Object obj = null;
            if (!set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((com.avito.android.messenger.map.viewing.view.a) next).f196862c) {
                        obj = next;
                        break;
                    }
                }
                com.avito.android.messenger.map.viewing.view.a aVar = (com.avito.android.messenger.map.viewing.view.a) obj;
                if (aVar != null) {
                    avitoMapCameraUpdate = new AvitoMapCameraUpdate(new AvitoMapCameraPosition(aVar.getPosition(), 18.0f, 0.0f, null, null, 28, null), null, null, 6, null);
                } else if (set.size() > 1) {
                    Set<com.avito.android.messenger.map.viewing.view.a> set2 = set;
                    ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
                    Iterator<T> it2 = set2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((com.avito.android.messenger.map.viewing.view.a) it2.next()).getPosition());
                    }
                    avitoMapCameraUpdate = new AvitoMapCameraUpdate(null, null, new PointsWithOffset(arrayList, a12.f196768W), 3, null);
                } else {
                    avitoMapCameraUpdate2 = new AvitoMapCameraUpdate(new AvitoMapCameraPosition(((com.avito.android.messenger.map.viewing.view.a) C42745f0.D(set)).getPosition(), 18.0f, 0.0f, null, null, 28, null), null, null, 6, null);
                }
                avitoMapCameraUpdate2 = avitoMapCameraUpdate;
            }
            return avitoMapCameraUpdate2 != null ? d.b.a(bVar2, this.f196776d, stateMe, avitoMapCameraUpdate2, null, false, false, false, false, 248) : d.b.a(bVar2, this.f196776d, stateMe, null, null, false, false, false, false, 252);
        }
    }

    /* compiled from: PlatformMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.b> {
        public h() {
            throw null;
        }
    }

    /* compiled from: PlatformMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/A$i;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class i extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.b> {
        public i() {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(@Y61.k t tVar, int i12, @Y61.k com.avito.android.util.text.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.F f12) {
        super("PlatformMapPresenter", d.b.f196869j, interfaceC35745a5, null, f12, null, null, null, 232, null);
        d.b.f196868i.getClass();
        this.f196767V = tVar;
        this.f196768W = i12;
        this.f196769X = aVar;
        this.f196770Y = interfaceC35741a1;
        this.f196771Z = aVar2;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f196772a0 = cVar;
        this.f196773b0 = new com.avito.android.util.architecture_components.D<>();
        this.f196774c0 = new com.avito.android.util.architecture_components.D<>();
        new com.avito.android.util.architecture_components.D();
        this.f196775d0 = new com.avito.android.util.architecture_components.D<>();
        O oI2 = tVar.a().j0(this.f207133K.a()).d0(new I(this)).I(new J(this));
        H0 h02 = H0.f403644b;
        Objects.requireNonNull(h02, "fallback is null");
        cVar.b(oI2.l0(io.reactivex.rxjava3.internal.functions.a.g(h02)).t0(new K(this)));
    }

    public static final MapBottomSheet.State me(A a12, Set set) {
        Object next;
        a12.getClass();
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.avito.android.messenger.map.viewing.view.a) next).f196862c) {
                break;
            }
        }
        com.avito.android.messenger.map.viewing.view.a aVar = (com.avito.android.messenger.map.viewing.view.a) next;
        if (aVar != null) {
            return new MapBottomSheet.State.b(aVar.getTitle(), aVar.f196861b, set.size() > 1, MapBottomSheet.State.ActionButtonState.f196431b, false, false, 48, null);
        }
        return MapBottomSheet.State.a.f196436a;
    }

    @Override // com.avito.android.messenger.map.viewing.y
    public final void A8() {
        le().s(new b(null, null, B.f196778l, 3, null));
    }

    @Override // com.avito.android.messenger.map.viewing.y
    /* renamed from: D6, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF196773b0() {
        return this.f196773b0;
    }

    @Override // com.avito.android.messenger.map.viewing.y
    public final void M4(@Y61.k BottomSheet.d dVar) {
        le().s(new a(null, String.valueOf(dVar), new z(dVar, this), 1, null));
    }

    @Override // com.avito.android.messenger.map.viewing.y
    /* renamed from: c1, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF196775d0() {
        return this.f196775d0;
    }

    @Override // com.avito.android.messenger.map.viewing.y
    /* renamed from: f6, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF196774c0() {
        return this.f196774c0;
    }

    @Override // com.avito.android.messenger.map.viewing.y
    public final void l3(@Y61.k com.avito.android.messenger.map.viewing.view.a aVar) {
        le().s(new f(null, "clickedPin = " + aVar, new F(aVar, this), 1, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.avito.android.messenger.map.viewing.view.a ne(GeoMarker geoMarker, boolean z12) {
        C42784z0 c42784z0;
        AvitoMapPoint avitoMapPoint = new AvitoMapPoint(geoMarker.getLatitude(), geoMarker.getLongitude(), null, 4, null);
        String title = geoMarker.getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        List<AttributedText> description = geoMarker.getDescription();
        if (description != null) {
            ArrayList arrayList = new ArrayList();
            for (AttributedText attributedText : description) {
                attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 23));
                CharSequence charSequenceB = this.f196769X.b(attributedText);
                if (charSequenceB != null) {
                    arrayList.add(charSequenceB);
                }
            }
            c42784z0 = arrayList;
        } else {
            c42784z0 = C42784z0.f406748b;
        }
        return new com.avito.android.messenger.map.viewing.view.a(null, avitoMapPoint, str, c42784z0, z12, 1, null);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f196772a0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.map.viewing.y
    public final void p5() {
        le().s(new d(null, null, new D(this), 3, null));
    }

    @Override // com.avito.android.messenger.map.viewing.y
    public final void u(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition, boolean z12) {
        le().s(new c(null, "causedByNewUserLocation = " + z12 + ", newCameraPosition = " + avitoMapCameraPosition, new C(avitoMapCameraPosition, z12), 1, null));
    }

    @Override // com.avito.android.messenger.map.viewing.y
    public final void x(boolean z12) {
        le().s(new e(null, com.avito.android.bxcontent.mvi.entity.f.l("isApproximated = ", z12), new E(this, z12), 1, null));
    }

    @Override // com.avito.android.messenger.map.viewing.y
    public final void y(@Y61.k AvitoMapPoint avitoMapPoint) {
        le().s(new i(null, "point = " + avitoMapPoint, new H(this, avitoMapPoint), 1, null));
    }
}
