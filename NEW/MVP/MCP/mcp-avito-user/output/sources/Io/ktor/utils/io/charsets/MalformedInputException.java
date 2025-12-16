package io.ktor.utils.io.charsets;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: CharsetJVM.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/charsets/MalformedInputException;", "Ljava/nio/charset/MalformedInputException;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class MalformedInputException extends java.nio.charset.MalformedInputException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f400859b;

    public MalformedInputException(@k String str) {
        super(0);
        this.f400859b = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    @l
    public final String getMessage() {
        return this.f400859b;
    }
}
