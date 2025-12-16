package wQ0;

import Y61.k;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.rtc.p;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AudioDeviceImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"LwQ0/d;", "LwQ0/a;", "LwQ0/e;", "<init>", "()V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements InterfaceC49552a, e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public Object f441436a = C42784z0.f406748b;

    @Override // wQ0.e
    public final void a(@k p pVar) {
        g.Companion companion = g.INSTANCE;
        String str = "unregisterPeerConnection id=" + pVar.f331968a;
        companion.getClass();
        g.Companion.c("AudioDevice", str);
        this.f441436a = C42745f0.c0((Iterable) this.f441436a, pVar);
    }

    @Override // wQ0.e
    public final void b(@k p pVar) {
        g.Companion companion = g.INSTANCE;
        String str = "registerPeerConnection id=" + pVar.f331968a;
        companion.getClass();
        g.Companion.c("AudioDevice", str);
        this.f441436a = C42745f0.i0(pVar, (Collection) this.f441436a);
    }
}
