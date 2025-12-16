package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.w;
import j.N;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MultiTransformation.java */
/* loaded from: classes5.dex */
public class i<T> implements n<T> {

    /* renamed from: b, reason: collision with root package name */
    public final List f339194b;

    @SafeVarargs
    public i(@N n<T>... nVarArr) {
        if (nVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f339194b = Arrays.asList(nVarArr);
    }

    @Override // com.bumptech.glide.load.n
    @N
    public final w<T> a(@N Context context, @N w<T> wVar, int i12, int i13) {
        Iterator it = this.f339194b.iterator();
        w<T> wVar2 = wVar;
        while (it.hasNext()) {
            w<T> wVarA = ((n) it.next()).a(context, wVar2, i12, i13);
            if (wVar2 != null && !wVar2.equals(wVar) && !wVar2.equals(wVarA)) {
                wVar2.c();
            }
            wVar2 = wVarA;
        }
        return wVar2;
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        Iterator it = this.f339194b.iterator();
        while (it.hasNext()) {
            ((n) it.next()).b(messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f339194b.equals(((i) obj).f339194b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return this.f339194b.hashCode();
    }
}
