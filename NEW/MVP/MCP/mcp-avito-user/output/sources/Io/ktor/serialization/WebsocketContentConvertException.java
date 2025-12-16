package io.ktor.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ContentConvertException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/serialization/WebsocketContentConvertException;", "Lio/ktor/serialization/ContentConvertException;", "ktor-serialization"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class WebsocketContentConvertException extends ContentConvertException {
    public WebsocketContentConvertException(String str, Throwable th2, int i12, C42822w c42822w) {
        super(str, (i12 & 2) != 0 ? null : th2);
    }
}
