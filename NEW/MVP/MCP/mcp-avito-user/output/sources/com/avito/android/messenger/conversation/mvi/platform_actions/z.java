package com.avito.android.messenger.conversation.mvi.platform_actions;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.transition.J;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.messenger.conversation.mvi.send.Q0;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformActionsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/z;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/r;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z implements r {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f194054s = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/conversation/mvi/platform_actions/PlatformActionsPresenter$State;", z.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f194055b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.platform_actions.buttons.n f194056c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.platform_actions.buttons.d f194057d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.platform_actions.items_list.a f194058e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, Boolean> f194059f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q0 f194060g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C35971x f194061h = new C35971x();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f194062i = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: j, reason: collision with root package name */
    public final int f194063j;

    /* renamed from: k, reason: collision with root package name */
    public final View f194064k;

    /* renamed from: l, reason: collision with root package name */
    public final View f194065l;

    /* renamed from: m, reason: collision with root package name */
    public final FrameLayout f194066m;

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f194067n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final BottomSheet f194068o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f194069p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f194070q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f194071r;

    public z(@Y61.k Context context, @Y61.k ViewGroup viewGroup, @Y61.k com.avito.android.messenger.conversation.mvi.platform_actions.buttons.n nVar, @Y61.k com.avito.android.messenger.conversation.mvi.platform_actions.buttons.d dVar, @Y61.k com.avito.android.messenger.conversation.mvi.platform_actions.items_list.a aVar, @Y61.k Y41.l lVar, @Y61.k Q0 q02) throws Resources.NotFoundException {
        this.f194055b = viewGroup;
        this.f194056c = nVar;
        this.f194057d = dVar;
        this.f194058e = aVar;
        this.f194059f = lVar;
        this.f194060g = q02;
        float f12 = context.getResources().getDisplayMetrics().density;
        this.f194063j = kotlin.math.b.b(16 * f12);
        this.f194064k = viewGroup.findViewById(R.id.update_proposal);
        this.f194065l = viewGroup.findViewById(R.id.input_separator);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.platform_actions_sticky);
        this.f194066m = frameLayout;
        this.f194067n = (FrameLayout) frameLayout.findViewById(R.id.platform_actions_sticky_content);
        BottomSheet.a aVar2 = BottomSheet.f177825a;
        View viewFindViewById = viewGroup.findViewById(R.id.bottom_sheet);
        aVar2.getClass();
        BottomSheet bottomSheetA = BottomSheet.a.a(viewFindViewById);
        this.f194068o = bottomSheetA;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f194071r = cVar;
        D6.g(bottomSheetA.getF177843b());
        bottomSheetA.l2(false);
        bottomSheetA.u2();
        bottomSheetA.s2(new BottomSheet.c.a(kotlin.math.b.b(60 * f12)));
        this.f194069p = (ViewGroup) bottomSheetA.x2(R.layout.messenger_platform_actions_sheet);
        int integer = viewGroup.getResources().getInteger(android.R.integer.config_mediumAnimTime);
        io.reactivex.rxjava3.core.z<G0> zVar = q02.f194349B;
        B0 b0D0 = q02.f194387t.d0(s.f194045b);
        zVar.getClass();
        cVar.b(io.reactivex.rxjava3.core.z.g0(zVar, b0D0).x(new t(integer, this)).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new u(this)));
        com.jakewharton.rxrelay3.b f177856o = bottomSheetA.getF177856o();
        f177856o.getClass();
        cVar.b(f177856o.D(io.reactivex.rxjava3.internal.functions.a.f401991a).k0(BottomSheet.d.c.class).t0(new v(this)));
    }

    @Override // com.avito.android.mvi.e
    public final f.InterfaceC5732f a(com.avito.android.mvi.e<f.InterfaceC5732f> eVar) {
        C35971x c35971x = this.f194061h;
        kotlin.reflect.n<Object> nVar = f194054s[0];
        return (f.InterfaceC5732f) c35971x.f319122b;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.avito.android.messenger.conversation.mvi.platform_actions.f$f] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        C35971x c35971x = this.f194061h;
        kotlin.reflect.n<Object> nVar = f194054s[0];
        c35971x.f319122b = (f.InterfaceC5732f) obj;
    }

    public final void c(@Y61.l f.InterfaceC5732f interfaceC5732f, @Y61.k f.InterfaceC5732f interfaceC5732f2) {
        boolean z12 = interfaceC5732f2.equals(f.InterfaceC5732f.a.f193899a) ? true : interfaceC5732f2 instanceof f.InterfaceC5732f.b.d;
        View view = this.f194065l;
        ViewGroup viewGroup = this.f194055b;
        BottomSheet bottomSheet = this.f194068o;
        com.avito.android.messenger.conversation.mvi.platform_actions.items_list.a aVar = this.f194058e;
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.d dVar = this.f194057d;
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.n nVar = this.f194056c;
        FrameLayout frameLayout = this.f194066m;
        if (z12) {
            if ((interfaceC5732f instanceof f.InterfaceC5732f.a) || (interfaceC5732f instanceof f.InterfaceC5732f.b.d)) {
                return;
            }
            D6.w(frameLayout);
            nVar.a(interfaceC5732f instanceof f.InterfaceC5732f.b.InterfaceC5735b ? (f.InterfaceC5732f.b.InterfaceC5735b) interfaceC5732f : null);
            D6.g(bottomSheet.getF177843b());
            bottomSheet.k2();
            D6.w(view);
            dVar.d(interfaceC5732f instanceof f.InterfaceC5732f.b.a ? (f.InterfaceC5732f.b.a) interfaceC5732f : null);
            aVar.d(interfaceC5732f instanceof f.InterfaceC5732f.b.c ? (f.InterfaceC5732f.b.c) interfaceC5732f : null);
            D6.C(new x(this), viewGroup);
            return;
        }
        boolean z13 = interfaceC5732f2 instanceof f.InterfaceC5732f.b.a;
        ViewGroup viewGroup2 = this.f194069p;
        if (z13) {
            f.InterfaceC5732f.b.a aVar2 = (f.InterfaceC5732f.b.a) interfaceC5732f2;
            boolean z14 = interfaceC5732f instanceof f.InterfaceC5732f.b.a;
            if (!z14) {
                D6.w(frameLayout);
                nVar.a(interfaceC5732f instanceof f.InterfaceC5732f.b.InterfaceC5735b ? (f.InterfaceC5732f.b.InterfaceC5735b) interfaceC5732f : null);
                aVar.d(interfaceC5732f instanceof f.InterfaceC5732f.b.c ? (f.InterfaceC5732f.b.c) interfaceC5732f : null);
            }
            dVar.c(z14 ? (f.InterfaceC5732f.b.a) interfaceC5732f : null, aVar2, viewGroup2);
            D6.H(view);
            if (!z14) {
                TextView textViewB = dVar.b();
                int iA2 = dVar.a();
                textViewB.setOnClickListener(new ViewOnClickListenerC31873b(this, 4));
                D6.C(new w(iA2, this), viewGroup);
                D6.H(bottomSheet.getF177843b());
                if (bottomSheet.getVisibility().equals(BottomSheet.d.a.f177836a)) {
                    bottomSheet.k2();
                }
            }
            if (z14) {
                f.InterfaceC5732f.b.a aVar3 = (f.InterfaceC5732f.b.a) interfaceC5732f;
                if (!(L.f(aVar3.getF193931a(), aVar2.getF193931a()) && L.f(aVar3.getTitle(), aVar2.getTitle()) && L.f(aVar3.getF193907d(), aVar2.getF193907d()) && L.f(aVar3.b(), aVar2.b())) && bottomSheet.getVisibility().equals(BottomSheet.d.c.f177838a)) {
                    bottomSheet.k2();
                    return;
                }
                return;
            }
            return;
        }
        if (interfaceC5732f2 instanceof f.InterfaceC5732f.b.InterfaceC5735b) {
            f.InterfaceC5732f.b.InterfaceC5735b interfaceC5735b = (f.InterfaceC5732f.b.InterfaceC5735b) interfaceC5732f2;
            boolean z15 = interfaceC5732f instanceof f.InterfaceC5732f.b.InterfaceC5735b;
            if (!z15) {
                D6.g(bottomSheet.getF177843b());
                bottomSheet.k2();
                D6.w(view);
                dVar.d(interfaceC5732f instanceof f.InterfaceC5732f.b.a ? (f.InterfaceC5732f.b.a) interfaceC5732f : null);
                aVar.d(interfaceC5732f instanceof f.InterfaceC5732f.b.c ? (f.InterfaceC5732f.b.c) interfaceC5732f : null);
                D6.C(new y(this), viewGroup);
            }
            nVar.b(z15 ? (f.InterfaceC5732f.b.InterfaceC5735b) interfaceC5732f : null, interfaceC5735b, this.f194067n);
            viewGroup.setLayoutTransition(new LayoutTransition());
            Q5 q52 = new Q5(new J());
            q52.b(frameLayout);
            Q.a(viewGroup, q52.c());
            D6.H(frameLayout);
            return;
        }
        if (interfaceC5732f2 instanceof f.InterfaceC5732f.b.c) {
            f.InterfaceC5732f.b.c cVar = (f.InterfaceC5732f.b.c) interfaceC5732f2;
            boolean z16 = interfaceC5732f instanceof f.InterfaceC5732f.b.c;
            if (!z16) {
                D6.w(frameLayout);
                nVar.a(interfaceC5732f instanceof f.InterfaceC5732f.b.InterfaceC5735b ? (f.InterfaceC5732f.b.InterfaceC5735b) interfaceC5732f : null);
                dVar.d(interfaceC5732f instanceof f.InterfaceC5732f.b.a ? (f.InterfaceC5732f.b.a) interfaceC5732f : null);
            }
            aVar.c(z16 ? (f.InterfaceC5732f.b.c) interfaceC5732f : null, cVar, viewGroup2, viewGroup.getHeight() - this.f194060g.f194385r);
            D6.H(view);
            if (z16) {
                return;
            }
            TextView textViewB2 = aVar.b();
            int iA3 = aVar.a();
            textViewB2.setOnClickListener(new ViewOnClickListenerC31873b(this, 4));
            D6.C(new w(iA3, this), viewGroup);
            D6.H(bottomSheet.getF177843b());
            if (bottomSheet.getVisibility().equals(BottomSheet.d.a.f177836a)) {
                bottomSheet.k2();
            }
        }
    }

    @Override // com.avito.android.mvi.e
    public final /* bridge */ /* synthetic */ void d(com.avito.android.mvi.e<f.InterfaceC5732f> eVar, f.InterfaceC5732f interfaceC5732f, f.InterfaceC5732f interfaceC5732f2) {
        c(interfaceC5732f, interfaceC5732f2);
    }
}
