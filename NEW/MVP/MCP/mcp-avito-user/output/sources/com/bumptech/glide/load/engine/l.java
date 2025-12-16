package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* compiled from: DiskCacheStrategy.java */
/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f339087a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final l f339088b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final l f339089c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final l f339090d;

    /* compiled from: DiskCacheStrategy.java */
    public class a extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.f338828c;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z12, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.f338830e || dataSource == DataSource.f338831f) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class b extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z12, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class c extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(DataSource dataSource) {
            return (dataSource == DataSource.f338829d || dataSource == DataSource.f338831f) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z12, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class d extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z12, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.f338830e || dataSource == DataSource.f338831f) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class e extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.f338828c;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z12, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z12 && dataSource == DataSource.f338829d) || dataSource == DataSource.f338827b) && encodeStrategy == EncodeStrategy.f338838c;
        }
    }

    static {
        new d();
        f339090d = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z12, DataSource dataSource, EncodeStrategy encodeStrategy);
}
