package io.ktor.utils.io.internal;

import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class s {
    public static final int a(int i12, @Y61.k String str) {
        String property;
        Integer numY0;
        try {
            property = System.getProperty("io.ktor.utils.io.".concat(str));
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (numY0 = C43066x.y0(property)) == null) ? i12 : numY0.intValue();
    }
}
