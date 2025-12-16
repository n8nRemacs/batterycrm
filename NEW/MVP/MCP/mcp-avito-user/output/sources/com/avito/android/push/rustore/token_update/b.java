package com.avito.android.push.rustore.token_update;

import com.avito.android.P;
import com.avito.android.push.PushService;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import lg0.InterfaceC43767a;

/* compiled from: RuStorePushTokenStorageSaver.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/push/rustore/token_update/b;", "Lcom/avito/android/push/rustore/token_update/a;", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43767a f246114a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f246115b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final P f246116c;

    @Inject
    public b(@Y61.k InterfaceC43767a interfaceC43767a, @Y61.k com.avito.android.server_time.f fVar, @Y61.k P p12) {
        this.f246114a = interfaceC43767a;
        this.f246115b = fVar;
        this.f246116c = p12;
    }

    @Override // com.avito.android.push.rustore.token_update.a
    public final void a(boolean z12) {
        PushService pushService = PushService.f245927b;
        this.f246114a.d(this.f246116c.f().invoke(), z12, this.f246115b.now());
    }
}
