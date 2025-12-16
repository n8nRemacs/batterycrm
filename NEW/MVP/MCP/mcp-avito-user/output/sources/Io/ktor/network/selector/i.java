package io.ktor.network.selector;

import java.io.Closeable;
import java.nio.channels.SelectableChannel;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC43268o0;

/* compiled from: JvmSelector.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/network/selector/i;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/o0;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface i extends Closeable, InterfaceC43268o0 {
    void O0(@Y61.k SelectInterest selectInterest, boolean z12);

    @Y61.k
    e Q1();

    int e2();

    boolean isClosed();

    @Y61.k
    SelectableChannel r();
}
