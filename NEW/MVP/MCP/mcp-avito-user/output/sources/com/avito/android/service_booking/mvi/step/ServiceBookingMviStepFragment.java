package com.avito.android.service_booking.mvi.step;

import Cd.C13243a;
import Fs0.InterfaceC13831a;
import Hs0.InterfaceC14030a;
import Is0.C14155a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.V0;
import cU.s;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ownership.Owners;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.AnimationOverlayUrl;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.mvi.perf_screen.ServicesBookingScreenMvi;
import com.avito.android.service_booking.mvi.step.C34912f;
import com.avito.android.service_booking.mvi.step.di.b;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import com.avito.android.service_booking.mvi.step.mvi.entity.a;
import com.avito.android.service_booking.remote.result.ServiceBookingError;
import com.avito.android.service_booking.remote.result.ServiceBookingResult;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.beduin.v2.render.android_view.BeduinView;
import cv.InterfaceC39417a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import mV0.C44020b;
import z1.AbstractC50339a;

/* compiled from: ServiceBookingMviStepFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/ServiceBookingMviStepFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingMviStepFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f274486D0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public String f274487A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f274488B0;

    /* renamed from: C0, reason: collision with root package name */
    public cU.s f274489C0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public S f274490o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public C14155a f274491p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public C44020b f274492q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public HV0.c f274493r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f274494s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final O0 f274495t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public C34912f.a f274496u0;

    /* renamed from: v0, reason: collision with root package name */
    public C34912f f274497v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public Map<String, Map<String, Set<Object>>> f274498w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f274499x0;

    /* renamed from: y0, reason: collision with root package name */
    public ScreenPerformanceTracker f274500y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final ZS.b f274501z0;

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/ServiceBookingMviStepFragment$a;", "", "<init>", "()V", "", "BDUI_MEM_REPO_KEY", "Ljava/lang/String;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<Object, G0> {
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            ServiceBookingMviStepFragment serviceBookingMviStepFragment = (ServiceBookingMviStepFragment) this.receiver;
            a aVar = ServiceBookingMviStepFragment.f274486D0;
            serviceBookingMviStepFragment.getClass();
            if (obj instanceof a.C8153a) {
                ActivityC22955m activityC22955mRequireActivity = serviceBookingMviStepFragment.requireActivity();
                Intent intent = new Intent();
                intent.putExtra("result.service_booking", ((a.C8153a) obj).f274737a);
                G0 g02 = G0.f406611a;
                activityC22955mRequireActivity.setResult(-1, intent);
                activityC22955mRequireActivity.finish();
            } else {
                boolean z12 = obj instanceof a.c;
                O0 o02 = serviceBookingMviStepFragment.f274495t0;
                if (z12) {
                    ((com.avito.android.service_booking.mvi.e) o02.getValue()).accept(new InterfaceC13831a.b(((a.c) obj).f274739a, null, 2, null));
                } else if (obj instanceof a.e) {
                    com.avito.android.service_booking.mvi.e eVar = (com.avito.android.service_booking.mvi.e) o02.getValue();
                    a.e eVar2 = (a.e) obj;
                    String str = serviceBookingMviStepFragment.f274487A0;
                    eVar.accept(new InterfaceC13831a.C0305a(eVar2.f274741a, str != null ? str : null, eVar2.f274742b));
                } else if (obj instanceof a.d) {
                    DeepLink deepLink = ((a.d) obj).f274740a;
                    if (deepLink != null) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = serviceBookingMviStepFragment.f274499x0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        b.a.a(aVar2, deepLink, null, null, 6);
                    }
                } else if (obj instanceof a.g) {
                    C34912f c34912f = serviceBookingMviStepFragment.f274497v0;
                    if (c34912f == null) {
                        c34912f = null;
                    }
                    a.g gVar = (a.g) obj;
                    String strK0 = gVar.f274744a.k0(serviceBookingMviStepFragment.requireContext());
                    c34912f.getClass();
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    View view = (View) c34912f.f274644f.f274452e.getValue();
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(strK0);
                    ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, null, null, f.c.a.b(), 2750, toastBarPosition, null, false, false, null, null, 3982);
                    boolean z13 = gVar.f274745b;
                    ServiceBookingError serviceBookingError = gVar.f274746c;
                    if (z13) {
                        com.avito.android.service_booking.mvi.e eVar3 = (com.avito.android.service_booking.mvi.e) o02.getValue();
                        String str2 = serviceBookingMviStepFragment.f274487A0;
                        eVar3.accept(new InterfaceC13831a.b(str2 != null ? str2 : null, serviceBookingError));
                    } else {
                        ((com.avito.android.service_booking.mvi.e) o02.getValue()).accept(new InterfaceC13831a.c(serviceBookingError));
                    }
                } else if (obj instanceof a.f) {
                    serviceBookingMviStepFragment.s5().accept(new InterfaceC40047a.e(((a.f) obj).f274743a, serviceBookingMviStepFragment.f274501z0));
                } else if (obj instanceof BeduinOneTimeEvent) {
                    if (((BeduinOneTimeEvent) obj) instanceof BeduinOneTimeEvent.ShowToastBar) {
                        com.avito.android.lib.beduin_v2.ui_messages.b bVar = com.avito.android.lib.beduin_v2.ui_messages.b.f177570a;
                        C34912f c34912f2 = serviceBookingMviStepFragment.f274497v0;
                        C34912f c34912f3 = c34912f2 != null ? c34912f2 : null;
                        bVar.getClass();
                        com.avito.android.lib.beduin_v2.ui_messages.b.a((BeduinView) c34912f3.f274644f.f274455h.getValue(), (BeduinOneTimeEvent.ShowToastBar) obj);
                    }
                } else if (obj instanceof a.b) {
                    C34912f c34912f4 = serviceBookingMviStepFragment.f274497v0;
                    C34912f c34912f5 = c34912f4 != null ? c34912f4 : null;
                    c34912f5.getClass();
                    com.avito.android.lib.design.animation.animation_overlay.e eVar4 = com.avito.android.lib.design.animation.animation_overlay.e.f178326a;
                    ServiceBookingMviStepState.ServiceBookingAnimationUrl serviceBookingAnimationUrl = ((a.b) obj).f274738a;
                    com.avito.android.lib.design.animation.animation_overlay.b bVarB = com.avito.android.lib.design.animation.animation_overlay.e.b(eVar4, c34912f5.f274639a, new AnimationOverlayUrl(serviceBookingAnimationUrl.getPortraitUrl(), serviceBookingAnimationUrl.getLandscapeUrl(), serviceBookingAnimationUrl.getTabletPortraitUrl()), 30);
                    androidx.core.view.P.b(bVarB, new G(bVarB, c34912f5));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHs0/b;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LHs0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Hs0.b, G0> {
        public c() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final G0 invoke(Hs0.b bVar) {
            Hs0.b bVar2 = bVar;
            ServiceBookingMviStepFragment serviceBookingMviStepFragment = ServiceBookingMviStepFragment.this;
            C34912f c34912f = serviceBookingMviStepFragment.f274497v0;
            if (c34912f == null) {
                c34912f = null;
            }
            C34909c c34909c = new C34909c(1, serviceBookingMviStepFragment.s5(), P.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            c34912f.getClass();
            ServiceBookingMviStepState serviceBookingMviStepState = bVar2.f7798a;
            boolean z12 = serviceBookingMviStepState.f274713b;
            O o12 = c34912f.f274644f;
            if (z12) {
                D6.w((LinearLayout) o12.f274453f.f274287a.getValue());
                C42670a.d(o12.f274454g);
            } else {
                String str = serviceBookingMviStepState.f274715d;
                if (str != null) {
                    o12.f274454g.c(null, new H(c34912f, str));
                } else {
                    ServiceBookingError serviceBookingError = serviceBookingMviStepState.f274714c;
                    if (serviceBookingError == null) {
                        o12.f274454g.b();
                        D6.w((LinearLayout) o12.f274453f.f274287a.getValue());
                        ServiceBookingMviStepState.ServiceBookingContent serviceBookingContent = serviceBookingMviStepState.f274716e;
                        if (serviceBookingContent != null) {
                            Boolean bool = serviceBookingContent.f274722d;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                            String str2 = serviceBookingContent.f274725g;
                            boolean z13 = str2 != null;
                            boolean z14 = zBooleanValue && !z13 && serviceBookingMviStepState.f274717f;
                            Button button = (Button) o12.f274449b.getValue();
                            ServiceBookingMviStepState.ServiceBookingContent.SrvBookingNextAction srvBookingNextAction = serviceBookingContent.f274727i;
                            if (z14) {
                                com.avito.android.lib.design.button.b.a(button, srvBookingNextAction != null ? srvBookingNextAction.f274730b : null, false);
                                button.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(27, srvBookingNextAction, c34909c));
                            }
                            D6.G(button, z14 && srvBookingNextAction != null);
                            Button button2 = (Button) o12.f274450c.getValue();
                            if (z13) {
                                com.avito.android.lib.design.button.b.a(button2, str2, false);
                                button2.setOnClickListener(new com.avito.android.seller_promotions.b(1, c34909c));
                            }
                            D6.G(button2, z13);
                            boolean z15 = serviceBookingContent.f274724f != null || serviceBookingContent.f274720b;
                            boolean zF2 = kotlin.jvm.internal.L.f(serviceBookingContent.f274721c, Boolean.TRUE);
                            View view = c34912f.f274639a;
                            Drawable drawableH = C35835l0.h(R.attr.ic_arrowBack24, view.getContext());
                            if (!zF2) {
                                drawableH = null;
                            }
                            if (drawableH != null) {
                                drawableH.setTintList(C35835l0.e(R.attr.black, view.getContext()));
                            }
                            o12.a().setTitleCentered(true);
                            o12.a().setTitle(serviceBookingContent.f274723e);
                            o12.a().setNavigationIcon(drawableH);
                            o12.a().setNavigationContentDescription(view.getContext().getString(R.string.sb_go_back));
                            Menu menu = o12.a().getMenu();
                            MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.sb_close_action) : null;
                            if (menuItemFindItem != null) {
                                menuItemFindItem.setVisible(z15);
                            }
                            ((RecyclerView) o12.f274451d.getValue()).post(new RunnableC34589p(9, c34912f, serviceBookingContent.f274726h));
                        }
                    } else if (serviceBookingError instanceof ServiceBookingResult.Failure) {
                        o12.f274454g.c(null, new H(c34912f, serviceBookingError.getMessage()));
                    } else if (serviceBookingError instanceof ServiceBookingResult.PartnerServiceError) {
                        o12.f274454g.b();
                        ServiceBookingResult.PartnerServiceError partnerServiceError = (ServiceBookingResult.PartnerServiceError) serviceBookingError;
                        String title = partnerServiceError.getTitle();
                        String message = serviceBookingError.getMessage();
                        boolean hasReloadButton = partnerServiceError.getHasReloadButton();
                        com.avito.android.service_booking.error_titled_view.e eVar = o12.f274453f;
                        D6.G((LinearLayout) eVar.f274287a.getValue(), true);
                        ((TextView) eVar.f274288b.getValue()).setText(title);
                        ((TextView) eVar.f274289c.getValue()).setText(message);
                        D6.G((Button) eVar.f274290d.getValue(), hasReloadButton);
                    } else if (serviceBookingError instanceof ServiceBookingResult.WrongSlotError) {
                        o12.f274454g.c(null, new H(c34912f, serviceBookingError.getMessage()));
                    }
                }
            }
            AbstractC40048c abstractC40048c = bVar2.f7799b;
            if (abstractC40048c instanceof AbstractC40048c.a) {
                ((BeduinView) o12.f274455h.getValue()).b(((AbstractC40048c.a) abstractC40048c).getF395211c());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.l<Object, G0> {
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            ((P) this.receiver).accept(obj);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.l<Object, G0> {
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            ((P) this.receiver).accept(obj);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_booking/mvi/step/ServiceBookingMviStepFragment$f", "Landroidx/activity/x;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends androidx.view.x {
        public f() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = ServiceBookingMviStepFragment.f274486D0;
            ServiceBookingMviStepFragment.this.s5().accept(InterfaceC14030a.b.f7779a);
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "data", "Lkotlin/G0;", "onValueChanged", "(Lcom/avito/beduin/v2/engine/field/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<Value> implements oV0.e {
        public g() {
        }

        @Override // oV0.e
        public final void a(Object obj) {
            com.avito.beduin.v2.engine.field.m mVar;
            Map<String, com.avito.beduin.v2.engine.field.d> map;
            com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) obj;
            ServiceBookingMviStepFragment serviceBookingMviStepFragment = ServiceBookingMviStepFragment.this;
            C14155a c14155a = serviceBookingMviStepFragment.f274491p0;
            LinkedHashMap linkedHashMap = null;
            if (c14155a == null) {
                c14155a = null;
            }
            if (dVar != null) {
                com.avito.beduin.v2.engine.core.z zVar = c14155a.f8577a;
                com.avito.beduin.v2.engine.field.entity.A a12 = dVar.a(zVar);
                if (a12 != null && (mVar = a12.f336778b) != null && (map = mVar.f336870a) != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(map.size()));
                    Iterator<T> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        com.avito.beduin.v2.engine.field.entity.v vVarQ = ((com.avito.beduin.v2.engine.field.d) entry.getValue()).q(zVar);
                        String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                        if (f336843b == null) {
                            f336843b = "";
                        }
                        linkedHashMap2.put(key, f336843b);
                    }
                    linkedHashMap = linkedHashMap2;
                }
            } else {
                c14155a.getClass();
            }
            if (linkedHashMap != null) {
                serviceBookingMviStepFragment.s5().accept(new InterfaceC14030a.k(linkedHashMap));
            }
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<Set<FV0.h>> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = ServiceBookingMviStepFragment.f274486D0;
            return ServiceBookingMviStepFragment.this.s5().f274465J;
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = ServiceBookingMviStepFragment.f274486D0;
            ServiceBookingMviStepFragment.this.s5().accept(new InterfaceC14030a.g(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_booking/mvi/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_booking/mvi/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.service_booking.mvi.e> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.service_booking.mvi.e invoke() {
            return (com.avito.android.service_booking.mvi.e) ((com.avito.android.service_booking.mvi.di.q) ((com.avito.android.K) ServiceBookingMviStepFragment.this.requireActivity()).r0()).n9().get();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/e", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f274508l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar) {
            super(0);
            this.f274508l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f274508l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<S0> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ServiceBookingMviStepFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/c", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ServiceBookingMviStepFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f274511l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Y41.a aVar) {
            super(0);
            this.f274511l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f274511l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ServiceBookingMviStepFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o f274513l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.f274513l = oVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f274513l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f274514l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f274514l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f274514l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f274515l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f274515l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f274515l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ServiceBookingMviStepFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/P;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_booking/mvi/step/P;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends kotlin.jvm.internal.N implements Y41.a<P> {
        public s() {
            super(0);
        }

        @Override // Y41.a
        public final P invoke() {
            S s5 = ServiceBookingMviStepFragment.this.f274490o0;
            if (s5 == null) {
                s5 = null;
            }
            return (P) s5.get();
        }
    }

    public ServiceBookingMviStepFragment() {
        n nVar = new n(new s());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new p(new o()));
        n0 n0Var = m0.f406844a;
        this.f274494s0 = new O0(n0Var.b(P.class), new q(interfaceC42726CB), nVar, new r(interfaceC42726CB));
        this.f274495t0 = new O0(n0Var.b(com.avito.android.service_booking.mvi.e.class), new l(), new k(new j()), new m());
        this.f274501z0 = new ZS.b(ServicesBookingScreenMvi.f274427d, Owners.f210475c3, (String) null, 4, (C42822w) null);
        this.f274488B0 = C42727D.c(new h());
    }

    @Override // FV0.d
    public final void close() {
        s5().accept(InterfaceC14030a.c.f7780a);
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        FV0.i.a(r5(), this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f274500y0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.arch.mvi.android.f.a(s5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new b(1, this, ServiceBookingMviStepFragment.class, "handleEvent", "handleEvent(Ljava/lang/Object;)V", 0), new c());
        return layoutInflater.inflate(R.layout.service_booking_step_fragment_mvi, viewGroup, false);
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FV0.i.b(r5());
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        HV0.c cVar = this.f274493r0;
        if (cVar != null) {
            cVar.dispose();
        }
        C44020b c44020b = this.f274492q0;
        if (c44020b == null) {
            c44020b = null;
        }
        c44020b.d("srvBookingBduiContentKey");
        C34912f c34912f = this.f274497v0;
        (c34912f != null ? c34912f : null).f274642d.b();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f274500y0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        C34912f.a aVar = this.f274496u0;
        if (aVar == null) {
            aVar = null;
        }
        d dVar = new d(1, s5(), P.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        String str = this.f274487A0;
        if (str == null) {
            str = null;
        }
        cU.s sVar = this.f274489C0;
        if (sVar == null) {
            sVar = null;
        }
        C34912f c34912fA = aVar.a(view, dVar, str, sVar);
        this.f274497v0 = c34912fA;
        InterfaceC22983P interfaceC22983PA = V0.a(view);
        e eVar = new e(1, s5(), P.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        Set<TV0.d<?, ?>> set = c34912fA.f274645g;
        if (set == null) {
            set = null;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar2 = (TV0.d) it.next();
            if (interfaceC22983PA != null) {
                if (dVar2 instanceof com.avito.android.service_booking_common.blueprints.check_price_list.d) {
                    com.avito.android.service_booking_common.blueprints.check_price_list.d dVar3 = (com.avito.android.service_booking_common.blueprints.check_price_list.d) dVar2;
                    K.a(dVar3.getF276249c(), interfaceC22983PA, C34923q.f274801l, new y(eVar));
                    K.a(dVar3.getF276248b(), interfaceC22983PA, z.f274810l, new A(eVar));
                    K.a(dVar3.getF276250d(), interfaceC22983PA, B.f274429l, new C(eVar));
                } else if (dVar2 instanceof com.avito.android.service_booking_common.blueprints.offer.d) {
                    K.a(((com.avito.android.service_booking_common.blueprints.offer.d) dVar2).getF276462b(), interfaceC22983PA, D.f274431l, new E(eVar));
                } else if (dVar2 instanceof com.avito.android.service_booking_common.blueprints.date.d) {
                    com.avito.android.service_booking_common.blueprints.date.d dVar4 = (com.avito.android.service_booking_common.blueprints.date.d) dVar2;
                    K.a(dVar4.L0(), interfaceC22983PA, F.f274433l, new C34913g(eVar));
                    K.a(dVar4.O(), interfaceC22983PA, C34914h.f274647l, new C34915i(eVar));
                    K.a(dVar4.getF276354f(), interfaceC22983PA, C34916j.f274649l, new C34917k(eVar));
                    K.a(dVar4.getF276355g(), interfaceC22983PA, C34918l.f274651l, new C34919m(c34912fA, eVar));
                } else if (dVar2 instanceof com.avito.android.service_booking_common.blueprints.input.d) {
                    com.avito.android.service_booking_common.blueprints.input.d dVar5 = (com.avito.android.service_booking_common.blueprints.input.d) dVar2;
                    K.a(dVar5.getF276441b(), interfaceC22983PA, C34920n.f274798l, new C34921o(eVar));
                    K.a(dVar5.getF276442c(), interfaceC22983PA, C34922p.f274800l, new com.avito.android.service_booking.mvi.step.r(eVar));
                } else if (dVar2 instanceof com.avito.android.service_booking_common.blueprints.comment.d) {
                    K.a(((com.avito.android.service_booking_common.blueprints.comment.d) dVar2).getF276278b(), interfaceC22983PA, C34924s.f274803l, new t(eVar));
                } else if (dVar2 instanceof com.avito.android.service_booking_common.blueprints.specialist.c) {
                    K.a(((com.avito.android.service_booking_common.blueprints.specialist.c) dVar2).getF276487b(), interfaceC22983PA, u.f274805l, new v(eVar));
                } else if (dVar2 instanceof com.avito.android.service_booking_common.blueprints.any_specialist.c) {
                    K.a(((com.avito.android.service_booking_common.blueprints.any_specialist.c) dVar2).getF276240b(), interfaceC22983PA, w.f274807l, new x(eVar));
                }
            }
        }
        requireActivity().getF21241d().a(getViewLifecycleOwner(), new f());
        C44020b c44020b = this.f274492q0;
        this.f274493r0 = (c44020b != null ? c44020b : null).f414543a.d("srvBookingBduiContentKey", new g());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key.step_id") : null;
        if (string == null) {
            throw new IllegalArgumentException(("key.step_id was not passed to " + this).toString());
        }
        this.f274487A0 = string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("key.advert_id") : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("key.booking_id") : null;
        BookingFlowSource.a aVar = BookingFlowSource.f274125c;
        Bundle arguments4 = getArguments();
        String string4 = arguments4 != null ? arguments4.getString("key.booking_flow_source") : null;
        aVar.getClass();
        BookingFlowSource bookingFlowSource = BookingFlowSource.f274126d;
        if (!kotlin.jvm.internal.L.f(string4, "chat")) {
            bookingFlowSource = BookingFlowSource.f274127e;
        }
        BookingFlowSource bookingFlowSource2 = bookingFlowSource;
        InterfaceC28481c interfaceC28481cB = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b();
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        ServicesBookingScreenMvi servicesBookingScreenMvi = ServicesBookingScreenMvi.f274427d;
        this.f274500y0 = interfaceC28481cB.a(new C28478k(servicesBookingScreenMvi, rVarC, "ServiceBookingScreenMvi"));
        b.a aVarA = com.avito.android.service_booking.mvi.step.di.a.a();
        Context contextRequireContext = requireContext();
        com.avito.android.service_booking.mvi.step.di.c cVar = (com.avito.android.service_booking.mvi.step.di.c) C29972i.a(C29972i.b(this), com.avito.android.service_booking.mvi.step.di.c.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Map<String, Map<String, Set<Object>>> map = ((com.avito.android.service_booking.mvi.e) this.f274495t0.getValue()).getState().getValue().f6007a;
        String str = this.f274487A0;
        if (str == null) {
            str = null;
        }
        Resources resources = getResources();
        C28478k c28478k = new C28478k(servicesBookingScreenMvi, com.avito.android.analytics.screens.s.c(this), "ServiceBookingScreenMvi");
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f274500y0;
        aVarA.a(cVar, interfaceC39417aB, new C31138n0(com.avito.android.lib.beduin_v2.feature.di.K.a(aVarEd, screenPerformanceTracker != null ? screenPerformanceTracker : null, this.f274501z0, cv.c.d(this), null, null, null, 56)), contextRequireContext, str, string2, string3, bookingFlowSource2, resources, c28478k, map, new i()).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext2 = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f274500y0;
        this.f274489C0 = aVarFd.a(contextRequireContext2, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, s5().f274466K, cU.v.f57891a, s5().f274464E);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f274500y0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).a(fA2.b());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final cU.s q5() {
        cU.s sVar = this.f274489C0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f274488B0.getValue();
    }

    public final P s5() {
        return (P) this.f274494s0.getValue();
    }
}
