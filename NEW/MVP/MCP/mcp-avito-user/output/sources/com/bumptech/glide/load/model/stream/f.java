package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import j.N;
import j.P;
import j.X;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader.java */
@X
/* loaded from: classes5.dex */
public final class f<DataT> implements n<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f339280a;

    /* renamed from: b, reason: collision with root package name */
    public final n<File, DataT> f339281b;

    /* renamed from: c, reason: collision with root package name */
    public final n<Uri, DataT> f339282c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<DataT> f339283d;

    /* compiled from: QMediaStoreUriLoader.java */
    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f339284a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<DataT> f339285b;

        public a(Context context, Class<DataT> cls) {
            this.f339284a = context;
            this.f339285b = cls;
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, DataT> b(@N r rVar) {
            Class<DataT> cls = this.f339285b;
            return new f(this.f339284a, rVar.b(File.class, cls), rVar.b(Uri.class, cls), cls);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    @X
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    @X
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: l, reason: collision with root package name */
        public static final String[] f339286l = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        public final Context f339287b;

        /* renamed from: c, reason: collision with root package name */
        public final n<File, DataT> f339288c;

        /* renamed from: d, reason: collision with root package name */
        public final n<Uri, DataT> f339289d;

        /* renamed from: e, reason: collision with root package name */
        public final Uri f339290e;

        /* renamed from: f, reason: collision with root package name */
        public final int f339291f;

        /* renamed from: g, reason: collision with root package name */
        public final int f339292g;

        /* renamed from: h, reason: collision with root package name */
        public final k f339293h;

        /* renamed from: i, reason: collision with root package name */
        public final Class<DataT> f339294i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f339295j;

        /* renamed from: k, reason: collision with root package name */
        @P
        public volatile com.bumptech.glide.load.data.d<DataT> f339296k;

        public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i12, int i13, k kVar, Class<DataT> cls) {
            this.f339287b = context.getApplicationContext();
            this.f339288c = nVar;
            this.f339289d = nVar2;
            this.f339290e = uri;
            this.f339291f = i12;
            this.f339292g = i13;
            this.f339293h = kVar;
            this.f339294i = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final Class<DataT> a() {
            return this.f339294i;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f339296k;
            if (dVar != null) {
                dVar.b();
            }
        }

        @P
        public final com.bumptech.glide.load.data.d<DataT> c() throws Throwable {
            n.a<DataT> aVarA;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            k kVar = this.f339293h;
            int i12 = this.f339292g;
            int i13 = this.f339291f;
            Context context = this.f339287b;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.f339290e;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, f339286l, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarA = this.f339288c.a(file, i13, i12, kVar);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
                Uri requireOriginal = this.f339290e;
                if (iCheckSelfPermission == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                aVarA = this.f339289d.a(requireOriginal, i13, i12, kVar);
            }
            if (aVarA != null) {
                return aVarA.f339242c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f339295j = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f339296k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final DataSource d() {
            return DataSource.f338827b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(@N Priority priority, @N d.a<? super DataT> aVar) throws Throwable {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarC = c();
                if (dVarC == null) {
                    aVar.f(new IllegalArgumentException("Failed to build fetcher for: " + this.f339290e));
                } else {
                    this.f339296k = dVarC;
                    if (this.f339295j) {
                        cancel();
                    } else {
                        dVarC.e(priority, aVar);
                    }
                }
            } catch (FileNotFoundException e12) {
                aVar.f(e12);
            }
        }
    }

    public f(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f339280a = context.getApplicationContext();
        this.f339281b = nVar;
        this.f339282c = nVar2;
        this.f339283d = cls;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a a(@N Uri uri, int i12, int i13, @N k kVar) {
        Uri uri2 = uri;
        return new n.a(new jW0.e(uri2), new d(this.f339280a, this.f339281b, this.f339282c, uri2, i12, i13, kVar, this.f339283d));
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.mediastore.b.a(uri);
    }
}
