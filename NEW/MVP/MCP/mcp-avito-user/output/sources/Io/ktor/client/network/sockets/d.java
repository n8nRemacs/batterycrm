package io.ktor.client.network.sockets;

import Y41.l;
import io.ktor.client.plugins.k0;
import io.ktor.client.request.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimeoutExceptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "cause", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class d extends N implements l<Throwable, Throwable> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e0 f399002l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e0 e0Var) {
        super(1);
        this.f399002l = e0Var;
    }

    @Override // Y41.l
    public final Throwable invoke(Throwable th2) {
        Throwable th3 = th2;
        Throwable th4 = null;
        if (th3 != null) {
            Throwable cause = th3;
            while (true) {
                if ((cause != null ? cause.getCause() : null) == null) {
                    break;
                }
                cause = cause.getCause();
            }
            th4 = cause;
        }
        return th4 instanceof java.net.SocketTimeoutException ? k0.b(this.f399002l, th3) : th3;
    }
}
