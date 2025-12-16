package com.avito.android.widget_filters.ui;

import Cd.C13243a;
import NP0.q;
import NP0.r;
import NP0.s;
import OP0.a;
import UP0.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import com.avito.android.widget_filters.WidgetFiltersOpenParams;
import com.avito.android.widget_filters.WidgetFiltersResult;
import com.avito.android.widget_filters.analytics.WidgetFiltersScreen;
import com.avito.android.widget_filters.mvi.entity.LoadingType;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersOneTimeEvent;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersToolbarViewState;
import com.avito.android.widget_filters.mvi.entity.a;
import com.avito.android.widget_filters.ui.WidgetFiltersFragment;
import com.avito.android.widget_filters.ui.WidgetFiltersLayoutManager;
import com.avito.android.widget_filters.ui.j;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import oW.InterfaceC44697a;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: WidgetFiltersFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/widget_filters/ui/WidgetFiltersFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WidgetFiltersFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f330270x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f330271y0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public KP0.e f330272n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f330273o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f330274p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f330275q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.widget_filters_shared.a f330276r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f330277s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.widget_filters.utils.b f330278t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f330279u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f330280v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f330281w0;

    /* compiled from: WidgetFiltersFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/widget_filters/ui/WidgetFiltersFragment$a;", "", "<init>", "()V", "", "TOAST_BOTTOM_MARGIN", "I", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WidgetFiltersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f330282a;

        static {
            int[] iArr = new int[WidgetFiltersToolbarViewState.NavigationButtonType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WidgetFiltersToolbarViewState.NavigationButtonType navigationButtonType = WidgetFiltersToolbarViewState.NavigationButtonType.f330070b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[WidgetFiltersFooterViewState.ResetButtonType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WidgetFiltersFooterViewState.ResetButtonType resetButtonType = WidgetFiltersFooterViewState.ResetButtonType.f330001b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[WidgetFiltersFooterViewState.ActionButtonType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                WidgetFiltersFooterViewState.ActionButtonType actionButtonType = WidgetFiltersFooterViewState.ActionButtonType.f329996b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                WidgetFiltersFooterViewState.ActionButtonType actionButtonType2 = WidgetFiltersFooterViewState.ActionButtonType.f329996b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[WidgetFiltersOneTimeEvent.ShowToast.ToastAnchorType.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                WidgetFiltersOneTimeEvent.ShowToast.ToastAnchorType toastAnchorType = WidgetFiltersOneTimeEvent.ShowToast.ToastAnchorType.f330053b;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr5 = new int[LoadingType.values().length];
            try {
                iArr5[1] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            f330282a = iArr5;
        }
    }

    /* compiled from: WidgetFiltersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<WidgetFiltersOneTimeEvent, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(@Y61.k final WidgetFiltersOneTimeEvent widgetFiltersOneTimeEvent) {
            Q q12;
            r.a aVar;
            View view;
            WidgetFiltersFragment widgetFiltersFragment = (WidgetFiltersFragment) this.receiver;
            a aVar2 = WidgetFiltersFragment.f330270x0;
            widgetFiltersFragment.getClass();
            if (widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.a) {
                if (!((WidgetFiltersOneTimeEvent.a) widgetFiltersOneTimeEvent).f330057a || (view = widgetFiltersFragment.getView()) == null) {
                    return;
                }
                view.clearFocus();
                return;
            }
            if (widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.e) {
                ((WidgetFiltersOneTimeEvent.e) widgetFiltersOneTimeEvent).getClass();
                View view2 = widgetFiltersFragment.getView();
                if (view2 != null) {
                    K2.d(view2, true);
                    return;
                }
                return;
            }
            if (widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.c) {
                DeepLink deepLink = ((WidgetFiltersOneTimeEvent.c) widgetFiltersOneTimeEvent).f330059a;
                if (deepLink != null) {
                    widgetFiltersFragment.requireActivity().setResult(-1, new Intent().putExtra("widget_filters_result_key", WidgetFiltersResult.SuccessRedirect.f329695b));
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = widgetFiltersFragment.f330277s0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    b.a.a(aVar3, deepLink, null, null, 6);
                    return;
                }
                return;
            }
            if (widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.d) {
                WidgetFiltersOneTimeEvent.d dVar = (WidgetFiltersOneTimeEvent.d) widgetFiltersOneTimeEvent;
                widgetFiltersFragment.requireActivity().setResult(-1, new Intent().putExtra("widget_filters_result_key", new WidgetFiltersResult.ClarifySearch(dVar.f330061b, dVar.f330060a, true)));
                widgetFiltersFragment.requireActivity().finish();
                return;
            }
            if (widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.b) {
                widgetFiltersFragment.requireActivity().finish();
                return;
            }
            if (!(widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.i)) {
                if (widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.g) {
                    com.avito.android.widget_filters_shared.a aVar4 = widgetFiltersFragment.f330276r0;
                    (aVar4 != null ? aVar4 : null).accept(a.b.f16374a);
                    return;
                }
                if (widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.ShowToast) {
                    WidgetFiltersOneTimeEvent.ShowToast showToast = (WidgetFiltersOneTimeEvent.ShowToast) widgetFiltersOneTimeEvent;
                    int iOrdinal = showToast.f330052c.ordinal();
                    PrintableText printableText = showToast.f330050a;
                    if (iOrdinal == 0) {
                        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, widgetFiltersFragment.q5().f330542b, printableText, null, null, null, showToast.f330051b, 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
                        return;
                    } else {
                        if (iOrdinal != 1) {
                            return;
                        }
                        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, widgetFiltersFragment.q5().f330541a, printableText, null, null, null, showToast.f330051b, 0, ToastBarPosition.f181048f, Integer.valueOf(y6.b(12) + widgetFiltersFragment.q5().f330552l.getMeasuredHeight()), false, false, null, null, 3886);
                        return;
                    }
                }
                if (!(widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.f)) {
                    if (widgetFiltersOneTimeEvent instanceof WidgetFiltersOneTimeEvent.h) {
                        final RecyclerView recyclerView = widgetFiltersFragment.q5().f330546f;
                        recyclerView.post(new Runnable() { // from class: com.avito.android.widget_filters.ui.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                WidgetFiltersFragment.a aVar5 = WidgetFiltersFragment.f330270x0;
                                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                                WidgetFiltersLayoutManager widgetFiltersLayoutManager = layoutManager instanceof WidgetFiltersLayoutManager ? (WidgetFiltersLayoutManager) layoutManager : null;
                                if (widgetFiltersLayoutManager != null) {
                                    int i12 = ((WidgetFiltersOneTimeEvent.h) widgetFiltersOneTimeEvent).f330064a;
                                    WidgetFiltersLayoutManager.a aVar6 = widgetFiltersLayoutManager.f330301H;
                                    aVar6.f53878a = i12;
                                    widgetFiltersLayoutManager.x1(aVar6);
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                Input input = (Input) widgetFiltersFragment.q5().f330546f.findViewById(R.id.location_widget_search_input);
                if (input != null) {
                    input.requestFocus();
                    input.v();
                    return;
                }
                return;
            }
            q qVar = ((WidgetFiltersOneTimeEvent.i) widgetFiltersOneTimeEvent).f330065a;
            if (qVar instanceof s) {
                s sVar = (s) qVar;
                NP0.r rVar = sVar.f11514a;
                if (L.f(rVar, r.a.f11512a)) {
                    View viewFindViewById = widgetFiltersFragment.q5().f330546f.findViewById(R.id.fast_recent_searches_container);
                    if (viewFindViewById == null || !D6.y(viewFindViewById)) {
                        viewFindViewById = null;
                    }
                    com.avito.android.widget_filters.utils.b bVar = widgetFiltersFragment.f330278t0;
                    if (bVar == null) {
                        bVar = null;
                    }
                    q12 = new Q(viewFindViewById, new j.a(-bVar.getF330569k()));
                } else {
                    if (!L.f(rVar, r.b.f11513a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.avito.android.widget_filters.ui.k kVarQ5 = widgetFiltersFragment.q5();
                    com.avito.android.widget_filters.utils.b bVar2 = widgetFiltersFragment.f330278t0;
                    if (bVar2 == null) {
                        bVar2 = null;
                    }
                    q12 = new Q(kVarQ5.f330554n, new j.b(bVar2.getF330568j()));
                }
                View view3 = (View) q12.f406619b;
                com.avito.android.widget_filters.ui.j jVar = (com.avito.android.widget_filters.ui.j) q12.f406620c;
                if (view3 != null) {
                    C47313c c47313c = widgetFiltersFragment.f330281w0;
                    kotlin.reflect.n<Object> nVar = WidgetFiltersFragment.f330271y0[2];
                    final com.avito.android.widget_filters.ui.i iVar = (com.avito.android.widget_filters.ui.i) c47313c.a();
                    final com.avito.android.widget_filters.ui.c cVar = new com.avito.android.widget_filters.ui.c(widgetFiltersFragment, sVar);
                    String str = sVar.f11515b;
                    String str2 = sVar.f11516c;
                    if (str == null && str2 == null) {
                        return;
                    }
                    com.avito.android.lib.design.tooltip.k kVar = iVar.f330318a;
                    if (kVar != null) {
                        kVar.dismiss();
                    }
                    com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(view3.getContext(), 0, 0, 6, null);
                    if (jVar instanceof j.b) {
                        r.d dVar2 = new r.d(null, 1, null);
                        dVar2.m(((j.b) jVar).f330540a);
                        aVar = dVar2;
                    } else {
                        if (!(jVar instanceof j.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r.a aVar5 = new r.a(null, 1, null);
                        aVar5.j(((j.a) jVar).f330539a);
                        aVar = aVar5;
                    }
                    kVar2.f181224j = aVar;
                    int i12 = jVar.a() ? -2 : -1;
                    int i13 = kVar2.f181229o;
                    kVar2.f181228n = i12;
                    kVar2.f181229o = i13;
                    kVar2.f181225k = true;
                    p.a(kVar2, new com.avito.android.widget_filters.ui.h(str, str2, sVar.f11517d, iVar, cVar));
                    kVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.avito.android.widget_filters.ui.f
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            i iVar2 = iVar;
                            Y41.a aVar6 = cVar;
                            com.avito.android.lib.design.tooltip.k kVar3 = iVar2.f330318a;
                            if (kVar3 != null) {
                                kVar3.dismiss();
                            }
                            ((c) aVar6).invoke();
                            iVar2.f330318a = null;
                        }
                    });
                    iVar.f330318a = kVar2;
                    kVar2.f(view3);
                }
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(WidgetFiltersOneTimeEvent widgetFiltersOneTimeEvent) {
            f(widgetFiltersOneTimeEvent);
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/widget_filters/mvi/entity/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<com.avito.android.widget_filters.mvi.entity.c, G0> {
        public d() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(com.avito.android.widget_filters.mvi.entity.c cVar) {
            Object obj;
            com.avito.android.widget_filters.mvi.entity.c cVar2 = cVar;
            a aVar = WidgetFiltersFragment.f330270x0;
            WidgetFiltersFragment widgetFiltersFragment = WidgetFiltersFragment.this;
            com.avito.android.widget_filters.ui.k kVarQ5 = widgetFiltersFragment.q5();
            WidgetFiltersToolbarViewState widgetFiltersToolbarViewState = cVar2.f330108o;
            I5.a(kVarQ5.f330543c, widgetFiltersToolbarViewState.f330068a, false);
            WidgetFiltersToolbarViewState.b bVar = widgetFiltersToolbarViewState.f330069b;
            int i12 = bVar.f330074a;
            Toolbar toolbar = kVarQ5.f330542b;
            toolbar.setNavigationIcon(i12);
            int iOrdinal = bVar.f330075b.ordinal();
            if (iOrdinal == 0) {
                obj = a.d.f12242a;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = a.f.f12244a;
            }
            toolbar.setNavigationOnClickListener(new com.avito.android.widget_filters.ui.g(1, widgetFiltersFragment, obj));
            com.avito.android.widget_filters.mvi.entity.a aVar2 = cVar2.f330110q;
            if (aVar2 instanceof a.b) {
                a.b bVar2 = (a.b) aVar2;
                com.avito.android.widget_filters.ui.k kVarQ52 = widgetFiltersFragment.q5();
                RecyclerView recyclerView = kVarQ52.f330546f;
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                WidgetFiltersLayoutManager widgetFiltersLayoutManager = layoutManager instanceof WidgetFiltersLayoutManager ? (WidgetFiltersLayoutManager) layoutManager : null;
                if (widgetFiltersLayoutManager != null) {
                    widgetFiltersLayoutManager.f330300G = bVar2.f330079b;
                }
                D6.H(recyclerView);
                D6.w(kVarQ52.f330547g);
                D6.w(kVarQ52.f330544d);
                D6.w(kVarQ52.f330545e);
                com.avito.konveyor.adapter.d dVar = widgetFiltersFragment.f330275q0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(bVar2.f330080c, null);
            } else if (aVar2 instanceof a.e) {
                com.avito.android.widget_filters.ui.k kVarQ53 = widgetFiltersFragment.q5();
                if (b.f330282a[((a.e) aVar2).f330086b.ordinal()] == 1) {
                    D6.H(kVarQ53.f330544d);
                } else {
                    D6.H(kVarQ53.f330545e);
                    D6.w(kVarQ53.f330546f);
                    D6.w(kVarQ53.f330547g);
                }
            } else if (aVar2 instanceof a.d) {
                a.d dVar2 = (a.d) aVar2;
                com.avito.android.widget_filters.ui.k kVarQ54 = widgetFiltersFragment.q5();
                D6.w(kVarQ54.f330546f);
                kVarQ54.f330548h.setImageDrawable(C35835l0.h(dVar2.f330083b, widgetFiltersFragment.requireContext()));
                I5.a(kVarQ54.f330549i, dVar2.f330084c.k0(widgetFiltersFragment.requireContext()), false);
                I5.a(kVarQ54.f330550j, dVar2.f330085d.k0(widgetFiltersFragment.requireContext()), false);
                D6.H(kVarQ54.f330547g);
                D6.w(kVarQ54.f330545e);
                D6.w(kVarQ54.f330544d);
            } else if (aVar2 instanceof a.c) {
                a.c cVar3 = (a.c) aVar2;
                com.avito.android.widget_filters.ui.k kVarQ55 = widgetFiltersFragment.q5();
                D6.w(kVarQ55.f330546f);
                Context contextRequireContext = widgetFiltersFragment.requireContext();
                cVar3.getClass();
                kVarQ55.f330548h.setImageDrawable(C35835l0.h(R.attr.img_unknownError, contextRequireContext));
                I5.a(kVarQ55.f330549i, cVar3.f330081b.k0(widgetFiltersFragment.requireContext()), false);
                I5.a(kVarQ55.f330550j, cVar3.f330082c.k0(widgetFiltersFragment.requireContext()), false);
                D6.H(kVarQ55.f330547g);
                D6.w(kVarQ55.f330545e);
                D6.w(kVarQ55.f330544d);
            }
            com.avito.android.widget_filters.ui.k kVarQ56 = widgetFiltersFragment.q5();
            WidgetFiltersFooterViewState widgetFiltersFooterViewState = cVar2.f330109p;
            String str = widgetFiltersFooterViewState.f329989c;
            Button button = kVarQ56.f330555o;
            com.avito.android.lib.design.button.b.a(button, str, false);
            boolean z12 = widgetFiltersFooterViewState.f329994h;
            D6.G(button, z12);
            boolean z13 = widgetFiltersFooterViewState.f329995i;
            button.setLoading(z13);
            boolean z14 = !z13;
            button.setClickable(z14);
            int iOrdinal2 = widgetFiltersFooterViewState.f329988b.ordinal();
            if (iOrdinal2 == 0) {
                button.setOnClickListener(new L91.q(14));
            } else if (iOrdinal2 == 1) {
                button.setOnClickListener(new com.avito.android.widget_filters.ui.b(widgetFiltersFragment, 1));
            }
            Button button2 = kVarQ56.f330556p;
            button2.setLoading(z13);
            button2.setClickable(z14);
            int iOrdinal3 = widgetFiltersFooterViewState.f329987a.ordinal();
            if (iOrdinal3 != 0) {
                String str2 = widgetFiltersFooterViewState.f329991e;
                if (iOrdinal3 == 1) {
                    com.avito.android.lib.design.button.b.a(button2, str2, false);
                    button2.setOnClickListener(new com.avito.android.widget_filters.ui.b(widgetFiltersFragment, 3));
                } else if (iOrdinal3 == 2) {
                    com.avito.android.lib.design.button.b.a(button2, str2, false);
                    button2.setOnClickListener(new com.avito.android.widget_filters.ui.b(widgetFiltersFragment, 4));
                }
            } else {
                com.avito.android.lib.design.button.b.a(button2, widgetFiltersFooterViewState.f329990d, false);
                button2.setOnClickListener(new com.avito.android.widget_filters.ui.b(widgetFiltersFragment, 2));
            }
            com.avito.android.widget_filters.ui.k kVarQ57 = widgetFiltersFragment.q5();
            WidgetFiltersFooterViewState.b bVar3 = widgetFiltersFooterViewState.f329992f;
            boolean z15 = bVar3 instanceof WidgetFiltersFooterViewState.b.a;
            TextView textView = kVarQ57.f330553m;
            if (z15) {
                D6.w(textView);
                WidgetFiltersFooterViewState.b.a aVar3 = (WidgetFiltersFooterViewState.b.a) bVar3;
                WidgetFiltersFragment.s5(kVarQ57, widgetFiltersFragment, aVar3.f330005a, aVar3.f330006b);
            } else if (bVar3 instanceof WidgetFiltersFooterViewState.b.C10251b) {
                WidgetFiltersFooterViewState.b.C10251b c10251b = (WidgetFiltersFooterViewState.b.C10251b) bVar3;
                textView.setText(c10251b.f330009c.k0(widgetFiltersFragment.requireContext()));
                D6.G(textView, true);
                WidgetFiltersFragment.s5(kVarQ57, widgetFiltersFragment, c10251b.f330007a, c10251b.f330008b);
            } else {
                boolean z16 = bVar3 instanceof WidgetFiltersFooterViewState.b.c;
                Chips chips = kVarQ57.f330554n;
                if (z16) {
                    textView.setText(((WidgetFiltersFooterViewState.b.c) bVar3).f330010a.k0(widgetFiltersFragment.requireContext()));
                    D6.G(textView, true);
                    D6.w(chips);
                } else if (L.f(bVar3, WidgetFiltersFooterViewState.b.d.f330011a)) {
                    D6.w(textView);
                    D6.w(chips);
                }
            }
            D6.G(kVarQ56.f330557q, z12);
            D6.G(kVarQ56.f330552l, widgetFiltersFooterViewState.f329993g);
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.ui.WidgetFiltersFragment$onCreateView$3", f = "WidgetFiltersFragment.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330284q;

        /* compiled from: WidgetFiltersFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.widget_filters.ui.WidgetFiltersFragment$onCreateView$3$1", f = "WidgetFiltersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f330286q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ WidgetFiltersFragment f330287r;

            /* compiled from: WidgetFiltersFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/Date;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.widget_filters.ui.WidgetFiltersFragment$onCreateView$3$1$1", f = "WidgetFiltersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.widget_filters.ui.WidgetFiltersFragment$e$a$a, reason: collision with other inner class name */
            public static final class C10257a extends SuspendLambda implements Y41.p<Date, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f330288q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ WidgetFiltersFragment f330289r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10257a(WidgetFiltersFragment widgetFiltersFragment, Continuation<? super C10257a> continuation) {
                    super(2, continuation);
                    this.f330289r = widgetFiltersFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C10257a c10257a = new C10257a(this.f330289r, continuation);
                    c10257a.f330288q = obj;
                    return c10257a;
                }

                @Override // Y41.p
                public final Object invoke(Date date, Continuation<? super G0> continuation) {
                    return ((C10257a) create(date, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    Date date = (Date) this.f330288q;
                    a aVar = WidgetFiltersFragment.f330270x0;
                    this.f330289r.r5().accept(new a.C14638b(date));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WidgetFiltersFragment widgetFiltersFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f330287r = widgetFiltersFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f330287r, continuation);
                aVar.f330286q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f330286q;
                WidgetFiltersFragment widgetFiltersFragment = this.f330287r;
                com.avito.android.widget_filters_shared.a aVar = widgetFiltersFragment.f330276r0;
                if (aVar == null) {
                    aVar = null;
                }
                C43175k.K(new C43197r1(new C10257a(widgetFiltersFragment, null), aVar.getF330572O()), t12);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return WidgetFiltersFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f330284q;
            if (i12 == 0) {
                C42729a0.b(obj);
                WidgetFiltersFragment widgetFiltersFragment = WidgetFiltersFragment.this;
                InterfaceC22983P viewLifecycleOwner = widgetFiltersFragment.getViewLifecycleOwner();
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(widgetFiltersFragment, null);
                this.f330284q = 1;
                if (C23056p0.b(viewLifecycleOwner, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.ui.WidgetFiltersFragment$onViewCreated$1", f = "WidgetFiltersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f330290q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = WidgetFiltersFragment.this.new f(continuation);
            fVar.f330290q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            return ((f) create(bool, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Boolean bool = (Boolean) this.f330290q;
            a aVar = WidgetFiltersFragment.f330270x0;
            WidgetFiltersFragment.this.r5().accept(new a.l(bool.booleanValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chip", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.p<com.avito.android.lib.design.chips.h, Boolean, G0> {
        public g() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
            com.avito.android.lib.design.chips.h hVar2 = hVar;
            bool.getClass();
            if ((hVar2 instanceof ItemChipable ? (ItemChipable) hVar2 : null) != null) {
                a aVar = WidgetFiltersFragment.f330270x0;
                WidgetFiltersFragment.this.r5().accept(new a.g(((ItemChipable) hVar2).f178762b));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOP0/a;", "it", "Lkotlin/G0;", "invoke", "(LOP0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<OP0.a, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(OP0.a aVar) {
            a aVar2 = WidgetFiltersFragment.f330270x0;
            WidgetFiltersFragment.this.r5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f330294l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f330294l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f330294l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return WidgetFiltersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f330296l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f330296l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f330296l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f330297l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f330297l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f330297l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f330298l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f330298l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f330298l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: WidgetFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKP0/d;", "kotlin.jvm.PlatformType", "invoke", "()LKP0/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<KP0.d> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final KP0.d invoke() {
            KP0.e eVar = WidgetFiltersFragment.this.f330272n0;
            if (eVar == null) {
                eVar = null;
            }
            return (KP0.d) eVar.get();
        }
    }

    static {
        Y y12 = new Y(WidgetFiltersFragment.class, "openParams", "getOpenParams()Lcom/avito/android/widget_filters/WidgetFiltersOpenParams;", 0);
        n0 n0Var = m0.f406844a;
        f330271y0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(WidgetFiltersFragment.class, "viewHolder", "getViewHolder()Lcom/avito/android/widget_filters/ui/WidgetFiltersViewHolder;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(WidgetFiltersFragment.class, "tooltipHelper", "getTooltipHelper()Lcom/avito/android/widget_filters/ui/WidgetFiltersTooltipHelper;", 0, n0Var)};
        f330270x0 = new a(null);
    }

    public WidgetFiltersFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f330273o0 = new O0(m0.f406844a.b(KP0.d.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f330279u0 = new C35968w3(this);
        this.f330280v0 = new C47313c(null, 1, null);
        this.f330281w0 = new C47313c(null, 1, null);
    }

    public static final void s5(com.avito.android.widget_filters.ui.k kVar, WidgetFiltersFragment widgetFiltersFragment, List<ItemChipable> list, Integer num) {
        Chips chips = kVar.f330554n;
        D6.G(chips, true);
        com.avito.android.widget_filters.utils.b bVar = widgetFiltersFragment.f330278t0;
        if (bVar == null) {
            bVar = null;
        }
        chips.setState(new ChipsState(bVar.getF330568j(), ChipsState.DisplayType.f178758d, null, list, widgetFiltersFragment.new g()));
        ItemChipable itemChipable = (ItemChipable) C42745f0.K(num.intValue(), list);
        if (itemChipable != null) {
            chips.N0(itemChipable);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f330274p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f330274p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, r5(), new c(1, this, WidgetFiltersFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;)V", 0), new d());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new e(null), 3);
        return layoutInflater.inflate(R.layout.widget_filters_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        r5().accept(new a.x(requireContext().getResources().getConfiguration().orientation == 2));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.widget_filters.ui.k kVar = new com.avito.android.widget_filters.ui.k(view);
        C47313c c47313c = this.f330280v0;
        kotlin.reflect.n<Object>[] nVarArr = f330271y0;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        c47313c.b(this, kVar);
        com.avito.android.widget_filters.ui.i iVar = new com.avito.android.widget_filters.ui.i();
        C47313c c47313c2 = this.f330281w0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[2];
        c47313c2.b(this, iVar);
        C43175k.K(new C43197r1(new f(null), y.a(K2.h(requireActivity()))), C22984Q.a(getViewLifecycleOwner()));
        com.avito.android.widget_filters.ui.k kVarQ5 = q5();
        com.avito.konveyor.adapter.d dVar = this.f330275q0;
        if (dVar == null) {
            dVar = null;
        }
        RecyclerView recyclerView = kVarQ5.f330546f;
        recyclerView.setAdapter(dVar);
        recyclerView.setLayoutManager(new WidgetFiltersLayoutManager(recyclerView.getContext()));
        com.avito.android.widget_filters.utils.b bVar = this.f330278t0;
        if (bVar == null) {
            bVar = null;
        }
        int f330565g = bVar.getF330565g();
        com.avito.android.widget_filters.utils.b bVar2 = this.f330278t0;
        if (bVar2 == null) {
            bVar2 = null;
        }
        int f330566h = bVar2.getF330566h();
        com.avito.android.widget_filters.utils.b bVar3 = this.f330278t0;
        if (bVar3 == null) {
            bVar3 = null;
        }
        int f330567i = bVar3.getF330567i();
        com.avito.android.widget_filters.utils.b bVar4 = this.f330278t0;
        if (bVar4 == null) {
            bVar4 = null;
        }
        recyclerView.l(new com.avito.android.widget_filters.ui.items.f(f330565g, f330566h, f330567i, bVar4.getF330568j()), -1);
        kVarQ5.f330551k.setOnClickListener(new com.avito.android.widget_filters.ui.b(this, 0));
        g.b bVar5 = com.avito.android.lib.design.chips.ui.g.f178794f;
        Context context = view.getContext();
        int iJ2 = C35835l0.j(R.attr.chipsOutlinedSmall, view.getContext());
        bVar5.getClass();
        kVarQ5.f330554n.setStyle(g.b.c(iJ2, context));
        ScreenPerformanceTracker screenPerformanceTracker = this.f330274p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(WidgetFiltersScreen.f329703d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        com.avito.android.widget_filters.di.a.a().a(c28478k, (WidgetFiltersOpenParams) this.f330279u0.getValue(this, f330271y0[0]), getChildFragmentManager(), requireActivity(), new h(), (com.avito.android.widget_filters.di.c) C29972i.a(C29972i.b(this), com.avito.android.widget_filters.di.c.class), (InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f330274p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.widget_filters.ui.k q5() {
        C47313c c47313c = this.f330280v0;
        kotlin.reflect.n<Object> nVar = f330271y0[1];
        return (com.avito.android.widget_filters.ui.k) c47313c.a();
    }

    public final KP0.d r5() {
        return (KP0.d) this.f330273o0.getValue();
    }
}
