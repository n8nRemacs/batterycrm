package com.avito.android.str_seller_orders.orders_seller;

import B91.C13108a;
import B91.F;
import B91.K;
import Ju.InterfaceC14249c;
import L91.r;
import L91.z;
import aa1.n;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.core.os.C22777e;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.view.InterfaceC22983P;
import androidx.view.result.ActivityResult;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.delivery_location_suggest.Coordinates;
import com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment;
import com.avito.android.sx_address.SxAddressAddResult;
import com.avito.android.sx_address.SxAddressCancel;
import com.avito.android.universal_map.map.UniversalMapFragment;
import com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi;
import com.avito.android.vas_planning.VasPlanningFragment;
import com.avito.android.vas_planning.q;
import com.avito.android.verification.links.mts.VerificationMTSActivity;
import com.esiasdk.android.EsiaAuthActivity;
import da1.C39689a;
import da1.k;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.Q;
import kotlin.collections.C42784z0;
import oa1.ViewOnLayoutChangeListenerC44727f;
import rG0.AbstractC47541a;
import ru.cyberity.cbr.core.android.PickerLifecycleObserver;
import ru.mts.biometry.sdk.feature.passport.ui.camera.m;
import ta1.C48629c;
import tz0.InterfaceC48745a;
import yA0.InterfaceC50095c;
import z91.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements androidx.view.result.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f289242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f289243c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f289242b = i12;
        this.f289243c = obj;
    }

    @Override // androidx.view.result.a
    public final void a(Object obj) throws ExecutionException, InterruptedException {
        Intent intent;
        Object serializableExtra;
        Object obj2 = this.f289243c;
        switch (this.f289242b) {
            case 0:
                StrSellerOrdersFragment.a aVar = StrSellerOrdersFragment.f289214v0;
                ((StrSellerOrdersFragment) obj2).q5().accept(InterfaceC48745a.l.f439710a);
                return;
            case 1:
                Coordinates coordinates = (Coordinates) obj;
                UniversalMapFragment.a aVar2 = UniversalMapFragment.f304838X0;
                if (coordinates != null) {
                    UniversalMapFragment universalMapFragment = (UniversalMapFragment) obj2;
                    universalMapFragment.r5();
                    oG0.f fVar = universalMapFragment.f304873y0;
                    (fVar != null ? fVar : null).R6(new AvitoMapPoint(coordinates.f135016b, coordinates.f135017c, null, 4, null), false, Float.valueOf(12.0f));
                    return;
                }
                return;
            case 2:
                Coordinates coordinates2 = (Coordinates) obj;
                if (coordinates2 == null) {
                    UniversalMapFragmentMvi.a aVar3 = UniversalMapFragmentMvi.f305959P0;
                    return;
                }
                UniversalMapFragmentMvi universalMapFragmentMvi = (UniversalMapFragmentMvi) obj2;
                com.avito.android.universal_map.map_mvi.point_info.b bVar = universalMapFragmentMvi.f305960A0;
                if (bVar != null && bVar.isVisible()) {
                    universalMapFragmentMvi.q5().accept(AbstractC47541a.c.b.f429693a);
                }
                com.avito.android.universal_map.map_mvi.point_filters.d dVar = universalMapFragmentMvi.f305961B0;
                if (dVar != null && dVar.f306253e && dVar.f306270v.f355975L != 5) {
                    universalMapFragmentMvi.q5().accept(new AbstractC47541a.AbstractC12359a.c());
                }
                universalMapFragmentMvi.q5().accept(new AbstractC47541a.b.g(new AvitoMapPoint(coordinates2.f135016b, coordinates2.f135017c, null, 4, null)));
                return;
            case 3:
                InterfaceC50095c.a aVar4 = InterfaceC50095c.f442964a;
                Intent intent2 = ((ActivityResult) obj).f21243c;
                aVar4.getClass();
                InterfaceC14249c.b bVar2 = intent2 != null ? (SxAddressAddResult) intent2.getParcelableExtra("result.sx_address.add") : null;
                if (bVar2 == null) {
                    bVar2 = SxAddressCancel.f292528b;
                }
                ((com.avito.android.user_address.deeplink.sx_new_address.a) obj2).j(bVar2);
                return;
            case 4:
                ActivityResult activityResult = (ActivityResult) obj;
                VasPlanningFragment.a aVar5 = VasPlanningFragment.f322179z0;
                if (activityResult.f21242b != -1 || (intent = activityResult.f21243c) == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = intent.getSerializableExtra("extra_date", Date.class);
                } else {
                    Object serializableExtra2 = intent.getSerializableExtra("extra_date");
                    if (!(serializableExtra2 instanceof Date)) {
                        serializableExtra2 = null;
                    }
                    serializableExtra = (Date) serializableExtra2;
                }
                Date date = (Date) serializableExtra;
                if (date != null) {
                    VasPlanningFragment vasPlanningFragment = (VasPlanningFragment) obj2;
                    q qVar = vasPlanningFragment.f322183q0;
                    (qVar != null ? qVar : null).getF322531T().accept(new Q(vasPlanningFragment.f322180n0, date));
                    return;
                }
                return;
            case 5:
                ActivityResult activityResult2 = (ActivityResult) obj;
                VerificationMTSActivity.a aVar6 = VerificationMTSActivity.f324277c;
                VerificationMTSActivity verificationMTSActivity = (VerificationMTSActivity) obj2;
                verificationMTSActivity.setResult(activityResult2.f21242b, activityResult2.f21243c);
                verificationMTSActivity.finish();
                return;
            case 6:
                int i12 = EsiaAuthActivity.f339658d;
                if (((ActivityResult) obj).f21242b == 0) {
                    new Handler().postDelayed(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f((EsiaAuthActivity) obj2, 8), 500L);
                    return;
                }
                return;
            case 7:
                C39689a c39689a = m.f436486m0;
                m mVar = (m) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    mVar.requireContext();
                    s sVar = z91.e.f443908b;
                    if (sVar == null) {
                        throw new IllegalArgumentException("DI delegate is null");
                    }
                    Aa1.b.a(sVar.b(), A91.q.a());
                    return;
                }
                F f12 = (F) mVar.f436376g0;
                if (f12 != null) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    PreviewView previewView = f12.f1031d;
                    if (!previewView.isLaidOut() || previewView.isLayoutRequested()) {
                        previewView.addOnLayoutChangeListener(new k(mVar, f12));
                        return;
                    }
                    aa1.e eVarG5 = mVar.g5();
                    InterfaceC22983P viewLifecycleOwner = mVar.getViewLifecycleOwner();
                    n nVarF5 = mVar.f5();
                    eVarG5.getClass();
                    eVarG5.f20928b.c(viewLifecycleOwner, previewView, nVarF5);
                    kotlin.reflect.n nVar = m.f436487n0[0];
                    z zVar = (z) mVar.f436488h0.a(mVar);
                    zVar.f9862L = new r(zVar.f9862L.f9845a, C42784z0.f406748b);
                    zVar.f9865O.setValue(L91.s.f9847a);
                    return;
                }
                return;
            case 8:
                kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar = (ru.mts.biometry.sdk.feature.recognition.ui.camera.i) obj2;
                if (((Boolean) obj).booleanValue()) {
                    iVar.c();
                    return;
                }
                iVar.requireContext();
                s sVar2 = z91.e.f443908b;
                if (sVar2 == null) {
                    throw new IllegalArgumentException("DI delegate is null");
                }
                Aa1.b.a(sVar2.b(), A91.q.a());
                return;
            case 9:
                ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar = (ru.mts.biometry.sdk.feature.registration.ui.camera.h) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    W91.h hVar2 = hVar.f436508h0;
                    Aa1.b.a(hVar2 != null ? hVar2 : null, A91.q.a());
                    return;
                }
                kotlin.reflect.n[] nVarArr2 = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0;
                K k12 = (K) hVar.f436376g0;
                if (k12 == null) {
                    return;
                }
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                PreviewView previewView2 = k12.f1076e;
                if (!previewView2.isLaidOut() || previewView2.isLayoutRequested()) {
                    previewView2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC44727f(hVar, k12));
                    return;
                } else {
                    hVar.f436512l0.c(hVar.getViewLifecycleOwner(), previewView2, (ma1.e) hVar.f436511k0.getValue());
                    return;
                }
            case 10:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    W91.h hVar3 = ((ru.mts.biometry.sdk.feature.registration.ui.intro.b) obj2).f436520h0;
                    W91.h hVar4 = hVar3 != null ? hVar3 : null;
                    Bundle bundleB = C22777e.b(new Q("image_uri", uri.toString()));
                    hVar4.getClass();
                    hVar4.c(new W91.d(bundleB));
                    return;
                }
                return;
            case 11:
                ru.cyberity.cbr.camera.video.presentation.a.a((ru.cyberity.cbr.camera.video.presentation.a) obj2, (Map) obj);
                return;
            case 12:
                PickerLifecycleObserver.b.a((PickerLifecycleObserver.b) obj2, obj);
                return;
            case 13:
                ru.cyberity.cbr.geo.presentation.a.a((ru.cyberity.cbr.geo.presentation.a) obj2, (Map) obj);
                return;
            default:
                ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar2 = (ru.mts.biometry.sdk.feature.selfie.ui.camera.i) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    iVar2.requireContext();
                    s sVar3 = z91.e.f443908b;
                    if (sVar3 == null) {
                        throw new IllegalArgumentException("DI delegate is null");
                    }
                    Aa1.b.a(sVar3.b(), A91.q.a());
                    return;
                }
                C13108a c13108a = (C13108a) iVar2.f436376g0;
                if (c13108a != null) {
                    WeakHashMap<View, A0> weakHashMap3 = C22823h0.f45055a;
                    PreviewView previewView3 = c13108a.f1088b;
                    if (!previewView3.isLaidOut() || previewView3.isLayoutRequested()) {
                        previewView3.addOnLayoutChangeListener(new ta1.i(iVar2, c13108a));
                    } else {
                        iVar2.f436522i0.c(iVar2.getViewLifecycleOwner(), previewView3, (C48629c) iVar2.f436523j0.getValue());
                    }
                    previewView3.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
