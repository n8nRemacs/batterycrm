package com.avito.android.rating_form;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.K;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.rating_form.C;
import com.avito.android.rating_form.ToastInfo;
import com.avito.android.rating_form.di.f;
import com.avito.android.rating_form.info.RatingFormInfoArguments;
import com.avito.android.rating_form.info.RatingFormInfoFragment;
import com.avito.android.rating_form.mvi.entity.RatingFormState;
import com.avito.android.rating_form.pseudo_done.RatingFormPseudoDoneArguments;
import com.avito.android.rating_form.pseudo_done.RatingFormPseudoDoneFragment;
import com.avito.android.rating_form.select_item.RatingFormSelectItemArguments;
import com.avito.android.rating_form.select_item.RatingFormSelectItemFragment;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.RatingFormStepFragment;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.P5;
import dh0.InterfaceC39727a;
import dh0.InterfaceC39728b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: RatingFormActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/RatingFormActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/rating_form/di/f;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingFormActivity extends com.avito.android.ui.activity.a implements K<com.avito.android.rating_form.di.f>, InterfaceC28477j.b {

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final a f247887w = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public L f247888m;

    /* renamed from: n, reason: collision with root package name */
    public com.avito.android.rating_form.di.f f247889n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f247890o;

    /* renamed from: p, reason: collision with root package name */
    public ProgressBar f247891p;

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f247892q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public C.a f247893r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final O0 f247894s = new O0(m0.f406844a.b(C.class), new e(), new d(new g()), new f());

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f247895t;

    /* renamed from: u, reason: collision with root package name */
    @X41.f
    @Inject
    public boolean f247896u;

    /* renamed from: v, reason: collision with root package name */
    public RatingFormArguments f247897v;

    /* compiled from: RatingFormActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/rating_form/RatingFormActivity$a;", "", "<init>", "()V", "", "AUXILIARY_TAG", "Ljava/lang/String;", "DONE_PSEUDO_STEP_TAG", "INFO_TAG", "KEY_ARGUMENTS", "SELECT_ITEM_FRAGMENT_TAG", "STEP_FRAGMENT_TAG", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC39728b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC39728b interfaceC39728b) {
            InterfaceC39728b interfaceC39728b2 = interfaceC39728b;
            RatingFormActivity ratingFormActivity = (RatingFormActivity) this.receiver;
            a aVar = RatingFormActivity.f247887w;
            ratingFormActivity.getClass();
            if (interfaceC39728b2 instanceof InterfaceC39728b.c) {
                ratingFormActivity.setResult(0);
                ratingFormActivity.finish();
            } else {
                if (interfaceC39728b2 instanceof InterfaceC39728b.C11032b) {
                    InterfaceC39728b.C11032b c11032b = (InterfaceC39728b.C11032b) interfaceC39728b2;
                    if (c11032b.f394002a) {
                        L l12 = ratingFormActivity.f247888m;
                        ratingFormActivity.startActivity(L.a.a(l12 != null ? l12 : null, c11032b.f394003b, 2).addFlags(268468224));
                    } else {
                        ratingFormActivity.setResult(-1, B.a(new ToastInfo(c11032b.f394003b, c11032b.f394004c, null, null, ToastInfo.Position.f247934b, c11032b.f394005d, c11032b.f394006e, false, 12, null), c11032b.f394008g, false));
                    }
                    ratingFormActivity.finish();
                } else if (interfaceC39728b2 instanceof InterfaceC39728b.g) {
                    InterfaceC39728b.g gVar = (InterfaceC39728b.g) interfaceC39728b2;
                    RatingFormStepArguments ratingFormStepArguments = new RatingFormStepArguments(gVar.f394021a, gVar.f394022b, gVar.f394023c, gVar.f394024d, ratingFormActivity.f247896u, false);
                    String str = "step_" + gVar.f394023c;
                    RatingFormStepFragment.f249120R0.getClass();
                    ratingFormActivity.a2(RatingFormStepFragment.a.a(ratingFormStepArguments), str);
                } else if (interfaceC39728b2 instanceof InterfaceC39728b.d) {
                    InterfaceC39728b.d dVar = (InterfaceC39728b.d) interfaceC39728b2;
                    String str2 = dVar.f394012c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    RatingFormInfoArguments ratingFormInfoArguments = new RatingFormInfoArguments(dVar.f394013d, dVar.f394014e, dVar.f394010a, dVar.f394011b, str2, dVar.f394015f);
                    ratingFormActivity.getSupportFragmentManager().a0(1, null);
                    RatingFormInfoFragment.f248153t0.getClass();
                    ratingFormActivity.a2(RatingFormInfoFragment.a.a(ratingFormInfoArguments), RequestReviewResultKt.INFO_TYPE);
                } else if (interfaceC39728b2 instanceof InterfaceC39728b.e) {
                    InterfaceC39728b.e eVar = (InterfaceC39728b.e) interfaceC39728b2;
                    RatingFormPseudoDoneArguments ratingFormPseudoDoneArguments = new RatingFormPseudoDoneArguments(eVar.f394017b, false, eVar.f394016a);
                    ratingFormActivity.getSupportFragmentManager().a0(1, null);
                    RatingFormPseudoDoneFragment.f248827s0.getClass();
                    ratingFormActivity.a2(RatingFormPseudoDoneFragment.a.a(ratingFormPseudoDoneArguments), "done_pseudo_step");
                } else if (interfaceC39728b2 instanceof InterfaceC39728b.f) {
                    InterfaceC39728b.f fVar = (InterfaceC39728b.f) interfaceC39728b2;
                    boolean z12 = ratingFormActivity.f247896u;
                    RatingFormArguments ratingFormArguments = fVar.f394018a;
                    StepIdentifier stepIdentifier = fVar.f394020c;
                    RatingFormSelectItemArguments ratingFormSelectItemArguments = new RatingFormSelectItemArguments(ratingFormArguments, fVar.f394019b, stepIdentifier, z12);
                    RatingFormSelectItemFragment.f248870z0.getClass();
                    ratingFormActivity.a2(RatingFormSelectItemFragment.a.a(ratingFormSelectItemArguments), "select_item_" + stepIdentifier);
                } else {
                    boolean z13 = interfaceC39728b2 instanceof InterfaceC39728b.a;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/rating_form/mvi/entity/RatingFormState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<RatingFormState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RatingFormState ratingFormState) {
            RatingFormState ratingFormState2 = ratingFormState;
            a aVar = RatingFormActivity.f247887w;
            RatingFormActivity ratingFormActivity = RatingFormActivity.this;
            TextView textView = ratingFormActivity.f247890o;
            if (textView == null) {
                textView = null;
            }
            RatingFormState.RatingFormStepProgress ratingFormStepProgress = ratingFormState2.f248755m;
            boolean z12 = ratingFormStepProgress instanceof RatingFormState.RatingFormStepProgress.Title;
            D6.G(textView, z12);
            ProgressBar progressBar = ratingFormActivity.f247891p;
            if (progressBar == null) {
                progressBar = null;
            }
            boolean z13 = ratingFormStepProgress instanceof RatingFormState.RatingFormStepProgress.Progress;
            D6.G(progressBar, z13);
            if (z12) {
                TextView textView2 = ratingFormActivity.f247890o;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(((RatingFormState.RatingFormStepProgress.Title) ratingFormStepProgress).f248759b);
            } else if (z13) {
                ProgressBar progressBar2 = ratingFormActivity.f247891p;
                if (progressBar2 == null) {
                    progressBar2 = null;
                }
                progressBar2.setProgress(((RatingFormState.RatingFormStepProgress.Progress) ratingFormStepProgress).f248758b);
            } else {
                kotlin.jvm.internal.L.f(ratingFormStepProgress, RatingFormState.RatingFormStepProgress.Empty.f248757b);
            }
            if (ratingFormState2.f248753k) {
                com.avito.android.progress_overlay.l lVar = ratingFormActivity.f247892q;
                if (lVar == null) {
                    lVar = null;
                }
                lVar.k(null);
            } else if (ratingFormState2.f248754l) {
                com.avito.android.progress_overlay.l lVar2 = ratingFormActivity.f247892q;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.a("");
                com.avito.android.progress_overlay.l lVar3 = ratingFormActivity.f247892q;
                (lVar3 != null ? lVar3 : null).f231600j = new com.avito.android.rating_form.f(ratingFormActivity);
            } else {
                com.avito.android.progress_overlay.l lVar4 = ratingFormActivity.f247892q;
                (lVar4 != null ? lVar4 : null).j();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f247900m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f247900m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(RatingFormActivity.this, this.f247900m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return RatingFormActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return RatingFormActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: RatingFormActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "savedStateHandle", "Lcom/avito/android/rating_form/C;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/rating_form/C;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<C23060r0, C> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final C invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            C.a aVar = RatingFormActivity.this.f247893r;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_rating_form;
    }

    @Override // com.avito.android.ui.activity.a
    public final void X1() {
        setTheme(this.f247896u ? R.style.RatingFormSellerRedesignTheme : R.style.RatingFormTheme);
        super.X1();
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Intent intent = getIntent();
        RatingFormArguments ratingFormArguments = (RatingFormArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_arguments", RatingFormArguments.class) : intent.getParcelableExtra("key_arguments"));
        if (ratingFormArguments == null) {
            throw new IllegalArgumentException("RatingFormArguments not set");
        }
        this.f247897v = ratingFormArguments;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        f.a aVarA = com.avito.android.rating_form.di.a.a();
        S0 f42820b = getF42820b();
        RatingFormArguments ratingFormArguments2 = this.f247897v;
        if (ratingFormArguments2 == null) {
            ratingFormArguments2 = null;
        }
        com.avito.android.rating_form.di.f fVarA = aVarA.a(f42820b, ratingFormArguments2, getResources(), new C28478k(new RatingFormScreen(null, 1, null), com.avito.android.analytics.screens.s.a(this), null, 4, null), bundle != null, false, (com.avito.android.rating_form.di.g) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.g.class), cv.c.a(this));
        this.f247889n = fVarA;
        fVarA.yb(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f247895t;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f247895t;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    public final void a2(BaseFragment baseFragment, String str) {
        if (str != null) {
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.rating_form_fragment_container, baseFragment, str);
            hE2.c(str);
            hE2.e();
        }
    }

    public final void b2() {
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            ((C) this.f247894s.getValue()).accept(new InterfaceC39727a.d(C42745f0.S(getSupportFragmentManager().P()) instanceof RatingFormInfoFragment));
            if (getSupportFragmentManager().L() <= 1 || (C42745f0.S(getSupportFragmentManager().P()) instanceof RatingFormInfoFragment)) {
                P5.d(toolbar);
            } else if (getSupportFragmentManager().L() > 1) {
                P5.b(toolbar);
            } else {
                toolbar.setNavigationIcon((Drawable) null);
            }
            G0 g02 = G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> listP = getSupportFragmentManager().P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (obj instanceof h) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            ((C) this.f247894s.getValue()).accept(new InterfaceC39727a.C11031a(getSupportFragmentManager().L()));
        }
        if (getSupportFragmentManager().L() > 1) {
            if (getSupportFragmentManager().L() <= 1 || !kotlin.jvm.internal.L.f(getSupportFragmentManager().K(getSupportFragmentManager().L() - 2).getName(), "auxiliary")) {
                getSupportFragmentManager().Y();
            } else {
                getSupportFragmentManager().a0(1, "auxiliary");
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f247895t;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f247895t;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, (C) this.f247894s.getValue(), new b(1, this, RatingFormActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/rating_form/mvi/entity/RatingFormOneTimeEvent;)V", 0), new c());
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            toolbar.setNavigationIcon((Drawable) null);
        }
        Toolbar toolbar2 = this.f304539d;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 22));
        }
        this.f247890o = (TextView) findViewById(R.id.toolbar_title);
        this.f247891p = (ProgressBar) findViewById(R.id.toolbar_progress_bar);
        b2();
        this.f247892q = new com.avito.android.progress_overlay.l((ViewGroup) findViewById(R.id.rating_form_fragment_container), 0, null, 0, 0, 30, null);
        getSupportFragmentManager().b(new androidx.preference.q(this, 1));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f247895t;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.rating_form.di.f fVar = this.f247889n;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }
}
