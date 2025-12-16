package com.avito.android.app.task;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NoRetryException.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/app/task/NoRetryException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NoRetryException extends RuntimeException {
    public NoRetryException(String str, Throwable th2, int i12, C42822w c42822w) {
        super(str, (i12 & 2) != 0 ? null : th2);
    }
}
