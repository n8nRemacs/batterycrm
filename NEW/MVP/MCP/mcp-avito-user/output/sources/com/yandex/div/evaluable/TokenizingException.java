package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EvaluableException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/TokenizingException;", "Lcom/yandex/div/evaluable/EvaluableException;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class TokenizingException extends EvaluableException {
    public TokenizingException(String str, Exception exc, int i12, C42822w c42822w) {
        super(str, (i12 & 2) != 0 ? null : exc);
    }
}
