package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzcq extends zzcs implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final zzcq f350299b = new zzcq();

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs zza() {
        return zzcw.f350312b;
    }
}
