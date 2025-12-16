package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.camera.camera2.internal.G;
import j.X;
import j.k0;
import java.util.NavigableMap;

/* compiled from: SizeStrategy.java */
@X
/* loaded from: classes5.dex */
final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    public final h<a, Bitmap> f338949a;

    /* renamed from: b, reason: collision with root package name */
    public final NavigableMap<Integer, Integer> f338950b;

    /* compiled from: SizeStrategy.java */
    @k0
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public final b f338951a;

        public a(b bVar) {
            this.f338951a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public final void a() {
            this.f338951a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return !false;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return G.e(0, "[", "]");
        }
    }

    /* compiled from: SizeStrategy.java */
    @k0
    public static class b extends d<a> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        public final m a() {
            return new a(this);
        }
    }

    public p() {
        new b();
        this.f338949a = new h<>();
        this.f338950b = new n();
    }

    public final String toString() {
        return "SizeStrategy:\n  " + this.f338949a + "\n  SortedSizes" + this.f338950b;
    }
}
