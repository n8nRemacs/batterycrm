package com.avito.beduin.v2.engine.exception;

import Y61.k;
import kotlin.Metadata;

/* compiled from: BeduinException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/BeduinException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BeduinException extends Exception {
    @k
    public abstract BeduinExceptionType a();

    @k
    public abstract String b();
}
