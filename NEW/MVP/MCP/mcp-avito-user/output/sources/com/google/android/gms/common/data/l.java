package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.C36729v;
import j.N;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class l<T> extends c<T> {

    /* renamed from: d, reason: collision with root package name */
    public Object f349284d;

    @Override // com.google.android.gms.common.data.c, java.util.Iterator
    @N
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(AK.c.g(this.f349282c, "Cannot advance the iterator beyond "));
        }
        int i12 = this.f349282c + 1;
        this.f349282c = i12;
        if (i12 == 0) {
            Object obj = this.f349281b.get(0);
            C36729v.j(obj);
            this.f349284d = obj;
            if (obj instanceof f) {
                return obj;
            }
            throw new IllegalStateException(AK.c.k("DataBuffer reference of type ", String.valueOf(obj.getClass()), " is not movable"));
        }
        f fVar = (f) this.f349284d;
        if (i12 >= 0) {
            throw null;
        }
        C36729v.m(false);
        fVar.f349283a = i12;
        throw null;
    }
}
