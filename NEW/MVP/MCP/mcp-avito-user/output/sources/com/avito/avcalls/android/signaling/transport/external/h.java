package com.avito.avcalls.android.signaling.transport.external;

import Y61.k;
import Y61.l;
import com.avito.avcalls.android.a;
import com.avito.avcalls.android.logger.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;
import vQ0.AbstractC49254b;
import vQ0.C49253a;

/* compiled from: ExternalMessageSender.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/signaling/transport/external/h;", "Lcom/avito/avcalls/android/signaling/transport/c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.avcalls.android.signaling.transport.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a.e f332183a;

    public h(@k a.e eVar) {
        this.f332183a = eVar;
    }

    public static final void a(h hVar, Y41.a aVar) {
        hVar.getClass();
        try {
            aVar.invoke();
        } catch (Exception e12) {
            C49253a.Companion companion = C49253a.INSTANCE;
            String message = e12.getMessage();
            if (message == null) {
                message = e12.toString();
            }
            AbstractC49254b.d.a aVar2 = new AbstractC49254b.d.a(message);
            companion.getClass();
            C49253a.Companion.a(aVar2);
            com.avito.avcalls.android.logger.g.INSTANCE.getClass();
            g.Companion.a("ExternalMessageSender", "error on trying to resume", e12);
        }
    }

    @l
    public final Object b(@k String str, @k String str2, @k Continuation<? super String> continuation) {
        r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        try {
            rVar.r(new b(this.f332183a.a(str, str2, new e(this, rVar), new g(this, rVar))));
        } catch (Exception e12) {
            a(this, new c(rVar, e12));
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }
}
