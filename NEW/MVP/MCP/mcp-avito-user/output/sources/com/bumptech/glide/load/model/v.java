package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import j.N;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes5.dex */
public class v<Model> implements n<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    public static final v<?> f339300a = new v<>();

    /* compiled from: UnitModelLoader.java */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        public static final a<?> f339301a = new a<>();

        @Deprecated
        public a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Model, Model> b(r rVar) {
            return v.f339300a;
        }
    }

    @Deprecated
    public v() {
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a<Model> a(@N Model model, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        return new n.a<>(new jW0.e(model), new b(model));
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Model model) {
        return true;
    }

    /* compiled from: UnitModelLoader.java */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: b, reason: collision with root package name */
        public final Model f339302b;

        public b(Model model) {
            this.f339302b = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final Class<Model> a() {
            return (Class<Model>) this.f339302b.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final DataSource d() {
            return DataSource.f338827b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(@N Priority priority, @N d.a<? super Model> aVar) {
            aVar.c(this.f339302b);
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
