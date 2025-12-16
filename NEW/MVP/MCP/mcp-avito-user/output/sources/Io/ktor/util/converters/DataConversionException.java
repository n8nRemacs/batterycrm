package io.ktor.util.converters;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConversionService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/util/converters/DataConversionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class DataConversionException extends Exception {
    public DataConversionException() {
        this(null, 1, null);
    }

    public DataConversionException(String str, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? "Invalid data format" : str);
    }
}
