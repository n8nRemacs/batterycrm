package com.avito.android.photo_picker.camera.di;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.device_orientation.f;
import com.avito.android.device_orientation.h;
import com.avito.android.permissions.x;
import com.avito.android.photo_picker.C33236j;
import com.avito.android.photo_picker.C33263n;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.photo_picker.InterfaceC33232f;
import com.avito.android.photo_picker.InterfaceC33237k;
import com.avito.android.photo_picker.camera.AspectRatio;
import com.avito.android.photo_picker.camera.CameraFragment;
import com.avito.android.photo_picker.camera.di.a;
import com.avito.android.photo_picker.camera.g;
import com.avito.android.photo_picker.camera.q;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import w80.C49468b;

/* compiled from: DaggerCameraComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class e {

    /* compiled from: DaggerCameraComponent.java */
    public static final class b implements a.InterfaceC6574a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.photo_picker.camera.di.b f218947a;

        /* renamed from: b, reason: collision with root package name */
        public ContentResolver f218948b;

        /* renamed from: c, reason: collision with root package name */
        public Point f218949c;

        /* renamed from: d, reason: collision with root package name */
        public Display f218950d;

        /* renamed from: e, reason: collision with root package name */
        public ActivityC22955m f218951e;

        /* renamed from: f, reason: collision with root package name */
        public CameraType f218952f;

        /* renamed from: g, reason: collision with root package name */
        public AspectRatio f218953g;

        /* renamed from: h, reason: collision with root package name */
        public Boolean f218954h;

        public b() {
        }

        @Override // com.avito.android.photo_picker.camera.di.a.InterfaceC6574a
        public final a.InterfaceC6574a a(boolean z12) {
            this.f218954h = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.photo_picker.camera.di.a.InterfaceC6574a
        public final a.InterfaceC6574a b(Point point) {
            this.f218949c = point;
            return this;
        }

        @Override // com.avito.android.photo_picker.camera.di.a.InterfaceC6574a
        public final com.avito.android.photo_picker.camera.di.a build() {
            t.a(com.avito.android.photo_picker.camera.di.b.class, this.f218947a);
            t.a(ContentResolver.class, this.f218948b);
            t.a(Point.class, this.f218949c);
            t.a(Display.class, this.f218950d);
            t.a(Context.class, this.f218951e);
            t.a(CameraType.class, this.f218952f);
            t.a(AspectRatio.class, this.f218953g);
            t.a(Boolean.class, this.f218954h);
            return new c(this.f218947a, this.f218948b, this.f218949c, this.f218950d, this.f218951e, this.f218952f, this.f218953g, this.f218954h, null);
        }

        @Override // com.avito.android.photo_picker.camera.di.a.InterfaceC6574a
        public final a.InterfaceC6574a c(Display display) {
            this.f218950d = display;
            return this;
        }

        @Override // com.avito.android.photo_picker.camera.di.a.InterfaceC6574a
        public final a.InterfaceC6574a d(ActivityC22955m activityC22955m) {
            this.f218951e = activityC22955m;
            return this;
        }

        @Override // com.avito.android.photo_picker.camera.di.a.InterfaceC6574a
        public final a.InterfaceC6574a e(AspectRatio aspectRatio) {
            aspectRatio.getClass();
            this.f218953g = aspectRatio;
            return this;
        }

        @Override // com.avito.android.photo_picker.camera.di.a.InterfaceC6574a
        public final a.InterfaceC6574a f(CameraType cameraType) {
            cameraType.getClass();
            this.f218952f = cameraType;
            return this;
        }

        @Override // com.avito.android.photo_picker.camera.di.a.InterfaceC6574a
        public final a.InterfaceC6574a g(ContentResolver contentResolver) {
            this.f218948b = contentResolver;
            return this;
        }

        @Override // com.avito.android.photo_picker.camera.di.a.InterfaceC6574a
        public final a.InterfaceC6574a h(com.avito.android.photo_picker.camera.di.b bVar) {
            this.f218947a = bVar;
            return this;
        }
    }

    /* compiled from: DaggerCameraComponent.java */
    public static final class c implements com.avito.android.photo_picker.camera.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.photo_picker.camera.di.b f218955a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f218956b;

        /* renamed from: c, reason: collision with root package name */
        public final CameraType f218957c;

        /* renamed from: d, reason: collision with root package name */
        public final Boolean f218958d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.photo_storage.a> f218959e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC33237k> f218960f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC33232f> f218961g;

        /* renamed from: h, reason: collision with root package name */
        public final u<f> f218962h;

        /* renamed from: i, reason: collision with root package name */
        public final u<g> f218963i;

        public c(com.avito.android.photo_picker.camera.di.b bVar, ContentResolver contentResolver, Point point, Display display, Context context, CameraType cameraType, AspectRatio aspectRatio, Boolean bool, a aVar) {
            this.f218955a = bVar;
            this.f218956b = context;
            this.f218957c = cameraType;
            this.f218958d = bool;
            l lVarA = l.a(contentResolver);
            com.avito.android.photo_storage.c.f219949b.getClass();
            this.f218959e = dagger.internal.g.d(new com.avito.android.photo_storage.c(lVarA));
            u<InterfaceC33237k> uVarD = dagger.internal.g.d(C33263n.a());
            this.f218960f = uVarD;
            this.f218961g = dagger.internal.g.d(new C33236j(uVarD));
            this.f218962h = dagger.internal.g.d(new h(l.a(display)));
            this.f218963i = dagger.internal.g.d(new com.avito.android.photo_picker.camera.h(l.a(aspectRatio)));
        }

        @Override // com.avito.android.photo_picker.camera.di.a
        public final void a(CameraFragment cameraFragment) {
            com.avito.android.photo_storage.a aVar = this.f218959e.get();
            com.avito.android.photo_picker.camera.di.b bVar = this.f218955a;
            x xVarD8 = bVar.D8();
            t.c(xVarD8);
            InterfaceC35745a5 interfaceC35745a5D = bVar.d();
            InterfaceC33232f interfaceC33232f = this.f218961g.get();
            f fVar = this.f218962h.get();
            N70.c cVarB7 = bVar.B7();
            Context context = this.f218956b;
            com.avito.android.photo_storage.e eVar = new com.avito.android.photo_storage.e(context);
            com.avito.android.photo_storage.g gVar = new com.avito.android.photo_storage.g(context);
            C49468b.f441303c.getClass();
            SharedPhotosStorage sharedPhotosStorageA = C49468b.a.a(eVar, gVar);
            g gVar2 = this.f218963i.get();
            cameraFragment.f218921f0 = new q(cVarB7, fVar, xVarD8, bVar.N(), gVar2, interfaceC33232f, this.f218957c, aVar, sharedPhotosStorageA, interfaceC35745a5D, this.f218958d.booleanValue());
        }
    }

    public static a.InterfaceC6574a a() {
        return new b();
    }
}
