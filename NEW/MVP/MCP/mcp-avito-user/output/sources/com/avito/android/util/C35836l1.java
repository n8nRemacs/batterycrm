package com.avito.android.util;

import java.io.File;
import kotlin.Metadata;

/* compiled from: Files.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: com.avito.android.util.l1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35836l1 {
    public static final void a(@Y61.k File file) {
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    @Y61.l
    public static final File b(@Y61.k File file, @Y61.k String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (kotlin.jvm.internal.L.f(file2.getName(), str)) {
                return file2;
            }
        }
        return null;
    }

    public static final long c(@Y61.l File file) {
        long jC2 = 0;
        if (file == null) {
            return 0L;
        }
        try {
            if (!file.exists() || !file.canRead()) {
                return 0L;
            }
            if (file.isFile()) {
                return file.length();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file2 : fileArrListFiles) {
                jC2 += c(file2);
            }
            return jC2;
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
