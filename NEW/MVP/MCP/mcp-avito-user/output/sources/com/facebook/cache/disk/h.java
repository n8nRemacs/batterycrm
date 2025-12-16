package com.facebook.cache.disk;

import com.facebook.cache.disk.d;
import com.facebook.cache.disk.e;
import com.facebook.common.file.FileUtils;
import com.facebook.common.internal.r;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import pW0.InterfaceC47022a;
import sW0.C48116a;
import uW0.C48986a;
import uW0.C48987b;

/* compiled from: DynamicDefaultDiskStorage.java */
@Nullsafe
/* loaded from: classes5.dex */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f339794a;

    /* renamed from: b, reason: collision with root package name */
    public final r<File> f339795b;

    /* renamed from: c, reason: collision with root package name */
    public final String f339796c;

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.cache.common.h f339797d;

    /* renamed from: e, reason: collision with root package name */
    @k0
    public volatile a f339798e = new a(null, null);

    /* compiled from: DynamicDefaultDiskStorage.java */
    @k0
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @I41.h
        public final com.facebook.cache.disk.a f339799a;

        /* renamed from: b, reason: collision with root package name */
        @I41.h
        public final File f339800b;

        @k0
        public a(@I41.h com.facebook.cache.disk.a aVar, @I41.h File file) {
            this.f339799a = aVar;
            this.f339800b = file;
        }
    }

    public h(int i12, r rVar, String str, com.facebook.cache.common.h hVar) {
        this.f339794a = i12;
        this.f339797d = hVar;
        this.f339795b = rVar;
        this.f339796c = str;
    }

    @Override // com.facebook.cache.disk.e
    public final void a() {
        try {
            ((com.facebook.cache.disk.a) h()).a();
        } catch (IOException e12) {
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(6)) {
                c48987b.c(6, h.class.getSimpleName(), "purgeUnexpectedResources", e12);
            }
        }
    }

    @Override // com.facebook.cache.disk.e
    public final long b(e.c cVar) {
        return ((com.facebook.cache.disk.a) h()).b(cVar);
    }

    @Override // com.facebook.cache.disk.e
    @I41.h
    public final InterfaceC47022a c(String str, com.facebook.cache.common.c cVar) {
        return ((com.facebook.cache.disk.a) h()).c(str, cVar);
    }

    @Override // com.facebook.cache.disk.e
    public final e.d d(String str, com.facebook.cache.common.c cVar) {
        return ((com.facebook.cache.disk.a) h()).d(str, cVar);
    }

    @Override // com.facebook.cache.disk.e
    public final boolean e(String str, com.facebook.cache.common.c cVar) {
        return ((com.facebook.cache.disk.a) h()).e(str, cVar);
    }

    @Override // com.facebook.cache.disk.e
    public final Collection<e.c> f() {
        return ((com.facebook.cache.disk.a) h()).f();
    }

    public final void g() throws FileUtils.CreateDirectoryException {
        File file = new File((File) ((d.a) this.f339795b).get(), this.f339796c);
        try {
            FileUtils.a(file);
            String absolutePath = file.getAbsolutePath();
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(3)) {
                c48987b.b(3, h.class.getSimpleName(), "Created cache directory " + absolutePath);
            }
            this.f339798e = new a(new com.facebook.cache.disk.a(file, this.f339794a, this.f339797d), file);
        } catch (FileUtils.CreateDirectoryException e12) {
            this.f339797d.getClass();
            throw e12;
        }
    }

    @k0
    public final synchronized e h() {
        com.facebook.cache.disk.a aVar;
        File file;
        a aVar2 = this.f339798e;
        if (aVar2.f339799a == null || (file = aVar2.f339800b) == null || !file.exists()) {
            if (this.f339798e.f339799a != null && this.f339798e.f339800b != null) {
                C48116a.a(this.f339798e.f339800b);
            }
            g();
        }
        aVar = this.f339798e.f339799a;
        aVar.getClass();
        return aVar;
    }

    @Override // com.facebook.cache.disk.e
    public final boolean isExternal() {
        try {
            return ((com.facebook.cache.disk.a) h()).f339741b;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.cache.disk.e
    public final long remove(String str) {
        return ((com.facebook.cache.disk.a) h()).remove(str);
    }
}
