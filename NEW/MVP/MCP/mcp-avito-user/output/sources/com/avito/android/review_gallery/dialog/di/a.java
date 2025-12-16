package com.avito.android.review_gallery.dialog.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.review_gallery.dialog.ReviewGalleryDetailsDialog;
import com.avito.android.review_gallery.dialog.di.c;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerReviewGalleryDialogComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerReviewGalleryDialogComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.review_gallery.dialog.di.c.a
        public final com.avito.android.review_gallery.dialog.di.c a(com.avito.android.review_gallery.dialog.di.b bVar, C28478k c28478k) {
            return new c(bVar, c28478k, null);
        }
    }

    /* compiled from: DaggerReviewGalleryDialogComponent.java */
    public static final class c implements com.avito.android.review_gallery.dialog.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f255490a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f255491b;

        /* compiled from: DaggerReviewGalleryDialogComponent.java */
        /* renamed from: com.avito.android.review_gallery.dialog.di.a$c$a, reason: collision with other inner class name */
        public static final class C7650a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.review_gallery.dialog.di.b f255492a;

            public C7650a(com.avito.android.review_gallery.dialog.di.b bVar) {
                this.f255492a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f255492a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.review_gallery.dialog.di.b bVar, C28478k c28478k, C7649a c7649a) {
            this.f255490a = new C7650a(bVar);
            this.f255491b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f255490a);
        }

        @Override // com.avito.android.review_gallery.dialog.di.c
        public final void a(ReviewGalleryDetailsDialog reviewGalleryDetailsDialog) {
            reviewGalleryDetailsDialog.f255487n0 = this.f255491b.get();
        }
    }

    public static c.a a() {
        return new b();
    }
}
