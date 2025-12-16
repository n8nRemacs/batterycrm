package com.avito.android.cv_upload.screens.cv_upload;

import Cd.C13243a;
import Ot.InterfaceC14733a;
import Ot.b;
import Y41.l;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_upload.screens.cv_upload.CvUploadActivity;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadButton;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: CvUploadActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/CvUploadActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvUploadActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final a f131700q = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.cv_upload.screens.cv_upload.e f131701m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f131702n = new O0(m0.f406844a.b(com.avito.android.cv_upload.screens.cv_upload.d.class), new g(), new f(new i()), new h());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f131703o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f131704p;

    /* compiled from: CvUploadActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/CvUploadActivity$a;", "", "<init>", "()V", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CvUploadActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<Ot.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Ot.b bVar) {
            Ot.b bVar2 = bVar;
            CvUploadActivity cvUploadActivity = (CvUploadActivity) this.receiver;
            a aVar = CvUploadActivity.f131700q;
            cvUploadActivity.getClass();
            if (bVar2 instanceof b.a) {
                if (L.f(com.avito.android.cv_upload.screens.cv_upload.c.a(cvUploadActivity.getIntent()).f131711c, "publish")) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = cvUploadActivity.f131704p;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, ((b.a) bVar2).f12651a, "publish", null, 4);
                } else {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = cvUploadActivity.f131704p;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    b.a.a(aVar3, ((b.a) bVar2).f12651a, null, null, 6);
                }
                cvUploadActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CvUploadActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOt/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LOt/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Ot.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.cv_upload.screens.cv_upload.h f131705l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.cv_upload.screens.cv_upload.h hVar) {
            super(1);
            this.f131705l = hVar;
        }

        @Override // Y41.l
        public final G0 invoke(Ot.c cVar) {
            Ot.c cVar2 = cVar;
            final com.avito.android.cv_upload.screens.cv_upload.h hVar = this.f131705l;
            com.avito.android.progress_overlay.l lVar = hVar.f131724h;
            Throwable th2 = cVar2.f12654d;
            G0 g02 = null;
            if (th2 != null) {
                String message = th2.getMessage();
                if (message != null) {
                    lVar.a(message);
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    lVar.a("");
                }
            } else {
                D6.G(hVar.f131720d, cVar2.f12652b);
                It.c cVar3 = cVar2.f12653c;
                I5.a(hVar.f131721e, cVar3 != null ? cVar3.f8590a : null, false);
                I5.a(hVar.f131722f, cVar3 != null ? cVar3.f8591b : null, false);
                Button button = hVar.f131723g;
                final CvUploadButton cvUploadButton = cVar2.f12655e;
                if (cvUploadButton != null) {
                    com.avito.android.lib.design.button.b.a(button, hVar.f131719c.getString(cvUploadButton.f131764b), false);
                    if (cvUploadButton.f131765c instanceof NoMatchLink) {
                        button.setOnClickListener(new com.avito.android.cv_upload.screens.cv_upload.f(hVar, 1));
                    } else {
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.cv_upload.screens.cv_upload.g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ((CvUploadActivity.d) hVar.f131717a).invoke(new InterfaceC14733a.C0817a(cvUploadButton.f131765c));
                            }
                        });
                    }
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    D6.w(button);
                }
                lVar.j();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CvUploadActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<InterfaceC14733a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14733a interfaceC14733a) {
            ((com.avito.android.cv_upload.screens.cv_upload.d) this.receiver).accept(interfaceC14733a);
            return G0.f406611a;
        }
    }

    /* compiled from: CvUploadActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((CvUploadActivity) this.receiver).finish();
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f131706l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f131706l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f131706l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return CvUploadActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return CvUploadActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: CvUploadActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cv_upload/screens/cv_upload/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.cv_upload.screens.cv_upload.d> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.cv_upload.screens.cv_upload.d invoke() {
            com.avito.android.cv_upload.screens.cv_upload.e eVar = CvUploadActivity.this.f131701m;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.cv_upload.screens.cv_upload.d) eVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.cv_upload.di.cv_upload.e.a().a(s.a(this), (com.avito.android.cv_upload.di.cv_upload.b) C29972i.a(C29972i.b(this), com.avito.android.cv_upload.di.cv_upload.b.class), cv.c.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f131703o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f131703o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.cv_upload_activity);
        CvUploadParams cvUploadParamsA = com.avito.android.cv_upload.screens.cv_upload.c.a(getIntent());
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.root);
        O0 o02 = this.f131702n;
        com.avito.android.cv_upload.screens.cv_upload.h hVar = new com.avito.android.cv_upload.screens.cv_upload.h(viewGroup, cvUploadParamsA, new d(1, (com.avito.android.cv_upload.screens.cv_upload.d) o02.getValue(), com.avito.android.cv_upload.screens.cv_upload.d.class, "accept", "accept(Ljava/lang/Object;)V", 0), new e(0, this, CvUploadActivity.class, "finish", "finish()V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f131703o;
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.cv_upload.screens.cv_upload.d) o02.getValue(), new b(1, this, CvUploadActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadOneTimeEvent;)V", 0), new c(hVar));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f131703o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
        if (bundle == null) {
            ((com.avito.android.cv_upload.screens.cv_upload.d) o02.getValue()).accept(new InterfaceC14733a.b(cvUploadParamsA));
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        ((com.avito.android.cv_upload.screens.cv_upload.d) this.f131702n.getValue()).accept(new InterfaceC14733a.b(com.avito.android.cv_upload.screens.cv_upload.c.a(intent)));
    }
}
