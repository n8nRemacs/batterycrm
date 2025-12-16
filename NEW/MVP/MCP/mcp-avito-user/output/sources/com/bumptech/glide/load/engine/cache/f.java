package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* compiled from: DiskLruCacheFactory.java */
/* loaded from: classes5.dex */
public class f implements a.InterfaceC10502a {

    /* renamed from: a, reason: collision with root package name */
    public final a f338964a;

    /* compiled from: DiskLruCacheFactory.java */
    public interface a {
    }

    public f(a aVar) {
        this.f338964a = aVar;
    }

    public final com.bumptech.glide.load.engine.cache.a a() {
        File cacheDir = ((l) this.f338964a).f338970a.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
        if (file == null) {
            return null;
        }
        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
            return new g(file);
        }
        return null;
    }
}
