package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f358086a;

    public y(Context context) {
        this.f358086a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jA2 = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jA2 += a(file2);
            }
        }
        return jA2;
    }
}
