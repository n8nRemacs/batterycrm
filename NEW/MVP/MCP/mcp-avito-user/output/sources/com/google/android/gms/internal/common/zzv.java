package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class zzv implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f350243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzx f350244c;

    public zzv(zzx zzxVar, CharSequence charSequence) {
        this.f350244c = zzxVar;
        this.f350243b = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        zzx zzxVar = this.f350244c;
        return new zzt(zzxVar.f350251c, zzxVar, this.f350243b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    Object next2 = it.next();
                    next2.getClass();
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e12) {
            throw new AssertionError(e12);
        }
    }
}
