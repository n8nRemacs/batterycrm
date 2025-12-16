package com.avito.android.authorization.auth;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auth_passwordless.AuthPasswordlessEntryLink;
import com.avito.android.authorization.auth.AuthFragment;
import com.avito.android.authorization.auth.di.a;
import com.avito.android.config.AppType;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.util.C35966w1;
import he.C40918a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ur.C49102c;

/* compiled from: AuthActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/auth/AuthActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f92806m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public C49102c f92807n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f92808o;

    /* compiled from: AuthActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92809a;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.f125475d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f92809a = iArr;
        }
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).k9().a(cv.c.c(this)).a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        C49102c c49102c = this.f92807n;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (c49102c == null) {
            c49102c = null;
        }
        int i12 = 1;
        if (a.f92809a[c49102c.f440309a.ordinal()] == 1) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f92808o;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, new AuthPasswordlessEntryLink(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0), null, null, 6);
            finish();
            return;
        }
        if (bundle == null) {
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            AuthFragment.a aVar2 = AuthFragment.f92815O0;
            Intent intent = getIntent();
            InterfaceC28373a interfaceC28373a = this.f92806m;
            AuthArguments authArgumentsA = C28622a.a(intent, interfaceC28373a != null ? interfaceC28373a : null);
            aVar2.getClass();
            AuthFragment authFragment = new AuthFragment();
            C35966w1.a(authFragment, -1, new C28624c(authArgumentsA));
            hE2.j(R.id.fragment_container, authFragment, "auth_tag", 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        AuthFragment authFragment = (AuthFragment) getSupportFragmentManager().H("auth_tag");
        InterfaceC28373a interfaceC28373a = this.f92806m;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        AuthArguments authArgumentsA = C28622a.a(intent, interfaceC28373a);
        Bundle arguments = authFragment.getArguments();
        if (arguments != null) {
            arguments.putParcelable("key_arguments", authArgumentsA);
        }
        if (authArgumentsA.f92813e) {
            InterfaceC28644x interfaceC28644x = authFragment.f92836y0;
            if (interfaceC28644x == null) {
                interfaceC28644x = null;
            }
            interfaceC28644x.i();
            InterfaceC28644x interfaceC28644x2 = authFragment.f92836y0;
            if (interfaceC28644x2 == null) {
                interfaceC28644x2 = null;
            }
            interfaceC28644x2.g();
        }
        authFragment.K5();
        if (authArgumentsA.f92812d) {
            return;
        }
        InterfaceC28373a interfaceC28373a2 = authFragment.f92837z0;
        (interfaceC28373a2 != null ? interfaceC28373a2 : null).c(new C40918a(authArgumentsA.f92810b));
    }
}
