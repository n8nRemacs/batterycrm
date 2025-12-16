package com.avito.android.passport.profile_switch;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.perf_const.PassportSwitchProfileScreen;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: PassportSwitchProfileAsyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_switch/j;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PassportSwitchProfileLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends AbstractC40161a<PassportSwitchProfileLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213685f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f213686g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f213687h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final l f213688i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C25719a f213689j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.d f213690k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Resources f213691l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final a f213692m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C43238h f213693n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f213694o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public UserDialog f213695p;

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k l lVar, @Y61.k C25719a c25719a, @Y61.k a.d dVar, @Y61.k Resources resources, @Y61.k a aVar2, @Y61.k InterfaceC28481c interfaceC28481c, @Y61.k R0 r02) {
        this.f213685f = aVar;
        this.f213686g = gVar;
        this.f213687h = iVar;
        this.f213688i = lVar;
        this.f213689j = c25719a;
        this.f213690k = dVar;
        this.f213691l = resources;
        this.f213692m = aVar2;
        this.f213693n = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
        PassportSwitchProfileScreen passportSwitchProfileScreen = PassportSwitchProfileScreen.f211166d;
        com.avito.android.analytics.screens.r.f90693e.getClass();
        this.f213694o = interfaceC28481c.a(new C28478k(passportSwitchProfileScreen, r.a.a(), "profileSwitch"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.avito.android.passport.profile_switch.j r23, com.avito.android.deep_linking.links.PassportSwitchProfileLink r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_switch.j.k(com.avito.android.passport.profile_switch.j, com.avito.android.deep_linking.links.PassportSwitchProfileLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PassportSwitchProfileLink passportSwitchProfileLink = (PassportSwitchProfileLink) deepLink;
        this.f213689j.a(passportSwitchProfileLink, this, AuthSource.f92689X, new d(this, passportSwitchProfileLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f213693n, null);
    }

    public final void l(DeepLink deepLink) {
        if (deepLink == null) {
            j(PassportSwitchProfileLink.b.c.f133552b);
        } else {
            i(PassportSwitchProfileLink.b.C4012b.f133551b, this.f213685f, deepLink);
        }
    }

    @Override // ev.AbstractC40161a, com.avito.android.deeplink_handler.handler.lifecycle.c
    public final void nc() {
        UserDialog userDialog = this.f213695p;
        if (userDialog == null) {
            return;
        }
        this.f213695p = userDialog;
        this.f213690k.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new i(userDialog, this));
    }
}
