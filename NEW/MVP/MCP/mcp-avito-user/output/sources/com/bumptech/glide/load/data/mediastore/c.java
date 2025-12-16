package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import j.N;
import j.k0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes5.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f338877b;

    /* renamed from: c, reason: collision with root package name */
    public final e f338878c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f338879d;

    /* compiled from: ThumbFetcher.java */
    public static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f338880b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f338881a;

        public a(ContentResolver contentResolver) {
            this.f338881a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f338881a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f338880b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    public static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f338882b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f338883a;

        public b(ContentResolver contentResolver) {
            this.f338883a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f338883a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f338882b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    @k0
    public c(Uri uri, e eVar) {
        this.f338877b = uri;
        this.f338878c = eVar;
    }

    public static c c(Context context, Uri uri) {
        return new c(uri, new e(com.bumptech.glide.b.b(context).f338685e.b(), new a(context.getContentResolver()), com.bumptech.glide.b.b(context).f338686f, context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return new c(uri, new e(com.bumptech.glide.b.b(context).f338685e.b(), new b(context.getContentResolver()), com.bumptech.glide.b.b(context).f338686f, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        InputStream inputStream = this.f338879d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public final DataSource d() {
        return DataSource.f338827b;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(@N Priority priority, @N d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamG = g();
            this.f338879d = inputStreamG;
            aVar.c(inputStreamG);
        } catch (FileNotFoundException e12) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.f(e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[PHI: r5
  0x0025: PHI (r5v12 android.database.Cursor) = (r5v2 android.database.Cursor), (r5v14 android.database.Cursor) binds: [B:20:0x0037, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream g() throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            android.net.Uri r1 = r12.f338877b
            com.bumptech.glide.load.data.mediastore.e r2 = r12.f338878c
            r3 = 3
            r4 = 0
            com.bumptech.glide.load.data.mediastore.d r5 = r2.f338886b     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d
            android.database.Cursor r5 = r5.a(r1)     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d
            if (r5 == 0) goto L23
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L1f java.lang.SecurityException -> L2e
            if (r6 == 0) goto L23
            r6 = 0
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L1f java.lang.SecurityException -> L2e
            r5.close()
            goto L3a
        L1f:
            r0 = move-exception
            r4 = r5
            goto Lc0
        L23:
            if (r5 == 0) goto L28
        L25:
            r5.close()
        L28:
            r6 = r4
            goto L3a
        L2a:
            r0 = move-exception
            goto Lc0
        L2d:
            r5 = r4
        L2e:
            boolean r6 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L1f
            if (r6 == 0) goto L37
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L1f
        L37:
            if (r5 == 0) goto L28
            goto L25
        L3a:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            android.content.ContentResolver r7 = r2.f338888d
            if (r5 == 0) goto L44
        L42:
            r5 = r4
            goto L8a
        L44:
            com.bumptech.glide.load.data.mediastore.a r5 = r2.f338885a
            r5.getClass()
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L42
            long r8 = r5.length()
            r10 = 0
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 >= 0) goto L42
            android.net.Uri r5 = android.net.Uri.fromFile(r5)
            java.io.InputStream r5 = r7.openInputStream(r5)     // Catch: java.lang.NullPointerException -> L67
            goto L8a
        L67:
            r0 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "NPE opening uri: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L8a:
            r6 = -1
            if (r5 == 0) goto Lb6
            java.io.InputStream r4 = r7.openInputStream(r1)     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> La1
            java.util.ArrayList r7 = r2.f338889e     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> La1
            com.bumptech.glide.load.engine.bitmap_recycle.j r2 = r2.f338887c     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> La1
            int r0 = com.bumptech.glide.load.g.a(r2, r4, r7)     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> La1
            if (r4 == 0) goto Lb7
            r4.close()     // Catch: java.io.IOException -> Lb7
            goto Lb7
        L9f:
            r0 = move-exception
            goto Lb0
        La1:
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto Laa
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L9f
        Laa:
            if (r4 == 0) goto Lb6
            r4.close()     // Catch: java.io.IOException -> Lb6
            goto Lb6
        Lb0:
            if (r4 == 0) goto Lb5
            r4.close()     // Catch: java.io.IOException -> Lb5
        Lb5:
            throw r0
        Lb6:
            r0 = r6
        Lb7:
            if (r0 == r6) goto Lbf
            com.bumptech.glide.load.data.g r1 = new com.bumptech.glide.load.data.g
            r1.<init>(r5, r0)
            r5 = r1
        Lbf:
            return r5
        Lc0:
            if (r4 == 0) goto Lc5
            r4.close()
        Lc5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.c.g():java.io.InputStream");
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
