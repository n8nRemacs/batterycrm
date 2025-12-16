package com.google.android.gms.internal.fido;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzfg extends AbstractMap {

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator f350363g = new zzfd();

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f350364b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f350365c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f350366d = new zzff(this);

    /* renamed from: e, reason: collision with root package name */
    public Integer f350367e = null;

    /* renamed from: f, reason: collision with root package name */
    public String f350368f = null;

    public zzfg(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ((zzfc) it.next()).getClass();
            throw null;
        }
        int size = list.size();
        Object[] objArrCopyOf = new Object[size];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            ((zzfc) it2.next()).getClass();
            throw null;
        }
        int[] iArr = {0};
        if (size > 16 && size * 9 > 0) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, 0);
        }
        this.f350364b = objArrCopyOf;
        this.f350365c = iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f350366d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f350367e == null) {
            this.f350367e = Integer.valueOf(super.hashCode());
        }
        return this.f350367e.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f350368f == null) {
            this.f350368f = super.toString();
        }
        return this.f350368f;
    }
}
