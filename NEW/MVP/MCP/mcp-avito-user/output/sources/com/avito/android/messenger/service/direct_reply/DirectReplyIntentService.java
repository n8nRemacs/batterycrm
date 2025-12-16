package com.avito.android.messenger.service.direct_reply;

import android.app.IntentService;
import android.os.Build;
import androidx.compose.runtime.internal.P;
import com.avito.android.InterfaceC31091j1;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.di.C32481m0;
import com.avito.android.messenger.di.InterfaceC32498s0;
import com.avito.android.messenger.di.InterfaceC32501t0;
import com.avito.android.messenger.service.direct_reply.c;
import com.avito.android.notification.m;
import com.avito.android.remote.notification.A;
import com.avito.android.util.L5;
import j.e0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DirectReplyIntentService.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/service/direct_reply/DirectReplyIntentService;", "Landroid/app/IntentService;", "Lcom/avito/android/messenger/service/direct_reply/c$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DirectReplyIntentService extends IntentService implements c.a {

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public c f197222b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public m f197223c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public InterfaceC31091j1 f197224d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public A f197225e;

    /* renamed from: f, reason: collision with root package name */
    public final int f197226f;

    public DirectReplyIntentService() {
        super("DirectReplyIntentService");
        setIntentRedelivery(true);
        this.f197226f = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
    }

    public final void a(@e0 int i12) {
        L5.a(getApplicationContext(), i12, 0);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        InterfaceC32498s0.a aVarA = C32481m0.a();
        aVarA.a((InterfaceC32501t0) C29972i.a(C29972i.b(this), InterfaceC32501t0.class));
        aVarA.build().a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onHandleIntent(@Y61.l android.content.Intent r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "channel_id"
            java.lang.String r2 = r9.getStringExtra(r0)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "direct_reply_key"
            java.lang.String r0 = r9.getStringExtra(r0)
            java.lang.String r1 = "notification_id"
            android.os.Parcelable r1 = r9.getParcelableExtra(r1)
            r4 = r1
            com.avito.android.remote.notification.NotificationIdentifier r4 = (com.avito.android.remote.notification.NotificationIdentifier) r4
            r1 = 0
            if (r0 == 0) goto L32
            android.os.Bundle r3 = android.app.RemoteInput.getResultsFromIntent(r9)
            if (r3 == 0) goto L30
            java.lang.CharSequence r0 = r3.getCharSequence(r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = r0.toString()
        L2e:
            r3 = r0
            goto L39
        L30:
            r3 = r1
            goto L39
        L32:
            java.lang.String r0 = "text"
            java.lang.String r0 = r9.getStringExtra(r0)
            goto L2e
        L39:
            java.lang.String r0 = "is_retry"
            r5 = 0
            boolean r6 = r9.getBooleanExtra(r0, r5)
            java.lang.String r0 = "random_id"
            java.lang.String r7 = r9.getStringExtra(r0)
            com.avito.android.messenger.service.direct_reply.c r9 = r8.f197222b
            if (r9 == 0) goto L4b
            r1 = r9
        L4b:
            r5 = r8
            r1.a(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.service.direct_reply.DirectReplyIntentService.onHandleIntent(android.content.Intent):void");
    }
}
