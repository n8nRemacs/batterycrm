package com.avito.beduin.v2.engine.utils;

import Y61.k;
import com.avito.beduin.v2.engine.exception.BeduinException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.m0;

/* compiled from: ExceptionExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"api_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {
    public static List a(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (th2 != null) {
                arrayList.add(b(th2));
            }
            if ((th2 != null ? th2.getCause() : null) == null) {
                return arrayList;
            }
            th2 = th2.getCause();
        }
    }

    @k
    public static final String b(@k Throwable th2) {
        if (th2 instanceof BeduinException) {
            StringBuilder sb2 = new StringBuilder();
            BeduinException beduinException = (BeduinException) th2;
            sb2.append(beduinException.getF336734c());
            sb2.append(": ");
            sb2.append(beduinException.getF336733b());
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        sb3.append(message);
        sb3.append(": ");
        sb3.append(m0.f406844a.b(th2.getClass()).l0());
        return sb3.toString();
    }

    @k
    public static final String c(@k String str, @k Collection<String> collection) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error in ".concat(str));
        if (!collection.isEmpty()) {
            sb2.append(C42745f0.O(collection, "\n\tcaused by ", "\n\tcaused by ", null, null, 60));
        }
        return sb2.toString();
    }
}
