package io.ktor.util.cio;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/cio/ChannelWriteException;", "Lio/ktor/util/cio/ChannelIOException;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChannelWriteException extends ChannelIOException {
    public ChannelWriteException(String str, Throwable th2, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? "Cannot write to a channel" : str, th2);
    }
}
