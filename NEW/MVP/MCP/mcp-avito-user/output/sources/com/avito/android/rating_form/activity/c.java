package com.avito.android.rating_form.activity;

import Cd.r;
import Ug0.C15517a;
import Y41.l;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
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
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.rating_form.B;
import com.avito.android.rating_form.C;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.RatingFormScreen;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.ToastInfo;
import com.avito.android.rating_form.di.f;
import com.avito.android.rating_form.h;
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
import dh0.InterfaceC39727a;
import dh0.InterfaceC39728b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: BaseRatingFormActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/activity/c;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/rating_form/di/f;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class c extends com.avito.android.ui.activity.a implements K<com.avito.android.rating_form.di.f>, InterfaceC28477j.b {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f247953u = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public L f247954m;

    /* renamed from: n, reason: collision with root package name */
    public com.avito.android.rating_form.di.f f247955n;

    /* renamed from: o, reason: collision with root package name */
    public C42670a f247956o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public C.a f247957p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final O0 f247958q = new O0(m0.f406844a.b(C.class), new e(), new d(new g()), new f());

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f247959r;

    /* renamed from: s, reason: collision with root package name */
    @X41.f
    @Inject
    public boolean f247960s;

    /* renamed from: t, reason: collision with root package name */
    public RatingFormArguments f247961t;

    /* compiled from: BaseRatingFormActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/rating_form/activity/c$a;", "", "<init>", "()V", "", "AUXILIARY_TAG", "Ljava/lang/String;", "DONE_PSEUDO_STEP_TAG", "INFO_TAG", "KEY_ARGUMENTS", "", "RESULT_CANCEL_WITH_TOAST", "I", "RESULT_UPDATE_LIST", "SELECT_ITEM_FRAGMENT_TAG", "STEP_FRAGMENT_TAG", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BaseRatingFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC39728b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC39728b interfaceC39728b) {
            InterfaceC39728b interfaceC39728b2 = interfaceC39728b;
            c cVar = (c) this.receiver;
            int i12 = c.f247953u;
            cVar.getClass();
            if (interfaceC39728b2 instanceof InterfaceC39728b.c) {
                cVar.b2(0, null);
            } else {
                if (interfaceC39728b2 instanceof InterfaceC39728b.C11032b) {
                    InterfaceC39728b.C11032b c11032b = (InterfaceC39728b.C11032b) interfaceC39728b2;
                    if (c11032b.f394002a) {
                        L l12 = cVar.f247954m;
                        if (l12 == null) {
                            l12 = null;
                        }
                        cVar.startActivity(L.a.a(l12, c11032b.f394003b, 2).addFlags(268468224));
                        cVar.b2(null, null);
                    } else {
                        ToastInfo toastInfo = new ToastInfo(c11032b.f394003b, c11032b.f394004c, null, null, ToastInfo.Position.f247935c, c11032b.f394005d, c11032b.f394006e, false, 12, null);
                        String str = c11032b.f394008g;
                        boolean z12 = c11032b.f394007f;
                        cVar.b2(Integer.valueOf(z12 ? 2 : -1), B.a(toastInfo, str, z12));
                    }
                } else if (interfaceC39728b2 instanceof InterfaceC39728b.g) {
                    InterfaceC39728b.g gVar = (InterfaceC39728b.g) interfaceC39728b2;
                    RatingFormStepArguments ratingFormStepArguments = new RatingFormStepArguments(gVar.f394021a, gVar.f394022b, gVar.f394023c, gVar.f394024d, cVar.f247960s, cVar.getF247949v());
                    String str2 = "step_" + gVar.f394023c;
                    RatingFormStepFragment.f249120R0.getClass();
                    RatingFormStepFragment ratingFormStepFragmentA = RatingFormStepFragment.a.a(ratingFormStepArguments);
                    ratingFormStepFragmentA.setSharedElementEnterTransition(new C15517a());
                    cVar.i2(ratingFormStepFragmentA, str2);
                } else if (interfaceC39728b2 instanceof InterfaceC39728b.d) {
                    InterfaceC39728b.d dVar = (InterfaceC39728b.d) interfaceC39728b2;
                    String str3 = dVar.f394012c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    RatingFormInfoArguments ratingFormInfoArguments = new RatingFormInfoArguments(dVar.f394013d, dVar.f394014e, dVar.f394010a, dVar.f394011b, str3, dVar.f394015f);
                    cVar.getSupportFragmentManager().a0(1, null);
                    RatingFormInfoFragment.f248153t0.getClass();
                    cVar.i2(RatingFormInfoFragment.a.a(ratingFormInfoArguments), RequestReviewResultKt.INFO_TYPE);
                } else if (interfaceC39728b2 instanceof InterfaceC39728b.f) {
                    InterfaceC39728b.f fVar = (InterfaceC39728b.f) interfaceC39728b2;
                    boolean z13 = cVar.f247960s;
                    RatingFormArguments ratingFormArguments = fVar.f394018a;
                    StepIdentifier stepIdentifier = fVar.f394020c;
                    RatingFormSelectItemArguments ratingFormSelectItemArguments = new RatingFormSelectItemArguments(ratingFormArguments, fVar.f394019b, stepIdentifier, z13);
                    RatingFormSelectItemFragment.f248870z0.getClass();
                    cVar.i2(RatingFormSelectItemFragment.a.a(ratingFormSelectItemArguments), "select_item_" + stepIdentifier);
                } else if (interfaceC39728b2 instanceof InterfaceC39728b.e) {
                    InterfaceC39728b.e eVar = (InterfaceC39728b.e) interfaceC39728b2;
                    RatingFormPseudoDoneArguments ratingFormPseudoDoneArguments = new RatingFormPseudoDoneArguments(eVar.f394017b, cVar.getF247949v(), eVar.f394016a);
                    cVar.getSupportFragmentManager().a0(1, null);
                    RatingFormPseudoDoneFragment.f248827s0.getClass();
                    RatingFormPseudoDoneFragment ratingFormPseudoDoneFragmentA = RatingFormPseudoDoneFragment.a.a(ratingFormPseudoDoneArguments);
                    ratingFormPseudoDoneFragmentA.setSharedElementEnterTransition(new C15517a());
                    cVar.i2(ratingFormPseudoDoneFragmentA, "done_pseudo_step");
                } else if (interfaceC39728b2 instanceof InterfaceC39728b.a) {
                    InterfaceC39728b.a aVar = (InterfaceC39728b.a) interfaceC39728b2;
                    cVar.b2(2, B.a(aVar.f394000a, null, aVar.f394001b));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BaseRatingFormActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/rating_form/mvi/entity/RatingFormState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.rating_form.activity.c$c, reason: collision with other inner class name */
    public static final class C7445c extends N implements l<RatingFormState, G0> {
        public C7445c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RatingFormState ratingFormState) {
            RatingFormState ratingFormState2 = ratingFormState;
            int i12 = c.f247953u;
            c cVar = c.this;
            cVar.h2(ratingFormState2);
            if (ratingFormState2.f248753k) {
                C42670a c42670a = cVar.f247956o;
                C42670a.d(c42670a != null ? c42670a : null);
            } else if (ratingFormState2.f248754l) {
                cVar.e2();
            } else {
                C42670a c42670a2 = cVar.f247956o;
                (c42670a2 != null ? c42670a2 : null).b();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f247964m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l lVar) {
            super(0);
            this.f247964m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(c.this, this.f247964m);
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
            return c.this.getF42820b();
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
            return c.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: BaseRatingFormActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "savedStateHandle", "Lcom/avito/android/rating_form/C;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/rating_form/C;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements l<C23060r0, C> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final C invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            C.a aVar = c.this.f247957p;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Intent intent = getIntent();
        RatingFormArguments ratingFormArguments = (RatingFormArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_arguments", RatingFormArguments.class) : intent.getParcelableExtra("key_arguments"));
        if (ratingFormArguments == null) {
            throw new IllegalArgumentException("RatingFormArguments not set");
        }
        this.f247961t = ratingFormArguments;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        f.a aVarA = com.avito.android.rating_form.di.a.a();
        S0 f42820b = getF42820b();
        RatingFormArguments ratingFormArguments2 = this.f247961t;
        if (ratingFormArguments2 == null) {
            ratingFormArguments2 = null;
        }
        com.avito.android.rating_form.di.f fVarA = aVarA.a(f42820b, ratingFormArguments2, getResources(), new C28478k(new RatingFormScreen(c2()), s.a(this), null, 4, null), bundle != null, getF247949v(), (com.avito.android.rating_form.di.g) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.g.class), cv.c.a(this));
        this.f247955n = fVarA;
        fVarA.H8(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f247959r;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f247959r;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    public abstract void a2(@k androidx.fragment.app.H h12);

    public void b2(@Y61.l Integer num, @Y61.l Intent intent) {
        if (num != null) {
            setResult(num.intValue(), intent);
        }
    }

    @k
    public abstract String c2();

    @k
    public final C d2() {
        return (C) this.f247958q.getValue();
    }

    public abstract void e2();

    public abstract void f2();

    /* renamed from: g2 */
    public abstract boolean getF247949v();

    public abstract void h2(@k RatingFormState ratingFormState);

    public final void i2(BaseFragment baseFragment, String str) {
        if (str == null) {
            return;
        }
        androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
        a2(hE2);
        hE2.n(R.id.rating_form_fragment_container, baseFragment, str);
        hE2.c(str);
        hE2.e();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public void onBackPressed() {
        List<Fragment> listP = getSupportFragmentManager().P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (obj instanceof h) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            d2().accept(new InterfaceC39727a.C11031a(getSupportFragmentManager().L()));
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
        ScreenPerformanceTracker screenPerformanceTracker = this.f247959r;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f247959r;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, d2(), new b(1, this, c.class, "handleEvent", "handleEvent(Lcom/avito/android/rating_form/mvi/entity/RatingFormOneTimeEvent;)V", 0), new C7445c());
        this.f247956o = new C42670a((ViewGroup) findViewById(R.id.rating_form_fragment_container), null, 0, 6, null);
        f2();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f247959r;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.rating_form.di.f fVar = this.f247955n;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }
}
