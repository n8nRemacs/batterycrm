package com.avito.android.code_confirmation.code_confirmation;

import Zd.InterfaceC19542a;
import ae.C19873a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import com.avito.android.code_confirmation.code_confirmation.m0;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.design.input.Input;
import i.AbstractC41201a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CodeConfirmationActivity.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CodeConfirmationActivity extends com.avito.android.ui.activity.a implements CodeConfirmationPresenter.b, InterfaceC28477j.b {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f119396u = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public CodeConfirmationPresenter f119397m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f119398n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f119399o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public PhoneManagementIntentFactory f119400p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f119401q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public n0 f119402r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f119403s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<G0> f119404t = registerForActivityResult(new a(), new L91.o(this, 16));

    /* compiled from: CodeConfirmationActivity.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/code_confirmation/code_confirmation/CodeConfirmationActivity$a", "Li/a;", "Lkotlin/G0;", "", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC41201a<G0, Boolean> {
        public a() {
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, G0 g02) {
            InterfaceC19542a interfaceC19542a = CodeConfirmationActivity.this.f119398n;
            if (interfaceC19542a == null) {
                interfaceC19542a = null;
            }
            return interfaceC19542a.a(AuthSource.f92726s);
        }

        @Override // i.AbstractC41201a
        public final Boolean parseResult(int i12, Intent intent) {
            return Boolean.valueOf(i12 != -1);
        }
    }

    @Override // com.avito.android.ui.activity.a
    @Y61.k
    public final a.g O1() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 7);
    }

    public final void a2(@Y61.k m0 m0Var) {
        if (m0Var instanceof m0.a) {
            setResult(-1, new Intent().putExtra("key_cc_results", ((m0.a) m0Var).f119572a));
        } else if (m0Var.equals(m0.b.f119573a)) {
            setResult(0);
        } else if (m0Var instanceof m0.c) {
            setResult(-1, new Intent().putExtra("recall_me_result_key", ((m0.c) m0Var).f119574a));
        }
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Intent intent = getIntent();
        int i12 = Build.VERSION.SDK_INT;
        CodeConfirmationSource codeConfirmationSource = (CodeConfirmationSource) (i12 >= 33 ? (Parcelable) intent.getParcelableExtra("src", CodeConfirmationSource.class) : intent.getParcelableExtra("src"));
        if (codeConfirmationSource == null) {
            throw new IllegalStateException("src must be specified");
        }
        com.avito.android.code_confirmation.code_confirmation.di.j.a().a((com.avito.android.code_confirmation.code_confirmation.di.b) C29972i.a(C29972i.b(this), com.avito.android.code_confirmation.code_confirmation.di.b.class), cv.c.a(this), this, getResources(), bundle != null ? com.avito.android.util.G.a(bundle, "presenterState") : null, codeConfirmationSource, com.avito.android.analytics.screens.s.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f119403s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f119403s;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.e();
        setContentView(R.layout.code_confirmation_activity);
        if (bundle == null) {
            Intent intent2 = getIntent();
            Parcelable parcelableExtra = i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("key_sms_cc_params", SmsCodeConfirmationParams.class) : intent2.getParcelableExtra("key_sms_cc_params");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("params must not be null");
            }
            SmsCodeConfirmationParams smsCodeConfirmationParams = (SmsCodeConfirmationParams) parcelableExtra;
            CodeConfirmationPresenter codeConfirmationPresenter = this.f119397m;
            (codeConfirmationPresenter != null ? codeConfirmationPresenter : null).d(smsCodeConfirmationParams.f119433b, smsCodeConfirmationParams.f119435d, smsCodeConfirmationParams.f119436e, smsCodeConfirmationParams.f119437f, smsCodeConfirmationParams.f119438g, smsCodeConfirmationParams.f119439h);
            InterfaceC28373a interfaceC28373a = this.f119401q;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new C19873a(smsCodeConfirmationParams.f119433b, codeConfirmationSource));
        }
        View viewFindViewById = findViewById(android.R.id.content);
        n0 n0Var = this.f119402r;
        if (n0Var == null) {
            n0Var = null;
        }
        f0 f0Var = new f0(viewFindViewById, n0Var);
        CodeConfirmationPresenter codeConfirmationPresenter2 = this.f119397m;
        if (codeConfirmationPresenter2 == null) {
            codeConfirmationPresenter2 = null;
        }
        codeConfirmationPresenter2.f(f0Var);
        if (bundle == null) {
            Input input = f0Var.f119545k;
            input.v();
            input.q();
        }
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f119403s;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        CodeConfirmationPresenter codeConfirmationPresenter = this.f119397m;
        if (codeConfirmationPresenter == null) {
            codeConfirmationPresenter = null;
        }
        codeConfirmationPresenter.e0();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        SmsCodeConfirmationParams smsCodeConfirmationParams = (SmsCodeConfirmationParams) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_sms_cc_params", SmsCodeConfirmationParams.class) : intent.getParcelableExtra("key_sms_cc_params"));
        if (smsCodeConfirmationParams != null) {
            CodeConfirmationPresenter codeConfirmationPresenter = this.f119397m;
            if (codeConfirmationPresenter == null) {
                codeConfirmationPresenter = null;
            }
            codeConfirmationPresenter.d(smsCodeConfirmationParams.f119433b, smsCodeConfirmationParams.f119435d, smsCodeConfirmationParams.f119436e, smsCodeConfirmationParams.f119437f, smsCodeConfirmationParams.f119438g, smsCodeConfirmationParams.f119439h);
        }
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CodeConfirmationPresenter codeConfirmationPresenter = this.f119397m;
        if (codeConfirmationPresenter == null) {
            codeConfirmationPresenter = null;
        }
        com.avito.android.util.G.c(bundle, "presenterState", codeConfirmationPresenter.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        CodeConfirmationPresenter codeConfirmationPresenter = this.f119397m;
        if (codeConfirmationPresenter == null) {
            codeConfirmationPresenter = null;
        }
        codeConfirmationPresenter.c(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        CodeConfirmationPresenter codeConfirmationPresenter = this.f119397m;
        if (codeConfirmationPresenter == null) {
            codeConfirmationPresenter = null;
        }
        codeConfirmationPresenter.c0();
        super.onStop();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(@Y61.l Intent intent) {
        CodeConfirmationPresenter codeConfirmationPresenter = this.f119397m;
        if (codeConfirmationPresenter == null) {
            codeConfirmationPresenter = null;
        }
        codeConfirmationPresenter.a();
        super.startActivity(intent);
    }
}
