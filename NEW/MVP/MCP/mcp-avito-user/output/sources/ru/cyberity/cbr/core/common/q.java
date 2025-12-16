package ru.cyberity.cbr.core.common;

import kotlin.Metadata;

/* compiled from: CBRVideoIdentUtil.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class q {
    public static final boolean a() {
        try {
            Class.forName("ru.cyberity.cbr.videoident.CBRVideoIdent");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
