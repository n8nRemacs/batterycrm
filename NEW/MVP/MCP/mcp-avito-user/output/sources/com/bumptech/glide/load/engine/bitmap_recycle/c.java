package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import j.k0;

/* compiled from: AttributeStrategy.java */
/* loaded from: classes5.dex */
class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final h<a, Bitmap> f338912a;

    /* compiled from: AttributeStrategy.java */
    @k0
    public static class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public final b f338913a;

        public a(b bVar) {
            this.f338913a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public final void a() {
            this.f338913a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return (((0 * 31) + 0) * 31) + 0;
        }

        public final String toString() {
            StringBuilder sbY = r.y(0, 0, "[", "x", "], ");
            sbY.append((Object) null);
            return sbY.toString();
        }
    }

    /* compiled from: AttributeStrategy.java */
    @k0
    public static class b extends d<a> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        public final m a() {
            return new a(this);
        }
    }

    public c() {
        new b();
        this.f338912a = new h<>();
    }

    public final String toString() {
        return "AttributeStrategy:\n  " + this.f338912a;
    }
}
