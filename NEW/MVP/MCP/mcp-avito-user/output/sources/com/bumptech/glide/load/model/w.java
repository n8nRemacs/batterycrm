package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: classes5.dex */
public class w<Data> implements n<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f339303b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f339304a;

    /* compiled from: UriLoader.java */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f339305a;

        public a(ContentResolver contentResolver) {
            this.f339305a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.w.c
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f339305a, uri);
        }

        @Override // com.bumptech.glide.load.model.o
        public final n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f339306a;

        public b(ContentResolver contentResolver) {
            this.f339306a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.w.c
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f339306a, uri);
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f339307a;

        public d(ContentResolver contentResolver) {
            this.f339307a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.w.c
        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.o(this.f339307a, uri);
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f339304a = cVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.bumptech.glide.load.model.w$c, java.lang.Object] */
    @Override // com.bumptech.glide.load.model.n
    public final n.a a(@N Uri uri, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        Uri uri2 = uri;
        return new n.a(new jW0.e(uri2), this.f339304a.a(uri2));
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Uri uri) {
        return f339303b.contains(uri.getScheme());
    }
}
