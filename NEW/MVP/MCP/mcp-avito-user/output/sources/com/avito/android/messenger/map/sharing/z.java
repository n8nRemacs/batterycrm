package com.avito.android.messenger.map.sharing;

import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.messenger.map.sharing.K;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggest;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SharingMapPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z;", "Lcom/avito/android/messenger/map/sharing/w;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/map/sharing/K$d;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z extends AbstractC32892c<K.d> implements w {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final s f196756V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final String f196757W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final String f196758X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final String f196759Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final MessageBody.Location f196760Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f196761a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<MessageBody.Location> f196762b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f196763c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f196764d0;

    /* compiled from: SharingMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<K.d> {
        public a() {
            throw null;
        }
    }

    /* compiled from: SharingMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<K.d> {
        public b() {
            throw null;
        }
    }

    /* compiled from: SharingMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends C32890a<K.d> {
        public c() {
            throw null;
        }
    }

    /* compiled from: SharingMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<K.d> {
        public d() {
            throw null;
        }
    }

    /* compiled from: SharingMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends C32890a<K.d> {
        public e() {
            throw null;
        }
    }

    /* compiled from: SharingMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.o<K.d> {
        public f() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final K.d d(K.d dVar) {
            z zVar = z.this;
            MessageBody.Location location = zVar.f196760Z;
            K.d.c.C5786c c5786c = new K.d.c.C5786c(location, (location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) ? new K.a(location.getLatitude(), location.getLongitude(), 1.0f) : new K.a(location.getLatitude(), location.getLongitude(), 18.0f), null, false, location.getTitle(), false, false);
            K.a aVar = c5786c.f196664g;
            zVar.u(new AvitoMapCameraPosition(new AvitoMapPoint(aVar.f196650a, aVar.f196651b, null, 4, null), aVar.f196652c, 0.0f, null, null, 28, null), false);
            return c5786c;
        }
    }

    /* compiled from: SharingMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends com.avito.android.mvi.rx3.with_monolithic_state.o<K.d> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final GeoSearchSuggest f196766d;

        public g(@Y61.k GeoSearchSuggest geoSearchSuggest) {
            super(null, null, 3, null);
            this.f196766d = geoSearchSuggest;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final K.d d(K.d dVar) {
            K.d dVar2 = dVar;
            GeoSearchSuggest geoSearchSuggest = this.f196766d;
            return new K.d.c.b(new MessageBody.Location(geoSearchSuggest.getLatitude(), geoSearchSuggest.getLongitude(), geoSearchSuggest.getTitle(), geoSearchSuggest.getKind(), null, 16, null), new K.a(geoSearchSuggest.getLatitude(), geoSearchSuggest.getLongitude(), 18.0f), dVar2.f196656a, dVar2.f196657b, geoSearchSuggest.getTitle(), false, true);
        }
    }

    /* compiled from: SharingMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends C32890a<K.d> {
        public h() {
            throw null;
        }
    }

    /* compiled from: SharingMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/z$i;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class i extends com.avito.android.mvi.rx3.with_monolithic_state.o<K.d> {
        public i() {
            throw null;
        }
    }

    public z() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public z(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k s sVar, @Y61.k @Named("addressNotFoundTitle") String str, @Y61.k @Named("addressNotFoundErrorMessage") String str2, @Y61.k @Named("retryLabel") String str3, @Y61.k MessageBody.Location location) {
        super("SharingMapPresenter", K.d.b.f196662f, interfaceC35745a5, null, new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0), null, null, null, 232, null);
        this.f196756V = sVar;
        this.f196757W = str;
        this.f196758X = str2;
        this.f196759Y = str3;
        this.f196760Z = location;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f196761a0 = cVar;
        this.f196762b0 = new com.avito.android.util.architecture_components.D<>();
        this.f196763c0 = new com.avito.android.util.architecture_components.D<>();
        this.f196764d0 = new com.avito.android.util.architecture_components.D<>();
        le().s(new f());
        cVar.b(sVar.b().t0(new x(this)));
    }

    public static final K.d me(z zVar, K.d dVar) {
        zVar.getClass();
        if (!(dVar instanceof K.d.c)) {
            return dVar;
        }
        K.d.c cVar = (K.d.c) dVar;
        return cVar.f196665h ? cVar.c() : dVar;
    }

    @Override // com.avito.android.messenger.map.sharing.w
    /* renamed from: Gd, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF196763c0() {
        return this.f196763c0;
    }

    @Override // com.avito.android.messenger.map.sharing.w
    public final void Ja(boolean z12) {
        le().s(new a(null, com.avito.android.bxcontent.mvi.entity.f.l("causedByNewUserLocation = ", z12), new y(z12, this), 1, null));
    }

    @Override // com.avito.android.messenger.map.sharing.w
    /* renamed from: Oc, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF196762b0() {
        return this.f196762b0;
    }

    @Override // com.avito.android.messenger.map.sharing.w
    public final void S8() {
        le().s(new h(null, null, new G(this), 3, null));
    }

    @Override // com.avito.android.messenger.map.sharing.w
    /* renamed from: c1, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF196764d0() {
        return this.f196764d0;
    }

    @Override // com.avito.android.messenger.map.sharing.w
    public final void l5(@Y61.k GeoSearchSuggest geoSearchSuggest) {
        le().s(new g(geoSearchSuggest));
    }

    @Override // com.avito.android.messenger.map.sharing.w
    public final void l6() {
        le().s(new c(null, null, new D(this), 3, null));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f196761a0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.map.sharing.w
    public final void u(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition, boolean z12) {
        le().s(new b(null, "causedByNewUserLocation = " + z12 + ", newCameraPosition = " + avitoMapCameraPosition, new C(z12, this, avitoMapCameraPosition), 1, null));
    }

    @Override // com.avito.android.messenger.map.sharing.w
    public final void x(boolean z12) {
        le().s(new d(null, null, new E(z12, this), 3, null));
    }

    @Override // com.avito.android.messenger.map.sharing.w
    public final void y(@Y61.k AvitoMapPoint avitoMapPoint) {
        le().s(new i(null, "newPoint = " + avitoMapPoint, new H(this, avitoMapPoint), 1, null));
    }
}
