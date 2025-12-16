package com.avito.android.messenger.service.direct_reply;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.E;
import androidx.core.app.z;
import com.avito.android.InterfaceC31091j1;
import com.avito.android.R;
import com.avito.android.notification.m;
import com.avito.android.remote.notification.A;
import kotlin.Metadata;

/* compiled from: DirectReplyServiceDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DirectReplyIntentService f197227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197228c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f197229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f197230e;

    public d(DirectReplyIntentService directReplyIntentService, String str, String str2, String str3) {
        this.f197227b = directReplyIntentService;
        this.f197228c = str;
        this.f197229d = str2;
        this.f197230e = str3;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DirectReplyIntentService directReplyIntentService = this.f197227b;
        directReplyIntentService.a(R.string.messenger_direct_reply_failed);
        String str = this.f197228c;
        InterfaceC31091j1 interfaceC31091j1 = directReplyIntentService.f197224d;
        if (interfaceC31091j1 == null) {
            interfaceC31091j1 = null;
        }
        String str2 = this.f197229d;
        Intent intentD = interfaceC31091j1.d(str, str2, this.f197230e);
        int iHashCode = str2.hashCode() + (str.hashCode() * 31);
        m mVar = directReplyIntentService.f197223c;
        if (mVar == null) {
            mVar = null;
        }
        E eB2 = mVar.b();
        PendingIntent service = PendingIntent.getService(directReplyIntentService.getApplicationContext(), 100, intentD, directReplyIntentService.f197226f);
        A a12 = directReplyIntentService.f197225e;
        z.n nVar = new z.n(directReplyIntentService, (a12 != null ? a12 : null).b());
        nVar.f44585e = z.n.c(directReplyIntentService.getString(R.string.messenger_direct_reply_message_not_sent));
        nVar.f44586f = z.n.c(directReplyIntentService.getString(R.string.messenger_direct_reply_tap_to_resend, str2));
        nVar.f44578B.icon = R.drawable.ic_notification;
        nVar.f44587g = service;
        nVar.f44601u = androidx.core.content.d.getColor(directReplyIntentService, R.color.legacy_red);
        nVar.g(16, true);
        eB2.d("tag_channel", iHashCode, nVar.b());
    }
}
