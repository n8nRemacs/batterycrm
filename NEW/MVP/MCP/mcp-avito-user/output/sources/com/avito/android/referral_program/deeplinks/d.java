package com.avito.android.referral_program.deeplinks;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ReferralPageBaseDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_program/deeplinks/d;", "", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f252647a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.referral_program.c f252648b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a.b f252649c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43238h f252650d;

    @Inject
    public d(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.referral_program.c cVar, @k a.b bVar, @k R0 r02) {
        this.f252647a = interfaceC4053a;
        this.f252648b = cVar;
        this.f252649c = bVar;
        this.f252650d = U.a(r02.b());
    }
}
