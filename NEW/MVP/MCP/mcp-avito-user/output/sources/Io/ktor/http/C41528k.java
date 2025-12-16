package io.ktor.http;

import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: ContentTypes.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41528k {
    @Y61.l
    public static final Charset a(@Y61.k Q q12) {
        String strA = q12.a("charset");
        if (strA == null) {
            return null;
        }
        try {
            return Charset.forName(strA);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
