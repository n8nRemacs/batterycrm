package ru.cyberity.cbr.core.common;

import java.net.URISyntaxException;
import java.net.URL;
import kotlin.Metadata;

/* compiled from: ParamValidation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"", "", "b", "(Ljava/lang/String;)Z", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class p0 {
    public static final boolean b(@Y61.l String str) {
        return str != null && str.length() >= 5;
    }

    public static final boolean c(@Y61.k String str) throws URISyntaxException {
        try {
            new URL(str).toURI();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
