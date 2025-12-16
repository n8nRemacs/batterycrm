package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ChannelFlow.kt */
@I0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/w;", "T", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface w<T> extends InterfaceC43160i<T> {

    /* compiled from: ChannelFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ InterfaceC43160i a(w wVar, CoroutineContext coroutineContext, int i12, BufferOverflow bufferOverflow, int i13) {
            if ((i13 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i13 & 2) != 0) {
                i12 = -3;
            }
            if ((i13 & 4) != 0) {
                bufferOverflow = BufferOverflow.f410777b;
            }
            return wVar.Bc(coroutineContext, i12, bufferOverflow);
        }
    }

    @Y61.k
    InterfaceC43160i<T> Bc(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow);
}
