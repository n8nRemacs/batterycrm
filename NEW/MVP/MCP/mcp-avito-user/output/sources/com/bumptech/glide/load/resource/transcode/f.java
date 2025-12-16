package com.bumptech.glide.load.resource.transcode;

import j.N;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f339480a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    public static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Z> f339481a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f339482b;

        /* renamed from: c, reason: collision with root package name */
        public final e<Z, R> f339483c;

        public a(@N Class<Z> cls, @N Class<R> cls2, @N e<Z, R> eVar) {
            this.f339481a = cls;
            this.f339482b = cls2;
            this.f339483c = eVar;
        }
    }

    @N
    public final synchronized <Z, R> e<Z, R> a(@N Class<Z> cls, @N Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.f339484a;
        }
        Iterator it = this.f339480a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f339481a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f339482b)) {
                return aVar.f339483c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @N
    public final synchronized ArrayList b(@N Class cls, @N Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f339480a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f339481a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f339482b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public final synchronized <Z, R> void c(@N Class<Z> cls, @N Class<R> cls2, @N e<Z, R> eVar) {
        this.f339480a.add(new a(cls, cls2, eVar));
    }
}
