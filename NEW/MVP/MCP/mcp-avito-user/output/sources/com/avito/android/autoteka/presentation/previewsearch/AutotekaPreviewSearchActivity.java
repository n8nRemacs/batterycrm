package com.avito.android.autoteka.presentation.previewsearch;

import Cd.r;
import Of.InterfaceC14680a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23060r0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.AutotekaPreviewSearchScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.items.preview.PreviewItem;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.autoteka.presentation.previewsearch.f;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.autoteka.model.AutotekaLink;
import com.avito.android.remote.autoteka.model.DiscountBlock;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.P5;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: AutotekaPreviewSearchActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/AutotekaPreviewSearchActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaPreviewSearchActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.autoteka.items.payment.h f97529x;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public f.a f97530m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f97532o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f97533p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f97534q;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Input f97537t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public ConstraintLayout f97538u;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f97531n = new O0(m0.f406844a.b(com.avito.android.autoteka.presentation.previewsearch.f.class), new j(), new i(new l()), new k());

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f97535r = C42727D.c(new g());

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f97536s = C42727D.c(new c());

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f97539v = C42727D.c(new d());

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f97540w = C42727D.c(new b());

    /* compiled from: AutotekaPreviewSearchActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/AutotekaPreviewSearchActivity$a;", "", "<init>", "()V", "", "KEY_AUTOTEKA_PREVIEW_DETAILS", "Ljava/lang/String;", "Landroid/text/InputFilter;", "letterAndDigitInputFilter", "Landroid/text/InputFilter;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaPreviewSearchActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchDetails;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<AutotekaPreviewSearchDetails> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final AutotekaPreviewSearchDetails invoke() {
            Intent intent = AutotekaPreviewSearchActivity.this.getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("KeyAutotekaPreviewDetails", AutotekaPreviewSearchDetails.class) : intent.getParcelableExtra("KeyAutotekaPreviewDetails");
            if (parcelableExtra != null) {
                return (AutotekaPreviewSearchDetails) parcelableExtra;
            }
            throw new IllegalArgumentException("AutotekaPreviewSearchDetails should be passed in Activity");
        }
    }

    /* compiled from: AutotekaPreviewSearchActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Button> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Button invoke() {
            return (Button) AutotekaPreviewSearchActivity.this.findViewById(R.id.report_example_button);
        }
    }

    /* compiled from: AutotekaPreviewSearchActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "()Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.lib.design.bottom_sheet.d> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.lib.design.bottom_sheet.d invoke() {
            AutotekaPreviewSearchActivity autotekaPreviewSearchActivity = AutotekaPreviewSearchActivity.this;
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(autotekaPreviewSearchActivity, 0, 2, null);
            dVar.D(R.layout.autoteka_preview_instruction_dialog, true);
            com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, true, 0, 0, 0, 121);
            dVar.R(new com.avito.android.autoteka.presentation.previewsearch.c(autotekaPreviewSearchActivity));
            return dVar;
        }
    }

    /* compiled from: AutotekaPreviewSearchActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC14680a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14680a interfaceC14680a) {
            G0 g02;
            InterfaceC14680a interfaceC14680a2 = interfaceC14680a;
            AutotekaPreviewSearchActivity autotekaPreviewSearchActivity = (AutotekaPreviewSearchActivity) this.receiver;
            com.avito.android.autoteka.items.payment.h hVar = AutotekaPreviewSearchActivity.f97529x;
            autotekaPreviewSearchActivity.getClass();
            if (interfaceC14680a2 instanceof InterfaceC14680a.d) {
                com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) autotekaPreviewSearchActivity.f97539v.getValue();
                com.avito.android.lib.util.g.a(dVar);
                dVar.s();
            } else if (interfaceC14680a2 instanceof InterfaceC14680a.C0800a) {
                Input input = autotekaPreviewSearchActivity.f97537t;
                if (input != null) {
                    K2.d(input, true);
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    K2.c(autotekaPreviewSearchActivity);
                }
            } else if (interfaceC14680a2 instanceof InterfaceC14680a.e) {
                Input input2 = autotekaPreviewSearchActivity.f97537t;
                if (input2 != null) {
                    input2.v();
                }
            } else if (interfaceC14680a2 instanceof InterfaceC14680a.c) {
                autotekaPreviewSearchActivity.setResult(-1);
            } else if (interfaceC14680a2 instanceof InterfaceC14680a.b) {
                autotekaPreviewSearchActivity.startActivity(((InterfaceC14680a.b) interfaceC14680a2).f12472a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaPreviewSearchActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<AutotekaPreviewSearchState, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AutotekaPreviewSearchState autotekaPreviewSearchState) {
            Input input;
            AutotekaPreviewSearchState autotekaPreviewSearchState2 = autotekaPreviewSearchState;
            AutotekaPreviewSearchActivity autotekaPreviewSearchActivity = AutotekaPreviewSearchActivity.this;
            com.avito.konveyor.adapter.a aVar = autotekaPreviewSearchActivity.f97534q;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(Collections.singletonList(autotekaPreviewSearchState2.getF97630d())));
            com.avito.konveyor.adapter.j jVar = autotekaPreviewSearchActivity.f97533p;
            if (jVar == null) {
                jVar = null;
            }
            jVar.notifyDataSetChanged();
            if (autotekaPreviewSearchState2.getF97629c() && (input = autotekaPreviewSearchActivity.f97537t) != null) {
                if (autotekaPreviewSearchState2.f97631e) {
                    input.v();
                } else {
                    K2.d(input, true);
                }
            }
            ConstraintLayout constraintLayout = autotekaPreviewSearchActivity.f97538u;
            if (constraintLayout != null) {
                D6.G(constraintLayout, autotekaPreviewSearchState2.getF97629c());
            }
            Toolbar toolbar = autotekaPreviewSearchActivity.f304539d;
            if (toolbar != null) {
                D6.G(toolbar, true ^ autotekaPreviewSearchState2.getF97629c());
            }
            boolean z12 = autotekaPreviewSearchState2 instanceof AutotekaPreviewSearchState.Data;
            InterfaceC42726C interfaceC42726C = autotekaPreviewSearchActivity.f97535r;
            if (z12) {
                AutotekaPreviewSearchState.Data data = (AutotekaPreviewSearchState.Data) autotekaPreviewSearchState2;
                PreviewItem previewItem = data.f97632f;
                AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParams = previewItem.f96895h;
                if (autotekaChoosingPurchaseButtonParams != null) {
                    String str = autotekaChoosingPurchaseButtonParams.f97070d;
                    if (str == null) {
                        str = "";
                    }
                    Button button = (Button) interfaceC42726C.getValue();
                    button.setText(autotekaChoosingPurchaseButtonParams.f97069c);
                    button.setSubtitle(str);
                    button.setOnClickListener(new com.avito.android.autoteka.presentation.previewsearch.a(autotekaPreviewSearchActivity, 1));
                    D6.H(button);
                }
                autotekaPreviewSearchActivity.c2(data.f97635i ? null : previewItem.f96896i);
                autotekaPreviewSearchActivity.b2(previewItem.f96897j);
            } else {
                D6.w((Button) interfaceC42726C.getValue());
                autotekaPreviewSearchActivity.c2(null);
                autotekaPreviewSearchActivity.b2(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaPreviewSearchActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<Button> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Button invoke() {
            return (Button) AutotekaPreviewSearchActivity.this.findViewById(R.id.purchase_button);
        }
    }

    /* compiled from: AutotekaPreviewSearchActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<AutotekaPreviewSearchAction, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AutotekaPreviewSearchAction autotekaPreviewSearchAction) {
            com.avito.android.autoteka.items.payment.h hVar = AutotekaPreviewSearchActivity.f97529x;
            AutotekaPreviewSearchActivity.this.a2().accept(autotekaPreviewSearchAction);
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f97548m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.l lVar) {
            super(0);
            this.f97548m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(AutotekaPreviewSearchActivity.this, this.f97548m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AutotekaPreviewSearchActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AutotekaPreviewSearchActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutotekaPreviewSearchActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/autoteka/presentation/previewsearch/f;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/autoteka/presentation/previewsearch/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<C23060r0, com.avito.android.autoteka.presentation.previewsearch.f> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.autoteka.presentation.previewsearch.f invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            f.a aVar = AutotekaPreviewSearchActivity.this.f97530m;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    static {
        new a(null);
        f97529x = new com.avito.android.autoteka.items.payment.h(1);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.autoteka_preview_search_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.autoteka.di.previewsearch.f.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.a(this), new C28478k(AutotekaPreviewSearchScreen.f90292d, s.a(this), null, 4, null), new h(), (AutotekaPreviewSearchDetails) this.f97540w.getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97532o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97532o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    public final com.avito.android.autoteka.presentation.previewsearch.f a2() {
        return (com.avito.android.autoteka.presentation.previewsearch.f) this.f97531n.getValue();
    }

    public final void b2(DiscountBlock discountBlock) {
        if (discountBlock != null) {
            D6.H(findViewById(R.id.discountContainer));
            ((TextView) findViewById(R.id.discountTitle)).setText(discountBlock.getTitle());
            ((DockingBadge) findViewById(R.id.discountAmount)).setText(discountBlock.getAmount());
        } else {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.discountContainer);
            if (linearLayout != null) {
                D6.w(linearLayout);
            }
        }
    }

    public final void c2(AutotekaLink autotekaLink) {
        Button button = (Button) this.f97536s.getValue();
        if (autotekaLink == null) {
            D6.w(button);
            return;
        }
        button.setText(autotekaLink.getTitle());
        button.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(13, this, autotekaLink));
        D6.H(button);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97532o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.konveyor.adapter.j jVar = this.f97533p;
        if (jVar == null) {
            jVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.autoteka_preview_search_item_list);
        if (recyclerView != null) {
            recyclerView.setAdapter(jVar);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        this.f97538u = (ConstraintLayout) findViewById(R.id.searchToolbar);
        Input input = (Input) findViewById(R.id.search_input);
        if (input != null) {
            input.a(new InputFilter.AllCaps());
            input.a(f97529x);
            input.setOnEditorActionListener(new com.avito.android.autoteka.presentation.previewsearch.b(0, this, input));
        } else {
            input = null;
        }
        this.f97537t = input;
        TextView textView = (TextView) findViewById(R.id.close_button);
        textView.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(14, textView, this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97532o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2, a2(), new e(1, this, AutotekaPreviewSearchActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchOneTimeEvent;)V", 0), new f());
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            P5.b(toolbar);
            toolbar.setNavigationOnClickListener(new com.avito.android.autoteka.presentation.previewsearch.a(this, 0));
        }
        a2().accept(new AutotekaPreviewSearchAction.RestorePreviousState(((AutotekaPreviewSearchDetails) this.f97540w.getValue()).f96224b));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f97532o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
