package com.avito.android.messenger.map.sharing;

import KY.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapMoveReason;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.messenger.map.sharing.K;
import com.avito.android.util.C35971x;
import com.avito.android.util.V2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: SharingMapView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/L;", "Lcom/avito/android/messenger/map/sharing/K;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class L implements K, AvitoMapAttachHelper.MapAttachListener {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f196666s = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/map/sharing/SharingMapView$State;", L.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f196667b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C35971x f196668c = new C35971x();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public AvitoMap f196669d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f196670e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FloatingActionButton f196671f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final KY.b f196672g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.map.d f196673h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<Boolean> f196674i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<AvitoMapCameraPosition> f196675j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<G0> f196676k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<G0> f196677l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f196678m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f196679n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public AvitoMapMarker f196680o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f196681p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f196682q;

    /* renamed from: r, reason: collision with root package name */
    public final int f196683r;

    /* compiled from: SharingMapView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/map/sharing/L$a", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements AvitoMap.MapMoveEndListener {
        public a() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
        public final void onMapSettled(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition) {
            L l12 = L.this;
            if (l12.f196682q) {
                V2.f318762a.i("SharingMapView", "onCameraIdle(), ignoring", null);
                l12.f196682q = false;
            } else {
                V2.f318762a.i("SharingMapView", "onCameraIdle(), sending event", null);
                l12.f196675j.accept(avitoMapCameraPosition);
            }
        }
    }

    /* compiled from: SharingMapView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/map/sharing/L$b", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements AvitoMap.MapMoveStartListener {
        public b() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapMoveStartListener
        public final void onMapMoveStarted(@Y61.k AvitoMapMoveReason avitoMapMoveReason) {
            if (avitoMapMoveReason == AvitoMapMoveReason.GESTURE) {
                V2.f318762a.i("SharingMapView", "OnCameraMoveStarted.REASON_GESTURE", null);
                L.this.f196676k.accept(G0.f406611a);
            }
        }
    }

    public L(@Y61.k View view, @Y61.k AvitoMapAttachHelper avitoMapAttachHelper, @Y61.k FragmentManager fragmentManager) {
        this.f196667b = view;
        this.f196670e = view.getContext();
        View viewFindViewById = view.findViewById(R.id.messenger_sharing_map_location_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.floatingactionbutton.FloatingActionButton");
        }
        this.f196671f = (FloatingActionButton) viewFindViewById;
        a.C0576a c0576a = KY.a.f9510u1;
        View viewFindViewById2 = view.findViewById(R.id.messenger_sharing_map_connection_error_indicator);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        c0576a.getClass();
        this.f196672g = new KY.b(viewFindViewById2);
        com.avito.android.messenger.map.d dVar = new com.avito.android.messenger.map.d(view, R.style.Re23_Button_PrimaryLarge, R.string.messenger_share_map_send_location_button, true);
        this.f196673h = dVar;
        this.f196674i = com.jakewharton.rxrelay3.b.N0(Boolean.FALSE).M0();
        this.f196675j = C31685o.m();
        this.f196676k = C31685o.m();
        this.f196677l = C31685o.m();
        this.f196678m = dVar.f196462p;
        this.f196679n = dVar.f196463q;
        this.f196682q = true;
        this.f196683r = view.getResources().getDimensionPixelSize(R.dimen.messenger_sharing_map_center_offset);
        avitoMapAttachHelper.setMapAttachedListener(this);
        avitoMapAttachHelper.attachView(R.id.messenger_sharing_map_map_view, view, fragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final K.d a(com.avito.android.mvi.e<K.d> eVar) {
        C35971x c35971x = this.f196668c;
        kotlin.reflect.n<Object> nVar = f196666s[0];
        return (K.d) c35971x.f319122b;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.avito.android.messenger.map.sharing.K$d] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        C35971x c35971x = this.f196668c;
        kotlin.reflect.n<Object> nVar = f196666s[0];
        c35971x.f319122b = (K.d) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    @Override // com.avito.android.mvi.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.avito.android.mvi.e<com.avito.android.messenger.map.sharing.K.d> r12, com.avito.android.messenger.map.sharing.K.d r13, com.avito.android.messenger.map.sharing.K.d r14) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.map.sharing.L.d(com.avito.android.mvi.e, java.lang.Object, java.lang.Object):void");
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    @SuppressLint({"CheckResult"})
    public final void onMapAttach(@Y61.k AvitoMap avitoMap) {
        this.f196669d = avitoMap;
        avitoMap.setPadding(0, 0, this.f196683r * 2, 0);
        AvitoMapUiSettings uiSettings = avitoMap.getUiSettings();
        uiSettings.isRotateGesturesEnabled(false);
        uiSettings.isTiltGesturesEnabled(false);
        avitoMap.addMoveEndListener(new a());
        avitoMap.addMoveStartListener(new b());
        this.f196671f.setOnClickListener(new ViewOnClickListenerC31873b(this, 9));
        this.f196674i.accept(Boolean.TRUE);
    }
}
