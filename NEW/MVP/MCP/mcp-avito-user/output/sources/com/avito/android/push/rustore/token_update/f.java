package com.avito.android.push.rustore.token_update;

import com.avito.android.P;
import com.avito.android.push.PushService;
import com.squareup.anvil.annotations.ContributesBinding;
import hg0.InterfaceC40932a;
import ig0.AbstractC41398a;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lg0.InterfaceC43768b;

/* compiled from: RuStorePushTokenUpdateChecker.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/rustore/token_update/f;", "Lcom/avito/android/push/rustore/token_update/e;", "a", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43768b f246120a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f246121b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final P f246122c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40932a f246123d;

    /* compiled from: RuStorePushTokenUpdateChecker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/rustore/token_update/f$a;", "", "<init>", "()V", "", "TOKEN_SYNC_PERIOD_DAYS", "J", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k InterfaceC43768b interfaceC43768b, @Y61.k com.avito.android.server_time.f fVar, @Y61.k P p12, @Y61.k InterfaceC40932a interfaceC40932a) {
        this.f246120a = interfaceC43768b;
        this.f246121b = fVar;
        this.f246122c = p12;
        this.f246123d = interfaceC40932a;
    }

    @Override // com.avito.android.push.rustore.token_update.e
    public final boolean a(@Y61.k AbstractC41398a abstractC41398a, boolean z12) {
        AbstractC41398a.b bVar = AbstractC41398a.b.f398616c;
        if (abstractC41398a.equals(bVar) && this.f246123d.getF17351b()) {
            return false;
        }
        if (abstractC41398a.equals(bVar)) {
            return true;
        }
        if (!abstractC41398a.equals(AbstractC41398a.d.f398617c)) {
            PushService pushService = PushService.f245927b;
            InterfaceC43768b interfaceC43768b = this.f246120a;
            if (this.f246121b.now() - interfaceC43768b.b(z12) <= TimeUnit.DAYS.toMillis(14L) && L.f(this.f246122c.f().invoke(), interfaceC43768b.c(z12))) {
                return false;
            }
        }
        return true;
    }
}
