package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import com.bumptech.glide.request.target.q;
import j.N;
import j.P;

/* compiled from: ListPreloader.java */
/* loaded from: classes5.dex */
public class f<T> implements AbsListView.OnScrollListener {

    /* renamed from: b, reason: collision with root package name */
    public int f338750b;

    /* renamed from: c, reason: collision with root package name */
    public int f338751c;

    /* renamed from: d, reason: collision with root package name */
    public int f338752d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f338753e;

    /* compiled from: ListPreloader.java */
    public interface a<U> {
    }

    /* compiled from: ListPreloader.java */
    public interface b<T> {
    }

    /* compiled from: ListPreloader.java */
    public static final class d {
    }

    public final void a(int i12, boolean z12) {
        if (this.f338753e != z12) {
            this.f338753e = z12;
            throw null;
        }
        int iMin = Math.min(this.f338752d, Math.min(this.f338750b, i12));
        int iMin2 = Math.min(this.f338752d, Math.max(0, i12));
        if (iMin - 1 >= iMin2) {
            throw null;
        }
        this.f338750b = iMin2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i12, int i13, int i14) {
        this.f338752d = i14;
        int i15 = this.f338751c;
        if (i12 > i15) {
            a(i13 + i12, true);
        } else if (i12 < i15) {
            a(i12, false);
        }
        this.f338751c = i12;
    }

    /* compiled from: ListPreloader.java */
    public static final class c implements q<Object> {

        /* renamed from: b, reason: collision with root package name */
        @P
        public com.bumptech.glide.request.i f338754b;

        @Override // com.bumptech.glide.request.target.q
        @P
        public final com.bumptech.glide.request.d a() {
            return this.f338754b;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void f(@P com.bumptech.glide.request.i iVar) {
            this.f338754b = iVar;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void j(@N com.bumptech.glide.request.i iVar) {
            iVar.c(0, 0);
        }

        @Override // com.bumptech.glide.manager.i
        public final void e() {
        }

        @Override // com.bumptech.glide.manager.i
        public final void onStart() {
        }

        @Override // com.bumptech.glide.manager.i
        public final void onStop() {
        }

        @Override // com.bumptech.glide.request.target.q
        public final void b(@P Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.q
        public final void g(@P Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.q
        public final void h(@N com.bumptech.glide.request.i iVar) {
        }

        @Override // com.bumptech.glide.request.target.q
        public final void k(@P Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.q
        public final void c(@N Object obj, @P com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i12) {
    }
}
