package com.avito.beduin.v2.engine.exception;

import Y61.k;
import com.avito.beduin.v2.engine.utils.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinException.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/AbstractBeduinException;", "Lcom/avito/beduin/v2/engine/exception/BeduinException;", "a", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "Lcom/avito/beduin/v2/engine/exception/RendererBeduinException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractBeduinException extends BeduinException {

    /* compiled from: BeduinException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/AbstractBeduinException$a;", "", "<init>", "()V", "", "COMPACT_TRACE_SYMBOLS_COUNT", "I", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public AbstractBeduinException(String str, Throwable th2, C42822w c42822w) {
        super(str, th2);
    }

    @k
    public final String c() {
        return d.c(d.b(this), d.a(getCause()));
    }
}
