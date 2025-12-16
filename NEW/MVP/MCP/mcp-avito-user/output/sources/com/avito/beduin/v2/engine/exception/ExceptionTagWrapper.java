package com.avito.beduin.v2.engine.exception;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ExceptionTagWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/ExceptionTagWrapper;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExceptionTagWrapper extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f336731b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Exception f336732c;

    public ExceptionTagWrapper(@k String str, @l Exception exc) {
        super(exc);
        this.f336731b = str;
        this.f336732c = exc;
    }
}
