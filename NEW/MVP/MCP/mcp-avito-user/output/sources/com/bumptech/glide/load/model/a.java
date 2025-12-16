package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes5.dex */
public class a<Data> implements n<Uri, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f339201a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f339202b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    public interface InterfaceC10509a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC10509a<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f339203a;

        public b(AssetManager assetManager) {
            this.f339203a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC10509a
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.f339203a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    public static class c implements o<Uri, InputStream>, InterfaceC10509a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f339204a;

        public c(AssetManager assetManager) {
            this.f339204a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC10509a
        public final com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.n(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, InputStream> b(r rVar) {
            return new a(this.f339204a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC10509a<Data> interfaceC10509a) {
        this.f339201a = assetManager;
        this.f339202b = interfaceC10509a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.load.model.a$a, java.lang.Object] */
    @Override // com.bumptech.glide.load.model.n
    public final n.a a(@N Uri uri, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        Uri uri2 = uri;
        return new n.a(new jW0.e(uri2), this.f339202b.a(this.f339201a, uri2.toString().substring(22)));
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
