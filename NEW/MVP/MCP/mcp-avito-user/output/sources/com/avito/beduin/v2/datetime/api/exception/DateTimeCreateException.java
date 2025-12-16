package com.avito.beduin.v2.datetime.api.exception;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DateTimeCreateException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/datetime/api/exception/DateTimeCreateException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DateTimeCreateException extends RuntimeException {
    public /* synthetic */ DateTimeCreateException(String str, Throwable th2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : th2);
    }

    public DateTimeCreateException(@k String str, @l Throwable th2) {
        super("Cannot create value ".concat(str), th2);
    }
}
