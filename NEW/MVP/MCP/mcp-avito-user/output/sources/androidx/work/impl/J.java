package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: WorkDatabasePathHelper.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/J;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final J f55536a = new J();

    @X41.n
    public static final void a(@Y61.k Context context) {
        f55536a.getClass();
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            androidx.work.G gA2 = androidx.work.G.a();
            String[] strArr = K.f55537a;
            gA2.getClass();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            C23546a.f55569a.getClass();
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            String[] strArr2 = K.f55537a;
            int iF2 = P0.f(strArr2.length);
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : P0.l(linkedHashMap, new kotlin.Q(databasePath, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        androidx.work.G gA3 = androidx.work.G.a();
                        String[] strArr3 = K.f55537a;
                        file3.toString();
                        gA3.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    androidx.work.G gA4 = androidx.work.G.a();
                    String[] strArr4 = K.f55537a;
                    gA4.getClass();
                }
            }
        }
    }
}
