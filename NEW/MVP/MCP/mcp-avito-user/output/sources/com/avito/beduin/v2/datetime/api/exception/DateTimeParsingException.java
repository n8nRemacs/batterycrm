package com.avito.beduin.v2.datetime.api.exception;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DateTimeParsingException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/datetime/api/exception/DateTimeParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DateTimeParsingException extends RuntimeException {
    public /* synthetic */ DateTimeParsingException(String str, String str2, Throwable th2, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : th2);
    }

    public DateTimeParsingException(@k String str, @k String str2, @l Throwable th2) {
        super(e.n("Cannot parse value ", str, " to ", str2), th2);
    }
}
