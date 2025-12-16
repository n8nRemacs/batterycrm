package com.avito.avcalls.signaling.transport.external;

import Y61.k;
import Y61.l;
import com.avito.avcalls.call.models.MessageChannel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ExternalMessageReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/transport/external/a;", "Lcom/avito/avcalls/signaling/transport/b;", "<init>", "()V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.avcalls.signaling.transport.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final com.avito.avcalls.utils.logs.a f333392b = new com.avito.avcalls.utils.logs.a("ExternalMessageReceiver");

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e2 f333393a = f2.b(0, 100, null, 5);

    @l
    public final Object a(@k String str, @k MessageChannel messageChannel, @k SuspendLambda suspendLambda) {
        f333392b.b("onNewIncomingMessage", "channel=" + messageChannel, "payload=" + com.avito.avcalls.utils.l.c(str));
        Object objEmit = this.f333393a.emit(new Q(str, messageChannel), suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }
}
