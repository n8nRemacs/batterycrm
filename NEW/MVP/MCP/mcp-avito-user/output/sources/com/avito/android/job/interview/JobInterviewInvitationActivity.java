package com.avito.android.job.interview;

import Cd.C13243a;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.InterviewInvitationScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.job.cv_info_actualization.ui.items.radio.h;
import com.avito.android.job.interview.di.b;
import com.avito.android.job.interview.domain.i;
import com.avito.android.job.interview.mvi.logics.r;
import com.avito.android.job.interview.mvi.logics.s;
import com.avito.android.job.interview.pickers.TimePickerDialog;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.progress_overlay.l;
import com.avito.android.publish.FlowType;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.util.C35974x2;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.V2;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;
import sQ.C48095e;
import vQ.C49251c;
import vQ.InterfaceC49249a;
import vQ.InterfaceC49252d;
import z1.AbstractC50339a;

/* compiled from: JobInterviewInvitationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/job/interview/JobInterviewInvitationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "Lru/avito/component/toolbar/a;", "<init>", "()V", "a", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class JobInterviewInvitationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b, ru.avito.component.toolbar.a {

    /* renamed from: y, reason: collision with root package name */
    @k
    public static final a f174509y = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public PublishIntentFactory f174510m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f174511n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public s f174512o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final O0 f174513p = new O0(m0.f406844a.b(r.class), new e(), new d(new g()), new f());

    /* renamed from: q, reason: collision with root package name */
    public l f174514q;

    /* renamed from: r, reason: collision with root package name */
    public CollapsingTitleAppBarLayout f174515r;

    /* renamed from: s, reason: collision with root package name */
    public ViewGroup f174516s;

    /* renamed from: t, reason: collision with root package name */
    public ComponentContainer f174517t;

    /* renamed from: u, reason: collision with root package name */
    public Input f174518u;

    /* renamed from: v, reason: collision with root package name */
    public Input f174519v;

    /* renamed from: w, reason: collision with root package name */
    public ViewGroup f174520w;

    /* renamed from: x, reason: collision with root package name */
    public Button f174521x;

    /* compiled from: JobInterviewInvitationActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/job/interview/JobInterviewInvitationActivity$a;", "", "<init>", "()V", "", "DATE_PICKER_TAG", "Ljava/lang/String;", "EXTRA_INVITATION_ID", "", "REQUEST_CODE", "I", "TIME_PICKER_TAG", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JobInterviewInvitationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC49252d, G0> {
        public final void f(@k InterfaceC49252d interfaceC49252d) {
            JobInterviewInvitationActivity jobInterviewInvitationActivity = (JobInterviewInvitationActivity) this.receiver;
            a aVar = JobInterviewInvitationActivity.f174509y;
            jobInterviewInvitationActivity.getClass();
            if (interfaceC49252d instanceof InterfaceC49252d.C12769d) {
                InterfaceC49252d.C12769d c12769d = (InterfaceC49252d.C12769d) interfaceC49252d;
                PublishIntentFactory publishIntentFactory = jobInterviewInvitationActivity.f174510m;
                PublishIntentFactory publishIntentFactory2 = publishIntentFactory != null ? publishIntentFactory : null;
                C48095e c48095e = c12769d.f440750a;
                Intent intentG = publishIntentFactory2.g((2046 & 1) != 0 ? null : c48095e != null ? new AddressParameter.Value(c48095e.getLat(), c48095e.getLng(), c48095e.getText(), null, null, 24, null) : null, (2046 & 4) != 0 ? null : null, (2046 & 8) != 0 ? null : null, (2046 & 16) != 0 ? PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b : null, (2046 & 32) != 0 ? null : null, (2046 & 64) != 0 ? null : null, (2046 & 128) != 0 ? null : null, (2046 & 256) == 0, (2046 & 1024) != 0 ? null : null, FlowType.f231902b);
                try {
                    C35974x2.d(intentG);
                    jobInterviewInvitationActivity.startActivityForResult(intentG, 1234);
                    return;
                } catch (Exception e12) {
                    V2.f318762a.f(e12);
                    return;
                }
            }
            if (interfaceC49252d instanceof InterfaceC49252d.c) {
                InterfaceC49252d.c cVar = (InterfaceC49252d.c) interfaceC49252d;
                com.avito.android.lib.util.g.a(new com.avito.android.job.interview.pickers.b(jobInterviewInvitationActivity, cVar.f440748a, new com.avito.android.job.interview.a(jobInterviewInvitationActivity), cVar.f440749b));
                return;
            }
            if (interfaceC49252d instanceof InterfaceC49252d.e) {
                com.avito.android.lib.util.g.a(new TimePickerDialog(jobInterviewInvitationActivity, ((InterfaceC49252d.e) interfaceC49252d).f440751a, new com.avito.android.job.interview.b(jobInterviewInvitationActivity), null, 8, null));
                return;
            }
            if (interfaceC49252d instanceof InterfaceC49252d.f) {
                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = jobInterviewInvitationActivity.f174515r;
                if (collapsingTitleAppBarLayout == null) {
                    collapsingTitleAppBarLayout = null;
                }
                collapsingTitleAppBarLayout.setExpanded(true);
                com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                ViewGroup viewGroup = jobInterviewInvitationActivity.f174520w;
                com.avito.android.component.toast.c.b(cVar2, viewGroup == null ? null : viewGroup, com.avito.android.printable_text.b.c(R.string.interview_invitation_invite_error_snackbar, new Serializable[0]), null, null, null, null, 0, ToastBarPosition.f181044b, null, false, false, null, null, 4030);
                return;
            }
            if (interfaceC49252d instanceof InterfaceC49252d.b) {
                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout2 = jobInterviewInvitationActivity.f174515r;
                (collapsingTitleAppBarLayout2 != null ? collapsingTitleAppBarLayout2 : null).setExpanded(true);
            } else if (interfaceC49252d instanceof InterfaceC49252d.a) {
                jobInterviewInvitationActivity.finish();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC49252d interfaceC49252d) {
            f(interfaceC49252d);
            return G0.f406611a;
        }
    }

    /* compiled from: JobInterviewInvitationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C49251c, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v4, types: [com.avito.android.lib.design.input.Input] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v24 */
        /* JADX WARN: Type inference failed for: r4v25 */
        /* JADX WARN: Type inference failed for: r4v3, types: [com.avito.android.lib.design.input.Input] */
        /* JADX WARN: Type inference failed for: r4v5, types: [com.avito.android.lib.design.input.Input] */
        /* JADX WARN: Type inference failed for: r5v20 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
        public final void f(@k C49251c c49251c) {
            int[] iArr;
            int[] iArr2;
            JobInterviewInvitationActivity jobInterviewInvitationActivity = (JobInterviewInvitationActivity) this.receiver;
            CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = jobInterviewInvitationActivity.f174515r;
            if (collapsingTitleAppBarLayout == null) {
                collapsingTitleAppBarLayout = null;
            }
            collapsingTitleAppBarLayout.setClickListener(jobInterviewInvitationActivity);
            l lVar = jobInterviewInvitationActivity.f174514q;
            if (lVar == null) {
                lVar = null;
            }
            lVar.f231600j = new com.avito.android.job.interview.c(jobInterviewInvitationActivity);
            if (c49251c.f440744c) {
                l lVar2 = jobInterviewInvitationActivity.f174514q;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.k(null);
                ViewGroup viewGroup = jobInterviewInvitationActivity.f174516s;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                K2.d(viewGroup, true);
                ViewGroup viewGroup2 = jobInterviewInvitationActivity.f174520w;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                D6.w(viewGroup2);
                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout2 = jobInterviewInvitationActivity.f174515r;
                (collapsingTitleAppBarLayout2 != null ? collapsingTitleAppBarLayout2 : null).setExpanded(false);
                return;
            }
            if (c49251c.f440745d) {
                l lVar3 = jobInterviewInvitationActivity.f174514q;
                if (lVar3 == null) {
                    lVar3 = null;
                }
                lVar3.a("");
                ViewGroup viewGroup3 = jobInterviewInvitationActivity.f174516s;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                K2.d(viewGroup3, true);
                ViewGroup viewGroup4 = jobInterviewInvitationActivity.f174520w;
                if (viewGroup4 == null) {
                    viewGroup4 = null;
                }
                D6.w(viewGroup4);
                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout3 = jobInterviewInvitationActivity.f174515r;
                (collapsingTitleAppBarLayout3 != null ? collapsingTitleAppBarLayout3 : null).setExpanded(false);
                return;
            }
            l lVar4 = jobInterviewInvitationActivity.f174514q;
            if (lVar4 == null) {
                lVar4 = null;
            }
            lVar4.j();
            ViewGroup viewGroup5 = jobInterviewInvitationActivity.f174520w;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            D6.H(viewGroup5);
            i iVar = c49251c.f440743b;
            List<com.avito.android.job.interview.domain.a> list = iVar.f174560a;
            ComponentContainer componentContainer = jobInterviewInvitationActivity.f174517t;
            if (componentContainer == null) {
                componentContainer = null;
            }
            componentContainer.removeAllViews();
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.android.job.interview.domain.a aVar = (com.avito.android.job.interview.domain.a) obj;
                LayoutInflater layoutInflater = jobInterviewInvitationActivity.getLayoutInflater();
                ViewGroup viewGroup6 = jobInterviewInvitationActivity.f174517t;
                if (viewGroup6 == null) {
                    viewGroup6 = collapsingTitleAppBarLayout;
                }
                View viewInflate = layoutInflater.inflate(R.layout.interview_invitation_date_time_inputs, viewGroup6, false);
                if (aVar.f174545g) {
                    Input.f179303W.getClass();
                    iArr2 = Input.f179304a0;
                } else {
                    Input.f179303W.getClass();
                    iArr2 = Input.f179305b0;
                }
                View viewFindViewById = viewInflate.findViewById(R.id.day_input);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
                }
                Input input = (Input) viewFindViewById;
                String strG = AK.c.g(i12, "date_picker_");
                Input.f179303W.getClass();
                int[] iArr3 = Input.f179304a0;
                InterfaceC49249a.f fVar = new InterfaceC49249a.f(i12);
                input.setTag(strG);
                Input.t(input, aVar.f174539a, false, 6);
                input.setState(iArr3);
                input.setOnClickListener(new h(1, jobInterviewInvitationActivity, fVar));
                View viewFindViewById2 = viewInflate.findViewById(R.id.time_input);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
                }
                Input input2 = (Input) viewFindViewById2;
                String strG2 = AK.c.g(i12, "time_picker_");
                InterfaceC49249a.h hVar = new InterfaceC49249a.h(i12);
                input2.setTag(strG2);
                Input.t(input2, aVar.f174542d, false, 6);
                input2.setState(iArr2);
                input2.setOnClickListener(new h(1, jobInterviewInvitationActivity, hVar));
                ComponentContainer componentContainer2 = jobInterviewInvitationActivity.f174517t;
                if (componentContainer2 == null) {
                    componentContainer2 = null;
                }
                componentContainer2.addView(viewInflate);
                i12 = i13;
                collapsingTitleAppBarLayout = null;
            }
            ViewGroup viewGroup7 = collapsingTitleAppBarLayout;
            Input input3 = jobInterviewInvitationActivity.f174518u;
            ?? r42 = input3;
            if (input3 == null) {
                r42 = viewGroup7;
            }
            C48095e c48095e = iVar.f174561b;
            Input.t(r42, c48095e != null ? c48095e.getText() : viewGroup7, false, 6);
            if (iVar.f174563d) {
                Input.f179303W.getClass();
                iArr = Input.f179304a0;
            } else {
                Input.f179303W.getClass();
                iArr = Input.f179305b0;
            }
            r42.setState(iArr);
            r42.setOnClickListener(new h(2, jobInterviewInvitationActivity, iVar));
            Input input4 = jobInterviewInvitationActivity.f174519v;
            ?? r43 = input4;
            if (input4 == null) {
                r43 = viewGroup7;
            }
            Input.t(r43, iVar.f174562c, true, 2);
            Input input5 = jobInterviewInvitationActivity.f174519v;
            ?? r12 = input5;
            if (input5 == null) {
                r12 = viewGroup7;
            }
            n.c(r12, new com.avito.android.job.interview.d(jobInterviewInvitationActivity));
            ViewGroup viewGroup8 = jobInterviewInvitationActivity.f174521x;
            (viewGroup8 == null ? viewGroup7 : viewGroup8).setOnClickListener(new com.avito.android.imv_similiar_adverts.h(jobInterviewInvitationActivity, 11));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C49251c c49251c) {
            f(c49251c);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f174522l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f174522l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f174522l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return JobInterviewInvitationActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return JobInterviewInvitationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: JobInterviewInvitationActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/job/interview/mvi/logics/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/job/interview/mvi/logics/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<r> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final r invoke() {
            s sVar = JobInterviewInvitationActivity.this.f174512o;
            if (sVar == null) {
                sVar = null;
            }
            return (r) sVar.get();
        }
    }

    @Override // androidx.core.app.ActivityC22757o, ru.avito.component.toolbar.a
    public final void R() {
        a2().accept(InterfaceC49249a.b.f440728a);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.job.interview.di.a.a();
        com.avito.android.job.interview.di.c cVar = (com.avito.android.job.interview.di.c) C29972i.a(C29972i.b(this), com.avito.android.job.interview.di.c.class);
        String stringExtra = getIntent().getStringExtra("interview_invitation_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVarA.a(cVar, stringExtra, new C28478k(InterviewInvitationScreen.f90382d, com.avito.android.analytics.screens.s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f174511n;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f174511n;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    public final r a2() {
        return (r) this.f174513p.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        AddressParameter.Value value;
        super.onActivityResult(i12, i13, intent);
        if (i13 == -1 && i12 == 1234) {
            if (intent != null) {
                value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : intent.getParcelableExtra("EXTRA_ADDRESS_RESULT"));
            } else {
                value = null;
            }
            if (value != null) {
                a2().accept(new InterfaceC49249a.e(value));
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f174511n;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.interview_invitation_activity);
        this.f174514q = new l((ViewGroup) findViewById(R.id.progress_root), R.id.content_container, null, 0, 0, 28, null);
        this.f174515r = (CollapsingTitleAppBarLayout) findViewById(R.id.app_bar);
        this.f174516s = (ViewGroup) findViewById(R.id.content_container);
        this.f174517t = (ComponentContainer) findViewById(R.id.date_time_container);
        this.f174518u = (Input) findViewById(R.id.location_input);
        this.f174519v = (Input) findViewById(R.id.phone_input);
        this.f174520w = (ViewGroup) findViewById(R.id.button_container);
        this.f174521x = (Button) findViewById(R.id.invite_button);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f174511n;
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, a2(), new b(1, this, JobInterviewInvitationActivity.class, "onEvent", "onEvent(Lcom/avito/android/job/interview/mvi/entity/OneTimeEvent;)V", 0), new c(1, this, JobInterviewInvitationActivity.class, "render", "render(Lcom/avito/android/job/interview/mvi/entity/JobInterviewInvitationState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f174511n;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // ru.avito.component.toolbar.a
    public final void u() {
    }
}
