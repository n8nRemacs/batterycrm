package com.bumptech.glide.provider;

import com.bumptech.glide.load.l;
import j.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f339529a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f339530b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    public static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f339531a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f339532b;

        /* renamed from: c, reason: collision with root package name */
        public final l<T, R> f339533c;

        public a(@N Class<T> cls, @N Class<R> cls2, l<T, R> lVar) {
            this.f339531a = cls;
            this.f339532b = cls2;
            this.f339533c = lVar;
        }
    }

    public final synchronized void a(@N l lVar, @N Class cls, @N Class cls2, @N String str) {
        c(str).add(new a<>(cls, cls2, lVar));
    }

    @N
    public final synchronized ArrayList b(@N Class cls, @N Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f339529a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f339530b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.f339531a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f339532b)) {
                        arrayList.add(aVar.f339533c);
                    }
                }
            }
        }
        return arrayList;
    }

    @N
    public final synchronized List<a<?, ?>> c(@N String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f339529a.contains(str)) {
                this.f339529a.add(str);
            }
            arrayList = (List) this.f339530b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f339530b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @N
    public final synchronized ArrayList d(@N Class cls, @N Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f339529a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f339530b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.f339531a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f339532b)) && !arrayList.contains(aVar.f339532b)) {
                        arrayList.add(aVar.f339532b);
                    }
                }
            }
        }
        return arrayList;
    }
}
