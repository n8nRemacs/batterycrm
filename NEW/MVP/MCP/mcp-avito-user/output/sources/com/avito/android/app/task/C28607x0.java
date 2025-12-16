package com.avito.android.app.task;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;

/* compiled from: MessageSendingTracker.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/x0;", "Lcom/avito/android/app/task/u0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.x0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28607x0 implements InterfaceC28598u0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LocalMessage f91743a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f91744b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f91745c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f91746d = new AtomicLong(Long.MIN_VALUE);

    public C28607x0(@Y61.k LocalMessage localMessage, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.server_time.h hVar) {
        this.f91743a = localMessage;
        this.f91744b = interfaceC28373a;
        this.f91745c = hVar;
    }

    @Override // com.avito.android.app.task.InterfaceC28598u0
    public final void a() {
        this.f91746d.compareAndSet(Long.MIN_VALUE, this.f91745c.now());
    }

    @Override // com.avito.android.app.task.InterfaceC28598u0
    public final void b(int i12, boolean z12) {
        long andSet = this.f91746d.getAndSet(Long.MIN_VALUE);
        LocalMessage localMessage = this.f91743a;
        MessageBody body = localMessage.getBody();
        String str = body instanceof MessageBody.Text ? true : body instanceof MessageBody.Link ? "text" : body instanceof MessageBody.Item ? "item" : body instanceof MessageBody.Location ? "location" : body instanceof MessageBody.LocalImage ? "img" : "unsupported";
        if (andSet == Long.MIN_VALUE || str.equals("unsupported")) {
            V2.f318762a.c("MessageSendingTracker", "Tracking skipped", null);
            return;
        }
        long jNow = this.f91745c.now();
        long millis = jNow - MessengerTimestamp.INSTANCE.toMillis(localMessage.getCreated());
        String strI = androidx.compose.foundation.H.i('.', str, z12 ? "success" : "error");
        y.c cVar = new y.c(androidx.camera.camera2.internal.G.f("messenger.resend.attmp-time.", strI), Long.valueOf(jNow - andSet), null);
        InterfaceC28373a interfaceC28373a = this.f91744b;
        interfaceC28373a.c(cVar);
        interfaceC28373a.c(new y.c(androidx.camera.camera2.internal.G.f("messenger.resend.send-time.", strI), Long.valueOf(millis), null));
        interfaceC28373a.c(new y.a(androidx.camera.camera2.internal.G.f("messenger.resend.result-cnt.", strI), 0L, 2, null));
        if (i12 > 0) {
            interfaceC28373a.c(new y.a(androidx.camera.camera2.internal.G.f("messenger.resend.attmp-cnt.", strI), i12));
        }
    }
}
