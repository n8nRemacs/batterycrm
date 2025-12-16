package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzgl {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f350402a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(zzgl.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = zzgk.zza;
        }
        f350402a = comparator;
    }
}
