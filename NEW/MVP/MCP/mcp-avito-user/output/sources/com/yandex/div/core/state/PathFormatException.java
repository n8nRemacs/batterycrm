package com.yandex.div.core.state;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivStatePath.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/state/PathFormatException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class PathFormatException extends Exception {
    public PathFormatException(String str, Throwable th2, int i12, C42822w c42822w) {
        super(str, (i12 & 2) != 0 ? null : th2);
    }
}
