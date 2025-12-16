package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import j.P;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzga implements zzgc {
    @Override // com.google.android.gms.internal.measurement.zzgc
    @P
    public final String zza(ContentResolver contentResolver, String str) {
        Cursor cursorQuery = contentResolver.query(zzfu.zza, null, null, new String[]{str}, null);
        try {
            if (cursorQuery == null) {
                throw new zzgb("Failed to connect to GservicesProvider");
            }
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return null;
            }
            String string = cursorQuery.getString(1);
            cursorQuery.close();
            return string;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzfz<T> zzfzVar) {
        Cursor cursorQuery = contentResolver.query(zzfu.zzb, null, null, strArr, null);
        try {
            if (cursorQuery != null) {
                T t12 = (T) zzfzVar.zza(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    t12.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                cursorQuery.close();
                return t12;
            }
            throw new zzgb("Failed to connect to GservicesProvider");
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
