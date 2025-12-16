package com.avito.android.push.hms;

import Y61.k;
import android.content.Context;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.push.PushService;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import fg0.InterfaceC40420d;
import fg0.f;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HmsPushTokenProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/push/hms/e;", "Lfg0/d;", "_avito_push-hms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements InterfaceC40420d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f245940a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f245941b;

    @Inject
    public e(@k Context context, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f245940a = context;
        this.f245941b = interfaceC35745a5;
    }

    @Override // fg0.InterfaceC40420d
    @k
    public final I<? extends fg0.f> a(@k String str) {
        b.f245938a.getClass();
        if (b.a(this.f245940a)) {
            return new G(new VH0.c(this, 27)).z(this.f245941b.a()).u(new C32102w0(22));
        }
        V2.f318762a.c("HMSPushTokenProvider", AK.c.k("[", str, "] Hms service is not available"), null);
        return I.q(f.b.f396039a);
    }

    @Override // fg0.InterfaceC40420d
    @k
    public final PushService getType() {
        return PushService.f245928c;
    }
}
