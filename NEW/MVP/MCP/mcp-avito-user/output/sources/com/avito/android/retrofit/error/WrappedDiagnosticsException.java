package com.avito.android.retrofit.error;

import Y61.k;
import Y61.l;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: WrappedDiagnosticsException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/error/WrappedDiagnosticsException;", "Ljava/io/IOException;", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WrappedDiagnosticsException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f255124b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f255125c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Exception f255126d;

    public WrappedDiagnosticsException(@l String str, @l String str2, @k Exception exc) {
        super(exc);
        this.f255124b = str;
        this.f255125c = str2;
        this.f255126d = exc;
    }
}
