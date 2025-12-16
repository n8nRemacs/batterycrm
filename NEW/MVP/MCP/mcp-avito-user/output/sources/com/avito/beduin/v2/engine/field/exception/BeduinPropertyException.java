package com.avito.beduin.v2.engine.field.exception;

import Y61.k;
import kotlin.Metadata;

/* compiled from: BeduinPropertyException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/exception/BeduinPropertyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BeduinPropertyException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f336863b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Exception f336864c;

    public BeduinPropertyException(@k String str, @k Exception exc) {
        super(str, exc);
        this.f336863b = str;
        this.f336864c = exc;
    }

    @Override // java.lang.Throwable
    @k
    public final Throwable getCause() {
        return this.f336864c;
    }
}
