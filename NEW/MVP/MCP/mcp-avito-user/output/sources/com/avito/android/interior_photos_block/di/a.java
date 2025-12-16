package com.avito.android.interior_photos_block.di;

import com.avito.android.interior_photos_block.di.b;
import com.avito.android.interior_photos_block.entity.InteriorPhotoBlock;
import com.avito.android.interior_photos_block.k;
import com.avito.android.interior_photos_block.m;
import com.avito.android.interior_photos_block.mvi.h;
import com.avito.android.interior_photos_block.mvi.j;
import com.avito.android.interior_photos_block.mvi.l;
import dagger.internal.e;

/* compiled from: DaggerInteriorPhotoBlockComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerInteriorPhotoBlockComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.interior_photos_block.di.b.a
        public final com.avito.android.interior_photos_block.di.b a(m mVar) {
            return new c(null, mVar, null);
        }
    }

    /* compiled from: DaggerInteriorPhotoBlockComponent.java */
    public static final class c implements com.avito.android.interior_photos_block.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.interior_photos_block.mvi.e f173041a;

        /* renamed from: b, reason: collision with root package name */
        public final l f173042b;

        public c(InteriorPhotoBlock interiorPhotoBlock, m mVar, C5100a c5100a) {
            this.f173041a = new com.avito.android.interior_photos_block.mvi.e(dagger.internal.l.b(interiorPhotoBlock));
            this.f173042b = new l(new h(this.f173041a, new com.avito.android.interior_photos_block.mvi.c(dagger.internal.l.a(mVar)), j.a()));
        }

        @Override // com.avito.android.interior_photos_block.di.b
        public final void a(k kVar) {
            kVar.f173053b = this.f173042b;
        }
    }

    public static b.a a() {
        return new b();
    }
}
