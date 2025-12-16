package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* loaded from: classes5.dex */
public class s<Data> implements n<Integer, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final n<Uri, Data> f339265a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f339266b;

    /* compiled from: ResourceLoader.java */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f339267a;

        public a(Resources resources) {
            this.f339267a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public final n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.f339267a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f339268a;

        public b(Resources resources) {
            this.f339268a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.f339268a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f339269a;

        public c(Resources resources) {
            this.f339269a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Integer, InputStream> b(r rVar) {
            return new s(this.f339269a, rVar.b(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f339270a;

        public d(Resources resources) {
            this.f339270a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Integer, Uri> b(r rVar) {
            return new s(this.f339270a, v.f339300a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f339266b = resources;
        this.f339265a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a a(@N Integer num, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f339266b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable("ResourceLoader", 5);
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f339265a.a(uri, i12, i13, kVar);
    }

    @Override // com.bumptech.glide.load.model.n
    public final /* bridge */ /* synthetic */ boolean b(@N Integer num) {
        return true;
    }
}
