package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes5.dex */
public class d implements n<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    public static class b implements o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<File, ByteBuffer> b(@N r rVar) {
            return new d();
        }
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a<ByteBuffer> a(@N File file, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        File file2 = file;
        return new n.a<>(new jW0.e(file2), new a(file2));
    }

    @Override // com.bumptech.glide.load.model.n
    public final /* bridge */ /* synthetic */ boolean b(@N File file) {
        return true;
    }

    /* compiled from: ByteBufferFileLoader.java */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: b, reason: collision with root package name */
        public final File f339208b;

        public a(File file) {
            this.f339208b = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final DataSource d() {
            return DataSource.f338827b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(@N Priority priority, @N d.a<? super ByteBuffer> aVar) {
            try {
                aVar.c(com.bumptech.glide.util.a.a(this.f339208b));
            } catch (IOException e12) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.f(e12);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
