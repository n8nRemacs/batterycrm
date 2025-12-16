package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EvaluableException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/EvaluableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class EvaluableException extends RuntimeException {
    public EvaluableException(String str, Exception exc, int i12, C42822w c42822w) {
        super(str, (i12 & 2) != 0 ? null : exc);
    }
}
