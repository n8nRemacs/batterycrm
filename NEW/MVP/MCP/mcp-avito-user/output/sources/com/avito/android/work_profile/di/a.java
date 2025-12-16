package com.avito.android.work_profile.di;

import androidx.appcompat.app.m;
import com.avito.android.work_profile.WorkProfileActivity;
import com.avito.android.work_profile.di.b;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerWorkProfileComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerWorkProfileComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.work_profile.di.b.a
        public final com.avito.android.work_profile.di.b a(InterfaceC39417a interfaceC39417a, WorkProfileActivity workProfileActivity) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, workProfileActivity, null);
        }
    }

    /* compiled from: DaggerWorkProfileComponent.java */
    public static final class c implements com.avito.android.work_profile.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f330632a;

        public c(cv.b bVar, m mVar, C10263a c10263a) {
            this.f330632a = bVar;
        }

        @Override // com.avito.android.work_profile.di.b
        public final void a(WorkProfileActivity workProfileActivity) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f330632a.u4();
            t.c(aVarU4);
            workProfileActivity.f330596m = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
