package com.avito.android.intermediary_verification;

import Cd.C13243a;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.IntermediaryVerificationScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationArgs;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationWaitingData;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationAction;
import com.avito.android.intermediary_verification.presentation.mvi.l;
import com.avito.android.intermediary_verification.presentation.mvi.m;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import mO.InterfaceC43987a;
import z1.AbstractC50339a;

/* compiled from: IntermediaryVerificationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/intermediary_verification/IntermediaryVerificationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntermediaryVerificationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f173073r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public m f173074m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f173075n = new O0(m0.f406844a.b(l.class), new f(), new e(new h()), new g());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f173076o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public Y41.l<? super IntermediaryVerificationAction, G0> f173077p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f173078q;

    /* compiled from: IntermediaryVerificationActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/intermediary_verification/IntermediaryVerificationActivity$a;", "", "<init>", "()V", "", "CANCELLED", "I", "", "KEY_INTERMEDIARY_VERIFICATION_ARGS", "Ljava/lang/String;", "LEAVE_PUBLISH", "TAG_INTERMEDIARY_VERIFICATION", "VERIFICATION_UPDATE", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IntermediaryVerificationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC43987a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC43987a interfaceC43987a) {
            InterfaceC43987a interfaceC43987a2 = interfaceC43987a;
            IntermediaryVerificationActivity intermediaryVerificationActivity = (IntermediaryVerificationActivity) this.receiver;
            a aVar = IntermediaryVerificationActivity.f173073r;
            intermediaryVerificationActivity.getClass();
            if (interfaceC43987a2 instanceof InterfaceC43987a.C11827a) {
                intermediaryVerificationActivity.setResult(0);
                intermediaryVerificationActivity.finish();
            } else if (interfaceC43987a2 instanceof InterfaceC43987a.c) {
                intermediaryVerificationActivity.setResult(1);
                intermediaryVerificationActivity.finish();
            } else if (interfaceC43987a2 instanceof InterfaceC43987a.d) {
                intermediaryVerificationActivity.setResult(2);
                intermediaryVerificationActivity.finish();
            } else if (interfaceC43987a2 instanceof InterfaceC43987a.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = intermediaryVerificationActivity.f173078q;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC43987a.b) interfaceC43987a2).f414486a, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IntermediaryVerificationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<mO.b, G0> {
        @Override // Y41.l
        public final G0 invoke(mO.b bVar) {
            IntermediaryVerificationActivity intermediaryVerificationActivity = (IntermediaryVerificationActivity) this.receiver;
            a aVar = IntermediaryVerificationActivity.f173073r;
            intermediaryVerificationActivity.getClass();
            IntermediaryVerificationFragment.f173084n0.getClass();
            IntermediaryVerificationFragment intermediaryVerificationFragment = new IntermediaryVerificationFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.intermediary_verification_data", bVar.f414491b);
            intermediaryVerificationFragment.setArguments(bundle);
            androidx.fragment.app.H hE2 = intermediaryVerificationActivity.getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, intermediaryVerificationFragment, "tag.intermediary_verification");
            hE2.e();
            return G0.f406611a;
        }
    }

    /* compiled from: IntermediaryVerificationActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<IntermediaryVerificationAction, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(IntermediaryVerificationAction intermediaryVerificationAction) {
            a aVar = IntermediaryVerificationActivity.f173073r;
            ((l) IntermediaryVerificationActivity.this.f173075n.getValue()).accept(intermediaryVerificationAction);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f173080l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f173080l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f173080l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return IntermediaryVerificationActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return IntermediaryVerificationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: IntermediaryVerificationActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/intermediary_verification/presentation/mvi/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<l> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = IntermediaryVerificationActivity.this.f173074m;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Intent intent = getIntent();
        IntermediaryVerificationArgs intermediaryVerificationArgs = (IntermediaryVerificationArgs) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.intermediary_verification_args", IntermediaryVerificationArgs.class) : intent.getParcelableExtra("key.intermediary_verification_args"));
        if (intermediaryVerificationArgs == null) {
            mO.b.f414489c.getClass();
            IntermediaryVerificationData intermediaryVerificationData = mO.b.f414490d.f414491b;
            intermediaryVerificationData.getClass();
            intermediaryVerificationArgs = new IntermediaryVerificationArgs(intermediaryVerificationData, new IntermediaryVerificationWaitingData(intermediaryVerificationData.f173090b, intermediaryVerificationData.f173091c, intermediaryVerificationData.f173094f, intermediaryVerificationData.f173095g));
        }
        com.avito.android.intermediary_verification.di.a.a().a(intermediaryVerificationArgs.f173088b, intermediaryVerificationArgs.f173089c, new d(), getResources(), new C28478k(IntermediaryVerificationScreen.f90381d, s.a(this), null, 4, null), (com.avito.android.intermediary_verification.di.c) C29972i.a(C29972i.b(this), com.avito.android.intermediary_verification.di.c.class), cv.c.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f173076o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        ScreenPerformanceTracker screenPerformanceTracker = this.f173076o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.b(this, screenPerformanceTracker, (l) this.f173075n.getValue(), new b(1, this, IntermediaryVerificationActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationOneTimeEvent;)V", 0), new c(1, this, IntermediaryVerificationActivity.class, "renderState", "renderState(Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationState;)V", 0));
    }
}
