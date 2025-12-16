package com.avito.android.offlinization.memory;

import Y61.l;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OutOfDiskException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/memory/OutOfDiskException;", "Ljava/io/IOException;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OutOfDiskException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Throwable f208590b;

    /* JADX WARN: Multi-variable type inference failed */
    public OutOfDiskException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @l
    public final Throwable getCause() {
        return this.f208590b;
    }

    public OutOfDiskException(@l Throwable th2) {
        this.f208590b = th2;
    }

    public /* synthetic */ OutOfDiskException(Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : th2);
    }
}
