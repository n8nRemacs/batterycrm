package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* loaded from: classes5.dex */
public class u<Data> implements n<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final n<Uri, Data> f339299a;

    /* compiled from: StringLoader.java */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.o
        public final n<String, AssetFileDescriptor> b(@N r rVar) {
            return new u(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<String, ParcelFileDescriptor> b(@N r rVar) {
            return new u(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class c implements o<String, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<String, InputStream> b(@N r rVar) {
            return new u(rVar.b(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f339299a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a a(@N String str, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile == null) {
            return null;
        }
        n<Uri, Data> nVar = this.f339299a;
        if (nVar.b(uriFromFile)) {
            return nVar.a(uriFromFile, i12, i13, kVar);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.n
    public final /* bridge */ /* synthetic */ boolean b(@N String str) {
        return true;
    }
}
