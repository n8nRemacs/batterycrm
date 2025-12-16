package com.bumptech.glide.load.model;

import androidx.core.util.y;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.r;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes5.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final r f339243a;

    /* renamed from: b, reason: collision with root package name */
    public final a f339244b;

    /* compiled from: ModelLoaderRegistry.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f339245a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: com.bumptech.glide.load.model.p$a$a, reason: collision with other inner class name */
        public static class C10512a<Model> {

            /* renamed from: a, reason: collision with root package name */
            public final List<n<Model, ?>> f339246a;

            public C10512a(List<n<Model, ?>> list) {
                this.f339246a = list;
            }
        }
    }

    public p(@N y.a<List<Throwable>> aVar) {
        r rVar = new r(aVar);
        this.f339244b = new a();
        this.f339243a = rVar;
    }

    public final synchronized <Model, Data> void a(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
        r rVar = this.f339243a;
        synchronized (rVar) {
            try {
                r.b bVar = new r.b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f339258a;
                arrayList.add(arrayList.size(), bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f339244b.f339245a.clear();
    }

    @N
    public final <A> List<n<A, ?>> b(@N A a12) {
        List listUnmodifiableList;
        Class<?> cls = a12.getClass();
        synchronized (this) {
            a.C10512a c10512a = (a.C10512a) this.f339244b.f339245a.get(cls);
            listUnmodifiableList = c10512a == null ? null : c10512a.f339246a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(this.f339243a.c(cls));
                if (((a.C10512a) this.f339244b.f339245a.put(cls, new a.C10512a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + a12.getClass());
        }
        int size = listUnmodifiableList.size();
        List<n<A, ?>> listEmptyList = Collections.emptyList();
        boolean z12 = true;
        for (int i12 = 0; i12 < size; i12++) {
            n<A, ?> nVar = (n) listUnmodifiableList.get(i12);
            if (nVar.b(a12)) {
                if (z12) {
                    listEmptyList = new ArrayList<>(size - i12);
                    z12 = false;
                }
                listEmptyList.add(nVar);
            }
        }
        if (!listEmptyList.isEmpty()) {
            return listEmptyList;
        }
        throw new Registry.NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + a12);
    }
}
