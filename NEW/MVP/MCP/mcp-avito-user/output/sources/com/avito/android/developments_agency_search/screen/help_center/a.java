package com.avito.android.developments_agency_search.screen.help_center;

import Gw.InterfaceC13923a;
import Gw.c;
import HV.a;
import Ww.C15804b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HelpCenterBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/help_center/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f137954J = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f137955E;

    /* renamed from: F, reason: collision with root package name */
    @Inject
    public l f137956F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f137957G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final j f137958H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final View f137959I;

    /* compiled from: HelpCenterBottomSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.help_center.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4159a extends H implements Y41.l<InterfaceC13923a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13923a interfaceC13923a) {
            ((k) this.receiver).accept(interfaceC13923a);
            return G0.f406611a;
        }
    }

    /* compiled from: HelpCenterBottomSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Gw.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Gw.c cVar) {
            Gw.c cVar2 = cVar;
            a aVar = (a) this.receiver;
            int i12 = a.f137954J;
            aVar.getClass();
            if (cVar2 instanceof c.b) {
                b.a.a(aVar.f137955E, ((c.b) cVar2).f6795a, null, null, 6);
            } else if (cVar2 instanceof c.C0385c) {
                ToastBarState toastBarState = new ToastBarState(((c.C0385c) cVar2).f6796a, null, null, null, null, null, null, 0, false, false, null, null, 4094, null);
                a.C0407a c0407a = HV.a.f7100w;
                Context context = aVar.getContext();
                int iJ2 = C35835l0.j(R.attr.toastBarError, aVar.getContext());
                c0407a.getClass();
                IV.a.e(aVar, toastBarState, a.C0407a.b(iJ2, context));
            } else if (cVar2 instanceof c.a) {
                aVar.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HelpCenterBottomSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Gw.d, G0> {
        @Override // Y41.l
        public final G0 invoke(Gw.d dVar) {
            Gw.d dVar2 = dVar;
            a aVar = (a) this.receiver;
            int i12 = a.f137954J;
            aVar.getClass();
            P2<C15804b> p22 = dVar2.f6799a;
            boolean z12 = p22 instanceof P2.c;
            j jVar = aVar.f137958H;
            if (z12) {
                D6.G(jVar.f137983d, true);
                D6.w(jVar.f137984e);
            } else if ((p22 instanceof P2.b) || (p22 instanceof P2.a)) {
                jVar.a(dVar2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HelpCenterBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/help_center/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_agency_search/screen/help_center/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<k> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final k invoke() {
            l lVar = a.this.f137956F;
            if (lVar == null) {
                lVar = null;
            }
            return (k) lVar.get();
        }
    }

    public a(@Y61.k Context context, @Y61.k HelpCenterArguments helpCenterArguments, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(context, R.style.Re23_BottomSheet_Default);
        this.f137955E = aVar;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new d());
        this.f137957G = interfaceC42726CC;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.help_center_bottom_sheet, (ViewGroup) null);
        this.f137959I = viewInflate;
        com.avito.android.developments_agency_search.screen.help_center.di.a.a().a(helpCenterArguments, (com.avito.android.developments_agency_search.screen.help_center.di.c) C29972i.a(C29972i.b(this), com.avito.android.developments_agency_search.screen.help_center.di.c.class)).a(this);
        this.f137958H = new j(viewInflate, this, new C4159a(1, (k) interfaceC42726CC.getValue(), k.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.arch.mvi.android.f.a((k) interfaceC42726CC.getValue(), this, Lifecycle.State.f46682e, new b(1, this, a.class, "handleEvent", "handleEvent(Lcom/avito/android/developments_agency_search/screen/help_center/mvi/entity/HelpCenterOneTimeEvent;)V", 0), new c(1, this, a.class, "render", "render(Lcom/avito/android/developments_agency_search/screen/help_center/mvi/entity/HelpCenterState;)V", 0));
    }
}
