package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzcw extends zzcs implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final zzcw f350312b = new zzcw();

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs zza() {
        return zzcq.f350299b;
    }
}
