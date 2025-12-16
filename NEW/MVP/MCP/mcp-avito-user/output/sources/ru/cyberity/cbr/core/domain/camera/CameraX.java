package ru.cyberity.cbr.core.domain.camera;

import G.c;
import L91.e;
import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.Keep;
import androidx.camera.core.C20056e0;
import androidx.camera.core.C20144v;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC20120j0;
import androidx.camera.core.InterfaceC20127n;
import androidx.camera.core.InterfaceC20142t;
import androidx.camera.core.K;
import androidx.camera.core.O0;
import androidx.camera.core.T;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.InterfaceC20088d0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.s0;
import androidx.camera.core.v0;
import androidx.camera.lifecycle.i;
import androidx.camera.video.A;
import androidx.camera.video.AbstractC20184v;
import androidx.camera.video.C20181s;
import androidx.camera.video.C20183u;
import androidx.camera.video.C20188z;
import androidx.camera.video.D;
import androidx.camera.video.O;
import androidx.camera.video.U;
import androidx.camera.video.b0;
import androidx.camera.video.m0;
import androidx.camera.view.PreviewView;
import androidx.core.content.m;
import androidx.core.util.z;
import androidx.view.AbstractC22991Y;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.google.common.util.concurrent.D0;
import java.io.File;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.T;
import ru.cyberity.log.logger.Logger;

