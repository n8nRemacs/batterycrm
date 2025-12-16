package com.avito.android.trx_promo_impl;

import Cd.C13243a;
import RF0.e;
import ZF0.a;
import ZF0.c;
import ZF0.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_impl.TrxPromoFragment;
import com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator;
import com.avito.android.trx_promo_impl.date_picker.TrxPromoDatePickerFragment;
import com.avito.android.trx_promo_impl.di.e;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import cv.InterfaceC39417a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import v50.C49166b;
import w50.InterfaceC49447a;
import z1.AbstractC50339a;

/* compiled from: TrxPromoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_impl/TrxPromoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final a f303863H0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public ViewGroup f303864A0;

    /* renamed from: B0, reason: collision with root package name */
    public Button f303865B0;

    /* renamed from: C0, reason: collision with root package name */
    public Button f303866C0;

    /* renamed from: D0, reason: collision with root package name */
    public TextView f303867D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f303868E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final Y41.l<RF0.e, G0> f303869F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final d f303870G0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.trx_promo_impl.m f303871n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f303872o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f303873p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f303874q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.trx_promo_impl.item.commission.d f303875r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f303876s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f303877t0;

    /* renamed from: u0, reason: collision with root package name */
    public bG0.f f303878u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f303879v0;

    /* renamed from: w0, reason: collision with root package name */
    public Toolbar f303880w0;

    /* renamed from: x0, reason: collision with root package name */
    public ProgressBarRe23 f303881x0;

    /* renamed from: y0, reason: collision with root package name */
    public Button f303882y0;

    /* renamed from: z0, reason: collision with root package name */
    public RecyclerView f303883z0;

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/trx_promo_impl/TrxPromoFragment$a;", "", "<init>", "()V", "", "KEY_CLOSABLE", "Ljava/lang/String;", "KEY_TRX_PROMO_CONTEXT", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRF0/e;", "option", "Lkotlin/G0;", "invoke", "(LRF0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<RF0.e, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RF0.e eVar) {
            DeepLink deepLink;
            RF0.e eVar2 = eVar;
            boolean z12 = eVar2 instanceof e.a;
            TrxPromoFragment trxPromoFragment = TrxPromoFragment.this;
            if (z12) {
                a aVar = TrxPromoFragment.f303863H0;
                com.avito.android.trx_promo_impl.l lVarQ5 = trxPromoFragment.q5();
                com.avito.android.trx_promo_impl.b.f303905a.getClass();
                lVarQ5.accept(new a.d(com.avito.android.trx_promo_impl.b.f303906b));
            } else if (eVar2 instanceof e.b) {
                a aVar2 = TrxPromoFragment.f303863H0;
                trxPromoFragment.q5().accept(a.g.f20027a);
            } else if ((eVar2 instanceof e.c) && (deepLink = ((e.c) eVar2).f14230f) != null) {
                ((c) trxPromoFragment.f303868E0).invoke(deepLink);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<DeepLink, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TrxPromoFragment.f303863H0;
            TrxPromoFragment.this.q5().accept(new a.e(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/trx_promo_impl/TrxPromoFragment$d", "Landroidx/activity/x;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends x {
        public d() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = TrxPromoFragment.f303863H0;
            TrxPromoFragment.this.q5().accept(a.C1432a.f20021a);
        }
    }

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<ZF0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(ZF0.c cVar) {
            ZF0.c cVar2 = cVar;
            TrxPromoFragment trxPromoFragment = (TrxPromoFragment) this.receiver;
            a aVar = TrxPromoFragment.f303863H0;
            trxPromoFragment.getClass();
            if (cVar2 instanceof c.C1433c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = trxPromoFragment.f303876s0;
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = aVar2 != null ? aVar2 : null;
                c.C1433c c1433c = (c.C1433c) cVar2;
                Q q12 = new Q("trx_promo_key_configure_apply_commission", c1433c.f20036b);
                String str = c1433c.f20037c;
                Q q13 = new Q("trx_promo_key_configure_apply_date_from", str);
                String str2 = c1433c.f20038d;
                aVar3.r6(C22777e.b(q12, q13, new Q("trx_promo_key_configure_apply_date_to", str2), new Q("trx_promo_key_date_range_picker_date_from", str), new Q("trx_promo_key_date_range_picker_date_to", str2)), c1433c.f20035a, "trx_promo_request_key");
            } else if (cVar2 instanceof c.a) {
                d dVar = trxPromoFragment.f303870G0;
                dVar.d(false);
                ActivityC22955m activityC22955mL1 = trxPromoFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
                dVar.d(true);
            } else if (cVar2 instanceof c.b) {
                ((InterfaceC49447a) trxPromoFragment.requireActivity()).r1();
            } else if (cVar2 instanceof c.d) {
                TrxPromoDatePickerFragment.a aVar4 = TrxPromoDatePickerFragment.f303944m0;
                RF0.f fVar = ((c.d) cVar2).f20039a;
                String str3 = fVar.f14232a;
                aVar4.getClass();
                Bundle bundleB = C22777e.b(new Q("trx_promo_screen_title", str3), new Q("trx_promo_button_title", fVar.f14233b), new Q("trx_promo_start_date", fVar.f14234c), new Q("trx_promo_predefined_selected_date", fVar.f14235d), new Q("trx_promo_validators", fVar.f14236e.toArray(new TrxPromoDateValidator[0])));
                TrxPromoDatePickerFragment trxPromoDatePickerFragment = new TrxPromoDatePickerFragment();
                trxPromoDatePickerFragment.setArguments(bundleB);
                trxPromoDatePickerFragment.show(trxPromoFragment.getParentFragmentManager(), (String) null);
            } else if (cVar2 instanceof c.e) {
                com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(z.k(null));
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar3, trxPromoFragment, printableTextF, null, null, f.c.a.a(null, null), 0, ToastBarPosition.f181046d, 942);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZF0/d;", "it", "Lkotlin/G0;", "invoke", "(LZF0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<ZF0.d, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ZF0.d dVar) {
            Float progress;
            int i12 = 20;
            ZF0.d dVar2 = dVar;
            a aVar = TrxPromoFragment.f303863H0;
            TrxPromoFragment trxPromoFragment = TrxPromoFragment.this;
            com.avito.android.trx_promo_impl.e eVar = new com.avito.android.trx_promo_impl.e(1, trxPromoFragment.q5(), com.avito.android.trx_promo_impl.l.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            Toolbar toolbar = trxPromoFragment.f303880w0;
            if (toolbar == null) {
                toolbar = null;
            }
            ZF0.e eVar2 = dVar2.f20049i;
            toolbar.setNavigationIcon(eVar2.getF20063c());
            if (eVar2 instanceof e.d) {
                bG0.f fVar = trxPromoFragment.f303878u0;
                if (fVar == null) {
                    fVar = null;
                }
                fVar.a();
                bG0.e eVar3 = fVar.f57030d;
                if (eVar3 != null) {
                    D6.w(eVar3.f57023b);
                    D6.H(eVar3.f57026e);
                }
                View view = trxPromoFragment.f303879v0;
                if (view == null) {
                    view = null;
                }
                D6.H(view);
                ViewGroup viewGroup = trxPromoFragment.f303864A0;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                D6.w(viewGroup);
                Button button = trxPromoFragment.f303882y0;
                D6.w(button != null ? button : null);
            } else if (eVar2 instanceof e.c) {
                bG0.f fVar2 = trxPromoFragment.f303878u0;
                if (fVar2 == null) {
                    fVar2 = null;
                }
                fVar2.a();
                String str = ((e.c) eVar2).f20062d;
                if (str == null || str.length() == 0) {
                    bG0.e eVar4 = fVar2.f57030d;
                    if (eVar4 != null) {
                        String string = eVar4.getContext().getString(R.string.error_layout_try_refresh_or_return_later);
                        TextView textView = eVar4.f57024c;
                        if (textView != null) {
                            textView.setText(R.string.error_layout_unknown_error);
                        }
                        TextView textView2 = eVar4.f57025d;
                        if (textView2 != null) {
                            textView2.setText(string);
                        }
                        D6.H(eVar4.f57023b);
                        D6.w(eVar4.f57026e);
                    }
                } else {
                    bG0.e eVar5 = fVar2.f57030d;
                    if (eVar5 != null) {
                        TextView textView3 = eVar5.f57024c;
                        if (textView3 != null) {
                            textView3.setText(R.string.trx_promo_str_network_problem_error_title_text);
                        }
                        TextView textView4 = eVar5.f57025d;
                        if (textView4 != null) {
                            textView4.setText(str);
                        }
                        D6.H(eVar5.f57023b);
                        D6.w(eVar5.f57026e);
                    }
                }
                View view2 = trxPromoFragment.f303879v0;
                if (view2 == null) {
                    view2 = null;
                }
                D6.w(view2);
                ViewGroup viewGroup2 = trxPromoFragment.f303864A0;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                D6.w(viewGroup2);
                Button button2 = trxPromoFragment.f303882y0;
                D6.w(button2 != null ? button2 : null);
            } else if (eVar2 instanceof e.b) {
                bG0.f fVar3 = trxPromoFragment.f303878u0;
                if (fVar3 == null) {
                    fVar3 = null;
                }
                bG0.e eVar6 = fVar3.f57030d;
                if (eVar6 != null) {
                    fVar3.f57027a.removeView(eVar6);
                    fVar3.f57030d = null;
                }
                D6.w(fVar3.f57029c);
                View view3 = trxPromoFragment.f303879v0;
                if (view3 == null) {
                    view3 = null;
                }
                D6.w(view3);
                RF0.k f20056d = eVar2.getF20056d();
                if (f20056d != null && (progress = f20056d.getProgress()) != null) {
                    float fFloatValue = progress.floatValue();
                    ProgressBarRe23 progressBarRe23 = trxPromoFragment.f303881x0;
                    if (progressBarRe23 == null) {
                        progressBarRe23 = null;
                    }
                    progressBarRe23.setProgress(fFloatValue);
                }
                ProgressBarRe23 progressBarRe232 = trxPromoFragment.f303881x0;
                if (progressBarRe232 == null) {
                    progressBarRe232 = null;
                }
                RF0.k f20056d2 = eVar2.getF20056d();
                D6.G(progressBarRe232, (f20056d2 != null ? f20056d2.getProgress() : null) != null);
                Button button3 = trxPromoFragment.f303882y0;
                if (button3 == null) {
                    button3 = null;
                }
                RF0.k f20056d3 = eVar2.getF20056d();
                ButtonAction button4 = f20056d3 != null ? f20056d3.getButton() : null;
                cG0.e.a(button3, button4 != null ? new RF0.h(button4.getTitle(), button4.getDeeplink(), button4.getStyle(), button4.isEnabled()) : null);
                com.avito.konveyor.adapter.d dVar3 = trxPromoFragment.f303874q0;
                if (dVar3 == null) {
                    dVar3 = null;
                }
                e.b bVar = (e.b) eVar2;
                dVar3.l(bVar.f20057e, new com.avito.android.trx_promo_impl.c(trxPromoFragment, 0));
                ViewGroup viewGroup3 = trxPromoFragment.f303864A0;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                D6.H(viewGroup3);
                List<RF0.h> list = bVar.f20058f;
                if (list.size() == 1) {
                    Button button5 = trxPromoFragment.f303865B0;
                    if (button5 == null) {
                        button5 = null;
                    }
                    D6.w(button5);
                    Button button6 = trxPromoFragment.f303866C0;
                    if (button6 == null) {
                        button6 = null;
                    }
                    D6.H(button6);
                    Button button7 = trxPromoFragment.f303866C0;
                    if (button7 == null) {
                        button7 = null;
                    }
                    RF0.h hVar = (RF0.h) C42745f0.E(list);
                    cG0.e.a(button7, hVar);
                    DeepLink deepLink = hVar.f14240b;
                    if (deepLink != null) {
                        button7.setOnClickListener(new XA0.c(eVar, deepLink, i12));
                    }
                } else if (list.size() > 1) {
                    Button button8 = trxPromoFragment.f303865B0;
                    if (button8 == null) {
                        button8 = null;
                    }
                    D6.H(button8);
                    Button button9 = trxPromoFragment.f303866C0;
                    if (button9 == null) {
                        button9 = null;
                    }
                    D6.H(button9);
                    RF0.h hVar2 = list.get(0);
                    RF0.h hVar3 = list.get(1);
                    Button button10 = trxPromoFragment.f303865B0;
                    if (button10 == null) {
                        button10 = null;
                    }
                    cG0.e.a(button10, hVar2);
                    DeepLink deepLink2 = hVar2.f14240b;
                    if (deepLink2 != null) {
                        button10.setOnClickListener(new XA0.c(eVar, deepLink2, i12));
                    }
                    Button button11 = trxPromoFragment.f303866C0;
                    if (button11 == null) {
                        button11 = null;
                    }
                    cG0.e.a(button11, hVar3);
                    DeepLink deepLink3 = hVar3.f14240b;
                    if (deepLink3 != null) {
                        button11.setOnClickListener(new XA0.c(eVar, deepLink3, i12));
                    }
                }
                AttributedText attributedText = bVar.f20059g;
                if (attributedText != null) {
                    attributedText.setOnDeepLinkClickListener(new com.avito.android.trx_promo_impl.f(trxPromoFragment.f303868E0));
                }
                TextView textView5 = trxPromoFragment.f303867D0;
                if (textView5 == null) {
                    textView5 = null;
                }
                com.avito.android.util.text.j.a(textView5, attributedText, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<ZF0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(ZF0.a aVar) {
            ((com.avito.android.trx_promo_impl.l) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<ZF0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(ZF0.a aVar) {
            ((com.avito.android.trx_promo_impl.l) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f303888l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f303888l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f303888l);
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
            return TrxPromoFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f303890l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f303890l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f303890l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303891l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303891l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f303891l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303892l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303892l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f303892l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/trx_promo_impl/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.trx_promo_impl.l> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.trx_promo_impl.l invoke() {
            com.avito.android.trx_promo_impl.m mVar = TrxPromoFragment.this.f303871n0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.trx_promo_impl.l) mVar.get();
        }
    }

    public TrxPromoFragment() {
        super(R.layout.trx_promo_configure_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f303872o0 = new O0(m0.f406844a.b(com.avito.android.trx_promo_impl.l.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f303868E0 = new c();
        this.f303869F0 = new b();
        this.f303870G0 = new d();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f303873p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i12 = 0;
        this.f303878u0 = new bG0.f((ViewGroup) view.findViewById(R.id.trx_promo_content_container), new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_impl.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoFragment f303910c;

            {
                this.f303910c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TrxPromoFragment trxPromoFragment = this.f303910c;
                switch (i12) {
                    case 0:
                        TrxPromoFragment.a aVar = TrxPromoFragment.f303863H0;
                        trxPromoFragment.q5().accept(a.c.f20023a);
                        break;
                    case 1:
                        TrxPromoFragment.a aVar2 = TrxPromoFragment.f303863H0;
                        trxPromoFragment.q5().accept(a.C1432a.f20021a);
                        break;
                    default:
                        TrxPromoFragment.a aVar3 = TrxPromoFragment.f303863H0;
                        trxPromoFragment.q5().accept(a.f.f20026a);
                        break;
                }
            }
        }, null, 4, null);
        this.f303879v0 = view.findViewById(R.id.trx_promo_skeleton_item);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.trx_promo_str_toolbar);
        final int i13 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_impl.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoFragment f303910c;

            {
                this.f303910c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TrxPromoFragment trxPromoFragment = this.f303910c;
                switch (i13) {
                    case 0:
                        TrxPromoFragment.a aVar = TrxPromoFragment.f303863H0;
                        trxPromoFragment.q5().accept(a.c.f20023a);
                        break;
                    case 1:
                        TrxPromoFragment.a aVar2 = TrxPromoFragment.f303863H0;
                        trxPromoFragment.q5().accept(a.C1432a.f20021a);
                        break;
                    default:
                        TrxPromoFragment.a aVar3 = TrxPromoFragment.f303863H0;
                        trxPromoFragment.q5().accept(a.f.f20026a);
                        break;
                }
            }
        });
        this.f303880w0 = toolbar;
        this.f303881x0 = (ProgressBarRe23) view.findViewById(R.id.trx_promo_str_navigation_progress_bar);
        Button button = (Button) view.findViewById(R.id.trx_promo_str_help_button);
        final int i14 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_impl.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoFragment f303910c;

            {
                this.f303910c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TrxPromoFragment trxPromoFragment = this.f303910c;
                switch (i14) {
                    case 0:
                        TrxPromoFragment.a aVar = TrxPromoFragment.f303863H0;
                        trxPromoFragment.q5().accept(a.c.f20023a);
                        break;
                    case 1:
                        TrxPromoFragment.a aVar2 = TrxPromoFragment.f303863H0;
                        trxPromoFragment.q5().accept(a.C1432a.f20021a);
                        break;
                    default:
                        TrxPromoFragment.a aVar3 = TrxPromoFragment.f303863H0;
                        trxPromoFragment.q5().accept(a.f.f20026a);
                        break;
                }
            }
        });
        this.f303882y0 = button;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.trx_promo_recycler_view);
        recyclerView.setItemAnimator(null);
        com.avito.konveyor.adapter.d dVar = this.f303874q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new bG0.b(), -1);
        this.f303883z0 = recyclerView;
        this.f303864A0 = (ViewGroup) view.findViewById(R.id.trx_promo_button_container);
        this.f303865B0 = (Button) view.findViewById(R.id.trx_promo_primary_button);
        this.f303866C0 = (Button) view.findViewById(R.id.trx_promo_secondary_button);
        this.f303867D0 = (TextView) view.findViewById(R.id.trx_promo_text_agreement);
        ScreenPerformanceTracker screenPerformanceTracker = this.f303873p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, q5(), new e(1, this, TrxPromoFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoOneTimeEvent;)V", 0), new f());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.trx_promo_impl.g(this, new g(1, q5(), com.avito.android.trx_promo_impl.l.class, "accept", "accept(Ljava/lang/Object;)V", 0), null), 3);
        C22960s.b(this, "trx_promo_request_key", new com.avito.android.trx_promo_impl.h(new h(1, q5(), com.avito.android.trx_promo_impl.l.class, "accept", "accept(Ljava/lang/Object;)V", 0)));
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f303870G0);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303873p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String string = requireArguments().getString("trx_promo_key_context");
        if (string == null) {
            throw new IllegalArgumentException("trx_promo_key_context param must not be null");
        }
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("trx_promo_key_closable", true) : true;
        e.a aVarA = com.avito.android.trx_promo_impl.di.a.a();
        com.avito.android.trx_promo_impl.di.l lVar = (com.avito.android.trx_promo_impl.di.l) C29972i.a(C29972i.b(this), com.avito.android.trx_promo_impl.di.l.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        TrxPromoScreen trxPromoScreen = TrxPromoScreen.f303894d;
        r rVarC = s.c(this);
        trxPromoScreen.getClass();
        aVarA.a(lVar, interfaceC39417aB, trxPromoScreen, rVarC, TrxPromoScreen.f303895e, string, z12, this.f303868E0, this.f303869F0, C49166b.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f303873p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f303876s0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.trx_promo_impl.l q5() {
        return (com.avito.android.trx_promo_impl.l) this.f303872o0.getValue();
    }
}
