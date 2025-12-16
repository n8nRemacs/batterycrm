package com.avito.android.messenger.connection;

import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import java.util.concurrent.TimeUnit;
import kotlin.C42829l0;
import kotlin.Metadata;

/* compiled from: AvitoMessengerKeepConnectionProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00032\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/l0;", "", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lkotlin/l0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f188852b;

    public g(j jVar) {
        this.f188852b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        C42829l0 c42829l0 = (C42829l0) obj;
        Boolean bool = (Boolean) c42829l0.f406871b;
        Boolean bool2 = (Boolean) c42829l0.f406872c;
        boolean zBooleanValue = ((Boolean) c42829l0.f406873d).booleanValue();
        if (bool2.booleanValue() || zBooleanValue) {
            V2.f318762a.i("KeepConnectionProvider", "App is in foreground or ChannelSyncOnPushAgent has unprocessed requests", null);
            return z.c0(Boolean.TRUE);
        }
        long j12 = bool.booleanValue() ? 60L : 5L;
        V2.f318762a.i("KeepConnectionProvider", androidx.compose.ui.graphics.colorspace.e.i(j12, "App is in background. Disconnect in ", " min"), null);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        j jVar = this.f188852b;
        return z.q(z.c0(Boolean.valueOf(bool.booleanValue() || jVar.f188853a.getF431363c())), z.F0(j12, timeUnit, jVar.f188856d.c()).K(e.f188850b).d0(f.f188851b));
    }
}