/* compiled from: CameraX.kt */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 j2\u00020\u0001:\u0002\u000ekB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u000e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000e\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u000e\u0010\u001bJ\u0019\u0010\u000e\u001a\u00020\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u000e\u0010\u001eJ\u001b\u0010\u000e\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b\u000e\u0010!J\r\u0010\"\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010\u0015J\u0015\u0010\u000e\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b\u000e\u0010%J\r\u0010&\u001a\u00020\u0013¢\u0006\u0004\b&\u0010\u0015J\u0015\u0010\u000e\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00108R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020V0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010i\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010h¨\u0006l"}, d2 = {"Lru/cyberity/cbr/core/domain/camera/CameraX;", "", "Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "mode", "Landroid/util/Size;", "frameSize", "Landroidx/camera/core/v;", "cameraSelector", "Lru/cyberity/cbr/core/domain/camera/a;", "listener", "<init>", "(Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;Landroid/util/Size;Landroidx/camera/core/v;Lru/cyberity/cbr/core/domain/camera/a;)V", "", "", "a", "(I)F", "Landroidx/camera/core/O0;", "c", "()Landroidx/camera/core/O0;", "Lkotlin/G0;", "b", "()V", "d", "Landroidx/lifecycle/P;", "lifecycleOwner", "Landroidx/camera/view/PreviewView;", "previewView", "(Landroidx/lifecycle/P;Landroidx/camera/view/PreviewView;)V", "", "filePrefix", "(Ljava/lang/String;)V", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "h", "", "enable", "(Z)V", "g", "exposure", "(F)V", "Lru/cyberity/cbr/core/domain/camera/b;", "f", "()Lru/cyberity/cbr/core/domain/camera/b;", "Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "Landroid/util/Size;", "Landroidx/camera/core/v;", "Lru/cyberity/cbr/core/domain/camera/a;", "Ljava/util/concurrent/ExecutorService;", "e", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "Lkotlinx/coroutines/M;", "Lkotlinx/coroutines/M;", "cameraDispatcher", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/T;", "coroutineScope", "Landroidx/camera/video/b0;", "Landroidx/camera/video/O;", "Landroidx/camera/video/b0;", "videoCaptureUseCase", "Landroidx/camera/video/U;", "i", "Landroidx/camera/video/U;", "videoRecording", "Landroidx/camera/core/e0;", "j", "Landroidx/camera/core/e0;", "imageCaptureUseCase", "Landroidx/camera/core/T;", "k", "Landroidx/camera/core/T;", "imageAnalysisUseCase", "Landroidx/camera/core/v0;", "l", "Landroidx/camera/core/v0;", MessageSuggest.PREVIEW, "Landroidx/camera/core/n;", "m", "Landroidx/camera/core/n;", "camera", "Landroidx/camera/lifecycle/i;", "n", "Landroidx/camera/lifecycle/i;", "cameraProvider", "Landroidx/camera/view/PreviewView$StreamState;", "o", "Landroidx/camera/view/PreviewView$StreamState;", "previewStreamState", "p", "Ljava/io/File;", "outputVideoFile", "q", "Landroidx/camera/view/PreviewView;", "Landroidx/lifecycle/h0;", "r", "Landroidx/lifecycle/h0;", "streamStateObserver", "LG/c;", "s", "LG/c;", "resolutionSelector", "Landroid/content/Context;", "()Landroid/content/Context;", "context", "t", "Mode", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CameraX {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final Mode mode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final Size frameSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final C20144v cameraSelector;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final a listener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private ExecutorService cameraExecutor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private M cameraDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private T coroutineScope;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private b0<O> videoCaptureUseCase;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private U videoRecording;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    private C20056e0 imageCaptureUseCase;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.camera.core.T imageAnalysisUseCase;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @l
    private v0 preview;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    private InterfaceC20127n camera;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @l
    private i cameraProvider;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @l
    private PreviewView.StreamState previewStreamState;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @l
    private File outputVideoFile;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @l
    private PreviewView previewView;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC23040h0<PreviewView.StreamState> streamStateObserver;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @k
    private final G.c resolutionSelector;

    /* compiled from: CameraX.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "", "(Ljava/lang/String;I)V", "VIDEO", "PHOTO", "ANALYZER", "PHOTO_AND_ANALYZER", "SEAMLESS_DOC_CAPTURE", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Mode {
        VIDEO,
        PHOTO,
        ANALYZER,
        PHOTO_AND_ANALYZER,
        SEAMLESS_DOC_CAPTURE
    }

    /* compiled from: CameraX.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f433923a;

        static {
            int[] iArr = new int[Mode.values().length];
            iArr[Mode.PHOTO.ordinal()] = 1;
            iArr[Mode.VIDEO.ordinal()] = 2;
            iArr[Mode.ANALYZER.ordinal()] = 3;
            iArr[Mode.PHOTO_AND_ANALYZER.ordinal()] = 4;
            iArr[Mode.SEAMLESS_DOC_CAPTURE.ordinal()] = 5;
            f433923a = iArr;
        }
    }

    /* compiled from: CameraX.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.camera.CameraX$buildImageAnalysisUseCase$1$1$1", f = "CameraX.kt", i = {}, l = {325}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433924a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC20120j0 f433926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC20120j0 interfaceC20120j0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f433926c = interfaceC20120j0;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CameraX.this.new c(this.f433926c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433924a;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = CameraX.this.listener;
                if (aVar != null) {
                    InterfaceC20120j0 interfaceC20120j0 = this.f433926c;
                    ru.cyberity.cbr.core.domain.camera.b bVarF = CameraX.this.f();
                    this.f433924a = 1;
                    if (aVar.a(interfaceC20120j0, bVarF, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CameraX.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ru/cyberity/cbr/core/domain/camera/CameraX$d", "Landroidx/camera/core/e0$k;", "Landroidx/camera/core/ImageCaptureException;", "exc", "Lkotlin/G0;", "onError", "(Landroidx/camera/core/ImageCaptureException;)V", "Landroidx/camera/core/e0$m;", "output", "onImageSaved", "(Landroidx/camera/core/e0$m;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements C20056e0.k {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f433928b;

        public d(File file) {
            this.f433928b = file;
        }

        @Override // androidx.camera.core.C20056e0.k
        public void onError(@k ImageCaptureException exc) {
            ru.cyberity.log.a.f436064a.e("CameraX", "Photo capture failed: " + exc.getMessage(), exc);
        }

        @Override // androidx.camera.core.C20056e0.k
        public void onImageSaved(@k C20056e0.m output) {
            a aVar = CameraX.this.listener;
            if (aVar != null) {
                aVar.a(this.f433928b);
            }
        }
    }

    public CameraX(@k Mode mode, @k Size size, @k C20144v c20144v, @l a aVar) {
        this.mode = mode;
        this.frameSize = size;
        this.cameraSelector = c20144v;
        this.listener = aVar;
        this.streamStateObserver = new e(this, 16);
        c.b bVar = new c.b();
        bVar.f6128b = new G.d(size);
        bVar.f6127a = new G.a(1);
        this.resolutionSelector = bVar.a();
    }

    @k
    public final ru.cyberity.cbr.core.domain.camera.b f() {
        InterfaceC20142t cameraInfo;
        K kQ2;
        InterfaceC20142t cameraInfo2;
        K kQ3;
        InterfaceC20142t cameraInfo3;
        K kQ4;
        InterfaceC20127n interfaceC20127n = this.camera;
        if (interfaceC20127n == null || (cameraInfo = interfaceC20127n.getCameraInfo()) == null || (kQ2 = cameraInfo.q()) == null || !kQ2.a()) {
            return new ru.cyberity.cbr.core.domain.camera.b(0.0f, 0.0f, 0.0f, 7, null);
        }
        InterfaceC20127n interfaceC20127n2 = this.camera;
        Integer numValueOf = null;
        Range<Integer> rangeD = (interfaceC20127n2 == null || (cameraInfo3 = interfaceC20127n2.getCameraInfo()) == null || (kQ4 = cameraInfo3.q()) == null) ? null : kQ4.d();
        Integer num = rangeD != null ? (Integer) rangeD.getLower() : null;
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = rangeD != null ? (Integer) rangeD.getUpper() : null;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        InterfaceC20127n interfaceC20127n3 = this.camera;
        if (interfaceC20127n3 != null && (cameraInfo2 = interfaceC20127n3.getCameraInfo()) != null && (kQ3 = cameraInfo2.q()) != null) {
            numValueOf = Integer.valueOf(kQ3.b());
        }
        return new ru.cyberity.cbr.core.domain.camera.b(a(numValueOf != null ? numValueOf.intValue() : 0), a(iIntValue), a(iIntValue2));
    }

    public final void g() {
        AbstractC22991Y<PreviewView.StreamState> previewStreamState;
        Logger.i$default(ru.cyberity.log.a.f436064a, "CameraX", "On destroy", null, 4, null);
        this.previewStreamState = null;
        androidx.camera.core.T t12 = this.imageAnalysisUseCase;
        if (t12 != null) {
            t12.E();
        }
        ExecutorService executorService = this.cameraExecutor;
        if (executorService != null) {
            executorService.shutdown();
        }
        h();
        i iVar = this.cameraProvider;
        if (iVar != null) {
            iVar.e();
        }
        this.cameraProvider = null;
        v0 v0Var = this.preview;
        if (v0Var != null) {
            v0Var.G(null);
        }
        this.preview = null;
        PreviewView previewView = this.previewView;
        if (previewView != null && (previewStreamState = previewView.getPreviewStreamState()) != null) {
            previewStreamState.removeObserver(this.streamStateObserver);
        }
        this.previewView = null;
        this.camera = null;
        T t13 = this.coroutineScope;
        if (t13 != null) {
            kotlinx.coroutines.U.b(t13, null);
        }
    }

    public final void h() {
        a aVar;
        if (this.videoRecording == null) {
            return;
        }
        Logger.i$default(ru.cyberity.log.a.f436064a, "CameraX", "Stop video recording", null, 4, null);
        U u12 = this.videoRecording;
        if (u12 != null) {
            u12.close();
        }
        U u13 = this.videoRecording;
        if (u13 != null) {
            u13.close();
        }
        this.videoRecording = null;
        File file = this.outputVideoFile;
        if (file != null && (aVar = this.listener) != null) {
            aVar.b(file);
        }
        this.outputVideoFile = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CameraX cameraX, PreviewView.StreamState streamState) {
        a aVar;
        Logger.i$default(ru.cyberity.log.a.f436064a, "CameraX", "Stream state changed: " + streamState, null, 4, null);
        if (cameraX.previewStreamState != streamState) {
            if (streamState == PreviewView.StreamState.f25405c && (aVar = cameraX.listener) != null) {
                aVar.a();
            }
            cameraX.previewStreamState = streamState;
        }
    }

    private final void b() {
        C20056e0.b bVar = new C20056e0.b();
        G.c cVar = this.resolutionSelector;
        bVar.f23736a.K(InterfaceC20088d0.f24101o, cVar);
        this.imageCaptureUseCase = bVar.e();
    }

    private final O0 c() {
        O0.a aVar = new O0.a();
        int i12 = b.f433923a[this.mode.ordinal()];
        if (i12 == 1) {
            b();
        } else if (i12 == 2) {
            d();
        } else if (i12 == 3) {
            a();
        } else if (i12 == 4) {
            b();
            a();
        } else if (i12 == 5) {
            d();
            a();
        }
        C20056e0 c20056e0 = this.imageCaptureUseCase;
        if (c20056e0 != null) {
            aVar.a(c20056e0);
        }
        b0<O> b0Var = this.videoCaptureUseCase;
        if (b0Var != null) {
            aVar.a(b0Var);
        }
        androidx.camera.core.T t12 = this.imageAnalysisUseCase;
        if (t12 != null) {
            aVar.a(t12);
        }
        v0.a aVar2 = new v0.a();
        aVar2.f24574a.K(InterfaceC20088d0.f24101o, this.resolutionSelector);
        v0 v0VarE = aVar2.e();
        PreviewView previewView = this.previewView;
        v0VarE.G(previewView != null ? previewView.getSurfaceProvider() : null);
        aVar.a(v0VarE);
        this.preview = v0VarE;
        return aVar.b();
    }

    private final void d() {
        A a12 = A.f24681b;
        C20181s c20181sA = C20181s.a(A.f24680a);
        z.f(a12, "quality cannot be null");
        z.a("Invalid quality: " + a12, A.f24687h.contains(a12));
        D d12 = new D(Collections.singletonList(a12), c20181sA);
        O.h hVar = new O.h();
        hVar.a(d12);
        O o12 = new O(hVar.f24799a.a(), hVar.f24800b, hVar.f24801c);
        b0.c cVar = b0.f24861A;
        b0.b bVar = new b0.b(o12);
        UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.f24057e;
        Config.a<UseCaseConfigFactory.CaptureType> aVar = L0.f24006z;
        n0 n0Var = bVar.f24878a;
        n0Var.K(aVar, captureType);
        this.videoCaptureUseCase = new b0<>(new androidx.camera.video.impl.a(s0.Q(n0Var)));
    }

    private final Context e() {
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            return previewView.getContext();
        }
        return null;
    }

    public final void a(@k InterfaceC22983P lifecycleOwner, @l PreviewView previewView) {
        C43315z0 c43315z0;
        AbstractC22991Y<PreviewView.StreamState> previewStreamState;
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        Logger.i$default(aVar, "CameraX", "start", null, 4, null);
        if (previewView == null) {
            return;
        }
        PreviewView previewView2 = this.previewView;
        if (previewView == previewView2) {
            Logger.i$default(aVar, "CameraX", "start: skipping", null, 4, null);
            return;
        }
        if (previewView2 != null && (previewStreamState = previewView2.getPreviewStreamState()) != null) {
            previewStreamState.removeObserver(this.streamStateObserver);
        }
        this.previewView = previewView;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.cameraExecutor = executorServiceNewSingleThreadExecutor;
        if (executorServiceNewSingleThreadExecutor != null) {
            c43315z0 = new C43315z0(executorServiceNewSingleThreadExecutor);
            this.coroutineScope = kotlinx.coroutines.U.a(c43315z0);
        } else {
            c43315z0 = null;
        }
        this.cameraDispatcher = c43315z0;
        previewView.getPreviewStreamState().observe(lifecycleOwner, this.streamStateObserver);
        D0<i> d0C = i.c(previewView.getContext());
        ((androidx.camera.core.impl.utils.futures.d) d0C).N(new com.avito.konveyor.item_visibility_tracker.c(d0C, this, lifecycleOwner, 16), androidx.core.content.d.getMainExecutor(previewView.getContext()));
    }

    public /* synthetic */ CameraX(Mode mode, Size size, C20144v c20144v, a aVar, int i12, C42822w c42822w) {
        this(mode, (i12 & 2) != 0 ? new Size(1920, 1080) : size, (i12 & 4) != 0 ? C20144v.f24563c : c20144v, (i12 & 8) != 0 ? null : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(D0 d02, CameraX cameraX, InterfaceC22983P interfaceC22983P) {
        try {
            i iVar = (i) d02.get();
            iVar.e();
            cameraX.camera = iVar.a(interfaceC22983P, cameraX.cameraSelector, cameraX.c());
            cameraX.cameraProvider = iVar;
        } catch (Exception e12) {
            a aVar = cameraX.listener;
            if (aVar != null) {
                aVar.a(e12);
            }
            ru.cyberity.log.a.f436064a.e("CameraX", "Init camera failed", e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.l java.lang.String r7) {
        /*
            r6 = this;
            ru.cyberity.log.a r0 = ru.cyberity.log.a.f436064a
            java.lang.String r2 = "Take picture"
            r3 = 0
            java.lang.String r1 = "CameraX"
            r4 = 4
            r5 = 0
            ru.cyberity.log.logger.Logger.i$default(r0, r1, r2, r3, r4, r5)
            androidx.camera.core.e0 r0 = r6.imageCaptureUseCase
            if (r0 != 0) goto L11
            return
        L11:
            android.content.Context r1 = r6.e()
            r2 = 0
            if (r1 == 0) goto L1d
            java.io.File r1 = r1.getCacheDir()
            goto L1e
        L1d:
            r1 = r2
        L1e:
            java.lang.String r3 = ".jpg"
            if (r7 == 0) goto L36
            java.lang.StringBuilder r7 = androidx.compose.foundation.H.r(r7)
            java.util.UUID r4 = java.util.UUID.randomUUID()
            r7.append(r4)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            if (r7 != 0) goto L49
        L36:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.UUID r4 = java.util.UUID.randomUUID()
            r7.append(r4)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
        L49:
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r7)
            androidx.camera.core.e0$l r7 = new androidx.camera.core.e0$l
            r7.<init>(r3)
            android.content.Context r1 = r6.e()
            if (r1 != 0) goto L5a
            return
        L5a:
            java.util.concurrent.Executor r1 = androidx.core.content.d.getMainExecutor(r1)
            ru.cyberity.cbr.core.domain.camera.CameraX$d r4 = new ru.cyberity.cbr.core.domain.camera.CameraX$d
            r4.<init>(r3)
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            android.os.Looper r5 = android.os.Looper.myLooper()
            if (r3 == r5) goto L7a
            java.util.concurrent.ScheduledExecutorService r2 = androidx.camera.core.impl.utils.executor.c.d()
            androidx.camera.core.c0 r3 = new androidx.camera.core.c0
            r3.<init>(r0, r7, r1, r4)
            r2.execute(r3)
            goto L7d
        L7a:
            r0.L(r1, r2, r4, r7)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.domain.camera.CameraX.a(java.lang.String):void");
    }

    @SuppressLint({"MissingPermission"})
    public final void a(@l File file) {
        Context contextE;
        if (ru.cyberity.cbr.core.common.n0.f432787a.isDebug() && this.videoRecording != null) {
            throw new IllegalStateException("Check failed.");
        }
        b0<O> b0Var = this.videoCaptureUseCase;
        if (b0Var == null || (contextE = e()) == null) {
            return;
        }
        if (file == null) {
            file = new File(contextE.getCacheDir(), UUID.randomUUID().toString() + ".mp4");
        }
        Logger.i$default(ru.cyberity.log.a.f436064a, "CameraX", "Take video snapshot and save to " + file.getName(), null, 4, null);
        C20183u c20183uA = new C20183u.a(file).a();
        O o12 = (O) b0Var.J();
        o12.getClass();
        C20188z c20188z = new C20188z(contextE, o12, c20183uA);
        if (this.mode != Mode.SEAMLESS_DOC_CAPTURE) {
            if (m.a(c20188z.f25338a, "android.permission.RECORD_AUDIO") != -1) {
                z.g("The Recorder this recording is associated to doesn't support audio.", ((AbstractC20184v) O.k(c20188z.f25339b.f24726A)).b().c() != 0);
                c20188z.f25343f = true;
            } else {
                throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
            }
        }
        this.videoRecording = c20188z.a(androidx.core.content.d.getMainExecutor(contextE), new androidx.camera.core.internal.d(1, this, file));
        this.outputVideoFile = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CameraX cameraX, File file, m0 m0Var) {
        a aVar;
        boolean z12 = m0Var instanceof m0.d;
        if (z12 && (aVar = cameraX.listener) != null) {
            aVar.c(file);
        }
        if (z12 ? true : m0Var instanceof m0.b ? true : m0Var instanceof m0.c ? true : m0Var instanceof m0.a) {
            file.getName();
            m0Var.toString();
        }
    }

    public final void a(boolean enable) {
        CameraControl cameraControlA;
        Logger.i$default(ru.cyberity.log.a.f436064a, "CameraX", "Enable flash", null, 4, null);
        InterfaceC20127n interfaceC20127n = this.camera;
        if (interfaceC20127n != null && (cameraControlA = interfaceC20127n.a()) != null) {
            cameraControlA.f(enable);
        }
        C20056e0 c20056e0 = this.imageCaptureUseCase;
        if (c20056e0 == null) {
            return;
        }
        c20056e0.J(enable ? 1 : 2);
    }

    public final void a(float exposure) {
        InterfaceC20142t cameraInfo;
        K kQ2;
        Range<Integer> rangeD;
        CameraControl cameraControlA;
        InterfaceC20142t cameraInfo2;
        K kQ3;
        Rational rationalC;
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        Logger.i$default(aVar, "CameraX", androidx.media3.exoplayer.analytics.m.i(exposure, "Set exposure "), null, 4, null);
        InterfaceC20127n interfaceC20127n = this.camera;
        if (interfaceC20127n == null || (cameraInfo = interfaceC20127n.getCameraInfo()) == null || (kQ2 = cameraInfo.q()) == null || (rangeD = kQ2.d()) == null) {
            return;
        }
        InterfaceC20127n interfaceC20127n2 = this.camera;
        float fFloatValue = (interfaceC20127n2 == null || (cameraInfo2 = interfaceC20127n2.getCameraInfo()) == null || (kQ3 = cameraInfo2.q()) == null || (rationalC = kQ3.c()) == null) ? 1.0f : rationalC.floatValue();
        Integer num = (Integer) rangeD.getLower();
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) rangeD.getUpper();
        int iMax = Integer.max(Integer.min((int) (exposure / fFloatValue), num2 != null ? num2.intValue() : 0), iIntValue);
        if (rangeD.contains((Range<Integer>) Integer.valueOf(iMax))) {
            InterfaceC20127n interfaceC20127n3 = this.camera;
            if (interfaceC20127n3 == null || (cameraControlA = interfaceC20127n3.a()) == null) {
                return;
            }
            cameraControlA.i(iMax);
            return;
        }
        Logger.e$default(aVar, "CameraX", "Set exposure failed, " + exposure + " is out of range " + rangeD, null, 4, null);
    }

    private final float a(int i12) {
        InterfaceC20142t cameraInfo;
        K kQ2;
        Rational rationalC;
        InterfaceC20127n interfaceC20127n = this.camera;
        return ((interfaceC20127n == null || (cameraInfo = interfaceC20127n.getCameraInfo()) == null || (kQ2 = cameraInfo.q()) == null || (rationalC = kQ2.c()) == null) ? 0.0f : rationalC.floatValue()) * i12;
    }

    private final void a() {
        T.c cVar = new T.c();
        Config.a<Integer> aVar = Y.f24063G;
        n0 n0Var = cVar.f23659a;
        n0Var.K(aVar, 0);
        n0Var.K(InterfaceC20088d0.f24094h, 0);
        n0Var.K(Y.f24066J, 2);
        n0Var.K(InterfaceC20088d0.f24101o, this.resolutionSelector);
        Y y12 = new Y(s0.Q(n0Var));
        InterfaceC20088d0.v(y12);
        androidx.camera.core.T t12 = new androidx.camera.core.T(y12);
        this.imageAnalysisUseCase = t12;
        ExecutorService executorService = this.cameraExecutor;
        if (executorService != null) {
            t12.H(executorService, new com.my.target.ads.a(this, 23));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CameraX cameraX, InterfaceC20120j0 interfaceC20120j0) throws Throwable {
        C43259k.e(EmptyCoroutineContext.INSTANCE, cameraX.new c(interfaceC20120j0, null));
    }
}
