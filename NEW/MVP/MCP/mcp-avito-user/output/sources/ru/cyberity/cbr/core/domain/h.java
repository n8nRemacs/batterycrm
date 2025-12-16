package ru.cyberity.cbr.core.domain;

import Y41.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Size;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.domain.a;
import ru.cyberity.ml.core.d;
import ru.cyberity.ml.facedetector.models.d;

/* compiled from: TensorflowFaceDetector.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J3\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0017H\u0016¢\u0006\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/cyberity/cbr/core/domain/h;", "Lru/cyberity/cbr/core/domain/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/RectF;", "capturingBox", "Lru/cyberity/ml/facedetector/models/c;", "face", "Landroid/graphics/Bitmap;", "image", "Landroid/util/Size;", "trackSize", "Lru/cyberity/cbr/core/domain/a$a;", "a", "(Landroid/graphics/RectF;Lru/cyberity/ml/facedetector/models/c;Landroid/graphics/Bitmap;Landroid/util/Size;)Lru/cyberity/cbr/core/domain/a$a;", "Lkotlin/G0;", "start", "()V", "stop", "imageBitmap", "capturingRect", "Lkotlin/Function1;", "onResult", "(Landroid/graphics/Bitmap;Landroid/graphics/RectF;LY41/l;)V", "Landroid/content/Context;", "Lru/cyberity/ml/facedetector/a;", "b", "Lru/cyberity/ml/facedetector/a;", "detector", "", "c", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "d", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private ru.cyberity.ml.facedetector.a detector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String name = "TensorFlow";

    /* compiled from: TensorflowFaceDetector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lru/cyberity/ml/core/d$a;", "Lru/cyberity/ml/facedetector/models/e;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/cyberity/ml/core/d$a;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.TensorflowFaceDetector$processImage$detectResult$1", f = "TensorflowFaceDetector.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super d.a<ru.cyberity.ml.facedetector.models.e>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433949a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f433951c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bitmap bitmap, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f433951c = bitmap;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super d.a<ru.cyberity.ml.facedetector.models.e>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new b(this.f433951c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433949a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.ml.facedetector.a aVar = h.this.detector;
                if (aVar == null) {
                    return null;
                }
                Bitmap bitmap = this.f433951c;
                this.f433949a = 1;
                obj = aVar.a((ru.cyberity.ml.facedetector.a) bitmap, (Continuation) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return (d.a) obj;
        }
    }

    /* compiled from: TensorflowFaceDetector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.TensorflowFaceDetector$stop$1", f = "TensorflowFaceDetector.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433952a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433952a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.ml.facedetector.a aVar = h.this.detector;
                if (aVar == null) {
                    return null;
                }
                this.f433952a = 1;
                if (aVar.a((Continuation<? super G0>) this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public h(@Y61.k Context context) {
        this.context = context;
    }

    @Override // ru.cyberity.cbr.core.domain.a
    @Y61.k
    public String getName() {
        return this.name;
    }

    @Override // ru.cyberity.cbr.core.domain.a
    public void start() {
        ru.cyberity.ml.facedetector.b bVar = ru.cyberity.ml.facedetector.b.f436245a;
        ru.cyberity.ml.facedetector.b.a(bVar, "TensorflowFaceDetector", "TensorflowFaceDetector@start()", null, 4, null);
        this.detector = new ru.cyberity.ml.facedetector.a(this.context, new d.a().a(1).a(0.4f).a());
        ru.cyberity.ml.facedetector.b.a(bVar, "TensorflowFaceDetector", "TensorflowFaceDetector@start(), detector created", null, 4, null);
    }

    @Override // ru.cyberity.cbr.core.domain.a
    public void stop() throws Throwable {
        ru.cyberity.ml.facedetector.b bVar = ru.cyberity.ml.facedetector.b.f436245a;
        ru.cyberity.ml.facedetector.b.a(bVar, "TensorflowFaceDetector", "TensorflowFaceDetector@stop()", null, 4, null);
        C43259k.e(EmptyCoroutineContext.INSTANCE, new c(null));
        this.detector = null;
        ru.cyberity.ml.facedetector.b.a(bVar, "TensorflowFaceDetector", "TensorflowFaceDetector@stop(), detector destroyed", null, 4, null);
    }

    @Override // ru.cyberity.cbr.core.domain.a
    public void a(@Y61.k Bitmap imageBitmap, @Y61.k RectF capturingRect, @Y61.k Y41.l<? super a.AbstractC12480a, G0> onResult) {
        a.AbstractC12480a cVar;
        ru.cyberity.ml.facedetector.models.e eVar;
        List<ru.cyberity.ml.facedetector.models.c> listB;
        ru.cyberity.ml.facedetector.models.c cVar2;
        ru.cyberity.ml.facedetector.models.e eVar2;
        List<ru.cyberity.ml.facedetector.models.c> listB2;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            d.a aVar = (d.a) C43259k.e(EmptyCoroutineContext.INSTANCE, new b(imageBitmap, null));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            int size = 0;
            if (aVar instanceof d.a.c) {
                int size2 = ((ru.cyberity.ml.facedetector.models.e) ((d.a.c) aVar).c()).b().size();
                cVar = size2 != 0 ? size2 != 1 ? new a.AbstractC12480a.e(imageBitmap) : a(capturingRect, ((ru.cyberity.ml.facedetector.models.e) ((d.a.c) aVar).c()).b().get(0), imageBitmap, new Size(imageBitmap.getWidth(), imageBitmap.getHeight())) : new a.AbstractC12480a.c(imageBitmap);
            } else if (aVar instanceof d.a.C12570a) {
                ru.cyberity.ml.facedetector.b.f436245a.a("TensorflowFaceDetector", "TensorflowFaceDetector@processImage(), result error", ((d.a.C12570a) aVar).getThrowable());
                cVar = new a.AbstractC12480a.C12481a(imageBitmap, ((d.a.C12570a) aVar).getThrowable());
            } else {
                cVar = (!(aVar instanceof d.a.b) && (aVar instanceof d.a.C12571d)) ? new a.AbstractC12480a.c(imageBitmap) : new a.AbstractC12480a.c(imageBitmap);
            }
            d.a.c cVar3 = aVar instanceof d.a.c ? (d.a.c) aVar : null;
            if (cVar3 != null && (eVar2 = (ru.cyberity.ml.facedetector.models.e) cVar3.c()) != null && (listB2 = eVar2.b()) != null) {
                size = listB2.size();
            }
            d.a.c cVar4 = aVar instanceof d.a.c ? (d.a.c) aVar : null;
            float score = (cVar4 == null || (eVar = (ru.cyberity.ml.facedetector.models.e) cVar4.c()) == null || (listB = eVar.b()) == null || (cVar2 = (ru.cyberity.ml.facedetector.models.c) C42745f0.G(listB)) == null) ? 0.0f : cVar2.getScore();
            ru.cyberity.ml.facedetector.b.a(ru.cyberity.ml.facedetector.b.f436245a, "TensorflowFaceDetector", "processImage(), frame=" + imageBitmap.getWidth() + 'x' + imageBitmap.getHeight() + ", time=" + jElapsedRealtime2 + " ms, faces=" + size + ", faceScore=" + score + ", result=" + s.a(cVar), null, 4, null);
            onResult.invoke(cVar);
        } catch (Exception e12) {
            ru.cyberity.ml.facedetector.b.f436245a.a("TensorflowFaceDetector", "TensorflowFaceDetector@processImage(), error", e12);
            onResult.invoke(new a.AbstractC12480a.C12481a(imageBitmap, e12));
        }
    }

    private final a.AbstractC12480a a(RectF capturingBox, ru.cyberity.ml.facedetector.models.c face, Bitmap image, Size trackSize) {
        if (face.getScore() < 0.3f) {
            return new a.AbstractC12480a.c(image);
        }
        if (capturingBox.contains(face.getRelativeCoordinate())) {
            return new a.AbstractC12480a.b(image, trackSize, face.getRelativeCoordinate());
        }
        return new a.AbstractC12480a.d(image, face.getRelativeCoordinate());
    }
}
