package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.resource.bitmap.J;
import j.N;
import j.P;
import java.io.InputStream;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: classes5.dex */
public class e implements n<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f339278a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f339279a;

        public a(Context context) {
            this.f339279a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, InputStream> b(r rVar) {
            return new e(this.f339279a);
        }
    }

    public e(Context context) {
        this.f339278a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.n
    @P
    public final n.a<InputStream> a(@N Uri uri, int i12, int i13, @N k kVar) {
        Long l12;
        Uri uri2 = uri;
        if (i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE || i12 > 512 || i13 > 384 || (l12 = (Long) kVar.c(J.f339351d)) == null || l12.longValue() != -1) {
            return null;
        }
        return new n.a<>(new jW0.e(uri2), com.bumptech.glide.load.data.mediastore.c.f(this.f339278a, uri2));
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Uri uri) {
        Uri uri2 = uri;
        return com.bumptech.glide.load.data.mediastore.b.a(uri2) && uri2.getPathSegments().contains("video");
    }
}
