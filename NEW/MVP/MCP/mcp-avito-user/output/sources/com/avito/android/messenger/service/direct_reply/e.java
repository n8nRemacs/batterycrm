package com.avito.android.messenger.service.direct_reply;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.notification.m;
import com.avito.android.remote.notification.NotificationIdentifier;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.operators.completable.M;
import io.reactivex.rxjava3.internal.operators.completable.O;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: DirectReplyServiceDelegate.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/direct_reply/e;", "Lcom/avito/android/messenger/service/direct_reply/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f197231a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f197232b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f197233c;

    @Inject
    public e(@Y61.k h hVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f197231a = hVar;
        this.f197232b = interfaceC35745a5;
        this.f197233c = interfaceC35863o4;
    }

    @Override // com.avito.android.messenger.service.direct_reply.c
    public final void a(@Y61.k String str, @l String str2, @l NotificationIdentifier notificationIdentifier, @Y61.k DirectReplyIntentService directReplyIntentService, boolean z12, @l String str3) {
        if (str2 != null && !C43066x.K(str2)) {
            if (str3 == null) {
                str3 = this.f197233c.a();
            }
            M mA2 = this.f197231a.a(str, str2, str3, z12);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC35745a5 interfaceC35745a5 = this.f197232b;
            H hC2 = interfaceC35745a5.c();
            Objects.requireNonNull(timeUnit, "unit is null");
            new O(mA2, timeUnit, hC2).q(interfaceC35745a5.e()).k(new C31684n(directReplyIntentService, 5)).l(new d(directReplyIntentService, str, str2, str3)).r().i();
        }
        if (notificationIdentifier != null) {
            m mVar = directReplyIntentService.f197223c;
            if (mVar == null) {
                mVar = null;
            }
            mVar.b().a(notificationIdentifier.f253962c, notificationIdentifier.f253961b);
        }
    }
}
