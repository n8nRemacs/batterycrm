package com.bumptech.glide.load.model;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes5.dex */
public final class e<Model, Data> implements n<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final a<Data> f339209a;

    /* compiled from: DataUrlLoader.java */
    public interface a<Data> {
    }

    /* compiled from: DataUrlLoader.java */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final a<InputStream> f339213a = new a();

        /* compiled from: DataUrlLoader.java */
        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Model, InputStream> b(@N r rVar) {
            return new e(this.f339213a);
        }
    }

    public e(a<Data> aVar) {
        this.f339209a = aVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a<Data> a(@N Model model, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        return new n.a<>(new jW0.e(model), new b(model.toString(), this.f339209a));
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Model model) {
        return model.toString().startsWith("data:image");
    }

    /* compiled from: DataUrlLoader.java */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final String f339210b;

        /* renamed from: c, reason: collision with root package name */
        public final a<Data> f339211c;

        /* renamed from: d, reason: collision with root package name */
        public Data f339212d;

        public b(String str, a<Data> aVar) {
            this.f339210b = str;
            this.f339211c = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final Class<Data> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() throws IOException {
            try {
                ((InputStream) this.f339212d).close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final DataSource d() {
            return DataSource.f338827b;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [Data, java.io.ByteArrayInputStream, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void e(@N Priority priority, @N d.a<? super Data> aVar) {
            try {
                ?? r22 = (Data) ((c.a) this.f339211c).a(this.f339210b);
                this.f339212d = r22;
                aVar.c(r22);
            } catch (IllegalArgumentException e12) {
                aVar.f(e12);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
