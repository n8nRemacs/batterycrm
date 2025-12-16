package com.avito.android.photo_camera_view;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.avito.android.device_orientation.c;
import com.avito.android.photo_camera_view.InterfaceC33173d;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.photo_picker.FlashMode;
import com.avito.android.photo_picker.InterfaceC33224a;
import com.avito.android.photo_picker.InterfaceC33232f;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.publish.view.result_handler.PublishResultReceiverFragment;
import com.avito.android.util.C35755b0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import java.util.List;
import java.util.Objects;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CameraItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_camera_view/e;", "Lcom/avito/android/photo_camera_view/d;", "Lcom/avito/android/permissions/y;", "a", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_camera_view.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C33174e implements InterfaceC33173d, com.avito.android.permissions.y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33232f f216372a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_storage.a f216373b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.device_orientation.e f216374c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.device_orientation.f f216375d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<? extends InterfaceC33173d.a> f216376e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f216377f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33170a f216378g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final u80.c f216379h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f216380i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C f216381j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final F f216382k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f216383l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public x f216384m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public CameraType f216385n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public FlashMode f216386o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public PublishResultReceiverFragment f216387p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public InterfaceC33224a f216388q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final List<CameraType> f216389r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public List<? extends FlashMode> f216390s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public com.avito.android.device_orientation.c f216391t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public io.reactivex.rxjava3.subjects.f<SurfaceTexture> f216392u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final TextureView.SurfaceTextureListener f216393v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f216394w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f216395x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f216396y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f216397z;

    /* compiled from: CameraItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/funktionale/option/a;", "Lcom/avito/android/photo_picker/a;", "it", "Lkotlin/G0;", "accept", "(Lorg/funktionale/option/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_camera_view.e$b */
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33224a interfaceC33224a = (InterfaceC33224a) ((org.funktionale.option.a) obj).c();
            if (interfaceC33224a != null) {
                C33174e c33174e = C33174e.this;
                interfaceC33224a.e(c33174e.f216375d.getRotation(), c33174e.s());
            }
        }
    }

    /* compiled from: CameraItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/funktionale/option/a;", "Lcom/avito/android/photo_picker/a;", "interactor", "Lkotlin/G0;", "accept", "(Lorg/funktionale/option/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_camera_view.e$c */
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            org.funktionale.option.a aVar = (org.funktionale.option.a) obj;
            boolean zB2 = aVar.b();
            C33174e c33174e = C33174e.this;
            if (zB2) {
                x xVar = c33174e.f216384m;
                if (xVar != null) {
                    xVar.BI();
                }
            } else {
                x xVar2 = c33174e.f216384m;
                if (xVar2 != null) {
                    xVar2.z50();
                }
                c33174e.f216388q = (InterfaceC33224a) aVar.c();
            }
            x xVar3 = c33174e.f216384m;
            if (xVar3 != null) {
                xVar3.E70();
            }
        }
    }

    /* compiled from: CameraItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lorg/funktionale/option/a;", "Lcom/avito/android/photo_picker/a;", "<anonymous parameter 0>", "Landroid/graphics/SurfaceTexture;", "kotlin.jvm.PlatformType", "surfaceHolder", "apply", "(Lorg/funktionale/option/a;Landroid/graphics/SurfaceTexture;)Landroid/graphics/SurfaceTexture;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_camera_view.e$d */
    public static final class d<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T1, T2, R> f216401b = new d<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return (SurfaceTexture) obj2;
        }
    }

    /* compiled from: CameraItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/graphics/SurfaceTexture;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Landroid/graphics/SurfaceTexture;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_camera_view.e$e, reason: collision with other inner class name */
    public static final class C6489e<T> implements l41.g {
        public C6489e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33174e c33174e = C33174e.this;
            C33174e.r(c33174e, (SurfaceTexture) obj);
            InterfaceC33224a interfaceC33224a = c33174e.f216388q;
            if (interfaceC33224a == null) {
                return;
            }
            u80.g gVar = w.f216424a;
            if (interfaceC33224a.getF218885e()) {
                interfaceC33224a.d(gVar);
            }
        }
    }

    /* compiled from: CameraItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/graphics/SurfaceTexture;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/graphics/SurfaceTexture;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_camera_view.e$f */
    public static final class f extends N implements Y41.l<SurfaceTexture, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SurfaceTexture surfaceTexture) {
            InterfaceC33224a interfaceC33224a;
            C33174e c33174e = C33174e.this;
            InterfaceC33224a interfaceC33224a2 = c33174e.f216388q;
            if (interfaceC33224a2 != null) {
                List<FlashMode> listA = interfaceC33224a2.a();
                c33174e.f216390s = listA;
                if (!listA.contains(c33174e.f216386o)) {
                    c33174e.f216386o = (FlashMode) C42745f0.E(c33174e.f216390s);
                }
                FlashMode flashMode = c33174e.f216386o;
                x xVar = c33174e.f216384m;
                if (xVar != null && (interfaceC33224a = c33174e.f216388q) != null) {
                    interfaceC33224a.j(flashMode).u0(new i(c33174e, flashMode, xVar), j.f216411b);
                }
            }
            x xVar2 = c33174e.f216384m;
            if (xVar2 != null) {
                xVar2.bU(c33174e.f216389r.size() > 1);
                xVar2.n40(c33174e.f216390s.size() > 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CameraItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_camera_view.e$g */
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.avito.android.photo_camera_view.d$b, com.avito.android.publish.view.result_handler.PublishResultReceiverFragment] */
        @Override // Y41.a
        public final G0 invoke() {
            ?? r02 = C33174e.this.f216387p;
            if (r02 != 0) {
                r02.H2();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.avito.android.photo_picker.FlashMode] */
    public C33174e(@Y61.k InterfaceC33232f interfaceC33232f, @Y61.k com.avito.android.photo_storage.a aVar, @Y61.k com.avito.android.device_orientation.e eVar, @Y61.k com.avito.android.device_orientation.f fVar, @Y61.k h31.e eVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33170a interfaceC33170a, @Y61.k u80.c cVar, @Y61.k CameraType.BackCamera backCamera, boolean z12, @Y61.k C c12, @Y61.k F f12, @Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.l CameraPresenterState cameraPresenterState) {
        ?? r12;
        this.f216372a = interfaceC33232f;
        this.f216373b = aVar;
        this.f216374c = eVar;
        this.f216375d = fVar;
        this.f216376e = eVar2;
        this.f216377f = interfaceC35745a5;
        this.f216378g = interfaceC33170a;
        this.f216379h = cVar;
        this.f216380i = z12;
        this.f216381j = c12;
        this.f216382k = f12;
        this.f216383l = sharedPhotosStorage;
        FlashMode.Off off = FlashMode.Off.f218749c;
        this.f216386o = off;
        List<CameraType> listA = interfaceC33232f.a();
        this.f216389r = listA;
        this.f216390s = C42784z0.f406748b;
        this.f216391t = new c.a();
        this.f216392u = io.reactivex.rxjava3.subjects.f.N0();
        this.f216393v = new a();
        this.f216394w = new io.reactivex.rxjava3.disposables.c();
        this.f216395x = new io.reactivex.rxjava3.disposables.c();
        if (cameraPresenterState != null) {
            this.f216385n = cameraPresenterState.f216365b;
        } else if (listA.contains(backCamera)) {
            this.f216385n = backCamera;
        } else if (listA.size() == 0) {
            this.f216385n = null;
        } else {
            this.f216385n = CameraType.BackCamera.f218740c;
        }
        if (cameraPresenterState != null && (r12 = cameraPresenterState.f216366c) != 0) {
            off = r12;
        }
        this.f216386o = off;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(com.avito.android.photo_camera_view.C33174e r4, android.graphics.SurfaceTexture r5) {
        /*
            com.avito.android.photo_camera_view.x r0 = r4.f216384m
            if (r0 != 0) goto L5
            goto L60
        L5:
            android.view.TextureView r1 = r0.getF239361w()
            boolean r1 = r1.isAvailable()
            if (r1 != 0) goto L10
            goto L60
        L10:
            com.avito.android.photo_picker.a r1 = r4.f216388q
            r2 = 0
            if (r1 != 0) goto L23
            io.reactivex.rxjava3.internal.observers.y r1 = r4.f216396y
            r3 = 1
            if (r1 == 0) goto L1f
            boolean r1 = r1.getF318621e()
            goto L20
        L1f:
            r1 = r3
        L20:
            if (r1 == 0) goto L23
            goto L24
        L23:
            r3 = r2
        L24:
            if (r3 == 0) goto L2c
            com.avito.android.photo_picker.CameraType r5 = r4.f216385n
            r4.t(r5)
            goto L60
        L2c:
            u80.c r1 = r0.CO()
            r0.Bo(r2)
            com.avito.android.photo_picker.a r2 = r4.f216388q
            if (r2 != 0) goto L38
            goto L60
        L38:
            com.avito.android.device_orientation.f r3 = r4.f216375d
            com.avito.android.device_orientation.c r3 = r3.getRotation()
            u80.c r0 = r0.CO()
            u80.c r5 = r2.f(r5, r1, r3, r0)
            com.avito.android.photo_camera_view.x r0 = r4.f216384m
            if (r0 == 0) goto L60
            u80.c r0 = r0.CO()
            if (r5 != 0) goto L51
            goto L60
        L51:
            float r5 = u80.f.b(r5)
            u80.c r5 = u80.f.c(r0, r5)
            com.avito.android.photo_camera_view.x r4 = r4.f216384m
            if (r4 == 0) goto L60
            r4.v00(r5)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_camera_view.C33174e.r(com.avito.android.photo_camera_view.e, android.graphics.SurfaceTexture):void");
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d
    public final void a() {
        if (this.f216384m != null) {
            io.reactivex.rxjava3.disposables.c cVar = this.f216395x;
            if (cVar.g() > 0) {
                return;
            }
            InterfaceC33170a interfaceC33170a = this.f216378g;
            cVar.b(C35896f0.g(interfaceC33170a.k().N(m.f216413b), new n(this)));
            if (this.f216380i) {
                cVar.b(C35896f0.g(interfaceC33170a.n().N(o.f216415b), new p(this)));
            }
            cVar.b(C35896f0.g(io.reactivex.rxjava3.core.z.k(interfaceC33170a.n(), interfaceC33170a.k(), new l()), new q(this)));
            cVar.b(C35896f0.g(interfaceC33170a.o(), new r(this)));
            interfaceC33170a.i();
            interfaceC33170a.q();
        }
    }

    @Override // com.avito.android.photo_camera_view.x.b
    public final void b() {
        this.f216385n = (CameraType) C35755b0.e(this.f216389r, this.f216385n, true);
        InterfaceC33224a interfaceC33224a = this.f216388q;
        if (interfaceC33224a != null) {
            interfaceC33224a.l();
        }
        InterfaceC33224a interfaceC33224a2 = this.f216388q;
        if (interfaceC33224a2 != null) {
            interfaceC33224a2.destroy();
        }
        io.reactivex.rxjava3.internal.observers.y yVar = this.f216396y;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f216396y = null;
        this.f216388q = null;
        t(this.f216385n);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.photo_camera_view.d$b, com.avito.android.publish.view.result_handler.PublishResultReceiverFragment] */
    @Override // com.avito.android.photo_camera_view.x.b
    public final void c() {
        ?? r02 = this.f216387p;
        if (r02 == 0) {
            return;
        }
        r02.Q4();
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d
    public final void c0() {
        this.f216387p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.photo_camera_view.InterfaceC33173d
    public final void d(@Y61.k InterfaceC33173d.b bVar) {
        this.f216387p = (PublishResultReceiverFragment) bVar;
    }

    @Override // com.avito.android.photo_camera_view.x.b
    public final void e() {
        InterfaceC33224a interfaceC33224a;
        FlashMode flashMode = (FlashMode) C35755b0.e(this.f216390s, this.f216386o, true);
        if (flashMode == null) {
            flashMode = FlashMode.Off.f218749c;
        }
        x xVar = this.f216384m;
        if (xVar == null || (interfaceC33224a = this.f216388q) == null) {
            return;
        }
        interfaceC33224a.j(flashMode).u0(new i(this, flashMode, xVar), j.f216411b);
    }

    @Override // com.avito.android.photo_camera_view.x.b
    public final void f() {
        InterfaceC33224a interfaceC33224a = this.f216388q;
        if (interfaceC33224a == null || this.f216397z) {
            return;
        }
        this.f216397z = true;
        x xVar = this.f216384m;
        if (xVar != null) {
            xVar.L70(false);
        }
        this.f216394w.b(interfaceC33224a.i(true).u(new s(this, s())).d0(new t(this)).v0(new u(this), new v(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d
    public final void g() {
        InterfaceC33224a interfaceC33224a = this.f216388q;
        if (interfaceC33224a != null) {
            interfaceC33224a.l();
        }
        InterfaceC33224a interfaceC33224a2 = this.f216388q;
        if (interfaceC33224a2 != null) {
            interfaceC33224a2.destroy();
        }
        io.reactivex.rxjava3.internal.observers.y yVar = this.f216396y;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f216396y = null;
        this.f216388q = null;
        this.f216395x.e();
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d
    @Y61.k
    public final CameraPresenterState getState() {
        return new CameraPresenterState(this.f216385n, this.f216386o);
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d
    public final void j(@Y61.k x xVar) {
        m();
        this.f216384m = xVar;
        xVar.getF239361w().setSurfaceTextureListener(this.f216393v);
        if (this.f216385n == null) {
            xVar.bU(false);
            xVar.n40(false);
            xVar.BI();
        }
        this.f216394w.b(com.avito.android.util.rx3.r.a(this.f216374c.a(), new C33175f(this)));
        a();
    }

    @Override // com.avito.android.permissions.y
    public final void l(int i12, @Y61.k String[] strArr, @Y61.k int[] iArr) {
        this.f216378g.l(i12, strArr, iArr);
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d
    public final void m() {
        x xVar = this.f216384m;
        TextureView f239361w = xVar != null ? xVar.getF239361w() : null;
        if (f239361w != null) {
            f239361w.setSurfaceTextureListener(null);
        }
        this.f216397z = false;
        io.reactivex.rxjava3.internal.observers.y yVar = this.f216396y;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f216396y = null;
        this.f216394w.e();
        this.f216395x.e();
        this.f216384m = null;
    }

    @Override // com.avito.android.photo_camera_view.x.b
    public final void p() {
        this.f216378g.h(new g());
    }

    public final u80.c s() {
        x xVar = this.f216384m;
        u80.c cVarD = xVar != null ? u80.f.d(this.f216391t.f139238a, xVar.CO()) : null;
        com.avito.android.device_orientation.c cVar = this.f216391t;
        boolean z12 = (cVar instanceof c.d) || (cVar instanceof c.C4199c);
        u80.c cVar2 = this.f216379h;
        int i12 = cVar2.f439809a;
        int i13 = cVar2.f439810b;
        u80.c cVar3 = ((i12 <= i13 || z12) && (i13 <= i12 || !z12)) ? new u80.c(i12, i13) : new u80.c(i13, i12);
        if (cVarD == null) {
            return cVar3;
        }
        float fB2 = u80.f.b(cVar3) / u80.f.b(cVarD);
        return new u80.c((int) (cVar3.f439809a * Math.min(1.0f, fB2)), (int) (cVar3.f439810b * Math.min(1.0f, 1.0f / fB2)));
    }

    public final void t(CameraType cameraType) {
        if (cameraType == null) {
            return;
        }
        x xVar = this.f216384m;
        if (xVar != null) {
            xVar.n40(false);
            xVar.bU(false);
        }
        io.reactivex.rxjava3.internal.observers.y yVar = this.f216396y;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f216396y = null;
        C42022u c42022uK = this.f216372a.b(cameraType).k(new b());
        InterfaceC35745a5 interfaceC35745a5 = this.f216377f;
        io.reactivex.rxjava3.core.z<T> zVarF = c42022uK.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).k(new c()).F();
        io.reactivex.rxjava3.subjects.f<SurfaceTexture> fVar = this.f216392u;
        l41.c cVar = d.f216401b;
        Objects.requireNonNull(fVar, "other is null");
        this.f216396y = C35896f0.g(io.reactivex.rxjava3.core.z.K0(zVarF, fVar, cVar).j0(interfaceC35745a5.e()).K(new C6489e()), new f());
    }

    /* compiled from: CameraItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_camera_view/e$a;", "Landroid/view/TextureView$SurfaceTextureListener;", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_camera_view.e$a */
    public final class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(@Y61.k SurfaceTexture surfaceTexture, int i12, int i13) {
            C33174e c33174e = C33174e.this;
            c33174e.f216392u.onNext(surfaceTexture);
            c33174e.f216392u.e();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(@Y61.k SurfaceTexture surfaceTexture) {
            x xVar;
            io.reactivex.rxjava3.subjects.f<SurfaceTexture> fVarN0 = io.reactivex.rxjava3.subjects.f.N0();
            C33174e c33174e = C33174e.this;
            c33174e.f216392u = fVarN0;
            if (c33174e.f216388q != null && (xVar = c33174e.f216384m) != null) {
                xVar.Bo(true);
            }
            InterfaceC33224a interfaceC33224a = c33174e.f216388q;
            if (interfaceC33224a != null) {
                interfaceC33224a.l();
            }
            surfaceTexture.release();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(@Y61.k SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(@Y61.k SurfaceTexture surfaceTexture, int i12, int i13) {
        }
    }
}
