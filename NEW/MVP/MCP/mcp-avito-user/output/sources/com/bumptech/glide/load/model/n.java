package com.bumptech.glide.load.model;

import j.N;
import j.P;
import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: classes5.dex */
public interface n<Model, Data> {

    /* compiled from: ModelLoader.java */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.h f339240a;

        /* renamed from: b, reason: collision with root package name */
        public final List<com.bumptech.glide.load.h> f339241b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f339242c;

        public a(@N com.bumptech.glide.load.h hVar, @N com.bumptech.glide.load.data.d<Data> dVar) {
            List<com.bumptech.glide.load.h> listEmptyList = Collections.emptyList();
            com.bumptech.glide.util.k.c(hVar, "Argument must not be null");
            this.f339240a = hVar;
            com.bumptech.glide.util.k.c(listEmptyList, "Argument must not be null");
            this.f339241b = listEmptyList;
            com.bumptech.glide.util.k.c(dVar, "Argument must not be null");
            this.f339242c = dVar;
        }
    }

    @P
    a<Data> a(@N Model model, int i12, int i13, @N com.bumptech.glide.load.k kVar);

    boolean b(@N Model model);
}
