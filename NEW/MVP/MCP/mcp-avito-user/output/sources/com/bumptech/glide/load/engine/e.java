package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes5.dex */
class e implements h, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final List<com.bumptech.glide.load.h> f338984b;

    /* renamed from: c, reason: collision with root package name */
    public final i<?> f338985c;

    /* renamed from: d, reason: collision with root package name */
    public final h.a f338986d;

    /* renamed from: e, reason: collision with root package name */
    public int f338987e;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.load.h f338988f;

    /* renamed from: g, reason: collision with root package name */
    public List<com.bumptech.glide.load.model.n<File, ?>> f338989g;

    /* renamed from: h, reason: collision with root package name */
    public int f338990h;

    /* renamed from: i, reason: collision with root package name */
    public volatile n.a<?> f338991i;

    /* renamed from: j, reason: collision with root package name */
    public File f338992j;

    public e() {
        throw null;
    }

    public e(List<com.bumptech.glide.load.h> list, i<?> iVar, h.a aVar) {
        this.f338987e = -1;
        this.f338984b = list;
        this.f338985c = iVar;
        this.f338986d = aVar;
    }

    @Override // com.bumptech.glide.load.engine.h
    public final boolean a() {
        while (true) {
            List<com.bumptech.glide.load.model.n<File, ?>> list = this.f338989g;
            boolean z12 = false;
            if (list != null && this.f338990h < list.size()) {
                this.f338991i = null;
                while (!z12 && this.f338990h < this.f338989g.size()) {
                    List<com.bumptech.glide.load.model.n<File, ?>> list2 = this.f338989g;
                    int i12 = this.f338990h;
                    this.f338990h = i12 + 1;
                    com.bumptech.glide.load.model.n<File, ?> nVar = list2.get(i12);
                    File file = this.f338992j;
                    i<?> iVar = this.f338985c;
                    this.f338991i = nVar.a(file, iVar.f339017e, iVar.f339018f, iVar.f339021i);
                    if (this.f338991i != null && this.f338985c.c(this.f338991i.f339242c.a()) != null) {
                        this.f338991i.f339242c.e(this.f338985c.f339027o, this);
                        z12 = true;
                    }
                }
                return z12;
            }
            int i13 = this.f338987e + 1;
            this.f338987e = i13;
            if (i13 >= this.f338984b.size()) {
                return false;
            }
            com.bumptech.glide.load.h hVar = this.f338984b.get(this.f338987e);
            i<?> iVar2 = this.f338985c;
            File fileB = iVar2.f339020h.a().b(new f(hVar, iVar2.f339026n));
            this.f338992j = fileB;
            if (fileB != null) {
                this.f338988f = hVar;
                this.f338989g = this.f338985c.f339015c.f338742b.f338670a.b(fileB);
                this.f338990h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Object obj) {
        this.f338986d.c(this.f338988f, obj, this.f338991i.f339242c, DataSource.f338829d, this.f338988f);
    }

    @Override // com.bumptech.glide.load.engine.h
    public final void cancel() {
        n.a<?> aVar = this.f338991i;
        if (aVar != null) {
            aVar.f339242c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(@N Exception exc) {
        this.f338986d.b(this.f338988f, exc, this.f338991i.f339242c, DataSource.f338829d);
    }
}
