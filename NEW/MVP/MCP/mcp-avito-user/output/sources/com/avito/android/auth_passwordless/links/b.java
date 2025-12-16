package com.avito.android.auth_passwordless.links;

import com.avito.android.auth_passwordless.AuthPasswordlessLink;
import com.avito.android.auth_passwordless.AuthPasswordlessScreen;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AuthPasswordlessDeeplinkFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auth_passwordless/links/b;", "Lcom/avito/android/auth_passwordless/links/a;", "<init>", "()V", "a", "_avito_auth-passwordless_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.auth_passwordless.links.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final String f92631a;

    /* compiled from: AuthPasswordlessDeeplinkFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/auth_passwordless/links/b$a;", "", "<init>", "()V", "", "PAGE_PATH", "Ljava/lang/String;", "SCREEN_NAME", "_avito_auth-passwordless_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f92631a = AuthPasswordlessScreen.f92627d.f90471b;
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.auth_passwordless.links.a
    @Y61.k
    public final BeduinV2PageDeepLink a(@Y61.k AuthPasswordlessLink authPasswordlessLink) {
        return new BeduinV2PageDeepLink("/api/1/global/passwordless/start?flow=" + authPasswordlessLink.f92626b, f92631a, false, false, false, null, null, null, false, 480, null);
    }
}
