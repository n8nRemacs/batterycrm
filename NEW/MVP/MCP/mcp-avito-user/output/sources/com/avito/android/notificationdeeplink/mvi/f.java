package com.avito.android.notificationdeeplink.mvi;

import K30.b;
import K30.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NotificationDeepLinkOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/notificationdeeplink/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "LK30/b;", "LK30/c;", "<init>", "()V", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements t<K30.b, K30.c> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final K30.c b(K30.b bVar) {
        K30.b bVar2 = bVar;
        if (bVar2.equals(b.a.f9234a)) {
            return c.a.f9239a;
        }
        if (!(bVar2 instanceof b.C0550b)) {
            throw new NoWhenBranchMatchedException();
        }
        b.C0550b c0550b = (b.C0550b) bVar2;
        return new c.b(c0550b.f9235a, c0550b.f9236b, c0550b.f9237c, c0550b.f9238d);
    }
}
