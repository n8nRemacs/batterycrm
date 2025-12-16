package com.avito.android.photo_picker.camera_mvi.di;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.device_orientation.i;
import com.avito.android.device_orientation.p;
import com.avito.android.permissions.C33033c;
import com.avito.android.permissions.G;
import com.avito.android.permissions.x;
import com.avito.android.photo_picker.camera_mvi.CameraFragment;
import com.avito.android.photo_picker.camera_mvi.di.a;
import com.avito.android.photo_picker.camera_mvi.h;
import com.avito.android.photo_picker.camera_mvi.mvi.j;
import com.avito.android.photo_picker.camera_mvi.mvi.m;
import com.avito.android.photo_picker.camera_mvi.mvi.o;
import com.avito.android.photo_picker.camera_mvi.mvi.q;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCameraComponent.java */
@e
/* loaded from: classes14.dex */
public final class d {

    /* compiled from: DaggerCameraComponent.java */
    public static final class b implements com.avito.android.photo_picker.camera_mvi.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.photo_picker.camera_mvi.di.b f219101a;

        /* renamed from: b, reason: collision with root package name */
        public final u<SharedPhotosStorage> f219102b;

        /* renamed from: c, reason: collision with root package name */
        public final u<N70.b> f219103c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f219104d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f219105e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.permissions.u> f219106f;

        /* renamed from: g, reason: collision with root package name */
        public final u<G> f219107g;

        /* renamed from: h, reason: collision with root package name */
        public final h f219108h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Context> f219109i;

        /* renamed from: j, reason: collision with root package name */
        public final u<i> f219110j;

        /* renamed from: k, reason: collision with root package name */
        public final u<x> f219111k;

        /* compiled from: DaggerCameraComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.camera_mvi.di.b f219112a;

            public a(com.avito.android.photo_picker.camera_mvi.di.b bVar) {
                this.f219112a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f219112a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCameraComponent.java */
        /* renamed from: com.avito.android.photo_picker.camera_mvi.di.d$b$b, reason: collision with other inner class name */
        public static final class C6583b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.camera_mvi.di.b f219113a;

            public C6583b(com.avito.android.photo_picker.camera_mvi.di.b bVar) {
                this.f219113a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219113a.g();
            }
        }

        /* compiled from: DaggerCameraComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.camera_mvi.di.b f219114a;

            public c(com.avito.android.photo_picker.camera_mvi.di.b bVar) {
                this.f219114a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f219114a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCameraComponent.java */
        /* renamed from: com.avito.android.photo_picker.camera_mvi.di.d$b$d, reason: collision with other inner class name */
        public static final class C6584d implements u<N70.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.camera_mvi.di.b f219115a;

            public C6584d(com.avito.android.photo_picker.camera_mvi.di.b bVar) {
                this.f219115a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219115a.B7();
            }
        }

        /* compiled from: DaggerCameraComponent.java */
        public static final class e implements u<com.avito.android.permissions.u> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.camera_mvi.di.b f219116a;

            public e(com.avito.android.photo_picker.camera_mvi.di.b bVar) {
                this.f219116a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219116a.V();
            }
        }

        /* compiled from: DaggerCameraComponent.java */
        public static final class f implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.camera_mvi.di.b f219117a;

            public f(com.avito.android.photo_picker.camera_mvi.di.b bVar) {
                this.f219117a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219117a.N();
            }
        }

        /* compiled from: DaggerCameraComponent.java */
        public static final class g implements u<SharedPhotosStorage> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.camera_mvi.di.b f219118a;

            public g(com.avito.android.photo_picker.camera_mvi.di.b bVar) {
                this.f219118a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219118a.b2();
            }
        }

        public b(com.avito.android.photo_picker.camera_mvi.di.b bVar, Fragment fragment, Integer num, a aVar) {
            this.f219101a = bVar;
            this.f219108h = new h(new m(new j(l.a(num), new g(bVar), new C6584d(bVar), new c(bVar), new a(bVar), new e(bVar), new f(bVar)), o.a(), q.a()));
            this.f219110j = dagger.internal.g.d(new p(new C6583b(bVar)));
            this.f219111k = dagger.internal.g.d(new C33033c(l.a(fragment)));
        }

        @Override // com.avito.android.photo_picker.camera_mvi.di.a
        public final void a(CameraFragment cameraFragment) {
            cameraFragment.f219044n0 = this.f219108h;
            cameraFragment.f219046p0 = this.f219110j.get();
            InterfaceC28373a interfaceC28373aA = this.f219101a.a();
            t.c(interfaceC28373aA);
            cameraFragment.f219047q0 = interfaceC28373aA;
            cameraFragment.f219048r0 = this.f219111k.get();
        }
    }

    /* compiled from: DaggerCameraComponent.java */
    public static final class c implements a.InterfaceC6582a {
        public c() {
        }

        @Override // com.avito.android.photo_picker.camera_mvi.di.a.InterfaceC6582a
        public final com.avito.android.photo_picker.camera_mvi.di.a a(com.avito.android.photo_picker.camera_mvi.di.b bVar, CameraFragment cameraFragment, int i12) {
            return new b(bVar, cameraFragment, Integer.valueOf(i12), null);
        }
    }

    public static a.InterfaceC6582a a() {
        return new c();
    }
}
