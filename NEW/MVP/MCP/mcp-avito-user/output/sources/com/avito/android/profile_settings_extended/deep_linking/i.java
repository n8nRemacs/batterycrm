package com.avito.android.profile_settings_extended.deep_linking;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.profile_settings_extended.InterfaceC33472f;
import com.avito.android.remote.analytics.n;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ProfileDisableExtendedLinkAsyncHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/deep_linking/i;", "Lev/a;", "Lcom/avito/android/profile_settings_extended/deep_linking/ProfileDisableExtendedLink;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends AbstractC40161a<ProfileDisableExtendedLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33472f f230067f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f230068g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f230069h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.d f230070i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f230071j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final E f230072k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final n f230073l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f230074m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C43238h f230075n;

    @Inject
    public i(@Y61.k InterfaceC33472f interfaceC33472f, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k a.d dVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12, @Y61.k n nVar, @Y61.k R0 r02) {
        this.f230067f = interfaceC33472f;
        this.f230068g = gVar;
        this.f230069h = iVar;
        this.f230070i = dVar;
        this.f230071j = interfaceC28373a;
        this.f230072k = e12;
        this.f230073l = nVar;
        this.f230074m = r02;
        this.f230075n = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.avito.android.profile_settings_extended.deep_linking.i r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.deep_linking.i.k(com.avito.android.profile_settings_extended.deep_linking.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f230070i.k0(new g(this));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f230075n, null);
    }
}
