package io.ktor.http.parsing;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ParseException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/parsing/ParseException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ParseException extends IllegalArgumentException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f400102b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Throwable f400103c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ParseException(String str, Throwable th2, int i12, C42822w c42822w) {
        th2 = (i12 & 2) != 0 ? null : th2;
        super(str, th2);
        this.f400102b = str;
        this.f400103c = th2;
    }

    @Override // java.lang.Throwable
    @Y61.l
    public final Throwable getCause() {
        return this.f400103c;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String getMessage() {
        return this.f400102b;
    }
}
