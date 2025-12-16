package com.avito.android.iac_dialer.impl_module.notifications.channels;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IncomingCallNotificationsChannelChecker.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/h;", "Lcom/avito/android/iac_dialer/impl_module/notifications/channels/g;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final kM.g f166095a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final kM.f f166096b;

    @Inject
    public h(@k kM.g gVar, @k kM.f fVar) {
        this.f166095a = gVar;
        this.f166096b = fVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.notifications.channels.g
    public final boolean a() {
        return this.f166095a.b() == null && this.f166096b.b() == null;
    }
}
