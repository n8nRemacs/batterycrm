package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes5.dex */
public final class k implements n<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f339232a;

    /* compiled from: MediaStoreFileLoader.java */
    public static final class a implements o<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f339233a;

        public a(Context context) {
            this.f339233a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, File> b(r rVar) {
            return new k(this.f339233a);
        }
    }

    public k(Context context) {
        this.f339232a = context;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a<File> a(@N Uri uri, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        Uri uri2 = uri;
        return new n.a<>(new jW0.e(uri2), new b(this.f339232a, uri2));
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.a(uri);
    }

    /* compiled from: MediaStoreFileLoader.java */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f339234d = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        public final Context f339235b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f339236c;

        public b(Context context, Uri uri) {
            this.f339235b = context;
            this.f339236c = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final DataSource d() {
            return DataSource.f338827b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(@N Priority priority, @N d.a<? super File> aVar) {
            Cursor cursorQuery = this.f339235b.getContentResolver().query(this.f339236c, f339234d, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.c(new File(string));
                return;
            }
            aVar.f(new FileNotFoundException("Failed to find file path for: " + this.f339236c));
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
