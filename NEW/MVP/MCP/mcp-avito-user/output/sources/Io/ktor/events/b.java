package io.ktor.events;

import Y61.k;
import io.ktor.util.collections.f;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.internal.C;
import kotlinx.coroutines.internal.E;

/* compiled from: Events.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/events/b;", "", "<init>", "()V", "a", "ktor-events"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f<io.ktor.events.a<?>, C> f399838a = new f<>();

    /* compiled from: Events.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/events/b$a;", "Lkotlinx/coroutines/internal/E;", "Lkotlinx/coroutines/o0;", "ktor-events"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends E implements InterfaceC43268o0 {
    }

    public final <T> void a(@k io.ktor.events.a<T> aVar, T t12) {
        G0 g02;
        C c12 = (C) this.f399838a.a(aVar);
        Throwable th2 = null;
        if (c12 != null) {
            Throwable th3 = null;
            for (E eG2 = (E) c12.f(); !eG2.equals(c12); eG2 = eG2.g()) {
                if (eG2 instanceof a) {
                    try {
                        v0.e(1, null);
                        throw null;
                    } catch (Throwable th4) {
                        if (th3 != null) {
                            C42833p.a(th3, th4);
                            g02 = G0.f406611a;
                        } else {
                            g02 = null;
                        }
                        if (g02 == null) {
                            th3 = th4;
                        }
                    }
                }
            }
            th2 = th3;
        }
        if (th2 != null) {
            throw th2;
        }
    }
}
