package io.ktor.client.engine;

import java.util.concurrent.CancellationException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.P0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class z extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P0 f398992l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(P0 p02) {
        super(1);
        this.f398992l = p02;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        if (th3 != null) {
            this.f398992l.V(new CancellationException(th3.getMessage()));
        }
        return G0.f406611a;
    }
}
