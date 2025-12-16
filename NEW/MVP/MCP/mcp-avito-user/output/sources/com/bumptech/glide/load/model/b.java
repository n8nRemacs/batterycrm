package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes5.dex */
public class b<Data> implements n<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC10511b<Data> f339205a;

    /* compiled from: ByteArrayLoader.java */
    public static class a implements o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.bumptech.glide.load.model.b$a$a, reason: collision with other inner class name */
        public class C10510a implements InterfaceC10511b<ByteBuffer> {
            @Override // com.bumptech.glide.load.model.b.InterfaceC10511b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC10511b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<byte[], ByteBuffer> b(@N r rVar) {
            return new b(new C10510a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.model.b$b, reason: collision with other inner class name */
    public interface InterfaceC10511b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        public class a implements InterfaceC10511b<InputStream> {
            @Override // com.bumptech.glide.load.model.b.InterfaceC10511b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC10511b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<byte[], InputStream> b(@N r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC10511b<Data> interfaceC10511b) {
        this.f339205a = interfaceC10511b;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a a(@N byte[] bArr, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        byte[] bArr2 = bArr;
        return new n.a(new jW0.e(bArr2), new c(bArr2, this.f339205a));
    }

    @Override // com.bumptech.glide.load.model.n
    public final /* bridge */ /* synthetic */ boolean b(@N byte[] bArr) {
        return true;
    }

    /* compiled from: ByteArrayLoader.java */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f339206b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC10511b<Data> f339207c;

        public c(byte[] bArr, InterfaceC10511b<Data> interfaceC10511b) {
            this.f339206b = bArr;
            this.f339207c = interfaceC10511b;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final Class<Data> a() {
            return this.f339207c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final DataSource d() {
            return DataSource.f338827b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(@N Priority priority, @N d.a<? super Data> aVar) {
            aVar.c(this.f339207c.b(this.f339206b));
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
