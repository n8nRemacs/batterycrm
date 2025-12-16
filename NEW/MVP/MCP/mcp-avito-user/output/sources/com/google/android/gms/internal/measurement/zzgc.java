package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import j.P;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public interface zzgc {
    @P
    String zza(ContentResolver contentResolver, String str);

    <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzfz<T> zzfzVar);
}
