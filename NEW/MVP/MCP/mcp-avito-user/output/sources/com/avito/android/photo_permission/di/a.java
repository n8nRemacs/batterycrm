package com.avito.android.photo_permission.di;

import android.content.Context;
import com.avito.android.permissions.z;
import com.avito.android.photo_permission.PhotoPermissionDialogFragment;
import com.avito.android.photo_permission.di.b;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerPhotoPermissionDialogComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerPhotoPermissionDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.photo_permission.di.b.a
        public final com.avito.android.photo_permission.di.b a(Context context, com.avito.android.photo_permission.di.c cVar) {
            return new c(cVar, context, null);
        }
    }

    /* compiled from: DaggerPhotoPermissionDialogComponent.java */
    public static final class c implements com.avito.android.photo_permission.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.photo_permission.di.c f218730a;

        public c(com.avito.android.photo_permission.di.c cVar, Context context, C6568a c6568a) {
            this.f218730a = cVar;
        }

        @Override // com.avito.android.photo_permission.di.b
        public final void a(PhotoPermissionDialogFragment photoPermissionDialogFragment) {
            com.avito.android.photo_permission.di.c cVar = this.f218730a;
            z zVarA = cVar.A();
            t.c(zVarA);
            photoPermissionDialogFragment.f218705m0 = zVarA;
            photoPermissionDialogFragment.f218706n0 = cVar.h();
            photoPermissionDialogFragment.f218707o0 = cVar.V();
            photoPermissionDialogFragment.f218708p0 = cVar.N();
            photoPermissionDialogFragment.f218709q0 = cVar.ec();
        }
    }

    public static b.a a() {
        return new b();
    }
}
