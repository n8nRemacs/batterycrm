package com.avito.android.photo_picker.camera_mvi.mvi;

import android.graphics.Bitmap;
import android.net.Uri;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.permissions.G;
import com.avito.android.permissions.u;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.a;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import o80.InterfaceC44600a;

/* compiled from: CameraActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lo80/a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC44600a, com.avito.android.photo_picker.camera_mvi.mvi.entity.a, CameraState> {

    /* renamed from: a, reason: collision with root package name */
    public final int f219121a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f219122b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N70.b f219123c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f219124d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f219125e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final u f219126f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final G f219127g;

    /* compiled from: CameraActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.camera_mvi.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6585a {
        static {
            int[] iArr = new int[CameraState.Flash.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CameraState.Flash flash = CameraState.Flash.f219161c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CameraState.CameraType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CameraState.CameraType cameraType = CameraState.CameraType.f219157b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public a(@Named("max_photo_count") int i12, @Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k N70.b bVar, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k u uVar, @Y61.k G g12) {
        this.f219121a = i12;
        this.f219122b = sharedPhotosStorage;
        this.f219123c = bVar;
        this.f219124d = r02;
        this.f219125e = interfaceC28373a;
        this.f219126f = uVar;
        this.f219127g = g12;
    }

    public static final Bitmap c(a aVar, Uri uri) {
        aVar.getClass();
        if (uri == null) {
            return null;
        }
        ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(uri);
        imageRequestBuilderB.f340805c = new UW0.d(300, 300);
        com.facebook.common.references.a aVar2 = (com.facebook.common.references.a) com.facebook.datasource.j.b(com.facebook.drawee.backends.pipeline.d.a().a(imageRequestBuilderB.a(), null));
        YW0.b bVar = aVar2 != null ? (YW0.b) aVar2.i() : null;
        YW0.a aVar3 = bVar instanceof YW0.a ? (YW0.a) bVar : null;
        Bitmap bitmapD = aVar3 != null ? aVar3.d() : null;
        if (bitmapD == null || bitmapD.isRecycled()) {
            StringBuilder sb2 = new StringBuilder("CameraActor.loadBitmap isRecycled = ");
            sb2.append(bitmapD != null ? Boolean.valueOf(bitmapD.isRecycled()) : null);
            aVar.f219125e.c(new NonFatalErrorEvent(sb2.toString(), null, null, null, 14, null));
            return null;
        }
        Bitmap.Config config = bitmapD.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return bitmapD.copy(config, true);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<com.avito.android.photo_picker.camera_mvi.mvi.entity.a> b(InterfaceC44600a interfaceC44600a, CameraState cameraState) {
        CameraState.CameraType cameraType;
        C43210w c43210w;
        CameraState.Flash flash;
        InterfaceC44600a interfaceC44600a2 = interfaceC44600a;
        CameraState cameraState2 = cameraState;
        if (interfaceC44600a2.equals(InterfaceC44600a.q.f419466a) ? true : interfaceC44600a2.equals(InterfaceC44600a.p.f419465a)) {
            return new C43210w(a.q.f219203a);
        }
        if (interfaceC44600a2.equals(InterfaceC44600a.i.f419457a)) {
            int iOrdinal = cameraState2.f219148d.ordinal();
            if (iOrdinal == 0) {
                flash = CameraState.Flash.f219162d;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                flash = CameraState.Flash.f219161c;
            }
            c43210w = new C43210w(new a.c(flash));
        } else {
            if (!interfaceC44600a2.equals(InterfaceC44600a.d.f419452a)) {
                boolean z12 = interfaceC44600a2 instanceof InterfaceC44600a.j;
                R0 r02 = this.f219124d;
                if (z12) {
                    return C43175k.I(r02.a(), C43175k.G(new d(this, ((InterfaceC44600a.j) interfaceC44600a2).f419458a, null)));
                }
                boolean z13 = interfaceC44600a2 instanceof InterfaceC44600a.m;
                boolean z14 = cameraState2.f219153i;
                if (z13) {
                    return C43175k.G(new h(((InterfaceC44600a.m) interfaceC44600a2).f419461a, z14, null));
                }
                if (interfaceC44600a2 instanceof InterfaceC44600a.n) {
                    InterfaceC44600a.n nVar = (InterfaceC44600a.n) interfaceC44600a2;
                    return C43175k.I(r02.a(), C43175k.G(new i(this, nVar.f419462a, nVar.f419463b, null)));
                }
                if (interfaceC44600a2.equals(InterfaceC44600a.g.f419455a)) {
                    return new C43210w(a.i.f219190a);
                }
                if (interfaceC44600a2.equals(InterfaceC44600a.h.f419456a)) {
                    return new C43210w(a.e.f219186a);
                }
                if (interfaceC44600a2.equals(InterfaceC44600a.o.f419464a)) {
                    return new C43210w(a.h.f219189a);
                }
                if (interfaceC44600a2.equals(InterfaceC44600a.k.f419459a)) {
                    return C43175k.G(new f(cameraState2.f219146b, z14, cameraState2.f219147c, null));
                }
                if (interfaceC44600a2 instanceof InterfaceC44600a.f) {
                    return C43175k.G(new c(this, ((InterfaceC44600a.f) interfaceC44600a2).f419454a, null));
                }
                if (interfaceC44600a2 instanceof InterfaceC44600a.c) {
                    InterfaceC44600a.c cVar = (InterfaceC44600a.c) interfaceC44600a2;
                    return C43175k.G(new e(cVar.f419450a, cVar.f419451b, null));
                }
                if (interfaceC44600a2 instanceof InterfaceC44600a.l) {
                    return C43175k.G(new g(this, ((InterfaceC44600a.l) interfaceC44600a2).f419460a, null));
                }
                if (interfaceC44600a2 instanceof InterfaceC44600a.e) {
                    return C43175k.G(new b(((InterfaceC44600a.e) interfaceC44600a2).f419453a, null));
                }
                if (interfaceC44600a2.equals(InterfaceC44600a.b.f419449a)) {
                    return new C43210w(a.C6587a.f219180a);
                }
                if (interfaceC44600a2.equals(InterfaceC44600a.C12165a.f419448a)) {
                    return new C43210w(a.m.f219196a);
                }
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal2 = cameraState2.f219149e.ordinal();
            if (iOrdinal2 == 0) {
                cameraType = CameraState.CameraType.f219158c;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                cameraType = CameraState.CameraType.f219157b;
            }
            c43210w = new C43210w(new a.b(cameraType));
        }
        return c43210w;
    }
}
