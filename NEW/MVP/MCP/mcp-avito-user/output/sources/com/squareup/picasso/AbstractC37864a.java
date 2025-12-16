package com.squareup.picasso;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: Action.java */
/* renamed from: com.squareup.picasso.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC37864a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Picasso f366393a;

    /* renamed from: b, reason: collision with root package name */
    public final A f366394b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference<T> f366395c;

    /* renamed from: d, reason: collision with root package name */
    public final String f366396d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f366397e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f366398f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f366399g;

    /* compiled from: Action.java */
    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    public static class C10810a<M> extends WeakReference<M> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC37864a f366400a;

        public C10810a(AbstractC37864a abstractC37864a, ImageView imageView, ReferenceQueue referenceQueue) {
            super(imageView, referenceQueue);
            this.f366400a = abstractC37864a;
        }
    }

    public AbstractC37864a(Picasso picasso, ImageView imageView, A a12, String str) {
        this.f366393a = picasso;
        this.f366394b = a12;
        this.f366395c = imageView == null ? null : new C10810a(this, imageView, picasso.f366375j);
        this.f366396d = str;
        this.f366397e = this;
    }

    public void a() {
        this.f366399g = true;
    }

    public abstract void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void c(Exception exc);

    public T d() {
        WeakReference<T> weakReference = this.f366395c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
