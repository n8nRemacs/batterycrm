package com.avito.android.photo_picker.camera;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.R;
import com.avito.android.permissions.G;
import com.avito.android.photo_camera_view.F;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.photo_picker.FlashMode;
import com.avito.android.photo_picker.FocusMode;
import com.avito.android.photo_picker.InterfaceC33224a;
import com.avito.android.photo_picker.InterfaceC33232f;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: CameraViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/camera/i;", "Landroidx/lifecycle/M0;", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_storage.a f218969E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.x f218970J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f218971K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33232f f218972L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.device_orientation.f f218973M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final N70.b f218974N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f218975O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final F f218976P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f218977Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final G f218978R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public InterfaceC33224a f218979S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f218980T = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f218981U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f218982V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public SurfaceTexture f218983W;

    /* renamed from: X, reason: collision with root package name */
    public u80.c f218984X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public CameraType f218985Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final List<CameraType> f218986Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public List<? extends FlashMode> f218987a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<a> f218988b0;

    /* renamed from: c0, reason: collision with root package name */
    public PhotoPickerViewModel f218989c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public FocusMode f218990d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final f f218991e0;

    /* compiled from: CameraViewModel.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "Lcom/avito/android/photo_picker/camera/i$a$a;", "Lcom/avito/android/photo_picker/camera/i$a$b;", "Lcom/avito/android/photo_picker/camera/i$a$c;", "Lcom/avito/android/photo_picker/camera/i$a$d;", "Lcom/avito/android/photo_picker/camera/i$a$e;", "Lcom/avito/android/photo_picker/camera/i$a$f;", "Lcom/avito/android/photo_picker/camera/i$a$g;", "Lcom/avito/android/photo_picker/camera/i$a$h;", "Lcom/avito/android/photo_picker/camera/i$a$i;", "Lcom/avito/android/photo_picker/camera/i$a$j;", "Lcom/avito/android/photo_picker/camera/i$a$k;", "Lcom/avito/android/photo_picker/camera/i$a$l;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$a;", "Lcom/avito/android/photo_picker/camera/i$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.camera.i$a$a, reason: collision with other inner class name */
        public static final class C6575a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f218992a;

            public C6575a(int i12) {
                super(null);
                this.f218992a = i12;
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$b;", "Lcom/avito/android/photo_picker/camera/i$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Bitmap f218993a;

            public b(@Y61.k Bitmap bitmap) {
                super(null);
                this.f218993a = bitmap;
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$c;", "Lcom/avito/android/photo_picker/camera/i$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f218994a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$d;", "Lcom/avito/android/photo_picker/camera/i$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f218995a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$e;", "Lcom/avito/android/photo_picker/camera/i$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f218996a = new e();

            public e() {
                super(null);
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$f;", "Lcom/avito/android/photo_picker/camera/i$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final f f218997a = new f();

            public f() {
                super(null);
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$g;", "Lcom/avito/android/photo_picker/camera/i$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class g extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final g f218998a = new g();

            public g() {
                super(null);
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$h;", "Lcom/avito/android/photo_picker/camera/i$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f218999a;

            public h(boolean z12) {
                super(null);
                this.f218999a = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f218999a == ((h) obj).f218999a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f218999a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("PhotoCaptureSuccess(withCameraRestart="), this.f218999a, ')');
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$i;", "Lcom/avito/android/photo_picker/camera/i$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.camera.i$a$i, reason: collision with other inner class name */
        public static final class C6576i extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6576i f219000a = new C6576i();

            public C6576i() {
                super(null);
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$j;", "Lcom/avito/android/photo_picker/camera/i$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class j extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f219001a;

            public j(int i12) {
                super(null);
                this.f219001a = i12;
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$k;", "Lcom/avito/android/photo_picker/camera/i$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class k extends a {

            /* renamed from: a, reason: collision with root package name */
            public final float f219002a;

            /* renamed from: b, reason: collision with root package name */
            public final float f219003b;

            public k(float f12, float f13) {
                super(null);
                this.f219002a = f12;
                this.f219003b = f13;
            }
        }

        /* compiled from: CameraViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/i$a$l;", "Lcom/avito/android/photo_picker/camera/i$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class l extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Matrix f219004a;

            public l(@Y61.k Matrix matrix) {
                super(null);
                this.f219004a = matrix;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CameraViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/funktionale/option/a;", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/G0;", "accept", "(Lorg/funktionale/option/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            org.funktionale.option.a aVar = (org.funktionale.option.a) obj;
            i.this.f218988b0.setValue(aVar.b() ? a.e.f218996a : new a.b((Bitmap) aVar.a()));
        }
    }

    /* compiled from: CameraViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i.this.f218988b0.setValue(a.e.f218996a);
            V2.f318762a.a("DEFAULT_TAG", "Can't get last image from gallery", (Throwable) obj);
        }
    }

    /* compiled from: CameraViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/funktionale/option/a;", "Lcom/avito/android/photo_picker/a;", "it", "Lkotlin/G0;", "accept", "(Lorg/funktionale/option/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33224a interfaceC33224a = (InterfaceC33224a) ((org.funktionale.option.a) obj).c();
            if (interfaceC33224a != null) {
                i iVar = i.this;
                interfaceC33224a.e(iVar.f218973M.getRotation(), iVar.le());
            }
        }
    }

    /* compiled from: CameraViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/funktionale/option/a;", "Lcom/avito/android/photo_picker/a;", "interactor", "Lkotlin/G0;", "accept", "(Lorg/funktionale/option/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            org.funktionale.option.a aVar = (org.funktionale.option.a) obj;
            if (aVar.b()) {
                return;
            }
            InterfaceC33224a interfaceC33224a = (InterfaceC33224a) aVar.a();
            i iVar = i.this;
            iVar.f218979S = interfaceC33224a;
            i.ke(iVar);
        }
    }

    public i(@Y61.k N70.b bVar, @Y61.k com.avito.android.device_orientation.f fVar, @Y61.k com.avito.android.permissions.x xVar, @Y61.k G g12, @Y61.k F f12, @Y61.k InterfaceC33232f interfaceC33232f, @Y61.k CameraType cameraType, @Y61.k com.avito.android.photo_storage.a aVar, @Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k InterfaceC35745a5 interfaceC35745a5, boolean z12) {
        this.f218969E = aVar;
        this.f218970J = xVar;
        this.f218971K = interfaceC35745a5;
        this.f218972L = interfaceC33232f;
        this.f218973M = fVar;
        this.f218974N = bVar;
        this.f218975O = sharedPhotosStorage;
        this.f218976P = f12;
        this.f218977Q = z12;
        this.f218978R = g12;
        List<CameraType> listA = interfaceC33232f.a();
        this.f218986Z = listA;
        this.f218987a0 = C42784z0.f406748b;
        this.f218988b0 = new C23038g0<>();
        this.f218990d0 = FocusMode.f218751b;
        if (!listA.contains(cameraType)) {
            cameraType = listA.size() == 0 ? null : CameraType.BackCamera.f218740c;
        }
        this.f218985Y = cameraType;
        this.f218991e0 = new f();
    }

    public static final void ke(i iVar) {
        InterfaceC33224a interfaceC33224a = iVar.f218979S;
        if (interfaceC33224a == null) {
            return;
        }
        SurfaceTexture surfaceTexture = iVar.f218983W;
        u80.c cVarLe = iVar.le();
        com.avito.android.device_orientation.c rotation = iVar.f218973M.getRotation();
        u80.c cVar = iVar.f218984X;
        if (cVar == null) {
            cVar = null;
        }
        u80.c cVarF = interfaceC33224a.f(surfaceTexture, cVarLe, rotation, cVar);
        if (cVarF != null) {
            u80.c cVar2 = iVar.f218984X;
            if (cVar2 == null) {
                cVar2 = null;
            }
            u80.c cVarC = u80.f.c(cVar2, u80.f.b(cVarF));
            C23038g0<a> c23038g0 = iVar.f218988b0;
            Matrix matrix = new Matrix();
            float f12 = cVarC.f439809a;
            u80.c cVar3 = iVar.f218984X;
            float f13 = f12 / (cVar3 == null ? null : cVar3).f439809a;
            float f14 = cVarC.f439810b;
            if (cVar3 == null) {
                cVar3 = null;
            }
            matrix.setScale(f13, f14 / cVar3.f439810b);
            u80.c cVar4 = iVar.f218984X;
            float f15 = ((cVar4 == null ? null : cVar4).f439809a - r3) / 2.0f;
            if (cVar4 == null) {
                cVar4 = null;
            }
            matrix.postTranslate(f15, (cVar4.f439810b - r0) / 2.0f);
            c23038g0.setValue(new a.l(matrix));
        }
        InterfaceC33224a interfaceC33224a2 = iVar.f218979S;
        if (interfaceC33224a2 != null) {
            u80.g gVar = s.f219032a;
            if (interfaceC33224a2.getF218885e()) {
                interfaceC33224a2.d(gVar);
            }
        }
        InterfaceC33224a interfaceC33224a3 = iVar.f218979S;
        if (interfaceC33224a3 == null) {
            return;
        }
        List<FlashMode> listA = interfaceC33224a3.a();
        iVar.f218987a0 = listA;
        PhotoPickerViewModel photoPickerViewModel = iVar.f218989c0;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        if (!listA.contains(photoPickerViewModel.f218830Z)) {
            PhotoPickerViewModel photoPickerViewModel2 = iVar.f218989c0;
            if (photoPickerViewModel2 == null) {
                photoPickerViewModel2 = null;
            }
            photoPickerViewModel2.f218830Z = (FlashMode) C42745f0.E(iVar.f218987a0);
        }
        PhotoPickerViewModel photoPickerViewModel3 = iVar.f218989c0;
        FlashMode flashMode = (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).f218830Z;
        InterfaceC33224a interfaceC33224a4 = iVar.f218979S;
        if (interfaceC33224a4 == null) {
            return;
        }
        iVar.f218980T.b(interfaceC33224a4.j(flashMode).v0(new n(iVar, flashMode), o.f219019b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final u80.c le() {
        u80.c cVar = this.f218984X;
        int i12 = (cVar == null ? null : cVar).f439809a;
        if (cVar == null) {
            cVar = null;
        }
        return new u80.c(i12, (cVar.f439809a * 4) / 3);
    }

    public final void me() {
        InterfaceC33224a interfaceC33224a = this.f218979S;
        if (interfaceC33224a != null) {
            interfaceC33224a.l();
        }
        InterfaceC33224a interfaceC33224a2 = this.f218979S;
        if (interfaceC33224a2 != null) {
            interfaceC33224a2.destroy();
        }
        this.f218979S = null;
    }

    public final void ne() {
        C41948f0 c41948f0A = this.f218969E.a();
        InterfaceC35745a5 interfaceC35745a5 = this.f218971K;
        this.f218980T.b(c41948f0A.x0(interfaceC35745a5.c()).j0(interfaceC35745a5.e()).v0(new b(), new c(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void oe(CameraType cameraType) {
        if (cameraType == null) {
            return;
        }
        io.reactivex.rxjava3.internal.observers.m mVar = this.f218982V;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        C42022u c42022uK = this.f218972L.b(cameraType).k(new d());
        InterfaceC35745a5 interfaceC35745a5 = this.f218971K;
        this.f218982V = (io.reactivex.rxjava3.internal.observers.m) c42022uK.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new e(), io.reactivex.rxjava3.internal.functions.a.f401996f);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f218982V;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        io.reactivex.rxjava3.internal.observers.y yVar = this.f218981U;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f218980T.e();
        super.onCleared();
    }

    public final void pe(@Y61.k SurfaceTexture surfaceTexture, int i12, int i13) {
        C23038g0<a> c23038g0 = this.f218988b0;
        boolean z12 = this.f218977Q;
        int i14 = R.string.allow_access;
        com.avito.android.permissions.x xVar = this.f218970J;
        if (!z12) {
            if (!xVar.b("android.permission.CAMERA")) {
                if (!xVar.a("android.permission.CAMERA")) {
                    i14 = R.string.go_to_settings;
                }
                c23038g0.setValue(new a.j(i14));
                return;
            } else {
                this.f218990d0 = FocusMode.f218751b;
                this.f218983W = surfaceTexture;
                this.f218984X = new u80.c(i12, i13);
                c23038g0.setValue(a.c.f218994a);
                oe(this.f218985Y);
                return;
            }
        }
        if (xVar.b("android.permission.CAMERA")) {
            this.f218990d0 = FocusMode.f218751b;
            this.f218983W = surfaceTexture;
            this.f218984X = new u80.c(i12, i13);
            c23038g0.setValue(a.c.f218994a);
            oe(this.f218985Y);
            return;
        }
        boolean zA2 = this.f218978R.a();
        boolean zA3 = xVar.a("android.permission.CAMERA");
        if (zA2 && !zA3) {
            i14 = R.string.go_to_settings;
        }
        c23038g0.setValue(new a.j(i14));
    }

    /* compiled from: CameraViewModel.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/photo_picker/camera/i$f", "Landroid/view/TextureView$SurfaceTextureListener;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements TextureView.SurfaceTextureListener {
        public f() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(@Y61.k SurfaceTexture surfaceTexture, int i12, int i13) {
            i.this.pe(surfaceTexture, i12, i13);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(@Y61.k SurfaceTexture surfaceTexture) {
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
