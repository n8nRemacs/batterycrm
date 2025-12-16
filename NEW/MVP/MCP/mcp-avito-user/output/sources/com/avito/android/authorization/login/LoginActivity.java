package com.avito.android.authorization.login;

import Zd.InterfaceC19542a;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.authorization.login.InterfaceC28677f;
import com.avito.android.authorization.login.di.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.RegisterLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LoginActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/login/LoginActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/authorization/login/f$b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LoginActivity extends com.avito.android.ui.activity.a implements InterfaceC28677f.b, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC28677f f93978m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f93979n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f93980o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public l90.o f93981p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f93982q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public Zd.i f93983r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f93984s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f93985t;

    /* compiled from: LoginActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/authorization/login/LoginActivity$a", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.deeplink_handler.view.impl.k {
        public a() {
            super(LoginActivity.this);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            return (ViewGroup) LoginActivity.this.findViewById(R.id.login_content_container);
        }
    }

    @Override // com.avito.android.ui.activity.a
    @Y61.k
    public final a.g O1() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 2);
    }

    @Override // com.avito.android.ui.activity.a
    @Y61.k
    public final a.i P1() {
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new a();
    }

    public final void a2(int i12) {
        setResult(i12);
        InterfaceC28373a interfaceC28373a = this.f93979n;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        Intent intentPutExtra = Zd.n.b(this, interfaceC28373a).putExtra("result", i12);
        intentPutExtra.setFlags(603979776);
        startActivity(intentPutExtra);
        finish();
    }

    public final void b2(boolean z12) {
        if (!getIntent().getBooleanExtra("is_hidden_login", false) || z12) {
            a2(0);
        } else {
            finish();
        }
    }

    public final void f(@Y61.k DeepLink deepLink) {
        if (deepLink instanceof RegisterLink) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f93984s;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, "login.start_reg.code_check", null, 4);
            return;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f93984s;
        if (aVar2 == null) {
            aVar2 = null;
        }
        b.a.a(aVar2, deepLink, null, null, 6);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        String stringExtra;
        super.onActivityResult(i12, i13, intent);
        if (i12 == 52) {
            if (i13 != -1) {
                if (i13 != 1) {
                    return;
                }
                finish();
            } else {
                if (intent == null || (stringExtra = intent.getStringExtra("key_src_results")) == null) {
                    return;
                }
                InterfaceC28677f interfaceC28677f = this.f93978m;
                if (interfaceC28677f == null) {
                    interfaceC28677f = null;
                }
                interfaceC28677f.a(stringExtra);
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        String stringExtra = getIntent().getStringExtra("login");
        String stringExtra2 = getIntent().getStringExtra("password");
        boolean booleanExtra = getIntent().getBooleanExtra("is_hidden_login", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("skip_saved_login", false);
        String stringExtra3 = getIntent().getStringExtra("suggest_key");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        String str = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("src");
        String stringExtra5 = getIntent().getStringExtra("phone_hint");
        b.a aVarA = com.avito.android.authorization.login.di.a.a();
        com.avito.android.authorization.login.di.c cVar = (com.avito.android.authorization.login.di.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.login.di.c.class);
        com.avito.android.analytics.screens.r rVarA = com.avito.android.analytics.screens.s.a(this);
        Resources resources = getResources();
        Kundle kundleA = bundle != null ? com.avito.android.util.G.a(bundle, "presenter") : null;
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        Parcelable.Creator<CodeConfirmationSource> creator = CodeConfirmationSource.CREATOR;
        aVarA.a(cVar, this, rVarA, resources, kundleA, interfaceC39417aA, str, com.avito.android.analytics.screens.s.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f93985t;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f93985t;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, Q1());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f93985t;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.e();
        setContentView(R.layout.login);
        if (bundle == null) {
            InterfaceC28677f interfaceC28677f = this.f93978m;
            if (interfaceC28677f == null) {
                interfaceC28677f = null;
            }
            interfaceC28677f.a(stringExtra4);
            InterfaceC28677f interfaceC28677f2 = this.f93978m;
            (interfaceC28677f2 != null ? interfaceC28677f2 : null).d(stringExtra, stringExtra2, booleanExtra, stringExtra5, booleanExtra2);
            if (booleanExtra) {
                InterfaceC28373a interfaceC28373a = this.f93979n;
                if (interfaceC28373a == null) {
                    interfaceC28373a = null;
                }
                interfaceC28373a.c(new he.j());
            }
            InterfaceC28373a interfaceC28373a2 = this.f93979n;
            if (interfaceC28373a2 == null) {
                interfaceC28373a2 = null;
            }
            interfaceC28373a2.c(new he.k());
        }
        Q q12 = new Q(findViewById(android.R.id.content));
        InterfaceC28677f interfaceC28677f3 = this.f93978m;
        if (interfaceC28677f3 == null) {
            interfaceC28677f3 = null;
        }
        interfaceC28677f3.c(q12);
        if (bundle == null) {
            q12.e(null);
        }
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f93985t;
        if (screenPerformanceTracker4 == null) {
            screenPerformanceTracker4 = null;
        }
        screenPerformanceTracker4.d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        InterfaceC28677f interfaceC28677f = this.f93978m;
        if (interfaceC28677f == null) {
            interfaceC28677f = null;
        }
        interfaceC28677f.e0();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("login");
        String stringExtra2 = intent.getStringExtra("password");
        boolean booleanExtra = intent.getBooleanExtra("is_hidden_login", false);
        boolean booleanExtra2 = intent.getBooleanExtra("skip_saved_login", false);
        String stringExtra3 = intent.getStringExtra("src");
        String stringExtra4 = intent.getStringExtra("phone_hint");
        InterfaceC28677f interfaceC28677f = this.f93978m;
        if (interfaceC28677f == null) {
            interfaceC28677f = null;
        }
        interfaceC28677f.a(stringExtra3);
        InterfaceC28677f interfaceC28677f2 = this.f93978m;
        if (interfaceC28677f2 == null) {
            interfaceC28677f2 = null;
        }
        interfaceC28677f2.b(this);
        InterfaceC28677f interfaceC28677f3 = this.f93978m;
        (interfaceC28677f3 != null ? interfaceC28677f3 : null).d(stringExtra, stringExtra2, booleanExtra, stringExtra4, booleanExtra2);
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC28677f interfaceC28677f = this.f93978m;
        if (interfaceC28677f == null) {
            interfaceC28677f = null;
        }
        com.avito.android.util.G.c(bundle, "presenter", interfaceC28677f.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        InterfaceC28677f interfaceC28677f = this.f93978m;
        if (interfaceC28677f == null) {
            interfaceC28677f = null;
        }
        interfaceC28677f.b(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        InterfaceC28677f interfaceC28677f = this.f93978m;
        if (interfaceC28677f == null) {
            interfaceC28677f = null;
        }
        interfaceC28677f.c0();
        super.onStop();
    }
}
