package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzcm extends zzdc {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f350297c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Object f350298b;

    public zzcm(Object obj) {
        this.f350298b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350298b != f350297c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f350298b;
        Object obj2 = f350297c;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f350298b = obj2;
        return obj;
    }
}
