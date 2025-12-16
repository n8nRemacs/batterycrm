package com.avito.android.photo_picker;

import Ag.CallableC13028a;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.avito.android.device_orientation.c;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.photo_picker.FlashMode;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CameraInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/c;", "Lcom/avito/android/photo_picker/a;", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33226c implements InterfaceC33224a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Camera f218881a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CameraType f218882b;

    /* renamed from: c, reason: collision with root package name */
    public final int f218883c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Matrix f218884d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f218885e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f218886f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f218887g;

    /* compiled from: CameraInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "Lkotlin/G0;", "invoke", "(Landroid/hardware/Camera$Parameters;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Camera.Parameters, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ RectF f218889m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ RectF f218890n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RectF rectF, RectF rectF2) {
            super(1);
            this.f218889m = rectF;
            this.f218890n = rectF2;
        }

        @Override // Y41.l
        public final G0 invoke(Camera.Parameters parameters) {
            Camera.Parameters parameters2 = parameters;
            parameters2.setFocusMode("auto");
            int maxNumFocusAreas = parameters2.getMaxNumFocusAreas();
            C33226c c33226c = C33226c.this;
            if (maxNumFocusAreas > 0) {
                Matrix matrix = c33226c.f218884d;
                RectF rectF = this.f218889m;
                matrix.mapRect(rectF);
                parameters2.setFocusAreas(Collections.singletonList(new Camera.Area(new Rect(kotlin.math.b.b(rectF.left), kotlin.math.b.b(rectF.top), kotlin.math.b.b(rectF.right), kotlin.math.b.b(rectF.bottom)), 1000)));
            }
            if (parameters2.getMaxNumMeteringAreas() > 0) {
                RectF rectF2 = this.f218890n;
                c33226c.f218884d.mapRect(rectF2);
                parameters2.setMeteringAreas(Collections.singletonList(new Camera.Area(new Rect(kotlin.math.b.b(rectF2.left), kotlin.math.b.b(rectF2.top), kotlin.math.b.b(rectF2.right), kotlin.math.b.b(rectF2.bottom)), 1000)));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CameraInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "Lkotlin/G0;", "invoke", "(Landroid/hardware/Camera$Parameters;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.c$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Camera.Parameters, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Rect f218891l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Rect rect) {
            super(1);
            this.f218891l = rect;
        }

        @Override // Y41.l
        public final G0 invoke(Camera.Parameters parameters) {
            Camera.Parameters parameters2 = parameters;
            parameters2.setFocusMode("continuous-picture");
            parameters2.setFocusAreas(Collections.singletonList(new Camera.Area(this.f218891l, 1000)));
            return G0.f406611a;
        }
    }

    /* compiled from: CameraInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "Lkotlin/G0;", "invoke", "(Landroid/hardware/Camera$Parameters;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.c$c, reason: collision with other inner class name */
    public static final class C6573c extends kotlin.jvm.internal.N implements Y41.l<Camera.Parameters, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f218892l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ u80.c f218893m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6573c(int i12, u80.c cVar) {
            super(1);
            this.f218892l = i12;
            this.f218893m = cVar;
        }

        @Override // Y41.l
        public final G0 invoke(Camera.Parameters parameters) {
            Camera.Parameters parameters2 = parameters;
            parameters2.setRotation(this.f218892l);
            u80.c cVar = this.f218893m;
            if (cVar != null) {
                parameters2.setPictureSize(cVar.f439809a, cVar.f439810b);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CameraInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "Lkotlin/G0;", "invoke", "(Landroid/hardware/Camera$Parameters;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.c$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Camera.Parameters, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u80.c f218894l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u80.c cVar) {
            super(1);
            this.f218894l = cVar;
        }

        @Override // Y41.l
        public final G0 invoke(Camera.Parameters parameters) {
            u80.c cVar = this.f218894l;
            parameters.setPreviewSize(cVar.f439809a, cVar.f439810b);
            return G0.f406611a;
        }
    }

    /* compiled from: CameraInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.c$e */
    public static final class e<T, R> implements l41.o {
        public e() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Boolean) obj).getClass();
            return new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.photo_picker.camera.y(0, C33226c.this.f218881a));
        }
    }

    public C33226c(@Y61.k Camera camera, @Y61.k CameraType cameraType) {
        this.f218881a = camera;
        this.f218882b = cameraType;
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFocusModes = parameters != null ? parameters.getSupportedFocusModes() : null;
        boolean zContains = supportedFocusModes == null ? false : supportedFocusModes.contains("auto");
        boolean z12 = camera.getParameters().getMaxNumFocusAreas() > 0;
        Camera.Parameters parameters2 = camera.getParameters();
        List<String> supportedFocusModes2 = parameters2 != null ? parameters2.getSupportedFocusModes() : null;
        boolean zContains2 = supportedFocusModes2 != null ? supportedFocusModes2.contains("continuous-picture") : false;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(cameraType.f218739b, cameraInfo);
        this.f218883c = cameraInfo.orientation;
        this.f218884d = new Matrix();
        this.f218885e = zContains2;
        this.f218886f = zContains;
        this.f218887g = z12;
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    @Y61.k
    public final List<FlashMode> a() {
        Camera.Parameters parameters = this.f218881a.getParameters();
        List<String> supportedFlashModes = parameters != null ? parameters.getSupportedFlashModes() : null;
        if (supportedFlashModes == null) {
            return Collections.singletonList(FlashMode.Off.f218749c);
        }
        List<String> list = supportedFlashModes;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C33266q.a((String) it.next()));
        }
        ArrayList arrayListC = C42745f0.C(arrayList);
        return arrayListC.isEmpty() ? Collections.singletonList(FlashMode.Off.f218749c) : arrayListC;
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    /* renamed from: b, reason: from getter */
    public final boolean getF218887g() {
        return this.f218887g;
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    public final int c(@Y61.k com.avito.android.device_orientation.c cVar) {
        int i12 = ((this.f218883c - cVar.f139238a) + 360) % 360;
        if (kotlin.jvm.internal.L.f(this.f218882b, CameraType.FrontCamera.f218741c)) {
            return cVar.equals(new c.d()) ? true : cVar.equals(new c.C4199c()) ? (i12 + 180) % 360 : i12;
        }
        return i12;
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    public final void d(@Y61.k u80.g gVar) {
        float f12 = 2000;
        int i12 = (int) (0.3f * f12);
        int i13 = (int) (0.7f * f12);
        Rect rect = new Rect(i12, i12, i13, i13);
        rect.offset(-1000, -1000);
        b bVar = new b(rect);
        Camera camera = this.f218881a;
        C33231e.a(camera, bVar);
        camera.cancelAutoFocus();
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    public final void destroy() {
        this.f218881a.release();
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    public final void e(@Y61.k com.avito.android.device_orientation.c cVar, @Y61.k u80.c cVar2) {
        int iC2 = c(cVar);
        u80.c cVarD = u80.f.d(iC2, cVar2);
        Camera camera = this.f218881a;
        List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList(C42745f0.q(supportedPictureSizes, 10));
        for (Camera.Size size : supportedPictureSizes) {
            arrayList.add(new u80.c(size.width, size.height));
        }
        C33231e.a(camera, new C6573c(iC2, u80.f.a(arrayList, cVarD, 1)));
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    @Y61.l
    public final u80.c f(@Y61.k SurfaceTexture surfaceTexture, @Y61.k u80.c cVar, @Y61.k com.avito.android.device_orientation.c cVar2, @Y61.k u80.c cVar3) throws IOException {
        Camera.Size previewSize;
        boolean zF2 = kotlin.jvm.internal.L.f(this.f218882b, CameraType.FrontCamera.f218741c);
        int i12 = cVar2.f139238a;
        int i13 = this.f218883c;
        int i14 = zF2 ? (360 - ((i12 + i13) % 360)) % 360 : ((i13 - i12) + 360) % 360;
        Camera camera = this.f218881a;
        camera.setDisplayOrientation(i14);
        Matrix matrix = this.f218884d;
        matrix.postRotate(i14);
        float f12 = cVar3.f439809a;
        float f13 = cVar3.f439810b;
        matrix.postScale(f12 / 2000.0f, f13 / 2000.0f);
        matrix.postTranslate(f12 / 2.0f, f13 / 2.0f);
        matrix.invert(matrix);
        u80.c cVarD = u80.f.d(i13, cVar);
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList(C42745f0.q(supportedPreviewSizes, 10));
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new u80.c(size.width, size.height));
        }
        u80.c cVarA = u80.f.a(arrayList, cVarD, 2);
        if (cVarA != null) {
            C33231e.a(camera, new d(cVarA));
        }
        Camera.Size previewSize2 = camera.getParameters().getPreviewSize();
        if (previewSize2 != null) {
            surfaceTexture.setDefaultBufferSize(previewSize2.width, previewSize2.height);
        }
        camera.setPreviewTexture(surfaceTexture);
        camera.startPreview();
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null || (previewSize = parameters.getPreviewSize()) == null) {
            return null;
        }
        return u80.f.d(i14, new u80.c(previewSize.width, previewSize.height));
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    /* renamed from: g, reason: from getter */
    public final boolean getF218886f() {
        return this.f218886f;
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    /* renamed from: h, reason: from getter */
    public final boolean getF218885e() {
        return this.f218885e;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    @Override // com.avito.android.photo_picker.InterfaceC33224a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.core.z<byte[]> i(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L26
            android.hardware.Camera r3 = r2.f218881a
            android.hardware.Camera$Parameters r0 = r3.getParameters()
            java.lang.String r0 = r0.getFocusMode()
            java.lang.String r1 = "auto"
            boolean r0 = kotlin.jvm.internal.L.f(r0, r1)
            if (r0 == 0) goto L26
            com.avito.android.photo_picker.camera.y r0 = new com.avito.android.photo_picker.camera.y
            r1 = 1
            r0.<init>(r1, r3)
            io.reactivex.rxjava3.internal.operators.observable.C r3 = new io.reactivex.rxjava3.internal.operators.observable.C
            r3.<init>(r0)
            r0 = 1
            io.reactivex.rxjava3.internal.operators.observable.t1 r3 = r3.z0(r0)
            goto L2c
        L26:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            io.reactivex.rxjava3.internal.operators.observable.x0 r3 = io.reactivex.rxjava3.core.z.c0(r3)
        L2c:
            com.avito.android.photo_picker.c$e r0 = new com.avito.android.photo_picker.c$e
            r0.<init>()
            io.reactivex.rxjava3.core.z r3 = r3.u(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_picker.C33226c.i(boolean):io.reactivex.rxjava3.core.z");
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    @Y61.k
    public final C41948f0 j(@Y61.k FlashMode flashMode) {
        return io.reactivex.rxjava3.core.z.W(new CallableC13028a(24, this.f218881a, new C33230d(flashMode)));
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    public final void k(@Y61.k RectF rectF, @Y61.l RectF rectF2) {
        Camera camera = this.f218881a;
        try {
            camera.cancelAutoFocus();
            C33231e.a(camera, new a(rectF, rectF2));
            camera.autoFocus(new C33225b());
        } catch (RuntimeException e12) {
            V2.f318762a.a("DEFAULT_TAG", "Can't focus on rect " + rectF, e12);
        }
    }

    @Override // com.avito.android.photo_picker.InterfaceC33224a
    public final void l() {
        try {
            this.f218881a.stopPreview();
        } catch (Exception e12) {
            V2.f318762a.a("DEFAULT_TAG", "Error while stopping preview", e12);
        }
    }
}
