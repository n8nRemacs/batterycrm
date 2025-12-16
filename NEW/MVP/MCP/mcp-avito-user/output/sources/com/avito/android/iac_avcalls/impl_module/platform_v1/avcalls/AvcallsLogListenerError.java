package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* compiled from: AvCallsLogListenerImpl.kt */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/AvcallsLogListenerError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AvcallsLogListenerError extends Exception {

    @Y61.k
    private final Throwable cause;

    public AvcallsLogListenerError(@Y61.k Throwable th2) {
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public Throwable getCause() {
        return this.cause;
    }
}
