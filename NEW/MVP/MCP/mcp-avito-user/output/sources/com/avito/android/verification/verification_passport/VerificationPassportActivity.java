package com.avito.android.verification.verification_passport;

import Cd.C13243a;
import VM0.b;
import VM0.c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ru.cyberity.cbr.core.CBRMobileSDK;
import z1.AbstractC50339a;

/* compiled from: VerificationPassportActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_passport/VerificationPassportActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationPassportActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final a f325677s = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public m f325678m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f325679n = new O0(m0.f406844a.b(l.class), new e(), new d(new g()), new f());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public CyberityParams f325680o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public C f325681p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f325682q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public CBRMobileSDK.SDK f325683r;

    /* compiled from: VerificationPassportActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/verification/verification_passport/VerificationPassportActivity$a;", "", "<init>", "()V", "", "CYBERITY_PARAMS_KEY", "Ljava/lang/String;", "RESULT_MESSAGE", "RESULT_SUCCESS", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationPassportActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<VM0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(VM0.b bVar) {
            VM0.b bVar2 = bVar;
            VerificationPassportActivity verificationPassportActivity = (VerificationPassportActivity) this.receiver;
            a aVar = VerificationPassportActivity.f325677s;
            verificationPassportActivity.getClass();
            if (L.f(bVar2, b.a.f17097a)) {
                CBRMobileSDK.SDK sdk = verificationPassportActivity.f325683r;
                if (sdk != null) {
                    sdk.dismiss();
                }
            } else {
                Intent intent = null;
                if (L.f(bVar2, b.C1176b.f17098a)) {
                    verificationPassportActivity.setResult(0, null);
                    verificationPassportActivity.finish();
                } else if (L.f(bVar2, b.d.f17100a)) {
                    verificationPassportActivity.setResult(-1, null);
                    verificationPassportActivity.finish();
                } else if (bVar2 instanceof b.c) {
                    String string = verificationPassportActivity.getString(R.string.sdk_init_error);
                    if (string != null) {
                        intent = new Intent();
                        intent.putExtra("result_message", string);
                        intent.putExtra("result_success", false);
                    }
                    verificationPassportActivity.setResult(-1, intent);
                    verificationPassportActivity.finish();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationPassportActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVM0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LVM0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<VM0.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(VM0.c cVar) {
            a aVar = VerificationPassportActivity.f325677s;
            VerificationPassportActivity.this.getClass();
            boolean z12 = cVar instanceof c.a;
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f325685l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f325685l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f325685l);
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
            return VerificationPassportActivity.this.getF42820b();
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
            return VerificationPassportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: VerificationPassportActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/verification/verification_passport/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/verification/verification_passport/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<l> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = VerificationPassportActivity.this.f325678m;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.verification_passport;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Intent intent = getIntent();
        CyberityParams cyberityParams = (CyberityParams) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("cyberity_params", CyberityParams.class) : intent.getParcelableExtra("cyberity_params"));
        if (cyberityParams == null) {
            throw new IllegalStateException("Cyberity params not found");
        }
        com.avito.android.verification.di.passport.a.a().a(s.a(this), cyberityParams, (com.avito.android.verification.di.passport.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.passport.c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325682q;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.lib.util.i.f181373a.getClass();
        getApplication().registerActivityLifecycleCallbacks(new com.avito.android.lib.util.j(this));
        C c12 = this.f325681p;
        if (c12 == null) {
            c12 = null;
        }
        if (!c12.l()) {
            CyberityParams cyberityParams = this.f325680o;
            if (cyberityParams == null) {
                cyberityParams = null;
            }
            if (L.f(cyberityParams.f325673b, "test")) {
                setResult(-1, null);
                finish();
                finish();
                return;
            }
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f325682q;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        CyberityParams cyberityParams2 = this.f325680o;
        if (cyberityParams2 == null) {
            cyberityParams2 = null;
        }
        String str = cyberityParams2.f325673b;
        CBRMobileSDK.Builder builder = new CBRMobileSDK.Builder(this);
        CyberityParams cyberityParams3 = this.f325680o;
        if (cyberityParams3 == null) {
            cyberityParams3 = null;
        }
        String str2 = cyberityParams3.f325674c;
        if (str2 != null) {
            builder.withBaseUrl(str2);
        }
        CBRMobileSDK.SDK sdkBuild = CBRMobileSDK.Builder.withHandlers$default(builder.withAccessToken(str, new com.avito.android.verification.verification_passport.g()).withTheme(R.style.CyberityTheme), h.f325707l, new i(this), new j(this), null, null, null, null, 120, null).build();
        this.f325683r = sdkBuild;
        if (sdkBuild != null) {
            sdkBuild.launch();
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f325682q;
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (l) this.f325679n.getValue(), new b(1, this, VerificationPassportActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/verification/verification_passport/mvi/entity/PassportOneTimeEvent;)V", 0), new c());
    }
}
