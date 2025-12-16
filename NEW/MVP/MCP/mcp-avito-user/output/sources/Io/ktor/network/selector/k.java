package io.ktor.network.selector;

import io.ktor.network.sockets.N;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.T;

/* compiled from: SelectorManager.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/network/selector/k;", "Lkotlinx/coroutines/T;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "a", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface k extends T, Closeable {

    /* compiled from: SelectorManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/selector/k$a;", "", "<init>", "()V", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    @Y61.l
    Object c1(@Y61.k i iVar, @Y61.k SelectInterest selectInterest, @Y61.k ContinuationImpl continuationImpl);

    void t2(@Y61.k N n12);
}
