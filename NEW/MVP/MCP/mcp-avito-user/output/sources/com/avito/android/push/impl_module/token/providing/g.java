package com.avito.android.push.impl_module.token.providing;

import com.avito.android.push.PushService;
import com.avito.android.push.PushToken;
import kotlin.Metadata;
import l41.o;

/* compiled from: PushTokenDataProviderImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/push/PushToken;", "pushToken", "Lfg0/e;", "apply", "(Lcom/avito/android/push/PushToken;)Lfg0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final g<T, R> f245994b = new g<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        PushToken pushToken = (PushToken) obj;
        Qf0.b bVar = Qf0.b.f13970a;
        PushService pushService = pushToken.f245933c;
        bVar.getClass();
        return new fg0.e(pushToken.f245932b, Qf0.b.a(pushService));
    }
}
