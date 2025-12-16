package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import j.N;
import java.io.InputStream;

/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: classes5.dex */
public class d implements n<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f339276a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f339277a;

        public a(Context context) {
            this.f339277a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, InputStream> b(r rVar) {
            return new d(this.f339277a);
        }
    }

    public d(Context context) {
        this.f339276a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a<InputStream> a(@N Uri uri, int i12, int i13, @N k kVar) {
        Uri uri2 = uri;
        if (i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE || i12 > 512 || i13 > 384) {
            return null;
        }
        return new n.a<>(new jW0.e(uri2), com.bumptech.glide.load.data.mediastore.c.c(this.f339276a, uri2));
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Uri uri) {
        Uri uri2 = uri;
        return com.bumptech.glide.load.data.mediastore.b.a(uri2) && !uri2.getPathSegments().contains("video");
    }
}
