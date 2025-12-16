package com.google.android.gms.internal.fido;

import java.util.Collections;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzfi {

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator f350370b = new zzfa();

    /* renamed from: c, reason: collision with root package name */
    public static final zzfi f350371c;

    /* renamed from: a, reason: collision with root package name */
    public final zzfg f350372a;

    static {
        new zzfb();
        f350371c = new zzfi(new zzfg(Collections.emptyList()));
    }

    public zzfi(zzfg zzfgVar) {
        this.f350372a = zzfgVar;
    }

    public static zzfi zza() {
        return f350371c;
    }

    public final boolean equals(@NullableDecl Object obj) {
        return (obj instanceof zzfi) && ((zzfi) obj).f350372a.equals(this.f350372a);
    }

    public final int hashCode() {
        return ~this.f350372a.hashCode();
    }

    public final String toString() {
        return this.f350372a.toString();
    }
}
