package com.avito.android.barcode_encoder.exceptions;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WriterException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_encoder/exceptions/WriterException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WriterException extends Exception {
    public final boolean equals(@l Object obj) {
        WriterException writerException = obj instanceof WriterException ? (WriterException) obj : null;
        return L.f(writerException != null ? writerException.getMessage() : null, getMessage());
    }

    public final int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Throwable
    @k
    public final String toString() {
        return "WriterException(" + getMessage() + ')';
    }
}
