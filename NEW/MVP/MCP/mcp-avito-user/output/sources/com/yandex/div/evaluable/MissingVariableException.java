package com.yandex.div.evaluable;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EvaluableException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/MissingVariableException;", "Lcom/yandex/div/evaluable/EvaluableException;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MissingVariableException extends EvaluableException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f369376b;

    public MissingVariableException(String str, Exception exc, int i12, C42822w c42822w) {
        super(AK.c.k("Variable '", str, "' is missing"), (i12 & 2) != 0 ? null : exc);
        this.f369376b = str;
    }
}
