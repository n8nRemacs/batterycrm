package com.facebook.cache.disk;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.common.internal.r;
import com.facebook.infer.annotation.Nullsafe;
import java.io.File;
import rW0.C47606c;

/* compiled from: DiskCacheConfig.java */
@Nullsafe
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f339758a;

    /* renamed from: b, reason: collision with root package name */
    public final String f339759b;

    /* renamed from: c, reason: collision with root package name */
    public final r<File> f339760c;

    /* renamed from: d, reason: collision with root package name */
    public final long f339761d;

    /* renamed from: e, reason: collision with root package name */
    public final long f339762e;

    /* renamed from: f, reason: collision with root package name */
    public final long f339763f;

    /* renamed from: g, reason: collision with root package name */
    public final c f339764g;

    /* renamed from: h, reason: collision with root package name */
    public final com.facebook.cache.common.h f339765h;

    /* renamed from: i, reason: collision with root package name */
    public final com.facebook.cache.common.i f339766i;

    /* renamed from: j, reason: collision with root package name */
    public final C47606c f339767j;

    /* renamed from: k, reason: collision with root package name */
    @I41.h
    public final Context f339768k;

    /* compiled from: DiskCacheConfig.java */
    public class a implements r<File> {
        public a() {
        }

        @Override // com.facebook.common.internal.r
        public final File get() {
            d dVar = d.this;
            dVar.f339768k.getClass();
            return dVar.f339768k.getApplicationContext().getCacheDir();
        }
    }

    /* compiled from: DiskCacheConfig.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @I41.h
        public r<File> f339770a;

        /* renamed from: b, reason: collision with root package name */
        public final c f339771b = new c();

        /* renamed from: c, reason: collision with root package name */
        @I41.h
        public final Context f339772c;

        public b(Context context, a aVar) {
            this.f339772c = context;
        }
    }

    public d(b bVar) {
        com.facebook.cache.common.h hVar;
        com.facebook.cache.common.i iVar;
        C47606c c47606c;
        Context context = bVar.f339772c;
        this.f339768k = context;
        r<File> rVar = bVar.f339770a;
        if (!((rVar == null && context == null) ? false : true)) {
            throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
        }
        if (rVar == null && context != null) {
            bVar.f339770a = new a();
        }
        this.f339758a = 1;
        this.f339759b = "image_cache";
        r<File> rVar2 = bVar.f339770a;
        rVar2.getClass();
        this.f339760c = rVar2;
        this.f339761d = 41943040L;
        this.f339762e = 10485760L;
        this.f339763f = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
        c cVar = bVar.f339771b;
        cVar.getClass();
        this.f339764g = cVar;
        synchronized (com.facebook.cache.common.h.class) {
            try {
                if (com.facebook.cache.common.h.f339735a == null) {
                    com.facebook.cache.common.h.f339735a = new com.facebook.cache.common.h();
                }
                hVar = com.facebook.cache.common.h.f339735a;
            } finally {
            }
        }
        this.f339765h = hVar;
        synchronized (com.facebook.cache.common.i.class) {
            try {
                if (com.facebook.cache.common.i.f339736a == null) {
                    com.facebook.cache.common.i.f339736a = new com.facebook.cache.common.i();
                }
                iVar = com.facebook.cache.common.i.f339736a;
            } finally {
            }
        }
        this.f339766i = iVar;
        synchronized (C47606c.class) {
            try {
                if (C47606c.f429854a == null) {
                    C47606c.f429854a = new C47606c();
                }
                c47606c = C47606c.f429854a;
            } finally {
            }
        }
        this.f339767j = c47606c;
    }
}
