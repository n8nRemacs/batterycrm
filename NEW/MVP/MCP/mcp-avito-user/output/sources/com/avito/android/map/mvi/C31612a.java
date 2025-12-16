package com.avito.android.map.mvi;

import bY.InterfaceC25585b;
import com.avito.android.C36135w2;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.google.android.gms.maps.model.LatLngBounds;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lW.InterfaceC43691a;

/* compiled from: MapActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/map/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LbY/b;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lcom/avito/android/map/mvi/entity/a;", "a", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.map.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31612a implements com.avito.android.arch.mvi.a<InterfaceC25585b, MapInternalAction, com.avito.android.map.mvi.entity.a> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f185004g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31635y f185005a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f185006b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f185007c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map.analytics.a f185008d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f185009e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f185010f;

    /* compiled from: MapActor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/map/mvi/a$a;", "", "<init>", "()V", "", "ADVERTS_IN_PIN_LOAD_LIMIT", "I", "", "THROTTLE_FIRST_DURATION", "J", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map.mvi.a$a, reason: collision with other inner class name */
    public static final class C5432a {
        public /* synthetic */ C5432a(C42822w c42822w) {
            this();
        }

        public C5432a() {
        }
    }

    static {
        new C5432a(null);
    }

    @Inject
    public C31612a(@Y61.k InterfaceC31635y interfaceC31635y, @Y61.k T t12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.map.analytics.a aVar2, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.k C36135w2 c36135w2) {
        this.f185005a = interfaceC31635y;
        this.f185006b = t12;
        this.f185007c = aVar;
        this.f185008d = aVar2;
        this.f185009e = interfaceC43691a;
        this.f185010f = c36135w2;
    }

    public static kotlinx.coroutines.flow.internal.m e(C31612a c31612a, com.avito.android.map.mvi.entity.a aVar, int i12) {
        boolean z12 = (i12 & 2) == 0;
        boolean z13 = (i12 & 4) == 0;
        boolean z14 = (i12 & 8) == 0;
        c31612a.getClass();
        LatLngBounds latLngBounds = aVar.f185157h;
        Area areaD = latLngBounds != null ? com.avito.android.map_core.utils.d.d(latLngBounds) : null;
        SearchParams searchParams = aVar.f185151b;
        InterfaceC43160i interfaceC43160iB = c31612a.f185005a.b(areaD, searchParams.getDrawId(), aVar.f185163n, aVar.f185169t, searchParams, aVar.f185156g, z13, aVar.f185167r.f185203b, (768 & 256) != 0 ? false : z14, (768 & 512) != 0 ? false : false);
        InterfaceC31635y interfaceC31635y = c31612a.f185005a;
        PresentationType presentationType = aVar.f185169t;
        return C43175k.N(interfaceC43160iB, interfaceC31635y.a(searchParams, presentationType), presentationType.isFullMap() ? new C43210w(new MapInternalAction.NotifyFeaturesRefresh(z12)) : C43175k.w());
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new C31623l(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, C31622k.f185268l));
    }

    public final InterfaceC43160i c(Boolean bool, a.C5436a.C5437a c5437a, boolean z12, SearchParams searchParams, int i12, PresentationType presentationType) {
        if (kotlin.jvm.internal.L.f(bool, Boolean.TRUE)) {
            C36135w2 c36135w2 = this.f185010f;
            c36135w2.getClass();
            kotlin.reflect.n<Object> nVar = C36135w2.f327457X[43];
            if (((Boolean) c36135w2.f327471N.a().invoke()).booleanValue()) {
                return this.f185005a.e(c5437a, z12, searchParams, i12, presentationType);
            }
        }
        return this.f185005a.d(c5437a, z12, searchParams, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.C43152f0 b(@Y61.k bY.InterfaceC25585b r55, @Y61.k com.avito.android.map.mvi.entity.a r56) {
        /*
            Method dump skipped, instructions count: 1642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.mvi.C31612a.b(bY.b, com.avito.android.map.mvi.entity.a):kotlinx.coroutines.flow.f0");
    }
}
