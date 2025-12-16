package com.yandex.div.core.view2.errors;

import kotlin.Metadata;

/* compiled from: ErrorVisualMonitor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class q {
    public static final String a(Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th2.getMessage());
        for (Throwable cause = th2.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append('\n');
            sb2.append(cause.getMessage());
        }
        return sb2.toString();
    }
}
