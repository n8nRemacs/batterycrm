package com.yandex.div.core.expression;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import kotlin.Metadata;

/* compiled from: ExpressionFallbacksHelper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    public static final boolean a(ParsingException parsingException) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.f370546d;
        ParsingExceptionReason parsingExceptionReason2 = parsingException.f370541b;
        return parsingExceptionReason2 == parsingExceptionReason || parsingExceptionReason2 == ParsingExceptionReason.f370548f || parsingExceptionReason2 == ParsingExceptionReason.f370547e;
    }
}
