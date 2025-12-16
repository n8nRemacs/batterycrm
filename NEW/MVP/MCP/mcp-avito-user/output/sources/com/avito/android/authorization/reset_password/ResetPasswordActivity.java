package com.avito.android.authorization.reset_password;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.authorization.reset_password.di.b;
import com.avito.android.authorization.reset_password.k;
import com.avito.android.code_confirmation.code_confirmation.C29388a;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.G;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ResetPasswordActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/reset_password/ResetPasswordActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/authorization/reset_password/k$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ResetPasswordActivity extends com.avito.android.ui.activity.a implements k.a, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public k f94104m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public Zd.i f94105n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f94106o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f94107p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public String f94108q;

    public final void a2(@Y61.l String str, boolean z12) {
        int i12 = 1;
        if (!z12) {
            if (z12) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = -1;
        }
        setResult(i12, new Intent().putExtra("key_src_results", str));
        finish();
    }

    public final void b2(@Y61.k String str, @Y61.k String str2) {
        a2(this.f94108q, false);
        Zd.i iVar = this.f94105n;
        if (iVar == null) {
            iVar = null;
        }
        Intent intentB = iVar.b(str, str2, this.f94108q);
        intentB.setFlags(603979776);
        startActivity(intentB);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        ConfirmedCodeInfo confirmedCodeInfoA;
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1 && i13 == -1) {
            if (intent == null || (confirmedCodeInfoA = C29388a.a(intent)) == null) {
                throw new IllegalStateException("CodeConfirmationResult can't be null");
            }
            b2(confirmedCodeInfoA.f119575b, confirmedCodeInfoA.f119576c);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String stringExtra = getIntent().getStringExtra("login");
        b.a aVarA = com.avito.android.authorization.reset_password.di.a.a();
        com.avito.android.authorization.reset_password.di.c cVar = (com.avito.android.authorization.reset_password.di.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.reset_password.di.c.class);
        com.avito.android.analytics.screens.r rVarA = com.avito.android.analytics.screens.s.a(this);
        Resources resources = getResources();
        Kundle kundleA = bundle != null ? G.a(bundle, "presenter_state") : null;
        Parcelable.Creator<CodeConfirmationSource> creator = CodeConfirmationSource.CREATOR;
        aVarA.a(cVar, this, rVarA, resources, kundleA, cv.c.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f94107p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f94107p;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.e();
        setContentView(R.layout.reset_password_activity);
        if (bundle == null) {
            k kVar = this.f94104m;
            if (kVar == null) {
                kVar = null;
            }
            kVar.b(stringExtra);
            InterfaceC28373a interfaceC28373a = this.f94106o;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new he.p(getIntent().getStringExtra("src")));
        }
        B b12 = new B(findViewById(android.R.id.content));
        k kVar2 = this.f94104m;
        if (kVar2 == null) {
            kVar2 = null;
        }
        kVar2.a(b12);
        if (bundle == null) {
            Input input = b12.f94100c;
            input.v();
            input.q();
        }
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f94107p;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        k kVar = this.f94104m;
        if (kVar == null) {
            kVar = null;
        }
        kVar.e0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k kVar = this.f94104m;
        if (kVar == null) {
            kVar = null;
        }
        G.c(bundle, "presenter_state", kVar.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        k kVar = this.f94104m;
        if (kVar == null) {
            kVar = null;
        }
        kVar.c(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        k kVar = this.f94104m;
        if (kVar == null) {
            kVar = null;
        }
        kVar.c0();
        super.onStop();
    }
}
