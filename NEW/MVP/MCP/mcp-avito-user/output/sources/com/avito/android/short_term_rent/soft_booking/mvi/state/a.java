package com.avito.android.short_term_rent.soft_booking.mvi.state;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.LoaderInfoResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import pw0.C47157a;
import pw0.C47159c;
import pw0.g;
import pw0.h;
import pw0.i;
import pw0.j;
import pw0.m;
import qw0.InterfaceC47457c;
import shark.AndroidResourceIdNames;

/* compiled from: StrSoftBookingState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/state/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a extends q {

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final C8449a f282791s = new C8449a(null);

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final a f282792t = new a(new pw0.f(true, false), null, new C47157a(null, null, null, null, null, null, true, null), new C47159c(null, null, null, null), new j(null), new g(null, null), new i(null, null), InterfaceC47457c.C12346c.f429532a, null, null, null, null, null, null, null, null, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final pw0.f f282793b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final pw0.l f282794c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C47157a f282795d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C47159c f282796e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final j f282797f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final g f282798g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final i f282799h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC47457c f282800i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f282801j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Boolean f282802k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f282803l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final h f282804m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final pw0.k f282805n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final m f282806o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final Long f282807p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final LoaderInfoResponse f282808q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f282809r;

    /* compiled from: StrSoftBookingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/state/a$a;", "", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.state.a$a, reason: collision with other inner class name */
    public static final class C8449a {
        public /* synthetic */ C8449a(C42822w c42822w) {
            this();
        }

        public C8449a() {
        }
    }

    public a(@k pw0.f fVar, @l pw0.l lVar, @k C47157a c47157a, @k C47159c c47159c, @k j jVar, @k g gVar, @k i iVar, @k InterfaceC47457c interfaceC47457c, @l String str, @l Boolean bool, @l String str2, @l h hVar, @l pw0.k kVar, @l m mVar, @l Long l12, @l LoaderInfoResponse loaderInfoResponse, boolean z12) {
        this.f282793b = fVar;
        this.f282794c = lVar;
        this.f282795d = c47157a;
        this.f282796e = c47159c;
        this.f282797f = jVar;
        this.f282798g = gVar;
        this.f282799h = iVar;
        this.f282800i = interfaceC47457c;
        this.f282801j = str;
        this.f282802k = bool;
        this.f282803l = str2;
        this.f282804m = hVar;
        this.f282805n = kVar;
        this.f282806o = mVar;
        this.f282807p = l12;
        this.f282808q = loaderInfoResponse;
        this.f282809r = z12;
    }

    public static a a(a aVar, pw0.f fVar, pw0.l lVar, C47157a c47157a, C47159c c47159c, j jVar, g gVar, i iVar, InterfaceC47457c interfaceC47457c, String str, Boolean bool, String str2, h hVar, pw0.k kVar, m mVar, Long l12, LoaderInfoResponse loaderInfoResponse, int i12) {
        pw0.f fVar2 = (i12 & 1) != 0 ? aVar.f282793b : fVar;
        pw0.l lVar2 = (i12 & 2) != 0 ? aVar.f282794c : lVar;
        C47157a c47157a2 = (i12 & 4) != 0 ? aVar.f282795d : c47157a;
        C47159c c47159c2 = (i12 & 8) != 0 ? aVar.f282796e : c47159c;
        j jVar2 = (i12 & 16) != 0 ? aVar.f282797f : jVar;
        g gVar2 = (i12 & 32) != 0 ? aVar.f282798g : gVar;
        i iVar2 = (i12 & 64) != 0 ? aVar.f282799h : iVar;
        InterfaceC47457c interfaceC47457c2 = (i12 & 128) != 0 ? aVar.f282800i : interfaceC47457c;
        String str3 = (i12 & 256) != 0 ? aVar.f282801j : str;
        Boolean bool2 = (i12 & 512) != 0 ? aVar.f282802k : bool;
        String str4 = (i12 & 1024) != 0 ? aVar.f282803l : str2;
        h hVar2 = (i12 & 2048) != 0 ? aVar.f282804m : hVar;
        pw0.k kVar2 = (i12 & 4096) != 0 ? aVar.f282805n : kVar;
        m mVar2 = (i12 & 8192) != 0 ? aVar.f282806o : mVar;
        Long l13 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? aVar.f282807p : l12;
        LoaderInfoResponse loaderInfoResponse2 = (i12 & 32768) != 0 ? aVar.f282808q : loaderInfoResponse;
        boolean z12 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? aVar.f282809r : true;
        aVar.getClass();
        return new a(fVar2, lVar2, c47157a2, c47159c2, jVar2, gVar2, iVar2, interfaceC47457c2, str3, bool2, str4, hVar2, kVar2, mVar2, l13, loaderInfoResponse2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f282793b, aVar.f282793b) && L.f(this.f282794c, aVar.f282794c) && L.f(this.f282795d, aVar.f282795d) && L.f(this.f282796e, aVar.f282796e) && L.f(this.f282797f, aVar.f282797f) && L.f(this.f282798g, aVar.f282798g) && L.f(this.f282799h, aVar.f282799h) && L.f(this.f282800i, aVar.f282800i) && L.f(this.f282801j, aVar.f282801j) && L.f(this.f282802k, aVar.f282802k) && L.f(this.f282803l, aVar.f282803l) && L.f(this.f282804m, aVar.f282804m) && L.f(this.f282805n, aVar.f282805n) && L.f(this.f282806o, aVar.f282806o) && L.f(this.f282807p, aVar.f282807p) && L.f(this.f282808q, aVar.f282808q) && this.f282809r == aVar.f282809r;
    }

    public final int hashCode() {
        int iHashCode = this.f282793b.hashCode() * 31;
        pw0.l lVar = this.f282794c;
        int iHashCode2 = (this.f282800i.hashCode() + ((this.f282799h.hashCode() + ((this.f282798g.hashCode() + ((this.f282797f.hashCode() + ((this.f282796e.hashCode() + ((this.f282795d.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f282801j;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f282802k;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f282803l;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        h hVar = this.f282804m;
        int iHashCode6 = (iHashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        pw0.k kVar = this.f282805n;
        int iHashCode7 = (iHashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        m mVar = this.f282806o;
        int iHashCode8 = (iHashCode7 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Long l12 = this.f282807p;
        int iHashCode9 = (iHashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        LoaderInfoResponse loaderInfoResponse = this.f282808q;
        return Boolean.hashCode(this.f282809r) + ((iHashCode9 + (loaderInfoResponse != null ? loaderInfoResponse.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSoftBookingState(loading=");
        sb2.append(this.f282793b);
        sb2.append(", response=");
        sb2.append(this.f282794c);
        sb2.append(", booking=");
        sb2.append(this.f282795d);
        sb2.append(", contacts=");
        sb2.append(this.f282796e);
        sb2.append(", promo=");
        sb2.append(this.f282797f);
        sb2.append(", paymentData=");
        sb2.append(this.f282798g);
        sb2.append(", promoCode=");
        sb2.append(this.f282799h);
        sb2.append(", viewState=");
        sb2.append(this.f282800i);
        sb2.append(", xHash=");
        sb2.append(this.f282801j);
        sb2.append(", noRefundEnabled=");
        sb2.append(this.f282802k);
        sb2.append(", idempotencyKey=");
        sb2.append(this.f282803l);
        sb2.append(", paymentMethodsData=");
        sb2.append(this.f282804m);
        sb2.append(", refundToggles=");
        sb2.append(this.f282805n);
        sb2.append(", trustItemsState=");
        sb2.append(this.f282806o);
        sb2.append(", mcid=");
        sb2.append(this.f282807p);
        sb2.append(", loaderInfo=");
        sb2.append(this.f282808q);
        sb2.append(", isAnimatedLoaderAvailable=");
        return r.x(sb2, this.f282809r, ')');
    }
}
