package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: classes5.dex */
public class f<Data> implements n<File, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final d<Data> f339214a;

    /* compiled from: FileLoader.java */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final d<Data> f339215a;

        public a(d<Data> dVar) {
            this.f339215a = dVar;
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<File, Data> b(@N r rVar) {
            return new f(this.f339215a);
        }
    }

    /* compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        public class a implements d<ParcelFileDescriptor> {
            @Override // com.bumptech.glide.load.model.f.d
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.f.d
            public final ParcelFileDescriptor b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // com.bumptech.glide.load.model.f.d
            public final void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* compiled from: FileLoader.java */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        public class a implements d<InputStream> {
            @Override // com.bumptech.glide.load.model.f.d
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.f.d
            public final InputStream b(File file) {
                return new FileInputStream(file);
            }

            @Override // com.bumptech.glide.load.model.f.d
            public final void c(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f339214a = dVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a a(@N File file, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        File file2 = file;
        return new n.a(new jW0.e(file2), new c(file2, this.f339214a));
    }

    @Override // com.bumptech.glide.load.model.n
    public final /* bridge */ /* synthetic */ boolean b(@N File file) {
        return true;
    }

    /* compiled from: FileLoader.java */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final File f339216b;

        /* renamed from: c, reason: collision with root package name */
        public final d<Data> f339217c;

        /* renamed from: d, reason: collision with root package name */
        public Data f339218d;

        public c(File file, d<Data> dVar) {
            this.f339216b = file;
            this.f339217c = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final Class<Data> a() {
            return this.f339217c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            Data data = this.f339218d;
            if (data != null) {
                try {
                    this.f339217c.c(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final DataSource d() {
            return DataSource.f338827b;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void e(@N Priority priority, @N d.a<? super Data> aVar) {
            try {
                Data dataB = this.f339217c.b(this.f339216b);
                this.f339218d = dataB;
                aVar.c(dataB);
            } catch (FileNotFoundException e12) {
                Log.isLoggable("FileLoader", 3);
                aVar.f(e12);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
