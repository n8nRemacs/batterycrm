package Fc1;

import Fc1.C13683n5;
import ab.InterfaceC19855a;
import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Trace;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.camera.core.C20140q0;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.E;
import androidx.collection.C20247y0;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.InterfaceC22791e;
import androidx.fragment.app.C22949g;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.analytics.b;
import androidx.view.AbstractC23043j;
import androidx.view.C22985S;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22982O;
import androidx.view.Lifecycle;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import com.adjust.sdk.ActivityHandler;
import com.avito.android.advert_multi_items.param_chips.modification_chip.ModificationChipItem;
import com.avito.android.advert_multi_items.param_images.modification_image.ModificationImageItem;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.AdvertDetailStatsMVIFragment;
import com.avito.android.analytics.NetworkType;
import com.avito.android.analytics.screens.tracker.C28487i;
import com.avito.android.analytics.statsd.y;
import com.avito.android.rating_form.activity.bottom_sheet.RatingFormBottomSheetActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class G3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4976c;

    public /* synthetic */ G3(DeferrableSurface deferrableSurface, String str) {
        this.f4975b = 5;
        this.f4976c = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13683n5 c13683n5;
        C13629h5 c13629h5;
        AtomicBoolean atomicBoolean;
        boolean z12;
        switch (this.f4975b) {
            case 0:
                H3 h32 = (H3) this.f4976c;
                if (h32.f4989b) {
                    h32.f4989b = false;
                    C13683n5.a aVar = h32.f4995h;
                    if (aVar == null || (c13629h5 = (c13683n5 = C13683n5.this).f5703c) == null) {
                        return;
                    }
                    WeakReference<Activity> weakReferenceC = c13683n5.f5701a.c();
                    F4 f42 = c13629h5.f5556d;
                    if (f42 == null) {
                        f42 = null;
                    }
                    f42.getClass();
                    f42.f4954a = weakReferenceC;
                    C13780y4 c13780y4 = new C13780y4(c13629h5.f5553a);
                    c13629h5.f5558f = c13780y4;
                    try {
                        InterfaceC13706q1 interfaceC13706q1 = c13780y4.f5900a;
                        if (interfaceC13706q1 == null) {
                            interfaceC13706q1 = null;
                        }
                        U7 u72 = c13780y4.f5902c;
                        if (u72 == null) {
                            u72 = null;
                        }
                        interfaceC13706q1.a(u72.f5239b);
                        InterfaceC13706q1 interfaceC13706q12 = c13780y4.f5900a;
                        (interfaceC13706q12 != null ? interfaceC13706q12 : null).show();
                        return;
                    } catch (Exception unused) {
                        c13629h5.a();
                        return;
                    }
                }
                return;
            case 1:
                ((KE.a) this.f4976c).f9372d.requestLayout();
                return;
            case 2:
                BottomSheetBehavior<View> bottomSheetBehavior = ((RatingFormBottomSheetActivity) this.f4976c).f247950w;
                (bottomSheetBehavior != null ? bottomSheetBehavior : null).b(3);
                return;
            case 3:
                ((E.c) this.f4976c).a();
                return;
            case 4:
                ((E.b) this.f4976c).a();
                return;
            case 5:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f4976c;
                Size size = DeferrableSurface.f23925k;
                deferrableSurface.getClass();
                try {
                    deferrableSurface.f23933e.get();
                    DeferrableSurface.f23928n.decrementAndGet();
                    DeferrableSurface.f23927m.get();
                    deferrableSurface.e();
                    return;
                } catch (Exception e12) {
                    deferrableSurface.toString();
                    C20140q0.b("DeferrableSurface");
                    synchronized (deferrableSurface.f23929a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.f23931c), Integer.valueOf(deferrableSurface.f23930b)), e12);
                    }
                }
            case 6:
                ((com.google.common.util.concurrent.D0) this.f4976c).cancel(true);
                return;
            case 7:
                androidx.compose.material.ripple.u.setRippleState$lambda$2((androidx.compose.material.ripple.u) this.f4976c);
                return;
            case 8:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f4976c;
                androidComposeView.f40967A0 = false;
                MotionEvent motionEvent = androidComposeView.f41036u0;
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.N(motionEvent);
                return;
            case 9:
                androidx.compose.ui.platform.r rVar = (androidx.compose.ui.platform.r) this.f4976c;
                C20247y0 c20247y0 = androidx.compose.ui.platform.r.f41532P;
                Trace.beginSection("measureAndLayout");
                try {
                    AndroidComposeView androidComposeView2 = rVar.f41548d;
                    J0.a aVar2 = androidx.compose.ui.node.J0.f40575D1;
                    androidComposeView2.w(true);
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        rVar.n();
                        Trace.endSection();
                        rVar.f41544L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 10:
                int i12 = C22949g.f46547g;
                androidx.fragment.app.J.c(4, (ArrayList) this.f4976c);
                return;
            case 11:
                ((Fragment) this.f4976c).lambda$performCreateView$0();
                return;
            case 12:
                break;
            case 13:
                C23050m0 c23050m0 = (C23050m0) this.f4976c;
                int i13 = c23050m0.f46825c;
                C22985S c22985s = c23050m0.f46829g;
                if (i13 == 0) {
                    c23050m0.f46826d = true;
                    c22985s.f(Lifecycle.Event.ON_PAUSE);
                }
                if (c23050m0.f46824b == 0 && c23050m0.f46826d) {
                    c22985s.f(Lifecycle.Event.ON_STOP);
                    c23050m0.f46827e = true;
                    return;
                }
                return;
            case 14:
                androidx.media3.exoplayer.analytics.p pVar = (androidx.media3.exoplayer.analytics.p) this.f4976c;
                b.C1823b c1823bF = pVar.F();
                pVar.K(c1823bF, 1028, new androidx.media3.common.S(c1823bF, 22));
                pVar.f48691g.d();
                return;
            case 15:
                ((InterfaceC22791e) this.f4976c).accept(new androidx.window.layout.n(C42784z0.f406748b));
                return;
            case 16:
                kotlinx.coroutines.N0 n02 = (kotlinx.coroutines.N0) this.f4976c;
                if (n02 != null) {
                    n02.c(null);
                    return;
                }
                return;
            case 17:
                RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) this.f4976c;
                remoteWorkManagerClient.f56120g.a(remoteWorkManagerClient.f56119f, remoteWorkManagerClient.f56121h);
                return;
            case 18:
                ((io.reactivex.rxjava3.disposables.d) this.f4976c).dispose();
                return;
            case 19:
                ((ActivityHandler) this.f4976c).lambda$new$1();
                return;
            case 20:
                com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.r rVar2 = (com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.r) this.f4976c;
                LinearLayout linearLayout = rVar2.f76163l;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.f44160G = rVar2.f76155d.getLineCount() > 1 ? 1.0f : 0.8f;
                linearLayout.setLayoutParams(bVar);
                return;
            case 21:
                ((com.avito.android.advert.item.icebreakers_redesign.m) this.f4976c).f76559c.setVisibility(8);
                return;
            case 22:
                com.avito.android.advert.item.leasing_calculator.q qVar = (com.avito.android.advert.item.leasing_calculator.q) this.f4976c;
                Y41.a<kotlin.G0> aVar3 = qVar.f77455o;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                qVar.f77455o = null;
                return;
            case 23:
                com.avito.android.advert_multi_items.param_chips.g gVar = (com.avito.android.advert_multi_items.param_chips.g) this.f4976c;
                List<ModificationChipItem> list = gVar.f85920i;
                if (list == null) {
                    return;
                }
                gVar.f85919h.b(list, false);
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.avito.android.advert_multi_items.param_images.g gVar2 = (com.avito.android.advert_multi_items.param_images.g) this.f4976c;
                List<ModificationImageItem> list2 = gVar2.f85950i;
                if (list2 == null) {
                    return;
                }
                gVar2.f85949h.b(list2, false);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                AdvertDetailStatsMVIFragment.a aVar4 = AdvertDetailStatsMVIFragment.f86027D0;
                ((AdvertDetailStatsMVIFragment) this.f4976c).D5().accept(InterfaceC19855a.d.f21001a);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                com.avito.android.ai_assistant.screens.chat.q qVar2 = (com.avito.android.ai_assistant.screens.chat.q) this.f4976c;
                qVar2.f89500u.f89504b = qVar2.f89498s;
                qVar2.f89492m.setVerticalScrollBarEnabled(true);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                com.avito.android.analytics.J j12 = (com.avito.android.analytics.J) this.f4976c;
                ConnectivityManager connectivityManager = (ConnectivityManager) j12.f89656a.getSystemService("connectivity");
                try {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        j12.f89659d = j12.c(networkCapabilities);
                    }
                    connectivityManager.registerNetworkCallback(j12.f89658c, new com.avito.android.analytics.I(j12));
                    return;
                } catch (SecurityException e13) {
                    j12.f89659d = NetworkType.f89676n;
                    com.avito.android.util.V2.f318762a.a("DEFAULT_TAG", "Unexpected security exception during network type acquiring", e13);
                    return;
                }
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C28487i c28487i = (C28487i) this.f4976c;
                LinkedHashMap linkedHashMap = c28487i.f90889c;
                for (String str : C42745f0.M0(linkedHashMap.keySet())) {
                    Lifecycle lifecycle = c28487i.f90888b.getLifecycle();
                    InterfaceC22982O interfaceC22982O = (InterfaceC22982O) linkedHashMap.remove(str);
                    if (interfaceC22982O != null) {
                        lifecycle.c(interfaceC22982O);
                    }
                }
                return;
            default:
                com.avito.android.analytics.screens.tracker.C c12 = (com.avito.android.analytics.screens.tracker.C) this.f4976c;
                long jB2 = c12.f90796a.f3261a.b();
                if (c12.f90703c.b(new y.c(c12.f90704d.getF90370a() + ".mvi-redraw-absolute." + c12.f90707g, Long.valueOf(jB2), null))) {
                    c12.f90706f.d(jB2, c12.f90707g, "redraw state", "mvi");
                }
                c12.f90797b.h();
                return;
        }
        do {
            AbstractC23043j abstractC23043j = (AbstractC23043j) this.f4976c;
            AtomicBoolean atomicBoolean2 = abstractC23043j.f46805d;
            boolean zCompareAndSet = atomicBoolean2.compareAndSet(false, true);
            atomicBoolean = abstractC23043j.f46804c;
            if (zCompareAndSet) {
                boolean z13 = false;
                Object objA = null;
                while (atomicBoolean.compareAndSet(true, false)) {
                    try {
                        objA = abstractC23043j.a();
                        z13 = true;
                    } catch (Throwable th2) {
                        atomicBoolean2.set(false);
                        throw th2;
                    }
                }
                if (z13) {
                    abstractC23043j.f46803b.postValue(objA);
                }
                atomicBoolean2.set(false);
                z12 = z13;
            } else {
                z12 = false;
            }
            if (!z12) {
                return;
            }
        } while (atomicBoolean.get());
    }

    public /* synthetic */ G3(Object obj, int i12) {
        this.f4975b = i12;
        this.f4976c = obj;
    }
}
